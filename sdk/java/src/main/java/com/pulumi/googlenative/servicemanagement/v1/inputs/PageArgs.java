// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents a documentation page. A page can contain subpages to represent nested documentation set structure.
 * 
 */
public final class PageArgs extends com.pulumi.resources.ResourceArgs {

    public static final PageArgs Empty = new PageArgs();

    /**
     * The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
     * 
     */
    @Import(name="content")
    private @Nullable Output<String> content;

    /**
     * @return The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
     * 
     */
    public Optional<Output<String>> content() {
        return Optional.ofNullable(this.content);
    }

    /**
     * The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Subpages of this page. The order of subpages specified here will be honored in the generated docset.
     * 
     */
    @Import(name="subpages")
    private @Nullable Output<List<PageArgs>> subpages;

    /**
     * @return Subpages of this page. The order of subpages specified here will be honored in the generated docset.
     * 
     */
    public Optional<Output<List<PageArgs>>> subpages() {
        return Optional.ofNullable(this.subpages);
    }

    private PageArgs() {}

    private PageArgs(PageArgs $) {
        this.content = $.content;
        this.name = $.name;
        this.subpages = $.subpages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PageArgs $;

        public Builder() {
            $ = new PageArgs();
        }

        public Builder(PageArgs defaults) {
            $ = new PageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param content The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
         * 
         * @return builder
         * 
         */
        public Builder content(@Nullable Output<String> content) {
            $.content = content;
            return this;
        }

        /**
         * @param content The Markdown content of the page. You can use (== include {path} ==) to include content from a Markdown file. The content can be used to produce the documentation page such as HTML format page.
         * 
         * @return builder
         * 
         */
        public Builder content(String content) {
            return content(Output.of(content));
        }

        /**
         * @param name The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the page. It will be used as an identity of the page to generate URI of the page, text of the link to this page in navigation, etc. The full page name (start from the root page name to this page concatenated with `.`) can be used as reference to the page in your documentation. For example: pages: - name: Tutorial content: (== include tutorial.md ==) subpages: - name: Java content: (== include tutorial_java.md ==) You can reference `Java` page using Markdown reference link syntax: `Java`.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param subpages Subpages of this page. The order of subpages specified here will be honored in the generated docset.
         * 
         * @return builder
         * 
         */
        public Builder subpages(@Nullable Output<List<PageArgs>> subpages) {
            $.subpages = subpages;
            return this;
        }

        /**
         * @param subpages Subpages of this page. The order of subpages specified here will be honored in the generated docset.
         * 
         * @return builder
         * 
         */
        public Builder subpages(List<PageArgs> subpages) {
            return subpages(Output.of(subpages));
        }

        /**
         * @param subpages Subpages of this page. The order of subpages specified here will be honored in the generated docset.
         * 
         * @return builder
         * 
         */
        public Builder subpages(PageArgs... subpages) {
            return subpages(List.of(subpages));
        }

        public PageArgs build() {
            return $;
        }
    }

}