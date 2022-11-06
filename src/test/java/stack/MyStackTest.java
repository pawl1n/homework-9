package stack;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MyStackTest {

    @Test
    void shouldPeek() {
        // given
        MyStack<String> stack = new MyStack<>();

        // when
        stack.push("first string");

        // then
        assertThat(stack.peek()).isEqualToIgnoringCase("first string");
    }

    @Test
    void shouldNotPeek() {
        // given
        MyStack<String> stack;

        // when
        stack = new MyStack<>();

        // then
        assertThatThrownBy(stack::peek).hasMessage("Stack is empty");
    }

    @Test
    void shouldPop() {
        // given
        MyStack<String> stack = new MyStack<>();

        // when
        stack.push("first string");

        // then
        assertThat(stack.pop()).isEqualToIgnoringCase("first string");
    }

    @Test
    void shouldNotPop() {
        // given
        MyStack<String> stack = new MyStack<>();
        stack.push("first string");

        // when
        stack.pop();

        // then
        assertThatThrownBy(stack::pop).hasMessage("Stack is empty");
    }

    @Test
    void shouldPush() {
        // given
        MyStack<String> stack;

        // when
        stack = new MyStack<>();

        // then
        assertThatCode(() -> stack.push("first string")).doesNotThrowAnyException();
    }

    @Test
    void shouldNotPush() {
        // given
        MyStack<String> stack;

        // when
        stack = new MyStack<>();
        stack.push("test1");
        stack.push("test2");
        stack.push("test3");
        stack.push("test4");
        stack.push("test5");
        stack.push("test6");
        stack.push("test7");
        stack.push("test8");
        stack.push("test9");
        stack.push("test10");

        // then
        assertThatThrownBy(() -> stack.push("error")).hasMessage("Stack is full");
    }

    @Test
    void shouldBeEmpty() {
        // given
        MyStack<String> stack;

        // when
        stack = new MyStack<>();

        // then
        assertThat(stack.isEmpty()).isTrue();
    }

    @Test
    void shouldNotBeEmpty() {
        // given
        MyStack<String> stack = new MyStack<>();

        // when
        stack.push("test");

        // then
        assertThat(stack.isEmpty()).isFalse();
    }

    @Test
    void shouldBeFull() {
        // given
        MyStack<String> stack = new MyStack<>();

        // when
        stack.push("test");

        // then
        assertThat(stack.isFull()).isFalse();
    }

    @Test
    void testToString() {
        // given
        MyStack<String> stack = new MyStack<>();

        // when
        stack.push("test1");
        stack.push("test2");
        stack.push("test3");
        stack.push("test4");
        stack.push("test5");
        stack.push("test6");
        stack.push("test7");
        stack.push("test8");
        stack.push("test9");
        stack.push("test10");

        // then
        assertThat(stack.isFull()).isTrue();
    }
}