// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storagetransfer.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.storagetransfer.v1.enums.LoggingConfigLogActionStatesItem;
import com.pulumi.googlenative.storagetransfer.v1.enums.LoggingConfigLogActionsItem;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the logging behavior for transfer operations. For cloud-to-cloud transfers, logs are sent to Cloud Logging. See [Read transfer logs](https://cloud.google.com/storage-transfer/docs/read-transfer-logs) for details. For transfers to or from a POSIX file system, logs are stored in the Cloud Storage bucket that is the source or sink of the transfer. See [Managing Transfer for on-premises jobs] (https://cloud.google.com/storage-transfer/docs/managing-on-prem-jobs#viewing-logs) for details.
 * 
 */
public final class LoggingConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LoggingConfigArgs Empty = new LoggingConfigArgs();

    /**
     * For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
     * 
     */
    @Import(name="enableOnpremGcsTransferLogs")
    private @Nullable Output<Boolean> enableOnpremGcsTransferLogs;

    /**
     * @return For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
     * 
     */
    public Optional<Output<Boolean>> enableOnpremGcsTransferLogs() {
        return Optional.ofNullable(this.enableOnpremGcsTransferLogs);
    }

    /**
     * States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    @Import(name="logActionStates")
    private @Nullable Output<List<LoggingConfigLogActionStatesItem>> logActionStates;

    /**
     * @return States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    public Optional<Output<List<LoggingConfigLogActionStatesItem>>> logActionStates() {
        return Optional.ofNullable(this.logActionStates);
    }

    /**
     * Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    @Import(name="logActions")
    private @Nullable Output<List<LoggingConfigLogActionsItem>> logActions;

    /**
     * @return Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
     * 
     */
    public Optional<Output<List<LoggingConfigLogActionsItem>>> logActions() {
        return Optional.ofNullable(this.logActions);
    }

    private LoggingConfigArgs() {}

    private LoggingConfigArgs(LoggingConfigArgs $) {
        this.enableOnpremGcsTransferLogs = $.enableOnpremGcsTransferLogs;
        this.logActionStates = $.logActionStates;
        this.logActions = $.logActions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LoggingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LoggingConfigArgs $;

        public Builder() {
            $ = new LoggingConfigArgs();
        }

        public Builder(LoggingConfigArgs defaults) {
            $ = new LoggingConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableOnpremGcsTransferLogs For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
         * 
         * @return builder
         * 
         */
        public Builder enableOnpremGcsTransferLogs(@Nullable Output<Boolean> enableOnpremGcsTransferLogs) {
            $.enableOnpremGcsTransferLogs = enableOnpremGcsTransferLogs;
            return this;
        }

        /**
         * @param enableOnpremGcsTransferLogs For transfers with a PosixFilesystem source, this option enables the Cloud Storage transfer logs for this transfer.
         * 
         * @return builder
         * 
         */
        public Builder enableOnpremGcsTransferLogs(Boolean enableOnpremGcsTransferLogs) {
            return enableOnpremGcsTransferLogs(Output.of(enableOnpremGcsTransferLogs));
        }

        /**
         * @param logActionStates States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
         * 
         * @return builder
         * 
         */
        public Builder logActionStates(@Nullable Output<List<LoggingConfigLogActionStatesItem>> logActionStates) {
            $.logActionStates = logActionStates;
            return this;
        }

        /**
         * @param logActionStates States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
         * 
         * @return builder
         * 
         */
        public Builder logActionStates(List<LoggingConfigLogActionStatesItem> logActionStates) {
            return logActionStates(Output.of(logActionStates));
        }

        /**
         * @param logActionStates States in which `log_actions` are logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
         * 
         * @return builder
         * 
         */
        public Builder logActionStates(LoggingConfigLogActionStatesItem... logActionStates) {
            return logActionStates(List.of(logActionStates));
        }

        /**
         * @param logActions Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
         * 
         * @return builder
         * 
         */
        public Builder logActions(@Nullable Output<List<LoggingConfigLogActionsItem>> logActions) {
            $.logActions = logActions;
            return this;
        }

        /**
         * @param logActions Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
         * 
         * @return builder
         * 
         */
        public Builder logActions(List<LoggingConfigLogActionsItem> logActions) {
            return logActions(Output.of(logActions));
        }

        /**
         * @param logActions Specifies the actions to be logged. If empty, no logs are generated. Not supported for transfers with PosixFilesystem data sources; use enable_onprem_gcs_transfer_logs instead.
         * 
         * @return builder
         * 
         */
        public Builder logActions(LoggingConfigLogActionsItem... logActions) {
            return logActions(List.of(logActions));
        }

        public LoggingConfigArgs build() {
            return $;
        }
    }

}