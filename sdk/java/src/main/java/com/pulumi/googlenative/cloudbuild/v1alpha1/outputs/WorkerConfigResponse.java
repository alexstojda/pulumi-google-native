// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild.v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.cloudbuild.v1alpha1.outputs.NetworkResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WorkerConfigResponse {
    /**
     * @return Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud Build will use a standard disk size. `disk_size` is overridden if you specify a different disk size in `build_options`. In this case, a VM with a disk size specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
     * 
     */
    private String diskSizeGb;
    /**
     * @return Machine Type of the worker, such as n1-standard-1. See https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud Build will use a standard unspecified machine to create the worker pool. `machine_type` is overridden if you specify a different machine type in `build_options`. In this case, the VM specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
     * 
     */
    private String machineType;
    /**
     * @return The network definition used to create the worker. If this section is left empty, the workers will be created in WorkerPool.project_id on the default network.
     * 
     */
    private NetworkResponse network;
    /**
     * @return The tag applied to the worker, and the same tag used by the firewall rule. It is used to identify the Cloud Build workers among other VMs. The default value for tag is `worker`.
     * 
     */
    private String tag;

    private WorkerConfigResponse() {}
    /**
     * @return Size of the disk attached to the worker, in GB. See https://cloud.google.com/compute/docs/disks/ If `0` is specified, Cloud Build will use a standard disk size. `disk_size` is overridden if you specify a different disk size in `build_options`. In this case, a VM with a disk size specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/api/reference/rest/v1/projects.builds#buildoptions
     * 
     */
    public String diskSizeGb() {
        return this.diskSizeGb;
    }
    /**
     * @return Machine Type of the worker, such as n1-standard-1. See https://cloud.google.com/compute/docs/machine-types. If left blank, Cloud Build will use a standard unspecified machine to create the worker pool. `machine_type` is overridden if you specify a different machine type in `build_options`. In this case, the VM specified in the `build_options` will be created on demand at build time. For more information see https://cloud.google.com/cloud-build/docs/speeding-up-builds#using_custom_virtual_machine_sizes
     * 
     */
    public String machineType() {
        return this.machineType;
    }
    /**
     * @return The network definition used to create the worker. If this section is left empty, the workers will be created in WorkerPool.project_id on the default network.
     * 
     */
    public NetworkResponse network() {
        return this.network;
    }
    /**
     * @return The tag applied to the worker, and the same tag used by the firewall rule. It is used to identify the Cloud Build workers among other VMs. The default value for tag is `worker`.
     * 
     */
    public String tag() {
        return this.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkerConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String diskSizeGb;
        private String machineType;
        private NetworkResponse network;
        private String tag;
        public Builder() {}
        public Builder(WorkerConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diskSizeGb = defaults.diskSizeGb;
    	      this.machineType = defaults.machineType;
    	      this.network = defaults.network;
    	      this.tag = defaults.tag;
        }

        @CustomType.Setter
        public Builder diskSizeGb(String diskSizeGb) {
            this.diskSizeGb = Objects.requireNonNull(diskSizeGb);
            return this;
        }
        @CustomType.Setter
        public Builder machineType(String machineType) {
            this.machineType = Objects.requireNonNull(machineType);
            return this;
        }
        @CustomType.Setter
        public Builder network(NetworkResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        @CustomType.Setter
        public Builder tag(String tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }
        public WorkerConfigResponse build() {
            final var o = new WorkerConfigResponse();
            o.diskSizeGb = diskSizeGb;
            o.machineType = machineType;
            o.network = network;
            o.tag = tag;
            return o;
        }
    }
}