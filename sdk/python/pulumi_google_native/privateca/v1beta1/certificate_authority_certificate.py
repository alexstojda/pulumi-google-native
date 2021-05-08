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

__all__ = ['CertificateAuthorityCertificateArgs', 'CertificateAuthorityCertificate']

@pulumi.input_type
class CertificateAuthorityCertificateArgs:
    def __init__(__self__, *,
                 certificate_authorities_id: pulumi.Input[str],
                 certificates_id: pulumi.Input[str],
                 locations_id: pulumi.Input[str],
                 projects_id: pulumi.Input[str],
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input['CertificateConfigArgs']] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 lifetime: Optional[pulumi.Input[str]] = None,
                 pem_csr: Optional[pulumi.Input[str]] = None,
                 request_id: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a CertificateAuthorityCertificate resource.
        :param pulumi.Input['CertificateConfigArgs'] config: Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Optional. Labels with user-defined metadata.
        :param pulumi.Input[str] lifetime: Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
        :param pulumi.Input[str] pem_csr: Immutable. A pem-encoded X.509 certificate signing request (CSR).
        """
        pulumi.set(__self__, "certificate_authorities_id", certificate_authorities_id)
        pulumi.set(__self__, "certificates_id", certificates_id)
        pulumi.set(__self__, "locations_id", locations_id)
        pulumi.set(__self__, "projects_id", projects_id)
        if certificate_id is not None:
            pulumi.set(__self__, "certificate_id", certificate_id)
        if config is not None:
            pulumi.set(__self__, "config", config)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if lifetime is not None:
            pulumi.set(__self__, "lifetime", lifetime)
        if pem_csr is not None:
            pulumi.set(__self__, "pem_csr", pem_csr)
        if request_id is not None:
            pulumi.set(__self__, "request_id", request_id)

    @property
    @pulumi.getter(name="certificateAuthoritiesId")
    def certificate_authorities_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "certificate_authorities_id")

    @certificate_authorities_id.setter
    def certificate_authorities_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate_authorities_id", value)

    @property
    @pulumi.getter(name="certificatesId")
    def certificates_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "certificates_id")

    @certificates_id.setter
    def certificates_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificates_id", value)

    @property
    @pulumi.getter(name="locationsId")
    def locations_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "locations_id")

    @locations_id.setter
    def locations_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "locations_id", value)

    @property
    @pulumi.getter(name="projectsId")
    def projects_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "projects_id")

    @projects_id.setter
    def projects_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "projects_id", value)

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "certificate_id")

    @certificate_id.setter
    def certificate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_id", value)

    @property
    @pulumi.getter
    def config(self) -> Optional[pulumi.Input['CertificateConfigArgs']]:
        """
        Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
        """
        return pulumi.get(self, "config")

    @config.setter
    def config(self, value: Optional[pulumi.Input['CertificateConfigArgs']]):
        pulumi.set(self, "config", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        """
        Optional. Labels with user-defined metadata.
        """
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def lifetime(self) -> Optional[pulumi.Input[str]]:
        """
        Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
        """
        return pulumi.get(self, "lifetime")

    @lifetime.setter
    def lifetime(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "lifetime", value)

    @property
    @pulumi.getter(name="pemCsr")
    def pem_csr(self) -> Optional[pulumi.Input[str]]:
        """
        Immutable. A pem-encoded X.509 certificate signing request (CSR).
        """
        return pulumi.get(self, "pem_csr")

    @pem_csr.setter
    def pem_csr(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "pem_csr", value)

    @property
    @pulumi.getter(name="requestId")
    def request_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "request_id")

    @request_id.setter
    def request_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "request_id", value)


class CertificateAuthorityCertificate(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_authorities_id: Optional[pulumi.Input[str]] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 certificates_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[pulumi.InputType['CertificateConfigArgs']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 lifetime: Optional[pulumi.Input[str]] = None,
                 locations_id: Optional[pulumi.Input[str]] = None,
                 pem_csr: Optional[pulumi.Input[str]] = None,
                 projects_id: Optional[pulumi.Input[str]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a new Certificate in a given Project, Location from a particular CertificateAuthority.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[pulumi.InputType['CertificateConfigArgs']] config: Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
        :param pulumi.Input[Mapping[str, pulumi.Input[str]]] labels: Optional. Labels with user-defined metadata.
        :param pulumi.Input[str] lifetime: Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
        :param pulumi.Input[str] pem_csr: Immutable. A pem-encoded X.509 certificate signing request (CSR).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: CertificateAuthorityCertificateArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a new Certificate in a given Project, Location from a particular CertificateAuthority.

        :param str resource_name: The name of the resource.
        :param CertificateAuthorityCertificateArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(CertificateAuthorityCertificateArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_authorities_id: Optional[pulumi.Input[str]] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 certificates_id: Optional[pulumi.Input[str]] = None,
                 config: Optional[pulumi.Input[pulumi.InputType['CertificateConfigArgs']]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 lifetime: Optional[pulumi.Input[str]] = None,
                 locations_id: Optional[pulumi.Input[str]] = None,
                 pem_csr: Optional[pulumi.Input[str]] = None,
                 projects_id: Optional[pulumi.Input[str]] = None,
                 request_id: Optional[pulumi.Input[str]] = None,
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
            __props__ = CertificateAuthorityCertificateArgs.__new__(CertificateAuthorityCertificateArgs)

            if certificate_authorities_id is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_authorities_id'")
            __props__.__dict__["certificate_authorities_id"] = certificate_authorities_id
            __props__.__dict__["certificate_id"] = certificate_id
            if certificates_id is None and not opts.urn:
                raise TypeError("Missing required property 'certificates_id'")
            __props__.__dict__["certificates_id"] = certificates_id
            __props__.__dict__["config"] = config
            __props__.__dict__["labels"] = labels
            __props__.__dict__["lifetime"] = lifetime
            if locations_id is None and not opts.urn:
                raise TypeError("Missing required property 'locations_id'")
            __props__.__dict__["locations_id"] = locations_id
            __props__.__dict__["pem_csr"] = pem_csr
            if projects_id is None and not opts.urn:
                raise TypeError("Missing required property 'projects_id'")
            __props__.__dict__["projects_id"] = projects_id
            __props__.__dict__["request_id"] = request_id
            __props__.__dict__["certificate_description"] = None
            __props__.__dict__["create_time"] = None
            __props__.__dict__["name"] = None
            __props__.__dict__["pem_certificate"] = None
            __props__.__dict__["pem_certificate_chain"] = None
            __props__.__dict__["revocation_details"] = None
            __props__.__dict__["update_time"] = None
        super(CertificateAuthorityCertificate, __self__).__init__(
            'google-native:privateca/v1beta1:CertificateAuthorityCertificate',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None) -> 'CertificateAuthorityCertificate':
        """
        Get an existing CertificateAuthorityCertificate resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = CertificateAuthorityCertificateArgs.__new__(CertificateAuthorityCertificateArgs)

        __props__.__dict__["certificate_description"] = None
        __props__.__dict__["config"] = None
        __props__.__dict__["create_time"] = None
        __props__.__dict__["labels"] = None
        __props__.__dict__["lifetime"] = None
        __props__.__dict__["name"] = None
        __props__.__dict__["pem_certificate"] = None
        __props__.__dict__["pem_certificate_chain"] = None
        __props__.__dict__["pem_csr"] = None
        __props__.__dict__["revocation_details"] = None
        __props__.__dict__["update_time"] = None
        return CertificateAuthorityCertificate(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="certificateDescription")
    def certificate_description(self) -> pulumi.Output['outputs.CertificateDescriptionResponse']:
        """
        A structured description of the issued X.509 certificate.
        """
        return pulumi.get(self, "certificate_description")

    @property
    @pulumi.getter
    def config(self) -> pulumi.Output['outputs.CertificateConfigResponse']:
        """
        Immutable. A description of the certificate and key that does not require X.509 or ASN.1.
        """
        return pulumi.get(self, "config")

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The time at which this Certificate was created.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Mapping[str, str]]:
        """
        Optional. Labels with user-defined metadata.
        """
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def lifetime(self) -> pulumi.Output[str]:
        """
        Required. Immutable. The desired lifetime of a certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate. Note that the lifetime may be truncated if it would extend past the life of any certificate authority in the issuing chain.
        """
        return pulumi.get(self, "lifetime")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The resource path for this Certificate in the format `projects/*/locations/*/certificateAuthorities/*/certificates/*`.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="pemCertificate")
    def pem_certificate(self) -> pulumi.Output[str]:
        """
        The pem-encoded, signed X.509 certificate.
        """
        return pulumi.get(self, "pem_certificate")

    @property
    @pulumi.getter(name="pemCertificateChain")
    def pem_certificate_chain(self) -> pulumi.Output[Sequence[str]]:
        """
        The chain that may be used to verify the X.509 certificate. Expected to be in issuer-to-root order according to RFC 5246.
        """
        return pulumi.get(self, "pem_certificate_chain")

    @property
    @pulumi.getter(name="pemCsr")
    def pem_csr(self) -> pulumi.Output[str]:
        """
        Immutable. A pem-encoded X.509 certificate signing request (CSR).
        """
        return pulumi.get(self, "pem_csr")

    @property
    @pulumi.getter(name="revocationDetails")
    def revocation_details(self) -> pulumi.Output['outputs.RevocationDetailsResponse']:
        """
        Details regarding the revocation of this Certificate. This Certificate is considered revoked if and only if this field is present.
        """
        return pulumi.get(self, "revocation_details")

    @property
    @pulumi.getter(name="updateTime")
    def update_time(self) -> pulumi.Output[str]:
        """
        The time at which this Certificate was updated.
        """
        return pulumi.get(self, "update_time")
