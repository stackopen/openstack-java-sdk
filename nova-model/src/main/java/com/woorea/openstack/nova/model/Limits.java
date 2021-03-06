package com.woorea.openstack.nova.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonRootName;

@JsonRootName("limits")
public class Limits implements Serializable {
	
	public static final class RateLimit implements Serializable {
		
		public static final class LimitEntry implements Serializable {
		
			@JsonProperty("next-available")
			private Calendar nextAvailable;
			
			private String unit;
			
			private String verb;
			
			private Integer remaining;
			
			private Integer available;

			/**
			 * @return the nextAvailable
			 */
			public Calendar getNextAvailable() {
				return nextAvailable;
			}

			/**
			 * @return the unit
			 */
			public String getUnit() {
				return unit;
			}

			/**
			 * @return the verb
			 */
			public String getVerb() {
				return verb;
			}

			/**
			 * @return the remaining
			 */
			public Integer getRemaining() {
				return remaining;
			}

			/**
			 * @return the available
			 */
			public Integer getAvailable() {
				return available;
			}

			/* (non-Javadoc)
			 * @see java.lang.Object#toString()
			 */
			@Override
			public String toString() {
				return "LimitEntry [nextAvailable=" + nextAvailable + ", unit="
						+ unit + ", verb=" + verb + ", remaining=" + remaining
						+ ", available=" + available + "]";
			}
			
			
			
		}
		
		private String regex;
		
		private String uri;
		
		private List<LimitEntry> limit;

		/**
		 * @return the regex
		 */
		public String getRegex() {
			return regex;
		}

		/**
		 * @return the uri
		 */
		public String getUri() {
			return uri;
		}

		/**
		 * @return the limit
		 */
		public List<LimitEntry> getLimit() {
			return limit;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "RateLimit [regex=" + regex + ", uri=" + uri + ", limit="
					+ limit + "]";
		}
		
	}
	
	private static final class AbsoluteLimit {
	
		private Integer maxServerMeta;
		
		private Integer maxPersonality;
		
		private Integer maxImageMeta;
		
		private Integer maxPersonalitySize;
		
		private Integer maxTotalCores;
		
		private Integer maxTotalInstances;
		
		private Integer maxTotalRAMSize;

		/**
		 * @return the maxServerMeta
		 */
		public Integer getMaxServerMeta() {
			return maxServerMeta;
		}

		/**
		 * @return the maxPersonality
		 */
		public Integer getMaxPersonality() {
			return maxPersonality;
		}

		/**
		 * @return the maxImageMeta
		 */
		public Integer getMaxImageMeta() {
			return maxImageMeta;
		}

		/**
		 * @return the maxPersonalitySize
		 */
		public Integer getMaxPersonalitySize() {
			return maxPersonalitySize;
		}

		/**
		 * @return the maxTotalCores
		 */
		public Integer getMaxTotalCores() {
			return maxTotalCores;
		}

		/**
		 * @return the maxTotalInstances
		 */
		public Integer getMaxTotalInstances() {
			return maxTotalInstances;
		}

		/**
		 * @return the maxTotalRAMSize
		 */
		public Integer getMaxTotalRAMSize() {
			return maxTotalRAMSize;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "AbsoluteLimit [maxServerMeta=" + maxServerMeta
					+ ", maxPersonality=" + maxPersonality + ", maxImageMeta="
					+ maxImageMeta + ", maxPersonalitySize="
					+ maxPersonalitySize + ", maxTotalCores=" + maxTotalCores
					+ ", maxTotalInstances=" + maxTotalInstances
					+ ", maxTotalRAMSize=" + maxTotalRAMSize + "]";
		}
		
	}
	
	private List<RateLimit> rate;
	
	private AbsoluteLimit absolute;

	/**
	 * @return the rate
	 */
	public List<RateLimit> getRate() {
		return rate;
	}

	/**
	 * @return the absolute
	 */
	public AbsoluteLimit getAbsolute() {
		return absolute;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Limits [rate=" + rate + ", absolute=" + absolute + "]";
	}

}
