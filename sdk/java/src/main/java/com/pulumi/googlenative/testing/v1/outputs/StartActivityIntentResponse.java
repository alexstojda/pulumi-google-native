// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class StartActivityIntentResponse {
    /**
     * @return Action name. Required for START_ACTIVITY.
     * 
     */
    private String action;
    /**
     * @return Intent categories to set on the intent.
     * 
     */
    private List<String> categories;
    /**
     * @return URI for the action.
     * 
     */
    private String uri;

    private StartActivityIntentResponse() {}
    /**
     * @return Action name. Required for START_ACTIVITY.
     * 
     */
    public String action() {
        return this.action;
    }
    /**
     * @return Intent categories to set on the intent.
     * 
     */
    public List<String> categories() {
        return this.categories;
    }
    /**
     * @return URI for the action.
     * 
     */
    public String uri() {
        return this.uri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StartActivityIntentResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String action;
        private List<String> categories;
        private String uri;
        public Builder() {}
        public Builder(StartActivityIntentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.categories = defaults.categories;
    	      this.uri = defaults.uri;
        }

        @CustomType.Setter
        public Builder action(String action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        @CustomType.Setter
        public Builder categories(List<String> categories) {
            this.categories = Objects.requireNonNull(categories);
            return this;
        }
        public Builder categories(String... categories) {
            return categories(List.of(categories));
        }
        @CustomType.Setter
        public Builder uri(String uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public StartActivityIntentResponse build() {
            final var o = new StartActivityIntentResponse();
            o.action = action;
            o.categories = categories;
            o.uri = uri;
            return o;
        }
    }
}