// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.osconfig.v1alpha.outputs.OSPolicyInventoryFilterResponse;
import com.pulumi.googlenative.osconfig.v1alpha.outputs.OSPolicyOSFilterResponse;
import com.pulumi.googlenative.osconfig.v1alpha.outputs.OSPolicyResourceResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class OSPolicyResourceGroupResponse {
    /**
     * @return List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name=&#39;rhel&#39; and inventory_filters[1].os_short_name=&#39;centos&#39; If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    private List<OSPolicyInventoryFilterResponse> inventoryFilters;
    /**
     * @return Deprecated. Use the `inventory_filters` field instead. Used to specify the OS filter for a resource group
     * 
     * @deprecated
     * Deprecated. Use the `inventory_filters` field instead. Used to specify the OS filter for a resource group
     * 
     */
    @Deprecated /* Deprecated. Use the `inventory_filters` field instead. Used to specify the OS filter for a resource group */
    private OSPolicyOSFilterResponse osFilter;
    /**
     * @return List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    private List<OSPolicyResourceResponse> resources;

    private OSPolicyResourceGroupResponse() {}
    /**
     * @return List of inventory filters for the resource group. The resources in this resource group are applied to the target VM if it satisfies at least one of the following inventory filters. For example, to apply this resource group to VMs running either `RHEL` or `CentOS` operating systems, specify 2 items for the list with following values: inventory_filters[0].os_short_name=&#39;rhel&#39; and inventory_filters[1].os_short_name=&#39;centos&#39; If the list is empty, this resource group will be applied to the target VM unconditionally.
     * 
     */
    public List<OSPolicyInventoryFilterResponse> inventoryFilters() {
        return this.inventoryFilters;
    }
    /**
     * @return Deprecated. Use the `inventory_filters` field instead. Used to specify the OS filter for a resource group
     * 
     * @deprecated
     * Deprecated. Use the `inventory_filters` field instead. Used to specify the OS filter for a resource group
     * 
     */
    @Deprecated /* Deprecated. Use the `inventory_filters` field instead. Used to specify the OS filter for a resource group */
    public OSPolicyOSFilterResponse osFilter() {
        return this.osFilter;
    }
    /**
     * @return List of resources configured for this resource group. The resources are executed in the exact order specified here.
     * 
     */
    public List<OSPolicyResourceResponse> resources() {
        return this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceGroupResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<OSPolicyInventoryFilterResponse> inventoryFilters;
        private OSPolicyOSFilterResponse osFilter;
        private List<OSPolicyResourceResponse> resources;
        public Builder() {}
        public Builder(OSPolicyResourceGroupResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryFilters = defaults.inventoryFilters;
    	      this.osFilter = defaults.osFilter;
    	      this.resources = defaults.resources;
        }

        @CustomType.Setter
        public Builder inventoryFilters(List<OSPolicyInventoryFilterResponse> inventoryFilters) {
            this.inventoryFilters = Objects.requireNonNull(inventoryFilters);
            return this;
        }
        public Builder inventoryFilters(OSPolicyInventoryFilterResponse... inventoryFilters) {
            return inventoryFilters(List.of(inventoryFilters));
        }
        @CustomType.Setter
        public Builder osFilter(OSPolicyOSFilterResponse osFilter) {
            this.osFilter = Objects.requireNonNull(osFilter);
            return this;
        }
        @CustomType.Setter
        public Builder resources(List<OSPolicyResourceResponse> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(OSPolicyResourceResponse... resources) {
            return resources(List.of(resources));
        }
        public OSPolicyResourceGroupResponse build() {
            final var o = new OSPolicyResourceGroupResponse();
            o.inventoryFilters = inventoryFilters;
            o.osFilter = osFilter;
            o.resources = resources;
            return o;
        }
    }
}