// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ContextRuleResponse {
    /**
     * @return A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
     * 
     */
    private List<String> allowedRequestExtensions;
    /**
     * @return A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
     * 
     */
    private List<String> allowedResponseExtensions;
    /**
     * @return A list of full type names of provided contexts.
     * 
     */
    private List<String> provided;
    /**
     * @return A list of full type names of requested contexts.
     * 
     */
    private List<String> requested;
    /**
     * @return Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    private String selector;

    private ContextRuleResponse() {}
    /**
     * @return A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
     * 
     */
    public List<String> allowedRequestExtensions() {
        return this.allowedRequestExtensions;
    }
    /**
     * @return A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
     * 
     */
    public List<String> allowedResponseExtensions() {
        return this.allowedResponseExtensions;
    }
    /**
     * @return A list of full type names of provided contexts.
     * 
     */
    public List<String> provided() {
        return this.provided;
    }
    /**
     * @return A list of full type names of requested contexts.
     * 
     */
    public List<String> requested() {
        return this.requested;
    }
    /**
     * @return Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    public String selector() {
        return this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContextRuleResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> allowedRequestExtensions;
        private List<String> allowedResponseExtensions;
        private List<String> provided;
        private List<String> requested;
        private String selector;
        public Builder() {}
        public Builder(ContextRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRequestExtensions = defaults.allowedRequestExtensions;
    	      this.allowedResponseExtensions = defaults.allowedResponseExtensions;
    	      this.provided = defaults.provided;
    	      this.requested = defaults.requested;
    	      this.selector = defaults.selector;
        }

        @CustomType.Setter
        public Builder allowedRequestExtensions(List<String> allowedRequestExtensions) {
            this.allowedRequestExtensions = Objects.requireNonNull(allowedRequestExtensions);
            return this;
        }
        public Builder allowedRequestExtensions(String... allowedRequestExtensions) {
            return allowedRequestExtensions(List.of(allowedRequestExtensions));
        }
        @CustomType.Setter
        public Builder allowedResponseExtensions(List<String> allowedResponseExtensions) {
            this.allowedResponseExtensions = Objects.requireNonNull(allowedResponseExtensions);
            return this;
        }
        public Builder allowedResponseExtensions(String... allowedResponseExtensions) {
            return allowedResponseExtensions(List.of(allowedResponseExtensions));
        }
        @CustomType.Setter
        public Builder provided(List<String> provided) {
            this.provided = Objects.requireNonNull(provided);
            return this;
        }
        public Builder provided(String... provided) {
            return provided(List.of(provided));
        }
        @CustomType.Setter
        public Builder requested(List<String> requested) {
            this.requested = Objects.requireNonNull(requested);
            return this;
        }
        public Builder requested(String... requested) {
            return requested(List.of(requested));
        }
        @CustomType.Setter
        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }
        public ContextRuleResponse build() {
            final var o = new ContextRuleResponse();
            o.allowedRequestExtensions = allowedRequestExtensions;
            o.allowedResponseExtensions = allowedResponseExtensions;
            o.provided = provided;
            o.requested = requested;
            o.selector = selector;
            return o;
        }
    }
}