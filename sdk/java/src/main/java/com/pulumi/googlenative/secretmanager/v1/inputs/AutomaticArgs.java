// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.secretmanager.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.secretmanager.v1.inputs.CustomerManagedEncryptionArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A replication policy that replicates the Secret payload without any restrictions.
 * 
 */
public final class AutomaticArgs extends com.pulumi.resources.ResourceArgs {

    public static final AutomaticArgs Empty = new AutomaticArgs();

    /**
     * Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
     * 
     */
    @Import(name="customerManagedEncryption")
    private @Nullable Output<CustomerManagedEncryptionArgs> customerManagedEncryption;

    /**
     * @return Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
     * 
     */
    public Optional<Output<CustomerManagedEncryptionArgs>> customerManagedEncryption() {
        return Optional.ofNullable(this.customerManagedEncryption);
    }

    private AutomaticArgs() {}

    private AutomaticArgs(AutomaticArgs $) {
        this.customerManagedEncryption = $.customerManagedEncryption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AutomaticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AutomaticArgs $;

        public Builder() {
            $ = new AutomaticArgs();
        }

        public Builder(AutomaticArgs defaults) {
            $ = new AutomaticArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customerManagedEncryption Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedEncryption(@Nullable Output<CustomerManagedEncryptionArgs> customerManagedEncryption) {
            $.customerManagedEncryption = customerManagedEncryption;
            return this;
        }

        /**
         * @param customerManagedEncryption Optional. The customer-managed encryption configuration of the Secret. If no configuration is provided, Google-managed default encryption is used. Updates to the Secret encryption configuration only apply to SecretVersions added afterwards. They do not apply retroactively to existing SecretVersions.
         * 
         * @return builder
         * 
         */
        public Builder customerManagedEncryption(CustomerManagedEncryptionArgs customerManagedEncryption) {
            return customerManagedEncryption(Output.of(customerManagedEncryption));
        }

        public AutomaticArgs build() {
            return $;
        }
    }

}