// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudidentity.v1.enums.DynamicGroupQueryResourceType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a query on a resource.
 * 
 */
public final class DynamicGroupQueryArgs extends com.pulumi.resources.ResourceArgs {

    public static final DynamicGroupQueryArgs Empty = new DynamicGroupQueryArgs();

    /**
     * Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department==&#39;engineering&#39;)` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area==&#39;foo&#39; &amp;&amp; loc.building_id==&#39;bar&#39;)` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase(&#39;jOhn DoE&#39;)`
     * 
     */
    @Import(name="query")
    private @Nullable Output<String> query;

    /**
     * @return Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department==&#39;engineering&#39;)` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area==&#39;foo&#39; &amp;&amp; loc.building_id==&#39;bar&#39;)` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase(&#39;jOhn DoE&#39;)`
     * 
     */
    public Optional<Output<String>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * Resource type for the Dynamic Group Query
     * 
     */
    @Import(name="resourceType")
    private @Nullable Output<DynamicGroupQueryResourceType> resourceType;

    /**
     * @return Resource type for the Dynamic Group Query
     * 
     */
    public Optional<Output<DynamicGroupQueryResourceType>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    private DynamicGroupQueryArgs() {}

    private DynamicGroupQueryArgs(DynamicGroupQueryArgs $) {
        this.query = $.query;
        this.resourceType = $.resourceType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DynamicGroupQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DynamicGroupQueryArgs $;

        public Builder() {
            $ = new DynamicGroupQueryArgs();
        }

        public Builder(DynamicGroupQueryArgs defaults) {
            $ = new DynamicGroupQueryArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param query Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department==&#39;engineering&#39;)` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area==&#39;foo&#39; &amp;&amp; loc.building_id==&#39;bar&#39;)` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase(&#39;jOhn DoE&#39;)`
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<String> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Query that determines the memberships of the dynamic group. Examples: All users with at least one `organizations.department` of engineering. `user.organizations.exists(org, org.department==&#39;engineering&#39;)` All users with at least one location that has `area` of `foo` and `building_id` of `bar`. `user.locations.exists(loc, loc.area==&#39;foo&#39; &amp;&amp; loc.building_id==&#39;bar&#39;)` All users with any variation of the name John Doe (case-insensitive queries add `equalsIgnoreCase()` to the value being queried). `user.name.value.equalsIgnoreCase(&#39;jOhn DoE&#39;)`
         * 
         * @return builder
         * 
         */
        public Builder query(String query) {
            return query(Output.of(query));
        }

        /**
         * @param resourceType Resource type for the Dynamic Group Query
         * 
         * @return builder
         * 
         */
        public Builder resourceType(@Nullable Output<DynamicGroupQueryResourceType> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        /**
         * @param resourceType Resource type for the Dynamic Group Query
         * 
         * @return builder
         * 
         */
        public Builder resourceType(DynamicGroupQueryResourceType resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public DynamicGroupQueryArgs build() {
            return $;
        }
    }

}