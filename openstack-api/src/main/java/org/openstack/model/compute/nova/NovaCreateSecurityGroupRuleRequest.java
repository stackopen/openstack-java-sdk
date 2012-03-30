package org.openstack.model.compute.nova;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.openstack.model.common.JsonRootElement;

import com.google.gson.annotations.SerializedName;

@XmlRootElement(name = "security_group_rule")
@XmlAccessorType(XmlAccessType.NONE)
@JsonRootElement("security_group_rule")
public class NovaCreateSecurityGroupRuleRequest implements Serializable {
		
		@XmlElement(name="parent_group_id", required=true)
		@SerializedName("parent_group_id")
		private Integer parentGroupId;
		
		@XmlElement(name="from_port")
		@SerializedName("from_port")
		private Integer fromPort;
		
		@XmlElement(name="to_port")
		@SerializedName("to_port")
		private Integer toPort;
		
		@XmlElement(name="ip_protocol")
		@SerializedName("ip_protocol")
		private String ipProtocol;
		
		@XmlElement
		private String cidr;
		
		@XmlElement(name="group_id")
		@SerializedName("group_id")
		private Integer groupId;

		public Integer getParentGroupId() {
			return parentGroupId;
		}

		public void setParentGroupId(Integer parentGroupId) {
			this.parentGroupId = parentGroupId;
		}

		public Integer getFromPort() {
			return fromPort;
		}

		public void setFromPort(Integer fromPort) {
			this.fromPort = fromPort;
		}

		public Integer getToPort() {
			return toPort;
		}

		public void setToPort(Integer toPort) {
			this.toPort = toPort;
		}

		public String getIpProtocol() {
			return ipProtocol;
		}

		public void setIpProtocol(String ipProtocol) {
			this.ipProtocol = ipProtocol;
		}

		public String getCidr() {
			return cidr;
		}

		public void setCidr(String cidr) {
			this.cidr = cidr;
		}

		public Integer getGroupId() {
			return groupId;
		}

		public void setGroupId(Integer groupId) {
			this.groupId = groupId;
		}

		@Override
		public String toString() {
			return "SecurityGroupRule [parentGroupId=" + parentGroupId
					+ ", fromPort=" + fromPort + ", toPort=" + toPort
					+ ", ipProtocol=" + ipProtocol + ", cidr=" + cidr
					+ ", groupId=" + groupId + "]";
		}
	
}
