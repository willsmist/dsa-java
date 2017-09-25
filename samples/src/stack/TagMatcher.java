package stack;

import com.csygl.dsa.stack.ArrayStack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * HTML 标记匹配
 */
public class TagMatcher {

    public static final int CAPACITY = 10000;

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.oracle.com/java/index.html");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
//        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("samples/resources/tag.html"), "UTF-8"));
        TagMatcher matcher = new TagMatcher();
        Tag[] tags = matcher.parseHTML(reader);
        System.out.println(matcher.checkTags(tags));
    }

    public boolean checkTags(Tag[] tags) {
        ArrayStack<Tag> stack = new ArrayStack<>(tags.length);
        for (int i = 0; i < tags.length && tags[i] != null; i++) {
            if (tags[i].opening) {
                stack.push(tags[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (!(stack.pop().getName()).equals(tags[i].getName())) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public Tag[] parseHTML(BufferedReader reader) throws IOException {
        Tag[] tags = new Tag[CAPACITY];

        // 标签计数，作为数组 tags 下标
        int count = 0;

        // 跳过 JavaScript 代码
        boolean script = false;

        // 标识起始标签
        boolean inTag = false;

        String line;
        while ((line = reader.readLine()) != null) {
            if (line.trim().startsWith("<script")) {
                if (!line.trim().endsWith("</script>")) {
                    script = true;
                }
            } else if (line.trim().equals("</script>")) {
                script = false;
            } else if (!script) {
                StringTokenizer tokenizer = new StringTokenizer(line, "<> \t", true);
                while (tokenizer.hasMoreTokens()) {
                    String token = tokenizer.nextToken();
                    if (token.equals("<")) {
                        inTag = true;
                    } else if (token.charAt(0) == '!' || excludeTags().contains(token)) {
                        inTag = false;
                    } else if (inTag) {
                        if (token.charAt(0) != '/') {
                            //起始标记
                            tags[count] = new Tag(token, true);
                            count++;
                        } else {
                            //结束标记
                            tags[count] = new Tag(token.substring(1), false);
                            count++;
                        }
                        inTag = false;//标记处理完毕重置,避免下一个 token 因为 inTag 值为 ture 而被当作标签处理
                    }//if
                }//while
            }//if
        }//while
        return tags;
    }

    //生成单标签或可以有单标签形式的标签组成的列表,这些标签不会被检查
    public List<String> excludeTags() {
        ArrayList<String> tags = new ArrayList<>();
        tags.add("!DOCTYPE");
        tags.add("meta");
        tags.add("link");
        tags.add("br");
        tags.add("hr");
        tags.add("img");
        tags.add("input");
        tags.add("a");
        tags.add("/a");
        tags.add("param");
        return tags;
    }

    /**
     * HTML 标记类
     * 用于封装 HTML 标记
     */
    public static class Tag {

        //标记名称
        private final String name;

        //起始标记
        private final boolean opening;


        public Tag() {
            name = "";
            opening = false;
        }

        public Tag(String name, boolean opening) {
            this.name = name;
            this.opening = opening;
        }

        public String getName() {
            return name;
        }

        public boolean isOpening() {
            return opening;
        }

        //测试用
        public String toString() {
            return name;
        }
    }
}
