# coding=utf-8
# *** WARNING: this file was generated by the Pulumi SDK Generator. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from ... import _utilities
from . import outputs
from ._inputs import *

__all__ = ['ClientTlsPolicyArgs', 'ClientTlsPolicy']

@pulumi.input_type
class ClientTlsPolicyArgs:
    def __init__(__self__, *,
                 client_tls_policy_id: pulumi.Input[str],
                 client_certificate: Optional[pulumi.Input['GoogleCloudNetworksecurityV1CertificateProviderArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 server_validation_ca: Optional[pulumi.Input[Sequence[pulumi.Input['ValidationCAArgs']]]] = None,
                 sni: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a ClientTlsPolicy resource.
        :param pulumi.Input[str] client_tls_policy_id: Required. Short name of the ClientTlsPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. "client_mtls_policy".
        :param pulumi.Input['GoogleCloudNetworksecurityV1CertificateProviderArgs'] client_certificate: Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
        :param pulumi.Input[str] description: Optional. Free-text description of the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Optional. Set of label tags associated with the resource.
        :param pulumi.Input[str] name: Name of the ClientTlsPolicy resource. It matches the pattern `projects/*/locations/{location}/clientTlsPolicies/{client_tls_policy}`
        :param pulumi.Input[Sequence[pulumi.Input['ValidationCAArgs']]] server_validation_ca: Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
        :param pulumi.Input[str] sni: Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
        """
        pulumi.set(__self__, "client_tls_policy_id", client_tls_policy_id)
        if client_certificate is not None:
            pulumi.set(__self__, "client_certificate", client_certificate)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if location is not None:
            pulumi.set(__self__, "location", location)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if project is not None:
            pulumi.set(__self__, "project", project)
        if server_validation_ca is not None:
            pulumi.set(__self__, "server_validation_ca", server_validation_ca)
        if sni is not None:
            pulumi.set(__self__, "sni", sni)

    @property
    @pulumi.getter(name="clientTlsPolicyId")
    def client_tls_policy_id(self) -> pulumi.Input[str]:
        """
        Required. Short name of the ClientTlsPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. "client_mtls_policy".
        """
        return pulumi.get(self, "client_tls_policy_id")

    @client_tls_policy_id.setter
    def client_tls_policy_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_tls_policy_id", value)

    @property
    @pulumi.getter(name="clientCertificate")
    def client_certificate(self) -> Optional[pulumi.Input['GoogleCloudNetworksecurityV1CertificateProviderArgs']]:
        """
        Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
        """
        return pulumi.get(self, "client_certificate")

    @client_certificate.setter
    def client_certificate(self, value: Optional[pulumi.Input['GoogleCloudNetworksecurityV1CertificateProviderArgs']]):
        pulumi.set(self, "client_certificate", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Optional. Free-text description of the resource.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Optional. Set of label tags associated with the resource.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def location(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "location")

    @location.setter
    def location(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "location", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Name of the ClientTlsPolicy resource. It matches the pattern `projects/*/locations/{location}/clientTlsPolicies/{client_tls_policy}`
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def project(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "project")

    @project.setter
    def project(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "project", value)

    @property
    @pulumi.getter(name="serverValidationCa")
    def server_validation_ca(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['ValidationCAArgs']]]]:
        """
        Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
        """
        return pulumi.get(self, "server_validation_ca")

    @server_validation_ca.setter
    def server_validation_ca(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['ValidationCAArgs']]]]):
        pulumi.set(self, "server_validation_ca", value)

    @property
    @pulumi.getter
    def sni(self) -> Optional[pulumi.Input[str]]:
        """
        Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
        """
        return pulumi.get(self, "sni")

    @sni.setter
    def sni(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "sni", value)


class ClientTlsPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_certificate: Optional[pulumi.Input[pulumi.InputType['GoogleCloudNetworksecurityV1CertificateProviderArgs']]] = None,
                 client_tls_policy_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 server_validation_ca: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ValidationCAArgs']]]]] = None,
                 sni: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Creates a new ClientTlsPolicy in a given project and location.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['GoogleCloudNetworksecurityV1CertificateProviderArgs']] client_certificate: Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
        :param pulumi.Input[str] client_tls_policy_id: Required. Short name of the ClientTlsPolicy resource to be created. This value should be 1-63 characters long, containing only letters, numbers, hyphens, and underscores, and should not start with a number. E.g. "client_mtls_policy".
        :param pulumi.Input[str] description: Optional. Free-text description of the resource.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Optional. Set of label tags associated with the resource.
        :param pulumi.Input[str] name: Name of the ClientTlsPolicy resource. It matches the pattern `projects/*/locations/{location}/clientTlsPolicies/{client_tls_policy}`
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ValidationCAArgs']]]] server_validation_ca: Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
        :param pulumi.Input[str] sni: Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ClientTlsPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Creates a new ClientTlsPolicy in a given project and location.

        :param str resource_name: The name of the resource.
        :param ClientTlsPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ClientTlsPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 client_certificate: Optional[pulumi.Input[pulumi.InputType['GoogleCloudNetworksecurityV1CertificateProviderArgs']]] = None,
                 client_tls_policy_id: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 location: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 project: Optional[pulumi.Input[str]] = None,
                 server_validation_ca: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['ValidationCAArgs']]]]] = None,
                 sni: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ClientTlsPolicyArgs.__new__(ClientTlsPolicyArgs)

            __props__.__dict__["client_certificate"] = client_certificate
            if client_tls_policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'client_tls_policy_id'")
            __props__.__dict__["client_tls_policy_id"] = client_tls_policy_id
            __props__.__dict__["description"] = description
            __props__.__dict__["labels"] = labels
            __props__.__dict__["location"] = location
            __props__.__dict__["name"] = name
            __props__.__dict__["project"] = project
            __props__.__dict__["server_validation_ca"] = server_validation_ca
            __props__.__dict__["sni"] = sni
            __props__.__dict__["create_time"] = None
            __props__.__dict__["update_time"] = None
        super(ClientTlsPolicy, __self__).__init__(
            'google-native:networksecurity/v1:ClientTlsPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'ClientTlsPolicy':
        """
        Get an existing ClientTlsPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = ClientTlsPolicyArgs.__new__(ClientTlsPolicyArgs)

        __props__.__dict__["client_certificate"] = None
        __props__.__dict__["create_time"] = None
        __props__.__dict__["description"] = None
        __props__.__dict__["labels"] = None
        __props__.__dict__["name"] = None
        __props__.__dict__["server_validation_ca"] = None
        __props__.__dict__["sni"] = None
        __props__.__dict__["update_time"] = None
        return ClientTlsPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="clientCertificate")
    def client_certificate(self) -> pulumi.Output['outputs.GoogleCloudNetworksecurityV1CertificateProviderResponse']:
        """
        Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
        """
        return pulumi.get(self, "client_certificate")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The timestamp when the resource was created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[str]:
        """
        Optional. Free-text description of the resource.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Optional. Set of label tags associated with the resource.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Name of the ClientTlsPolicy resource. It matches the pattern `projects/*/locations/{location}/clientTlsPolicies/{client_tls_policy}`
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="serverValidationCa")
    def server_validation_ca(self) -> pulumi.Output[Sequence['outputs.ValidationCAResponse']]:
        """
        Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
        """
        return pulumi.get(self, "server_validation_ca")

    @property
    @pulumi.getter
    def sni(self) -> pulumi.Output[str]:
        """
        Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
        """
        return pulumi.get(self, "sni")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[str]:
        """
        The timestamp when the resource was updated.
        """
        return pulumi.get(self, "update_time")
