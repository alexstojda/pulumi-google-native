// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networkservices.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The specification for modifying HTTP header in HTTP request and HTTP response.
 * 
 */
public final class HttpRouteHeaderModifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpRouteHeaderModifierArgs Empty = new HttpRouteHeaderModifierArgs();

    /**
     * Add the headers with given map where key is the name of the header, value is the value of the header.
     * 
     */
    @Import(name="add")
    private @Nullable Output<Map<String,String>> add;

    /**
     * @return Add the headers with given map where key is the name of the header, value is the value of the header.
     * 
     */
    public Optional<Output<Map<String,String>>> add() {
        return Optional.ofNullable(this.add);
    }

    /**
     * Remove headers (matching by header names) specified in the list.
     * 
     */
    @Import(name="remove")
    private @Nullable Output<List<String>> remove;

    /**
     * @return Remove headers (matching by header names) specified in the list.
     * 
     */
    public Optional<Output<List<String>>> remove() {
        return Optional.ofNullable(this.remove);
    }

    /**
     * Completely overwrite/replace the headers with given map where key is the name of the header, value is the value of the header.
     * 
     */
    @Import(name="set")
    private @Nullable Output<Map<String,String>> set;

    /**
     * @return Completely overwrite/replace the headers with given map where key is the name of the header, value is the value of the header.
     * 
     */
    public Optional<Output<Map<String,String>>> set() {
        return Optional.ofNullable(this.set);
    }

    private HttpRouteHeaderModifierArgs() {}

    private HttpRouteHeaderModifierArgs(HttpRouteHeaderModifierArgs $) {
        this.add = $.add;
        this.remove = $.remove;
        this.set = $.set;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpRouteHeaderModifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpRouteHeaderModifierArgs $;

        public Builder() {
            $ = new HttpRouteHeaderModifierArgs();
        }

        public Builder(HttpRouteHeaderModifierArgs defaults) {
            $ = new HttpRouteHeaderModifierArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param add Add the headers with given map where key is the name of the header, value is the value of the header.
         * 
         * @return builder
         * 
         */
        public Builder add(@Nullable Output<Map<String,String>> add) {
            $.add = add;
            return this;
        }

        /**
         * @param add Add the headers with given map where key is the name of the header, value is the value of the header.
         * 
         * @return builder
         * 
         */
        public Builder add(Map<String,String> add) {
            return add(Output.of(add));
        }

        /**
         * @param remove Remove headers (matching by header names) specified in the list.
         * 
         * @return builder
         * 
         */
        public Builder remove(@Nullable Output<List<String>> remove) {
            $.remove = remove;
            return this;
        }

        /**
         * @param remove Remove headers (matching by header names) specified in the list.
         * 
         * @return builder
         * 
         */
        public Builder remove(List<String> remove) {
            return remove(Output.of(remove));
        }

        /**
         * @param remove Remove headers (matching by header names) specified in the list.
         * 
         * @return builder
         * 
         */
        public Builder remove(String... remove) {
            return remove(List.of(remove));
        }

        /**
         * @param set Completely overwrite/replace the headers with given map where key is the name of the header, value is the value of the header.
         * 
         * @return builder
         * 
         */
        public Builder set(@Nullable Output<Map<String,String>> set) {
            $.set = set;
            return this;
        }

        /**
         * @param set Completely overwrite/replace the headers with given map where key is the name of the header, value is the value of the header.
         * 
         * @return builder
         * 
         */
        public Builder set(Map<String,String> set) {
            return set(Output.of(set));
        }

        public HttpRouteHeaderModifierArgs build() {
            return $;
        }
    }

}