// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam.v1;

import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.iam.v1.inputs.GetKeyArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetKeyPlainArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetOrganizationRoleArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetOrganizationRolePlainArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetProviderArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetProviderPlainArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetRoleArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetRolePlainArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetServiceAccountArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetServiceAccountIamPolicyArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetServiceAccountIamPolicyPlainArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetServiceAccountPlainArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetWorkloadIdentityPoolArgs;
import com.pulumi.googlenative.iam.v1.inputs.GetWorkloadIdentityPoolPlainArgs;
import com.pulumi.googlenative.iam.v1.outputs.GetKeyResult;
import com.pulumi.googlenative.iam.v1.outputs.GetOrganizationRoleResult;
import com.pulumi.googlenative.iam.v1.outputs.GetProviderResult;
import com.pulumi.googlenative.iam.v1.outputs.GetRoleResult;
import com.pulumi.googlenative.iam.v1.outputs.GetServiceAccountIamPolicyResult;
import com.pulumi.googlenative.iam.v1.outputs.GetServiceAccountResult;
import com.pulumi.googlenative.iam.v1.outputs.GetWorkloadIdentityPoolResult;
import java.util.concurrent.CompletableFuture;

public final class Iam_v1Functions {
    /**
     * Gets a ServiceAccountKey.
     * 
     */
    public static Output<GetKeyResult> getKey(GetKeyArgs args) {
        return getKey(args, InvokeOptions.Empty);
    }
    /**
     * Gets a ServiceAccountKey.
     * 
     */
    public static CompletableFuture<GetKeyResult> getKeyPlain(GetKeyPlainArgs args) {
        return getKeyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a ServiceAccountKey.
     * 
     */
    public static Output<GetKeyResult> getKey(GetKeyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:iam/v1:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a ServiceAccountKey.
     * 
     */
    public static CompletableFuture<GetKeyResult> getKeyPlain(GetKeyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iam/v1:getKey", TypeShape.of(GetKeyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the definition of a Role.
     * 
     */
    public static Output<GetOrganizationRoleResult> getOrganizationRole(GetOrganizationRoleArgs args) {
        return getOrganizationRole(args, InvokeOptions.Empty);
    }
    /**
     * Gets the definition of a Role.
     * 
     */
    public static CompletableFuture<GetOrganizationRoleResult> getOrganizationRolePlain(GetOrganizationRolePlainArgs args) {
        return getOrganizationRolePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the definition of a Role.
     * 
     */
    public static Output<GetOrganizationRoleResult> getOrganizationRole(GetOrganizationRoleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:iam/v1:getOrganizationRole", TypeShape.of(GetOrganizationRoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the definition of a Role.
     * 
     */
    public static CompletableFuture<GetOrganizationRoleResult> getOrganizationRolePlain(GetOrganizationRolePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iam/v1:getOrganizationRole", TypeShape.of(GetOrganizationRoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an individual WorkloadIdentityPoolProvider.
     * 
     */
    public static Output<GetProviderResult> getProvider(GetProviderArgs args) {
        return getProvider(args, InvokeOptions.Empty);
    }
    /**
     * Gets an individual WorkloadIdentityPoolProvider.
     * 
     */
    public static CompletableFuture<GetProviderResult> getProviderPlain(GetProviderPlainArgs args) {
        return getProviderPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets an individual WorkloadIdentityPoolProvider.
     * 
     */
    public static Output<GetProviderResult> getProvider(GetProviderArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:iam/v1:getProvider", TypeShape.of(GetProviderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an individual WorkloadIdentityPoolProvider.
     * 
     */
    public static CompletableFuture<GetProviderResult> getProviderPlain(GetProviderPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iam/v1:getProvider", TypeShape.of(GetProviderResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the definition of a Role.
     * 
     */
    public static Output<GetRoleResult> getRole(GetRoleArgs args) {
        return getRole(args, InvokeOptions.Empty);
    }
    /**
     * Gets the definition of a Role.
     * 
     */
    public static CompletableFuture<GetRoleResult> getRolePlain(GetRolePlainArgs args) {
        return getRolePlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the definition of a Role.
     * 
     */
    public static Output<GetRoleResult> getRole(GetRoleArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:iam/v1:getRole", TypeShape.of(GetRoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the definition of a Role.
     * 
     */
    public static CompletableFuture<GetRoleResult> getRolePlain(GetRolePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iam/v1:getRole", TypeShape.of(GetRoleResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a ServiceAccount.
     * 
     */
    public static Output<GetServiceAccountResult> getServiceAccount(GetServiceAccountArgs args) {
        return getServiceAccount(args, InvokeOptions.Empty);
    }
    /**
     * Gets a ServiceAccount.
     * 
     */
    public static CompletableFuture<GetServiceAccountResult> getServiceAccountPlain(GetServiceAccountPlainArgs args) {
        return getServiceAccountPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets a ServiceAccount.
     * 
     */
    public static Output<GetServiceAccountResult> getServiceAccount(GetServiceAccountArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:iam/v1:getServiceAccount", TypeShape.of(GetServiceAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a ServiceAccount.
     * 
     */
    public static CompletableFuture<GetServiceAccountResult> getServiceAccountPlain(GetServiceAccountPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iam/v1:getServiceAccount", TypeShape.of(GetServiceAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the IAM policy that is attached to a ServiceAccount. This IAM policy specifies which principals have access to the service account. This method does not tell you whether the service account has been granted any roles on other resources. To check whether a service account has role grants on a resource, use the `getIamPolicy` method for that resource. For example, to view the role grants for a project, call the Resource Manager API&#39;s [`projects.getIamPolicy`](https://cloud.google.com/resource-manager/reference/rest/v1/projects/getIamPolicy) method.
     * 
     */
    public static Output<GetServiceAccountIamPolicyResult> getServiceAccountIamPolicy(GetServiceAccountIamPolicyArgs args) {
        return getServiceAccountIamPolicy(args, InvokeOptions.Empty);
    }
    /**
     * Gets the IAM policy that is attached to a ServiceAccount. This IAM policy specifies which principals have access to the service account. This method does not tell you whether the service account has been granted any roles on other resources. To check whether a service account has role grants on a resource, use the `getIamPolicy` method for that resource. For example, to view the role grants for a project, call the Resource Manager API&#39;s [`projects.getIamPolicy`](https://cloud.google.com/resource-manager/reference/rest/v1/projects/getIamPolicy) method.
     * 
     */
    public static CompletableFuture<GetServiceAccountIamPolicyResult> getServiceAccountIamPolicyPlain(GetServiceAccountIamPolicyPlainArgs args) {
        return getServiceAccountIamPolicyPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets the IAM policy that is attached to a ServiceAccount. This IAM policy specifies which principals have access to the service account. This method does not tell you whether the service account has been granted any roles on other resources. To check whether a service account has role grants on a resource, use the `getIamPolicy` method for that resource. For example, to view the role grants for a project, call the Resource Manager API&#39;s [`projects.getIamPolicy`](https://cloud.google.com/resource-manager/reference/rest/v1/projects/getIamPolicy) method.
     * 
     */
    public static Output<GetServiceAccountIamPolicyResult> getServiceAccountIamPolicy(GetServiceAccountIamPolicyArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:iam/v1:getServiceAccountIamPolicy", TypeShape.of(GetServiceAccountIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the IAM policy that is attached to a ServiceAccount. This IAM policy specifies which principals have access to the service account. This method does not tell you whether the service account has been granted any roles on other resources. To check whether a service account has role grants on a resource, use the `getIamPolicy` method for that resource. For example, to view the role grants for a project, call the Resource Manager API&#39;s [`projects.getIamPolicy`](https://cloud.google.com/resource-manager/reference/rest/v1/projects/getIamPolicy) method.
     * 
     */
    public static CompletableFuture<GetServiceAccountIamPolicyResult> getServiceAccountIamPolicyPlain(GetServiceAccountIamPolicyPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iam/v1:getServiceAccountIamPolicy", TypeShape.of(GetServiceAccountIamPolicyResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an individual WorkloadIdentityPool.
     * 
     */
    public static Output<GetWorkloadIdentityPoolResult> getWorkloadIdentityPool(GetWorkloadIdentityPoolArgs args) {
        return getWorkloadIdentityPool(args, InvokeOptions.Empty);
    }
    /**
     * Gets an individual WorkloadIdentityPool.
     * 
     */
    public static CompletableFuture<GetWorkloadIdentityPoolResult> getWorkloadIdentityPoolPlain(GetWorkloadIdentityPoolPlainArgs args) {
        return getWorkloadIdentityPoolPlain(args, InvokeOptions.Empty);
    }
    /**
     * Gets an individual WorkloadIdentityPool.
     * 
     */
    public static Output<GetWorkloadIdentityPoolResult> getWorkloadIdentityPool(GetWorkloadIdentityPoolArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("google-native:iam/v1:getWorkloadIdentityPool", TypeShape.of(GetWorkloadIdentityPoolResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an individual WorkloadIdentityPool.
     * 
     */
    public static CompletableFuture<GetWorkloadIdentityPoolResult> getWorkloadIdentityPoolPlain(GetWorkloadIdentityPoolPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:iam/v1:getWorkloadIdentityPool", TypeShape.of(GetWorkloadIdentityPoolResult.class), args, Utilities.withVersion(options));
    }
}