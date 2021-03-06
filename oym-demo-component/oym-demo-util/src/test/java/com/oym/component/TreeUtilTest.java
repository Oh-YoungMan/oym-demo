package com.oym.component;

import com.alibaba.fastjson.JSON;
import com.oym.component.util.model.TreeModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangyd
 * @date 2019/11/11 14:04
 * @desc
 */
public class TreeUtilTest {
    @Test
    public void test() {
        List<TestClass> testClassList = new ArrayList<>();
        testClassList.add(new TestClass(1L, 0L, "福建", "啊啊啊"));
        testClassList.add(new TestClass(2L, 0L, "浙江", "啊啊啊2"));
        testClassList.add(new TestClass(3L, 0L, "广东", "啊啊啊3"));
        testClassList.add(new TestClass(4L, 1L, "厦门", "啊啊啊3"));
        testClassList.add(new TestClass(5L, 1L, "泉州", "啊啊啊3"));
        testClassList.add(new TestClass(6L, 5L, "鲤城", "啊啊啊3"));
        testClassList.add(new TestClass(7L, 5L, "惠安", "啊啊啊3"));
        testClassList.add(new TestClass(8L, 3L, "广洲", "啊啊啊3"));
        testClassList.add(new TestClass(9L, 3L, "深圳", "啊啊啊3"));
        testClassList.add(new TestClass(10L, 3L, "珠海", "啊啊啊3"));
        List<TestTree> list = TreeUtil.buildListTree2(0L, testClassList, TestClass::getPid, (x, y) -> {
            TestTree testTree = new TestTree();
            testTree.setSign(x.getId());
            testTree.setPSign(x.getPid());
            if (y != null) {
                testTree.setPName(y.getName());
            }
            testTree.setContext(x.getRemark());
            testTree.setName(x.getName());
            return testTree;
        });
        System.out.println(JSON.toJSONString(list));
    }

    @Data
    @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    public static class TestTree extends TreeModel<Long, TestTree> {
        private String name;
        private String pName;
        private String context;
    }

    @Data
    @Accessors(chain = true)
    @ToString
    public static class TestClass {
        private Long id;
        private Long pid;
        private String name;
        private String remark;

        private TestClass(Long id, Long pid, String name, String remark) {
            this.id = id;
            this.pid = pid;
            this.name = name;
            this.remark = remark;
        }
    }
}
