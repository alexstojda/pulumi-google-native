// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare.v1beta1.inputs;




/**
 * Define how to redact sensitive values. Default behaviour is erase. For example, &#34;My name is Jane.&#34; becomes &#34;My name is .&#34;
 * 
 */
public final class RedactConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RedactConfigArgs Empty = new RedactConfigArgs();

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private RedactConfigArgs $;

        public Builder() {
            $ = new RedactConfigArgs();
        }
        public RedactConfigArgs build() {
            return $;
        }
    }

}