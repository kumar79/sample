package com.apps.classes;

public class Rockets {
	float specificImpulse;
	float exhauseVelocity;
	float pressure;
	double nozzleAreaRatio;
	double heatTransferRate;
	double vehicleVelocity;
	float massRatio;
	double propellentFlow;
	
	public float getSpecificImpulse() {
		return specificImpulse;
	}
	public void setSpecificImpulse(float specificImpulse) {
		this.specificImpulse = specificImpulse;
	}
	public float getExhauseVelocity() {
		return exhauseVelocity;
	}
	public void setExhauseVelocity(float exhauseVelocity) {
		this.exhauseVelocity = exhauseVelocity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	public double getNozzleAreaRatio() {
		return nozzleAreaRatio;
	}
	public void setNozzleAreaRatio(double nozzleAreaRatio) {
		this.nozzleAreaRatio = nozzleAreaRatio;
	}
	public double getHeatTransferRate() {
		return heatTransferRate;
	}
	public void setHeatTransferRate(double heatTransferRate) {
		this.heatTransferRate = heatTransferRate;
	}
	public double getVehicleVelocity() {
		return vehicleVelocity;
	}
	public void setVehicleVelocity(double vehicleVelocity) {
		this.vehicleVelocity = vehicleVelocity;
	}
	public float getMassRatio() {
		return massRatio;
	}
	public void setMassRatio(float massRatio) {
		this.massRatio = massRatio;
	}
	public double getPropellentFlow() {
		return propellentFlow;
	}
	public void setPropellentFlow(double propellentFlow) {
		this.propellentFlow = propellentFlow;
	}
	public float getThrush() {
		return thrush;
	}
	public void setThrush(float thrush) {
		this.thrush = thrush;
	}
	public String getRocketName() {
		return rocketName;
	}
	public void setRocketName(String rocketName) {
		this.rocketName = rocketName;
	}
	public int getIndexOfRocket() {
		return indexOfRocket;
	}
	public void setIndexOfRocket(int indexOfRocket) {
		this.indexOfRocket = indexOfRocket;
	}
	float thrush;
	String rocketName;
	int indexOfRocket;
}
