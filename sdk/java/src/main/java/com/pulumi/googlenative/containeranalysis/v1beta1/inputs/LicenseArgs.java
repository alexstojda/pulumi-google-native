// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * License information.
 * 
 */
public final class LicenseArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicenseArgs Empty = new LicenseArgs();

    /**
     * Comments
     * 
     */
    @Import(name="comments")
    private @Nullable Output<String> comments;

    /**
     * @return Comments
     * 
     */
    public Optional<Output<String>> comments() {
        return Optional.ofNullable(this.comments);
    }

    /**
     * Often a single license can be used to represent the licensing terms. Sometimes it is necessary to include a choice of one or more licenses or some combination of license identifiers. Examples: &#34;LGPL-2.1-only OR MIT&#34;, &#34;LGPL-2.1-only AND MIT&#34;, &#34;GPL-2.0-or-later WITH Bison-exception-2.2&#34;.
     * 
     */
    @Import(name="expression")
    private @Nullable Output<String> expression;

    /**
     * @return Often a single license can be used to represent the licensing terms. Sometimes it is necessary to include a choice of one or more licenses or some combination of license identifiers. Examples: &#34;LGPL-2.1-only OR MIT&#34;, &#34;LGPL-2.1-only AND MIT&#34;, &#34;GPL-2.0-or-later WITH Bison-exception-2.2&#34;.
     * 
     */
    public Optional<Output<String>> expression() {
        return Optional.ofNullable(this.expression);
    }

    private LicenseArgs() {}

    private LicenseArgs(LicenseArgs $) {
        this.comments = $.comments;
        this.expression = $.expression;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicenseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicenseArgs $;

        public Builder() {
            $ = new LicenseArgs();
        }

        public Builder(LicenseArgs defaults) {
            $ = new LicenseArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param comments Comments
         * 
         * @return builder
         * 
         */
        public Builder comments(@Nullable Output<String> comments) {
            $.comments = comments;
            return this;
        }

        /**
         * @param comments Comments
         * 
         * @return builder
         * 
         */
        public Builder comments(String comments) {
            return comments(Output.of(comments));
        }

        /**
         * @param expression Often a single license can be used to represent the licensing terms. Sometimes it is necessary to include a choice of one or more licenses or some combination of license identifiers. Examples: &#34;LGPL-2.1-only OR MIT&#34;, &#34;LGPL-2.1-only AND MIT&#34;, &#34;GPL-2.0-or-later WITH Bison-exception-2.2&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expression(@Nullable Output<String> expression) {
            $.expression = expression;
            return this;
        }

        /**
         * @param expression Often a single license can be used to represent the licensing terms. Sometimes it is necessary to include a choice of one or more licenses or some combination of license identifiers. Examples: &#34;LGPL-2.1-only OR MIT&#34;, &#34;LGPL-2.1-only AND MIT&#34;, &#34;GPL-2.0-or-later WITH Bison-exception-2.2&#34;.
         * 
         * @return builder
         * 
         */
        public Builder expression(String expression) {
            return expression(Output.of(expression));
        }

        public LicenseArgs build() {
            return $;
        }
    }

}