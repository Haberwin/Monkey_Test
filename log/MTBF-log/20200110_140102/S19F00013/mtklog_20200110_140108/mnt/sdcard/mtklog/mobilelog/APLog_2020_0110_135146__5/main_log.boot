----- timezone:GMT
01-10 13:51:22.601409   349   349 W auditd  : type=2000 audit(0.0:1): initialized
01-10 13:51:25.465000   349   349 I auditd  : type=1403 audit(0.0:2): policy loaded auid=4294967295 ses=4294967295
01-10 13:51:25.469000   349   349 W auditd  : type=1404 audit(0.0:3): enforcing=1 old_enforcing=0 auid=4294967295 ses=4294967295
01-10 13:51:26.849000   343   343 W e2fsck  : type=1400 audit(0.0:4): avc: denied { read } for name="mmcblk0p7" dev="tmpfs" ino=8486 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
01-10 13:51:26.853000   343   343 W e2fsck  : type=1400 audit(0.0:5): avc: denied { read write } for name="mmcblk0p7" dev="tmpfs" ino=8486 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
01-10 13:51:27.010399   350   350 I SELinux : SELinux: Loaded service_contexts from:
01-10 13:51:27.013031   350   350 I SELinux :     /system/etc/selinux/plat_service_contexts
01-10 13:51:27.046119   352   352 I SELinux : SELinux: Loaded service_contexts from:
01-10 13:51:27.047389   352   352 I SELinux :     /vendor/etc/selinux/vndservice_contexts
01-10 13:51:27.090810   361   361 I AEE_AED : Built Mar 23 2018 13:42:39
01-10 13:51:27.095568   361   361 I AEE_AED : socket server: android:aee_aed
01-10 13:51:27.098596   351   351 E hwservicemanager: BINDER_SET_INHERIT_FIFO_PRIO failed with error -1
01-10 13:51:27.098827   361   361 D AEE_AED : aed_get_force_config: -100000
01-10 13:51:27.103257   361   361 I AEE_AED : aed_update_coredump_mode: persist.aee.core.dump disable
01-10 13:51:27.104385   361   361 I AEE_AED : aed_update_coredump_mode: persist.aee.core.direct disable
01-10 13:51:27.107580   361   361 I AEE_AED : AED config
01-10 13:51:27.107580   361   361 I AEE_AED :   mode '4'
01-10 13:51:27.107580   361   361 I AEE_AED :   exp level '0
01-10 13:51:27.107580   361   361 I AEE_AED :   dal enable '0'
01-10 13:51:27.107580   361   361 I AEE_AED :   db count '4'
01-10 13:51:27.107580   361   361 I AEE_AED :   fatal db count '4'
01-10 13:51:27.107580   361   361 I AEE_AED :  db storage '2'
01-10 13:51:27.107580   361   361 I AEE_AED :   SMP Info => 1
01-10 13:51:27.107719   361   361 E AEE_AED : fail to open prebuild packages list: No such file or directory
01-10 13:51:27.115453   364   364 I AEE_AEDV: Built Mar 23 2018 13:42:46
01-10 13:51:27.116399   364   364 I AEE_AEDV: socket server: android:aee_aedv
01-10 13:51:27.118596   364   364 D AEE_AEDV: aed_get_force_config: -100000
01-10 13:51:27.119302   364   364 I AEE_AEDV: AED config
01-10 13:51:27.119302   364   364 I AEE_AEDV:   mode '4'
01-10 13:51:27.119302   364   364 I AEE_AEDV:   exp level '0
01-10 13:51:27.119302   364   364 I AEE_AEDV:   dal enable '0'
01-10 13:51:27.119302   364   364 I AEE_AEDV:   db count '4'
01-10 13:51:27.119302   364   364 I AEE_AEDV:   fatal db count '4'
01-10 13:51:27.119302   364   364 I AEE_AEDV:  db storage '2'
01-10 13:51:27.119302   364   364 I AEE_AEDV:   SMP Info => 1
01-10 13:51:27.119408   364   364 E AEE_AEDV: fail to open prebuild packages list: No such file or directory
01-10 13:51:27.121000   365   365 W teed    : type=1400 audit(0.0:6): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.121000   365   365 W teed    : type=1400 audit(0.0:7): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.121000   365   365 W teed    : type=1400 audit(0.0:8): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.121000   365   365 W teed    : type=1400 audit(0.0:9): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.121000   365   365 I chatty  : uid=1000(system) /vendor/bin/teed identical 1 line
01-10 13:51:27.121000   365   365 W teed    : type=1400 audit(0.0:11): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.123803   365   365 D tkcore-teec: teed-version: 2.1p19
01-10 13:51:27.123803   365   365 D tkcore-teec: 
01-10 13:51:27.123803   365   365 D tkcore-teec: 
01-10 13:51:27.124065   365   365 D tkcore-teec: tz dev path: /dev/tkcoredrv
01-10 13:51:27.124127   365   365 D tkcore-teec: sdrpmb dev path: /dev/block/platform/bootdevice/by-name/sdrpmb
01-10 13:51:27.124177   365   365 D tkcore-teec: system ta path: /vendor/app/t6
01-10 13:51:27.124237   365   365 D tkcore-teec: sp ta path: /data/tee/t6
01-10 13:51:27.124295   365   365 D tkcore-teec: prot path: /vendor/protect_f/tee
01-10 13:51:27.140781   366   366 D vndksupport: Loading /vendor/lib64/hw/android.hardware.keymaster@3.0-impl.so from current namespace instead of sphal namespace.
01-10 13:51:27.229000   365   365 W tkearlyinit: type=1400 audit(0.0:12): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.232363   365   365 D tkcore-teec: SDRPMB: switching active to 0
01-10 13:51:27.257000   365   365 W tkearlyinit: type=1400 audit(0.0:13): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.257000   365   365 W teed    : type=1400 audit(0.0:14): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.257000   365   365 I chatty  : uid=1000(system) /vendor/bin/teed identical 4 lines
01-10 13:51:27.257000   365   365 W teed    : type=1400 audit(0.0:19): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.257000   365   365 W tkuinit : type=1400 audit(0.0:20): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.257000   365   365 W tkuinit : type=1400 audit(0.0:21): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.257674   365   365 D tkcore-teec: SDRPMB: ready active_id=0 start_sect=8225 nr_sects=32768
01-10 13:51:27.258187   365   370 D tkcore-teec: <log_teeos> thread started
01-10 13:51:27.258764   365   365 D tkcore-teec: TEED-sub: created with PID<371>
01-10 13:51:27.258764   365   365 D tkcore-teec: 
01-10 13:51:27.259130   365   370 D tkcore-teec: Wait for /data to be mounted.
01-10 13:51:27.259718   365   365 D tkcore-teec: tee_supp_fs_init bad statfs(/data/tee/) = -1
01-10 13:51:27.259718   365   365 D tkcore-teec: 
01-10 13:51:27.259783   365   365 D tkcore-teec: error tee_supp_fs_init. Delay it.
01-10 13:51:27.259918   365   365 D tkcore-teec: teed listening on /dev/tkcoredrv
01-10 13:51:27.259965   365   369 D tkcore-teec: tee_userinit enter
01-10 13:51:27.260112   365   369 D tkcore-teec: DEVICE BRAND Datalogic MODEL MEMOR 10 PLATFORM mt6763
01-10 13:51:27.260112   365   369 D tkcore-teec: 
01-10 13:51:27.290619   366   366 I android.hardware.keymaster@3.0-impl: Fetching keymaster device name default
01-10 13:51:27.291033   366   366 D vndksupport: Loading /vendor/lib64/hw/keystore.mt6763.so from current namespace instead of sphal namespace.
01-10 13:51:27.298991   360   360 I AEE_AED : Built Mar 23 2018 13:42:19
01-10 13:51:27.299085   363   363 I AEE_AEDV: Built Mar 23 2018 13:42:26
01-10 13:51:27.300168   360   360 I AEE_AED : socket server: android:aee_aed32
01-10 13:51:27.300169   363   363 I AEE_AEDV: socket server: android:aee_aedv32
01-10 13:51:27.300534   360   360 D AEE_AED : aed_get_force_config: -100000
01-10 13:51:27.301026   360   360 I AEE_AED : AED config
01-10 13:51:27.301026   360   360 I AEE_AED :   mode '4'
01-10 13:51:27.301026   360   360 I AEE_AED :   exp level '0
01-10 13:51:27.301026   360   360 I AEE_AED :   dal enable '0'
01-10 13:51:27.301026   360   360 I AEE_AED :   db count '4'
01-10 13:51:27.301026   360   360 I AEE_AED :   fatal db count '4'
01-10 13:51:27.301026   360   360 I AEE_AED :  db storage '2'
01-10 13:51:27.301026   360   360 I AEE_AED :   SMP Info => 1
01-10 13:51:27.301143   360   360 E AEE_AED : fail to get prebuild packages: No such file or directory
01-10 13:51:27.301182   360   360 E AEE_AED : init_aed_setting: fail to open db history file 
01-10 13:51:27.301197   360   360 D AEE_AED : aee_exception_running_64: send req to debuggerd64
01-10 13:51:27.301351   360   360 D AEE_AED : aee:rttd_64Rtt waiting 64_daemon finish the job...
01-10 13:51:27.301732   363   363 D AEE_AEDV: aed_get_force_config: -100000
01-10 13:51:27.302287   363   363 I AEE_AEDV: AED config
01-10 13:51:27.302287   363   363 I AEE_AEDV:   mode '4'
01-10 13:51:27.302287   363   363 I AEE_AEDV:   exp level '0
01-10 13:51:27.302287   363   363 I AEE_AEDV:   dal enable '0'
01-10 13:51:27.302287   363   363 I AEE_AEDV:   db count '4'
01-10 13:51:27.302287   363   363 I AEE_AEDV:   fatal db count '4'
01-10 13:51:27.302287   363   363 I AEE_AEDV:  db storage '2'
01-10 13:51:27.302287   363   363 I AEE_AEDV:   SMP Info => 1
01-10 13:51:27.302344   363   363 E AEE_AEDV: fail to open prebuild packages list: No such file or directory
01-10 13:51:27.302394   363   363 E AEE_AEDV: init_aed_setting: fail to open db history file 
01-10 13:51:27.302430   363   363 D AEE_AEDV: aee_exception_running_64: send req to debuggerd64
01-10 13:51:27.302556   363   363 D AEE_AEDV: aee:vrttd_64Rtt waiting 64_daemon finish the job...
01-10 13:51:27.309000   365   365 W teed    : type=1400 audit(0.0:22): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.311865   366   366 I android.hardware.keymaster@3.0-impl: Found keymaster2 module Keymaster TrustKernel HAL, version 200
01-10 13:51:27.312517   365   365 D tkcore-teec: load_ta: loading...
01-10 13:51:27.312517   365   365 D tkcore-teec: 
01-10 13:51:27.312732   365   365 D tkcore-teec: Attempt to load /vendor/app/t6/9ef77781-7bd5-4e39-965f20f6f211f46b.ta
01-10 13:51:27.313000   365   365 I chatty  : uid=1000(system) /vendor/bin/teed identical 2 lines
01-10 13:51:27.315448   361   361 D AEE_AED : $===AEE===AEE===AEE===$
01-10 13:51:27.315520   361   361 D AEE_AED : p 0 poll events 1 revents 1
01-10 13:51:27.315589   361   361 D AEE_AED : requesting from: pid=360 cmd=9
01-10 13:51:27.315601   361   361 D AEE_AED : Go RTT_AEE_GET_EXCEPTION_RUNNING
01-10 13:51:27.315743   360   360 D AEE_AED : Rtt send 64 req done
01-10 13:51:27.315861   360   360 E AEE_AED : Can't remove file /data/aee_exp/temp: No such file or directory
01-10 13:51:27.317000   365   365 W teed    : type=1400 audit(0.0:25): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.317609   365   365 D tkcore-teec: load_ta() OK!!!
01-10 13:51:27.317609   365   365 D tkcore-teec: 
01-10 13:51:27.317916   364   364 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 13:51:27.317986   364   364 D AEE_AEDV: p 0 poll events 1 revents 1
01-10 13:51:27.318066   364   364 D AEE_AEDV: requesting from: pid=363 cmd=9
01-10 13:51:27.318086   364   364 D AEE_AEDV: Go RTT_AEE_GET_EXCEPTION_RUNNING
01-10 13:51:27.318205   363   363 D AEE_AEDV: Rtt send 64 req done
01-10 13:51:27.318300   363   363 E AEE_AEDV: Can't remove file /data/vendor/mtklog/aee_exp/temp: No such file or directory
01-10 13:51:27.318437   363   363 E AEE_AEDV: Can't remove file /sdcard/mtklog/aee_exp/temp: No such file or directory
01-10 13:51:27.318472   363   363 E AEE_AEDV: Can't remove file /storage/ext_sd/mtklog/aee_exp/temp: No such file or directory
01-10 13:51:27.318499   365   365 D tkcore-teec: load_ta() done, res: 0x0
01-10 13:51:27.318499   365   365 D tkcore-teec: 
01-10 13:51:27.319614   363   363 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 13:51:27.319677   363   363 D AEE_AEDV: p 5 poll events 1 revents 1
01-10 13:51:27.319908   363   363 D AEE_AEDV: PPM cpu cores:8, online:8
01-10 13:51:27.320367   363   363 D AEE_AEDV: aed_main_fork_worker: generator 0xf3d155f0, worker 0xffb6e1f8, recv_fd 0
01-10 13:51:27.321222   376   376 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 13:51:27.321285   376   376 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 13:51:27.321303   376   376 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 13:51:27.322075   376   376 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 13:51:27.322235   376   376 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 13:51:27.325140   376   376 W AEE_AEDV: ipanic heahder: magic:0, version:0, size:0, datas:0
01-10 13:51:27.325170   376   376 W AEE_AEDV: ipanic heahder: dhblk:0, blksize:0, partsize:0, bufsize:0
01-10 13:51:27.328031   376   376 W AEE_AEDV: aed_reboot_session, no valid ipanic header, ignored
01-10 13:51:27.328118   376   376 V ETM     : open etb_get_nr fail! , default etb_nr is 1 , (2, No such file or directory)
01-10 13:51:27.328207   376   376 V ETM     : open etb_length fail! (2, No such file or directory)
01-10 13:51:27.328233   376   376 V ETM     : open etb_length fail! (2, No such file or directory)
01-10 13:51:27.328932   376   376 I AEE_AEDV: wdt_status = 2, fiq_step=0, exception_type:0 
01-10 13:51:27.329073   376   376 I AEE_AEDV: powerup reason:wdt_by_pass_pwk
01-10 13:51:27.329073   376   376 I AEE_AEDV: 
01-10 13:51:27.329097   376   376 I AEE_AEDV: reboot_reason = 0
01-10 13:51:27.329331   376   376 E         : mrdump_support_user_load: null mrdump lk version
01-10 13:51:27.329391   376   376 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 13:51:27.329458   376   376 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 13:51:27.329475   376   376 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 13:51:27.330041   376   376 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 13:51:27.330107   376   376 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 13:51:27.334467   376   376 D AEE_AEDV: version(aabbccdd)
01-10 13:51:27.335557   363   363 D AEE_AEDV: clear ppm settings
01-10 13:51:27.336259   363   363 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 13:51:27.343777   375   375 I /system/bin/tzdatacheck: timezone distro dir /data/misc/zoneinfo/current does not exist. No action required.
01-10 13:51:27.359285   366   366 I KeymasterHAL: module.cpp:2130: Open session successfully
01-10 13:51:27.359544   366   366 D KeymasterHAL: module.cpp:1838: Forwarding configure
01-10 13:51:27.359577   366   366 D KeymasterHAL: module.cpp:241: Invoke cmdId 25 at vendor/mediatek/proprietary/trustzone/trustkernel/source/external/AndroidServices/keymaster_v2/module.cpp:1847
01-10 13:51:27.363503   366   366 I ServiceManagement: Removing namespace from process name android.hardware.keymaster@3.0-service to keymaster@3.0-s.
01-10 13:51:27.364868   366   366 I android.hardware.keymaster@3.0-service: Registration complete for android.hardware.keymaster@3.0::IKeymasterDevice/default.
01-10 13:51:27.503879   378   378 I ServiceManagement: Removing namespace from process name android.hidl.allocator@1.0-service to allocator@1.0-s.
01-10 13:51:27.545245   381   381 I ServiceManagement: Removing namespace from process name android.hardware.bluetooth@1.0-service-mediatek to bluetooth@1.0-s.
01-10 13:51:27.548197   381   381 I android.hardware.bluetooth@1.0-service-mediatek: Registration complete for android.hardware.bluetooth@1.0::IBluetoothHci/default.
01-10 13:51:27.559201   382   382 I ServiceManagement: Removing namespace from process name android.hardware.broadcastradio@1.1-service to broadcastradio@.
01-10 13:51:27.560249   410   410 I wmt_loader: Can't open device node(/dev/wmtdetect) count(1)
01-10 13:51:27.564200   390   390 E         : light_open lights bluetooth failed: -22
01-10 13:51:27.564312   390   390 E         : Light passthrough failed to load legacy HAL.
01-10 13:51:27.564637   390   390 E         : light_open lights wifi failed: -22
01-10 13:51:27.564676   390   390 E         : Light passthrough failed to load legacy HAL.
01-10 13:51:27.565704   390   390 I ServiceManagement: Removing namespace from process name android.hardware.light@2.0-service-mediatek to light@2.0-servi.
01-10 13:51:27.575606   379   379 I         : [VT][SRV]before VTService_HiDL_instantiate
01-10 13:51:27.579640   390   390 I android.hardware.light@2.0-service-mediatek: Registration complete for android.hardware.light@2.0::ILight/default.
01-10 13:51:27.582677   393   393 I ServiceManagement: Removing namespace from process name android.hardware.vibrator@1.0-service to vibrator@1.0-se.
01-10 13:51:27.610629   393   393 I android.hardware.vibrator@1.0-service: Registration complete for android.hardware.vibrator@1.0::IVibrator/default.
01-10 13:51:27.611296   391   391 I ServiceManagement: Removing namespace from process name android.hardware.memtrack@1.0-service to memtrack@1.0-se.
01-10 13:51:27.613000   365   365 W teed    : type=1400 audit(0.0:26): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.613000   365   365 I chatty  : uid=1000(system) /vendor/bin/teed identical 2 lines
01-10 13:51:27.614095   387   387 I GatekeeperHAL: Init device
01-10 13:51:27.617000   365   365 W teed    : type=1400 audit(0.0:29): avc: denied { write } for name="/" dev="tmpfs" ino=10342 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:27.625916   405   405 E ccci_fsd(0): md_fsd Ver:v2.2, CCCI Ver:6
01-10 13:51:27.626953   391   391 I android.hardware.memtrack@1.0-service: Registration complete for android.hardware.memtrack@1.0::IMemtrack/default.
01-10 13:51:27.630314   396   396 E MtkCodecService: MtkCodecService service create
01-10 13:51:27.631705   411   411 I wmt_launcher: get property(service.wcn.driver.ready) is no
01-10 13:51:27.632242   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: allowing syscall: connect
01-10 13:51:27.632362   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: allowing syscall: fcntl
01-10 13:51:27.632408   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: allowing syscall: sendto
01-10 13:51:27.632449   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: allowing syscall: socket
01-10 13:51:27.632485   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: allowing syscall: writev
01-10 13:51:27.632851   379   379 I         : Registration complete for vendor.mediatek.hardware.videotelephony@1.0::IVideoTelephony/default.
01-10 13:51:27.633183   406   406 I ccci_mdinit: (1):md_init ver:2.20, sub:0
01-10 13:51:27.633380   392   392 I ServiceManagement: Removing namespace from process name android.hardware.thermal@1.0-service to thermal@1.0-ser.
01-10 13:51:27.637042   384   384 W /vendor/bin/hw/android.hardware.configstore@1.0-service: libminijail[384]: logging seccomp filter failures
01-10 13:51:27.637795   384   384 I ServiceManagement: Removing namespace from process name android.hardware.configstore@1.0-service to configstore@1.0.
01-10 13:51:27.639391   396   396 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.mtkcodecservice@1.1-service to mtkcodecservice.
01-10 13:51:27.642792   404   404 E ccci_fsd(0): md_fsd Ver:v2.2, CCCI Ver:6
01-10 13:51:27.645156   400   400 I lowmemorykiller: running re-execed
01-10 13:51:27.645651   400   400 I lowmemorykiller: Using in-kernel low memory killer interface
01-10 13:51:27.647215   392   392 I android.hardware.thermal@1.0-service: Registration complete for android.hardware.thermal@1.0::IThermal/default.
01-10 13:51:27.651629   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.health@1.0::IHealth/default in either framework or device manifest.
01-10 13:51:27.654413   387   387 I GatekeeperHAL: Open session successfully
01-10 13:51:27.657408   395   395 I DynamicFpsPolicy: try to new 1 refresh ranges
01-10 13:51:27.658157   397   414 I vendor.mediatek.hardware.power@1.1-service: mtkPowerService - data:0x0
01-10 13:51:27.659660   395   415 I DynamicFpsPolicy: oldRequest: fps[0] mode[0] --> newRequest: fps[-1] mode[0] num[r:0|rs:0]
01-10 13:51:27.659738   395   415 I DynamicFpsPolicy: oldRequest: fps[-1] mode[0] --> newRequest: fps[-1] mode[0] num[r:0|rs:0]
01-10 13:51:27.662676   396   396 I vendor.mediatek.hardware.mtkcodecservice@1.0-service: Registration complete for vendor.mediatek.hardware.mtkcodecservice@1.1::IMtkCodecService/default.
01-10 13:51:27.663348   387   387 I ServiceManagement: Removing namespace from process name android.hardware.gatekeeper@1.0-service to gatekeeper@1.0-.
01-10 13:51:27.663560   395   395 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.dfps@1.0-service to dfps@1.0-servic.
01-10 13:51:27.669208   397   413 I libPerfService: perfservice ver:V7.0
01-10 13:51:27.670500   387   387 I android.hardware.gatekeeper@1.0-service: Registration complete for android.hardware.gatekeeper@1.0::IGatekeeper/default.
01-10 13:51:27.671668   395   395 I vendor.mediatek.hardware.dfps@1.0-service: Registration complete for vendor.mediatek.hardware.dfps@1.0::IFpsPolicyService/default.
01-10 13:51:27.672698   398   398 I vendor.nxp.nxpnfc@1.0-service: Registration complete for android.hardware.nfc@1.0::INfc/default.
01-10 13:51:27.676234   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.thermal@1.1::IThermal/default in either framework or device manifest.
01-10 13:51:27.679726   398   398 E         : HIDL_FETCH_INxpNfc
01-10 13:51:27.681726   397   413 I libPerfService: checkDrvSupport hps failed: No such file or directory
01-10 13:51:27.681881   397   413 I libPerfService: checkDrvSupport cpufreq failed: No such file or directory
01-10 13:51:27.682166   397   413 I libPerfService: checkDrvSupport - perfmgr:1, ppm:1, ppmAll:1, acao:1, hmp:1, hps:0, hevc:0, fliper:0, sysfs:1, dvfs:1, turbo:1, fstb:1
01-10 13:51:27.682384   397   413 I libPerfService: getCputopoInfo - cpuNum:8, cluster:2, cputopoCluster:2
01-10 13:51:27.682645   397   413 I libPerfService: [cluster 0]: cpu:4, first:0, freq count:16, max_freq:1508000
01-10 13:51:27.682680   397   413 I libPerfService:   0: 338000
01-10 13:51:27.682688   397   413 I libPerfService:   1: 481000
01-10 13:51:27.682694   397   413 I libPerfService:   2: 624000
01-10 13:51:27.682701   397   413 I libPerfService:   3: 715000
01-10 13:51:27.682707   397   413 I libPerfService:   4: 793000
01-10 13:51:27.682714   397   413 I libPerfService:   5: 884000
01-10 13:51:27.682720   397   413 I libPerfService:   6: 1001000
01-10 13:51:27.682728   397   413 I libPerfService:   7: 1105000
01-10 13:51:27.682734   397   413 I libPerfService:   8: 1183000
01-10 13:51:27.682740   397   413 I libPerfService:   9: 1235000
01-10 13:51:27.682746   397   413 I libPerfService:   10: 1300000
01-10 13:51:27.682751   397   413 I libPerfService:   11: 1365000
01-10 13:51:27.682757   397   413 I libPerfService:   12: 1404000
01-10 13:51:27.682764   397   413 I libPerfService:   13: 1430000
01-10 13:51:27.682770   397   413 I libPerfService:   14: 1482000
01-10 13:51:27.682776   397   413 I libPerfService:   15: 1508000
01-10 13:51:27.682878   397   413 I libPerfService: [cluster 1]: cpu:4, first:4, freq count:16, max_freq:2002000
01-10 13:51:27.682904   397   413 I libPerfService:   0: 520000
01-10 13:51:27.682911   397   413 I libPerfService:   1: 715000
01-10 13:51:27.682917   397   413 I libPerfService:   2: 910000
01-10 13:51:27.682924   397   413 I libPerfService:   3: 1040000
01-10 13:51:27.682929   397   413 I libPerfService:   4: 1170000
01-10 13:51:27.682935   397   413 I libPerfService:   5: 1287000
01-10 13:51:27.682941   397   413 I libPerfService:   6: 1456000
01-10 13:51:27.682946   397   413 I libPerfService:   7: 1586000
01-10 13:51:27.682952   397   413 I libPerfService:   8: 1690000
01-10 13:51:27.682957   397   413 I libPerfService:   9: 1742000
01-10 13:51:27.682963   397   413 I libPerfService:   10: 1807000
01-10 13:51:27.682968   397   413 I libPerfService:   11: 1859000
01-10 13:51:27.682974   397   413 I libPerfService:   12: 1911000
01-10 13:51:27.682979   397   413 I libPerfService:   13: 1937000
01-10 13:51:27.682985   397   413 I libPerfService:   14: 1976000
01-10 13:51:27.682990   397   413 I libPerfService:   15: 2002000
01-10 13:51:27.683045   397   413 E libPerfService: Could not open '/sys/kernel/debug/fpsgo/fstb/fstb_soft_level'
01-10 13:51:27.683855   397   413 E libPerfService: error : 2, No such file or directory
01-10 13:51:27.683906   397   413 I libPerfService: pFstbDefaultFps:1 60-26 
01-10 13:51:27.684046   397   413 I libPerfService: nGpuFreqCount:2
01-10 13:51:27.685845   398   398 I ServiceManagement: Removing namespace from process name vendor.nxp.nxpnfc@1.0-service to nxpnfc@1.0-serv.
01-10 13:51:27.686870   398   398 I vendor.nxp.nxpnfc@1.0-service: Registration complete for vendor.nxp.nxpnfc@1.0::INxpNfc/default.
01-10 13:51:27.686926   397   413 E libPerfService: No GiFT Tags
01-10 13:51:27.686966   397   413 I libPerfService: [init] nXmlPackNum:12 nXmlActivityNum:12 nXmlCmdNum:15 nXmlGiftTagNum:0 nXmlGiftAttrNum:0
01-10 13:51:27.687136   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:0 cmd:CMD_SET_CLUSTER_CPU_CORE_MIN pack:com.imangi.templerun2, activity:Common0 p1:0 p2:3 p3:0 p4:0
01-10 13:51:27.687179   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:1 cmd:CMD_SET_SPORTS_MODE pack:com.andromeda.androbench2, activity:Common1 p1:1 p2:0 p3:0 p4:0
01-10 13:51:27.687209   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:2 cmd:CMD_SET_SPORTS_MODE pack:com.futuremark.pcmark.android.benchmark, activity:Common2 p1:1 p2:0 p3:0 p4:0
01-10 13:51:27.687229   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:3 cmd:CMD_SET_SPORTS_MODE pack:com.antutu.ABenchMark, activity:Common3 p1:1 p2:0 p3:0 p4:0
01-10 13:51:27.687257   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:4 cmd:CMD_SET_SPORTS_MODE pack:com.antutu.benchmark.full, activity:Common4 p1:1 p2:0 p3:0 p4:0
01-10 13:51:27.687290   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:5 cmd:CMD_SET_SPORTS_MODE pack:com.primatelabs.geekbench, activity:Common5 p1:1 p2:0 p3:0 p4:0
01-10 13:51:27.687317   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:6 cmd:CMD_SET_SPORTS_MODE pack:com.aurorasoftworks.quadrant.ui.professional, activity:Common6 p1:1 p2:0 p3:0 p4:0
01-10 13:51:27.687343   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:7 cmd:CMD_SET_SPORTS_MODE pack:com.aurorasoftworks.quadrant.ui.advanced, activity:Common7 p1:1 p2:0 p3:0 p4:0
01-10 13:51:27.687372   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:8 cmd:CMD_SET_PACK_BOOST_TIMEOUT pack:com.tencent.tmgp.sgame, activity:Common8 p1:25 p2:0 p3:0 p4:0
01-10 13:51:27.687389   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:9 cmd:CMD_SET_FSTB_FPS pack:com.tencent.tmgp.sgame, activity:Common8 p1:60 p2:30 p3:0 p4:0
01-10 13:51:27.687406   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:10 cmd:CMD_SET_FBT_FLOOR_BOUND pack:com.tencent.tmgp.sgame, activity:Common8 p1:1 p2:0 p3:0 p4:0
01-10 13:51:27.687430   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:11 cmd:CMD_SET_FBT_KMIN pack:com.tencent.tmgp.sgame, activity:Common8 p1:10 p2:0 p3:0 p4:0
01-10 13:51:27.687456   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:12 cmd:CMD_SET_FSTB_FPS pack:com.gameloft.android.ANMP.GloftA8HM, activity:Common9 p1:30 p2:30 p3:0 p4:0
01-10 13:51:27.687483   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:13 cmd:CMD_SET_FSTB_FPS pack:com.happyelements.AndroidAnimal.qq, activity:Common10 p1:50 p2:26 p3:0 p4:0
01-10 13:51:27.687505   397   413 I libPerfService: [xmlparser_start] XMLPARSE_GET_ACTIVITYLIST CmdIndex:14 cmd:CMD_SET_FSTB_FPS pack:com.happyelements.AndroidAnimal, activity:Common11 p1:50 p2:26 p3:0 p4:0
01-10 13:51:27.687571   397   413 I libPerfService: [get_activity_totalnum]  total ture activity num :12
01-10 13:51:27.687589   397   413 I libPerfService: [init] nPackNum:12
01-10 13:51:27.688311   383   383 I ServiceManagement: Removing namespace from process name android.hardware.cas@1.0-service to cas@1.0-service.
01-10 13:51:27.690086   397   413 I libPerfService: CMD_SET_PPM_ROOT_CLUSTER doesn't have write permission!!!!
01-10 13:51:27.690152   397   413 I libPerfService: write of /proc/ppm/root_cluster failed: No such file or directory
01-10 13:51:27.690201   397   413 E libPerfService: Could not open '/proc/ppm/root_cluster'
01-10 13:51:27.690213   397   413 E libPerfService: error : 2, No such file or directory
01-10 13:51:27.690236   397   413 I libPerfService: CMD_SET_HPS_UP_THRESHOLD doesn't have write permission!!!!
01-10 13:51:27.690245   397   413 I libPerfService: write of /proc/hps/up_threshold failed: No such file or directory
01-10 13:51:27.690264   397   413 I libPerfService: CMD_SET_HPS_DOWN_THRESHOLD doesn't have write permission!!!!
01-10 13:51:27.690272   397   413 I libPerfService: write of /proc/hps/down_threshold failed: No such file or directory
01-10 13:51:27.690327   397   413 I libPerfService: CMD_SET_VCORE_BW_THRES doesn't have write permission!!!!
01-10 13:51:27.690347   397   413 I libPerfService: write of /proc/fliperfs/cg_threshold failed: No such file or directory
01-10 13:51:27.690385   397   413 I libPerfService: CMD_SET_VCORE_BW_ENABLED doesn't have write permission!!!!
01-10 13:51:27.690403   397   413 I libPerfService: write of /proc/fliperfs/cg_enable failed: No such file or directory
01-10 13:51:27.690620   397   413 I libPerfService: CMD_SET_HPS_RBOOST_THRESH doesn't have write permission!!!!
01-10 13:51:27.690643   397   413 I libPerfService: write of /proc/hps/rush_boost_threshold failed: No such file or directory
01-10 13:51:27.690716   397   413 I libPerfService: CMD_SET_PPM_HOLD_TIME_LL_ONLY doesn't have write permission!!!!
01-10 13:51:27.690732   397   413 I libPerfService: write of /proc/ppm/policy/hica_settings/LL_ONLY_to_ALL/capacity_hold_time failed: No such file or directory
01-10 13:51:27.691558   397   413 E libPerfService: Could not open '/proc/perfmgr/smart/native_is_running'
01-10 13:51:27.691613   397   413 E libPerfService: error : 2, No such file or directory
01-10 13:51:27.691646   397   413 E libPerfService: Could not open '/proc/perfmgr/smart/hps_check_duration'
01-10 13:51:27.691655   397   413 E libPerfService: error : 2, No such file or directory
01-10 13:51:27.691709   397   413 I libPerfService: [updateScnListfromXML] new activity from perf_app, num:0
01-10 13:51:27.692230   397   413 I libPerfService: [updateScnListfromXML] new activity from perf_app and whiteList, num:12
01-10 13:51:27.692809   402   402 W thermalserviced: Unable to get Thermal HAL V1.1, vendor thermal event notification not available
01-10 13:51:27.693150   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:12, param_1:0, param_2:4
01-10 13:51:27.693205   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:12, param_1:0, param_2:3000000
01-10 13:51:27.693221   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:12, param_1:1, param_2:4
01-10 13:51:27.693234   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:12, param_1:1, param_2:3000000
01-10 13:51:27.693247   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:12, param_1:1100, param_2:3000000
01-10 13:51:27.693270   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:11, param_1:0, param_2:4
01-10 13:51:27.693284   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:11, param_1:0, param_2:3000000
01-10 13:51:27.693296   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:11, param_1:1, param_2:4
01-10 13:51:27.693308   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:11, param_1:1, param_2:3000000
01-10 13:51:27.693320   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:11, param_1:1, param_2:3000000
01-10 13:51:27.693349   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:11, param_1:0, param_2:3000000
01-10 13:51:27.693364   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:11, param_1:1100, param_2:3000000
01-10 13:51:27.693380   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:8, param_1:0, param_2:4
01-10 13:51:27.693393   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:8, param_1:0, param_2:3000000
01-10 13:51:27.693405   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:8, param_1:1, param_2:4
01-10 13:51:27.693468   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:8, param_1:1, param_2:3000000
01-10 13:51:27.693484   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:8, param_1:1, param_2:3000000
01-10 13:51:27.693501   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:8, param_1:0, param_2:3000000
01-10 13:51:27.693524   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:8, param_1:1100, param_2:3000000
01-10 13:51:27.693543   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_FPSGO_ENABLE, scn:8, param_1:0, param_2:3000000
01-10 13:51:27.693561   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:10, param_1:0, param_2:4
01-10 13:51:27.693587   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:10, param_1:0, param_2:3000000
01-10 13:51:27.693603   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:10, param_1:1, param_2:4
01-10 13:51:27.693620   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:10, param_1:1, param_2:3000000
01-10 13:51:27.693634   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:10, param_1:1, param_2:3000000
01-10 13:51:27.693648   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:10, param_1:0, param_2:3000000
01-10 13:51:27.693663   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:10, param_1:1100, param_2:3000000
01-10 13:51:27.693677   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:14, param_1:0, param_2:4
01-10 13:51:27.693700   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:14, param_1:0, param_2:3000000
01-10 13:51:27.693714   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:14, param_1:1, param_2:4
01-10 13:51:27.693726   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:14, param_1:1, param_2:3000000
01-10 13:51:27.693738   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:14, param_1:1, param_2:3000000
01-10 13:51:27.693752   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:14, param_1:0, param_2:3000000
01-10 13:51:27.693776   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:14, param_1:1100, param_2:3000000
01-10 13:51:27.693791   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:13, param_1:0, param_2:4
01-10 13:51:27.693803   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:13, param_1:0, param_2:3000000
01-10 13:51:27.693815   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_CORE_MIN, scn:13, param_1:1, param_2:4
01-10 13:51:27.693836   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CLUSTER_CPU_FREQ_MIN, scn:13, param_1:1, param_2:3000000
01-10 13:51:27.693847   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN, scn:13, param_1:1, param_2:3000000
01-10 13:51:27.693862   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_VCORE_MIN_DDR3, scn:13, param_1:0, param_2:3000000
01-10 13:51:27.693877   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_TA_BOOST_VALUE, scn:13, param_1:1100, param_2:3000000
01-10 13:51:27.693903   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_FPSGO_ENABLE, scn:13, param_1:0, param_2:3000000
01-10 13:51:27.693935   397   413 I libPerfService: [updateCusScnTable] cmd:CMD_SET_CPU_PERF_MODE, scn:18, param_1:1, param_2:3000000
01-10 13:51:27.701173   406   406 I ccci_mdinit: (1):[init.svc.gsm0710muxd][init.svc.ril-daemon-mtk][init.svc.emdlogger1][init.svc.ccci_fsd]
01-10 13:51:27.706504   386   386 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service.widevine to drm@1.0-service.
01-10 13:51:27.711615   386   386 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service.widevine to drm@1.0-service.
01-10 13:51:27.712179   388   388 I ServiceManagement: Removing namespace from process name android.hardware.graphics.allocator@2.0-service to allocator@2.0-s.
01-10 13:51:27.715847   388   388 I android.hardware.graphics.allocator@2.0-service: Registration complete for android.hardware.graphics.allocator@2.0::IAllocator/default.
01-10 13:51:27.724716   397   413 I libPerfService: [init] nFbcSupport:1
01-10 13:51:27.724857   397   413 I libPerfService: [init] nThmSupport:1
01-10 13:51:27.724953   397   413 I powerd  : [powerd_core_pre_init] gtCusHintTbl[0]:36
01-10 13:51:27.725000   397   413 I powerd  : [powerd_core_pre_init] gtCusHintTbl[1]:37
01-10 13:51:27.725029   397   413 I powerd  : [powerd_core_pre_init] gtCusHintTbl[2]:38
01-10 13:51:27.725046   397   413 I powerd  : [powerd_core_pre_init] i:12, j:0, walt scn:-1, t:-1, ud:0
01-10 13:51:27.725057   397   413 I powerd  : [powerd_core_pre_init] i:14, j:0, walt scn:-1, t:-1, ud:0
01-10 13:51:27.725067   397   413 I powerd  : [powerd_core_pre_init] i:16, j:0, walt scn:-1, t:-1, ud:0
01-10 13:51:27.725076   397   413 I powerd  : [powerd_core_pre_init] pboost_timeout: 0
01-10 13:51:27.725126   397   413 I vendor.mediatek.hardware.power@1.1-impl: mtkPowerManager - data:0x0
01-10 13:51:27.733012   397   414 I MTKPowerHAL: power_open: enter; name=power
01-10 13:51:27.733161   397   414 I MTKPowerHAL: power_init
01-10 13:51:27.734249   397   414 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.power@1.1-service to power@1.1-servi.
01-10 13:51:27.744675   397   414 I vendor.mediatek.hardware.power@1.1-service: Registration complete for vendor.mediatek.hardware.power@1.1::IPower/default.
01-10 13:51:27.778149   385   385 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service to drm@1.0-service.
01-10 13:51:27.779559   385   385 I android.hardware.drm@1.0-service: Registration complete for android.hardware.drm@1.0::IDrmFactory/default.
01-10 13:51:27.782568   385   385 I ServiceManagement: Removing namespace from process name android.hardware.drm@1.0-service to drm@1.0-service.
01-10 13:51:27.783603   385   385 I android.hardware.drm@1.0-service: Registration complete for android.hardware.drm@1.0::ICryptoFactory/default.
01-10 13:51:27.789389   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::maxFrameBufferAcquiredBuffers retrieved: 3
01-10 13:51:27.792443   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::startGraphicsAllocatorService retrieved: 0
01-10 13:51:27.797608   401   401 I SurfaceFlinger: SurfaceFlinger is starting
01-10 13:51:27.798064   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::vsyncEventPhaseOffsetNs retrieved: 8300000
01-10 13:51:27.798246   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::vsyncSfEventPhaseOffsetNs retrieved: 8300000
01-10 13:51:27.798375   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasSyncFramework retrieved: 1
01-10 13:51:27.798490   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::useContextPriority retrieved: 0 (default)
01-10 13:51:27.798605   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::presentTimeOffsetFromVSyncNs retrieved: 0
01-10 13:51:27.798719   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::useHwcForRGBtoYUV retrieved: 1
01-10 13:51:27.798831   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::maxVirtualDisplaySize retrieved: 0 (default)
01-10 13:51:27.798942   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::useVrFlinger retrieved: 0 (default)
01-10 13:51:27.798979   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::maxFrameBufferAcquiredBuffers retrieved: 3
01-10 13:51:27.799084   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 13:51:27.817805   401   401 E DynamicFpsPolicy: FpsVsync link done
01-10 13:51:27.818514   395   395 I DynamicFpsPolicy: registerCallback: registerrr cb:1  target:1
01-10 13:51:27.818762   401   401 I SurfaceFlinger: FD resource: cur[4096]  max[4096]
01-10 13:51:27.818872   401   401 I SurfaceFlinger: Disabling backpressure propagation
01-10 13:51:27.818910   401   401 I SurfaceFlinger: Disabling Triple Buffering
01-10 13:51:27.824445   380   380 I ServiceManagement: Removing namespace from process name android.hardware.audio@2.0-service-mediatek to audio@2.0-servi.
01-10 13:51:27.825755   380   380 I mtkaudiohalservice: Registration complete for android.hardware.audio@2.0::IDevicesFactory/default.
01-10 13:51:27.826831   401   401 I SurfaceFlinger: SurfaceFlinger's main thread ready to run. Initializing graphics H/W...
01-10 13:51:27.826904   401   401 I SurfaceFlinger: Phase offest NS: 8300000
01-10 13:51:27.847703   389   389 I hwcomposer: [HWC] FD resource: cur[4096]  max[4096]
01-10 13:51:27.847703   389   389 I hwcomposer:   
01-10 13:51:27.849544   389   389 I ServiceManagement: Removing namespace from process name android.hardware.graphics.composer@2.1-service to composer@2.1-se.
01-10 13:51:27.850974   389   389 I android.hardware.graphics.composer@2.1-service: Registration complete for android.hardware.graphics.composer@2.1::IComposer/default.
01-10 13:51:27.858232   380   380 I mtkaudiohalservice: Registration complete for android.hardware.audio.effect@2.0::IEffectsFactory/default.
01-10 13:51:27.858885   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.soundtrigger@2.0::ISoundTriggerHw/default in either framework or device manifest.
01-10 13:51:27.860385   380   380 E mtkaudiohalservice: Could not get passthrough implementation for android.hardware.soundtrigger@2.0::ISoundTriggerHw/default.
01-10 13:51:27.860497   380   380 E mtkaudiohalservice: Error while registering soundtrigger service: 1
01-10 13:51:27.860737   410   410 I wmt_loader: chip id from property:-1
01-10 13:51:27.932079   411   411 I wmt_launcher: get property(service.wcn.driver.ready) is no
01-10 13:51:27.983818   412   412 I STATUSD : 2606:main(): ignore
01-10 13:51:28.094433   401   401 I /system/bin/surfaceflinger: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 13:51:28.095404   401   401 I SurfaceFlinger: EventThread Client Pid (401) created
01-10 13:51:28.098766   401   401 I SurfaceFlinger: EGL information:
01-10 13:51:28.098871   401   401 I SurfaceFlinger: vendor    : Android
01-10 13:51:28.098881   401   401 I SurfaceFlinger: version   : 1.4 Android META-EGL
01-10 13:51:28.098895   401   401 I SurfaceFlinger: extensions: EGL_KHR_get_all_proc_addresses EGL_ANDROID_presentation_time EGL_KHR_swap_buffers_with_damage EGL_ANDROID_get_native_client_buffer EGL_ANDROID_front_buffer_auto_refresh EGL_ANDROID_get_frame_timestamps EGL_KHR_image EGL_KHR_image_base EGL_KHR_gl_colorspace EGL_KHR_gl_texture_2D_image EGL_KHR_gl_texture_cubemap_image EGL_KHR_gl_renderbuffer_image EGL_KHR_fence_sync EGL_KHR_create_context EGL_KHR_config_attribs EGL_KHR_surfaceless_context EGL_EXT_create_context_robustness EGL_ANDROID_image_native_buffer EGL_KHR_wait_sync EGL_ANDROID_recordable EGL_KHR_partial_update EGL_KHR_mutable_render_buffer EGL_IMG_context_priority EGL_KHR_no_config_context 
01-10 13:51:28.098904   401   401 I SurfaceFlinger: Client API: OpenGL_ES
01-10 13:51:28.098913   401   401 I SurfaceFlinger: EGLSurface: 8-8-8-8, config=0x7300dc3008
01-10 13:51:28.100421   401   401 I SurfaceFlinger: OpenGL ES informations:
01-10 13:51:28.100495   401   401 I SurfaceFlinger: vendor    : ARM
01-10 13:51:28.100503   401   401 I SurfaceFlinger: renderer  : Mali-G71
01-10 13:51:28.100511   401   401 I SurfaceFlinger: version   : OpenGL ES 3.2 v1.r9p0-01rel0.83a3bc72fddd1868f17b698165c9be5c
01-10 13:51:28.100519   401   401 I SurfaceFlinger: extensions: GL_EXT_debug_marker GL_ARM_rgba8 GL_ARM_mali_shader_binary GL_OES_depth24 GL_OES_depth_texture GL_OES_depth_texture_cube_map GL_OES_packed_depth_stencil GL_OES_rgb8_rgba8 GL_EXT_read_format_bgra GL_OES_compressed_paletted_texture GL_OES_compressed_ETC1_RGB8_texture GL_OES_standard_derivatives GL_OES_EGL_image GL_OES_EGL_image_external GL_OES_EGL_image_external_essl3 GL_OES_EGL_sync GL_OES_texture_npot GL_OES_vertex_half_float GL_OES_required_internalformat GL_OES_vertex_array_object GL_OES_mapbuffer GL_EXT_texture_format_BGRA8888 GL_EXT_texture_rg GL_EXT_texture_type_2_10_10_10_REV GL_OES_fbo_render_mipmap GL_OES_element_index_uint GL_EXT_shadow_samplers GL_OES_texture_compression_astc GL_KHR_texture_compression_astc_ldr GL_KHR_texture_compression_astc_hdr GL_KHR_texture_compression_astc_sliced_3d GL_KHR_debug GL_EXT_occlusion_query_boolean GL_EXT_disjoint_timer_query GL_EXT_blend_minmax GL_EXT_discard_framebuffer GL_OES_get_program_binary GL_OES_texture_3D GL_EXT_texture_storage GL_EXT_multisamp
01-10 13:51:28.100528   401   401 I SurfaceFlinger: GL_MAX_TEXTURE_SIZE = 16384
01-10 13:51:28.100540   401   401 I SurfaceFlinger: GL_MAX_VIEWPORT_DIMS = 16384
01-10 13:51:28.110589   389   389 W hwcomposer: [EVENT] Start to listen uevent, addr.nl_pid(389)  
01-10 13:51:28.110731   389   389 W hwcomposer: [HWC] Register hotplug callback  
01-10 13:51:28.110765   389   389 W hwcomposer: [HWC] Register refresh callback  
01-10 13:51:28.110790   389   389 W hwcomposer: [HWC] Register vsync callback  
01-10 13:51:28.110841   389   389 I hwcomposer: [JOB] ui_mm_combined? 1  
01-10 13:51:28.111312   389   389 I hwcomposer: [DPY] get 0 density from drv, density calculated by physical dpi  
01-10 13:51:28.112246   389   389 W libc    : Unable to set property "ro.sf.lcd_density" to "300": error code: 0xb
01-10 13:51:28.112330   389   389 I hwcomposer: [DPY] setprop lcd_density 300  
01-10 13:51:28.112370   389   389 I hwcomposer: [DPY] fail to set ro.sf.lcd_density  
01-10 13:51:28.113898   389   389 E MDP     : DpAsyncBlitStream: unrecognizable user 0
01-10 13:51:28.114057   389   389 I hwcomposer: [DPY] Display Information:  
01-10 13:51:28.114099   389   389 I hwcomposer: [DPY] # fo current devices : 1  
01-10 13:51:28.114118   389   389 I hwcomposer: [DPY] ------------------------------------  
01-10 13:51:28.114137   389   389 I hwcomposer: [DPY] Device id   : 0  
01-10 13:51:28.114159   389   389 I hwcomposer: [DPY] Width       : 720  
01-10 13:51:28.114177   389   389 I hwcomposer: [DPY] Height      : 1280  
01-10 13:51:28.114209   389   389 I hwcomposer: [DPY] xdpi        : 294967.750000  
01-10 13:51:28.114245   389   389 I hwcomposer: [DPY] ydpi        : 295563.625000  
01-10 13:51:28.114263   389   389 I hwcomposer: [DPY] vsync       : 1  
01-10 13:51:28.114292   389   389 I hwcomposer: [DPY] refresh     : 18882175  
01-10 13:51:28.114315   389   389 I hwcomposer: [DPY] connected   : 1  
01-10 13:51:28.114339   389   389 I hwcomposer: [DPY] hwrotation  : 0  
01-10 13:51:28.114363   389   389 I hwcomposer: [DPY] subtype     : 0  
01-10 13:51:28.114400   389   389 I hwcomposer: [DPY] aspect      : 0.562, 1.778  
01-10 13:51:28.114428   389   389 I hwcomposer: [DPY] protrait    : [   0,   0, 720,1280]  
01-10 13:51:28.114455   389   389 I hwcomposer: [DPY] landscape   : [   0,   0, 720,1280]  
01-10 13:51:28.114480   389   389 I hwcomposer: [DPY] trigger_by_vsync: 0  
01-10 13:51:28.114504   389   389 I hwcomposer: [DPY] supportS3D  : 0  
01-10 13:51:28.114528   389   389 I hwcomposer: [DPY] density     : 320  
01-10 13:51:28.114560   389   389 I hwcomposer: [DPY] ro.sf.lcd_density : 320  
01-10 13:51:28.115483   401   401 I BufferQueue: [unnamed-401-0](this:0x72fc1fd000,id:0,api:0,p:-1,c:-1) BufferQueue core=(401:/system/bin/surfaceflinger)
01-10 13:51:28.126321   401   401 W GuiExt  : Cannot find GuiExtService
01-10 13:51:28.126607   401   401 E GED     : ged_gpu_timestamp: GED_ERROR_FAIL eErr = 0, 7
01-10 13:51:28.132116   401   401 I BufferQueueConsumer: [unnamed-401-0](this:0x72fc1fd000,id:0,api:0,p:-1,c:401) connect(C): consumer=(401:/system/bin/surfaceflinger) controlledByApp=false
01-10 13:51:28.132265   401   401 I BufferQueueConsumer: [unnamed-401-0](this:0x72fc1fd000,id:0,api:0,p:-1,c:401) setConsumerName: unnamed-401-0
01-10 13:51:28.132301   401   401 I BufferQueueConsumer: [FrameBufferSurface_0](this:0x72fc1fd000,id:0,api:0,p:-1,c:401) setConsumerName: FrameBufferSurface_0
01-10 13:51:28.132601   401   401 I BufferQueueConsumer: [FrameBufferSurface_0](this:0x72fc1fd000,id:0,api:0,p:-1,c:401) setDefaultBufferSize: width=720 height=1280
01-10 13:51:28.133084   401   401 I BufferQueueProducer: [FrameBufferSurface_0](this:0x72fc1fd000,id:0,api:1,p:401,c:401) connect(P): api=1 producer=(401:/system/bin/surfaceflinger) producerControlledByApp=false
01-10 13:51:28.173903   388   388 W gralloc : Failed to find GPU block configuration in libGLES_mali.so. Using static build configuration.
01-10 13:51:28.232487   411   411 I wmt_launcher: get property(service.wcn.driver.ready) is no
01-10 13:51:28.438172   410   410 I wmt_loader: external combo chip detected
01-10 13:51:28.440375   410   410 I wmt_loader: chipid (0x6630) detected
01-10 13:51:28.445654   410   410 I wmt_loader: set property(persist.mtk.wcn.combo.chipid) to 0x6630 succeed.
01-10 13:51:28.448200   410   410 I wmt_loader: do SDIO3.0 autok succeed
01-10 13:51:28.469172   410   410 I wmt_loader: external combo chip power off succeed
01-10 13:51:28.489266   410   410 I wmt_loader: do kernel module init succeed: 0
01-10 13:51:28.496950   410   410 I wmt_loader: set property(service.wcn.driver.ready) to yes succeed
01-10 13:51:28.532948   411   411 I wmt_launcher: get property(service.wcn.driver.ready) is yes
01-10 13:51:28.535250   411   411 I wmt_launcher: open device node succeed.(Node:/dev/stpwmt, fd:5) 
01-10 13:51:28.535422   411   411 I wmt_launcher: key:(persist.mtk.wcn.combo.chipid)-value:(0x6630),chip_id:0x6630
01-10 13:51:28.535436   411   411 I wmt_launcher: chip_id:0x6630
01-10 13:51:28.535492   411   411 I wmt_launcher: patch path:/vendor/firmware/
01-10 13:51:28.536755   411   411 I wmt_launcher: set chip_id(0x6630) to driver
01-10 13:51:28.538428   411   411 I wmt_launcher: Info:key:mt6620.defAnt value:mt6620_ant_m3.cfg
01-10 13:51:28.538509   411   411 I wmt_launcher: Info:key:mt6628.defAnt value:mt6628_ant_m1.cfg
01-10 13:51:28.538522   411   411 I wmt_launcher: Info:key:mt6630.defAnt value:mt6630_ant_m1.cfg
01-10 13:51:28.538534   411   411 I wmt_launcher: Info:key:mt6632.defAnt value:mt6632_ant_m1.cfg
01-10 13:51:28.538553   411   411 I wmt_launcher: NULL is returned, eighter EOF or error maybe found
01-10 13:51:28.538591   411   411 I wmt_launcher: close /system/vendor/firmware/WMT.cfg succeed
01-10 13:51:28.538605   411   411 I wmt_launcher: index:2, chip_id:0x6630
01-10 13:51:28.538622   411   411 I wmt_launcher: chip_id(0x6630), default Mode(4), strlen(g_wmt_cfg_name)(17), g_wmt_cfg_name(mt6630_ant_m1.cfg)
01-10 13:51:28.544818   411   411 I wmt_launcher: create pwr on thread ok
01-10 13:51:28.544845   411   479 I wmt_launcher: enter power on connsys flow
01-10 13:51:28.544985   411   411 I wmt_launcher: get property(service.wcn.formeta.ready) failed iRet:0 or property is 
01-10 13:51:28.583602   389   389 I hwcomposer: [HWC] Display(0) SetPowerMode(2)  
01-10 13:51:28.611951   401   482 I SurfaceFlinger: [checkEnableBootAnim] boot reason = ''
01-10 13:51:28.612219   401   482 I boot    : mBootAnimationEnabled = 1
01-10 13:51:28.613662   411   411 I wmt_launcher: set property(service.wcn.formeta.ready) to yes succeed
01-10 13:51:28.619932   401   482 I boot    : BOOTPROF:BootAnimation:Start:6810
01-10 13:51:28.646691   389   446 W hwcomposer: [JOB] (0) SET/bypass/no_visible_layers  
01-10 13:51:28.662679   401   487 E GED     : SF restart
01-10 13:51:29.151930   411   411 I wmt_launcher: patch name pre-fix:mt6630_patch
01-10 13:51:29.152015   411   411 I wmt_launcher: fw_version:0x8a11
01-10 13:51:29.152143   411   411 I wmt_launcher: /vendor/firmware//mt6630_patch_e3_0_hdr.bin
01-10 13:51:29.155448   411   411 I wmt_launcher: set property(persist.mtk.wcn.patch.version) to 20181019b001011 succeed.
01-10 13:51:29.155503   411   411 I wmt_launcher: fw Ver in patch: 0x8a11
01-10 13:51:29.155519   411   411 I wmt_launcher: read patch info:0x21,0x00,0x08,0x00
01-10 13:51:29.155529   411   411 I wmt_launcher: patch num = [2]
01-10 13:51:29.155547   411   411 I wmt_launcher: patch seq = [1]
01-10 13:51:29.155569   411   411 I wmt_launcher: /vendor/firmware//mt6630_patch_e3_1_hdr.bin
01-10 13:51:29.158442   411   411 I wmt_launcher: set property(persist.mtk.wcn.patch.version) to 20181019b001011 succeed.
01-10 13:51:29.158492   411   411 I wmt_launcher: fw Ver in patch: 0x8a11
01-10 13:51:29.158506   411   411 I wmt_launcher: read patch info:0x22,0x00,0x08,0x00
01-10 13:51:29.158516   411   411 I wmt_launcher: patch seq = [2]
01-10 13:51:29.158554   411   411 I wmt_launcher: cmd(srh_patch) resp(ok)
01-10 13:51:29.414356   401   421 I SurfaceFlinger: [SF client] NEW(0x7300829000) for (485:/system/bin/bootanimation)
01-10 13:51:29.419121   401   401 I BufferQueue: [unnamed-401-1](this:0x72f9c0e000,id:1,api:0,p:-1,c:-1) BufferQueue core=(401:/system/bin/surfaceflinger)
01-10 13:51:29.419518   401   401 W GuiExt  : Cannot find GuiExtService
01-10 13:51:29.419679   401   401 I BufferQueueConsumer: [unnamed-401-1](this:0x72f9c0e000,id:1,api:0,p:-1,c:401) connect(C): consumer=(401:/system/bin/surfaceflinger) controlledByApp=false
01-10 13:51:29.419747   401   401 I BufferQueueConsumer: [unnamed-401-1](this:0x72f9c0e000,id:1,api:0,p:-1,c:401) setConsumerName: unnamed-401-1
01-10 13:51:29.419791   401   401 I BufferQueueConsumer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:0,p:-1,c:401) setConsumerName: BootAnimation#0
01-10 13:51:29.419852   401   401 I BufferQueueConsumer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:0,p:-1,c:401) setDefaultBufferSize: width=720 height=1280
01-10 13:51:29.436927   389   446 W hwcomposer: [JOB] (0) SET/bypass/no_visible_layers  
01-10 13:51:29.523765   505   505 I /system/bin/tzdatacheck: timezone distro dir /data/misc/zoneinfo/current does not exist. No action required.
01-10 13:51:29.529730   485   503 I /system/bin/bootanimation: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 13:51:29.530395   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) connect(P): api=1 producer=(485:/system/bin/bootanimation) producerControlledByApp=false
01-10 13:51:29.630493   518   518 I bootstat: Service started: /system/bin/bootstat -r post_decrypt_time_elapsed 
01-10 13:51:29.759557   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:1.796827,dur:1113.07,max:790.32,min:322.76
01-10 13:51:30.184411   533   533 I thermald: START+++++++++ 533
01-10 13:51:30.184573   533   533 I thermald: Success to write 533 to /proc/driver/thermal/clsd_pid
01-10 13:51:30.184608   533   533 I thermald: Success to write 533 to /proc/driver/thermal/clmutt_tmd_pid
01-10 13:51:30.184628   533   533 I thermald: Enter infinite loop
01-10 13:51:30.223286   527   558 E AALCust : Invalid LCM index -1, LCM count 1
01-10 13:51:30.223484   527   558 I AALCust : LCM index: 0/1
01-10 13:51:30.255146   555   555 I thermal_mgr: main argc 1.
01-10 13:51:30.255280   555   555 I thermal_mgr: argv[0] /vendor/bin/thermal_manager.
01-10 13:51:30.255962   542   542 I MobileLogD: =====MOBILELOG START=======
01-10 13:51:30.264569   556   556 I thermal_src: ta_main
01-10 13:51:30.267291   545   545 I Netdiag : network_dignose_daemon doing
01-10 13:51:30.277364   545   573 I Netdiag : commandlistening threadStart doing
01-10 13:51:30.284534   553   553 I thermal_repeater: START+++++++++ 553
01-10 13:51:30.284696   553   553 I thermal_repeater: Success to write 553 to /proc/driver/thermal/clwmt_pid
01-10 13:51:30.284833   553   553 I thermal_repeater: Success to write 553 to /proc/driver/thermal/clmutt_tm_pid
01-10 13:51:30.284872   553   553 I thermal_repeater: RilRPC_init 
01-10 13:51:30.285087   553   553 I thermal_repeater: RilRPC_init dlopen fail: dlopen failed: library "librpcril.so" not found 
01-10 13:51:30.291257   550   550 E android.hardware.sensors@1.0-service-mediatek: sensor hidl defaultPassthroughServiceImplementation start.
01-10 13:51:30.292170   555   555 I thermal_mgr: loadmtc thermal.conf
01-10 13:51:30.292282   555   555 I libMtcLoader: loadmtc
01-10 13:51:30.292526   555   555 I libMtcLoader: spa socket send fail!
01-10 13:51:30.302332   541   541 I         : [MET_LOG_D: drop_privs 2394]prctl success
01-10 13:51:30.302515   541   541 I         : [MET_LOG_D: drop_privs 2400]setgroups success
01-10 13:51:30.302546   541   541 I         : [MET_LOG_D: drop_privs 2406]setgid 2000 success
01-10 13:51:30.302577   541   541 I         : [MET_LOG_D: drop_privs 2412]setuid 2000 success
01-10 13:51:30.314538   556   556 I thermal_src1: libthermal_algo_setup
01-10 13:51:30.314958   556   556 I thermal_src1: ta_daemon_init
01-10 13:51:30.315067   556   556 I thermal_src1: spa_init
01-10 13:51:30.338757   555   555 I libMtcLoader: .tp.settings is opened.
01-10 13:51:30.373333   555   555 I libMtcLoader: readPolicy_formatV2
01-10 13:51:30.374264   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktscpu-sysrst!
01-10 13:51:30.374529   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktspmic-sysrst!
01-10 13:51:30.374611   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktsbattery-sysrst!
01-10 13:51:30.374659   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-shutdown01!
01-10 13:51:30.374707   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktscharger-sysrst!
01-10 13:51:30.374765   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktswmt-sysrst!
01-10 13:51:30.374835   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtktsAP-sysrst!
01-10 13:51:30.374882   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-shutdown00!
01-10 13:51:30.375070   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-shutdown02!
01-10 13:51:30.375219   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown00!
01-10 13:51:30.375270   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown01!
01-10 13:51:30.375313   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown02!
01-10 13:51:30.375360   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown03!
01-10 13:51:30.375407   555   555 E libMtcLoader: failed to write "" to /proc/mtkcooler/mtk-cl-kshutdown04!
01-10 13:51:30.375837   564   564 E         : [SYSENV]get_env_info():321 , env_buffer[0] : f032a5c0
01-10 13:51:30.386895   556   556 I thermal_src: ta_catm_init_flow
01-10 13:51:30.387024   556   556 I thermal_src: u_CATM_ON == -1, get catm init val
01-10 13:51:30.387093   556   556 I thermal_src: TTJ_D 13500,TT_H 500,TT_L 500,TT 4000,MAX_TT 800000,MIN_TT -800000,MIN_TTJ 65000,CATM_ON 2,TTJ 59000,MAX_TARGET_TJ 85000,TRIP_TPCB 43000,STEADY_TARGET_TPCB 46000
01-10 13:51:30.387110   556   556 I thermal_src: update param 4608,59000,71500,27648,-25600
01-10 13:51:30.466667   539   539 I mediametrics: ServiceManager: 0x6f9d8316c0
01-10 13:51:30.469000   547   547 W storaged: type=1400 audit(0.0:30): avc: denied { read } for path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=97 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
01-10 13:51:30.474610   571   571 I ProgramBinary/Server: Get disable program binary service property (0)
01-10 13:51:30.474735   571   571 I ProgramBinary/Server: Program binary server is starting...
01-10 13:51:30.478215   561   561 E agps    : [agps] ERR: [MAIN] mtk_agpsd is running ver=4.309.0
01-10 13:51:30.478367   561   561 E agps    : [agps] ERR: [MAIN] mtk_agpsd is for Android
01-10 13:51:30.481994   571   571 I ProgramBinary/Service: ProgramBinaryService created.
01-10 13:51:30.482162   571   571 I ProgramBinary/Service: ProgramBinaryService init...
01-10 13:51:30.482182   571   571 I ProgramBinary/Service: ProgramBinaryService disable debugging.
01-10 13:51:30.482195   571   571 I ProgramBinary/Service: ProgramBinaryService disable binary content debugging.
01-10 13:51:30.486168   546   546 I PPL/PPLAgent: PPLAgent created start
01-10 13:51:30.486548   571   571 I ProgramBinary/Server: Program binary service is added to service manager.
01-10 13:51:30.486653   571   571 I ProgramBinary/Server: Execute program_binary_builder.
01-10 13:51:30.487314   571   571 I ProgramBinary/Server: Parent process for handling binder: Pid of child is 581.
01-10 13:51:30.487925   546   546 E PPL/PPLAgent: failed to get entry for /ppl
01-10 13:51:30.487970   546   546 I PPL/PPLAgent: PPLAgent created end
01-10 13:51:30.488505   550   550 I Accelerometer: read div buf(/sys/class/sensor/m_acc_misc/accactive), mdiv 1000
01-10 13:51:30.495178   581   581 I ProgramBinary/Server: Child process for building program: Pid is 581.
01-10 13:51:30.500531   570   570 I gatekeeperd: Starting gatekeeperd...
01-10 13:51:30.501558   546   546 I PPL/PPLAgent: Registered to Service Manager. writeOnProtect=1, rawDataPart=0
01-10 13:51:30.501860   546   546 I PPL/PPLAgent: PPLAgent Service is now ready
01-10 13:51:30.525717   551   551 I camerahalserver: Camera HAL Server is starting..., ADV_CAM_SUPPORT(1)
01-10 13:51:30.542186   544   544 I Netd    : Netd 1.0 starting
01-10 13:51:30.555695   550   550 E         : settings file open failed: -2 (No such file or directory)
01-10 13:51:30.555814   550   550 E Accelerometer: read bias: [0.000000, 0.000000, 0.000000]
01-10 13:51:30.555936   550   550 E         : settings file open failed: -2 (No such file or directory)
01-10 13:51:30.555958   550   550 E Accelerometer: read cali: [0, 0, 0]
01-10 13:51:30.556644   524   524 E mnl_linux: mnl_utl_load_property: Config is not set yet, ignore
01-10 13:51:30.558055   550   550 I Magnetic: misc path =/sys/class/sensor/m_mag_misc/
01-10 13:51:30.558316   550   550 I Magnetic: read div buf(/sys/class/sensor/m_mag_misc/magactive), mdiv_M 1024000
01-10 13:51:30.558403   550   550 E         : settings file open failed: -2 (No such file or directory)
01-10 13:51:30.558471   550   550 I Magnetic: read bias: [0.000000, 0.000000, 0.000000]
01-10 13:51:30.561696   574   574 I /system/bin/tombstoned: tombstoned successfully initialized
01-10 13:51:30.578535   550   550 I Proximity: misc path =/sys/class/sensor/m_ps_misc/
01-10 13:51:30.578713   550   550 I Proximity: read div buf(/sys/class/sensor/m_ps_misc/psactive), mdiv 100
01-10 13:51:30.578788   550   550 I Light   : misc path =/sys/class/sensor/m_als_misc/
01-10 13:51:30.578862   550   550 I Light   : read div buf(/sys/class/sensor/m_als_misc/alsactive),mdiv 100
01-10 13:51:30.578912   550   550 I Gyroscope: misc path =/sys/class/sensor/m_gyro_misc/
01-10 13:51:30.578980   550   550 I Gyroscope: read div buf(/sys/class/sensor/m_gyro_misc/gyroactive), mdiv 7506
01-10 13:51:30.579034   550   550 E         : settings file open failed: -2 (No such file or directory)
01-10 13:51:30.579084   550   550 I Gyroscope: read bias: [0.000000, 0.000000, 0.000000]
01-10 13:51:30.579116   550   550 E         : settings file open failed: -2 (No such file or directory)
01-10 13:51:30.579133   550   550 I Gyroscope: read cali: [0, 0, 0]
01-10 13:51:30.579154   550   550 E         : settings file open failed: -2 (No such file or directory)
01-10 13:51:30.579167   550   550 I Gyroscope: read temp: [0, 0, 0, 0, 0, 0]
01-10 13:51:30.580736   550   550 E Pressure: couldn't find sensor device , 0.1
01-10 13:51:30.580878   550   550 E Pressure: couldn't find input device ,0.1
01-10 13:51:30.580917   550   550 E HUMIDITY: couldn't find sensor device
01-10 13:51:30.580941   562   562 I NVRAM   : Registration complete for vendor.mediatek.hardware.nvram@1.0::INvram/default.
01-10 13:51:30.580954   550   550 E HUMIDITY: couldn't find input device 
01-10 13:51:30.580978   550   550 E StepRecognize: couldn't find input device
01-10 13:51:30.581128   550   550 I StepRecognize: misc path =
01-10 13:51:30.581227   550   550 E StepRecognize: open misc path /sys/class/sensor/m_step_c_misc/step_cactive fail 
01-10 13:51:30.581264   550   550 E Pedometer: couldn't find input device
01-10 13:51:30.581589   550   550 I Pedometer: misc path =
01-10 13:51:30.581638   550   550 E Pedometer: open misc path /sys/class/sensor/m_pedo_misc/pedoactive fail
01-10 13:51:30.581689   550   550 E Activity: couldn't find input device
01-10 13:51:30.581719   550   550 E Activity: couldn't find input device 
01-10 13:51:30.581752   550   550 E Situation: couldn't find input device
01-10 13:51:30.581772   550   550 I Situation: misc path =
01-10 13:51:30.581804   550   550 E Fusion  : open fusion misc path /sys/class/sensor/m_fusion_misc/fusionactive fail 
01-10 13:51:30.581840   550   550 I android.hardware.sensors@1.0-service-mediatek: sensor hidl load sensor module success.
01-10 13:51:30.582215   565   565 E         : safe_sendto: safe_sendto() sendto() failed path=[mtk_hal2mnl] ret=-1 reason=[Connection refused]111
01-10 13:51:30.584135   565   565 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.gnss@1.1-service to gnss@1.1-servic.
01-10 13:51:30.589349   561   591 I MtkAgpsNative: Enter mtk_agps_up_init
01-10 13:51:30.589721   561   591 I MtkAgpsNative: [????] kal_create_mutex: name(tls_global) 
01-10 13:51:30.605636   543   543 I advcamserver: ServiceManager: 0xece98ec0
01-10 13:51:30.606413   543   543 I advcam/AdvCamService: AdvCamService started (pid=543)
01-10 13:51:30.615005   543   543 I mmsdk/MMSdkService: MMSdkService started (pid=543)
01-10 13:51:30.619511   537   537 I mediaserver: ServiceManager: 0xee498f20
01-10 13:51:30.626092   565   565 I vendor.mediatek.hardware.gnss@1.1-service: Registration complete for vendor.mediatek.hardware.gnss@1.1::IMtkGnss/default.
01-10 13:51:30.628331   561   591 E agps    : [agps] ERR: [Default] mtk_expat_xml_load() failed reason=[fopen() failed reason=[No such file or directory]]
01-10 13:51:30.628510   561   591 E agps    : [agps] ERR: [Default] mtk_expat_xml_load() failed reason=[fopen() failed reason=[No such file or directory]]
01-10 13:51:30.631510   567   567 W libutils.threads: Thread (this=0x7eace6cc88): getTid() is undefined before run()
01-10 13:51:30.633843   550   550 I ServiceManagement: Removing namespace from process name android.hardware.sensors@1.0-service-mediatek to sensors@1.0-ser.
01-10 13:51:30.637907   561   591 E agps    : [agps] ERR: [MNL] sendto dest=[/data/agps_supl/agps_to_mnl] len=8 reason=[Connection refused]
01-10 13:51:30.638089   561   591 E agps    : [agps] ERR: [MNL] sendto dest=[/data/agps_supl/agps_to_mnl] len=48 reason=[Connection refused]
01-10 13:51:30.638686   550   550 I android.hardware.sensors@1.0-service-mediatek: Registration complete for android.hardware.sensors@1.0::ISensors/default.
01-10 13:51:30.641196   561   591 E MtkAgpsNative: safe_write reason=[No such device]19
01-10 13:51:30.641406   561   591 E agps    : [agps] ERR: [CP] get_ccci_uart  open failed node=[/dev/ccci2_tty2] reason=[No such file or directory]
01-10 13:51:30.642003   567   567 I ServiceManagement: Removing namespace from process name vendor.mediatek.hardware.pq@2.0-service to pq@2.0-service.
01-10 13:51:30.652575   585   585 I recovery: Recovery image already installed
01-10 13:51:30.653867   561   591 E agps    : [agps] ERR: [CP] ccci_uart_2  open failed
01-10 13:51:30.661601   567   567 I vendor.mediatek.hardware.pq@2.0-service: Registration complete for vendor.mediatek.hardware.pq@2.0::IPictureQuality/default.
01-10 13:51:30.663347   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(149504) returning hidl_memory(0x7d3a82b5f0, 149504)
01-10 13:51:30.698357   547   638 I ServiceManager: Waiting for service package_native...
01-10 13:51:30.702488   549   549 I /vendor/bin/hw/android.hardware.media.omx@1.0-service: mediacodecservice starting
01-10 13:51:30.715482   544   544 I Netd    : Creating child chains: 112.4ms
01-10 13:51:30.715717   544   544 I Netd    : Setting up OEM hooks: 0.3ms
01-10 13:51:30.730913   549   549 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[549]: allowing syscall: clock_gettime
01-10 13:51:30.731163   549   549 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[549]: allowing syscall: connect
01-10 13:51:30.731262   549   549 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[549]: allowing syscall: fcntl64
01-10 13:51:30.731337   549   549 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[549]: allowing syscall: socket
01-10 13:51:30.731412   549   549 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[549]: allowing syscall: writev
01-10 13:51:30.731647   544   544 I Netd    : Setting up FirewallController hooks: 15.9ms
01-10 13:51:30.732663   549   549 W /vendor/bin/hw/android.hardware.media.omx@1.0-service: libminijail[549]: logging seccomp filter failures
01-10 13:51:30.737233   544   544 I Netd    : Setting up NatController hooks: 5.6ms
01-10 13:51:30.745625   544   544 I Netd    : Setting up BandwidthController hooks: 8.4ms
01-10 13:51:30.745686   544   544 I Netd    : Setting up IdletimerController hooks: 0.1ms
01-10 13:51:30.760804   544   544 I Netd    : Disabling bandwidth control: 15.1ms
01-10 13:51:30.762650   544   544 E Netd    : cannot find interface dummy0
01-10 13:51:30.763325   544   544 I Netd    : Initializing RouteController: 2.5ms
01-10 13:51:30.766506   549   549 W MediaCodecsXmlParser: unable to open media codecs configuration xml file: /data/misc/media/media_codecs_profiling_results.xml
01-10 13:51:30.766645   549   549 W MediaCodecsXmlParser: parseTopLevelXMLFile(/data/misc/media/media_codecs_profiling_results.xml) failed
01-10 13:51:30.766801   549   549 E MediaCodecsXmlParser: Cannot find the role for a decoder of type audio/x-ms-wma
01-10 13:51:30.768417   549   549 I ServiceManagement: Removing namespace from process name android.hardware.media.omx@1.0-service to omx@1.0-service.
01-10 13:51:30.769910   544   544 I Netd    : Registering NetdNativeService: 5.1ms
01-10 13:51:30.770230   544   544 I Netd    : Starting CommandListener: 0.3ms
01-10 13:51:30.778519   544   544 I Netd    : Registering NetdHwService: 8.3ms
01-10 13:51:30.778601   544   544 I Netd    : Netd started in 237ms
01-10 13:51:30.787365   538   538 W /system/bin/mediaextractor: libminijail[538]: allowing syscall: connect
01-10 13:51:30.787624   538   538 W /system/bin/mediaextractor: libminijail[538]: allowing syscall: fcntl
01-10 13:51:30.787820   538   538 W /system/bin/mediaextractor: libminijail[538]: allowing syscall: sendto
01-10 13:51:30.787958   538   538 W /system/bin/mediaextractor: libminijail[538]: allowing syscall: socket
01-10 13:51:30.788027   538   538 W /system/bin/mediaextractor: libminijail[538]: allowing syscall: writev
01-10 13:51:30.788617   538   538 W /system/bin/mediaextractor: libminijail[538]: logging seccomp filter failures
01-10 13:51:30.806079   551   551 I mtkcam-devicemgr: [CameraDeviceManagerBase] "internal" this:0xed375004 persist.mtkcam.aosp_hal_version: persist.mtkcam.aosp_hal_legacy:1 persist.mtkcam.aosp_hal_legacy:0
01-10 13:51:30.808163   401   519 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=16.14 dur=1053.61 max=165.59 min=33.51
01-10 13:51:30.813610   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:16.127394,dur:1054.11,max:169.98,min:36.94
01-10 13:51:30.829519   549   549 W MediaCodecsXmlParser: unable to open media codecs configuration xml file: /data/misc/media/media_codecs_profiling_results.xml
01-10 13:51:30.829683   549   549 W MediaCodecsXmlParser: parseTopLevelXMLFile(/data/misc/media/media_codecs_profiling_results.xml) failed
01-10 13:51:30.830311   549   549 I ServiceManagement: Removing namespace from process name android.hardware.media.omx@1.0-service to omx@1.0-service.
01-10 13:51:30.838537   549   549 I /vendor/bin/hw/android.hardware.media.omx@1.0-service: Treble OMX service created.
01-10 13:51:30.872273   542   542 I MobileLogD: boot mode is 0
01-10 13:51:30.877926   525   525 I zygote64: option[0]=-Xzygote
01-10 13:51:30.878046   525   525 I zygote64: option[1]=-Xusetombstonedtraces
01-10 13:51:30.878065   525   525 I zygote64: option[2]=exit
01-10 13:51:30.878078   525   525 I zygote64: option[3]=vfprintf
01-10 13:51:30.878091   525   525 I zygote64: option[4]=sensitiveThread
01-10 13:51:30.878103   525   525 I zygote64: option[5]=-verbose:gc
01-10 13:51:30.878115   525   525 I zygote64: option[6]=-Xms4m
01-10 13:51:30.878126   525   525 I zygote64: option[7]=-Xmx256m
01-10 13:51:30.878138   525   525 I zygote64: option[8]=-XX:HeapGrowthLimit=128m
01-10 13:51:30.878151   525   525 I zygote64: option[9]=-Xusejit:true
01-10 13:51:30.878164   525   525 I zygote64: option[10]=-Xjitsaveprofilinginfo
01-10 13:51:30.878178   525   525 I zygote64: option[11]=-agentlib:jdwp=transport=dt_android_adb,suspend=n,server=y
01-10 13:51:30.878191   525   525 I zygote64: option[12]=-Ximage-compiler-option
01-10 13:51:30.878203   525   525 I zygote64: option[13]=--runtime-arg
01-10 13:51:30.878216   525   525 I zygote64: option[14]=-Ximage-compiler-option
01-10 13:51:30.878227   525   525 I zygote64: option[15]=-Xms64m
01-10 13:51:30.878240   525   525 I zygote64: option[16]=-Ximage-compiler-option
01-10 13:51:30.878251   525   525 I zygote64: option[17]=--runtime-arg
01-10 13:51:30.878264   525   525 I zygote64: option[18]=-Ximage-compiler-option
01-10 13:51:30.878296   525   525 I zygote64: option[19]=-Xmx64m
01-10 13:51:30.878310   525   525 I zygote64: option[20]=-Ximage-compiler-option
01-10 13:51:30.878324   525   525 I zygote64: option[21]=--image-classes=/system/etc/preloaded-classes
01-10 13:51:30.878353   525   525 I zygote64: option[22]=-Ximage-compiler-option
01-10 13:51:30.878368   525   525 I zygote64: option[23]=--compiled-classes=/system/etc/compiled-classes
01-10 13:51:30.878394   525   525 I zygote64: option[24]=-Ximage-compiler-option
01-10 13:51:30.878412   525   525 I zygote64: option[25]=--dirty-image-objects=/system/etc/dirty-image-objects
01-10 13:51:30.878436   525   525 I zygote64: option[26]=-Xcompiler-option
01-10 13:51:30.878450   525   525 I zygote64: option[27]=--runtime-arg
01-10 13:51:30.878476   525   525 I zygote64: option[28]=-Xcompiler-option
01-10 13:51:30.878490   525   525 I zygote64: option[29]=-Xms64m
01-10 13:51:30.878514   525   525 I zygote64: option[30]=-Xcompiler-option
01-10 13:51:30.878527   525   525 I zygote64: option[31]=--runtime-arg
01-10 13:51:30.878551   525   525 I zygote64: option[32]=-Xcompiler-option
01-10 13:51:30.878564   525   525 I zygote64: option[33]=-Xmx512m
01-10 13:51:30.878590   525   525 I zygote64: option[34]=-Ximage-compiler-option
01-10 13:51:30.878603   525   525 I zygote64: option[35]=--instruction-set-variant=cortex-a53
01-10 13:51:30.878630   525   525 I zygote64: option[36]=-Xcompiler-option
01-10 13:51:30.878644   525   525 I zygote64: option[37]=--instruction-set-variant=cortex-a53
01-10 13:51:30.878657   525   525 I zygote64: option[38]=-Ximage-compiler-option
01-10 13:51:30.878670   525   525 I zygote64: option[39]=--instruction-set-features=default
01-10 13:51:30.878682   525   525 I zygote64: option[40]=-Xcompiler-option
01-10 13:51:30.878710   525   525 I zygote64: option[41]=--instruction-set-features=default
01-10 13:51:30.878770   525   525 I zygote64: option[42]=-Duser.locale=zh-Hans-CN
01-10 13:51:30.878795   525   525 I zygote64: option[43]=--cpu-abilist=arm64-v8a
01-10 13:51:30.878812   525   525 I zygote64: option[44]=-Xfingerprint:Datalogic/dl35cn/dl35:8.1.0/1.07.15.20191227/1577435794:user/release-keys
01-10 13:51:30.906456   531   531 I cameraserver: ServiceManager: 0xe5b98f40
01-10 13:51:30.906671   531   531 I CameraService: CameraService started (pid=531)
01-10 13:51:30.909600   542   542 I MobileLogD: set cur path: /data/log_temp/boot/
01-10 13:51:30.910464   542   542 I MobileLogD: ld_p type: 0, id: 0, log_name: main_log, rotate_size: 15728640
01-10 13:51:30.910662   542   542 I MobileLogD: ld_p type: 0, id: 1, log_name: radio_log, rotate_size: 5242880
01-10 13:51:30.910772   542   542 I MobileLogD: ld_p type: 0, id: 2, log_name: events_log, rotate_size: 5242880
01-10 13:51:30.910875   542   542 I MobileLogD: ld_p type: 0, id: 3, log_name: sys_log, rotate_size: 5242880
01-10 13:51:30.910980   542   542 I MobileLogD: ld_p type: 0, id: 4, log_name: crash_log, rotate_size: 3145728
01-10 13:51:30.911067   542   542 I MobileLogD: Read kernel log from kmsg
01-10 13:51:30.911176   542   542 I MobileLogD: ld_p type: 1, id: 6, log_name: kernel_log, rotate_size: 10485760
01-10 13:51:30.911367   542   542 I MobileLogD: ld_p type: 1, id: 7, log_name: atf_log, rotate_size: 10485760
01-10 13:51:30.911603   542   542 I MobileLogD: ld_p type: 1, id: 8, log_name: gz_log, rotate_size: 3145728
01-10 13:51:30.911721   542   542 E MobileLogD: open /proc/gz_log fail(No such file or directory)
01-10 13:51:30.917799   563   668 E HWMLIB  : alsps_set_cali: set_cali err: -1
01-10 13:51:30.918560   563   666 E HWMLIB  : gsensor_set_cali: set_cali err: -1
01-10 13:51:30.920544   542   542 I MobileLogD: ld_p type: 1, id: 9, log_name: bsp_log, rotate_size: 5242880
01-10 13:51:30.922152   563   667 E HWMLIB  : gyroscope_set_cali: set_cali err: -1
01-10 13:51:30.955782   671   671 I MobileLogD: bsp ftrace buffer initializing...
01-10 13:51:30.997842   542   542 I MobileLogD: ld_p type: 1, id: 11, log_name: scp_log, rotate_size: 3145728
01-10 13:51:30.998059   542   542 E MobileLogD: open /dev/scp fail(No such file or directory)
01-10 13:51:31.073107   524   524 E mnld_uti: read_NVRAM: not 3332 UART port
01-10 13:51:31.073680   524   524 E gps_controlller: hasAlmanac: open file(/nvcfg/almanac.dat) fail
01-10 13:51:31.080035   542   542 I MobileLogD: ld_p type: 1, id: 12, log_name: scp_b_log, rotate_size: 3145728
01-10 13:51:31.080284   542   542 E MobileLogD: open /dev/scp_B fail(No such file or directory)
01-10 13:51:31.086836   528   528 I FastMixerState: sMaxFastTracks = 8
01-10 13:51:31.091105   524   524 E mtk_lbs_utility: safe_sendto: safe_sendto() sendto() failed path=[mtk_mnl2hal] ret=-1 reason=[Connection refused]111
01-10 13:51:31.102732   528   528 W BatteryNotifier: batterystats service unavailable!
01-10 13:51:31.108262   406   406 I ccci_mdinit: (1):Gotten ret=0,nvram_init=Ready!
01-10 13:51:31.110807   406   406 I ccci_mdinit: (1):md_img_exist 0 0 0 0
01-10 13:51:31.111084   561   591 E MtkAgpsNative: safe_write reason=[No such device]19
01-10 13:51:31.123011   528   528 I AudioFlinger: Using default 3000 mSec as standby time.
01-10 13:51:31.126027   528   528 E APM::Serializer: deserialize: Could not parse /odm/etc/audio_policy_configuration.xml document.
01-10 13:51:31.134524   406   700 I ccci_mdinit: (1):Update time to md by ipc port fail(25)
01-10 13:51:31.148810   542   542 I MobileLogD: ld_p type: 1, id: 13, log_name: sspm_log, rotate_size: 3145728
01-10 13:51:31.151630   542   542 E MobileLogD: open tagmap done
01-10 13:51:31.152246   542   542 I MobileLogD: current folder size limited is 300 MB, factor is 1
01-10 13:51:31.152881   542   542 I MobileLogD: main_log, rotation size 15728640
01-10 13:51:31.155959   542   542 I MobileLogD: radio_log, rotation size 5242880
01-10 13:51:31.156454   671   671 I MobileLogD: bsp ftrace buffer initialize done
01-10 13:51:31.158028   542   542 I MobileLogD: events_log, rotation size 5242880
01-10 13:51:31.158569   542   542 I MobileLogD: sys_log, rotation size 5242880
01-10 13:51:31.159126   542   542 I MobileLogD: crash_log, rotation size 3145728
01-10 13:51:31.159634   542   542 I MobileLogD: kernel_log, rotation size 10485760
01-10 13:51:31.163127   542   542 I MobileLogD: atf_log, rotation size 10485760
01-10 13:51:31.165844   542   542 I MobileLogD: bsp_log, rotation size 5242880
01-10 13:51:31.167357   581   581 I ProgramBinary/Builder: Program binary builder is starting...
01-10 13:51:31.167490   581   581 I ProgramBinary/Builder: Build program consctruct.
01-10 13:51:31.167501   581   581 I ProgramBinary/Builder: Build program is running...
01-10 13:51:31.167654   542   542 I MobileLogD: sspm_log, rotation size 3145728
01-10 13:51:31.167716   542   542 I MobileLogD: create dir /data/log_temp/boot/
01-10 13:51:31.201364   540   540 I mediaserver: ServiceManager: 0xed8d8740
01-10 13:51:31.205717   540   540 W BatteryNotifier: batterystats service unavailable!
01-10 13:51:31.225331   406   406 I ccci_mdinit: (1):Gotten ret=0,nvram_init=Ready!
01-10 13:51:31.242140   406   406 I ccci_mdinit: (1):USP_SBP:persist.mtk_usp_md_sbp_code not exist
01-10 13:51:31.242312   406   406 I ccci_mdinit: (1):get_cip_sbp_setting, file /custom/etc/firmware/CIP_MD_SBP NOT exists!
01-10 13:51:31.242374   406   406 I ccci_mdinit: (1):PRJ_SBP_ID:ro.mtk_md_sbp_custom_value not exist, using default value
01-10 13:51:31.258170   404   404 E ccci_fsd(1): FS_OTP_init:otp_open failed, errno=2!
01-10 13:51:31.258306   404   404 E ccci_fsd(1): can't catch SIGKILL
01-10 13:51:31.262206   406   406 I ccci_mdinit: (1):SBP_SUB_ID:persist.operator.subid not exist
01-10 13:51:31.262301   406   406 I ccci_mdinit: (1):set md boot data:mdl=2 sbp=0 dbg_dump=-1 sbp_sub=0
01-10 13:51:31.262366   406   406 I ccci_mdinit: (1):start_service init.svc.ccci_fsd, current state:running, returned:7
01-10 13:51:31.291728   531   531 I CameraService: CameraService process starting
01-10 13:51:31.292220   531   531 W BatteryNotifier: batterystats service unavailable!
01-10 13:51:31.292431   531   531 W BatteryNotifier: batterystats service unavailable!
01-10 13:51:31.295864   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.camera.provider@2.4::ICameraProvider/legacy/0 in either framework or device manifest.
01-10 13:51:31.305723   406   406 I ccci_mdinit: (1):wait_for_property:success(init.svc.ccci_fsd=running), loop:600
01-10 13:51:31.325987   351   351 E SELinux : avc:  denied  { find } for interface=android.hardware.configstore::ISurfaceFlingerConfigs sid=u:r:program_binary:s0 pid=581 scontext=u:r:program_binary:s0 tcontext=u:object_r:hal_configstore_ISurfaceFlingerConfigs:s0 tclass=hwservice_manager permissive=0
01-10 13:51:31.327718   581   581 I /system/bin/program_binary_builder: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0 (default)
01-10 13:51:31.327880   581   581 I ProgramBinary/Builder: EGL version 1.4
01-10 13:51:31.424746   575   575 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 13:51:31.425006   575   575 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 13:51:31.425132   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -F oem_mobile 
01-10 13:51:31.452974   526   526 I zygote  : option[0]=-Xzygote
01-10 13:51:31.453094   526   526 I zygote  : option[1]=-Xusetombstonedtraces
01-10 13:51:31.453112   526   526 I zygote  : option[2]=exit
01-10 13:51:31.453127   526   526 I zygote  : option[3]=vfprintf
01-10 13:51:31.453141   526   526 I zygote  : option[4]=sensitiveThread
01-10 13:51:31.453156   526   526 I zygote  : option[5]=-verbose:gc
01-10 13:51:31.453171   526   526 I zygote  : option[6]=-Xms4m
01-10 13:51:31.453185   526   526 I zygote  : option[7]=-Xmx256m
01-10 13:51:31.453211   526   526 I zygote  : option[8]=-XX:HeapGrowthLimit=128m
01-10 13:51:31.453233   526   526 I zygote  : option[9]=-Xusejit:true
01-10 13:51:31.453259   526   526 I zygote  : option[10]=-Xjitsaveprofilinginfo
01-10 13:51:31.453276   526   526 I zygote  : option[11]=-agentlib:jdwp=transport=dt_android_adb,suspend=n,server=y
01-10 13:51:31.453307   526   526 I zygote  : option[12]=-Ximage-compiler-option
01-10 13:51:31.453329   526   526 I zygote  : option[13]=--runtime-arg
01-10 13:51:31.453345   526   526 I zygote  : option[14]=-Ximage-compiler-option
01-10 13:51:31.453359   526   526 I zygote  : option[15]=-Xms64m
01-10 13:51:31.453374   526   526 I zygote  : option[16]=-Ximage-compiler-option
01-10 13:51:31.453389   526   526 I zygote  : option[17]=--runtime-arg
01-10 13:51:31.453405   526   526 I zygote  : option[18]=-Ximage-compiler-option
01-10 13:51:31.453464   526   526 I zygote  : option[19]=-Xmx64m
01-10 13:51:31.453480   526   526 I zygote  : option[20]=-Ximage-compiler-option
01-10 13:51:31.453499   526   526 I zygote  : option[21]=--image-classes=/system/etc/preloaded-classes
01-10 13:51:31.453514   526   526 I zygote  : option[22]=-Ximage-compiler-option
01-10 13:51:31.453530   526   526 I zygote  : option[23]=--compiled-classes=/system/etc/compiled-classes
01-10 13:51:31.453546   526   526 I zygote  : option[24]=-Ximage-compiler-option
01-10 13:51:31.453563   526   526 I zygote  : option[25]=--dirty-image-objects=/system/etc/dirty-image-objects
01-10 13:51:31.453578   526   526 I zygote  : option[26]=-Xcompiler-option
01-10 13:51:31.453593   526   526 I zygote  : option[27]=--runtime-arg
01-10 13:51:31.453608   526   526 I zygote  : option[28]=-Xcompiler-option
01-10 13:51:31.453623   526   526 I zygote  : option[29]=-Xms64m
01-10 13:51:31.453639   526   526 I zygote  : option[30]=-Xcompiler-option
01-10 13:51:31.453691   526   526 I zygote  : option[31]=--runtime-arg
01-10 13:51:31.453706   526   526 I zygote  : option[32]=-Xcompiler-option
01-10 13:51:31.453721   526   526 I zygote  : option[33]=-Xmx512m
01-10 13:51:31.453737   526   526 I zygote  : option[34]=-Ximage-compiler-option
01-10 13:51:31.453763   526   526 I zygote  : option[35]=--instruction-set-variant=cortex-a53
01-10 13:51:31.453779   526   526 I zygote  : option[36]=-Xcompiler-option
01-10 13:51:31.453808   526   526 I zygote  : option[37]=--instruction-set-variant=cortex-a53
01-10 13:51:31.453824   526   526 I zygote  : option[38]=-Ximage-compiler-option
01-10 13:51:31.453839   526   526 I zygote  : option[39]=--instruction-set-features=default
01-10 13:51:31.453854   526   526 I zygote  : option[40]=-Xcompiler-option
01-10 13:51:31.453869   526   526 I zygote  : option[41]=--instruction-set-features=default
01-10 13:51:31.453885   526   526 I zygote  : option[42]=-Duser.locale=zh-Hans-CN
01-10 13:51:31.453901   526   526 I zygote  : option[43]=--cpu-abilist=armeabi-v7a,armeabi
01-10 13:51:31.453919   526   526 I zygote  : option[44]=-Xfingerprint:Datalogic/dl35cn/dl35:8.1.0/1.07.15.20191227/1577435794:user/release-keys
01-10 13:51:31.460834   575   575 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 13:51:31.461674   575   575 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 13:51:31.461844   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -F oem_mobile 
01-10 13:51:31.510708   575   575 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 13:51:31.511348   575   575 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 13:51:31.511494   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -X oem_mobile 
01-10 13:51:31.569763   575   575 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 13:51:31.570003   575   575 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 13:51:31.570175   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -X oem_mobile 
01-10 13:51:31.685703   575   575 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 13:51:31.686578   575   575 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 13:51:31.686766   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -F oem_wifi 
01-10 13:51:31.698920   547   638 I ServiceManager: Waiting for service package_native...
01-10 13:51:31.725621   575   575 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 13:51:31.725897   575   575 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 13:51:31.726149   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -F oem_wifi 
01-10 13:51:31.758781   542   542 I MobileLogD: logd_sock: 19
01-10 13:51:31.762630   542   542 I MobileLogD: init debug
01-10 13:51:31.766353   542   765 I MobileLogD: read thread 765
01-10 13:51:31.766850   542   765 E MobileLogD: /sys/kernel/debug/tracing/instances/bsp/trace_pipe is ready now, and open it.
01-10 13:51:31.768708   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.768888   567   630 D PQTransition: onTransition: TRS: Mode2 (23)
01-10 13:51:31.768931   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.768929   575   575 I iptables-wrapper-1.0: iptables: No chain/target/match by that name.
01-10 13:51:31.769015   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.769058   575   575 I iptables-wrapper-1.0: iptables-wrapper-1.0 terminated by exit(1)
01-10 13:51:31.769176   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/iptables-wrapper-1.0 -w -t filter -X oem_wifi 
01-10 13:51:31.769813   542   766 I MobileLogD: write thread 766
01-10 13:51:31.769905   404   404 E ccci_fsd(1): FS_IsReadOnly: [error]fail on file: /vendor/nvdata/md/FAT9BC6FD43.log, error=2
01-10 13:51:31.784154   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.784297   567   630 D PQTransition: onTransition: TRS: Mode2 (24)
01-10 13:51:31.784439   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.784533   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.788515   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:31.789865   527   558 D AAL     : 01-10 01:51:31.709 BL= 942,ESS= 256, 01-10 01:51:31.727 BL= 941,ESS= 256, 01-10 01:51:31.747 BL= 940,ESS= 256, 01-10 01:51:31.768 BL= 939,ESS= 256, 01-10 01:51:31.789 BL= 938,ESS= 256, 
01-10 13:51:31.802881   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.802956   567   630 D PQTransition: onTransition: TRS: Mode2 (25)
01-10 13:51:31.803029   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.803102   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.810277   575   575 I ip6tables-wrapper-1.0: ip6tables: No chain/target/match by that name.
01-10 13:51:31.810484   575   575 I ip6tables-wrapper-1.0: ip6tables-wrapper-1.0 terminated by exit(1)
01-10 13:51:31.810621   575   575 E NetdagentIptables: exec() res=0, status=256 for /system/bin/ip6tables-wrapper-1.0 -w -t filter -X oem_wifi 
01-10 13:51:31.821744   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.821821   567   630 D PQTransition: onTransition: TRS: Mode2 (26)
01-10 13:51:31.821890   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.821980   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.826844   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:31.837469   767   767 D AEE_AED : Rtt command(type:0, file_path:3 arg0:542)
01-10 13:51:31.837654   767   767 E AEE_AED : aee:rttdRtt command connect socket fail: Connection refused
01-10 13:51:31.837702   767   767 E AEE_AED : aee:rttd_64Rtt command connect 64_socket fail: Connection refused
01-10 13:51:31.837713   767   767 D AEE_AED : switch AEE mode fail
01-10 13:51:31.840606   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.840683   567   630 D PQTransition: onTransition: TRS: Mode2 (27)
01-10 13:51:31.840770   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.840877   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.833000   767   767 W aee     : type=1400 audit(0.0:31): avc: denied { getattr } for path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=5378 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
01-10 13:51:31.847654   401   519 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=18.27 dur=1039.73 max=88.42 min=30.32
01-10 13:51:31.848854   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:31.850243   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:18.328600,dur:1036.63,max:75.94,min:18.90
01-10 13:51:31.859502   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.859592   567   630 D PQTransition: onTransition: TRS: Mode2 (28)
01-10 13:51:31.859670   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.859752   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.863272   581   581 D HWUIExtension: 11 Program id 14, key 0x0002001800500044, offset 58048, binaryLength 10924 within 112417ns
01-10 13:51:31.873070   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:31.878380   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.878501   567   630 D PQTransition: onTransition: TRS: Mode2 (29)
01-10 13:51:31.878592   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.878706   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.879393   527   558 D AAL     : 01-10 01:51:31.803 BL= 937,ESS= 256, 01-10 01:51:31.822 BL= 936,ESS= 256, 01-10 01:51:31.840 BL= 935,ESS= 256, 01-10 01:51:31.860 BL= 934,ESS= 256, 01-10 01:51:31.879 BL= 933,ESS= 256, 
01-10 13:51:31.890753   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:31.897209   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.897313   567   630 D PQTransition: onTransition: TRS: Mode2 (30)
01-10 13:51:31.897396   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.897591   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.916044   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.916039   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:31.916143   567   630 D PQTransition: onTransition: TRS: Mode2 (31)
01-10 13:51:31.917243   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.917473   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.935196   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.935451   567   630 D PQTransition: onTransition: TRS: Mode2 (32)
01-10 13:51:31.935666   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.935795   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.938023   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:31.947845   534   534 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 13:51:31.953725   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.953812   567   630 D PQTransition: onTransition: TRS: Mode2 (33)
01-10 13:51:31.953892   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.953961   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.956824   581   581 D HWUIExtension: 12 Program id 15, key 0x0000001000000008, offset 68972, binaryLength 11256 within 93386ns
01-10 13:51:31.959524   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:31.959627   406   406 D ccci_mdinit: (1):set md status:mtk.md1.status=ready 
01-10 13:51:31.962202   406   406 D ccci_mdinit: (1):start all ccci up layer services
01-10 13:51:31.962351   406   406 I ccci_mdinit: (1):start_service init.svc.emdlogger1, but returned 0, maybe has no this property
01-10 13:51:31.968167   534   534 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base_mtk.so absent, libpq_cust_mtk.so absent
01-10 13:51:31.968956   534   534 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 13:51:31.969606   534   534 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 13:51:31.969837   534   534 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 13:51:31.970845   534   534 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 13:51:31.972813   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.973091   567   630 D PQTransition: onTransition: TRS: Mode2 (34)
01-10 13:51:31.973153   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.973337   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.973794   527   558 D AAL     : 01-10 01:51:31.898 BL= 932,ESS= 256, 01-10 01:51:31.918 BL= 931,ESS= 256, 01-10 01:51:31.935 BL= 930,ESS= 256, 01-10 01:51:31.953 BL= 929,ESS= 256, 01-10 01:51:31.973 BL= 928,ESS= 256, 
01-10 13:51:31.978532   534   534 I         : [VT][SRV]ServiceManager: 0xe6f1f8c0
01-10 13:51:31.978592   534   534 I         : [VT][SRV]before VTService_instantiate
01-10 13:51:31.978605   534   534 E VT      : [VTS] before addService
01-10 13:51:31.980148   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:31.981789   406   406 I ccci_mdinit: (1):wait_for_property:success(init.svc.emdlogger1=running), loop:0
01-10 13:51:31.982028   406   406 D ccci_mdinit: (1):Current muxd: gsm0710muxd, rild:ril-daemon-mtk
01-10 13:51:31.982166   406   406 D ccci_mdinit: (1):system boot Mode: 48
01-10 13:51:31.982251   406   406 I ccci_mdinit: (1):start_service init.svc.gsm0710muxd, but returned 0, maybe has no this property
01-10 13:51:31.991584   567   630 D PQ      : ccorr table index=0
01-10 13:51:31.991729   567   630 D PQTransition: onTransition: TRS: Mode2 (35)
01-10 13:51:31.991773   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:31.991844   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:31.996076   406   406 I ccci_mdinit: (1):wait_for_property:success(init.svc.gsm0710muxd=running), loop:600
01-10 13:51:31.996186   406   406 D ccci_mdinit: (1):modem boot ready and deamon begin to run!
01-10 13:51:31.996219   406   406 D ccci_mdinit: (1):MD is release version
01-10 13:51:31.999879   774   774 I [BIP]   :  [BIP TASK] Init start (0)
01-10 13:51:32.000037   774   774 I [BIP]   :  [BIP KAL TIMER] timer init
01-10 13:51:32.000070   774   774 I [BIP]   :  [BIP KAL MSG] msg init, int_num = (20), ext_num = (20), name = (BIP)
01-10 13:51:32.000103   774   774 I [BIP]   :  [BIP TASK] Init end (0)
01-10 13:51:32.000115   774   774 I [BIP]   :  [BIP TASK] Init start (1)
01-10 13:51:32.001223   774   774 I [BIP]   :  [BIP AGENT] can open port, FD = (5)
01-10 13:51:32.001290   774   774 I [BIP]   :  [BIP AGENT] request INFO: ap_seq = 0, address is (0xb7022100)
01-10 13:51:32.001312   774   774 I [BIP]   :  [BIP AGENT] add header data in current buffer queue: ap_seq = (0), pkt_type = (0xffff0000), data_len = (0)
01-10 13:51:32.001333   774   774 I [BIP]   :  [BIP AGENT] the enqueue info. : need_to_write = (1), num_push = (1), num_pop = (0)
01-10 13:51:32.001352   774   774 I [BIP]   :  [BIP AGENT] start handshake!
01-10 13:51:32.001392   774   774 I [BIP]   :  [BIP AGENT] can write data now, FD = (5), write length = (12)
01-10 13:51:32.001459   774   774 I [BIP]   :  [BIP AGENT] the dequeue info. : ap_seq = (0), push_time = (3082487335), pop_time = (3082487415), num_push = (1), num_pop = (1)
01-10 13:51:32.004362   581   581 D HWUIExtension: 13 Program id 16, key 0x0002000000900041, offset 80228, binaryLength 5204 within 47316ns
01-10 13:51:32.007866   774   774 I [BIP]   :  [BIP AGENT] can read data now, FD = (5), read length = (26)
01-10 13:51:32.008009   774   774 I [BIP]   :  [BIP AGENT]  1  0 ff ff     4B:pkt_type
01-10 13:51:32.008027   774   774 I [BIP]   :  [BIP AGENT]  0  0  0  0     4B:pkt_num
01-10 13:51:32.008042   774   774 I [BIP]   :  [BIP AGENT]  e  0  0  0     4B:pkt_data_len
01-10 13:51:32.008067   774   774 I [BIP]   :  [BIP AGENT]  0  0  0  0   2B2B:(src_mod, dest_mod)
01-10 13:51:32.008084   774   774 I [BIP]   :  [BIP AGENT]  0  0  0  0   2B2B:(sap_id, msg_id)
01-10 13:51:32.008099   774   774 I [BIP]   :  [BIP AGENT] dc  5  c  0 1B1B2B:(ref_count, lp_reserved, msg_len)
01-10 13:51:32.008113   774   774 I [BIP]   :  [BIP AGENT] 8e  5 3a 73   1B1B:(sim_id, bip_channel_id)
01-10 13:51:32.008128   774   774 I [BIP]   :  [BIP AGENT] 30  0  0  0     4B:bip_info pointer
01-10 13:51:32.008147   774   774 I [BIP]   :  [BIP AGENT] MD W/R buffer size = (1500)
01-10 13:51:32.008181   774   774 I [BIP]   :  [BIP AGENT] end handshake!
01-10 13:51:32.008506   774   774 I [BIP]   :  [BIP TASK] Init end (1)
01-10 13:51:32.008537   774   774 I [BIP]   :  [BIP TASK] Init start (2)
01-10 13:51:32.008572   774   774 I [BIP]   :  [BIP KAL TIMER] create timer info, timer[(0)] = (0xb704d15c), timer id = (0xb704d15c), inuse = (0), name = (BIP_NET_DATA)
01-10 13:51:32.008957   774   774 I [BIP]   :  [BIP WIFI] Init end
01-10 13:51:32.009042   774   774 I [BIP]   :  [BIP TASK] Init end (2)
01-10 13:51:32.009058   774   774 I [BIP]   :  [BIP TASK] Init start (3)
01-10 13:51:32.009089   774   774 I [BIP]   :  [BIP KAL TIMER] create timer info, timer[(1)] = (0xb704d1ac), timer id = (0xb704d1ac), inuse = (0), name = (BIP_UICC_SERVER_DATA)
01-10 13:51:32.009173   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.009559   774   774 I [BIP]   :  [BIP UICC SERVER] init done
01-10 13:51:32.009593   774   774 I [BIP]   :  [BIP TASK] Init end (3)
01-10 13:51:32.009608   774   774 I [BIP]   :  [BIP TASK] Init start (4)
01-10 13:51:32.009860   774   774 I [BIP]   :  [BIP NL] init the link status of interface wlan0
01-10 13:51:32.009892   774   774 I [BIP]   :  [BIP NL] construct nl msg address ebf15560
01-10 13:51:32.010664   774   774 I [BIP]   :  [BIP NL] destroy nl msg address ebf15560
01-10 13:51:32.010733   774   774 I [BIP]   :  [BIP NL] init the addr status of interface wlan0
01-10 13:51:32.010754   774   774 I [BIP]   :  [BIP NL] construct nl msg address ebf15560
01-10 13:51:32.010871   774   774 I [BIP]   :  [BIP NL] destroy nl msg address ebf15560
01-10 13:51:32.010890   774   774 I [BIP]   :  [BIP NL] init the route status of interface wlan0
01-10 13:51:32.010906   774   774 I [BIP]   :  [BIP NL] construct nl msg address ebf15560
01-10 13:51:32.010994   774   774 I [BIP]   :  [BIP NL] IPv4: *.*.*.*
01-10 13:51:32.011023   774   774 I chatty  : uid=0(root) /vendor/bin/bip identical 2 lines
01-10 13:51:32.011036   774   774 I [BIP]   :  [BIP NL] IPv4: *.*.*.*
01-10 13:51:32.011077   774   774 I [BIP]   :  [BIP NL] IPv6: *:*:*:*:*:*:*:*
01-10 13:51:32.011098   774   774 I [BIP]   :  [BIP NL] destroy nl msg address ebf15560
01-10 13:51:32.011115   774   774 I [BIP]   :  [BIP NL] init the DNS status of interface wlan0
01-10 13:51:32.011441   774   774 E libc    : Access denied finding property "net.dns1"
01-10 13:51:32.011551   774   774 I [BIP]   :  [BIP NL] dns_server: dns type: 0, ipv4=*.*.*.*, ipv6=*:*:*:*:*:*:*:*
01-10 13:51:32.011555   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.011639   567   630 D PQTransition: onTransition: TRS: Mode2 (36)
01-10 13:51:32.011673   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.011742   774   774 E libc    : Access denied finding property "net.dns2"
01-10 13:51:32.011784   774   774 I [BIP]   :  [BIP NL] dns_server: dns type: 0, ipv4=*.*.*.*, ipv6=*:*:*:*:*:*:*:*
01-10 13:51:32.011832   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.012045   774   774 I [BIP]   :  [BIP TASK] Init end (4)
01-10 13:51:32.012071   774   774 I [BIP]   :  [BIP KAL MSG] msg deq, type = (1)
01-10 13:51:32.012089   774   774 I [BIP]   :  [BIP KAL MSG] msg deq, type = (0)
01-10 13:51:32.012103   774   774 I [BIP]   :  [BIP KAL] BIP task suspend
01-10 13:51:32.020553   774   786 I [BIP]   :  [BIP NL] thread start
01-10 13:51:32.009000   774   774 W bip     : type=1400 audit(0.0:32): avc: denied { read } for name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=8180 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
01-10 13:51:32.025786   774   782 I [BIP]   :  [BIP AGENT] start read() now, FD = (5)
01-10 13:51:32.029170   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.029310   567   630 D PQTransition: onTransition: TRS: Mode2 (37)
01-10 13:51:32.029405   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.029567   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.030507   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.035444   776   776 D VoLTE IMSM: vold.decrypt = trigger_restart_framework (module/mdagent/volte_imsm_93/src/volte_imsm.c:348)
01-10 13:51:32.035649   776   776 D VoLTE IMSM: ro.vendor.md_prop_ver = 0 version = 0
01-10 13:51:32.035649   776   776 D VoLTE IMSM:  (module/mdagent/volte_imsm_93/src/volte_imsm.c:268)
01-10 13:51:32.035710   776   776 D VoLTE IMSM: service.nvram_init = Ready (module/mdagent/volte_imsm_93/src/volte_imsm.c:277)
01-10 13:51:32.035735   776   776 D VoLTE IMSM: check_user_load, is user (module/mdagent/volte_imsm_93/src/volte_imsm.c:383)
01-10 13:51:32.035754   776   776 D VoLTE IMSM: volte_imsm (module/mdagent/volte_imsm_93/src/volte_imsm.c:97)
01-10 13:51:32.036046   776   776 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xf2a9a000 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 13:51:32.036178   776   776 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xf2a9a5a0 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 13:51:32.036241   776   776 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xf2a9a5c8 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 13:51:32.036303   776   776 D VoLTE IMSM: MSGQ_Init : msg_queue = 0xf2a9a5f0 (module/mdagent/volte_imsm_93/src/volte_imsm.c:156)
01-10 13:51:32.036561   776   776 E VoLTE IMSM: socket (volte_imsa1) error : Connection refused (111) (module/mdagent/volte_imsm_93/src/os_socket.c:280)
01-10 13:51:32.037641   776   788 D VoLTE IMSM: monitor_wifi_tech: enter (module/mdagent/volte_imsm_93/src/wireless.c:453)
01-10 13:51:32.037894   776   788 D VoLTE IMSM: send CTRL_CMD_GETFAMILY (module/mdagent/volte_imsm_93/src/wireless.c:472)
01-10 13:51:32.038436   776   789 D VoLTE IMSM: sim_id = 0, local sim_id = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 13:51:32.038492   776   789 D VoLTE IMSM: sim_id = 0 event queue = 0xf2a9a000 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 13:51:32.038504   776   789 D VoLTE IMSM: INIT [0][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038520   776   789 D VoLTE IMSM: INIT [0][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038530   776   789 D VoLTE IMSM: INIT [0][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038540   776   789 D VoLTE IMSM: INIT [0][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038551   776   789 D VoLTE IMSM: INIT [0][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038562   776   789 D VoLTE IMSM: INIT [0][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038572   776   789 D VoLTE IMSM: INIT [0][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038581   776   789 D VoLTE IMSM: INIT [0][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038591   776   789 D VoLTE IMSM: INIT [0][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038601   776   789 D VoLTE IMSM: INIT [0][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038610   776   789 D VoLTE IMSM: INIT [0][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038622   776   789 D VoLTE IMSM: INIT [0] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 13:51:32.038689   776   790 D VoLTE IMSM: sim_id = 1, local sim_id = 1 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 13:51:32.038705   776   790 D VoLTE IMSM: sim_id = 1 event queue = 0xf2a9a5a0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 13:51:32.038715   776   790 D VoLTE IMSM: INIT [1][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038726   776   790 D VoLTE IMSM: INIT [1][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038735   776   790 D VoLTE IMSM: INIT [1][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038745   776   790 D VoLTE IMSM: INIT [1][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038754   776   790 D VoLTE IMSM: INIT [1][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038765   776   790 D VoLTE IMSM: INIT [1][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038776   776   790 D VoLTE IMSM: INIT [1][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038787   776   790 D VoLTE IMSM: INIT [1][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038797   776   790 D VoLTE IMSM: INIT [1][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038806   776   790 D VoLTE IMSM: INIT [1][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038816   776   790 D VoLTE IMSM: INIT [1][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038828   776   790 D VoLTE IMSM: INIT [1] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 13:51:32.038877   776   791 D VoLTE IMSM: sim_id = 2, local sim_id = 2 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 13:51:32.038893   776   791 D VoLTE IMSM: sim_id = 2 event queue = 0xf2a9a5c8 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 13:51:32.038904   776   791 D VoLTE IMSM: INIT [2][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038915   776   791 D VoLTE IMSM: INIT [2][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038924   776   791 D VoLTE IMSM: INIT [2][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038934   776   791 D VoLTE IMSM: INIT [2][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038944   776   791 D VoLTE IMSM: INIT [2][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038953   776   791 D VoLTE IMSM: INIT [2][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038963   776   791 D VoLTE IMSM: INIT [2][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038974   776   791 D VoLTE IMSM: INIT [2][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038984   776   791 D VoLTE IMSM: INIT [2][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.038994   776   791 D VoLTE IMSM: INIT [2][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039004   776   791 D VoLTE IMSM: INIT [2][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039016   776   791 D VoLTE IMSM: INIT [2] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 13:51:32.039058   776   792 D VoLTE IMSM: sim_id = 3, local sim_id = 3 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5148)
01-10 13:51:32.039073   776   792 D VoLTE IMSM: sim_id = 3 event queue = 0xf2a9a5f0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5153)
01-10 13:51:32.039083   776   792 D VoLTE IMSM: INIT [3][0] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039092   776   792 D VoLTE IMSM: INIT [3][1] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039104   776   792 D VoLTE IMSM: INIT [3][2] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039115   776   792 D VoLTE IMSM: INIT [3][3] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039125   776   792 D VoLTE IMSM: INIT [3][4] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039135   776   792 D VoLTE IMSM: INIT [3][5] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039144   776   792 D VoLTE IMSM: INIT [3][6] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039154   776   792 D VoLTE IMSM: INIT [3][7] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039165   776   792 D VoLTE IMSM: INIT [3][8] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039175   776   792 D VoLTE IMSM: INIT [3][9] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039185   776   792 D VoLTE IMSM: INIT [3][10] (module/mdagent/volte_imsm_93/src/imsm_handler.c:5157)
01-10 13:51:32.039197   776   792 D VoLTE IMSM: INIT [3] Dedicated bearer pending (module/mdagent/volte_imsm_93/src/imsm_handler.c:5161)
01-10 13:51:32.048092   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.048244   567   630 D PQTransition: onTransition: TRS: Mode2 (38)
01-10 13:51:32.048338   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.048450   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.056891   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.058796   775   775 I EMDLOGGER1: 2018-03-13 previous mask value is 077
01-10 13:51:32.058935   775   775 D EMDLOGGER1: customized_mode = 0
01-10 13:51:32.059257   775   775 I EMDLOGGER1: PROP_ENABLE_DEBUG_LOG persist.logmuch.detect.mdlogger = 0 mEnableLogPrintTooMuch = 0
01-10 13:51:32.065152   775   775 D EMDLOGGER1: dllopen /system/lib64/libsysenv_system.so ok
01-10 13:51:32.065353   775   775 D         : [SYSENV]sysenv_get_with_area():429 , get env name=md1_ccb_cap_gear
01-10 13:51:32.065369   775   775 D         : [SYSENV]get_env_info():311 , initialize
01-10 13:51:32.065663   775   775 D         : [SYSENV]get_partition_count():107 , get_partition_count ret ptr: 38
01-10 13:51:32.065866   775   775 D         : [SYSENV]get_partition_path():158 , partition path = /dev/block/mmcblk0p3
01-10 13:51:32.065900   775   775 E         : [SYSENV]get_env_info():321 , env_buffer[0] : 53a32980
01-10 13:51:32.067152   527   558 D AAL     : 01-10 01:51:31.991 BL= 927,ESS= 256, 01-10 01:51:32.012 BL= 926,ESS= 256, 01-10 01:51:32.030 BL= 925,ESS= 256, 01-10 01:51:32.048 BL= 924,ESS= 256, 01-10 01:51:32.067 BL= 923,ESS= 256, 
01-10 13:51:32.067299   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.067335   567   630 D PQTransition: onTransition: TRS: Mode2 (39)
01-10 13:51:32.067413   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.067505   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.072519   775   775 D         : [SYSENV]read_env_area():244 , read 16384 data from 20000 to 53a32980
01-10 13:51:32.072691   775   775 D         : [SYSENV]get_env_info():348 , ENV initialize success
01-10 13:51:32.072861   775   775 E EMDLOGGER1: sysenv_get key md1_ccb_cap_gear valus is null
01-10 13:51:32.073645   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.078967   775   775 I EMDLOGGER1: mkdir: Failed.[/data/mdlog/bootupLog/] errno=17
01-10 13:51:32.085857   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.086022   567   630 D PQTransition: onTransition: TRS: Mode2 (40)
01-10 13:51:32.086124   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.086264   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.087197   781   781 I VoLTE IMCB-CM: uid= 0, euid=0 #203
01-10 13:51:32.087429   781   781 I VoLTE IMCB-CM: get [0]permitted: FFFFFFFF, [1]permitted: 3F #223
01-10 13:51:32.087451   781   781 I VoLTE IMCB-CM: get [1]effective.CAP_WAKE_ALARM: 0, [1]permitted.CAP_WAKE_ALARM: 8 #227
01-10 13:51:32.087472   781   781 I VoLTE IMCB-CM: get [0]permitted: FFFFFFFF, [1]permitted: 3F #255
01-10 13:51:32.089599   775   775 I EMDLOGGER1: mkdir: access file ok
01-10 13:51:32.089630   781   781 I VoLTE IMCB-CM: boottime_alarm_support = 1 #302
01-10 13:51:32.096221   781   781 I VoLTE IMCB-CM: register ims_hif for vt #375
01-10 13:51:32.097400   781   781 I VoLTE IMCB-CM: [ims_hif:0] init success, fd: 5 #422
01-10 13:51:32.097622   781   781 I VoLTE IMCB-CM: [ims_hif:1] init success, fd: 7 #422
01-10 13:51:32.097720   781   781 I VoLTE IMCB-CM: [ims_hif:2] init success, fd: 9 #422
01-10 13:51:32.097777   781   781 I VoLTE IMCB-CM: [ims_hif:3] init success, fd: 10 #422
01-10 13:51:32.098138   781   781 E VoLTE IF_CH: Try to open stream socket failed, retry! name = volte_ua, times = 1, error = Connection refused (module/volte//volte_core/src/os/api_channel.c:208)
01-10 13:51:32.092999   780   780 I VoLTE UA: [Box]VoLTE UA is launched (module/volte//volte_ua/src/volte_service.c:79)
01-10 13:51:32.099754   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.099812   780   780 E VoLTE IF_CH: Try to open stream socket failed, retry! name = volte_stack, times = 1, error = Connection refused (module/volte//volte_core/src/os/api_channel.c:208)
01-10 13:51:32.104479   581   581 D HWUIExtension: 14 Program id 17, key 0x0000081000000000, offset 85432, binaryLength 12020 within 99873ns
01-10 13:51:32.104598   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.104659   567   630 D PQTransition: onTransition: TRS: Mode2 (41)
01-10 13:51:32.104784   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.104912   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.110998   779   779 I VoLTE Stack: [Box]VoLTE Stack is launched (module/volte//volte_stack/src/volte_stack.c:114)
01-10 13:51:32.111284   779   779 I VoLTE Stack: flush ipsec SA&SP (module/volte//volte_stack/src/volte_stack.c:132)
01-10 13:51:32.111504   779   779 D setkey  : netlink receive msg status:20
01-10 13:51:32.111654   779   779 D setkey  : receive netlink message: 00000020 0x00000003 0x00000002
01-10 13:51:32.111788   779   779 D setkey  : flush_SA_SP_exist_xfrm <0 done
01-10 13:51:32.112459   779   779 I VoLTE Stack: [SIP] enter sip_init. MOD_SIP:65 (module/volte//volte_stack/src/sip/sip_main.c:226)
01-10 13:51:32.114902   779   779 I VoLTE IF_CH: server open stream socket (listen), name = volte_stack (module/volte//volte_core/src/os/api_channel.c:666)
01-10 13:51:32.115233   779   779 I VoLTE REG: REG init (module/volte//volte_stack/src/reg/reg.c:10234)
01-10 13:51:32.115415   779   779 I VoLTE REG: vtimer init (module/volte//volte_stack/src/reg/reg.c:10252)
01-10 13:51:32.115711   779   779 E VoLTE IF_CH: Try to open stream socket failed, retry! name = volte_stack, times = 1, error = Connection refused (module/volte//volte_core/src/os/api_channel.c:208)
01-10 13:51:32.116551   779   807 I VoLTE IF_CH: Max connection is 36, name = volte_stack (module/volte//volte_core/src/os/api_channel.c:438)
01-10 13:51:32.117548   779   803 I VoLTE SOC: create soc task, pid : 779 (module/volte//volte_stack/src/soc/soc_data.c:555)
01-10 13:51:32.117765   779   804 I VoLTE SOC: create soc_connect_thread task, pid : 779 (module/volte//volte_stack/src/soc/soc_data.c:361)
01-10 13:51:32.117845   779   805 I VoLTE Stack: create sip task, pid : 779 (module/volte//volte_stack/src/sip/sip_main.c:296)
01-10 13:51:32.121943   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.123506   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.123649   567   630 D PQTransition: onTransition: TRS: Mode2 (42)
01-10 13:51:32.123737   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.123805   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.139851   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.141962   380   697 E AudioParamParser-vnd: audioTypeLoadParamUnitHash(), No paramUnit element found!
01-10 13:51:32.142685   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.142779   567   630 D PQTransition: onTransition: TRS: Mode2 (43)
01-10 13:51:32.142876   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.142943   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.150454   780   780 I VoLTE IF_CH: client open stream socket , name = volte_stack, retry -200 times (module/volte//volte_core/src/os/api_channel.c:221)
01-10 13:51:32.150543   779   807 I VoLTE IF_CH: Connection from 0.0.0.0:0 [name:volte_stack, fd:10, idx:0] (module/volte//volte_core/src/os/api_channel.c:529)
01-10 13:51:32.150823   780   780 I VoLTE IF_CH: ** channel create (0xe8938900) (5) (module/volte//volte_core/src/os/api_channel.c:306)
01-10 13:51:32.151110   779   807 I VoLTE DISP: Parent channel id = 0x0 (module/volte//volte_stack/src/dispatcher/dispatcher.c:425)
01-10 13:51:32.151200   779   807 I VoLTE DISP: UA is connected (0xf24b7a08 - 0xf1e80000 - 0 - 0x0), type = 303301893 (module/volte//volte_stack/src/dispatcher/dispatcher.c:427)
01-10 13:51:32.151458   780   780 I VoLTE IF_CORE: volte_sip_stack_create, stack = 0xe8939000, channel = 0xe8938900 (module/volte//volte_ua/src/service/message.c:621) (module/volte//volte_core/src/interface/volte_stack.c:463)
01-10 13:51:32.151580   780   780 I VoLTE UA: Connect to VoLTE Stack (module/volte//volte_ua/src/service/message.c:626)
01-10 13:51:32.161166   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.161260   567   630 D PQTransition: onTransition: TRS: Mode2 (44)
01-10 13:51:32.161344   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.161519   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.162169   527   558 D AAL     : 01-10 01:51:32.086 BL= 922,ESS= 256, 01-10 01:51:32.105 BL= 921,ESS= 256, 01-10 01:51:32.123 BL= 920,ESS= 256, 01-10 01:51:32.142 BL= 919,ESS= 256, 01-10 01:51:32.162 BL= 918,ESS= 256, 
01-10 13:51:32.163971   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.166113   779   779 I VoLTE IF_CH: client open stream socket , name = volte_stack, retry -200 times (module/volte//volte_core/src/os/api_channel.c:221)
01-10 13:51:32.166182   779   807 I VoLTE IF_CH: Connection from 0.0.0.0:0 [name:volte_stack, fd:12, idx:1] (module/volte//volte_core/src/os/api_channel.c:529)
01-10 13:51:32.166504   779   779 I VoLTE IF_CH: ** channel create (0xf24c5940) (11) (module/volte//volte_core/src/os/api_channel.c:306)
01-10 13:51:32.166843   779   807 I VoLTE DISP: Reg UA is connected (0xf24b7a4c - 0xf1e90020 - 1) and send VOLTE_RSP_SIPTX_IF_REG_READY (module/volte//volte_stack/src/dispatcher/dispatcher.c:421)
01-10 13:51:32.166938   779   807 I VoLTE DISP: Reg UA is connected (0xf24b7a4c - 0xf1e90020 - 1) (module/volte//volte_stack/src/dispatcher/dispatcher.c:423)
01-10 13:51:32.166881   780   813 E VoLTE IF_CORE: type = 96012, response size error, size = 0 (module/volte//volte_core/src/interface/volte_stack.c:140)
01-10 13:51:32.167027   780   780 E VoLTE IF_CORE: volte_sip_stack_send_cmd, command error, type = 91034 (module/volte//volte_core/src/interface/volte_stack.c:549)
01-10 13:51:32.168217   780   780 I VoLTE IF_CH: server open stream socket (listen), name = volte_ua (module/volte//volte_core/src/os/api_channel.c:666)
01-10 13:51:32.170071   779   779 I VoLTE IF_CORE: volte_sip_stack_create, stack = 0xf24cf050, channel = 0xf24c5940 (module/volte//volte_stack/src/reg/reg.c:10281) (module/volte//volte_core/src/interface/volte_stack.c:463)
01-10 13:51:32.170258   779   779 I VoLTE REG: Init the Reg[0] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 13:51:32.170403   779   779 I VoLTE REG: *Reg[0] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 13:51:32.170432   779   779 I VoLTE_Auto_Testing: [0][reg] state/0/0/5/7
01-10 13:51:32.170506   779   779 I VoLTE REG: Init the Reg[1] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 13:51:32.171402   779   779 I VoLTE REG: *Reg[1] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 13:51:32.171520   779   779 I VoLTE_Auto_Testing: [0][reg] state/1/0/5/7
01-10 13:51:32.171623   779   779 I VoLTE REG: Init the Reg[2] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 13:51:32.171696   779   779 I VoLTE REG: *Reg[2] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 13:51:32.171713   779   779 I VoLTE_Auto_Testing: [0][reg] state/2/0/5/7
01-10 13:51:32.171757   779   779 I VoLTE REG: Init the Reg[3] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 13:51:32.171801   779   779 I VoLTE REG: *Reg[3] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 13:51:32.171818   779   779 I VoLTE_Auto_Testing: [0][reg] state/3/0/5/7
01-10 13:51:32.171860   779   779 I VoLTE REG: Init the Reg[4] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 13:51:32.171904   779   779 I VoLTE REG: *Reg[4] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 13:51:32.171918   779   779 I VoLTE_Auto_Testing: [0][reg] state/4/0/5/7
01-10 13:51:32.171961   779   779 I VoLTE REG: Init the Reg[5] (module/volte//volte_stack/src/reg/reg.c:2021)
01-10 13:51:32.172003   779   779 I VoLTE REG: *Reg[5] = unknown --> Disconnect , cause = 7, owner = 0 (module/volte//volte_stack/src/reg/reg.c:1692) (module/volte//volte_stack/src/reg/reg.c:1279)
01-10 13:51:32.172017   779   779 I VoLTE_Auto_Testing: [0][reg] state/5/0/5/7
01-10 13:51:32.175982   581   581 D HWUIExtension: 15 Program id 18, key 0x0002080800000001, offset 97452, binaryLength 12588 within 71301ns
01-10 13:51:32.180496   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.180597   567   630 D PQTransition: onTransition: TRS: Mode2 (45)
01-10 13:51:32.180685   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.180754   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.181549   404   404 W ccci_fsd(1): O: X://NA77_006, flag 0x700, ret 1
01-10 13:51:32.181685   780   821 I VoLTE IF_CH: Max connection is 1, name = volte_ua (module/volte//volte_core/src/os/api_channel.c:438)
01-10 13:51:32.182072   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.183178   380   697 D AudioSmartPaController: initSmartPaAttribute(), spkType: int_lo_buf, isSmartPAUsed: 0, SmartPA dynamic detect: 0
01-10 13:51:32.183324   380   697 D AudioALSAHardwareResourceManager: AudioALSAHardwareResourceManager()
01-10 13:51:32.189038   380   697 D AudioALSACodecDeviceBase: AudioALSACodecDeviceBase()
01-10 13:51:32.189185   380   697 D AudioALSACodecDeviceOutEarphonePMIC: AudioALSACodecDeviceOutEarphonePMIC()
01-10 13:51:32.189303   380   697 D AudioALSACodecDeviceOutEarphonePMIC: DeviceDoDcCalibrate(), ctl Dctrim_Control_Switch = 2
01-10 13:51:32.189323   380   697 D AudioALSACodecDeviceOutEarphonePMIC: DeviceDoDcCalibrate(), dc trimmed
01-10 13:51:32.189370   380   697 D AudioALSACodecDeviceBase: AudioALSACodecDeviceBase()
01-10 13:51:32.189448   380   697 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: AudioALSACodecDeviceOutSpeakerEarphonePMIC()
01-10 13:51:32.189484   380   697 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: DeviceDoDcCalibrate()
01-10 13:51:32.189517   380   697 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: DeviceDoDcCalibrate(), can't get mixer control(Audio HPL_SPK Offset)
01-10 13:51:32.189536   380   697 D AudioALSACodecDeviceOutSpeakerEarphonePMIC: DeviceDoDcCalibrate(), can't get mixer control(Audio HPR_SPK Offset)
01-10 13:51:32.190397   404   404 W ccci_fsd(1): O: Y://NA77_006, flag 0x700, ret 1
01-10 13:51:32.198904   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.199022   567   630 D PQTransition: onTransition: TRS: Mode2 (46)
01-10 13:51:32.199095   781   781 I VoLTE IF_CH: client open stream socket , name = volte_ua, retry -200 times (module/volte//volte_core/src/os/api_channel.c:221)
01-10 13:51:32.199132   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.199191   780   821 I VoLTE IF_CH: Connection from 0.0.0.0:0 [name:volte_ua, fd:11, idx:0] (module/volte//volte_core/src/os/api_channel.c:529)
01-10 13:51:32.199199   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.204121   380   697 D AudioALSADeviceConfigManager: TiXmlDeclaration version = 1.0, Encoding = UTF-8, Standalone = 
01-10 13:51:32.204264   380   697 D AudioALSADeviceConfigManager: GetVersion = 1.01
01-10 13:51:32.204280   380   697 D AudioALSADeviceConfigManager: +ParseInitSequence()
01-10 13:51:32.204299   380   697 D AudioALSADeviceConfigManager: valname = Audio_Speaker_class_Switch  valvalue = CLASSAB  
01-10 13:51:32.204349   380   697 D AudioALSADeviceConfigManager: -ParseInitSequence()
01-10 13:51:32.204366   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphone_output action = turnon
01-10 13:51:32.204399   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphone_output action = turnoff
01-10 13:51:32.204426   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = receiver_output action = turnon
01-10 13:51:32.204449   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = receiver_output action = turnoff
01-10 13:51:32.204472   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = two_in_one_speaker_output action = turnon
01-10 13:51:32.204497   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = two_in_one_speaker_output action = turnoff
01-10 13:51:32.204521   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = speaker_output action = turnon
01-10 13:51:32.204543   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = speaker_output action = turnoff
01-10 13:51:32.204563   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphoneSpeaker_output action = turnon
01-10 13:51:32.204597   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headphoneSpeaker_output action = turnoff
01-10 13:51:32.204618   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_speaker_output action = turnon
01-10 13:51:32.204640   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_speaker_output action = turnoff
01-10 13:51:32.204661   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_headphoneSpeaker_output action = turnon
01-10 13:51:32.204692   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = maxim_headphoneSpeaker_output action = turnoff
01-10 13:51:32.204719   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = ext_speaker_output action = turnon
01-10 13:51:32.204740   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = ext_speaker_output action = turnoff
01-10 13:51:32.204759   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1 action = turnon
01-10 13:51:32.204819   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1 action = turnoff
01-10 13:51:32.204848   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1_Inverse action = turnon
01-10 13:51:32.204884   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic1_Inverse action = turnoff
01-10 13:51:32.204914   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2 action = turnon
01-10 13:51:32.204961   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2 action = turnoff
01-10 13:51:32.204991   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2_Inverse action = turnon
01-10 13:51:32.205040   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_Mic2_Inverse action = turnoff
01-10 13:51:32.205071   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_SingleMic action = turnon
01-10 13:51:32.205103   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_SingleMic action = turnoff
01-10 13:51:32.205136   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_DualMic action = turnon
01-10 13:51:32.205185   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_DualMic action = turnoff
01-10 13:51:32.205233   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic action = turnon
01-10 13:51:32.205274   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic action = turnoff
01-10 13:51:32.205308   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic_Inverse action = turnon
01-10 13:51:32.205345   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = builtin_Mic_BackMic_Inverse action = turnoff
01-10 13:51:32.205376   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headset_mic_input action = turnon
01-10 13:51:32.205548   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = headset_mic_input action = turnoff
01-10 13:51:32.205590   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = sidetone_switch action = turnon
01-10 13:51:32.205631   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = sidetone_switch action = turnoff
01-10 13:51:32.205653   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeACCMode action = setting
01-10 13:51:32.205675   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDCCMode action = setting
01-10 13:51:32.205698   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDMICMode action = setting
01-10 13:51:32.205719   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDCCECMDIFFMode action = setting
01-10 13:51:32.205743   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic1TypeDCCECMSINGLEMode action = setting
01-10 13:51:32.205766   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeACCMode action = setting
01-10 13:51:32.205796   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDCCMode action = setting
01-10 13:51:32.205822   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDMICMode action = setting
01-10 13:51:32.205844   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDCCECMDIFFMode action = setting
01-10 13:51:32.205866   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic2TypeDCCECMSINGLEMode action = setting
01-10 13:51:32.205889   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeACCMode action = setting
01-10 13:51:32.205912   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDCCMode action = setting
01-10 13:51:32.205934   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDMICMode action = setting
01-10 13:51:32.205921   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.205957   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDCCECMDIFFMode action = setting
01-10 13:51:32.205981   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic3TypeDCCECMSINGLEMode action = setting
01-10 13:51:32.206006   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeACCMode action = setting
01-10 13:51:32.206030   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDCCMode action = setting
01-10 13:51:32.206067   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDMICMode action = setting
01-10 13:51:32.206091   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDCCECMDIFFMode action = setting
01-10 13:51:32.206114   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic4TypeDCCECMSINGLEMode action = setting
01-10 13:51:32.206140   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic_Setting_Inverse action = setting
01-10 13:51:32.206166   380   697 D AudioALSADeviceConfigManager: ParseDeviceSequence() devicename = Mic_Setting_NoInverse action = setting
01-10 13:51:32.208037   380   697 D AudioCustParamClient: AudioCustParamClient()
01-10 13:51:32.208180   380   697 D AudioCustParamClient: Init(), acpOpsInited(0)
01-10 13:51:32.208199   380   697 D AudioCustParamClient: Init(), init AcpOps struct
01-10 13:51:32.208856   380   697 D AudioCustParam: appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 13:51:32.209784   380   697 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 13:51:32.209917   380   697 D AudioUtility: PHONE_MIC_MODE defined!, mPhoneMicMode = 1
01-10 13:51:32.209977   380   697 D AudioUtility: HEADSET_MIC_MODE defined!, mHeadsetMicMode = 2
01-10 13:51:32.210017   380   697 D AudioALSADeviceConfigManager: ApplyDeviceSettingByName() DeviceName = Mic1TypeACCMode descriptor->DeviceStatusCounter = 0
01-10 13:51:32.210140   380   697 D AudioALSADeviceConfigManager: ApplyDeviceSettingByName() DeviceName = Mic2TypeACCMode descriptor->DeviceStatusCounter = 0
01-10 13:51:32.210403   380   697 D AudioMTKGainController: AudioMTKGainController contructor
01-10 13:51:32.210558   380   697 D AudioSpeechEnhanceInfo: getInstance()
01-10 13:51:32.210632   380   697 D AudioSpeechEnhanceInfo: AudioSpeechEnhanceInfo()
01-10 13:51:32.210908   380   697 D AudioSpeechEnhanceInfo: AudioSpeechEnhanceInfo(), mAudioCustParamClient(0xe74892e0)
01-10 13:51:32.210950   380   697 D AudioSpeechEnhanceInfo: PreLoadBesRecordParams+
01-10 13:51:32.210968   380   697 D NVRAM   : GetHdRecordSceneTableFromNV()
01-10 13:51:32.211841   380   697 D NVRAM   : length of g_NVRAM_BACKUP_DEVICE=44
01-10 13:51:32.212121   380   697 D NVRAM   : failed to get entry for /nvdata 
01-10 13:51:32.212240   380   697 D NVRAM   : failed to get nvdata path /nvdata 
01-10 13:51:32.212397   380   697 D NVRAM   : nvram_layout_callback will run!!!
01-10 13:51:32.212468   380   697 D NVRAM   : nvram_platform_log_block: 2
01-10 13:51:32.212518   380   697 D NVRAM   : nvram_platform_resv_block: 2
01-10 13:51:32.212569   380   697 D NVRAM   : nvram_platform_DM_block: 1
01-10 13:51:32.212618   380   697 D NVRAM   : nvram_platform_layout_version: 0
01-10 13:51:32.212645   380   697 D NVRAM   : nvram_platform_header_offset: 0
01-10 13:51:32.212662   380   697 D NVRAM   : g_i4CFG_File_Count: 51
01-10 13:51:32.212677   380   697 D NVRAM   : NVM_Init Max Lid: 78
01-10 13:51:32.212693   380   697 D NVRAM   : [NVRAM]: info nvram_gpt_flag =1
01-10 13:51:32.212706   380   697 D NVRAM   : [NVRAM]: info NVRAM Init Completed!
01-10 13:51:32.212947   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_Hd_Record_Scene_Table,LID:66
01-10 13:51:32.217770   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.217827   380   697 D NVRAM   : NVM_CmpFileVerNo 66  
01-10 13:51:32.217929   567   630 D PQTransition: onTransition: TRS: Mode2 (47)
01-10 13:51:32.218053   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.218076   380   697 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 13:51:32.218112   380   697 D NVRAM   : NVM_ProtectDataFile : 66 ++
01-10 13:51:32.218127   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:32.218171   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:137,size in table:135
01-10 13:51:32.218141   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.220804   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:32.220891   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:32.220911   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:32.220946   380   697 D NVRAM   : GetHdRecordSceneTableFromNV rec_size = 135 rec_num = 1
01-10 13:51:32.222620   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:32.222698   380   697 D NVRAM   : GetHdRecordSceneTableFromNV result = 135
01-10 13:51:32.222714   380   697 D NVRAM   : GetHdRecordParamFromNV()
01-10 13:51:32.222876   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_Hd_Record_Param,LID:65
01-10 13:51:32.223014   380   697 D NVRAM   : NVM_CmpFileVerNo 65  
01-10 13:51:32.223096   380   697 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 13:51:32.223121   380   697 D NVRAM   : NVM_ProtectDataFile : 65 ++
01-10 13:51:32.223134   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:32.223168   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:4056,size in table:4054
01-10 13:51:32.224385   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.225941   781   781 I VoLTE IF_CH: ** channel create (0xf4b98de0) (14) (module/volte//volte_core/src/os/api_channel.c:306)
01-10 13:51:32.226086   781   781 I VoLTE IMCB-CM: Send the init event to UA, max_acct=6 #54
01-10 13:51:32.226187   781   781 I VoLTE IMCB-CM: Connect to the UA, wait reg event (type 1) #217
01-10 13:51:32.227985   781   781 I VoLTE IMCB-CM: socket opened, fd = 17!! #122
01-10 13:51:32.228700   781   781 I VoLTE IMCB-1: {{{{imcb main start ... (NDK build 20161209)/2018/12/05 15:44:45 GMT +08:00/MOLY.LR12A.R2.MP.V58.16 main()@0#481
01-10 13:51:32.228700   781   781 I VoLTE IMCB-1: [process_msg] msg_id=101602(0x00018CE2), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 process_msg()@0#187
01-10 13:51:32.228700   781   781 I VoLTE IMCB-1: connection status change for module 2 as error_num 0 imcb_imcb_comm_error_handler()@0#797
01-10 13:51:32.228700   781   781 I VoLTE IMCB-1: connection status for modudle 2 @0#820
01-10 13:51:32.228700   781   781 I VoLTE IMCB-1: ENTER imcb_send_multiple_imc_va_connect_req()@0#3073
01-10 13:51:32.228700   781   781 I VoLTE IMCB-1: ENTER imcb_send_imc_va_connect_req()@0#3056
01-10 13:51:32.228700   781   781 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.228700   781   781 I VoLTE IMCB-1: ENTER imcb_send_imc_va_connect_req()@1#3056}}}}
01-10 13:51:32.229000   781   781 I VoLTE IMCB: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.229000   781   781 I VoLTE IMCB: ENTER imcb_send_imc_va_connect_req()@2#3056
01-10 13:51:32.229000   781   781 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 13:51:32.229000   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.229591   780   821 E VoLTE IF_SERVICE: volte_service_server_read, data = 0xe8011890, channel = 0xe89447c0, type = 0, callback is NULL (module/volte//volte_core/src/interface/volte_service.c:188)
01-10 13:51:32.229840   780   821 I VoLTE Service: UA account num = 6 (module/volte//volte_ua/src/service/service.c:108)
01-10 13:51:32.229909   780   821 E VoLTE UA: Stack channel is created (module/volte//volte_ua/src/service/message.c:609)
01-10 13:51:32.229983   780   821 I VoLTE Service: VoLTE Service is ready (module/volte//volte_ua/src/service/service.c:124)
01-10 13:51:32.230204   779   811 I VoLTE REG: Reg[0] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 13:51:32.230307   779   811 I VoLTE REG: Reg[1] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 13:51:32.230325   779   811 I VoLTE REG: Reg[2] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 13:51:32.230340   779   811 I VoLTE REG: Reg[3] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 13:51:32.230355   779   811 I VoLTE REG: Reg[4] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 13:51:32.230370   779   811 I VoLTE REG: Reg[5] owner = 00000001 (module/volte//volte_stack/src/reg/reg.c:9199)
01-10 13:51:32.236582   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.236747   567   630 D PQTransition: onTransition: TRS: Mode2 (48)
01-10 13:51:32.236861   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.236926   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.237106   776   776 E VoLTE IMSM: SOCK_Connect ok, fd = 6 (module/mdagent/volte_imsm_93/src/os_socket.c:305)
01-10 13:51:32.237276   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:32.237307   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:32.237323   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:32.237356   380   697 D NVRAM   : GetHdRecordParamFromNV rec_size = 4054 rec_num = 1
01-10 13:51:32.237487   776   776 D VoLTE IMSM: create imcb receiver[0], task_sock = 0xf2a9f270 (module/mdagent/volte_imsm_93/src/request_handler.c:214)
01-10 13:51:32.237609   781   825 I VoLTE IMCB-CM: Receive VOLTE_IND_REG_STATE, id = 5, and cause is VoLTE_Event_Reg_Cause_Channel_Bind #94
01-10 13:51:32.238129   781   781 I VoLTE IMCB-2: {{{{[process_msg] msg_id=101602(0x00018CE2), dst=IMSA1[5], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:32.238129   781   781 I VoLTE IMCB-2: connection status change for module 5 as error_num 0 imcb_imcb_comm_error_handler()@0#797
01-10 13:51:32.238129   781   781 I VoLTE IMCB-2: ENTER imcb_send_multiple_imc_va_connect_req()@0#3073
01-10 13:51:32.238129   781   781 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@0#3056
01-10 13:51:32.238129   781   781 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.238129   781   781 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@1#3056
01-10 13:51:32.238129   781   781 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.238129   781   781 I VoLTE IMCB-2: ENTER imcb_send_imc_va_connect_req()@2#3056}}}}
01-10 13:51:32.238427   781   781 I VoLTE IMCB-1: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 13:51:32.238427   781   781 I VoLTE IMCB-1: ENTER imcb_send_multiple_imc_imsa_connect_req()@0#3041
01-10 13:51:32.238427   781   781 I VoLTE IMCB-1: ENTER imcb_send_imc_imsa_connect_req()@0#3025
01-10 13:51:32.238427   781   781 I VoLTE IMCB-1: imcb_verno:0x6c imcb_set_imsa_connect_req_to_imc_para()@0#871
01-10 13:51:32.238427   781   781 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.238427   781   781 I VoLTE IMCB-1: ENTER imcb_send_imc_imsa_connect_req()@1#3025
01-10 13:51:32.238427   781   781 I VoLTE IMCB-1: imcb_verno:0x6c imcb_set_imsa_connect_req_to_imc_para()@1#871}}}}
01-10 13:51:32.238781   781   781 I VoLTE IMCB-1: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.238781   781   781 I VoLTE IMCB-1: ENTER imcb_send_imc_imsa_connect_req()@2#3025
01-10 13:51:32.238781   781   781 I VoLTE IMCB-1: imcb_verno:0x6c imcb_set_imsa_connect_req_to_imc_para()@2#871
01-10 13:51:32.238781   781   781 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 13:51:32.238781   781   781 I VoLTE IMCB-1: ENTER imcb_send_multiple_imc_va_connect_req()@0#3073
01-10 13:51:32.238781   781   781 I VoLTE IMCB-1: ENTER imcb_send_imc_va_connect_req()@0#3056
01-10 13:51:32.238781   781   781 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.238781   781   781 I VoLTE IMCB-1: ENTER imcb_send_imc_va_connect_req()@1#3056}}}}
01-10 13:51:32.238960   776   776 D VoLTE IMSM: version check begin (module/mdagent/volte_imsm_93/src/volte_imsm.c:172)
01-10 13:51:32.238963   781   781 I VoLTE IMCB: {{{{Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.238963   781   781 I VoLTE IMCB: ENTER imcb_send_imc_va_connect_req()@2#3056
01-10 13:51:32.238963   781   781 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 13:51:32.238963   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.238999   776   776 I VoLTE IMSMx: IMSM -> IMSMMD : [0] AP_ID_IMSM_GET_VERSION_REQ
01-10 13:51:32.239056   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=20002(0x00004E22), dst=UA[3], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:32.239056   781   781 I VoLTE IMCB: EndofMessage @0#236}}}}
01-10 13:51:32.239218   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:32.239259   380   697 D NVRAM   : GetHdRecordParamFromNV result = 4054
01-10 13:51:32.239403   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_VOIP_Param,LID:17
01-10 13:51:32.239504   380   697 D NVRAM   : NVM_CmpFileVerNo 17  
01-10 13:51:32.239564   380   697 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 13:51:32.239584   380   697 D NVRAM   : NVM_ProtectDataFile : 17 ++
01-10 13:51:32.239594   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:32.239619   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:1594,size in table:1592
01-10 13:51:32.240866   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:32.241513   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:32.241857   781   781 I VoLTE IMCB-0: {{{{[process_msg] msg_id=100008(0x000186A8), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:32.241857   781   781 I VoLTE IMCB-0: ENTER imcb_imc_ims_init_ind_handler()@0#3890
01-10 13:51:32.241857   781   781 I VoLTE IMCB-0: ENTER imcb_initial_sim()@0#770
01-10 13:51:32.241857   781   781 I VoLTE IMCB-0: ENTER imcb_send_imc_ims_reg_state_req()@0#2392
01-10 13:51:32.241857   781   781 I VoLTE IMCB-0: error ua rat type = 0 imcb_rat_conv_to_imc()@0#85
01-10 13:51:32.241857   781   781 I VoLTE IMCB-0: acct_id:0, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@0#203
01-10 13:51:32.241857   781   781 I VoLTE IMCB-0: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.241857   781   781 I VoLTE IMCB-0: ENTER imcb_send_imc_ims_reg_state_req()@0#2392
01-10 13:51:32.241857   781   781 I VoLTE IMCB-0: error ua rat type = 0 imcb_rat_conv_to_imc()@0#85}}}}
01-10 13:51:32.241937   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:32.241979   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:32.241993   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:32.242027   380   697 D NVRAM   : GetAudioVoIPParamFromNV rec_size = 1592 rec_num = 1
01-10 13:51:32.242097   781   781 I VoLTE IMCB: {{{{acct_id:1, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@0#203
01-10 13:51:32.242097   781   781 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.242097   781   781 I VoLTE IMCB: sim:0 initiated ! imcb_initial_sim()@0#779
01-10 13:51:32.242097   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.242229   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:32.242649   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100014(0x000186AE), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:32.242649   781   781 I VoLTE IMCB: ENTER imcb_imc_sim_query_ind_handler()@0#5241
01-10 13:51:32.242649   781   781 I VoLTE IMCB: Pure Mesage Send dest=IMSA1[5], msg_id=100508(0x0001889C), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.242649   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.242796   776   827 I VoLTE IMSMx: IMCB -> IMSM : [0] SIM_QUERY_IND
01-10 13:51:32.242804   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:32.242918   776   789 D VoLTE IMSM: ===> event queue = 0xf2a9a000, sim_id = 0, request_id = 100508 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5177)
01-10 13:51:32.243013   776   789 D VoLTE IMSM: Receive IMCB sim_id=0 request_id=100508 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2386)
01-10 13:51:32.243032   776   789 D VoLTE IMSM: receive MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_IND, transaction_id = 1 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2886)
01-10 13:51:32.243054   776   789 D VoLTE IMSM: send MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_RSP, transaction_id = 1, sim_usim_type = 0, isim_type = 3, session_id = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2907)
01-10 13:51:32.243070   776   789 I VoLTE IMSMx: IMSM -> IMCB : [0] SIM_QUERY_RSP
01-10 13:51:32.243451   781   781 I VoLTE IMCB-1: {{{{[process_msg] msg_id=100008(0x000186A8), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 13:51:32.243451   781   781 I VoLTE IMCB-1: ENTER imcb_imc_ims_init_ind_handler()@1#3890
01-10 13:51:32.243451   781   781 I VoLTE IMCB-1: ENTER imcb_initial_sim()@1#770
01-10 13:51:32.243451   781   781 I VoLTE IMCB-1: ENTER imcb_send_imc_ims_reg_state_req()@1#2392
01-10 13:51:32.243451   781   781 I VoLTE IMCB-1: error ua rat type = 0 imcb_rat_conv_to_imc()@1#85
01-10 13:51:32.243451   781   781 I VoLTE IMCB-1: acct_id:2, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@1#203
01-10 13:51:32.243451   781   781 I VoLTE IMCB-1: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.243451   781   781 I VoLTE IMCB-1: ENTER imcb_send_imc_ims_reg_state_req()@1#2392
01-10 13:51:32.243451   781   781 I VoLTE IMCB-1: error ua rat type = 0 imcb_rat_conv_to_imc()@1#85}}}}
01-10 13:51:32.243644   781   781 I VoLTE IMCB: {{{{acct_id:3, reg_state:0, cause:0, sip_cause:0, retry_after:0 imcb_set_ims_reg_state_req_to_imc_para()@1#203
01-10 13:51:32.243644   781   781 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.243644   781   781 I VoLTE IMCB: sim:1 initiated ! imcb_initial_sim()@1#779
01-10 13:51:32.243644   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.243668   776   828 I VoLTE IMSMx: IMSMMD -> IMSM : [0] AP_ID_IMSM_GET_VERSION_CNF
01-10 13:51:32.243735   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:32.243763   380   697 D NVRAM   : GetAudioVoIPParamFromNV result = 1592
01-10 13:51:32.243743   776   776 D VoLTE IMSM: AP version = 4, MD version = 4 (module/mdagent/volte_imsm_93/src/volte_imsm.c:180)
01-10 13:51:32.243792   380   697 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 13:51:32.243808   380   697 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 13:51:32.243808   776   776 I VoLTE IMSMx: IMSM -> IMSMMD : [0] AP_ID_SIMMNGR_SIM_INSERT_CHECK_REQ
01-10 13:51:32.243953   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Sph_Dual_Mic,LID:59
01-10 13:51:32.244072   380   697 D NVRAM   : NVM_CmpFileVerNo 59  
01-10 13:51:32.244129   380   697 D NVRAM   : Load File Version: 002, NvRam File Version: 002
01-10 13:51:32.244143   380   697 D NVRAM   : NVM_ProtectDataFile : 59 ++
01-10 13:51:32.244145   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100014(0x000186AE), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 13:51:32.244145   781   781 I VoLTE IMCB: ENTER imcb_imc_sim_query_ind_handler()@1#5241
01-10 13:51:32.244145   781   781 I VoLTE IMCB: Pure Mesage Send dest=IMSA1[5], msg_id=16877724(0x0101889C), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.244145   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.244153   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:32.244179   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:938,size in table:936
01-10 13:51:32.244705   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100509(0x0001889D), dst=IMSA1[5], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:32.244705   781   781 I VoLTE IMCB: ENTER imsa_imcb_sim_query_rsp_handler()@0#1081
01-10 13:51:32.244705   781   781 I VoLTE IMCB: transaction_id:1, sim_usim_type:0, isim_type:3, session_id:0 @0#1084
01-10 13:51:32.244705   781   781 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.244705   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.244860   776   827 I VoLTE IMSMx: IMCB -> IMSM : [1] SIM_QUERY_IND
01-10 13:51:32.244937   776   790 D VoLTE IMSM: ===> event queue = 0xf2a9a5a0, sim_id = 1, request_id = 16877724 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5177)
01-10 13:51:32.245006   776   790 D VoLTE IMSM: Receive IMCB sim_id=1 request_id=100508 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2386)
01-10 13:51:32.245023   776   790 D VoLTE IMSM: receive MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_IND, transaction_id = 2 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2886)
01-10 13:51:32.245046   776   790 D VoLTE IMSM: send MSG_ID_WRAP_IMSA_IMCB_SIM_QUERY_RSP, transaction_id = 2, sim_usim_type = 0, isim_type = 3, session_id = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:2907)
01-10 13:51:32.245058   776   790 I VoLTE IMSMx: IMSM -> IMCB : [1] SIM_QUERY_RSP
01-10 13:51:32.245166   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:32.245273   781   826 I chatty  : uid=1000(system) /vendor/bin/volte_imcb identical 1 line
01-10 13:51:32.245304   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:32.245466   776   828 I VoLTE IMSMx: IMSMMD -> IMSM : [0] AP_ID_SIMMNGR_SIM_INSERT_CHECK_CNF
01-10 13:51:32.245574   776   789 D VoLTE IMSM: ===> event queue = 0xf2a9a000, sim_id = 0, request_id = 800103 (module/mdagent/volte_imsm_93/src/imsm_handler.c:5177)
01-10 13:51:32.245653   776   789 D VoLTE IMSM: MSG_ID_WRAP_MAL_IMSM_SIM_INSERT_CHECK_NOTIFY_IND, flag = 0 (module/mdagent/volte_imsm_93/src/imsm_handler.c:4878)
01-10 13:51:32.245741   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100509(0x0001889D), dst=IMSA1[5], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 13:51:32.245741   781   781 I VoLTE IMCB: ENTER imsa_imcb_sim_query_rsp_handler()@1#1081
01-10 13:51:32.245741   781   781 I VoLTE IMCB: transaction_id:2, sim_usim_type:0, isim_type:3, session_id:0 @1#1084
01-10 13:51:32.245741   781   781 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.245741   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.245898   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:32.246196   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100035(0x000186C3), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:32.246196   781   781 I VoLTE IMCB: ENTER imcb_imc_imsvops_notification_ind_handler()@0#5379
01-10 13:51:32.246196   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=12045(0x00002F0D), len=8, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.246196   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.246356   780   818 I VoLTE SMS: SMS[0] update is_vops = (0) (module/volte//volte_ua/src/sms/sms.c:2935)
01-10 13:51:32.246400   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:32.246646   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:32.246646   781   781 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@0#5493
01-10 13:51:32.246646   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=32, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.246646   781   781 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@0#5518
01-10 13:51:32.246646   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.246728   780   818 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 13:51:32.246757   780   818 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 13:51:32.246791   780   818 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 13:51:32.246983   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:32.247338   779   811 I VoLTE REG: rcs_feature = 0 (module/volte//volte_stack/src/reg/reg.c:3230)
01-10 13:51:32.247387   779   811 I VoLTE REG: rcs_state = 0 (module/volte//volte_stack/src/reg/reg.c:3233)
01-10 13:51:32.247768   581   581 D HWUIExtension: 16 Program id 19, key 0x0002080000d00041, offset 110040, binaryLength 12592 within 71579ns
01-10 13:51:32.247843   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:32.247873   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:32.247887   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:32.247916   380   697 D NVRAM   : +GetDualMicSpeechParamFromNVRam audio_nvram_fd.lid = 59, rec_size=936, rec_num=1
01-10 13:51:32.248030   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100118(0x00018716), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:32.248030   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:32.248030   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#248
01-10 13:51:32.248030   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.248351   780   818 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 13:51:32.248434   780   818 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 13:51:32.249128   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100035(0x000186C3), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 13:51:32.249128   781   781 I VoLTE IMCB: ENTER imcb_imc_imsvops_notification_ind_handler()@1#5379
01-10 13:51:32.249128   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=12045(0x00002F0D), len=8, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.249128   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.249270   780   818 I VoLTE SMS: SMS[2] update is_vops = (0) (module/volte//volte_ua/src/sms/sms.c:2935)
01-10 13:51:32.250061   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 13:51:32.250061   781   781 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@1#5493
01-10 13:51:32.250061   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=32, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.250061   781   781 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@1#5518
01-10 13:51:32.250061   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.250228   780   818 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 13:51:32.250281   780   818 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 13:51:32.250317   780   818 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 13:51:32.250768   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:32.250813   380   697 D AudioSpeechEnhanceInfo: PreLoadBesRecordParams-
01-10 13:51:32.250953   380   697 D GainTableParamParser: getInstance()
01-10 13:51:32.251008   380   697 D GainTableParamParser: GainTableParamParser()
01-10 13:51:32.251021   380   697 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 13:51:32.251229   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.251475   380   697 D GainTableParamParser: loadGainTableSpec()
01-10 13:51:32.251573   380   697 D GainTableParamParser: mSpec.audioBufferGainPreferMaxIdx = 18
01-10 13:51:32.251590   380   697 D GainTableParamParser: mSpec.audioBufLMixerName = Headset_PGAL_GAIN
01-10 13:51:32.251603   380   697 D GainTableParamParser: mSpec.audioBufRMixerName = Headset_PGAR_GAIN
01-10 13:51:32.251626   380   697 D GainTableParamParser: mSpec.voiceBufferGainPreferMaxIdx = 18
01-10 13:51:32.251639   380   697 D GainTableParamParser: mSpec.voiceBufMixerName = Handset_PGA_GAIN
01-10 13:51:32.251665   380   697 D GainTableParamParser: mSpec.lineoutBufferGainPreferMaxIdx = 18
01-10 13:51:32.251695   380   697 D GainTableParamParser: mSpec.spkAnaType = 3
01-10 13:51:32.251707   380   697 D GainTableParamParser: mSpec.spkLMixerName = Lineout_PGAL_GAIN
01-10 13:51:32.251718   380   697 D GainTableParamParser: mSpec.spkRMixerName = Lineout_PGAR_GAIN
01-10 13:51:32.251729   380   697 D GainTableParamParser: spk, db = -64, idx = 0
01-10 13:51:32.251739   380   697 D GainTableParamParser: spk, db = 0, idx = 1
01-10 13:51:32.251749   380   697 D GainTableParamParser: spk, db = 4, idx = 2
01-10 13:51:32.251766   380   697 D GainTableParamParser: spk, db = 5, idx = 3
01-10 13:51:32.251774   380   697 D GainTableParamParser: spk, db = 6, idx = 4
01-10 13:51:32.251783   380   697 D GainTableParamParser: spk, db = 7, idx = 5
01-10 13:51:32.251792   380   697 D GainTableParamParser: spk, db = 8, idx = 6
01-10 13:51:32.251801   380   697 D GainTableParamParser: spk, db = 9, idx = 7
01-10 13:51:32.251811   380   697 D GainTableParamParser: spk, db = 10, idx = 8
01-10 13:51:32.251821   380   697 D GainTableParamParser: spk, db = 11, idx = 9
01-10 13:51:32.251831   380   697 D GainTableParamParser: spk, db = 12, idx = 10
01-10 13:51:32.251842   380   697 D GainTableParamParser: spk, db = 13, idx = 11
01-10 13:51:32.251851   380   697 D GainTableParamParser: spk, db = 14, idx = 12
01-10 13:51:32.251861   380   697 D GainTableParamParser: spk, db = 15, idx = 13
01-10 13:51:32.251875   380   697 D GainTableParamParser: spk, db = 16, idx = 14
01-10 13:51:32.251889   380   697 D GainTableParamParser: spk, db = 17, idx = 15
01-10 13:51:32.251911   380   697 D GainTableParamParser: mSpec.ulPgaLMixerName = Audio_PGA1_Setting
01-10 13:51:32.251922   380   697 D GainTableParamParser: mSpec.ulPgaRMixerName = Audio_PGA2_Setting
01-10 13:51:32.251937   380   697 D GainTableParamParser: loadGainTableMapDl()
01-10 13:51:32.252034   380   697 W GainTableParamParser: error: get paramUnit fail, paramPath = Profile,HSSPK
01-10 13:51:32.252157   380   697 D GainTableParamParser: loadGainTableMapUl()
01-10 13:51:32.252376   380   697 D GainTableParamParser: loadGainTableHpImpedance()
01-10 13:51:32.252414   380   697 D GainTableParamParser: mSpec.hpImpEnable = 1
01-10 13:51:32.252430   380   697 D GainTableParamParser: mSpec.hpImpDefaultIdx = 1
01-10 13:51:32.252445   380   697 D GainTableParamParser: getSceneList()
01-10 13:51:32.252470   380   697 D AudioMTKGainController: allocateGainTable()
01-10 13:51:32.252533   380   697 D GainTableParamParser: getGainTableParam()
01-10 13:51:32.252574   380   697 D GainTableParamParser: updatePlaybackDigitalGain()
01-10 13:51:32.252755   779   811 E VoLTE REG: invalid rcs information (module/volte//volte_stack/src/reg/reg.c:3221)
01-10 13:51:32.255487   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.255640   567   630 D PQTransition: onTransition: TRS: Mode2 (49)
01-10 13:51:32.255761   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.255789   527   558 D AAL     : 01-10 01:51:32.180 BL= 917,ESS= 256, 01-10 01:51:32.199 BL= 916,ESS= 256, 01-10 01:51:32.218 BL= 915,ESS= 256, 01-10 01:51:32.236 BL= 914,ESS= 256, 01-10 01:51:32.255 BL= 913,ESS= 256, 
01-10 13:51:32.255832   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 2
01-10 13:51:32.255977   380   697 D GainTableParamParser: updatePlaybackAnalogGain()
01-10 13:51:32.261969   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100118(0x00018716), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 13:51:32.261969   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:32.261969   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=1000001(0x000F4241), len=40, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#248
01-10 13:51:32.261969   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:32.262117   780   818 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 13:51:32.262166   780   818 E VoLTE SMS: Error message type in SMS service message queue, type = 1000001, len = 40 (module/volte//volte_ua/src/sms/sms.c:2942)
01-10 13:51:32.264858   380   697 D GainTableParamParser: updateSpeechVol()
01-10 13:51:32.265317   380   697 W GainTableParamParser: 	continue, paramPath = Band,NB,Profile,USB,Network,GSM, mMapDlAnalogType[13] = -1
01-10 13:51:32.265795   380   697 W GainTableParamParser: 	continue, paramPath = Band,WB,Profile,USB,Network,GSM, mMapDlAnalogType[13] = -1
01-10 13:51:32.266150   380   697 W GainTableParamParser: 	continue, paramPath = Band,SWB,Profile,USB,Network,GSM, mMapDlAnalogType[13] = -1
01-10 13:51:32.266586   380   697 W GainTableParamParser: 	continue, paramPath = Band,NB,Profile,USB,Network,WCDMA, mMapDlAnalogType[13] = -1
01-10 13:51:32.266949   380   697 W GainTableParamParser: 	continue, paramPath = Band,WB,Profile,USB,Network,WCDMA, mMapDlAnalogType[13] = -1
01-10 13:51:32.267298   380   697 W GainTableParamParser: 	continue, paramPath = Band,SWB,Profile,USB,Network,WCDMA, mMapDlAnalogType[13] = -1
01-10 13:51:32.267644   380   697 W GainTableParamParser: 	continue, paramPath = Band,NB,Profile,USB,Network,VoLTE, mMapDlAnalogType[13] = -1
01-10 13:51:32.267988   380   697 W GainTableParamParser: 	continue, paramPath = Band,WB,Profile,USB,Network,VoLTE, mMapDlAnalogType[13] = -1
01-10 13:51:32.268340   380   697 W GainTableParamParser: 	continue, paramPath = Band,SWB,Profile,USB,Network,VoLTE, mMapDlAnalogType[13] = -1
01-10 13:51:32.268415   380   697 D GainTableParamParser: updateRecordVol()
01-10 13:51:32.269834   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.274302   567   630 D PQ      : ccorr table index=0
01-10 13:51:32.274419   567   630 D PQTransition: onTransition: TRS: Mode2 (50)
01-10 13:51:32.274531   567   630 D PQTransition: CheckIfFinished: TRS: CheckIfFinished(EN=1)
01-10 13:51:32.274544   567   630 D PQTransition: CheckIfFinished: TRS: Finished
01-10 13:51:32.274568   567   630 D PQ      : [PQ_SERVICE]enablePQEvent: 1 -> 0
01-10 13:51:32.274642   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 3
01-10 13:51:32.280056   380   697 D GainTableParamParser: updateVoIPVol()
01-10 13:51:32.280424   380   697 W GainTableParamParser: 	continue, paramPath = Scene,Default,Profile,USB, mMapDlAnalogType[13] = -1
01-10 13:51:32.280499   380   697 D GainTableParamParser: updateRingbackVol()
01-10 13:51:32.280842   380   697 D AudioMTKGainController: mMixer = 0xe74dd000
01-10 13:51:32.280964   380   697 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 13:51:32.281880   380   697 D SpeechDriverFactory: SpeechDriverFactory(), isMD1Supported = 11
01-10 13:51:32.281964   380   697 D SpeechDriverFactory: Create SpeechDriverNormal for MODEM_1
01-10 13:51:32.282043   380   697 D         : CleanGainValueAndMuteStatus(), mUplinkMuteOn 0
01-10 13:51:32.284819   380   697 D SpeechMessengerNormal: openCcciDriver(), ccci_md: 0, dev_name: "/dev/ccci_aud", mCcciDeviceHandler: 18
01-10 13:51:32.287486   380   697 D ccci_lib: mmap on /dev/ccci_raw_audio(19) for addr=0x8001b000, len=53248
01-10 13:51:32.293280   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.311382   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.328149   581   581 D HWUIExtension: 17 Program id 20, key 0x0002080000900041, offset 122632, binaryLength 12848 within 80228ns
01-10 13:51:32.335171   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.349929   527   558 D AAL     : 01-10 01:51:32.274 BL= 912,ESS= 256, 01-10 01:51:32.293 BL= 913,ESS= 256, 01-10 01:51:32.312 BL= 914,ESS= 256, 01-10 01:51:32.331 BL= 915,ESS= 256, 01-10 01:51:32.349 BL= 916,ESS= 256, 
01-10 13:51:32.351594   551   838 I DJobMgr : [watch_dogs_job] start WatchDog@DJobMgr
01-10 13:51:32.352262   551   551 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 13:51:32.353158   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.376826   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.396258   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.397350   581   581 D HWUIExtension: 18 Program id 21, key 0x0002080800000003, offset 135480, binaryLength 12588 within 69052ns
01-10 13:51:32.398178   551   551 I mtkcam-devicemgr: [initialize] +
01-10 13:51:32.407366   551   551 I mtkcam-module: [ModuleStore] ctor
01-10 13:51:32.407512   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x1 module_factory:0xea0ec2cd register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/drv/register_HalSensor.cpp
01-10 13:51:32.407531   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x2 module_factory:0xea0ee565 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/drv/register_HwSyncDrv.cpp
01-10 13:51:32.407548   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x3 module_factory:0xea71d8b1 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/drv/register_iopipe_CamIO_NormalPipe.cpp
01-10 13:51:32.407563   551   551 I mtkcam-module: [ShowLoading] loading (MODULE_GROUP_ID:0 MODULE_GROUP_COUNT:4 ...
01-10 13:51:32.407807   551   551 I mtkcam-module: [load] MtkCam_getModuleFactory_drv(0xe8987e89) @ libmtkcam_modulefactory_drv.so
01-10 13:51:32.407916   551   551 D SeninfDrvImp: [SeninfDrvImp][SeninfDrvImp] 
01-10 13:51:32.407988   551   551 D SeninfDrvImp: [init][init]: Entry count 0 
01-10 13:51:32.413780   551   551 D SeninfDrvImp: [init]Efuse Data:0x11f1018c= 0x8c631940, 0x11f10190= 0x7c208364, 0x11f101bc= 0x80000000
01-10 13:51:32.413881   551   551 D SeninfDrvImp: [init][init]: Exit count 1 
01-10 13:51:32.413963   551   551 D SeninfDrvImp: [setMclk1IODrivingCurrent]DrivingIdx(3), Reg(0x30000000)
01-10 13:51:32.413987   551   551 D SeninfDrvImp: [setMclk2IODrivingCurrent]DrivingIdx(3), Reg(0x00000003)
01-10 13:51:32.414067   551   551 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(0)
01-10 13:51:32.414096   551   551 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(0), SENINF_TG1_PH_CNT(0x80000001)
01-10 13:51:32.414336   551   551 D SeninfDrvImp: [setMclk2][setTg2Phase]pcEn(1), clkPol(0), mMclk2User(1), TimestampClk(0), SENINF_TG2_PH_CNT(0x0)
01-10 13:51:32.414611   551   551 D ImgSensorDrv: [init][init] imgsensor_drv 1
01-10 13:51:32.414692   551   551 D ImgSensorDrv: [searchSensor]SENSOR search start 
01-10 13:51:32.418608   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.426247   581   581 D HWUIExtension: 19 Program id 22, key 0x0000000800500040, offset 148068, binaryLength 4496 within 28682ns
01-10 13:51:32.427254   581   581 D HWUIExtension: 20 Program id 23, key 0x0000000000000001, offset 152564, binaryLength 4944 within 851ns
01-10 13:51:32.427983   581   581 D HWUIExtension: 21 Program id 24, key 0x0000000800000000, offset 157508, binaryLength 4420 within 616ns
01-10 13:51:32.428741   581   581 D HWUIExtension: 22 Program id 25, key 0x0000000000500040, offset 161928, binaryLength 4496 within 663ns
01-10 13:51:32.439936   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.444296   527   558 D AAL     : 01-10 01:51:32.369 BL= 917,ESS= 256, 01-10 01:51:32.387 BL= 918,ESS= 256, 01-10 01:51:32.406 BL= 919,ESS= 256, 01-10 01:51:32.425 BL= 920,ESS= 256, 01-10 01:51:32.444 BL= 921,ESS= 256, 
01-10 13:51:32.446459   551   551 D ImgSensorDrv: [searchSensor]set sensor driver id =1
01-10 13:51:32.446532   551   551 D ImgSensorDrv: [searchSensor]found <0x30c8/s5k3l8_mipi_raw/SENSOR_DRVNAME_S5K3L8_MIPI_RAW>
01-10 13:51:32.446688   551   551 D ImgSensorDrv: [getInfo2]prv w=0x838,h=0x618
01-10 13:51:32.446718   551   551 D ImgSensorDrv: [getInfo2]cap w=0x1070,h=0xc30
01-10 13:51:32.446730   551   551 D ImgSensorDrv: [getInfo2]vd  w=0x1070,h=0xc30
01-10 13:51:32.446741   551   551 D ImgSensorDrv: [getInfo2]pre GrapX=0x0,GrapY=0x0
01-10 13:51:32.455540   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.456298   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_COMMON not found
01-10 13:51:32.456892   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.457460   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_COMMON not found
01-10 13:51:32.459217   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.459938   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_COMMON not found
01-10 13:51:32.460488   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.460586   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.461016   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_COMMON not found
01-10 13:51:32.461696   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.462457   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_COMMON not found
01-10 13:51:32.463279   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.463944   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_COMMON not found
01-10 13:51:32.464616   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.465156   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_COMMON not found
01-10 13:51:32.465740   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.466218   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_COMMON not found
01-10 13:51:32.466654   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.467085   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_COMMON not found
01-10 13:51:32.467512   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.467940   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_COMMON not found
01-10 13:51:32.468405   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_SENSOR_DRVNAME_S5K3L8_MIPI_RAW not found
01-10 13:51:32.468909   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_COMMON not found
01-10 13:51:32.469331   551   551 D ImgSensorDrv: [searchSensor]SENSOR search start 
01-10 13:51:32.475803   581   581 D HWUIExtension: 23 Program id 26, key 0x0002000000d00041, offset 166424, binaryLength 5148 within 46932ns
01-10 13:51:32.478815   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.481178   534   534 E VT      : [VTS] after addService 0
01-10 13:51:32.481307   534   534 I VT      : [SRV] [VT THREAD] VT_Connect start
01-10 13:51:32.481335   534   534 I VT      : [VT] [DISPATCHER] VTMsgDispatcher Constuctor
01-10 13:51:32.481352   534   534 I VT      : [VT] [DISPATCHER] VTMsgDispatcher init
01-10 13:51:32.482110   534   534 I VT      : [SRV] [VT THREAD] VT_Connect finish
01-10 13:51:32.482261   534   534 W VT      : [SRV] [VTCoreHelper] VTCoreHelper create
01-10 13:51:32.482305   534   534 I VT      : [SRV] [OPERATION][ID=1000] VTMALStub (VTMALStub)
01-10 13:51:32.482326   534   534 I VT      : [SRV] [OPERATION][ID=1000] VTMALStub (sim_id = 0)
01-10 13:51:32.482352   534   534 I VT      : [SRV] [CALL FLOW] create ( : )
01-10 13:51:32.482638   534   534 W AVSync  : VTAVSync enter!!!
01-10 13:51:32.483424   534   534 W AVSync  : open /dev/ccci_imsdc done, fd=9
01-10 13:51:32.483513   534   534 I AVSync  : CCCI status:MD ready
01-10 13:51:32.483569   534   534 I AVSync  : avInit, st 27c3a116b, int=a, frac=acc69018
01-10 13:51:32.483773   534   534 W VT      : [SRV] [VTCoreHelper] VTCoreHelper init
01-10 13:51:32.483775   534   847 I VT      : [SRV] [VT THREAD] VT_Bind start
01-10 13:51:32.483801   534   534 I VT      : [SRV]   [MAP OPERATION]  clearElement ()
01-10 13:51:32.483841   534   534 I chatty  : uid=1000(system) /system/bin/vtservice identical 3 lines
01-10 13:51:32.483854   534   534 I VT      : [SRV]   [MAP OPERATION]  clearElement ()
01-10 13:51:32.483872   534   534 I VT      : [SRV] [CALL FLOW][ID=1000] create (User ID is :  : )
01-10 13:51:32.483896   534   534 I         : [VT][SRV]after VTService_instantiate
01-10 13:51:32.485712   534   848 W AVSync  : [AVSYNC] downlink_thread() entry
01-10 13:51:32.485850   534   848 E AVSync  : g_fd_avsync =9
01-10 13:51:32.488466   534   847 I VT      : [SRV] [THREAD] get hild success
01-10 13:51:32.489131   379   379 D VT HIDL : [IVT] configureFmqMode
01-10 13:51:32.489254   379   379 I VT HIDL : [IVT] configureFmqMode, getInstance wait client
01-10 13:51:32.489492   379   379 D VT HIDL : [IVT] configureFmqSyncRead
01-10 13:51:32.490203   379   379 D VT HIDL : [IVT] configureFmqSyncRead success
01-10 13:51:32.490277   379   379 D VT HIDL : [IVT] configureFmqSyncRead, evFlagWordPtr init done
01-10 13:51:32.490459   379   379 I VT HIDL : [IVT] configureFmqSyncRead, getInstance wait client
01-10 13:51:32.490838   379   379 D VT HIDL : [IVT] configureFmqSyncWrite
01-10 13:51:32.491100   379   379 D VT HIDL : [IVT] configureFmqSyncWrite success
01-10 13:51:32.491138   379   379 D VT HIDL : [IVT] configureFmqSyncWrite, evFlagWordPtr init done
01-10 13:51:32.491309   379   379 D VT HIDL : [IVT] initialization
01-10 13:51:32.491546   379   379 D VT HIDL : [IVT] isImsVideoCallon : True
01-10 13:51:32.491810   379   379 D VT HIDL : [IVT] isImsVideoCallon : True
01-10 13:51:32.492247   534   847 I VT      : [SRV] [VT THREAD] VT_Bind start finish
01-10 13:51:32.493566   379   852 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] start
01-10 13:51:32.493639   379   852 D VT HIDL : [IVT] getInstance
01-10 13:51:32.493659   379   852 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] read from VTS
01-10 13:51:32.495118   575   575 I NetdagentController: Initializing iptables: 1938.4ms
01-10 13:51:32.497675   379   853 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] start
01-10 13:51:32.497755   379   853 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1
01-10 13:51:32.498052   379   853 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 fd = -1
01-10 13:51:32.498113   379   853 D VT HIDL : [IVT] isIMCBrun : True
01-10 13:51:32.502575   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.520894   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.529679   525   525 D Zygote  : begin preload
01-10 13:51:32.529855   525   525 I Zygote  : Installing ICU cache reference pinning...
01-10 13:51:32.529882   525   525 I Zygote  : Preloading ICU data...
01-10 13:51:32.535880   581   581 D HWUIExtension: 24 Program id 27, key 0x000201080000000b, offset 171572, binaryLength 11808 within 59923ns
01-10 13:51:32.536586   581   581 D HWUIExtension: 25 Program id 28, key 0x0000001800500040, offset 183380, binaryLength 4792 within 576ns
01-10 13:51:32.539028   527   558 D AAL     : 01-10 01:51:32.463 BL= 922,ESS= 256, 01-10 01:51:32.481 BL= 923,ESS= 256, 01-10 01:51:32.501 BL= 924,ESS= 256, 01-10 01:51:32.519 BL= 925,ESS= 256, 01-10 01:51:32.538 BL= 926,ESS= 256, 
01-10 13:51:32.539978   581   581 I ProgramBinary/Builder: ProgramEntry # 0: key 0x0000000000000000, offset      0, binaryLength 4420, format 36705 --> 0x4d 0x50 0x42 0x31 0x3c 0x11 0x00 0x00 0x02 0x00
01-10 13:51:32.540085   581   581 I ProgramBinary/Builder: ProgramEntry # 1: key 0x0000001000500040, offset   4420, binaryLength 4792, format 36705 --> 0x4d 0x50 0x42 0x31 0xb0 0x12 0x00 0x00 0x02 0x00
01-10 13:51:32.540102   581   581 I ProgramBinary/Builder: ProgramEntry # 2: key 0x0000003800000000, offset   9212, binaryLength 4812, format 36705 --> 0x4d 0x50 0x42 0x31 0xc4 0x12 0x00 0x00 0x02 0x00
01-10 13:51:32.540116   581   581 I ProgramBinary/Builder: ProgramEntry # 3: key 0x0002000000000001, offset  14024, binaryLength 4944, format 36705 --> 0x4d 0x50 0x42 0x31 0x48 0x13 0x00 0x00 0x02 0x00
01-10 13:51:32.540131   581   581 I ProgramBinary/Builder: ProgramEntry # 4: key 0x0002000000000003, offset  18968, binaryLength 4944, format 36705 --> 0x4d 0x50 0x42 0x31 0x48 0x13 0x00 0x00 0x02 0x00
01-10 13:51:32.540146   581   581 I ProgramBinary/Builder: ProgramEntry # 5: key 0x0002000000500041, offset  23912, binaryLength 5148, format 36705 --> 0x4d 0x50 0x42 0x31 0x14 0x14 0x00 0x00 0x02 0x00
01-10 13:51:32.540161   581   581 I ProgramBinary/Builder: ProgramEntry # 6: key 0x0000001000000000, offset  29060, binaryLength 4648, format 36705 --> 0x4d 0x50 0x42 0x31 0x20 0x12 0x00 0x00 0x02 0x00
01-10 13:51:32.540175   581   581 I ProgramBinary/Builder: ProgramEntry # 7: key 0x0002000800000003, offset  33708, binaryLength 5140, format 36705 --> 0x4d 0x50 0x42 0x31 0x0c 0x14 0x00 0x00 0x02 0x00
01-10 13:51:32.540191   581   581 I ProgramBinary/Builder: ProgramEntry # 8: key 0x0000010000000008, offset  38848, binaryLength 9412, format 36705 --> 0x4d 0x50 0x42 0x31 0xbc 0x24 0x00 0x00 0x02 0x00
01-10 13:51:32.540205   581   581 I ProgramBinary/Builder: ProgramEntry # 9: key 0x0002000800000001, offset  48260, binaryLength 5140, format 36705 --> 0x4d 0x50 0x42 0x31 0x0c 0x14 0x00 0x00 0x02 0x00
01-10 13:51:32.540220   581   581 I ProgramBinary/Builder: ProgramEntry #10: key 0x0000001800000000, offset  53400, binaryLength 4648, format 36705 --> 0x4d 0x50 0x42 0x31 0x20 0x12 0x00 0x00 0x02 0x00
01-10 13:51:32.540234   581   581 I ProgramBinary/Builder: ProgramEntry #11: key 0x0002001800500044, offset  58048, binaryLength 10924, format 36705 --> 0x4d 0x50 0x42 0x31 0xa4 0x2a 0x00 0x00 0x02 0x00
01-10 13:51:32.540248   581   581 I ProgramBinary/Builder: ProgramEntry #12: key 0x0000001000000008, offset  68972, binaryLength 11256, format 36705 --> 0x4d 0x50 0x42 0x31 0xf0 0x2b 0x00 0x00 0x02 0x00
01-10 13:51:32.540263   581   581 I ProgramBinary/Builder: ProgramEntry #13: key 0x0002000000900041, offset  80228, binaryLength 5204, format 36705 --> 0x4d 0x50 0x42 0x31 0x4c 0x14 0x00 0x00 0x02 0x00
01-10 13:51:32.540277   581   581 I ProgramBinary/Builder: ProgramEntry #14: key 0x0000081000000000, offset  85432, binaryLength 12020, format 36705 --> 0x4d 0x50 0x42 0x31 0xec 0x2e 0x00 0x00 0x02 0x00
01-10 13:51:32.540291   581   581 I ProgramBinary/Builder: ProgramEntry #15: key 0x0002080800000001, offset  97452, binaryLength 12588, format 36705 --> 0x4d 0x50 0x42 0x31 0x24 0x31 0x00 0x00 0x02 0x00
01-10 13:51:32.540305   581   581 I ProgramBinary/Builder: ProgramEntry #16: key 0x0002080000d00041, offset 110040, binaryLength 12592, format 36705 --> 0x4d 0x50 0x42 0x31 0x28 0x31 0x00 0x00 0x02 0x00
01-10 13:51:32.540319   581   581 I ProgramBinary/Builder: ProgramEntry #17: key 0x0002080000900041, offset 122632, binaryLength 12848, format 36705 --> 0x4d 0x50 0x42 0x31 0x28 0x32 0x00 0x00 0x02 0x00
01-10 13:51:32.540333   581   581 I ProgramBinary/Builder: ProgramEntry #18: key 0x0002080800000003, offset 135480, binaryLength 12588, format 36705 --> 0x4d 0x50 0x42 0x31 0x24 0x31 0x00 0x00 0x02 0x00
01-10 13:51:32.540348   581   581 I ProgramBinary/Builder: ProgramEntry #19: key 0x0000000800500040, offset 148068, binaryLength 4496, format 36705 --> 0x4d 0x50 0x42 0x31 0x88 0x11 0x00 0x00 0x02 0x00
01-10 13:51:32.540362   581   581 I ProgramBinary/Builder: ProgramEntry #20: key 0x0000000000000001, offset 152564, binaryLength 4944, format 36705 --> 0x4d 0x50 0x42 0x31 0x48 0x13 0x00 0x00 0x02 0x00
01-10 13:51:32.540376   581   581 I ProgramBinary/Builder: ProgramEntry #21: key 0x0000000800000000, offset 157508, binaryLength 4420, format 36705 --> 0x4d 0x50 0x42 0x31 0x3c 0x11 0x00 0x00 0x02 0x00
01-10 13:51:32.540390   581   581 I ProgramBinary/Builder: ProgramEntry #22: key 0x0000000000500040, offset 161928, binaryLength 4496, format 36705 --> 0x4d 0x50 0x42 0x31 0x88 0x11 0x00 0x00 0x02 0x00
01-10 13:51:32.540404   581   581 I ProgramBinary/Builder: ProgramEntry #23: key 0x0002000000d00041, offset 166424, binaryLength 5148, format 36705 --> 0x4d 0x50 0x42 0x31 0x14 0x14 0x00 0x00 0x02 0x00
01-10 13:51:32.540418   581   581 I ProgramBinary/Builder: ProgramEntry #24: key 0x000201080000000b, offset 171572, binaryLength 11808, format 36705 --> 0x4d 0x50 0x42 0x31 0x18 0x2e 0x00 0x00 0x02 0x00
01-10 13:51:32.540433   581   581 I ProgramBinary/Builder: ProgramEntry #25: key 0x0000001800500040, offset 183380, binaryLength 4792, format 36705 --> 0x4d 0x50 0x42 0x31 0xb0 0x12 0x00 0x00 0x02 0x00
01-10 13:51:32.540481   581   581 I ProgramBinary/Builder: Build program succeeded.
01-10 13:51:32.543065   581   581 I ProgramBinary/Builder: Build program result is sending to server...
01-10 13:51:32.543289   581   581 I ProgramBinary/Service: ProgramBinaryService client side disable debugging.
01-10 13:51:32.543373   581   581 I ProgramBinary/Service: ProgramBinaryService client side disable binary content debugging.
01-10 13:51:32.543393   581   581 D ProgramBinary/Service: BpProgramBinaryService.setProgramBinaryData
01-10 13:51:32.543632   571   580 D ProgramBinary/Service: zhiyin- ontransact 1 code 4
01-10 13:51:32.543978   581   581 D ProgramBinary/Service: BpProgramBuilderService.setReady
01-10 13:51:32.544064   571   580 D ProgramBinary/Service: zhiyin- ontransact 1 code 2
01-10 13:51:32.544186   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.544156   581   581 I ProgramBinary/Builder: Build program result: Build is Successful & Send is Successful.
01-10 13:51:32.544225   581   581 I ProgramBinary/Builder: Program binary builder ended!
01-10 13:51:32.544234   581   581 I ProgramBinary/Builder: Build program desctruct.
01-10 13:51:32.550081   581   581 I         : [MALI] @eglp_check_display_valid_and_initialized_and_retain: MALI_EGL_DISPLAY_INITIALIZED != dpy->state (EGL_NOT_INITIALIZED)
01-10 13:51:32.562159   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.586305   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.603684   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.627995   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.632843   527   558 D AAL     : 01-10 01:51:32.557 BL= 927,ESS= 256, 01-10 01:51:32.576 BL= 928,ESS= 256, 01-10 01:51:32.595 BL= 929,ESS= 256, 01-10 01:51:32.613 BL= 930,ESS= 256, 01-10 01:51:32.632 BL= 931,ESS= 256, 
01-10 13:51:32.633956   409   409 I [WFCA]  : CCCI status:MD ready
01-10 13:51:32.634095   409   409 I [WFCA]  : Init imsx:/dev/ccci_imsa, 3
01-10 13:51:32.634110   409   409 I [WFCA]  : Init IPC MDM ringbuf
01-10 13:51:32.634130   409   409 I [WFCA]  : open ipc wfca
01-10 13:51:32.634380   409   409 I [WFCA]  : open ipc wfca_rds
01-10 13:51:32.634469   409   856 I [WFCA]  : listen_fd thread created
01-10 13:51:32.634526   409   409 I [WFCA]  : open ipc MDM_rtp_OTA_msg_ctrl
01-10 13:51:32.634558   409   857 I [WFCA]  : listen thread created
01-10 13:51:32.634599   409   409 I [WFCA]  : unix_socket: MDM_rtp_OTA_msg_ctrl
01-10 13:51:32.634739   409   858 I [WFCA]  : MDM ctrl thread created
01-10 13:51:32.637352   551   551 D ImgSensorDrv: [searchSensor]set sensor driver id =2
01-10 13:51:32.637600   551   551 D ImgSensorDrv: [searchSensor]found <0x7750/ov7251/SENSOR_DRVNAME_OV7251_MIPI_RAW>
01-10 13:51:32.637754   551   551 D ImgSensorDrv: [getInfo2]prv w=0x280,h=0x1e0
01-10 13:51:32.637766   551   551 D ImgSensorDrv: [getInfo2]cap w=0x280,h=0x1e0
01-10 13:51:32.637776   551   551 D ImgSensorDrv: [getInfo2]vd  w=0x280,h=0x1e0
01-10 13:51:32.637787   551   551 D ImgSensorDrv: [getInfo2]pre GrapX=0x0,GrapY=0x0
01-10 13:51:32.639593   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_LENS_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.641167   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SENSOR_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.641520   561   634 D agps    : [agps] WARNING: [CP] cp2_fd_1_req_sim_num_timeout
01-10 13:51:32.641766   561   591 D agps    : [agps][n][CP] [MD_1] write  sim_info_req  gsm_disabled=[0] umts_disabled=[0] lte_disabled=[0] lppe_enable=[1] lppe_network_location_disable=[0] reject_non911_nilr_enable=[0] battery_percentage=[100]
01-10 13:51:32.642676   561   591 D agps    : [agps][n][CP] [MD_1] read  sim_info_rsp  sim_number=2 md_type=0 (0=fdd, 1=tdd) ecid=1 otdoa=0 band_num=0
01-10 13:51:32.642717   561   591 E agps    : [agps] ERR: [CP] band_num is not ready  retry=0
01-10 13:51:32.644189   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_TUNING_3A_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.645618   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.648448   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FLASHLIGHT_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.650844   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.652102   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_SCALER_COMMON not found
01-10 13:51:32.653272   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.654149   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_FEATURE_COMMON not found
01-10 13:51:32.654712   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_CAMERA_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.655301   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_CAMERA_COMMON not found
01-10 13:51:32.655983   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.656650   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_DEVICE_REQUEST_COMMON not found
01-10 13:51:32.657162   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.657705   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_LENS_COMMON not found
01-10 13:51:32.658289   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.658961   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SENSOR_COMMON not found
01-10 13:51:32.659628   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.659881   409   409 I [WFCA]  : CCCI status:MD ready
01-10 13:51:32.659936   409   409 I [WFCA]  : Init imsx:/dev/ccci_imsa, 3
01-10 13:51:32.659989   409   409 I [WFCA]  : WFCA Reset success
01-10 13:51:32.660158   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_TUNING_3A_COMMON not found
01-10 13:51:32.660653   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.661227   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FLASHLIGHT_COMMON not found
01-10 13:51:32.661408   525   525 I Zygote  : Preloading classes...
01-10 13:51:32.662054   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.662623   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_SCALER_COMMON not found
01-10 13:51:32.663204   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.663689   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_FEATURE_COMMON not found
01-10 13:51:32.664142   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.664603   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_CAMERA_COMMON not found
01-10 13:51:32.665042   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_SENSOR_DRVNAME_OV7251_MIPI_RAW not found
01-10 13:51:32.665529   551   551 W MtkCam/HalSensorList: [impConstructStaticMetadata_by_SymbolName] constructCustStaticMetadata_PROJECT_REQUEST_COMMON not found
01-10 13:51:32.667283   551   551 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(0)
01-10 13:51:32.667404   551   551 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(0), SENINF_TG1_PH_CNT(0x1)
01-10 13:51:32.667669   551   551 D SeninfDrvImp: [setMclk2][setTg2Phase]pcEn(0), clkPol(0), mMclk2User(0), TimestampClk(0), SENINF_TG2_PH_CNT(0x0)
01-10 13:51:32.667877   551   551 D SeninfDrvImp: [uninit][uninit]: 1 
01-10 13:51:32.667972   551   551 D SeninfDrvImp: [uninit][uninit]: 0, mfd(8) 
01-10 13:51:32.669931   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.671764   551   551 D ImgSensorDrv: [uninit][uninit] imgsensor_drv 0
01-10 13:51:32.671959   551   551 I mtkcam-devicemgr: pHalSensorList:0xea12d3e8 searchSensors:1 queryNumberOfSensors:2
01-10 13:51:32.680680   525   525 I SystemServiceRegistry: regMtkService start
01-10 13:51:32.681337   525   525 I SystemServiceRegistry: setMtkSystemServiceName start
01-10 13:51:32.682799   525   525 I MtkSystemServiceRegistry: setMtkSystemServiceName start names{class android.service.oemlock.OemLockManager=oem_lock, class android.app.KeyguardManager=keyguard, class android.app.VrManager=vrmanager, class android.nfc.NfcManager=nfc, class android.view.textservice.TextServicesManager=textservices, class android.hardware.usb.UsbManager=usb, class android.net.NetworkScoreManager=network_score, class android.media.soundtrigger.SoundTriggerManager=soundtrigger, class android.os.storage.StorageManager=storage, class android.os.Vibrator=vibrator, class android.view.textclassifier.TextClassificationManager=textclassification, class android.app.timezone.RulesManager=timezone, class android.hardware.hdmi.HdmiControlManager=hdmi_control, class android.net.EthernetManager=ethernet, class android.app.UiModeManager=uimode, class android.companion.CompanionDeviceManager=companiondevice, class android.bluetooth.BluetoothManager=bluetooth, class android.os.DropBoxManager=dropbox, class android.media.session.MediaSessionManager=media_session, class android.content.ClipboardManager=clipboard, class android.hardware.display.DisplayManager=display, class android.os.RecoverySystem=recovery, class android.net.wifi.RttManager=rttmanager, class android.media.AudioManager=audio, class android.os.IncidentManager=incident, class android.app.admin.DevicePolicyManager=device_policy, class android.app.SearchManager=search, class android.app.ActivityManager=activity, class android.app.AppOpsManager=appops, class android.content.pm.LauncherApps=launcherapps, class android.hardware.camera2.CameraManager=camera, class android.hardware.radio.RadioManager=broadcastradio, class android.app.WallpaperManager=wallpaper, class android.os.HardwarePropertiesManager=hardware_properties, class android.app.job.JobScheduler=jobscheduler, class android.app.DownloadManager=download, class android.view.autofill.AutofillManager=autofill, class android.net.lowpan.LowpanManager=lowpan, class android.net.wifi.aware.WifiAwareManager=wifiaware, class android.app.AlarmManager=alarm, class android.os.PowerManager=power, class android.media.projection.MediaProjectionManager=media_projection, class android.net.IpSecManager=ipsec, class android.app.usage.NetworkStatsManager=netstats, class android.os.health.SystemHealthManager=systemhealth, class android.media.MediaRouter=media_router, class android.net.ConnectivityManager=connectivity, class android.telecom.TelecomManager=telecom, class android.app.StatusBarManager=statusbar, class android.hardware.SensorManager=sensor, class android.telephony.euicc.EuiccManager=euicc_service, class android.view.accessibility.CaptioningManager=captioning, class android.app.usage.UsageStatsManager=usagestats, class android.view.inputmethod.InputMethodManager=input_method, class android.hardware.ConsumerIrManager=consumer_ir, class android.net.wifi.WifiManager=wifi, class android.print.PrintManager=print, class android.telephony.CarrierConfigManager=carrier_config, class android.media.tv.TvInputManager=tv_input, class android.hardware.location.ContextHubManager=contexthub, class android.app.trust.TrustManager=trust, class android.os.UserManager=user, class android.location.CountryDetector=country_detector, class android.text.ClipboardManager=clipboard, class android.location.LocationManager=location, class android.net.wifi.WifiScanner=wifiscanner, class android.net.wifi.p2p.WifiP2pManager=wifip2p, interface android.view.WindowManager=window, class android.view.accessibility.AccessibilityManager=accessibility, class android.net.NetworkPolicyManager=netpolicy, class android.os.BatteryManager=batterymanager, class android.service.persistentdata.PersistentDataBlockManager=persistent_data_block, class android.app.NotificationManager=notification, class android.net.nsd.NsdManager=servicediscovery, class android.accounts.AccountManager=account, class android.hardware.SerialManager=serial, class android.telephony.SubscriptionManager=telephony_subscription_service, class android.content.pm.ShortcutManager=shortcut, class android
01-10 13:51:32.683063   525   525 I SystemServiceRegistry: registerAllMtkService start
01-10 13:51:32.683197   525   525 I MtkSystemServiceRegistry: registerAllService start
01-10 13:51:32.687456   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.700964   547   638 I ServiceManager: Waiting for service package_native...
01-10 13:51:32.712017   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.727196   527   558 D AAL     : 01-10 01:51:32.651 BL= 932,ESS= 256, 01-10 01:51:32.671 BL= 933,ESS= 256, 01-10 01:51:32.689 BL= 934,ESS= 256, 01-10 01:51:32.708 BL= 935,ESS= 256, 01-10 01:51:32.727 BL= 936,ESS= 256, 
01-10 13:51:32.729600   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.753718   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.770648   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.795446   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.812236   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.821374   527   558 D AAL     : 01-10 01:51:32.745 BL= 937,ESS= 256, 01-10 01:51:32.764 BL= 938,ESS= 256, 01-10 01:51:32.783 BL= 939,ESS= 256, 01-10 01:51:32.802 BL= 940,ESS= 256, 01-10 01:51:32.821 BL= 941,ESS= 256, 
01-10 13:51:32.837222   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.853686   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.865939   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=23.57 dur=1018.24 max=54.35 min=33.67
01-10 13:51:32.868968   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:23.558838,dur:1018.73,max:57.49,min:37.18
01-10 13:51:32.879054   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.888552   551   551 D AAALOGTAG:  3alog = 0, default = 0
01-10 13:51:32.889735   551   551 I mtkcam-module: [ModuleStore] ctor
01-10 13:51:32.889888   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x10001 module_factory:0xe6dc3b6d register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_Hal3A.cpp
01-10 13:51:32.889908   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x10002 module_factory:0xe6e94281 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_HalFlash.cpp
01-10 13:51:32.889922   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x10003 module_factory:0xe6dc3b71 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_IspMgrIf.cpp
01-10 13:51:32.889939   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x10005 module_factory:0xe6e73dad register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_SwNR.cpp
01-10 13:51:32.889955   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x10006 module_factory:0xe6cea5e9 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_DngInfo.cpp
01-10 13:51:32.889997   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x10007 module_factory:0xe7aa8791 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_NvBufUtil.cpp
01-10 13:51:32.890013   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x10008 module_factory:0xe8883c91 register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_LscTable.cpp
01-10 13:51:32.890028   551   551 I mtkcam-module: [dump_module] [registered] module_id:0x0x10009 module_factory:0xe8657f2d register_name:vendor/mediatek/proprietary/hardware/mtkcam/main/core/module/aaa/register_lcs_hal.cpp
01-10 13:51:32.890045   551   551 I mtkcam-module: [ShowLoading] loading (MODULE_GROUP_ID:1 MODULE_GROUP_COUNT:10 ...
01-10 13:51:32.890340   551   551 I mtkcam-module: [load] MtkCam_getModuleFactory_aaa(0xe1e01fe9) @ libmtkcam_modulefactory_aaa.so
01-10 13:51:32.890405   551   551 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(0)
01-10 13:51:32.890470   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(1), size(1039536)
01-10 13:51:32.891318   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(2), size(1039536)
01-10 13:51:32.892106   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(4), size(1039536)
01-10 13:51:32.892839   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(0), dev(8), size(1039536)
01-10 13:51:32.893651   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(1), size(96504)
01-10 13:51:32.893817   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(2), size(96504)
01-10 13:51:32.893920   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(4), size(96504)
01-10 13:51:32.894004   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(1), dev(8), size(96504)
01-10 13:51:32.894072   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(1), size(1050652)
01-10 13:51:32.894718   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(2), size(1050652)
01-10 13:51:32.895442   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(4), size(1050652)
01-10 13:51:32.896178   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(2), dev(8), size(1050652)
01-10 13:51:32.896941   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(1), size(157704)
01-10 13:51:32.897122   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(2), size(157704)
01-10 13:51:32.897264   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(4), size(157704)
01-10 13:51:32.897396   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(3), dev(8), size(157704)
01-10 13:51:32.897554   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(1), size(336868)
01-10 13:51:32.897819   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(2), size(336868)
01-10 13:51:32.898082   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(4), size(336868)
01-10 13:51:32.898182   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.898361   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(4), dev(8), size(336868)
01-10 13:51:32.898678   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(1), size(5120)
01-10 13:51:32.898773   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(2), size(5120)
01-10 13:51:32.898826   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(4), size(5120)
01-10 13:51:32.898847   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(5), dev(8), size(5120)
01-10 13:51:32.898866   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(1), size(70520)
01-10 13:51:32.898937   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(2), size(70520)
01-10 13:51:32.898995   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(4), size(70520)
01-10 13:51:32.899079   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(6), dev(8), size(70520)
01-10 13:51:32.899153   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(1), size(80)
01-10 13:51:32.899181   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(2), size(80)
01-10 13:51:32.899196   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(4), size(80)
01-10 13:51:32.899209   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(7), dev(8), size(80)
01-10 13:51:32.899222   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(1), size(54000)
01-10 13:51:32.899273   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(2), size(54000)
01-10 13:51:32.899319   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(4), size(54000)
01-10 13:51:32.899368   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(8), dev(8), size(54000)
01-10 13:51:32.899417   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(1), size(80)
01-10 13:51:32.899431   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(2), size(80)
01-10 13:51:32.899444   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(4), size(80)
01-10 13:51:32.899457   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(9), dev(8), size(80)
01-10 13:51:32.899471   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(1), size(42928)
01-10 13:51:32.899522   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(2), size(42928)
01-10 13:51:32.899559   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(4), size(42928)
01-10 13:51:32.899635   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(10), dev(8), size(42928)
01-10 13:51:32.899692   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(1), size(4096)
01-10 13:51:32.899713   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(2), size(4096)
01-10 13:51:32.899730   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(4), size(4096)
01-10 13:51:32.899748   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(11), dev(8), size(4096)
01-10 13:51:32.899768   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(1), size(22400)
01-10 13:51:32.899795   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(2), size(22400)
01-10 13:51:32.899823   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(4), size(22400)
01-10 13:51:32.899851   551   551 W nvbuf_util.cpp: [getInstance:414] init Mem, nvramId(12), dev(8), size(22400)
01-10 13:51:32.899927   551   551 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:32.900085   551   551 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(0), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 13:51:32.900133   551   551 W NvramDrv: [readDefaultData:735] CAMERA_NVRAM_DATA_ISP
01-10 13:51:32.901956   551   551 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:32.902163   551   551 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(2), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:32.902193   551   551 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(2), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 13:51:32.902226   551   551 W NvramDrv: [readDefaultData:743] CAMERA_NVRAM_DATA_SHADING
01-10 13:51:32.904231   551   551 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:32.904373   551   551 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:32.904400   551   551 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(1), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 13:51:32.904433   551   551 W NvramDrv: [readDefaultData:739] CAMERA_NVRAM_DATA_3A
01-10 13:51:32.911885   526   526 I zygote  : Explicit concurrent copying GC freed 181(8KB) AllocSpace objects, 0(0B) LOS objects, 98% free, 23KB/1559KB, paused 122us total 6.536ms
01-10 13:51:32.915604   527   558 D AAL     : 01-10 01:51:32.840 BL= 942,ESS= 256, 01-10 01:51:32.859 BL= 943,ESS= 256, 01-10 01:51:32.877 BL= 944,ESS= 256, 01-10 01:51:32.896 BL= 945,ESS= 256, 01-10 01:51:32.915 BL= 946,ESS= 256, 
01-10 13:51:32.917850   526   526 I zygote  : Explicit concurrent copying GC freed 5(32KB) AllocSpace objects, 0(0B) LOS objects, 98% free, 23KB/1559KB, paused 49us total 5.471ms
01-10 13:51:32.919148   526   526 I zygote  : Global filter of size 170 installed
01-10 13:51:32.920546   526   526 I Zygote  : Accepting command socket connections
01-10 13:51:32.921637   551   551 I mtkcam-devicemgr: [logLocked] Physical Devices: # 1
01-10 13:51:32.921710   551   551 I mtkcam-devicemgr: [logLocked] --
01-10 13:51:32.921719   551   551 I mtkcam-devicemgr: [logLocked]   [00] -> orientation(wanted/setup)=( 90/90 ) BACK  hasFlashUnit:1 SENSOR_DRVNAME_S5K3L8_MIPI_RAW [PhysEnumDevice:0xed6a1730]
01-10 13:51:32.921728   551   551 I mtkcam-devicemgr: [logLocked] --
01-10 13:51:32.921736   551   551 I mtkcam-devicemgr: [logLocked] Virtual Devices: # 1
01-10 13:51:32.921743   551   551 I mtkcam-devicemgr: [logLocked] --
01-10 13:51:32.921751   551   551 I mtkcam-devicemgr: [logLocked]   [device@1.0/internal/0] -> 00 torchModeStatus:AVAILABLE_OFF hasFlashUnit:1 [VirtEnumDevice:0xed6fc718 IVirtualDevice:0xed6a1e50]
01-10 13:51:32.921758   551   551 I mtkcam-devicemgr: [logLocked] --
01-10 13:51:32.921767   551   551 I mtkcam-devicemgr: [logLocked] Open Devices: # 0 (multi-opened maximum: # 2)
01-10 13:51:32.921774   551   551 I mtkcam-devicemgr: [logLocked] --
01-10 13:51:32.921786   551   551 I mtkcam-devicemgr: [initialize] -
01-10 13:51:32.921803   551   551 I mtkcam-camprovider: [createICameraProvider_V2_4] + internal/0
01-10 13:51:32.921831   551   551 I mtkcam-camprovider: [initialize] +
01-10 13:51:32.921856   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.921983   551   551 I mtkcam-camprovider: [initialize] -
01-10 13:51:32.922006   551   551 I mtkcam-camprovider: [createICameraProvider_V2_4] - internal/0 provider:0xed6ab860 manager:0xed375004
01-10 13:51:32.925220   551   551 I camerahalserver: Registration complete for android.hardware.camera.provider@2.4::ICameraProvider/internal/0.
01-10 13:51:32.929093   551   551 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.advcam@1.0-impl.so from current namespace instead of sphal namespace.
01-10 13:51:32.932911   551   551 I AdvCamControl_impl: IAdvCamControl  into HIDL_FETCH_IAdvCamControl
01-10 13:51:32.935615   551   551 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.advcam@1.0::IAdvCamControl/internal/0.
01-10 13:51:32.936826   551   551 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.lomoeffect@1.0-impl.so from current namespace instead of sphal namespace.
01-10 13:51:32.937254   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.943942   551   551 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.lomoeffect@1.0::ILomoEffect/internal/0.
01-10 13:51:32.945190   551   551 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.ccap@1.0-impl.so from current namespace instead of sphal namespace.
01-10 13:51:32.951659   551   551 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.ccap@1.0::ICCAPControl/internal/0.
01-10 13:51:32.952991   551   551 D vndksupport: Loading /vendor/lib/hw/vendor.mediatek.hardware.camera.callbackclient@1.0-impl.so from current namespace instead of sphal namespace.
01-10 13:51:32.958518   551   551 I camerahalserver: Registration complete for vendor.mediatek.hardware.camera.callbackclient@1.0::IMtkCallbackClient/internal/0.
01-10 13:51:32.959241   531   712 I CameraProviderManager: Connecting to new camera provider: internal/0, isRemote? 1
01-10 13:51:32.960030   531   712 I CameraProviderManager: Enumerating new camera device: device@1.0/internal/0
01-10 13:51:32.962311   551   864 I mtkcam-dev1: [createSpecificCameraDevice1] APP_MODE_NAME_DEFAULT
01-10 13:51:32.963691   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:32.967038   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_REG: pid:551, uid:1047
01-10 13:51:32.967461   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnReg hdl:39
01-10 13:51:32.967981   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnEnable hdl:39, timeout:1000
01-10 13:51:32.968116   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_ENABLE: hdl:39, timeout:1000
01-10 13:51:32.968192   397   413 I libPerfService: perfUserScnEnable - handle:39
01-10 13:51:32.969740   397   413 I libPerfService: 39: legacy set freq: 1508000 -1 2002000 -1
01-10 13:51:32.970587   551   864 I mtkcam-dev1: [createSpecificCameraDevice1] - 0xebe30600
01-10 13:51:32.970661   551   864 I mtkcam-dev1: 0[CameraDevice1Base::open] +
01-10 13:51:32.970999   551   864 I mtkcam-devicemgr: [attachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 13:51:32.970
01-10 13:51:32.971746   551   866 D SeninfDrvImp: [init][init]: Entry count 0 
01-10 13:51:32.972490   551   864 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_AE,0),srIdxNum(0)
01-10 13:51:32.972572   551   864 I Drv/HWsync: Drv/HWsync[init] mAECyclePeriod(3)
01-10 13:51:32.972583   551   864 I Drv/HWsync: Drv/HWsync[init] -
01-10 13:51:32.972645   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:32.972679   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:32.972693   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:32.972708   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:32.972733   551   864 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(4), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 13:51:32.972762   551   864 W NvramDrv: [readDefaultData:755] CAMERA_DATA_AE_PLINETABLE
01-10 13:51:32.973168   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:32.973223   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:32.975559   551   864 D LaserDrv: LaserDrv()
01-10 13:51:32.975738   551   864 D LaserDrv: Device error opening : No such file or directory
01-10 13:51:32.976271   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:32.976351   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:32.977533   551   866 D SeninfDrvImp: [init]Efuse Data:0x11f1018c= 0x8c631940, 0x11f10190= 0x7c208364, 0x11f101bc= 0x80000000
01-10 13:51:32.977660   551   866 D SeninfDrvImp: [init][init]: Exit count 1 
01-10 13:51:32.977729   551   866 D ImgSensorDrv: [init][init] imgsensor_drv 1
01-10 13:51:32.977850   551   866 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11)
01-10 13:51:32.977895   551   866 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11), SENINF_TG1_PH_CNT(0x80000005)
01-10 13:51:32.978138   551   866 D SeninfDrvImp: [setMclk1IODrivingCurrent]DrivingIdx(3), Reg(0x30000000)
01-10 13:51:32.985977   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:32.998276   379   853 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Fail to connect . retry count: 1
01-10 13:51:32.998835   379   853 D VT HIDL : [IVT] isIMCBrun : True
01-10 13:51:33.005610   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.010100   527   558 D AAL     : 01-10 01:51:32.934 BL= 947,ESS= 256, 01-10 01:51:32.953 BL= 948,ESS= 256, 01-10 01:51:32.972 BL= 949,ESS= 256, 01-10 01:51:32.991 BL= 950,ESS= 256, 01-10 01:51:33.010 BL= 951,ESS= 256, 
01-10 13:51:33.024682   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.038989   775   775 D ccci_lib: read info:[modem num]:1
01-10 13:51:33.038989   775   775 D ccci_lib: [modem en]:1-0-0-0-0
01-10 13:51:33.038989   775   775 D ccci_lib: [MTK_ECCCI_C2K]:1
01-10 13:51:33.038989   775   775 D ccci_lib: [ccci_drv_ver]:V2
01-10 13:51:33.038989   775   775 D ccci_lib: total:71
01-10 13:51:33.039098   775   775 D ccci_lib: parse_info name:modem num
01-10 13:51:33.039130   775   775 D EMDLOGGER1: initUSBPortMappingFile get current port is 1
01-10 13:51:33.039256   775   775 D EMDLOGGER1: Get auto start mode: 2
01-10 13:51:33.039276   775   775 D EMDLOGGER1: getSavedLoggingMode(): mode = 2
01-10 13:51:33.045087   380   697 D SpeechMessengerNormal: formatShareMemory(), mShareMemory: 0xe89fe000, ap_flag: 0x1, md_flag: 0x1, struct_checksum: 124
01-10 13:51:33.045256   380   697 D SpeechMessengerNormal: formatShareMemory(), [sph_param] offset: 128, size: 12288, [ap_data] offset: 12416, size: 8192, [md_data] offset: 20608, size: 32608
01-10 13:51:33.045584   380   697 D SpeechEnhancementController: mSpeechEnhancementMask: main_func = 0xffff, sub_func = 0xffffff9f
01-10 13:51:33.045680   380   697 D SpeechEnhancementController: GetBtHeadsetNrecOn(), mBtHeadsetNrecOn = 1
01-10 13:51:33.046172   380   697 W SpeechDriverFactory: Create SpeechDriverDummy for MODEM_2
01-10 13:51:33.046241   380   697 D         : CleanGainValueAndMuteStatus(), mUplinkMuteOn 0
01-10 13:51:33.046257   380   697 W SpeechDriverDummy: SpeechDriverDummy(), modem_index = 1
01-10 13:51:33.046292   380   697 W SpeechDriverFactory: Create SpeechDriverDummy for MODEM_EXTERNAL
01-10 13:51:33.046324   380   697 D         : CleanGainValueAndMuteStatus(), mUplinkMuteOn 0
01-10 13:51:33.046338   380   697 W SpeechDriverDummy: SpeechDriverDummy(), modem_index = 2
01-10 13:51:33.046370   380   697 D SpeechDriverFactory: -SpeechDriverFactory(), mActiveModemIndex = 0
01-10 13:51:33.046518   380   697 D AudioALSAFMController: AudioALSAFMController()
01-10 13:51:33.046644   380   697 D         : AudioALSAVoiceWakeUpController()
01-10 13:51:33.046677   380   697 D         : AudioALSAVoiceWakeUpController() , stream_attribute_target->BesRecord_Info.besrecord_enable 0
01-10 13:51:33.046923   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Voice_Recognize_Param,LID:15
01-10 13:51:33.047254   870   870 I AEE_AED : Built Mar 23 2018 13:42:39
01-10 13:51:33.047469   380   697 D NVRAM   : NVM_CmpFileVerNo 15  
01-10 13:51:33.047565   380   697 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 13:51:33.047590   380   697 D NVRAM   : NVM_ProtectDataFile : 15 ++
01-10 13:51:33.047606   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:33.047581   404   404 W ccci_fsd(1): O: X://NA77_006, flag 0x700, ret 1
01-10 13:51:33.047640   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:1548,size in table:1546
01-10 13:51:33.048534   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.048620   404   404 W ccci_fsd(1): O: Y://NA77_006, flag 0x700, ret 1
01-10 13:51:33.048768   870   870 I AEE_AED : socket server: android:aee_aed
01-10 13:51:33.049202   870   870 D AEE_AED : aed_get_force_config: -100000
01-10 13:51:33.049784   870   870 I AEE_AED : AED config
01-10 13:51:33.049784   870   870 I AEE_AED :   mode '4'
01-10 13:51:33.049784   870   870 I AEE_AED :   exp level '0
01-10 13:51:33.049784   870   870 I AEE_AED :   dal enable '0'
01-10 13:51:33.049784   870   870 I AEE_AED :   db count '4'
01-10 13:51:33.049784   870   870 I AEE_AED :   fatal db count '4'
01-10 13:51:33.049784   870   870 I AEE_AED :  db storage '2'
01-10 13:51:33.049784   870   870 I AEE_AED :   SMP Info => 1
01-10 13:51:33.050613   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:33.050715   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:33.050737   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:33.050778   380   697 D NVRAM   : GetVoiceRecogCustParamFromNV rec_size = 1546 rec_num = 1
01-10 13:51:33.051107   380   875 D SpeechDriverNormal: processModemControlMessage(), MD Alive, id: 0xafa0, param16: 0x0, param32: 0x0
01-10 13:51:33.051585   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:33.051704   380   697 D         : updateParamToKernel(), mVOW_CFG4 load = 0xffffffea
01-10 13:51:33.051720   380   697 D         : updateParamToKernel(), mVOW_CFG4 set = 0xffef, mVOW_CFG2=0x2323, mVOW_CFG3=0xa768
01-10 13:51:33.051739   380   697 E         : Error: Audio VOWCFG2 Data invalid value
01-10 13:51:33.051754   380   697 E         : Error: Audio VOWCFG3 Data invalid value
01-10 13:51:33.051768   380   697 E         : Error: Audio VOWCFG4 Data invalid value
01-10 13:51:33.051784   380   697 E         : Error: Audio VOW Periodic On Off Data invalid value
01-10 13:51:33.051802   380   697 D AudioALSAStreamManager: AudioALSAStreamManager()
01-10 13:51:33.052031   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_AudEnh_Control_Opt,LID:16
01-10 13:51:33.052220   380   697 D NVRAM   : NVM_CmpFileVerNo 16  
01-10 13:51:33.052300   380   697 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 13:51:33.052318   380   697 D NVRAM   : NVM_ProtectDataFile : 16 ++
01-10 13:51:33.052328   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:33.052351   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:6,size in table:4
01-10 13:51:33.058864   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:33.058996   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:33.059013   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:33.059055   380   697 D NVRAM   : GetBesLoudnessControlOptionParamFromNV rec_size = 4 rec_num = 1
01-10 13:51:33.063491   869   869 I AEE_AED : Built Mar 23 2018 13:42:19
01-10 13:51:33.064742   869   869 I AEE_AED : socket server: android:aee_aed32
01-10 13:51:33.065037   869   869 D AEE_AED : aed_get_force_config: -100000
01-10 13:51:33.065535   869   869 I AEE_AED : AED config
01-10 13:51:33.065535   869   869 I AEE_AED :   mode '4'
01-10 13:51:33.065535   869   869 I AEE_AED :   exp level '0
01-10 13:51:33.065535   869   869 I AEE_AED :   dal enable '0'
01-10 13:51:33.065535   869   869 I AEE_AED :   db count '4'
01-10 13:51:33.065535   869   869 I AEE_AED :   fatal db count '4'
01-10 13:51:33.065535   869   869 I AEE_AED :  db storage '2'
01-10 13:51:33.065535   869   869 I AEE_AED :   SMP Info => 1
01-10 13:51:33.066034   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.067487   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:33.067613   380   697 D AudioALSAStreamManager: AudioALSAStreamManager(), mBesLoudnessStatus [1] (From NvRam) 
01-10 13:51:33.067574   872   872 I AEE_AEDV: Built Mar 23 2018 13:42:46
01-10 13:51:33.067707   380   697 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 13:51:33.067795   869   869 D AEE_AED : aee_exception_running_64: send req to debuggerd64
01-10 13:51:33.068180   869   869 D AEE_AED : aee:rttd_64Rtt waiting 64_daemon finish the job...
01-10 13:51:33.068356   380   697 D AudioALSAStreamManager: AudioALSAStreamManager() appHandleGetInstance
01-10 13:51:33.068432   380   697 D AudioALSAStreamManager: AudioALSAStreamManager() appHandleRegXmlChangedCb
01-10 13:51:33.068516   380   697 D AudioUtility: getPowerHal(), get PowerHal Service
01-10 13:51:33.070117   871   871 I AEE_AEDV: Built Mar 23 2018 13:42:26
01-10 13:51:33.071687   872   872 I AEE_AEDV: socket server: android:aee_aedv
01-10 13:51:33.071729   871   871 I AEE_AEDV: socket server: android:aee_aedv32
01-10 13:51:33.072238   871   871 D AEE_AEDV: aed_get_force_config: -100000
01-10 13:51:33.072257   872   872 D AEE_AEDV: aed_get_force_config: -100000
01-10 13:51:33.072333   380   697 D AudioUtility: getPowerHal(), Link to death notification successfully
01-10 13:51:33.072408   380   697 D AudioALSAParamTuner: getInstance(), create AudioALSAParamTuner instance --
01-10 13:51:33.072472   380   697 D AudioALSAParamTuner: +AudioALSAParamTuner()
01-10 13:51:33.072519   380   697 D NVRAM   : GetVolumeVer1ParamFromNV 
01-10 13:51:33.072649   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/Audio_ver1_Vol_custom,LID:64
01-10 13:51:33.072866   872   872 I AEE_AEDV: AED config
01-10 13:51:33.072866   872   872 I AEE_AEDV:   mode '4'
01-10 13:51:33.072866   872   872 I AEE_AEDV:   exp level '0
01-10 13:51:33.072866   872   872 I AEE_AEDV:   dal enable '0'
01-10 13:51:33.072866   872   872 I AEE_AEDV:   db count '4'
01-10 13:51:33.072866   872   872 I AEE_AEDV:   fatal db count '4'
01-10 13:51:33.072866   872   872 I AEE_AEDV:  db storage '2'
01-10 13:51:33.072866   872   872 I AEE_AEDV:   SMP Info => 1
01-10 13:51:33.072882   871   871 I AEE_AEDV: AED config
01-10 13:51:33.072882   871   871 I AEE_AEDV:   mode '4'
01-10 13:51:33.072882   871   871 I AEE_AEDV:   exp level '0
01-10 13:51:33.072882   871   871 I AEE_AEDV:   dal enable '0'
01-10 13:51:33.072882   871   871 I AEE_AEDV:   db count '4'
01-10 13:51:33.072882   871   871 I AEE_AEDV:   fatal db count '4'
01-10 13:51:33.072882   871   871 I AEE_AEDV:  db storage '2'
01-10 13:51:33.072882   871   871 I AEE_AEDV:   SMP Info => 1
01-10 13:51:33.073237   380   697 D NVRAM   : NVM_CmpFileVerNo 64  
01-10 13:51:33.073333   380   697 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 13:51:33.073365   380   697 D NVRAM   : NVM_ProtectDataFile : 64 ++
01-10 13:51:33.073379   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:33.073457   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:583,size in table:581
01-10 13:51:33.075394   871   871 D AEE_AEDV: aee_exception_running_64: send req to debuggerd64
01-10 13:51:33.075758   871   871 D AEE_AEDV: aee:vrttd_64Rtt waiting 64_daemon finish the job...
01-10 13:51:33.076544   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:33.076605   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:33.076625   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:33.076661   380   697 D NVRAM   : GetVolumeVer1ParamFromNV rec_size = 581 rec_num = 1
01-10 13:51:33.077146   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:33.077231   380   697 D AudioMTKGainController: getMicGainDecimal(), micMode 1, gainDevice 0, micGainDecimal 152
01-10 13:51:33.077317   380   697 D AudioMTKGainController: getMicGainDecimal(), micMode 1, gainDevice 2, micGainDecimal 168
01-10 13:51:33.077356   380   697 D AudioALSAParamTuner: AudioALSAParamTuner(), AudioALSAParamTuner: default mic gain-mormal:168;handsfree:252, receiver gain:112, headset Gain:76
01-10 13:51:33.077407   380   697 D AudioALSAParamTuner: getInstance(), create AudioALSAParamTuner instance ++
01-10 13:51:33.077497   380   697 D AudioALSAHardware: AudioALSAHardware()
01-10 13:51:33.077600   380   697 D         : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 13:51:33.078341   380   697 D AudioALSAHardware: AudioALSAHardware(), mAudioHalBtscoWB = 0
01-10 13:51:33.078433   380   697 D WCNChipController: WCNChipController()
01-10 13:51:33.078517   380   697 D WCNChipController: SetBTCurrentSamplingRateNumber(), mBTCurrentSamplingRateNumber: 8000 => 8000
01-10 13:51:33.078554   380   697 D AudioBTCVSDControl: +AudioBTCVSDControl
01-10 13:51:33.078595   380   697 D AudioBTCVSDControl: AudioBTCVSDControl constructor
01-10 13:51:33.087002   380   697 D AudioBTCVSDControl: BT_SCO_SET_TXState state=0x0
01-10 13:51:33.087103   380   697 D AudioBTCVSDControl: BT_SCO_SET_RXState state=0x10
01-10 13:51:33.087121   380   697 D AudioBTCVSDControl: BT_SCO_CVSD_Init() allocate mBTSCOCVSDContext
01-10 13:51:33.087134   380   697 D AudioBTCVSDControl: -AudioBTCVSDControl
01-10 13:51:33.087149   380   697 D AudioBTCVSDControl: AudioBTCVSDControl getInstance()
01-10 13:51:33.087166   380   697 D AudioBTCVSDControl: BT_SCO_SetMode, mode=0, BTmode=0
01-10 13:51:33.087182   380   697 D AudioALSASpeechPhoneCallController: setBTMode(), mBTMode: 0 => 0
01-10 13:51:33.087227   380   697 D AudioALSAHardware: -mAudioALSAHardware
01-10 13:51:33.087261   380   697 D mtk_audio_hw_hal: gAudioHALRefCountByClient + 1
01-10 13:51:33.087744   380   875 D SpeechDriverNormal: sendSpeechMessageToModem(), send msg done, id: 0x2fa0, param16: 0x0, param32: 0x0
01-10 13:51:33.087852   380   875 W SpeechDriverNormal: processModemMessage(), msg 0xafa0 process time 37 ms is too long
01-10 13:51:33.088286   380   697 D AudioALSAHardware: initCheck()
01-10 13:51:33.088455   551   866 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(0)
01-10 13:51:33.088447   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:33.088559   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:33.088578   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:33.088598   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(2), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:33.088600   551   866 I Drv/HWsync: Drv/HWsync[init] -
01-10 13:51:33.088612   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:33.088642   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:33.088674   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:33.088690   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(6), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:33.088716   551   864 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(6), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 13:51:33.088747   551   864 W NvramDrv: [readDefaultData:772] CAMERA_DATA_TSF_TABLE
01-10 13:51:33.089122   551   864 D CAM_CUS_MSDK: CAM_CUS_MSDK GetCameraCalData(MainSensorIdx=30c8) Enter
01-10 13:51:33.089159   551   864 D CAM_CUS_MSDK: CAM_CUS_MSDK SensorId != pstSensorInitFunc[0].SensorId=258 
01-10 13:51:33.089174   551   864 D CAM_CUS_MSDK: CAM_CUS_MSDK SensorId == pstSensorInitFunc[1].SensorId=30c8 
01-10 13:51:33.089187   551   864 D CAM_CUS_MSDK: CAM_CUS_MSDK Enter! GetCameraCalData(MainSensorIdx=30c8) Enter
01-10 13:51:33.089199   551   864 D CAM_CUS_MSDK: CAM_CUS_MSDK pstSensorInitFunc(MainSensorIdx=30c8) Enter
01-10 13:51:33.089214   551   864 I CamCalCamCal: ver1017~ pCamCalData->sensorID=30c8
01-10 13:51:33.089239   551   864 I CamCalCamCal: ver1017~ pCamCalData->deviceID=1
01-10 13:51:33.090336   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.092513   380   697 D AudioALSAStreamManager: setMasterVolume(), volume = 1.000000
01-10 13:51:33.092632   380   697 D AudioMTKGainController: setNormalVolume(), mSceneIndex = 0, stream -1, devices 0x0, index -1, mode 0x0
01-10 13:51:33.092732   380   697 D SpeechParamParser: SpeechParamParser()
01-10 13:51:33.092784   380   697 D SpeechParamParser: Init()
01-10 13:51:33.092800   380   697 D SpeechParamParser: +InitAppParser()
01-10 13:51:33.092826   380   697 D SpeechParamParser: InitAppParser() appHandleGetInstance
01-10 13:51:33.092846   380   697 D SpeechParamParser: appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 13:51:33.093691   380   697 D SpeechParamParser: InitAppParser() appHandleRegXmlChangedCb
01-10 13:51:33.093916   380   697 D SpeechParamParser: InitSpeechNetwork(), i=0, sizeByteFromApp=2, supportBit=0xfff
01-10 13:51:33.093949   380   697 D SpeechParamParser: -InitSpeechNetwork(), total size byte=2
01-10 13:51:33.093967   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[0].name = GSM
01-10 13:51:33.093985   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[1].name = GSM
01-10 13:51:33.094000   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[2].name = GSM
01-10 13:51:33.094018   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[3].name = GSM
01-10 13:51:33.094035   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[4].name = GSM
01-10 13:51:33.094051   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[5].name = GSM
01-10 13:51:33.094068   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[6].name = GSM
01-10 13:51:33.094084   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[7].name = GSM
01-10 13:51:33.094112   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[8].name = GSM
01-10 13:51:33.094129   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[9].name = GSM
01-10 13:51:33.094156   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[10].name = GSM
01-10 13:51:33.094172   380   697 D SpeechParamParser: InitSpeechNetwork(), mNameForEachSpeechNetwork[11].name = GSM
01-10 13:51:33.094222   380   697 E AudioMTKGainController: getGainDevice(), error, devices (0) not support, return GAIN_DEVICE_SPEAKER
01-10 13:51:33.094293   380   697 W AudioMTKGainController: error, stream -1 is invalid, use 3 instead
01-10 13:51:33.094311   380   697 W AudioMTKGainController: error, index -1 is invalid, use max 15 instead
01-10 13:51:33.094333   380   697 D AudioMTKGainController: setSpeakerGain(), gain = 9, spkAnaType = 3, spkLMixerName = Lineout_PGAL_GAIN, spkRMixerName = Lineout_PGAR_GAIN
01-10 13:51:33.094954   551   864 I CamCalCamCal: ver1017~ lsc table_size 1868
01-10 13:51:33.095115   873   873 I [epdg_wo]: [DMN] starting WI-FI OFFLOAD DAEMON
01-10 13:51:33.095721   528   528 I AudioFlinger: loadHwModule() Loaded primary audio interface, handle 10
01-10 13:51:33.095844   528   528 I AudioFlinger: openOutput() this 0xf35be000, module 10 Device 2, SamplingRate 48000, Format 0x000003, Channels 3, flags 6
01-10 13:51:33.096070   380   697 D AudioALSAStreamManager: +openOutputStream()
01-10 13:51:33.096164   380   697 D AudioALSAStreamManager: openOutputStream(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, status = 0xd
01-10 13:51:33.096244   380   697 D AudioALSAStreamOut: AudioALSAStreamOut()
01-10 13:51:33.096297   380   697 D AudioALSAStreamOut: set(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, flags = 0x6
01-10 13:51:33.096375   380   697 D AudioALSASampleRateController: AudioALSASampleRateController()
01-10 13:51:33.096429   380   697 D AudioALSASampleRateController: +setPrimaryStreamOutSampleRate(), mPrimaryStreamOutSampleRate: 44100 => 48000
01-10 13:51:33.096446   380   697 D AudioALSASampleRateController: -setPrimaryStreamOutSampleRate(), mPrimaryStreamOutSampleRate: 48000
01-10 13:51:33.096492   380   697 D AudioALSAStreamOut: set(), mStreamAttributeSource.latency 10, mStreamAttributeSource.buffer_size =2048, channels 2.
01-10 13:51:33.097677   873   873 I [epdg_wo]: [IKE] IKEv2 Daemon stopped
01-10 13:51:33.097773   873   873 I [epdg_wo]: [NID] create post_routing chain
01-10 13:51:33.097836   873   873 I [epdg_wo]: [NID] netutils supported
01-10 13:51:33.099322   870   870 D AEE_AED : $===AEE===AEE===AEE===$
01-10 13:51:33.099433   870   870 D AEE_AED : p 0 poll events 1 revents 1
01-10 13:51:33.099530   870   870 D AEE_AED : requesting from: pid=869 cmd=9
01-10 13:51:33.099543   870   870 D AEE_AED : Go RTT_AEE_GET_EXCEPTION_RUNNING
01-10 13:51:33.099752   869   869 D AEE_AED : Rtt send 64 req done
01-10 13:51:33.099947   869   869 E AEE_AED : Can't remove file /data/aee_exp/temp: No such file or directory
01-10 13:51:33.102317   872   872 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 13:51:33.102404   872   872 D AEE_AEDV: p 0 poll events 1 revents 1
01-10 13:51:33.102477   872   872 D AEE_AEDV: requesting from: pid=871 cmd=9
01-10 13:51:33.102492   872   872 D AEE_AEDV: Go RTT_AEE_GET_EXCEPTION_RUNNING
01-10 13:51:33.102662   871   871 D AEE_AEDV: Rtt send 64 req done
01-10 13:51:33.102785   871   871 E AEE_AEDV: Can't remove file /data/vendor/mtklog/aee_exp/temp: No such file or directory
01-10 13:51:33.102907   871   871 E AEE_AEDV: Can't remove file /sdcard/mtklog/aee_exp/temp: No such file or directory
01-10 13:51:33.102937   871   871 E AEE_AEDV: Can't remove file /storage/ext_sd/mtklog/aee_exp/temp: No such file or directory
01-10 13:51:33.104397   527   558 D AAL     : 01-10 01:51:33.028 BL= 952,ESS= 256, 01-10 01:51:33.047 BL= 953,ESS= 256, 01-10 01:51:33.066 BL= 954,ESS= 256, 01-10 01:51:33.085 BL= 955,ESS= 256, 01-10 01:51:33.104 BL= 956,ESS= 256, 
01-10 13:51:33.106808   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.113988   775   775 D EMDLOGGER1: MAL_Init
01-10 13:51:33.115725   871   871 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 13:51:33.115797   871   871 D AEE_AEDV: p 5 poll events 1 revents 1
01-10 13:51:33.115994   871   871 D AEE_AEDV: PPM cpu cores:8, online:8
01-10 13:51:33.117226   871   871 D AEE_AEDV: aed_main_fork_worker: generator 0xf06955f0, worker 0xff824ee8, recv_fd 0
01-10 13:51:33.118472   891   891 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 13:51:33.118600   891   891 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 13:51:33.118621   891   891 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 13:51:33.118752   775   775 D ccci_lib: mmap on /dev/ccci_ccb_dhl(5) for addr=0x7c000000, len=2097152
01-10 13:51:33.119468   891   891 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 13:51:33.119602   891   891 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 13:51:33.123642   775   775 D ccci_lib: ccb_info_len=20
01-10 13:51:33.123817   891   891 W AEE_AEDV: ipanic heahder: magic:0, version:0, size:0, datas:0
01-10 13:51:33.123874   891   891 W AEE_AEDV: ipanic heahder: dhblk:0, blksize:0, partsize:0, bufsize:0
01-10 13:51:33.124808   775   775 D ccci_lib: new ccb_ctrl mmap on /dev/ccci_ccb_ctrl(6) for addr=0x80018000, len=4096
01-10 13:51:33.124848   891   891 W AEE_AEDV: aed_reboot_session, no valid ipanic header, ignored
01-10 13:51:33.124976   891   891 V ETM     : open etb_get_nr fail! , default etb_nr is 1 , (2, No such file or directory)
01-10 13:51:33.125130   891   891 V ETM     : open etb_length fail! (2, No such file or directory)
01-10 13:51:33.125184   891   891 V ETM     : open etb_length fail! (2, No such file or directory)
01-10 13:51:33.125883   891   891 I AEE_AEDV: wdt_status = 2, fiq_step=0, exception_type:0 
01-10 13:51:33.126062   891   891 I AEE_AEDV: powerup reason:wdt_by_pass_pwk
01-10 13:51:33.126062   891   891 I AEE_AEDV: 
01-10 13:51:33.126091   891   891 I AEE_AEDV: reboot_reason = 0
01-10 13:51:33.126376   891   891 E         : mrdump_support_user_load: null mrdump lk version
01-10 13:51:33.126488   891   891 W AEE_AEDV: read_fstab: get fstab /fstab.mt6763
01-10 13:51:33.126533   891   891 E AEE_AEDV: read_fstab: failed to open /fstab.mt6763
01-10 13:51:33.126551   891   891 W AEE_AEDV: read_fstab: get fstab /vendor/etc/fstab.mt6763
01-10 13:51:33.127218   891   891 W AEE_AEDV: get_expdb_path: get expdb_path /dev/block/platform/bootdevice/by-name/expdb
01-10 13:51:33.127324   891   891 I AEE_AEDV: ipanic_blk_open, expdb, 200 x a000 = 1400000
01-10 13:51:33.128077   775   775 D ccci_lib: register user57 md0: base=0x7653800000, len=2097152, ctrl_base=0x76545cc000, ctrl_offset=0
01-10 13:51:33.128161   775   775 D ccci_lib: register user57 md0 DL0, pattern=ddbbccaa, dl_page=0x7653800000
01-10 13:51:33.128179   775   775 D ccci_lib: register user57 md0 UL0, pattern=ddbbccaa, ul_page=0x7653808000
01-10 13:51:33.128192   775   775 D ccci_lib: register user57 md0 DL1, pattern=ddbbccaa, dl_page=0x7653810000
01-10 13:51:33.128204   775   775 D ccci_lib: register user57 md0 UL1, pattern=ddbbccaa, ul_page=0x765382e000
01-10 13:51:33.128218   775   775 D ccci_lib: register user57 md0 DL2, pattern=ddbbccaa, dl_page=0x765382e080
01-10 13:51:33.128231   775   775 D ccci_lib: register user57 md0 UL2, pattern=ddbbccaa, ul_page=0x7653837080
01-10 13:51:33.128247   775   775 D ccci_lib: register user57 md0 DL3, pattern=ddbbccaa, dl_page=0x765383f080
01-10 13:51:33.128262   775   775 D ccci_lib: register user57 md0 UL3, pattern=ddbbccaa, ul_page=0x7653847080
01-10 13:51:33.128279   775   775 D ccci_lib: register user57 md0 DL4, pattern=ddbbccaa, dl_page=0x7653847100
01-10 13:51:33.128297   775   775 D ccci_lib: register user57 md0 UL4, pattern=ddbbccaa, ul_page=0x765384f100
01-10 13:51:33.128318   775   775 D ccci_lib: register user57 md0 DL5, pattern=ddbbccaa, dl_page=0x765384f180
01-10 13:51:33.128333   775   775 D ccci_lib: register user57 md0 UL5, pattern=ddbbccaa, ul_page=0x765386f180
01-10 13:51:33.128348   775   775 D ccci_lib: register user57 md0 DL6, pattern=ddbbccaa, dl_page=0x765386f200
01-10 13:51:33.128361   775   775 D ccci_lib: register user57 md0 UL6, pattern=ddbbccaa, ul_page=0x765386f280
01-10 13:51:33.128374   775   775 D ccci_lib: register user57 md0 DL7, pattern=ddbbccaa, dl_page=0x765386f300
01-10 13:51:33.128390   775   775 D ccci_lib: register user57 md0 UL7, pattern=ddbbccaa, ul_page=0x765386f380
01-10 13:51:33.128404   775   775 D ccci_lib: register user57 md0 DL8, pattern=ddbbccaa, dl_page=0x765386f400
01-10 13:51:33.128418   775   775 D ccci_lib: register user57 md0 UL8, pattern=ddbbccaa, ul_page=0x765386f480
01-10 13:51:33.128430   775   775 D ccci_lib: register user57 md0 DL9, pattern=ddbbccaa, dl_page=0x765386f500
01-10 13:51:33.128444   775   775 D ccci_lib: register user57 md0 UL9, pattern=ddbbccaa, ul_page=0x765386f580
01-10 13:51:33.128456   775   775 D ccci_lib: register user57 md0 DL10, pattern=ddbbccaa, dl_page=0x765386f600
01-10 13:51:33.128470   775   775 D ccci_lib: register user57 md0 UL10, pattern=ddbbccaa, ul_page=0x765386f680
01-10 13:51:33.128484   775   775 D ccci_lib: register user57 md0 DL11, pattern=ddbbccaa, dl_page=0x765386f700
01-10 13:51:33.128498   775   775 D ccci_lib: register user57 md0 UL11, pattern=ddbbccaa, ul_page=0x765386f780
01-10 13:51:33.128513   775   775 D ccci_lib: register user57 md0 DL12, pattern=ddbbccaa, dl_page=0x765386f800
01-10 13:51:33.128526   775   775 D ccci_lib: register user57 md0 UL12, pattern=ddbbccaa, ul_page=0x765386f880
01-10 13:51:33.128540   775   775 D ccci_lib: register user57 md0 DL13, pattern=ddbbccaa, dl_page=0x765386f900
01-10 13:51:33.128553   775   775 D ccci_lib: register user57 md0 UL13, pattern=ddbbccaa, ul_page=0x765386f980
01-10 13:51:33.128567   775   775 D ccci_lib: register user57 md0 DL14, pattern=ddbbccaa, dl_page=0x765386fa00
01-10 13:51:33.128581   775   775 D ccci_lib: register user57 md0 UL14, pattern=ddbbccaa, ul_page=0x765386fa80
01-10 13:51:33.128594   775   775 D ccci_lib: register user57 md0 DL15, pattern=ddbbccaa, dl_page=0x765386fb00
01-10 13:51:33.128610   775   775 D ccci_lib: register user57 md0 UL15, pattern=ddbbccaa, ul_page=0x765386fb80
01-10 13:51:33.128623   775   775 D ccci_lib: register user57 md0 DL16, pattern=ddbbccaa, dl_page=0x765386fc00
01-10 13:51:33.128636   775   775 D ccci_lib: register user57 md0 UL16, pattern=ddbbccaa, ul_page=0x765386fc80
01-10 13:51:33.128650   775   775 D ccci_lib: register user57 md0 DL17, pattern=ddbbccaa, dl_page=0x765386fd00
01-10 13:51:33.128661   775   775 D ccci_lib: register user57 md0 UL17, pattern=ddbbccaa, ul_page=0x765386ff80
01-10 13:51:33.128687   775   775 I EMDLOGGER1: MAL_ccb_Init: CCB is ready
01-10 13:51:33.130846   891   891 D AEE_AEDV: version(aabbccdd)
01-10 13:51:33.131563   775   775 D ccci_lib: mmap on /dev/ccci_raw_dhl(7) for addr=0x7c200000, len=20971520
01-10 13:51:33.132212   871   871 D AEE_AEDV: clear ppm settings
01-10 13:51:33.132789   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.134404   775   894 I EMDLOGGER1: mdlog_ccb_ctrl_reader_thread started
01-10 13:51:33.134603   775   775 D ccci_lib: write done of user57 buffer0: OK, i=1 write=1, alloc=1, free=0, len=16
01-10 13:51:33.134950   775   775 D ccci_lib: write done of user57 buffer0: OK, i=2 write=2, alloc=2, free=1, len=12
01-10 13:51:33.135021   871   871 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 13:51:33.141678   775   775 D ccci_lib: write done of user57 buffer0: OK, i=3 write=3, alloc=3, free=2, len=16
01-10 13:51:33.142017   380   697 D NVRAM   : audioComFltCustParamInit Do nothing
01-10 13:51:33.142161   380   697 D NVRAM   : getPlaybackPostProcessParameterFromXML Type/Name [0]/[PlaybackACF]
01-10 13:51:33.142188   380   697 D NVRAM   : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-vnd.so
01-10 13:51:33.142161   775   775 D EMDLOGGER1: Main: getSavedGPSLocation support_gps_location: 1
01-10 13:51:33.142241   775   775 D EMDLOGGER1: Not set property: persist.mtklog.mdlog.mdsilrbt
01-10 13:51:33.142776   380   697 D NVRAM   : bes_loudness_L_hpf_fc = 300
01-10 13:51:33.142804   380   697 D NVRAM   : bes_loudness_L_hpf_order = 2
01-10 13:51:33.142819   380   697 D NVRAM   : bes_loudness_L_lpf_fc = 10000
01-10 13:51:33.142832   380   697 D NVRAM   : bes_loudness_L_lpf_order = 1
01-10 13:51:33.142848   380   697 D NVRAM   : bes_loudness_R_hpf_fc = 0
01-10 13:51:33.142861   380   697 D NVRAM   : bes_loudness_R_hpf_order = 0
01-10 13:51:33.142873   380   697 D NVRAM   : bes_loudness_R_lpf_fc = 0
01-10 13:51:33.142885   380   697 D NVRAM   : bes_loudness_R_lpf_order = 0
01-10 13:51:33.142901   380   697 D NVRAM   : bes_loudness_Sep_LR_Filter = 0
01-10 13:51:33.142913   380   697 D NVRAM   : bes_loudness_WS_Gain_Max = 0
01-10 13:51:33.142926   380   697 D NVRAM   : bes_loudness_WS_Gain_Min = 0
01-10 13:51:33.142954   380   697 D NVRAM   : bes_loudness_Filter_First = 0
01-10 13:51:33.142967   380   697 D NVRAM   : bes_loudness_Num_Bands = 0
01-10 13:51:33.142979   380   697 D NVRAM   : bes_loudness_Flt_Bank_Order = 0
01-10 13:51:33.142997   380   697 D NVRAM   : DRC_Delay = 0
01-10 13:51:33.143011   380   697 D NVRAM   : Lim_Th = 0
01-10 13:51:33.143020   380   697 D NVRAM   : Lim_Gn = 0
01-10 13:51:33.143030   380   697 D NVRAM   : Lim_Const = 0
01-10 13:51:33.143042   380   697 D NVRAM   : Lim_Delay = 0
01-10 13:51:33.143051   380   697 D NVRAM   : SWIPRev = 0x520
01-10 13:51:33.143063   380   697 D NVRAM   : getPlaybackPostProcessParameterFromXML Parameter 0 returnValue 0
01-10 13:51:33.143114   380   697 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 0
01-10 13:51:33.143189   380   697 D AudioMTKFilterManager: +Init AudioMTKFilter_VibSpkAddTone
01-10 13:51:33.143224   380   697 D AudioMTKFilterManager: sampleRate [48000] channel [2] format [0x3] bufferSize [2048]
01-10 13:51:33.143238   380   697 D AudioMTKFilterManager: -Init AudioMTKFilter_VibSpkAddTone
01-10 13:51:33.143253   380   697 D AudioVIBSPKControl: +UniqueAudioVIBSPKControl
01-10 13:51:33.143280   380   697 D AudioVIBSPKControl: +UniqueAudioVIBSPKVsgGen
01-10 13:51:33.143294   380   697 D AudioVIBSPKControl: VsgGen constructor
01-10 13:51:33.143306   380   697 D AudioVIBSPKControl: -UniqueAudioVIBSPKVsgGen
01-10 13:51:33.143317   380   697 D AudioVIBSPKControl: VsgGen getInstance()
01-10 13:51:33.143328   380   697 D AudioVIBSPKControl: constructor
01-10 13:51:33.143339   380   697 D AudioVIBSPKControl: -UniqueAudioVIBSPKControl
01-10 13:51:33.143348   380   697 D AudioVIBSPKControl: getInstance()
01-10 13:51:33.143413   380   697 D AudioFtmBase: AudioFtmBase()
01-10 13:51:33.143484   380   697 D LoopbackManager: LoopbackManager(), isMD1Supported = 11
01-10 13:51:33.143514   380   697 D LoopbackManager: LoopbackManager(), mWorkingModemIndex = 0
01-10 13:51:33.143530   380   697 D AudioFtm: AudioFtm()
01-10 13:51:33.143563   380   697 D AudioFtm: mMixer = 0xe74dd000
01-10 13:51:33.143576   380   697 D AudioFtm: GetVibSpkCalibrationStatus()
01-10 13:51:33.144365   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 13:51:33.145596   380   697 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 13:51:33.145816   380   697 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 13:51:33.145849   380   697 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 13:51:33.145862   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:33.145894   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 13:51:33.149880   775   907 D EMDLOGGER1: runListener
01-10 13:51:33.149893   775   775 D EMDLOGGER1: Success to setup socket local server
01-10 13:51:33.149941   775   775 I EMDLOGGER1: MDL: START Logging, mode=2 Gear Id when Reset=0
01-10 13:51:33.149954   775   775 D EMDLOGGER1: startMDLogging: Create starter thread
01-10 13:51:33.149966   775   775 D EMDLOGGER1: startLoggingThreadFun: curr_mode=0, new_mode=2
01-10 13:51:33.150117   775   775 I EMDLOGGER1: ------>Init SD logging mode<------
01-10 13:51:33.150252   775   775 D EMDLOGGER1: Init MDEngine: OK
01-10 13:51:33.150378   775   775 D EMDLOGGER1: MAL_ccb_QueryMDInfo : Send MAL_QueryMDInfo
01-10 13:51:33.150421   775   775 D ccci_lib: write done of user57 buffer0: OK, i=4 write=4, alloc=4, free=3, len=12
01-10 13:51:33.150834   775   775 D EMDLOGGER1: Init LogWritter: OK
01-10 13:51:33.150905   775   775 D EMDLOGGER1: OKOKOK >Init SD logging mode< OKOKOK
01-10 13:51:33.150916   775   775 D EMDLOGGER1: MDCommEngine.start: mode=2
01-10 13:51:33.150945   775   775 D EMDLOGGER1: LogWriter: Logging is started
01-10 13:51:33.151407   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:33.151479   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:33.151514   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:33.152017   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:33.152047   380   697 D AudioMTKFilterManager: VibSpkReadFrequency:9c
01-10 13:51:33.152102   380   697 D AudioVIBSPKControl: setParameters:bb80 9c f 5
01-10 13:51:33.152133   380   697 D AudioVIBSPKControl: VsgGenInit
01-10 13:51:33.152226   380   697 D MtkAudioBitConverter: +open(), format 0, CH 2, SR 48000
01-10 13:51:33.152460   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 13:51:33.152541   380   697 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 13:51:33.152611   380   697 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 13:51:33.152638   380   697 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 13:51:33.152652   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:33.152683   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 13:51:33.153549   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.154239   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:33.154283   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:33.154305   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:33.159434   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:33.159583   380   697 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 3
01-10 13:51:33.159644   380   697 D AudioMTKFilterManager: mFixedParam 0
01-10 13:51:33.159698   380   697 D AudioALSAStreamManager: -openOutputStream(), out = 0xe74ff400, status = 0x0, mStreamOutVector.size() = 1
01-10 13:51:33.161981   528   528 D AudioFlinger_Threads: readOutputParameters_l, mNormalFrameCount 1024
01-10 13:51:33.162141   528   528 I AudioFlinger_Threads: HAL output buffer size 256 frames, normal sink buffer size 1024 frames
01-10 13:51:33.163646   775   775 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 13:51:33.163725   775   775 D EMDLOGGER1: ccb_ioctl: fd 5, req 80044322, ret 0
01-10 13:51:33.163737   775   775 I EMDLOGGER1: MAL_ccb_GetModemSuffix: suffix 1_ulwctg_n
01-10 13:51:33.163879   775   775 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 13:51:33.163925   775   775 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 13:51:33.163972   775   775 D ccci_lib: write done of user57 buffer0: OK, i=5 write=5, alloc=5, free=4, len=12
01-10 13:51:33.164316   775   775 I EMDLOGGER1: MAL_ccb_QueryMDTime: MD time is 25719
01-10 13:51:33.164552   380   697 E EffectsConfig: Failed to parse /vendor/etc/audio_effects.xml: Tinyxml2 error (3): /vendor/etc/audio_effects.xml (null)
01-10 13:51:33.164639   380   697 E EffectsFactoryConfigLoader: Failed to parse XML configuration file
01-10 13:51:33.164683   380   697 W EffectsFactory: Failed to load XML effect configuration, fallback to .conf
01-10 13:51:33.164764   775   775 I EMDLOGGER1: Creating compressor thread
01-10 13:51:33.165027   775   775 D EMDLOGGER1: Check SD card status
01-10 13:51:33.165691   775   909 I EMDLOGGER1: thrLogBufferWriter started
01-10 13:51:33.170459   775   775 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 13:51:33.170593   775   775 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 13:51:33.170624   775   775 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 13:51:33.170654   775   775 E EMDLOGGER1: Failed to get the SD card status: /mnt/sdcard, errno=2
01-10 13:51:33.170668   775   775 D EMDLOGGER1: Failed to init logwriter: SD card status can't be got or is full.
01-10 13:51:33.170679   775   775 D EMDLOGGER1: Init LogWriter: SD card is not ready, record log on Nand
01-10 13:51:33.170688   775   775 D EMDLOGGER1: Create log file on Nand
01-10 13:51:33.174686   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.179268   775   775 D EMDLOGGER1: Open log file /data/mdlog/bootupLog/mdlog1/MDLog1_2020_0110_135133_data.muxz.tmp.
01-10 13:51:33.179419   775   775 D ccci_lib: write done of user57 buffer0: OK, i=6 write=6, alloc=6, free=5, len=12
01-10 13:51:33.179713   775   775 D EMDLOGGER1: MALCTL_NOTIFY_AP_LOG_FILE_CREATE : /data/mdlog/bootupLog/mdlog1/MDLog1_2020_0110_135133_data.muxz.tmp
01-10 13:51:33.180254   775   775 D EMDLOGGER1: MAL_ccb_OnLoggingStart mode = 2
01-10 13:51:33.180296   775   775 D EMDLOGGER1: MAL_ccb_OnLoggingStart: Send SPLM_A2M_RESET_SPLM_STATE. mdlog_logging_mode = 1
01-10 13:51:33.180326   775   775 D ccci_lib: write done of user57 buffer0: OK, i=7 write=7, alloc=7, free=6, len=16
01-10 13:51:33.180673   775   775 D ccci_lib: write done of user57 buffer0: OK, i=8 write=8, alloc=8, free=7, len=16
01-10 13:51:33.181036   775   775 D EMDLOGGER1: MAL_ccb_OnLoggingStart: Send SPLM_A2M_AP_LOGGING_IS_READY, mdlog_logging_mode = 1
01-10 13:51:33.181130   775   775 D ccci_lib: write done of user57 buffer0: OK, i=9 write=9, alloc=9, free=8, len=16
01-10 13:51:33.183922   775   775 D ccci_lib: write done of user57 buffer2: OK, i=1 write=1, alloc=1, free=0, len=1016
01-10 13:51:33.184046   775   775 D ccci_lib: write done of user57 buffer2: OK, i=2 write=2, alloc=2, free=0, len=8
01-10 13:51:33.184080   775   775 D ccci_lib: write done of user57 buffer2: OK, i=3 write=3, alloc=3, free=0, len=1016
01-10 13:51:33.184107   775   775 D ccci_lib: write done of user57 buffer2: OK, i=4 write=4, alloc=4, free=0, len=8
01-10 13:51:33.184132   775   775 D ccci_lib: write done of user57 buffer2: OK, i=5 write=5, alloc=5, free=0, len=1016
01-10 13:51:33.184149   775   775 D ccci_lib: write done of user57 buffer2: OK, i=6 write=6, alloc=6, free=0, len=8
01-10 13:51:33.184197   775   775 D ccci_lib: write done of user57 buffer2: OK, i=7 write=7, alloc=7, free=0, len=1016
01-10 13:51:33.184220   775   775 D ccci_lib: write done of user57 buffer2: OK, i=8 write=8, alloc=8, free=0, len=8
01-10 13:51:33.184242   775   775 D ccci_lib: write done of user57 buffer2: OK, i=9 write=9, alloc=9, free=0, len=1016
01-10 13:51:33.184385   775   775 D ccci_lib: write done of user57 buffer2: OK, i=10 write=10, alloc=10, free=0, len=8
01-10 13:51:33.184410   775   775 D ccci_lib: write done of user57 buffer2: OK, i=11 write=11, alloc=11, free=0, len=1016
01-10 13:51:33.184429   775   775 D ccci_lib: write done of user57 buffer2: OK, i=12 write=12, alloc=12, free=0, len=8
01-10 13:51:33.184450   775   775 D ccci_lib: write done of user57 buffer2: OK, i=13 write=13, alloc=13, free=0, len=1016
01-10 13:51:33.184466   775   775 D ccci_lib: write done of user57 buffer2: OK, i=14 write=14, alloc=14, free=1, len=8
01-10 13:51:33.184494   775   775 D ccci_lib: write done of user57 buffer2: OK, i=15 write=15, alloc=15, free=1, len=1016
01-10 13:51:33.184513   775   775 D ccci_lib: write done of user57 buffer2: OK, i=16 write=16, alloc=16, free=1, len=8
01-10 13:51:33.184531   775   775 D ccci_lib: write done of user57 buffer2: OK, i=17 write=17, alloc=17, free=1, len=1016
01-10 13:51:33.184548   775   775 D ccci_lib: write done of user57 buffer2: OK, i=18 write=18, alloc=18, free=1, len=8
01-10 13:51:33.184568   775   775 D ccci_lib: write done of user57 buffer2: OK, i=19 write=19, alloc=19, free=1, len=410
01-10 13:51:33.184676   775   775 E EMDLOGGER1: filter size: 9634 Bytes
01-10 13:51:33.184739   775   775 E EMDLOGGER1: filter modified time:2009-01-01 07:00:00
01-10 13:51:33.184749   775   775 E EMDLOGGER1: filter path:/system/vendor/firmware/catcher_filter_1_ulwctg_n.bin
01-10 13:51:33.184757   775   775 D EMDLOGGER1: passFilter: filter successfully sent
01-10 13:51:33.185297   775   775 I EMDLOGGER1: create log recycle thread for data folder log after MAL_start pass
01-10 13:51:33.185547   775   775 D EMDLOGGER1: Start MDEngine: done. mode = 2
01-10 13:51:33.185532   775   911 I EMDLOGGER1: Started Waiting SD card thread.
01-10 13:51:33.185583   775   775 I EMDLOGGER1: Success to start logging in SD Mode!
01-10 13:51:33.185584   775   911 D EMDLOGGER1: Check SD card status
01-10 13:51:33.185593   775   775 D EMDLOGGER1: startLoggingThread result is 1
01-10 13:51:33.185603   775   775 D EMDLOGGER1: startLoggingThread: inform auto start done
01-10 13:51:33.185668   775   775 E EMDLOGGER1: System is not ready then can not auto Start intent.
01-10 13:51:33.185676   775   775 D EMDLOGGER1: Normal boot 1
01-10 13:51:33.185804   775   775 D EMDLOGGER1: Open servFifoFd FIFO -1
01-10 13:51:33.189612   775   912 I EMDLOGGER1: Modem log reader thread started
01-10 13:51:33.189816   775   913 I EMDLOGGER1: Modem log writer thread started
01-10 13:51:33.190106   775   914 I EMDLOGGER1: Comm monitor thread started!
01-10 13:51:33.190190   775   915 I EMDLOGGER1: Detect filter thread started!
01-10 13:51:33.190324   775   911 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 13:51:33.190399   775   911 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 13:51:33.190439   775   911 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 13:51:33.191404   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.198605   527   558 D AAL     : 01-10 01:51:33.122 BL= 957,ESS= 256, 01-10 01:51:33.141 BL= 958,ESS= 256, 01-10 01:51:33.160 BL= 959,ESS= 256, 01-10 01:51:33.179 BL= 960,ESS= 256, 01-10 01:51:33.198 BL= 961,ESS= 256, 
01-10 13:51:33.213237   528   528 I BufferProvider: found effect "Multichannel Downmix To Stereo" from The Android Open Source Project
01-10 13:51:33.215371   528   528 I AudioFlinger: Using module 10 as the primary audio interface
01-10 13:51:33.215324   528   921 I AudioFlinger_Threads: AudioFlinger's thread 0xf2b83d80 tid=921 ready to run
01-10 13:51:33.215669   528   921 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 13:51:33.215786   528   921 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()+
01-10 13:51:33.215760   380   697 W AudioALSAStreamManager: setMode(), mAudioMode: 0 == 0, return
01-10 13:51:33.215837   528   921 D NVRAM   : audioComFltCustParamInit + 
01-10 13:51:33.215932   528   921 D NVRAM   : appOpsGetInstance(), init AppOps struct, lib is libaudio_param_parser-sys.so
01-10 13:51:33.216215   380   919 D AudioALSAHardware: +getParameters(), key = GetBesLoudnessStatus
01-10 13:51:33.216408   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.216820   380   919 D AudioALSAHardware: -getParameters(), return "GetBesLoudnessStatus=1"
01-10 13:51:33.218165   380   697 D AudioALSAHardware: +getParameters(), key = GetGainTableSceneCount
01-10 13:51:33.218250   551   864 I CamCalCamCal: ver1017~ ======================SingleLsc Data==================
01-10 13:51:33.218300   551   864 I CamCalCamCal: ver1017~ [1st] = 2, 8, 4c, 7 
01-10 13:51:33.218317   551   864 I CamCalCamCal: ver1017~ [1st] = SensorLSC(1)?MTKLSC(2)?  2 
01-10 13:51:33.218334   551   864 I CamCalCamCal: ver1017~ CapIspReg =0x30000000, 0xd04bd037, 0x40000000, 0x4d0041, 0x20202020
01-10 13:51:33.218343   380   697 D AudioALSAHardware: getParameters(), GetGainTableSceneCount, sceneCount = 1
01-10 13:51:33.218347   551   864 I CamCalCamCal: ver1017~ RETURN = 0x0 
01-10 13:51:33.218364   551   864 I CamCalCamCal: ver1017~ ======================SingleLsc Data==================
01-10 13:51:33.218388   380   697 D AudioALSAHardware: -getParameters(), return "GetGainTableSceneCount=1"
01-10 13:51:33.218400   551   864 D CAM_CUS_MSDK: CAM_CUS_MSDK Done! GetCameraCalData(MainSensorIdx=30c8) Enter
01-10 13:51:33.218803   551   864 D gma_core: [GmaCore] constructor, sensor dev:1
01-10 13:51:33.218870   380   697 D AudioALSAHardware: +getParameters(), key = GetGainTableSceneTable
01-10 13:51:33.218972   551   864 D lce_core: [LceCore] constructor, sensor dev:1
01-10 13:51:33.218992   380   697 D AudioALSAHardware: GetAudioData(), par1 = 0x103, len = 14240
01-10 13:51:33.219025   380   697 D AudioALSAHardware: GetAudioCommonData(), par1=0x103, len=14240
01-10 13:51:33.219095   380   697 D AudioALSAHardware: GetAudioEncodedBuffer(), before encode (), sz_in(14244), sz_out(18992)
01-10 13:51:33.219255   380   697 D AudioALSAHardware: GetAudioEncodedBuffer(), after encode (AAAAAP8SAAAAEBIAAAAEEgAAAAAQAAAAAA0AAAAACgAAAAAHAAAAAAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVgAAAAJTAAAAAlAAAAACTQAAAAJKAAAAAkcAAAACRAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAQEgAAAAQSAAAAABAAAAAADQAAAAAKAAAAAAcAAAAABAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
01-10 13:51:33.219378   380   697 D AudioALSAHardware: -getParameters(), return "GetGainTableSceneTable=AAAAAP8SAAAAEBIAAAAEEgAAAAAQAAAAAA0AAAAACgAAAAAHAAAAAAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVgAAAAJTAAAAAlAAAAACTQAAAAJKAAAAAkcAAAACRAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAQEgAAAAQSAAAAABAAAAAADQAAAAAKAAAAAAcAAAAABAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
01-10 13:51:33.220266   380   697 D AudioALSAHardware: +getParameters(), key = GetGainTableNonSceneTable
01-10 13:51:33.220440   380   697 D AudioALSAHardware: GetAudioData(), par1 = 0x104, len = 12064
01-10 13:51:33.220474   380   697 D AudioALSAHardware: GetAudioCommonData(), par1=0x104, len=12064
01-10 13:51:33.220787   380   697 D AudioALSAHardware: GetAudioEncodedBuffer(), before encode (), sz_in(12068), sz_out(16092)
01-10 13:51:33.220927   380   697 D AudioALSAHardware: GetAudioEncodedBuffer(), after encode (AAAAAP8SAAAAKBIAAAAcEgAAABASAAAABBIAAAAAEAAAAAAMAAAAAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVwAAAAJTAAAAAk8AAAACSwAAAAJHAAAAAkMAAAACQAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAoEgAAABwSAAAAEBIAAAAEEgAAAAAQAAAAAAwAAAAABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAXAAGAABMAAYA
01-10 13:51:33.221034   380   697 D AudioALSAHardware: -getParameters(), return "GetGainTableNonSceneTable=AAAAAP8SAAAAKBIAAAAcEgAAABASAAAABBIAAAAAEAAAAAAMAAAAAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/wAGAABsAAYAAGAABgAAVAAGAABIAAYAADwABgAAMAAGAAAkAAYAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAAACVwAAAAJTAAAAAk8AAAACSwAAAAJHAAAAAkMAAAACQAAAAAJAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAD/AAYAAGwABgAAYAAGAABUAAYAAEgABgAAPAAGAAAwAAYAACQABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgAAbAAGAABgAAYAAFQABgAASAAGAAA8AAYAADAABgAAJAAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA/xIAAAAoEgAAABwSAAAAEBIAAAAEEgAAAAAQAAAAAAwAAAAABgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAP8ABgA
01-10 13:51:33.221998   528   528 D AudioPolicyManagerCustomImpl: getGainTable, mGainTableSceneCount 1
01-10 13:51:33.222808   380   697 D AudioALSAHardware: +getParameters(), key = GetGainTableCurrentSceneIndex
01-10 13:51:33.222959   380   697 D AudioMTKGainController: getCurrentSceneIndex(), mSceneIndex = 0
01-10 13:51:33.223057   380   697 D AudioALSAHardware: getParameters(), GetGainTableCurrentSceneIndex, currentSceneIndex = 0
01-10 13:51:33.223138   380   697 D AudioALSAHardware: -getParameters(), return "GetGainTableCurrentSceneIndex=0"
01-10 13:51:33.223527   528   528 D AudioPolicyManagerCustomImpl: Using scene [0]/[1]
01-10 13:51:33.223712   528   703 D AudioSystem: +setParameters(): mono_output=0 
01-10 13:51:33.223957   528   528 W AudioFlinger: moveEffects() bad srcOutput 0
01-10 13:51:33.231497   528   921 D AudioParamParser-sys: getDebugLevel(), debug level = -1
01-10 13:51:33.232349   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.233806   551   922 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:33.235956   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.236671   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.236857   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 13:51:33.236957   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 13:51:33.236974   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 13:51:33.236990   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 13:51:33.237841   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.238236   551   864 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:33.239356   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.240019   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.240193   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 13:51:33.240299   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 13:51:33.240313   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 13:51:33.240328   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 13:51:33.233000   551   551 W HwBinder:551_2: type=1400 audit(0.0:34): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:33.240927   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.241288   551   864 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:33.242467   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.243125   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.243315   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 13:51:33.243406   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 13:51:33.243424   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 13:51:33.243439   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 13:51:33.244042   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.244387   551   864 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:33.246105   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.247510   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.247762   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 0
01-10 13:51:33.247866   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 1
01-10 13:51:33.247883   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 2
01-10 13:51:33.247899   551   864 D ShadingTrans_core: Less than 1x gain detected in channel 3
01-10 13:51:33.248505   551   864 D SHADING_TRANS_UTIL: [compute_spline] STEP_OK
01-10 13:51:33.248849   551   864 E lsc_mgr_dft: [do_mkdir] fail to mkdir [/sdcard/shading]: 2[No such file or directory] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:33.249017   551   864 D AppTsf  : [AppTsf] constructor
01-10 13:51:33.249126   551   864 D tsf_core: [TsfCore] constructor
01-10 13:51:33.251377   551   864 W aaa_state_mgr: [StateCommon::transitState] StateUninit --> StateInit
01-10 13:51:33.251420   551   925 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:33.251502   551   925 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(7), sensorDev(1), p(0x0), bForceRead(1) +
01-10 13:51:33.251534   551   925 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(7), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 13:51:33.251559   551   925 W NvramDrv: [readDefaultData:779] CAMERA_DATA_PDC_TABLE
01-10 13:51:33.252041   551   864 I FlashAlgM: FlashAlgM 2
01-10 13:51:33.252133   551   925 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 13:51:33.254832   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:33.255035   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(5), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:33.255072   551   864 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(5), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 13:51:33.255121   551   864 W NvramDrv: [readDefaultData:760] CAMERA_NVRAM_DATA_STROBE cust_fillDefaultStrobeNVRam
01-10 13:51:33.255174   551   864 D flash_custom.cpp: devid main id1
01-10 13:51:33.256126   551   864 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_SENSOR_DRVNAME_S5K3L8_MIPI_RAW
01-10 13:51:33.258506   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.260371   551   864 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_FLASHLIGHT
01-10 13:51:33.261766   551   864 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_AFLAMP
01-10 13:51:33.262607   551   864 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_CAMERASHOT
01-10 13:51:33.263699   551   864 I MtkCam/ParamsManager: [Feature::queryCustomFeature] s8Symbol=queryCustCamfeature_CUSTOM_SENINDEPFEATURE
01-10 13:51:33.266976   551   864 I MtkCam/ParamsManager: [Feature::initFeatures_NoWarningCorrection] (fgIsLowMem, memory_total_in_byte, getpagesize)=(0, 2992164864, 4096)
01-10 13:51:33.268619   551   864 I MtkCam/ParamsManager: [updateDefaultParams2_ByQuery] cap(4208,3120),fov(67,49)
01-10 13:51:33.270412   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:33.270533   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0xe7ea79d8), bForceRead(0) +
01-10 13:51:33.270553   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:33.270567   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0xe83a1e48), bForceRead(0) +
01-10 13:51:33.270579   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:33.270594   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0xe7aad7ac), bForceRead(0) +
01-10 13:51:33.270654   551   864 D LensMCU : LensMCU[isSupportLens][CurrSensorDev]0x0001 [CurrSensorId]0x30c8
01-10 13:51:33.271795   551   864 I MtkCam/FrameController: [FrameController][prvcb] - miLogLevel(1), max delay(30000000), max sleep(1000000000 ns), min sleep(200 us), adj sleep(250000 ns)
01-10 13:51:33.274654   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.276108   531   712 W CameraProviderManager: Camera provider internal/0 says an unknown camera device@1.0/internal/0 now has torch status 0. Curious.
01-10 13:51:33.276503   551   864 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:0
01-10 13:51:33.276705   551   864 I mtkcam-dev1: 0[CameraDevice1Base::open] Add new cameraId 0 - 0xebe30600
01-10 13:51:33.276792   551   864 I mtkcam-dev1: 0[CameraDevice1Base::open] -
01-10 13:51:33.278902   551   864 I mtkcam-dev1: 0[CameraDevice1Base::close] +
01-10 13:51:33.279900   551   864 I MtkCam/CamClient: (864)[uninit] + getStrongCount(1)
01-10 13:51:33.281940   551   925 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 13:51:33.282222   551   925 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 13:51:33.282244   551   925 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 13:51:33.282256   551   925 I MtkCam/Utils: onCreate#03 pc 000f5949  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+348)
01-10 13:51:33.282267   551   925 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 13:51:33.282278   551   925 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 13:51:33.282288   551   925 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 13:51:33.282298   551   925 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 13:51:33.282332   551   925 E MtkCam/IonHeap: PDC_tbl_1@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 13:51:33.282446   551   925 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 13:51:33.290523   551   864 W MtkCam/CamClient/FDClient: (864)[stopFaceDetection] FD was not running
01-10 13:51:33.290873   551   864 I MtkCam/CamClient: (864)[uninit] - getStrongCount(1)
01-10 13:51:33.291233   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 13:51:33.292394   397   413 I libPerfService: 39: legacy set freq: -1 -1 -1 -1
01-10 13:51:33.293159   527   558 D AAL     : 01-10 01:51:33.217 BL= 962,ESS= 256, 01-10 01:51:33.237 BL= 963,ESS= 256, 01-10 01:51:33.255 BL= 964,ESS= 256, 01-10 01:51:33.273 BL= 965,ESS= 256, 01-10 01:51:33.292 BL= 966,ESS= 256, 
01-10 13:51:33.301501   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.304199   551   925 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 13:51:33.304384   551   925 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 13:51:33.304401   551   925 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 13:51:33.304413   551   925 I MtkCam/Utils: onCreate#03 pc 000f5983  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+406)
01-10 13:51:33.304421   551   925 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 13:51:33.304430   551   925 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 13:51:33.304438   551   925 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 13:51:33.304447   551   925 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 13:51:33.304478   551   925 E MtkCam/IonHeap: PDC_tbl_2@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 13:51:33.304578   551   925 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 13:51:33.313583   551   864 W aaa_state_mgr: [StateCommon::transitState] StateInit --> StateUninit
01-10 13:51:33.313736   551   864 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_AE,2),srIdxNum(1)
01-10 13:51:33.313770   551   864 I Drv/HWsync: Drv/HWsync[uninit] mAECyclePeriod(-1)
01-10 13:51:33.313781   551   864 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 13:51:33.313839   551   864 E MtkCam/SensorProviderService: (864)[doDisableSensor] NULL value! (doDisableSensor){#412:vendor/mediatek/proprietary/hardware/mtkcam/utils/sys/SensorProvider/SensorProviderService.cpp}
01-10 13:51:33.313898   551   864 E MtkCam/SensorProviderService: (864)[doDisableSensor] NULL value! (doDisableSensor){#412:vendor/mediatek/proprietary/hardware/mtkcam/utils/sys/SensorProvider/SensorProviderService.cpp}
01-10 13:51:33.317806   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.320568   551   925 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 13:51:33.320605   528   921 E AudioParamParser-sys: audioTypeLoadParamUnitHash(), No paramUnit element found!
01-10 13:51:33.320710   551   925 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 13:51:33.320726   551   925 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 13:51:33.320736   551   925 I MtkCam/Utils: onCreate#03 pc 000f59bd  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+464)
01-10 13:51:33.320746   551   925 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 13:51:33.320756   551   925 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 13:51:33.320765   551   925 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 13:51:33.320774   551   925 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 13:51:33.320799   551   925 E MtkCam/IonHeap: PDC_tbl_3@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 13:51:33.320892   551   925 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 13:51:33.337697   551   925 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 13:51:33.337836   551   925 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 13:51:33.337847   551   925 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 13:51:33.337856   551   925 I MtkCam/Utils: onCreate#03 pc 000f59f3  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+518)
01-10 13:51:33.337865   551   925 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 13:51:33.337877   551   925 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 13:51:33.337884   551   925 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 13:51:33.337918   551   925 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 13:51:33.337943   551   925 E MtkCam/IonHeap: PDC_tbl_4@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 13:51:33.337998   551   925 E isp_mgr_bnr: [PDC_tbl_1] ImageBufferHeap create fail (setBPCIBuf){#727:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/isp_mgr/isp_mgr_bnr.cpp}
01-10 13:51:33.338764   551   864 D AppTsf  : [TsfExit] TsfExit
01-10 13:51:33.338878   551   864 D AppTsf  : [~AppTsf] destructor
01-10 13:51:33.338898   551   864 D tsf_core: [~TsfCore] destructor
01-10 13:51:33.339933   551   864 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(1)
01-10 13:51:33.340043   551   864 I Drv/HWsync: Drv/HWsync[uninit] idx(0,remain_0),tg(0)
01-10 13:51:33.340058   551   864 W Drv/HWsync: Drv/HWsync[uninit] WARNING: wtginf, sindex(0x0),tg(0x0)
01-10 13:51:33.340067   551   864 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 13:51:33.340159   551   864 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11)
01-10 13:51:33.340216   551   864 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11), SENINF_TG1_PH_CNT(0x5)
01-10 13:51:33.341716   551   864 D ImgSensorDrv: [uninit][uninit] imgsensor_drv 0
01-10 13:51:33.341863   551   864 D SeninfDrvImp: [uninit][uninit]: 1 
01-10 13:51:33.341970   551   864 D SeninfDrvImp: [uninit][uninit]: 0, mfd(16) 
01-10 13:51:33.342597   551   864 I mtkcam-devicemgr: [detachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 13:51:32.970
01-10 13:51:33.342836   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.342957   531   712 W CameraProviderManager: Camera provider internal/0 says an unknown camera device@1.0/internal/0 now has torch status 1. Curious.
01-10 13:51:33.343108   551   864 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:1
01-10 13:51:33.343263   551   864 I mtkcam-dev1: 0[CameraDevice1Base::close] Del cameraId 0 - 0xebe30600, this - 0xebe30600
01-10 13:51:33.343322   551   864 I mtkcam-dev1: 0[CameraDevice1Base::close] -
01-10 13:51:33.343501   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:39
01-10 13:51:33.343850   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:39
01-10 13:51:33.343902   397   413 I libPerfService: perfUserUnregScn - handle:39
01-10 13:51:33.344117   531   712 I CameraProviderManager: Camera provider internal/0 ready with 1 camera devices
01-10 13:51:33.344117   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 13:51:33.344509   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:-1
01-10 13:51:33.344766   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:-1
01-10 13:51:33.344819   397   413 I libPerfService: perfUserUnregScn - handle:-1
01-10 13:51:33.345098   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:-1
01-10 13:51:33.345138   531   712 I CameraService: onDeviceStatusChanged: Status changed for cameraId=0, newStatus=1
01-10 13:51:33.345263   531   712 E CameraService: onDeviceStatusChanged: State transition to the same status 0x1 not allowed
01-10 13:51:33.348027   380   697 D vndksupport: Loading /vendor/lib/hw/audio.primary.mt6763.so from current namespace instead of sphal namespace.
01-10 13:51:33.348946   380   697 D mtk_audio_hw_hal: gAudioHALRefCountByClient + 2
01-10 13:51:33.350165   380   697 D AudioALSAHardware: setAudioParameterChangedCallback(), add callback = 0x0xe7a621c9, cookie = 0x0xe748e230, callback size = 0->1
01-10 13:51:33.350470   528   921 D NVRAM   : audioComFltCustParamInit - callbackAudioCompFltCustParamXmlChanged
01-10 13:51:33.350572   528   921 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()-
01-10 13:51:33.350923   380   697 D AudioALSAHardware: +routing createAudioPatch Mixer->2
01-10 13:51:33.350995   380   697 D AudioALSAStreamManager: +setParameters(), IOport = 13, keyValuePairs = routing=2
01-10 13:51:33.351124   380   697 D         : -updateDeviceInfoForVoiceWakeUp(), mIsUseHeadsetMic = 0, bIsUseHeadsetMic = 0
01-10 13:51:33.351150   380   697 W AudioALSAStreamManager: routingOutputDevice(), flag: 6, mPhoneCallSpeechOpen = 0, output_devices == current_output_devices(0x2), return
01-10 13:51:33.351781   380   697 D AudioALSAStreamOut: standby(), flag 6
01-10 13:51:33.351842   380   697 D AudioALSAStreamOut: standbyStreamOut(), flag 6
01-10 13:51:33.358839   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.359586   528   921 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 13:51:33.363527   380   697 D AudioALSAHardware: +getParameters(), key = GetSpeakerProtection
01-10 13:51:33.363795   380   697 D AudioALSAHardware: -getParameters(), return "GetSpeakerProtection=0"
01-10 13:51:33.364011   528   528 D AudioPolicyManagerCustomImpl: Not support GetSpeakerProtection
01-10 13:51:33.364153   528   528 I AudioFlinger: openOutput() this 0xf35be000, module 10 Device 2, SamplingRate 48000, Format 0x000003, Channels 3, flags 8
01-10 13:51:33.364326   380   697 D AudioALSAStreamManager: +openOutputStream()
01-10 13:51:33.364423   380   697 D AudioALSAStreamManager: openOutputStream(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, status = 0x15
01-10 13:51:33.364450   380   697 D AudioALSAStreamOut: AudioALSAStreamOut()
01-10 13:51:33.364504   380   697 D AudioALSAStreamOut: set(), devices = 0x2, format = 0x3, channels = 0x3, sampleRate = 48000, flags = 0x8
01-10 13:51:33.364547   380   697 D AudioALSASampleRateController: +setPrimaryStreamOutSampleRate(), mPrimaryStreamOutSampleRate: 48000 => 48000
01-10 13:51:33.364591   380   697 W AudioALSASampleRateController: -setPrimaryStreamOutSampleRate(), sample_rate == mPrimaryStreamOutSampleRate, return
01-10 13:51:33.364629   380   697 D AudioALSAStreamOut: reduce hal buffer size 40960 -> 16384
01-10 13:51:33.364679   380   697 D AudioALSAStreamOut: set(), mStreamAttributeSource.latency 128, mStreamAttributeSource.buffer_size =16384, channels 2.
01-10 13:51:33.364724   380   697 D NVRAM   : getPlaybackPostProcessParameterFromXML Type/Name [0]/[PlaybackACF]
01-10 13:51:33.364815   380   697 D NVRAM   : bes_loudness_L_hpf_fc = 300
01-10 13:51:33.364839   380   697 D NVRAM   : bes_loudness_L_hpf_order = 2
01-10 13:51:33.364854   380   697 D NVRAM   : bes_loudness_L_lpf_fc = 10000
01-10 13:51:33.364868   380   697 D NVRAM   : bes_loudness_L_lpf_order = 1
01-10 13:51:33.364887   380   697 D NVRAM   : bes_loudness_R_hpf_fc = 0
01-10 13:51:33.364901   380   697 D NVRAM   : bes_loudness_R_hpf_order = 0
01-10 13:51:33.364914   380   697 D NVRAM   : bes_loudness_R_lpf_fc = 0
01-10 13:51:33.364927   380   697 D NVRAM   : bes_loudness_R_lpf_order = 0
01-10 13:51:33.364943   380   697 D NVRAM   : bes_loudness_Sep_LR_Filter = 0
01-10 13:51:33.364956   380   697 D NVRAM   : bes_loudness_WS_Gain_Max = 0
01-10 13:51:33.364970   380   697 D NVRAM   : bes_loudness_WS_Gain_Min = 0
01-10 13:51:33.364983   380   697 D NVRAM   : bes_loudness_Filter_First = 0
01-10 13:51:33.364995   380   697 D NVRAM   : bes_loudness_Num_Bands = 0
01-10 13:51:33.365008   380   697 D NVRAM   : bes_loudness_Flt_Bank_Order = 0
01-10 13:51:33.365025   380   697 D NVRAM   : DRC_Delay = 0
01-10 13:51:33.365041   380   697 D NVRAM   : Lim_Th = 0
01-10 13:51:33.365051   380   697 D NVRAM   : Lim_Gn = 0
01-10 13:51:33.365062   380   697 D NVRAM   : Lim_Const = 0
01-10 13:51:33.365072   380   697 D NVRAM   : Lim_Delay = 0
01-10 13:51:33.365082   380   697 D NVRAM   : SWIPRev = 0x520
01-10 13:51:33.365096   380   697 D NVRAM   : getPlaybackPostProcessParameterFromXML Parameter 0 returnValue 0
01-10 13:51:33.365134   380   697 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 0
01-10 13:51:33.365183   380   697 D AudioMTKFilterManager: +Init AudioMTKFilter_VibSpkAddTone
01-10 13:51:33.365228   380   697 D AudioMTKFilterManager: sampleRate [48000] channel [2] format [0x3] bufferSize [16384]
01-10 13:51:33.365242   380   697 D AudioMTKFilterManager: -Init AudioMTKFilter_VibSpkAddTone
01-10 13:51:33.365254   380   697 D AudioVIBSPKControl: getInstance()
01-10 13:51:33.365300   380   697 D AudioFtm: GetVibSpkCalibrationStatus()
01-10 13:51:33.365541   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 13:51:33.365653   380   697 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 13:51:33.365735   380   697 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 13:51:33.365759   380   697 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 13:51:33.365772   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:33.365803   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 13:51:33.367267   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:33.367327   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:33.367346   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:33.367726   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:33.367759   380   697 D AudioMTKFilterManager: VibSpkReadFrequency:9c
01-10 13:51:33.367833   380   697 D AudioVIBSPKControl: setParameters:bb80 9c f 5
01-10 13:51:33.367892   380   697 D MtkAudioBitConverter: +open(), format 0, CH 2, SR 48000
01-10 13:51:33.368084   380   697 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/media/VibSpk_CompFlt,LID:68
01-10 13:51:33.368172   380   697 D NVRAM   : NVM_CmpFileVerNo 68  
01-10 13:51:33.368241   380   697 D NVRAM   : Load File Version: 001, NvRam File Version: 001
01-10 13:51:33.368259   380   697 D NVRAM   : NVM_ProtectDataFile : 68 ++
01-10 13:51:33.368272   380   697 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:33.368301   380   697 D NVRAM   : NVM_CheckFileSize:stat_size:1262,size in table:1260
01-10 13:51:33.369896   380   697 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:33.369989   380   697 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:33.370021   380   697 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:33.373293   380   697 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:33.373387   380   697 D MtkAudioLoud: mIsZeroCoeff 0 mFilterType 3
01-10 13:51:33.373540   380   697 D AudioMTKFilterManager: mFixedParam 0
01-10 13:51:33.373599   380   697 D AudioALSAStreamManager: -openOutputStream(), out = 0xe74ff800, status = 0x0, mStreamOutVector.size() = 2
01-10 13:51:33.374695   528   528 I AudioFlinger_Threads: HAL output buffer size 2048 frames, normal sink buffer size 2048 frames
01-10 13:51:33.375515   528   934 I AudioFlinger_Threads: AudioFlinger's thread 0xf2583940 tid=934 ready to run
01-10 13:51:33.375599   528   703 D AudioSystem: +setParameters(): mono_output=0 
01-10 13:51:33.375956   528   934 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 13:51:33.376328   528   934 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()+
01-10 13:51:33.376360   528   934 D AudioFlinger_Threads: threadLoop, MtkAudioLoud::initParser()-
01-10 13:51:33.376906   380   919 D AudioALSAHardware: +routing createAudioPatch Mixer->2
01-10 13:51:33.377071   380   919 D AudioALSAStreamManager: +setParameters(), IOport = 21, keyValuePairs = routing=2
01-10 13:51:33.377211   380   919 D         : -updateDeviceInfoForVoiceWakeUp(), mIsUseHeadsetMic = 0, bIsUseHeadsetMic = 0
01-10 13:51:33.377251   380   919 W AudioALSAStreamManager: routingOutputDevice(), flag: 8, mPhoneCallSpeechOpen = 0, output_devices == current_output_devices(0x2), return
01-10 13:51:33.378465   380   919 D AudioALSAStreamOut: standby(), flag 8
01-10 13:51:33.378609   380   919 D AudioALSAStreamOut: standbyStreamOut(), flag 8
01-10 13:51:33.379169   528   934 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 13:51:33.381324   380   919 D AudioALSAStreamManager: openInputStream(), devices = 0x80000004, format = 0x1, channels = 0xc, sampleRate = 48000, status = 14, acoustics = 0x0
01-10 13:51:33.381562   380   919 D AudioALSAStreamIn: AudioALSAStreamIn()
01-10 13:51:33.381639   380   919 D AudioALSAStreamIn: set(), devices = 0x80000004, format = 0x1, channels = 0xc, sampleRate = 48000, acoustics = 0x0, flags = 0
01-10 13:51:33.381654   380   919 D AudioALSAStreamIn: CheckBesRecordInfo()
01-10 13:51:33.381671   380   919 D AudioSpeechEnhanceInfo: GetBesRecScene() -1
01-10 13:51:33.381713   380   919 D AudioSpeechEnhanceInfo: IsBesRecTuningEnable()- 0
01-10 13:51:33.381751   380   919 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 13:51:33.381801   380   919 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 13:51:33.381815   380   919 D AudioSpeechEnhanceInfo: IsAPDMNRTuningEnable(), 0
01-10 13:51:33.381858   380   919 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 13:51:33.381890   380   919 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 13:51:33.381907   380   919 D AudioSpeechEnhanceInfo: GetForceMagiASRState(), feature_support=1a097c57, 400, mForceMagiASR=0
01-10 13:51:33.381936   380   919 D AudioSpeechEnhanceInfo: GetForceAECRecState(), mForceAECRec=0
01-10 13:51:33.381968   380   919 D AudioALSAStreamIn: set() done, sampleRate = 48000, num_channels = 2, buffer_size=3840, tempDebugflag = 0
01-10 13:51:33.382011   380   919 D AudioALSAStreamManager: -openInputStream(), in = 0xe7ffd000, status = 0x0, mStreamInVector.size() = 1
01-10 13:51:33.382051   380   919 D AudioALSAStreamIn: +setParameters(): input_source=1
01-10 13:51:33.382122   380   919 D AudioALSAStreamIn: -setParameters(): input_source=1 
01-10 13:51:33.384690   528   936 I AudioFlinger_Threads: AudioFlinger's thread 0xf2403500 tid=936 ready to run
01-10 13:51:33.384879   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.385813   380   919 D AudioALSAStreamManager: +closeInputStream(), in = 0xe7ffd000, size() = 1
01-10 13:51:33.385967   380   919 D AudioALSAStreamIn: ~AudioALSAStreamIn()
01-10 13:51:33.386094   380   919 D AudioALSAStreamManager: -closeInputStream(), mStreamInVector.size() = 0
01-10 13:51:33.387144   527   558 D AAL     : 01-10 01:51:33.311 BL= 967,ESS= 256, 01-10 01:51:33.330 BL= 968,ESS= 256, 01-10 01:51:33.349 BL= 969,ESS= 256, 01-10 01:51:33.368 BL= 970,ESS= 256, 01-10 01:51:33.387 BL= 971,ESS= 256, 
01-10 13:51:33.397262   525   525 E ActivityRecognitionHardware: activity_recognition HAL is deprecated. class_init is effectively a no-op
01-10 13:51:33.400808   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.413000   528   528 I bt_a2dp_hw: adev_open:  adev_open in A2dp_hw module
01-10 13:51:33.413352   528   528 I AudioFlinger: loadHwModule() Loaded a2dp audio interface, handle 18
01-10 13:51:33.414008   380   919 D vndksupport: Loading /vendor/lib/hw/audio.usb.mt6763.so from current namespace instead of sphal namespace.
01-10 13:51:33.426565   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.442765   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.445409   525   525 W Zygote  : Class not found for preloading: android.icu.impl.number.Parse
01-10 13:51:33.458071   525   525 I zygote64: Thread[1,tid=525,Native,Thread*=0x748ecc3a00,peer=0x12c01fb8,"main"] recursive attempt to load library "/system/lib64/libmedia_jni.so"
01-10 13:51:33.458435   525   525 D MtpDeviceJNI: register_android_mtp_MtpDevice
01-10 13:51:33.459961   525   525 I zygote64: Thread[1,tid=525,Native,Thread*=0x748ecc3a00,peer=0x12c01fb8,"main"] recursive attempt to load library "/system/lib64/libmedia_jni.so"
01-10 13:51:33.460395   525   525 I zygote64: Thread[1,tid=525,Native,Thread*=0x748ecc3a00,peer=0x12c01fb8,"main"] recursive attempt to load library "/system/lib64/libmedia_jni.so"
01-10 13:51:33.468477   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.480839   525   525 D MtkSettingsProviderExt: Global moveToSecure
01-10 13:51:33.481483   527   558 D AAL     : 01-10 01:51:33.405 BL= 972,ESS= 256, 01-10 01:51:33.424 BL= 973,ESS= 256, 01-10 01:51:33.443 BL= 974,ESS= 256, 01-10 01:51:33.462 BL= 975,ESS= 256, 01-10 01:51:33.481 BL= 976,ESS= 256, 
01-10 13:51:33.483031   525   525 D MtkSettingsProviderExt: Secure moveToGlobal
01-10 13:51:33.484603   525   525 D MtkSettingsProviderExt: System moveToSecure
01-10 13:51:33.484796   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.484844   525   525 D MtkSettingsProviderExt: System moveToGlobal
01-10 13:51:33.485850   525   525 D MtkSettingsProviderExt: putInPublicSettings
01-10 13:51:33.499192   379   853 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Fail to connect . retry count: 2
01-10 13:51:33.499637   379   853 D VT HIDL : [IVT] isIMCBrun : True
01-10 13:51:33.503091   380   919 D modules.usbaudio.audio_hal: [USB_AUD] adev_open
01-10 13:51:33.503890   528   528 I AudioFlinger: loadHwModule() Loaded usb audio interface, handle 26
01-10 13:51:33.504335   380   697 D vndksupport: Loading /vendor/lib/hw/audio.r_submix.mt6763.so from current namespace instead of sphal namespace.
01-10 13:51:33.510665   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.513056   873   873 I [epdg_wo]: [C3I] wo_ccci_open: status:MD ready
01-10 13:51:33.513160   873   873 I [epdg_wo]: [WOA] Open /dev/ccci_woa successfully (fd:5); wait adpt ready...
01-10 13:51:33.513245   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=1](13)
01-10 13:51:33.513523   380   697 I r_submix: adev_open(name=audio_hw_if)
01-10 13:51:33.514479   380   697 I r_submix: adev_init_check()
01-10 13:51:33.514901   380   380 W DeviceHAL: Device set_master_mute: Function not implemented
01-10 13:51:33.515106   528   528 I AudioFlinger: loadHwModule() Loaded r_submix audio interface, handle 34
01-10 13:51:33.515373   380   919 D r_submix: adev_open_input_stream(addr=0)
01-10 13:51:33.515469   380   919 D r_submix: submix_audio_device_create_pipe_l(addr=0, idx=9)
01-10 13:51:33.515484   380   919 D r_submix:   now using address 0 for route 9
01-10 13:51:33.517277   528   941 I AudioFlinger_Threads: AudioFlinger's thread 0xf2403d80 tid=941 ready to run
01-10 13:51:33.517801   380   940 D r_submix: adev_close_input_stream()
01-10 13:51:33.517858   380   940 D r_submix: submix_audio_device_release_pipe_l(idx=9) addr=0
01-10 13:51:33.517893   380   940 D r_submix: submix_audio_device_destroy_pipe_l(): pipe destroyed
01-10 13:51:33.518155   528   528 E EffectsConfig: Failed to parse /vendor/etc/audio_effects.xml: Tinyxml2 error (3): /vendor/etc/audio_effects.xml (null)
01-10 13:51:33.518255   528   528 W AudioPolicyEffects: Failed to load XML effect configuration, fallback to .conf
01-10 13:51:33.519491   528   528 D audioserver: AudioPolicyService init done
01-10 13:51:33.520795   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.soundtrigger@2.0::ISoundTriggerHw/default in either framework or device manifest.
01-10 13:51:33.521170   528   528 E SoundTriggerHwService: could not read implementation properties
01-10 13:51:33.521978   528   528 D audioserver: SoundTriggerHwService init done
01-10 13:51:33.526705   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.552289   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.568391   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.575837   527   558 D AAL     : 01-10 01:51:33.500 BL= 977,ESS= 256, 01-10 01:51:33.519 BL= 978,ESS= 256, 01-10 01:51:33.537 BL= 979,ESS= 256, 01-10 01:51:33.556 BL= 980,ESS= 256, 01-10 01:51:33.575 BL= 981,ESS= 256, 
01-10 13:51:33.594364   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.610282   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.631933   525   525 I Zygote  : ...preloaded 4715 classes in 970ms.
01-10 13:51:33.632142   525   525 I zygote64: VMRuntime.preloadDexCaches starting
01-10 13:51:33.636249   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.652201   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.669868   527   558 D AAL     : 01-10 01:51:33.594 BL= 982,ESS= 256, 01-10 01:51:33.613 BL= 983,ESS= 256, 01-10 01:51:33.632 BL= 984,ESS= 256, 01-10 01:51:33.650 BL= 985,ESS= 256, 01-10 01:51:33.669 BL= 986,ESS= 256, 
01-10 13:51:33.678222   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.694220   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.701482   547   638 I ServiceManager: Waiting for service package_native...
01-10 13:51:33.720074   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.735357   525   525 I zygote64: VMRuntime.preloadDexCaches strings total=360436 before=13118 after=13118
01-10 13:51:33.735466   525   525 I zygote64: VMRuntime.preloadDexCaches types total=30514 before=6502 after=6516
01-10 13:51:33.735481   525   525 I zygote64: VMRuntime.preloadDexCaches fields total=142505 before=5834 after=5892
01-10 13:51:33.735496   525   525 I zygote64: VMRuntime.preloadDexCaches methods total=267782 before=12265 after=12328
01-10 13:51:33.735509   525   525 I zygote64: VMRuntime.preloadDexCaches finished
01-10 13:51:33.736294   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.759334   908   908 D         : [SYSENV]sysenv_get_with_area():429 , get env name=msim_config
01-10 13:51:33.759385   908   908 D         : [SYSENV]get_env_info():311 , initialize
01-10 13:51:33.759567   908   908 D         : [SYSENV]get_partition_count():107 , get_partition_count ret ptr: 38
01-10 13:51:33.759706   908   908 D         : [SYSENV]get_partition_path():158 , partition path = /dev/block/mmcblk0p3
01-10 13:51:33.759728   908   908 E         : [SYSENV]get_env_info():321 , env_buffer[1] : dc45200
01-10 13:51:33.760733   908   908 D         : [SYSENV]read_env_area():244 , read 16384 data from 24000 to dc45200
01-10 13:51:33.760979   908   908 W         : [SYSENV]get_env_info():352 , Incorrect sig, probably sysenv is still empty
01-10 13:51:33.762142   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.764545   527   558 D AAL     : 01-10 01:51:33.688 BL= 987,ESS= 256, 01-10 01:51:33.707 BL= 988,ESS= 256, 01-10 01:51:33.726 BL= 989,ESS= 256, 01-10 01:51:33.745 BL= 990,ESS= 256, 01-10 01:51:33.764 BL= 991,ESS= 256, 
01-10 13:51:33.778317   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.778582   405   405 E ccci_fsd(3): fail to open /dev/ccci3_fs: 2
01-10 13:51:33.803759   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.819836   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.845810   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.858478   527   558 D AAL     : 01-10 01:51:33.783 BL= 992,ESS= 256, 01-10 01:51:33.801 BL= 993,ESS= 256, 01-10 01:51:33.820 BL= 994,ESS= 256, 01-10 01:51:33.840 BL= 995,ESS= 256, 01-10 01:51:33.858 BL= 996,ESS= 256, 
01-10 13:51:33.862138   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.863043   781   781 I VoLTE IMCB-2: {{{{[process_msg] msg_id=101602(0x00018CE2), dst=VT1[7], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:33.863043   781   781 I VoLTE IMCB-2: connection status change for module 7 as error_num 0 imcb_imcb_comm_error_handler()@0#797
01-10 13:51:33.863043   781   781 I VoLTE IMCB-2: ENTER imcb_send_multiple_imc_imsvt_connect_req()@0#4072
01-10 13:51:33.863043   781   781 I VoLTE IMCB-2: CHECK: is_connect 0 imcb_send_imc_imsvt_connect_req()@0#4060
01-10 13:51:33.863043   781   781 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:33.863043   781   781 I VoLTE IMCB-2: CHECK: is_connect 0 imcb_send_imc_imsvt_connect_req()@1#4060
01-10 13:51:33.863043   781   781 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248}}}}
01-10 13:51:33.863504   781   781 I VoLTE IMCB-2: {{{{CHECK: is_connect 0 imcb_send_imc_imsvt_connect_req()@2#4060
01-10 13:51:33.863504   781   781 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 13:51:33.863504   781   781 I VoLTE IMCB-2: ENTER imcb_send_multiple_imc_imsvt_connect_req()@0#4072
01-10 13:51:33.863504   781   781 I VoLTE IMCB-2: CHECK: is_connect 1 imcb_send_imc_imsvt_connect_req()@0#4060
01-10 13:51:33.863504   781   781 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:33.863504   781   781 I VoLTE IMCB-2: CHECK: is_connect 1 imcb_send_imc_imsvt_connect_req()@1#4060
01-10 13:51:33.863504   781   781 I VoLTE IMCB-2: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248}}}}
01-10 13:51:33.863635   781   781 I VoLTE IMCB: {{{{CHECK: is_connect 1 imcb_send_imc_imsvt_connect_req()@2#4060
01-10 13:51:33.863635   781   781 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@2#248
01-10 13:51:33.863635   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:33.867895   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:33.868560   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100038(0x000186C6), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:33.868560   781   781 I VoLTE IMCB: ENTER imcb_imc_vt_cap_query_ind_handler()@0#5407
01-10 13:51:33.868560   781   781 I VoLTE IMCB: ENTER imcb_send_imsvt_get_cap_req()@0#4089
01-10 13:51:33.868560   781   781 I VoLTE IMCB: Pure Mesage Send dest=VT1[7], msg_id=101505(0x00018C81), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:33.868560   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:33.868788   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:33.869316   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100038(0x000186C6), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @1#187
01-10 13:51:33.869316   781   781 I VoLTE IMCB: ENTER imcb_imc_vt_cap_query_ind_handler()@1#5407
01-10 13:51:33.869316   781   781 I VoLTE IMCB: ENTER imcb_send_imsvt_get_cap_req()@1#4089
01-10 13:51:33.869316   781   781 I VoLTE IMCB: Pure Mesage Send dest=VT1[7], msg_id=101505(0x00018C81), len=4, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@1#248
01-10 13:51:33.869316   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:33.877146   401   519 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=23.73 dur=1011.25 max=50.42 min=32.52
01-10 13:51:33.887609   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.887613   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:23.563047,dur:1018.54,max:57.06,min:19.21
01-10 13:51:33.891325   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:33.892005   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:33.892005   781   781 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@0#5493
01-10 13:51:33.892005   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=24, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:33.892005   781   781 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@0#5518
01-10 13:51:33.892005   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:33.892387   779   811 I VoLTE REG: rcs_feature = 0 (module/volte//volte_stack/src/reg/reg.c:3230)
01-10 13:51:33.892387   780   818 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 13:51:33.892487   779   811 I VoLTE REG: rcs_state = 0 (module/volte//volte_stack/src/reg/reg.c:3233)
01-10 13:51:33.892497   780   818 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 13:51:33.892538   780   818 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 13:51:33.904544   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.929516   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.934949   561   591 D agps    : [agps][n][RIL] rilp_init_handler = 0
01-10 13:51:33.935037   561   591 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_RE_INIT_RPC
01-10 13:51:33.946193   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.949577   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:33.950231   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100109(0x0001870D), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:33.950231   781   781 I VoLTE IMCB: ENTER imcb_imc_ussd_urc_status_ind_handler()@0#5365
01-10 13:51:33.950231   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=16002(0x00003E82), len=8, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:33.950231   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:33.950342   780   821 E VoLTE Service: Error message type, type = 16002, len = 8 (module/volte//volte_ua/src/service/service.c:1118)
01-10 13:51:33.952979   527   558 D AAL     : 01-10 01:51:33.877 BL= 997,ESS= 256, 01-10 01:51:33.896 BL= 998,ESS= 256, 01-10 01:51:33.914 BL= 999,ESS= 256, 01-10 01:51:33.933 BL=1000,ESS= 256, 01-10 01:51:33.952 BL=1001,ESS= 256, 
01-10 13:51:33.971205   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:33.974247   525   525 I Zygote  : Preloading resources...
01-10 13:51:33.980107   551   867 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 13:51:33.987881   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:33.999853   379   853 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Fail to connect . retry count: 3
01-10 13:51:34.000348   379   853 E VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 Success fd: 10
01-10 13:51:34.000403   379   853 I VT HIDL : [IVT] [VT THREAD] [VT_Bind] des = volte_imsvt1 initialize communication
01-10 13:51:34.000417   379   853 D VT HIDL : [IVT] getInstance
01-10 13:51:34.000434   379   853 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] read from IMCB
01-10 13:51:34.000384   525   525 W Resources: Preloaded drawable resource #0x1080264 (android:drawable/dialog_background_material) that varies with configuration!!
01-10 13:51:34.012986   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.018524   525   525 I Zygote  : ...preloaded 64 resources in 45ms.
01-10 13:51:34.023474   525   525 W Resources: Preloaded color resource #0x1060053 (android:color/btn_default_material_dark) that varies with configuration!!
01-10 13:51:34.024466   525   525 I Zygote  : ...preloaded 41 resources in 5ms.
01-10 13:51:34.029339   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.047262   527   558 D AAL     : 01-10 01:51:33.971 BL=1002,ESS= 256, 01-10 01:51:33.990 BL=1003,ESS= 256, 01-10 01:51:34.009 BL=1004,ESS= 256, 01-10 01:51:34.028 BL=1005,ESS= 256, 01-10 01:51:34.047 BL=1006,ESS= 256, 
01-10 13:51:34.054908   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.070481   525   525 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 13:51:34.071284   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.076087   525   525 D libEGL  : loaded /vendor/lib64/egl/libGLES_mali.so
01-10 13:51:34.096795   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.113058   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.116588   525   525 I Zygote  : Preloading shared libraries...
01-10 13:51:34.137890   525   525 I Zygote  : Uninstalled ICU cache reference pinning...
01-10 13:51:34.138841   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.139889   525   525 I Zygote  : Installed AndroidKeyStoreProvider in 2ms.
01-10 13:51:34.141612   527   558 D AAL     : 01-10 01:51:34.066 BL=1007,ESS= 256, 01-10 01:51:34.084 BL=1008,ESS= 256, 01-10 01:51:34.103 BL=1009,ESS= 256, 01-10 01:51:34.122 BL=1010,ESS= 256, 01-10 01:51:34.141 BL=1011,ESS= 256, 
01-10 13:51:34.151454   525   525 I Zygote  : Warmed up JCA providers in 12ms.
01-10 13:51:34.151582   525   525 D Zygote  : end preload
01-10 13:51:34.151667   775   907 E EMDLOGGER1: select timeout
01-10 13:51:34.155190   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.168652   525   525 I zygote64: Explicit concurrent copying GC freed 16120(784KB) AllocSpace objects, 2(56KB) LOS objects, 75% free, 1501KB/5MB, paused 48us total 16.757ms
01-10 13:51:34.180647   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.186006   525   525 I zygote64: Explicit concurrent copying GC freed 2260(112KB) AllocSpace objects, 0(0B) LOS objects, 75% free, 1420KB/5MB, paused 38us total 12.695ms
01-10 13:51:34.187276   525   525 I zygote64: Global filter of size 170 installed
01-10 13:51:34.197139   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.222536   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.231790   525   525 I Zygote  : System server process 986 has been created
01-10 13:51:34.234439   551   922 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:34.233000   551   551 W HwBinder:551_2: type=1400 audit(0.0:35): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:34.235221   525   525 I Zygote  : Accepting command socket connections
01-10 13:51:34.235933   527   558 D AAL     : 01-10 01:51:34.160 BL=1012,ESS= 256, 01-10 01:51:34.179 BL=1013,ESS= 256, 01-10 01:51:34.198 BL=1012,ESS= 256, 01-10 01:51:34.216 BL=1011,ESS= 256, 01-10 01:51:34.235 BL=1010,ESS= 256, 
01-10 13:51:34.239181   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.264356   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.267573   365   370 D tkcore-teec: New pos: 62270
01-10 13:51:34.268407   365   370 D tkcore-teec: Logging started
01-10 13:51:34.265000   365   365 W teed    : type=1400 audit(0.0:36): avc: denied { write } for name="/" dev="dm-2" ino=2 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:34.281031   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.286029   986   986 I Zygote  : Process: zygote socket zygote_secondary opened, supported ABIS: armeabi-v7a,armeabi
01-10 13:51:34.306582   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.323153   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.330164   527   558 D AAL     : 01-10 01:51:34.254 BL=1011,ESS= 256, 01-10 01:51:34.273 BL=1012,ESS= 256, 01-10 01:51:34.293 BL=1011,ESS= 256, 01-10 01:51:34.311 BL=1010,ESS= 256, 01-10 01:51:34.330 BL=1009,ESS= 256, 
01-10 13:51:34.348633   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.365235   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.366025   379   853 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] read from IMCB done
01-10 13:51:34.366376   379   853 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (status = 0)
01-10 13:51:34.366450   379   853 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (efGroup = -241593880)
01-10 13:51:34.366503   379   853 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (type)
01-10 13:51:34.366691   379   853 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (len)
01-10 13:51:34.366828   379   853 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] write to VTS (buffer)
01-10 13:51:34.366889   379   853 I VT HIDL : [IVT] [VT THREAD] [VT_IMCB_Thread] read from IMCB
01-10 13:51:34.366863   534   847 I VT      : [SRV] [VT THREAD] [VT_HIDL_Thread] msg_type : 101505
01-10 13:51:34.367159   534   847 I VT      : [SRV] [VT THREAD] [VT_HIDL_Thread] recv_length : 4
01-10 13:51:34.367295   534   847 I VT      : [SRV] [VT THREAD] [VT_HIDL_Thread] outBuffer
01-10 13:51:34.367349   534   847 I VT      : [VT] [DISPATCHER] VTMsgDispatcher dispatchMessage
01-10 13:51:34.367636   534   845 I VT      : [VT] [PRI HDLR] VTPriMsgHdlr onMessageReceived
01-10 13:51:34.367788   534   845 I VT      : [VT] [PRI HDLR] VTPriMsgHdlr dispatch normal message
01-10 13:51:34.368034   534   846 I VT      : [VT] [HDLR] VTMsgHdlr onMessageReceived
01-10 13:51:34.368169   534   846 I VT      : [VT] [HDLR] VTMsgHdlr handle normal message
01-10 13:51:34.368343   534   846 W VT      : [SRV] [OPERATION][ID=0] vt_callback (MSG_ID_WRAP_IMSVT_IMCB_GET_CAP_IND)
01-10 13:51:34.368460   534   846 I VT      : [SRV] [MA NOTIFY] Get camera capability (id = 0) (arg1 = 0, arg2 = 0, arg3 = 0)
01-10 13:51:34.368566   534   846 I VT      : [SRV] [MA NOTIFY]                   (obj1 = , obj2 = )
01-10 13:51:34.368609   534   846 I VT      : [VTS] gVTSClient == NULL
01-10 13:51:34.390893   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.407578   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.424359   527   558 D AAL     : 01-10 01:51:34.348 BL=1008,ESS= 256, 01-10 01:51:34.368 BL=1007,ESS= 256, 01-10 01:51:34.386 BL=1006,ESS= 256, 01-10 01:51:34.405 BL=1005,ESS= 256, 01-10 01:51:34.424 BL=1004,ESS= 256, 
01-10 13:51:34.432529   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.437348   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:34.449633   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.458643   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:34.461132   404   404 W ccci_fsd(1): O: X://ST33_004, flag 0x700, ret 1
01-10 13:51:34.461677   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:34.469141   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:34.469209   404   404 W ccci_fsd(1): O: Y://ST33_004, flag 0x700, ret 1
01-10 13:51:34.474391   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.491264   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.513372   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:34.513634   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:1,0](15)
01-10 13:51:34.513822   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=1](13)
01-10 13:51:34.516344   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.518494   527   558 D AAL     : 01-10 01:51:34.443 BL=1003,ESS= 256, 01-10 01:51:34.461 BL=1002,ESS= 256, 01-10 01:51:34.480 BL=1001,ESS= 256, 01-10 01:51:34.499 BL=1000,ESS= 256, 01-10 01:51:34.518 BL= 999,ESS= 256, 
01-10 13:51:34.533513   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.558292   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.575497   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.600005   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.612968   527   558 D AAL     : 01-10 01:51:34.537 BL= 998,ESS= 256, 01-10 01:51:34.556 BL= 997,ESS= 256, 01-10 01:51:34.575 BL= 996,ESS= 256, 01-10 01:51:34.593 BL= 995,ESS= 256, 01-10 01:51:34.612 BL= 994,ESS= 256, 
01-10 13:51:34.617125   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.635031   404   404 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 13:51:34.641960   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.641994   561   634 D agps    : [agps] WARNING: [CP] cp2_fd_1_req_sim_num_timeout
01-10 13:51:34.642205   561   591 D agps    : [agps][n][CP] [MD_1] write  sim_info_req  gsm_disabled=[0] umts_disabled=[0] lte_disabled=[0] lppe_enable=[1] lppe_network_location_disable=[0] reject_non911_nilr_enable=[0] battery_percentage=[100]
01-10 13:51:34.642621   404   404 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 13:51:34.644577   404   404 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 13:51:34.645569   404   404 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 13:51:34.646107   561   591 D agps    : [agps][n][CP] [MD_1] read  sim_info_rsp  sim_number=2 md_type=0 (0=fdd, 1=tdd) ecid=1 otdoa=0 band_num=11
01-10 13:51:34.646171   561   591 D agps    : [agps][n][CP] i=0  support_band=1
01-10 13:51:34.646187   561   591 D agps    : [agps][n][CP] i=1  support_band=3
01-10 13:51:34.646201   561   591 D agps    : [agps][n][CP] i=2  support_band=5
01-10 13:51:34.646215   561   591 D agps    : [agps][n][CP] i=3  support_band=7
01-10 13:51:34.646230   561   591 D agps    : [agps][n][CP] i=4  support_band=8
01-10 13:51:34.646244   561   591 D agps    : [agps][n][CP] i=5  support_band=20
01-10 13:51:34.646258   561   591 D agps    : [agps][n][CP] i=6  support_band=28
01-10 13:51:34.646273   561   591 D agps    : [agps][n][CP] i=7  support_band=38
01-10 13:51:34.646296   561   591 D agps    : [agps][n][CP] i=8  support_band=39
01-10 13:51:34.646311   561   591 D agps    : [agps][n][CP] i=9  support_band=40
01-10 13:51:34.646326   561   591 D agps    : [agps][n][CP] i=10  support_band=41
01-10 13:51:34.646355   561   591 D agps    : [agps][n][CP] index=[0]  support_lpp_otdoa_nbr_cell_list=[0] support_supl_flow_ind=[1] support_location_settings=[1] support_cp_lppe=[0]
01-10 13:51:34.646722   404   404 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 13:51:34.646886   561   591 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[0]
01-10 13:51:34.646886   561   615 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_LBS_CAPABILITY_UPDATE_REQ]
01-10 13:51:34.647023   561   615 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_PEER_EUTRAN_BAND_UPDATE_CNF]
01-10 13:51:34.647112   561   591 D agps    : [agps][n][AGPS] [MNL] write  agps_settings_sync  sib8_16=[1], gps=[1] glonass=[1] beidou=[1] galileo=[1] agps=[1] aglonass=[1] abeidou=[0] agalileo=[0]
01-10 13:51:34.647476   524   695 D MNLD    : agps_settings_sync: agps setting, sib8_16_enable = 1, gps_sat_en = 1, glonass_sat_en = 1,         beidou_sat_en = 1, galileo_sat_en = 1, a_glonass_sat_en = 1,         a_gps_satellite_enable = 1, a_beidou_satellite_enable = 0, a_galileo_satellite_enable = 0, lppe_enable=1
01-10 13:51:34.648246   524   695 D MNLD    : agps_settings_sync: mnl stop, mnld send pmtk764 to agpsd
01-10 13:51:34.648257   561   591 D agps    : [agps][n][AGPS] [MNL] read  agps_settings_ack  gps=[1] glonass=[1] beidou=[1] galileo=[0]
01-10 13:51:34.648327   524   695 D MNLD    : get_agnss_capability: MNLD_PMTK764: $PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 13:51:34.648327   524   695 D MNLD    : , agps_cap:1, aglonass_cap:1, abeidou_cap:0, agalileo_cap:0, lppe_support:1
01-10 13:51:34.648517   561   591 D agps    : [agps][n][AGPS] [MNL] read  pmtk=[$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 13:51:34.648517   561   591 D agps    : ]
01-10 13:51:34.648572   561   591 D agps    : [agps][n][AGPS] gnss_num=2
01-10 13:51:34.648622   561   591 D agps    : [agps][n][CP] [MD_1] write  pmtk [$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 13:51:34.648622   561   591 D agps    : ]
01-10 13:51:34.648624   404   404 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 13:51:34.649858   404   404 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 13:51:34.651481   404   404 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 13:51:34.653561   404   404 W ccci_fsd(1): O: X://LD40_001, flag 0x700, ret 1
01-10 13:51:34.655170   404   404 W ccci_fsd(1): O: Y://LD40_001, flag 0x700, ret 1
01-10 13:51:34.659072   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.683795   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.700791   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.707056   527   558 D AAL     : 01-10 01:51:34.631 BL= 993,ESS= 256, 01-10 01:51:34.650 BL= 992,ESS= 256, 01-10 01:51:34.669 BL= 991,ESS= 256, 01-10 01:51:34.688 BL= 990,ESS= 256, 01-10 01:51:34.707 BL= 989,ESS= 256, 
01-10 13:51:34.725715   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.742893   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.767591   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.784605   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.801470   527   558 D AAL     : 01-10 01:51:34.725 BL= 988,ESS= 256, 01-10 01:51:34.744 BL= 987,ESS= 256, 01-10 01:51:34.763 BL= 986,ESS= 256, 01-10 01:51:34.782 BL= 985,ESS= 256, 01-10 01:51:34.801 BL= 984,ESS= 256, 
01-10 13:51:34.809614   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.827007   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.851632   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.868965   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.881500   401   519 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=23.90 dur=1004.28 max=43.39 min=39.72
01-10 13:51:34.888468   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:23.977901,dur:1000.92,max:57.72,min:36.21
01-10 13:51:34.893626   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.895702   527   558 D AAL     : 01-10 01:51:34.820 BL= 983,ESS= 256, 01-10 01:51:34.839 BL= 982,ESS= 256, 01-10 01:51:34.858 BL= 981,ESS= 256, 01-10 01:51:34.876 BL= 980,ESS= 256, 01-10 01:51:34.895 BL= 979,ESS= 256, 
01-10 13:51:34.907262   986   986 D MtkCam/Utils: ###### get camera log property =-1
01-10 13:51:34.910931   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.912811   986   986 D aaa_log : ###### get hal3a log level =-1
01-10 13:51:34.935587   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.953247   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:34.955445   535   566 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 13:51:34.977278   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:34.980773   551   867 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 13:51:34.990121   527   558 D AAL     : 01-10 01:51:34.914 BL= 978,ESS= 256, 01-10 01:51:34.933 BL= 977,ESS= 256, 01-10 01:51:34.952 BL= 976,ESS= 256, 01-10 01:51:34.971 BL= 975,ESS= 256, 01-10 01:51:34.990 BL= 974,ESS= 256, 
01-10 13:51:34.994632   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.019123   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.036464   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.060945   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.078513   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.084502   527   558 D AAL     : 01-10 01:51:35.008 BL= 973,ESS= 256, 01-10 01:51:35.027 BL= 972,ESS= 256, 01-10 01:51:35.046 BL= 971,ESS= 256, 01-10 01:51:35.065 BL= 970,ESS= 256, 01-10 01:51:35.084 BL= 969,ESS= 256, 
01-10 13:51:35.102925   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.120503   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.122796   986  1004 E BluetoothAdapter: Bluetooth binder is null
01-10 13:51:35.144738   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.154822   986  1004 I PowerManagerService-JNI: Loaded power HAL service
01-10 13:51:35.162379   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.178443   527   558 D AAL     : 01-10 01:51:35.103 BL= 968,ESS= 256, 01-10 01:51:35.122 BL= 967,ESS= 256, 01-10 01:51:35.140 BL= 966,ESS= 256, 01-10 01:51:35.160 BL= 965,ESS= 256, 01-10 01:51:35.178 BL= 964,ESS= 256, 
01-10 13:51:35.186489   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.195387   775   911 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 13:51:35.195539   775   911 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 13:51:35.195576   775   911 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 13:51:35.204040   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.228365   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.234875   986   986 I AES     : load Exception Log jni
01-10 13:51:35.235179   551   922 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:35.240011   986   986 W zygote64: Failed to remove /acct/uid_0/pid_306: Device or resource busy
01-10 13:51:35.240188   986   986 W zygote64: Failed to remove /acct/uid_0/pid_367: Device or resource busy
01-10 13:51:35.240251   986   986 W zygote64: Failed to remove /acct/uid_0/pid_399: Device or resource busy
01-10 13:51:35.240283   986   986 W zygote64: Failed to remove /acct/uid_0/pid_400: Device or resource busy
01-10 13:51:35.240321   986   986 W zygote64: Failed to remove /acct/uid_0/pid_402: Device or resource busy
01-10 13:51:35.240350   986   986 W zygote64: Failed to remove /acct/uid_0/pid_403: Device or resource busy
01-10 13:51:35.240376   986   986 W zygote64: Failed to remove /acct/uid_0/pid_409: Device or resource busy
01-10 13:51:35.240540   986   986 W zygote64: Failed to remove /acct/uid_0/pid_525: Device or resource busy
01-10 13:51:35.240575   986   986 W zygote64: Failed to remove /acct/uid_0/pid_526: Device or resource busy
01-10 13:51:35.240610   986   986 W zygote64: Failed to remove /acct/uid_0/pid_535: Device or resource busy
01-10 13:51:35.240639   986   986 W zygote64: Failed to remove /acct/uid_0/pid_541: Device or resource busy
01-10 13:51:35.240671   986   986 W zygote64: Failed to remove /acct/uid_0/pid_542: Device or resource busy
01-10 13:51:35.240709   986   986 W zygote64: Failed to remove /acct/uid_0/pid_544: Device or resource busy
01-10 13:51:35.240746   986   986 W zygote64: Failed to remove /acct/uid_0/pid_545: Device or resource busy
01-10 13:51:35.240774   986   986 W zygote64: Failed to remove /acct/uid_0/pid_546: Device or resource busy
01-10 13:51:35.240804   986   986 W zygote64: Failed to remove /acct/uid_0/pid_547: Device or resource busy
01-10 13:51:35.240842   986   986 W zygote64: Failed to remove /acct/uid_0/pid_552: Device or resource busy
01-10 13:51:35.240909   986   986 W zygote64: Failed to remove /acct/uid_0/pid_563: Device or resource busy
01-10 13:51:35.241010   986   986 W zygote64: Failed to remove /acct/uid_0/pid_774: Device or resource busy
01-10 13:51:35.241043   986   986 W zygote64: Failed to remove /acct/uid_0/pid_776: Device or resource busy
01-10 13:51:35.241082   986   986 W zygote64: Failed to remove /acct/uid_0/pid_778: Device or resource busy
01-10 13:51:35.241119   986   986 W zygote64: Failed to remove /acct/uid_0/pid_779: Device or resource busy
01-10 13:51:35.241147   986   986 W zygote64: Failed to remove /acct/uid_0/pid_780: Device or resource busy
01-10 13:51:35.241184   986   986 W zygote64: Failed to remove /acct/uid_0/pid_781: Device or resource busy
01-10 13:51:35.241218   986   986 W zygote64: Failed to remove /acct/uid_0/pid_869: Device or resource busy
01-10 13:51:35.241247   986   986 W zygote64: Failed to remove /acct/uid_0/pid_870: Device or resource busy
01-10 13:51:35.241286   986   986 W zygote64: Failed to remove /acct/uid_0/pid_871: Device or resource busy
01-10 13:51:35.241323   986   986 W zygote64: Failed to remove /acct/uid_0/pid_872: Device or resource busy
01-10 13:51:35.241351   986   986 W zygote64: Failed to remove /acct/uid_0/pid_873: Device or resource busy
01-10 13:51:35.241397   986   986 W zygote64: Failed to remove /acct/uid_0: Permission denied
01-10 13:51:35.241588   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_350: Device or resource busy
01-10 13:51:35.241627   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_351: Device or resource busy
01-10 13:51:35.241658   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_352: Device or resource busy
01-10 13:51:35.241687   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_365: Device or resource busy
01-10 13:51:35.241723   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_366: Device or resource busy
01-10 13:51:35.241796   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_378: Device or resource busy
01-10 13:51:35.241830   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_379: Device or resource busy
01-10 13:51:35.241866   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_384: Device or resource busy
01-10 13:51:35.241894   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_387: Device or resource busy
01-10 13:51:35.241926   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_388: Device or resource busy
01-10 13:51:35.241952   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_389: Device or resource busy
01-10 13:51:35.241986   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_390: Device or resource busy
01-10 13:51:35.242021   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_391: Device or resource busy
01-10 13:51:35.242049   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_392: Device or resource busy
01-10 13:51:35.242085   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_393: Device or resource busy
01-10 13:51:35.242118   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_395: Device or resource busy
01-10 13:51:35.242146   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_396: Device or resource busy
01-10 13:51:35.242179   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_397: Device or resource busy
01-10 13:51:35.242216   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_401: Device or resource busy
01-10 13:51:35.242255   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_406: Device or resource busy
01-10 13:51:35.242327   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_411: Device or resource busy
01-10 13:51:35.242430   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_527: Device or resource busy
01-10 13:51:35.242464   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_530: Device or resource busy
01-10 13:51:35.242500   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_533: Device or resource busy
01-10 13:51:35.242530   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_534: Device or resource busy
01-10 13:51:35.242562   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_550: Device or resource busy
01-10 13:51:35.242591   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_553: Device or resource busy
01-10 13:51:35.242627   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_556: Device or resource busy
01-10 13:51:35.242660   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_557: Device or resource busy
01-10 13:51:35.242688   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_560: Device or resource busy
01-10 13:51:35.242723   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_562: Device or resource busy
01-10 13:51:35.242758   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_564: Device or resource busy
01-10 13:51:35.242789   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_565: Device or resource busy
01-10 13:51:35.242821   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_567: Device or resource busy
01-10 13:51:35.242859   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_570: Device or resource busy
01-10 13:51:35.242895   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_571: Device or resource busy
01-10 13:51:35.242923   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_572: Device or resource busy
01-10 13:51:35.242957   986   986 W zygote64: Failed to remove /acct/uid_1000/pid_575: Device or resource busy
01-10 13:51:35.243004   986   986 W zygote64: Failed to remove /acct/uid_1000: Permission denied
01-10 13:51:35.243091   986   986 W zygote64: Failed to remove /acct/uid_1001/pid_404: Device or resource busy
01-10 13:51:35.243160   986   986 W zygote64: Failed to remove /acct/uid_1001/pid_408: Device or resource busy
01-10 13:51:35.243193   986   986 W zygote64: Failed to remove /acct/uid_1001/pid_412: Device or resource busy
01-10 13:51:35.243221   986   986 W zygote64: Failed to remove /acct/uid_1001/pid_908: Device or resource busy
01-10 13:51:35.243251   986   986 W zygote64: Failed to remove /acct/uid_1001: Permission denied
01-10 13:51:35.243300   986   986 W zygote64: Failed to remove /acct/uid_1002/pid_381: Device or resource busy
01-10 13:51:35.243326   986   986 W zygote64: Failed to remove /acct/uid_1002: Permission denied
01-10 13:51:35.243376   986   986 W zygote64: Failed to remove /acct/uid_1003/pid_485: Device or resource busy
01-10 13:51:35.243397   986   986 W zygote64: Failed to remove /acct/uid_1003: Permission denied
01-10 13:51:35.243449   986   986 W zygote64: Failed to remove /acct/uid_1010/pid_394: Device or resource busy
01-10 13:51:35.243478   986   986 W zygote64: Failed to remove /acct/uid_1010/pid_548: Device or resource busy
01-10 13:51:35.243510   986   986 W zygote64: Failed to remove /acct/uid_1010/pid_568: Device or resource busy
01-10 13:51:35.243541   986   986 W zygote64: Failed to remove /acct/uid_1010: Permission denied
01-10 13:51:35.243607   986   986 W zygote64: Failed to remove /acct/uid_1013/pid_383: Device or resource busy
01-10 13:51:35.243637   986   986 W zygote64: Failed to remove /acct/uid_1013/pid_385: Device or resource busy
01-10 13:51:35.243665   986   986 W zygote64: Failed to remove /acct/uid_1013/pid_386: Device or resource busy
01-10 13:51:35.243695   986   986 W zygote64: Failed to remove /acct/uid_1013/pid_537: Device or resource busy
01-10 13:51:35.233000   551   551 W HwBinder:551_2: type=1400 audit(0.0:38): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:35.243724   986   986 W zygote64: Failed to remove /acct/uid_1013/pid_539: Device or resource busy
01-10 13:51:35.243752   986   986 W zygote64: Failed to remove /acct/uid_1013/pid_540: Device or resource busy
01-10 13:51:35.243775   986   986 W zygote64: Failed to remove /acct/uid_1013: Permission denied
01-10 13:51:35.243823   986   986 W zygote64: Failed to remove /acct/uid_1017/pid_536: Device or resource busy
01-10 13:51:35.243844   986   986 W zygote64: Failed to remove /acct/uid_1017: Permission denied
01-10 13:51:35.243895   986   986 W zygote64: Failed to remove /acct/uid_1019/pid_532: Device or resource busy
01-10 13:51:35.243916   986   986 W zygote64: Failed to remove /acct/uid_1019: Permission denied
01-10 13:51:35.243973   986   986 W zygote64: Failed to remove /acct/uid_1021/pid_524: Device or resource busy
01-10 13:51:35.244001   986   986 W zygote64: Failed to remove /acct/uid_1021/pid_561: Device or resource busy
01-10 13:51:35.244022   986   986 W zygote64: Failed to remove /acct/uid_1021: Permission denied
01-10 13:51:35.244074   986   986 W zygote64: Failed to remove /acct/uid_1027/pid_398: Device or resource busy
01-10 13:51:35.244095   986   986 W zygote64: Failed to remove /acct/uid_1027: Permission denied
01-10 13:51:35.244150   986   986 W zygote64: Failed to remove /acct/uid_1036/pid_349: Device or resource busy
01-10 13:51:35.244250   986   986 W zygote64: Failed to remove /acct/uid_1036: Permission denied
01-10 13:51:35.244312   986   986 W zygote64: Failed to remove /acct/uid_1040/pid_538: Device or resource busy
01-10 13:51:35.244337   986   986 W zygote64: Failed to remove /acct/uid_1040: Permission denied
01-10 13:51:35.244393   986   986 W zygote64: Failed to remove /acct/uid_1041/pid_380: Device or resource busy
01-10 13:51:35.244426   986   986 W zygote64: Failed to remove /acct/uid_1041/pid_382: Device or resource busy
01-10 13:51:35.244463   986   986 W zygote64: Failed to remove /acct/uid_1041/pid_528: Device or resource busy
01-10 13:51:35.244485   986   986 W zygote64: Failed to remove /acct/uid_1041: Permission denied
01-10 13:51:35.244536   986   986 W zygote64: Failed to remove /acct/uid_1046/pid_549: Device or resource busy
01-10 13:51:35.244562   986   986 W zygote64: Failed to remove /acct/uid_1046: Permission denied
01-10 13:51:35.244614   986   986 W zygote64: Failed to remove /acct/uid_1047/pid_531: Device or resource busy
01-10 13:51:35.244647   986   986 W zygote64: Failed to remove /acct/uid_1047/pid_543: Device or resource busy
01-10 13:51:35.244684   986   986 W zygote64: Failed to remove /acct/uid_1047/pid_551: Device or resource busy
01-10 13:51:35.244714   986   986 W zygote64: Failed to remove /acct/uid_1047: Permission denied
01-10 13:51:35.244770   986   986 W zygote64: Failed to remove /acct/uid_1058/pid_574: Device or resource busy
01-10 13:51:35.244794   986   986 W zygote64: Failed to remove /acct/uid_1058: Permission denied
01-10 13:51:35.244848   986   986 W zygote64: Failed to remove /acct/uid_2000/pid_425: Device or resource busy
01-10 13:51:35.244880   986   986 W zygote64: Failed to remove /acct/uid_2000/pid_775: Device or resource busy
01-10 13:51:35.244909   986   986 W zygote64: Failed to remove /acct/uid_2000: Permission denied
01-10 13:51:35.246000   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.248176   552   552 D NVRAM   : length of g_NVRAM_BACKUP_DEVICE=44
01-10 13:51:35.248308   552   552 D NVRAM   : failed to get entry for /nvdata 
01-10 13:51:35.248323   552   552 D NVRAM   : failed to get nvdata path /nvdata 
01-10 13:51:35.248413   552   552 D NVRAM   : nvram_layout_callback will run!!!
01-10 13:51:35.248440   552   552 D NVRAM   : nvram_platform_log_block: 2
01-10 13:51:35.248455   552   552 D NVRAM   : nvram_platform_resv_block: 2
01-10 13:51:35.248469   552   552 D NVRAM   : nvram_platform_DM_block: 1
01-10 13:51:35.248482   552   552 D NVRAM   : nvram_platform_layout_version: 0
01-10 13:51:35.248495   552   552 D NVRAM   : nvram_platform_header_offset: 0
01-10 13:51:35.248510   552   552 D NVRAM   : g_i4CFG_File_Count: 51
01-10 13:51:35.248522   552   552 D NVRAM   : NVM_Init Max Lid: 78
01-10 13:51:35.248536   552   552 D NVRAM   : [NVRAM]: info nvram_gpt_flag =1
01-10 13:51:35.248549   552   552 D NVRAM   : [NVRAM]: info NVRAM Init Completed!
01-10 13:51:35.248731   552   552 D NVRAM   : NVM_GetFileDesc: Open /vendor/nvdata/APCFG/APRDCL/FG,LID:76
01-10 13:51:35.249258   552   552 D NVRAM   : NVM_CmpFileVerNo 76  
01-10 13:51:35.249363   552   552 D NVRAM   : Load File Version: 000, NvRam File Version: 000
01-10 13:51:35.249409   552   552 D NVRAM   : NVM_ProtectDataFile : 76 ++
01-10 13:51:35.249582   552   552 D NVRAM   : iCustomBeginLID = 51
01-10 13:51:35.249645   552   552 D NVRAM   : NVM_CheckFileSize:stat_size:26,size in table:24
01-10 13:51:35.250638   552   552 D NVRAM   : NVM_CheckFile: File is correct!
01-10 13:51:35.250740   552   552 D NVRAM   : NVM_ProtectUserData:Check Success
01-10 13:51:35.250798   552   552 D NVRAM   : NVM_GetFileDesc ProtectDataFile Check Success!!
01-10 13:51:35.253151   552   552 D NVRAM   : NVM_CloseFileDesc: Open by Readonly, no need to check when close
01-10 13:51:35.270430   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.272779   527   558 D AAL     : 01-10 01:51:35.197 BL= 963,ESS= 256, 01-10 01:51:35.215 BL= 962,ESS= 256, 01-10 01:51:35.234 BL= 961,ESS= 256, 01-10 01:51:35.254 BL= 960,ESS= 256, 01-10 01:51:35.272 BL= 959,ESS= 256, 
01-10 13:51:35.288146   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.312213   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.330235   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.353022   986   986 W System.err: java.io.FileNotFoundException: /proc/cpu_loading/onoff (No such file or directory)
01-10 13:51:35.353282   986   986 W System.err: 	at java.io.FileOutputStream.open0(Native Method)
01-10 13:51:35.353311   986   986 W System.err: 	at java.io.FileOutputStream.open(FileOutputStream.java:287)
01-10 13:51:35.353330   986   986 W System.err: 	at java.io.FileOutputStream.<init>(FileOutputStream.java:223)
01-10 13:51:35.353344   986   986 W System.err: 	at java.io.FileOutputStream.<init>(FileOutputStream.java:171)
01-10 13:51:35.353359   986   986 W System.err: 	at com.mediatek.duraspeed.utils.FileUtilsController.writeStringToFile(FileUtilsController.java:319)
01-10 13:51:35.353374   986   986 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedInternalManager.stopObserving(DuraSpeedInternalManager.java:563)
01-10 13:51:35.353393   986   986 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedInternalManager.enableCpuObserving(DuraSpeedInternalManager.java:165)
01-10 13:51:35.353408   986   986 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedInternalManager.<init>(DuraSpeedInternalManager.java:145)
01-10 13:51:35.353452   986   986 W System.err: 	at com.mediatek.duraspeed.service.DuraSpeedService.startDuraSpeedService(DuraSpeedService.java:145)
01-10 13:51:35.353467   986   986 W System.err: 	at com.mediatek.server.am.AmsExtImpl.startDuraSpeedService(AmsExtImpl.java:495)
01-10 13:51:35.353484   986   986 W System.err: 	at com.android.server.am.ActivityManagerService.start(ActivityManagerService.java:2923)
01-10 13:51:35.353499   986   986 W System.err: 	at com.android.server.am.ActivityManagerService.-wrap11(Unknown Source:0)
01-10 13:51:35.353513   986   986 W System.err: 	at com.android.server.am.ActivityManagerService$Lifecycle.onStart(ActivityManagerService.java:2709)
01-10 13:51:35.353528   986   986 W System.err: 	at com.android.server.SystemServiceManager.startService(SystemServiceManager.java:124)
01-10 13:51:35.353545   986   986 W System.err: 	at com.android.server.SystemServiceManager.startService(SystemServiceManager.java:111)
01-10 13:51:35.353559   986   986 W System.err: 	at com.android.server.SystemServer.startBootstrapServices(SystemServer.java:566)
01-10 13:51:35.353572   986   986 W System.err: 	at com.android.server.SystemServer.run(SystemServer.java:428)
01-10 13:51:35.353586   986   986 W System.err: 	at com.android.server.SystemServer.main(SystemServer.java:299)
01-10 13:51:35.353602   986   986 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 13:51:35.353616   986   986 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 13:51:35.353629   986   986 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:837)
01-10 13:51:35.354161   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.361314   986   986 E libsuspend: Error opening dlservice!!
01-10 13:51:35.361796   986   986 I libsuspend: Selected wakeup count
01-10 13:51:35.362123   397   414 I vendor.mediatek.hardware.power@1.1-impl: setInteractive Restore All
01-10 13:51:35.362743   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_RESTORE_ALL
01-10 13:51:35.367090   527   558 D AAL     : 01-10 01:51:35.291 BL= 958,ESS= 256, 01-10 01:51:35.310 BL= 957,ESS= 256, 01-10 01:51:35.329 BL= 956,ESS= 256, 01-10 01:51:35.347 BL= 955,ESS= 256, 01-10 01:51:35.367 BL= 954,ESS= 256, 
01-10 13:51:35.372191   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.385215   401   519 I SurfaceFlinger: EventThread Client Pid (986) created
01-10 13:51:35.386031   401   519 I SurfaceFlinger: EventThread Client Pid (986) created
01-10 13:51:35.389513   401   401 D SurfaceFlinger: Set power mode=2, type=0 flinger=0x7300c60000
01-10 13:51:35.396009   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.413659   390   390 D lights  : write_int open fd=7
01-10 13:51:35.414190   567   630 D PQ      : ccorr table index=0
01-10 13:51:35.414322   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.414602   567   630 D PQ      : [PQ_SERVICE] setPQParamWithFilter configFlag: 1
01-10 13:51:35.414930   390   390 D lights  : write_int open fd=7
01-10 13:51:35.423370   527   558 D AAL     : onBacklightChanged: 1023/1023 -> 409/1023(phy:1637/4095)
01-10 13:51:35.437882   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.456508   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.461295   527   558 D AAL     : 01-10 01:51:35.385 BL= 953,ESS= 256, 01-10 01:51:35.404 BL= 952,ESS= 256, 01-10 01:51:35.423 BL= 928,ESS= 256, 01-10 01:51:35.442 BL= 903,ESS= 256, 01-10 01:51:35.461 BL= 878,ESS= 256, 
01-10 13:51:35.479692   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.498473   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.514136   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=0](13)
01-10 13:51:35.514324   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:0,0](15)
01-10 13:51:35.514397   873   873 I [epdg_wo]: [WOA] Daemon & Adpt are ready.
01-10 13:51:35.514418   873   873 I [epdg_wo]: [SKT] external server socket[wod_action]-fd:-1 init successfully
01-10 13:51:35.514438   873   873 I [epdg_wo]: [SKT] external server socket[wod_sim]-fd:-1 init successfully
01-10 13:51:35.514708   873   873 I [epdg_wo]: [SKT] external server socket[wod_ipsec]-fd:6 init successfully
01-10 13:51:35.514769   873   873 I [epdg_wo]: [DMN] WI-FI OFFLOAD DAEMON started
01-10 13:51:35.514925   873   873 I [epdg_wo]: [CFG] Reset settings[0] to default
01-10 13:51:35.514977   873   873 I [epdg_wo]: [CFG] Reset settings[1] to default
01-10 13:51:35.515354   873   873 D [epdg_wo]: [DSC] epdg discoverer state: [NOT_INIT] -> [IS_READY]
01-10 13:51:35.515354   873  1019 I [epdg_wo]: [DSC] epdg discoverer state: [NOT_INIT] -> [IS_READY]cessfully
01-10 13:51:35.515414   873   873 D [epdg_wo]: [DSC] epdg discoverer state: [NOT_INIT] -> [IS_READY]
01-10 13:51:35.515562   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:1,1](15)
01-10 13:51:35.515654   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget=0](13)
01-10 13:51:35.515723   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wostatusget:0,1](15)
01-10 13:51:35.520616   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp=0,0,"",""](15)
01-10 13:51:35.520736   873   873 I [epdg_wo]: [CFG] Reset settings[0] to default
01-10 13:51:35.520777   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp:0,0](9)
01-10 13:51:35.520900   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset=***](15)
01-10 13:51:35.520973   873   873 I [epdg_wo]: [CFG] cfg0: epdg_fqdn=[***],ikev2if=[wlan0],select_info=[***],epdg_identifier=[***],retry_vector=[],
01-10 13:51:35.520993   873   873 I [epdg_wo]: [CFG] cfg0: ike_algo=[],
01-10 13:51:35.521011   873   873 I [epdg_wo]: [CFG] cfg0: esp_algo=[],
01-10 13:51:35.521306   873   873 I [epdg_wo]: [CFG] cfg0: ike_rekey_timer=[81000],esp_rekey_timer=[81000],rekey_margin=[32400],dpd_timer=[120],keep_timer=[20],esp_setup_time=[15],pdn_setup_time=[295],cert_used=[1],urlcert=[0],ocsp=[0],nocert=[1],skip_check_cert=[0],noid=[1],force_tsi_64=[1],force_tsi_full=[1],use_cfg_vip=[0],reauth_addr=[0],dpd_no_reply=[0],pre_post_ping=[0],log_level=[1],wdrv_keep_alive=[1],fragment=[0],mobike=[0],oos=[7],retrans_to=[2],retrans_tries=[4],retrans_base=[1],mtu=[1280],mss4_off=[68],mss6_off=[88],cust_pcscf_4=[20],cust_pcscf_6=[21],cust_imei_cp=[0],port=[10500],port_natt=[14500],cpa_nm=[0],cpa_dns4=[1],cpa_dns6=[1],no_ic=[0],no_eap=[0],ike_dscp=[0],IDi=[0],IDr=[0],leftauth=[0],eap=[0],fastreauth=[0],dns_timer=[0],dns_type=[3],dns_max_count=[254],dns_cache=[1],redirect=[0],max_redirects=[5],redirect_loop_detect=[300],detach_soft_timer=[3],detach_hard_timer=[300],
01-10 13:51:35.521362   873   873 I [epdg_wo]: [CFG] cfg0: fdpd_retrans_to=[1],fdpd_retrans_tries=[2],fdpd_retrans_base=[1],certreq_critical=[0],pcscf_restore=[0],liveness_check=[0],device_identity=[0],abort_mode=[0],ho_ip_disc=[0],emerg_epdg=[0],try_epdg_policy=[0],imei_format=[0],
01-10 13:51:35.521476   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset:0,"",-1](15)
01-10 13:51:35.521606   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp=1,0,"",""](15)
01-10 13:51:35.521638   873   873 I [epdg_wo]: [CFG] Reset settings[1] to default
01-10 13:51:35.521674   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosbp:1,0](9)
01-10 13:51:35.521754   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset=***](15)
01-10 13:51:35.521824   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.521862   873   873 I [epdg_wo]: [CFG] cfg1: epdg_fqdn=[***],ikev2if=[wlan0],select_info=[***],epdg_identifier=[***],retry_vector=[],
01-10 13:51:35.521882   873   873 I [epdg_wo]: [CFG] cfg1: ike_algo=[],
01-10 13:51:35.521899   873   873 I [epdg_wo]: [CFG] cfg1: esp_algo=[],
01-10 13:51:35.522142   873   873 I [epdg_wo]: [CFG] cfg1: ike_rekey_timer=[81000],esp_rekey_timer=[81000],rekey_margin=[32400],dpd_timer=[120],keep_timer=[20],esp_setup_time=[15],pdn_setup_time=[295],cert_used=[1],urlcert=[0],ocsp=[0],nocert=[1],skip_check_cert=[0],noid=[1],force_tsi_64=[1],force_tsi_full=[1],use_cfg_vip=[0],reauth_addr=[0],dpd_no_reply=[0],pre_post_ping=[0],log_level=[1],wdrv_keep_alive=[1],fragment=[0],mobike=[0],oos=[7],retrans_to=[2],retrans_tries=[4],retrans_base=[1],mtu=[1280],mss4_off=[68],mss6_off=[88],cust_pcscf_4=[20],cust_pcscf_6=[21],cust_imei_cp=[0],port=[10500],port_natt=[14500],cpa_nm=[0],cpa_dns4=[1],cpa_dns6=[1],no_ic=[0],no_eap=[0],ike_dscp=[0],IDi=[0],IDr=[0],leftauth=[0],eap=[0],fastreauth=[0],dns_timer=[0],dns_type=[3],dns_max_count=[254],dns_cache=[1],redirect=[0],max_redirects=[5],redirect_loop_detect=[300],detach_soft_timer=[3],detach_hard_timer=[300],
01-10 13:51:35.522226   873   873 I [epdg_wo]: [CFG] cfg1: fdpd_retrans_to=[1],fdpd_retrans_tries=[2],fdpd_retrans_base=[1],certreq_critical=[0],pcscf_restore=[0],liveness_check=[0],device_identity=[0],abort_mode=[0],ho_ip_disc=[0],emerg_epdg=[0],try_epdg_policy=[0],imei_format=[0],
01-10 13:51:35.522262   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woemset:1,"",-1](15)
01-10 13:51:35.522366   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim=***](19)
01-10 13:51:35.522410   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim:0,0](9)
01-10 13:51:35.522529   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim=***](19)
01-10 13:51:35.522569   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wosim:1,0](9)
01-10 13:51:35.540790   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.555443   527   558 D AAL     : 01-10 01:51:35.480 BL= 853,ESS= 256, 01-10 01:51:35.499 BL= 829,ESS= 256, 01-10 01:51:35.517 BL= 804,ESS= 256, 01-10 01:51:35.536 BL= 780,ESS= 256, 01-10 01:51:35.555 BL= 755,ESS= 256, 
01-10 13:51:35.563522   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.582856   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.605529   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.625557   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.647146   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.649843   527   558 D AAL     : 01-10 01:51:35.574 BL= 731,ESS= 256, 01-10 01:51:35.593 BL= 707,ESS= 256, 01-10 01:51:35.612 BL= 682,ESS= 256, 01-10 01:51:35.630 BL= 658,ESS= 256, 01-10 01:51:35.649 BL= 634,ESS= 256, 
01-10 13:51:35.654020   986   986 D Cta_PermRecordsController: readState() BEGIN
01-10 13:51:35.667335   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.679702   986   986 D Cta_PermRecordsController: readState() END
01-10 13:51:35.688949   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.702511   986   986 D PackageManager: No files in app dir /custom/framework
01-10 13:51:35.709953   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.730821   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.744076   527   558 D AAL     : 01-10 01:51:35.668 BL= 610,ESS= 256, 01-10 01:51:35.687 BL= 586,ESS= 256, 01-10 01:51:35.706 BL= 562,ESS= 256, 01-10 01:51:35.725 BL= 538,ESS= 256, 01-10 01:51:35.744 BL= 514,ESS= 256, 
01-10 13:51:35.751986   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.772776   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.795028   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.814542   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.837020   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.838503   527   558 D AAL     : 01-10 01:51:35.763 BL= 490,ESS= 256, 01-10 01:51:35.781 BL= 466,ESS= 256, 01-10 01:51:35.800 BL= 442,ESS= 256, 01-10 01:51:35.819 BL= 418,ESS= 256, 01-10 01:51:35.838 BL= 395,ESS= 256, 
01-10 13:51:35.856281   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.879225   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.890895   401   519 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=23.77 dur=1009.47 max=43.56 min=39.84
01-10 13:51:35.898340   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.905366   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:23.600918,dur:1016.91,max:57.74,min:36.07
01-10 13:51:35.922056   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.940172   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:35.964787   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:35.981526   551   867 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 13:51:35.982296   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.007801   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.024028   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.026990   527   558 D AAL     : 01-10 01:51:35.857 BL= 371,ESS= 256, 01-10 01:51:35.876 BL= 370,ESS= 256, 01-10 01:51:35.932 BL= 369,ESS= 256, 01-10 01:51:35.970 BL= 368,ESS= 256, 01-10 01:51:36.026 BL= 367,ESS= 256, 
01-10 13:51:36.048064   986   986 D PackageManager: No files in app dir /vendor/priv-app
01-10 13:51:36.050276   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.049000   986   986 W system_server: type=1400 audit(0.0:39): avc: denied { getattr } for path="/vendor/app/t6" dev="dm-1" ino=31 scontext=u:r:system_server:s0 tcontext=u:object_r:tkcore_systa_dir:s0 tclass=dir permissive=0
01-10 13:51:36.065812   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.092582   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.099224   986   986 D PackageManager: No files in app dir /vendor/plugin
01-10 13:51:36.099553   986   986 D PackageManager: No files in app dir /custom/app
01-10 13:51:36.099706   986   986 D PackageManager: No files in app dir /custom/plugin
01-10 13:51:36.099763   986   986 D PackageManager: No files in app dir /oem/app
01-10 13:51:36.107445   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.109140   986   986 D PackageManager: No files in app dir /data/app-private
01-10 13:51:36.134388   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.137473   535   566 I SELinux : SELinux: Loaded file_contexts
01-10 13:51:36.149288   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.176555   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.191003   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.218783   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.232856   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.235567   551   922 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:36.233000   551   551 W HwBinder:551_2: type=1400 audit(0.0:40): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:36.261571   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.272588   527   558 D AAL     : 01-10 01:51:36.083 BL= 366,ESS= 256, 01-10 01:51:36.121 BL= 365,ESS= 256, 01-10 01:51:36.177 BL= 364,ESS= 256, 01-10 01:51:36.215 BL= 363,ESS= 256, 01-10 01:51:36.272 BL= 362,ESS= 256, 
01-10 13:51:36.274443   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.303120   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.317068   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.345113   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.359600   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.386786   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.401233   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.427253   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.443047   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.468405   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.484850   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.498376   527   558 D AAL     : 01-10 01:51:36.309 BL= 361,ESS= 256, 01-10 01:51:36.366 BL= 360,ESS= 256, 01-10 01:51:36.404 BL= 359,ESS= 256, 01-10 01:51:36.460 BL= 358,ESS= 256, 01-10 01:51:36.498 BL= 357,ESS= 256, 
01-10 13:51:36.509583   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.526886   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.550779   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.568668   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.575852   535  1049 D installd: Found valid user 10
01-10 13:51:36.592128   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.610776   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.629133   535  1049 W installd: Ignoring /data/data/com.android.webview/lib with unexpected GID 0 instead of 10070
01-10 13:51:36.633348   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.647487   535  1049 W installd: Ignoring /data/data/com.svox.pico/lib with unexpected GID 0 instead of 10059
01-10 13:51:36.650578   535  1049 W installd: Ignoring /data/data/com.mediatek.webview/lib with unexpected GID 0 instead of 10056
01-10 13:51:36.652675   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.672314   535  1049 W installd: Ignoring /data/data/com.gears42.surefox/lib with unexpected GID 0 instead of 10030
01-10 13:51:36.675931   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.677001   986   986 E PackageManager: There should probably be a verifier, but, none were found
01-10 13:51:36.694639   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.716450   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.727028   986   986 I zygote64: Waiting for a blocking GC Explicit
01-10 13:51:36.736461   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.743439   527   558 D AAL     : 01-10 01:51:36.554 BL= 356,ESS= 256, 01-10 01:51:36.592 BL= 355,ESS= 256, 01-10 01:51:36.649 BL= 354,ESS= 256, 01-10 01:51:36.687 BL= 353,ESS= 256, 01-10 01:51:36.743 BL= 352,ESS= 256, 
01-10 13:51:36.758031   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.762029   986   986 I zygote64: WaitForGcToComplete blocked Explicit on AddRemoveAppImageSpace for 34.972ms
01-10 13:51:36.775871   535  1049 W installd: Ignoring /data/user/10/com.android.webview/lib with unexpected GID 0 instead of 1010070
01-10 13:51:36.778488   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.780367   535  1049 W installd: Ignoring /data/user/10/com.svox.pico/lib with unexpected GID 0 instead of 1010059
01-10 13:51:36.781649   535  1049 W installd: Ignoring /data/user/10/com.mediatek.webview/lib with unexpected GID 0 instead of 1010056
01-10 13:51:36.788390   535  1049 W installd: Ignoring /data/user/10/com.gears42.surefox/lib with unexpected GID 0 instead of 1010030
01-10 13:51:36.798903   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.820357   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.833393   986   986 I zygote64: Explicit concurrent copying GC freed 9260(421KB) AllocSpace objects, 3(60KB) LOS objects, 42% free, 4MB/8MB, paused 70us total 71.034ms
01-10 13:51:36.836418   986   986 D FallbackCategoryProvider: Found 1 fallback categories
01-10 13:51:36.841127   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.862328   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.871851   400   400 I lowmemorykiller: ActivityManager connected
01-10 13:51:36.880797   986  1060 D SensorService: nuSensorService starting...
01-10 13:51:36.882003   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.886239   550   550 D Sensors_Init:  sSensorList addr =0x75b9e27008, module addr =0x75b9e27218
01-10 13:51:36.886432   550   550 D Sensors_Init:  ARRAY_SIZE(sSensorList) =5 SENSORS_NUM=5 MAX_NUM_SENSOR=5 
01-10 13:51:36.886963   986  1060 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 13:51:36.887406   550   550 I Accelerometer: enable: handle:0, en:0
01-10 13:51:36.888160   986  1060 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 13:51:36.888497   550   550 I Magnetic: enable: handle:1, en:0 
01-10 13:51:36.889117   986  1060 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 13:51:36.889565   550   550 I Gyroscope: enable: handle:3, en:0
01-10 13:51:36.890272   986  1060 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 13:51:36.890521   550   550 I Light   : enable: handle:4, en:0 
01-10 13:51:36.890839   986  1060 E SensorService: Reported power 0.000000 not deemed sane, clamping to 0.001000
01-10 13:51:36.890954   550   550 I Proximity: enable: handle:7, en:0 
01-10 13:51:36.895319   401   519 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=23.89 dur=1004.43 max=43.33 min=39.89
01-10 13:51:36.895658   986  1063 D SensorService: nuSensorService thread starting...
01-10 13:51:36.897585   986  1062 D SensorService: new thread SensorEventAckReceiver
01-10 13:51:36.903989   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.923579   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.941828   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:24.120167,dur:1036.48,max:56.75,min:36.76
01-10 13:51:36.945179   986  1050 D BatteryService: mPlugType = 2, mIsTemperatureWarningState = false
01-10 13:51:36.945740   390   390 D lights  : set_led_state colorRGB=FF00FF00, onMS=0, offMS=0
01-10 13:51:36.945833   390   390 D lights  : blink_green, level=255, onMS=0, offMS=0
01-10 13:51:36.946196   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.946761   390   390 D lights  : write_int open fd=7
01-10 13:51:36.964853   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:36.969871   527   558 D AAL     : 01-10 01:51:36.781 BL= 351,ESS= 256, 01-10 01:51:36.837 BL= 350,ESS= 256, 01-10 01:51:36.875 BL= 349,ESS= 256, 01-10 01:51:36.932 BL= 348,ESS= 256, 01-10 01:51:36.969 BL= 347,ESS= 256, 
01-10 13:51:36.977530   986   986 D DL-DeviceManager: parseRebootType: file not found, fallback to RESET
01-10 13:51:36.981648   986   999 I Zygote  : Process: zygote socket zygote opened, supported ABIS: arm64-v8a
01-10 13:51:36.981974   551   867 W /vendor/bin/hw/camerahalserver: Waited one second for android.frameworks.sensorservice@1.0::ISensorManager/default. Waiting another...
01-10 13:51:36.987723   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:36.992567   986   999 I Zygote  : Process: zygote socket zygote_secondary opened, supported ABIS: armeabi-v7a,armeabi
01-10 13:51:36.993118   526   526 I Zygote  : Lazily preloading resources.
01-10 13:51:36.993259   526   526 D Zygote  : begin preload
01-10 13:51:36.993280   526   526 I Zygote  : Installing ICU cache reference pinning...
01-10 13:51:36.993293   526   526 I Zygote  : Preloading ICU data...
01-10 13:51:37.006316   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.011868   526   526 I Zygote  : Preloading classes...
01-10 13:51:37.024474   526   526 I SystemServiceRegistry: regMtkService start
01-10 13:51:37.024855   526   526 I SystemServiceRegistry: setMtkSystemServiceName start
01-10 13:51:37.026958   526   526 I MtkSystemServiceRegistry: setMtkSystemServiceName start names{class android.hardware.location.ContextHubManager=contexthub, class android.app.KeyguardManager=keyguard, class android.view.autofill.AutofillManager=autofill, class android.nfc.NfcManager=nfc, class android.service.persistentdata.PersistentDataBlockManager=persistent_data_block, class android.media.soundtrigger.SoundTriggerManager=soundtrigger, class android.view.textservice.TextServicesManager=textservices, class android.hardware.usb.UsbManager=usb, class android.net.NetworkScoreManager=network_score, class android.os.storage.StorageManager=storage, class android.os.Vibrator=vibrator, class android.view.textclassifier.TextClassificationManager=textclassification, class android.hardware.hdmi.HdmiControlManager=hdmi_control, class android.net.EthernetManager=ethernet, class android.appwidget.AppWidgetManager=appwidget, class android.app.UiModeManager=uimode, class android.companion.CompanionDeviceManager=companiondevice, class android.os.IncidentManager=incident, class android.bluetooth.BluetoothManager=bluetooth, class android.os.DropBoxManager=dropbox, class android.media.session.MediaSessionManager=media_session, class android.service.oemlock.OemLockManager=oem_lock, class android.media.projection.MediaProjectionManager=media_projection, class android.app.VrManager=vrmanager, class android.content.ClipboardManager=clipboard, class android.hardware.display.DisplayManager=display, class android.os.RecoverySystem=recovery, class android.net.wifi.RttManager=rttmanager, class android.media.AudioManager=audio, class android.content.pm.ShortcutManager=shortcut, class android.app.admin.DevicePolicyManager=device_policy, class android.app.SearchManager=search, class android.app.ActivityManager=activity, class android.app.AppOpsManager=appops, class android.hardware.radio.RadioManager=broadcastradio, class android.content.pm.LauncherApps=launcherapps, class android.hardware.camera2.CameraManager=camera, class android.os.HardwarePropertiesManager=hardware_properties, class android.app.WallpaperManager=wallpaper, class android.app.job.JobScheduler=jobscheduler, class android.app.DownloadManager=download, class android.net.lowpan.LowpanManager=lowpan, class android.net.wifi.aware.WifiAwareManager=wifiaware, class android.media.midi.MidiManager=midi, class android.app.AlarmManager=alarm, class android.os.PowerManager=power, class android.net.IpSecManager=ipsec, class android.app.usage.NetworkStatsManager=netstats, class android.media.MediaRouter=media_router, class android.net.ConnectivityManager=connectivity, class android.telecom.TelecomManager=telecom, class android.app.StatusBarManager=statusbar, class android.hardware.SensorManager=sensor, class android.telephony.euicc.EuiccManager=euicc_service, class android.view.accessibility.CaptioningManager=captioning, class android.app.usage.UsageStatsManager=usagestats, class android.view.inputmethod.InputMethodManager=input_method, class android.hardware.ConsumerIrManager=consumer_ir, class android.net.wifi.WifiManager=wifi, class android.print.PrintManager=print, class android.telephony.CarrierConfigManager=carrier_config, class android.media.tv.TvInputManager=tv_input, class android.app.trust.TrustManager=trust, class android.os.UserManager=user, class android.location.CountryDetector=country_detector, class android.text.ClipboardManager=clipboard, class android.location.LocationManager=location, class android.net.wifi.WifiScanner=wifiscanner, class android.net.wifi.p2p.WifiP2pManager=wifip2p, interface android.view.WindowManager=window, class android.view.accessibility.AccessibilityManager=accessibility, class android.net.NetworkPolicyManager=netpolicy, class android.os.BatteryManager=batterymanager, class android.app.NotificationManager=notification, class android.net.nsd.NsdManager=servicediscovery, class android.accounts.AccountManager=account, class android.hardware.SerialManager=serial, class android.os.health.SystemHealthManager=systemhealth, class android.telephony.SubscriptionManager=
01-10 13:51:37.027149   526   526 I SystemServiceRegistry: registerAllMtkService start
01-10 13:51:37.027280   526   526 I MtkSystemServiceRegistry: registerAllService start
01-10 13:51:37.029802   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.033530   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:37.047504   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.071518   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.088932   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.105329   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:37.110583   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:37.113713   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.130790   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.139841   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.ir@1.0::IConsumerIr/default in either framework or device manifest.
01-10 13:51:37.155123   986   986 D AlarmManagerService: Kernel timezone updated to -480 minutes west of GMT
01-10 13:51:37.155239   406   700 D ccci_mdinit: (1):save_timezone++
01-10 13:51:37.155550   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.170689   986   986 D AES     : AEEIOCTL_RT_MON_Kick IOCTL,cmd= 2147774474, lParam=0. 
01-10 13:51:37.172249   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.197334   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.201858   775   911 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 13:51:37.202084   775   911 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 13:51:37.202123   775   911 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 13:51:37.203773   401   519 I SurfaceFlinger: [SF client] NEW(0x72fafdf840) for (986:system_server)
01-10 13:51:37.214155   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.214994   527   558 D AAL     : 01-10 01:51:37.026 BL= 346,ESS= 256, 01-10 01:51:37.063 BL= 345,ESS= 256, 01-10 01:51:37.120 BL= 344,ESS= 256, 01-10 01:51:37.158 BL= 343,ESS= 256, 01-10 01:51:37.214 BL= 342,ESS= 256, 
01-10 13:51:37.220730   401   519 I SurfaceFlinger: EventThread Client Pid (986) created
01-10 13:51:37.226363   401   519 I chatty  : uid=1000(system) Binder:401_3 identical 2 lines
01-10 13:51:37.226804   401   519 I SurfaceFlinger: EventThread Client Pid (986) created
01-10 13:51:37.236089   551   922 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:37.233000   551   551 W HwBinder:551_2: type=1400 audit(0.0:41): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:37.239252   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.255761   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.257278   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.vr@1.0::IVr/default in either framework or device manifest.
01-10 13:51:37.257574   986   986 W VrManagerService: init_native: Could not open IVr interface
01-10 13:51:37.257827   551   867 E /vendor/bin/hw/camerahalserver: Could not unregister service notification for android.frameworks.sensorservice@1.0::ISensorManager/default.
01-10 13:51:37.269231   986  1073 I zygote64: hidl_ssvc_poll started.
01-10 13:51:37.270932   986  1072 D EventHub: No input device configuration file found for device 'mtk-kpd'.
01-10 13:51:37.271286   550  1061 I Gyroscope: batch: handle:3, flag:0,samplingPeriodNs:20000000 maxBatchReportLatencyNs:0
01-10 13:51:37.271832   550  1061 I Gyroscope: enable: handle:3, en:1
01-10 13:51:37.274531   550  1061 E Gyroscope: MPE_gyr_calib_read 0.000246 -0.005214 -0.000687,0.000000 0.000000 0.000000,0.000246 -0.005214 -0.000687
01-10 13:51:37.277226   986  1072 W EventHub: Unable to disable kernel key repeat for /dev/input/event2: Function not implemented
01-10 13:51:37.277314   986  1072 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 13:51:37.277346   986  1072 I EventHub: New device: id=1, fd=117, path='/dev/input/event2', name='mtk-kpd', classes=0x1, configuration='', keyLayout='/system/usr/keylayout/mtk-kpd.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 13:51:37.277883   986  1072 D EventHub: No input device configuration file found for device 'tp-kpd'.
01-10 13:51:37.281182   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.283895   986  1072 W EventHub: Unable to disable kernel key repeat for /dev/input/event6: Function not implemented
01-10 13:51:37.284025   986  1072 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 13:51:37.284058   986  1072 I EventHub: New device: id=2, fd=118, path='/dev/input/event6', name='tp-kpd', classes=0x1, configuration='', keyLayout='/system/usr/keylayout/Generic.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 13:51:37.284330   986  1072 D EventHub: No input device configuration file found for device 'scan-keys'.
01-10 13:51:37.288468   986  1072 W EventHub: Unable to disable kernel key repeat for /dev/input/event1: Function not implemented
01-10 13:51:37.288560   986  1072 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 13:51:37.288595   986  1072 I EventHub: New device: id=3, fd=119, path='/dev/input/event1', name='scan-keys', classes=0x1, configuration='', keyLayout='/system/usr/keylayout/scan-keys.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 13:51:37.288923   986  1072 D EventHub: No input device configuration file found for device 'STM VL53L0 proximity sensor'.
01-10 13:51:37.288999   986  1072 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 13:51:37.289041   986  1072 I EventHub: New device: id=4, fd=120, path='/dev/input/event3', name='STM VL53L0 proximity sensor', classes=0x800, configuration='', keyLayout='', keyCharacterMap='', builtinKeyboard=false, 
01-10 13:51:37.289227   986  1072 D EventHub: No input device configuration file found for device 'low_g'.
01-10 13:51:37.298276   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.301247   526   526 E ActivityRecognitionHardware: activity_recognition HAL is deprecated. class_init is effectively a no-op
01-10 13:51:37.322981   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.328395   526   526 W Zygote  : Class not found for preloading: android.icu.impl.number.Parse
01-10 13:51:37.339302   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.342981   526   526 I zygote  : Thread[1,tid=526,Native,Thread*=0xe7fda000,peer=0x12dc0088,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
01-10 13:51:37.343650   526   526 D MtpDeviceJNI: register_android_mtp_MtpDevice
01-10 13:51:37.344601   526   526 I zygote  : Thread[1,tid=526,Native,Thread*=0xe7fda000,peer=0x12dc0088,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
01-10 13:51:37.345524   526   526 I zygote  : Thread[1,tid=526,Native,Thread*=0xe7fda000,peer=0x12dc0088,"main"] recursive attempt to load library "/system/lib/libmedia_jni.so"
01-10 13:51:37.345792   986  1072 D EventHub: No input device configuration file found for device 'mtk-tpd'.
01-10 13:51:37.346169   986  1072 E filemap : mmap(0,4096) failed: No such device
01-10 13:51:37.349283   986  1072 W EventHub: Unable to disable kernel key repeat for /dev/input/event5: Function not implemented
01-10 13:51:37.349459   986  1072 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 13:51:37.349497   986  1072 I EventHub: New device: id=6, fd=122, path='/dev/input/event5', name='mtk-tpd', classes=0x15, configuration='', keyLayout='/system/usr/keylayout/Generic.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 13:51:37.349789   986  1072 D EventHub: No input device configuration file found for device 'ACCDET'.
01-10 13:51:37.352995   986  1072 W EventHub: Unable to disable kernel key repeat for /dev/input/event0: Function not implemented
01-10 13:51:37.353079   986  1072 I EventHub: wakeMechanism=EPOLLWAKEUP, usingClockIoctl=true
01-10 13:51:37.353099   986  1072 I EventHub: New device: id=7, fd=123, path='/dev/input/event0', name='ACCDET', classes=0x81, configuration='', keyLayout='/system/usr/keylayout/ACCDET.kl', keyCharacterMap='/system/usr/keychars/Generic.kcm', builtinKeyboard=false, 
01-10 13:51:37.356616   986  1072 I InputReader: Device added: id=-1, name='Virtual', sources=0x00000301
01-10 13:51:37.357139   986  1072 I InputReader: Device added: id=7, name='ACCDET', sources=0x80000101
01-10 13:51:37.358009   986  1072 I InputReader:   Touch device 'mtk-tpd' could not query the properties of its associated display.  The device will be inoperable until the display size becomes available.
01-10 13:51:37.358104   986  1072 I InputReader: Device added: id=6, name='mtk-tpd', sources=0x00001103
01-10 13:51:37.358183   986  1072 I InputReader: Device added: id=4, name='STM VL53L0 proximity sensor', sources=0x00004002
01-10 13:51:37.358475   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000080
01-10 13:51:37.358567   986  1072 I InputReader: Device reconfigured: id=6, name='mtk-tpd', size 720x1280, orientation 0, mode 1, display id 0
01-10 13:51:37.358694   986  1072 I InputReader: Device added: id=3, name='scan-keys', sources=0x00000101
01-10 13:51:37.358734   986  1072 I InputReader: Device added: id=2, name='tp-kpd', sources=0x00000101
01-10 13:51:37.358758   986  1072 I InputReader: Device added: id=1, name='mtk-kpd', sources=0x00000101
01-10 13:51:37.359605   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 13:51:37.364751   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.368614   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 13:51:37.371515   526   526 D MtkSettingsProviderExt: Global moveToSecure
01-10 13:51:37.374077   526   526 D MtkSettingsProviderExt: Secure moveToGlobal
01-10 13:51:37.375846   526   526 D MtkSettingsProviderExt: System moveToSecure
01-10 13:51:37.376156   526   526 D MtkSettingsProviderExt: System moveToGlobal
01-10 13:51:37.376903   526   526 D MtkSettingsProviderExt: putInPublicSettings
01-10 13:51:37.381386   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.398612   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 13:51:37.404812   535   535 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 13:51:37.404968   535   535 E installd: Failed to enable USRQUOTA on /dev/block/dm-2: File exists
01-10 13:51:37.404991   535   535 E installd: Failed to enable GRPQUOTA on /dev/block/dm-2: File exists
01-10 13:51:37.405837   535   535 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 13:51:37.405934   535   535 E installd: Failed to enable USRQUOTA on /dev/block/dm-2: File exists
01-10 13:51:37.405955   535   535 E installd: Failed to enable GRPQUOTA on /dev/block/dm-2: File exists
01-10 13:51:37.406680   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.407863   550  1061 W hw-IPCThreadState: All binder threads in pool (2 threads) busy for 136 ms
01-10 13:51:37.408143   551   867 W libutils.threads: Thread (this=0xed6b7200): don't call join() from this Thread object's thread. It's a guaranteed deadlock!
01-10 13:51:37.408642   550  1061 I Gyroscope: enable: handle:3, en:0
01-10 13:51:37.427279   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.441129   527   558 D AAL     : 01-10 01:51:37.252 BL= 341,ESS= 256, 01-10 01:51:37.309 BL= 340,ESS= 256, 01-10 01:51:37.346 BL= 339,ESS= 256, 01-10 01:51:37.403 BL= 338,ESS= 256, 01-10 01:51:37.441 BL= 337,ESS= 256, 
01-10 13:51:37.448494   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.451725   986   986 I zygote64: Looking for service android.hardware.oemlock@1.0::IOemLock/default
01-10 13:51:37.453380   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.oemlock@1.0::IOemLock/default in either framework or device manifest.
01-10 13:51:37.453775   986   986 E zygote64: service android.hardware.oemlock@1.0::IOemLock declares transport method EMPTY but framework expects hwbinder.
01-10 13:51:37.454628   986   986 I zygote64: Looking for service android.hardware.oemlock@1.0::IOemLock/default
01-10 13:51:37.455251   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.oemlock@1.0::IOemLock/default in either framework or device manifest.
01-10 13:51:37.455618   986   986 E zygote64: service android.hardware.oemlock@1.0::IOemLock declares transport method EMPTY but framework expects hwbinder.
01-10 13:51:37.470039   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.490407   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.490890   986  1074 I PackageManager: No secure containers found
01-10 13:51:37.507492   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.517784   550  1061 W hw-IPCThreadState: All binder threads in pool (2 threads) busy for 109 ms
01-10 13:51:37.532465   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.532802   526   526 I Zygote  : ...preloaded 4715 classes in 521ms.
01-10 13:51:37.532970   526   526 I zygote  : VMRuntime.preloadDexCaches starting
01-10 13:51:37.548736   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.574383   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.583256   986  1074 W StorageManagerService: No primary storage defined yet; hacking together a stub
01-10 13:51:37.584203   986  1074 W StorageManagerService: No primary storage defined yet; hacking together a stub
01-10 13:51:37.590361   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.616157   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.632246   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.649163   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:37.650077   526   526 I zygote  : VMRuntime.preloadDexCaches strings total=360436 before=13118 after=13118
01-10 13:51:37.650153   526   526 I zygote  : VMRuntime.preloadDexCaches types total=30514 before=6502 after=6516
01-10 13:51:37.650181   526   526 I zygote  : VMRuntime.preloadDexCaches fields total=142505 before=5834 after=5892
01-10 13:51:37.650212   526   526 I zygote  : VMRuntime.preloadDexCaches methods total=267782 before=12265 after=12328
01-10 13:51:37.650234   526   526 I zygote  : VMRuntime.preloadDexCaches finished
01-10 13:51:37.650520   986   986 D MtkFakeNtpTrustedTime: creating MtkFakeNtpTrustedTime using null
01-10 13:51:37.652963   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:37.658150   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.674186   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.675844   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:37.677234   986   986 D MtkFakeNtpTrustedTime: creating MtkFakeNtpTrustedTime using null
01-10 13:51:37.686595   527   558 D AAL     : 01-10 01:51:37.497 BL= 336,ESS= 256, 01-10 01:51:37.535 BL= 335,ESS= 256, 01-10 01:51:37.592 BL= 334,ESS= 256, 01-10 01:51:37.629 BL= 333,ESS= 256, 01-10 01:51:37.686 BL= 332,ESS= 256, 
01-10 13:51:37.699823   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.715938   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.721118   986   986 D WifiApConfigStore: 2G band allowed channels are:0
01-10 13:51:37.741850   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.750399   526   526 I Zygote  : Preloading resources...
01-10 13:51:37.758037   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.765326   526   526 W Resources: Preloaded drawable resource #0x1080264 (android:drawable/dialog_background_material) that varies with configuration!!
01-10 13:51:37.783664   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.792524   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:37.795279   526   526 I Zygote  : ...preloaded 64 resources in 44ms.
01-10 13:51:37.796506   986   986 D MtkIpRunningState: Initialize MtkIpRunningState
01-10 13:51:37.799494   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.799508   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:37.801513   986   986 D MtkIpStoppedState: Initialize MtkIpStoppedState
01-10 13:51:37.802089   986  1088 D MtkIpStoppedState: enter
01-10 13:51:37.804846   986   986 D WifiStateMachine: Initialize MtkL2ConnectedState
01-10 13:51:37.804867   986  1088 E IpManager.wlan0: ERROR Failed to disable IPv6: java.lang.IllegalStateException: command '1 interface ipv6 wlan0 disable' failed with '400 1 Failed to change IPv6 state (No such file or directory)'
01-10 13:51:37.806526   544   654 D CommandListener: Clearing all IP addresses on wlan0
01-10 13:51:37.807844   986  1087 E HalDeviceManager: isSupported: called but mServiceManager is null!?
01-10 13:51:37.807994   986  1087 I WifiNative-wlan0: Vendor HAL not supported, Ignore stop...
01-10 13:51:37.808063   986  1087 D WificondControl: tearing down interfaces in wificond
01-10 13:51:37.808026   526   526 W Resources: Preloaded color resource #0x1060053 (android:color/btn_default_material_dark) that varies with configuration!!
01-10 13:51:37.810040   526   526 I Zygote  : ...preloaded 41 resources in 13ms.
01-10 13:51:37.816396   986   986 D WifiController: isAirplaneModeOn = false, isWifiEnabled = false, isScanningAvailable = false
01-10 13:51:37.821824   986   986 I WifiService: getVerboseLoggingLevel uid=1000
01-10 13:51:37.822125   986   986 E SupplicantStaIfaceHal: Can't call setDebugParams, ISupplicant is null
01-10 13:51:37.822286   986   986 W WifiDiags: Failed to start packet fate monitoring
01-10 13:51:37.823130   986   986 I WifiService: Registering wifi
01-10 13:51:37.825812   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.826960   986   986 I WifiScanningService: Creating wifiscanner
01-10 13:51:37.829600   986   986 I WifiScanningService: Publishing wifiscanner
01-10 13:51:37.833926   986   986 I RttService: Creating rttmanager
01-10 13:51:37.834802   986   986 I RttService: Starting rttmanager
01-10 13:51:37.841171   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.849841   986   986 I WifiP2pService: Registering wifip2p
01-10 13:51:37.853456   986   986 I EthernetServiceImpl: Creating EthernetConfigStore
01-10 13:51:37.860714   986   986 E IpConfigStore: Error opening configuration file: java.io.FileNotFoundException: /data/misc/ethernet/ipconfig.txt (No such file or directory)
01-10 13:51:37.860972   986   986 W EthernetConfigStore: No Ethernet configuration found. Using default.
01-10 13:51:37.861121   986   986 I EthernetServiceImpl: Read stored IP configuration: IP assignment: DHCP
01-10 13:51:37.861121   986   986 I EthernetServiceImpl: Proxy settings: NONE
01-10 13:51:37.866757   986   986 I EthernetService: Registering service ethernet
01-10 13:51:37.867562   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.871632   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:37.883135   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.895722   401   421 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=23.99 dur=1000.36 max=48.21 min=30.86
01-10 13:51:37.904729   526   526 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 13:51:37.909406   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.912600   527   558 D AAL     : 01-10 01:51:37.723 BL= 331,ESS= 256, 01-10 01:51:37.780 BL= 332,ESS= 256, 01-10 01:51:37.818 BL= 333,ESS= 256, 01-10 01:51:37.874 BL= 334,ESS= 256, 01-10 01:51:37.912 BL= 335,ESS= 256, 
01-10 13:51:37.924985   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.941972   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:37.946024   986   986 D MtkIPv6TetheringCoordinator: MtkIPv6TetheringCoordinator
01-10 13:51:37.946246   986   986 D Tethering: MtkIPv6TetheringCoordinator is loaded
01-10 13:51:37.950716   986   986 D Tethering: getMtkTethering is loaded
01-10 13:51:37.951272   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.966723   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:37.992957   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:37.997892   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:26.513264,dur:1056.08,max:57.06,min:18.37
01-10 13:51:38.008739   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.034846   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.045765   526   526 D libEGL  : loaded /vendor/lib/egl/libGLES_mali.so
01-10 13:51:38.050601   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.071700   986   986 W TelecomManager: Telecom Service not found.
01-10 13:51:38.073615   528   528 D PermissionCache: checking android.permission.MODIFY_AUDIO_SETTINGS for uid=1000 => granted (1502 us)
01-10 13:51:38.073791   528   528 D APM_AudioPolicyManager: setForceUse() usage 4, config 0, mPhoneState 0
01-10 13:51:38.074048   528   707 D APM_AudioPolicyManager: setForceUse() usage 3, config 8, mPhoneState 0
01-10 13:51:38.074762   528   707 D APM_AudioPolicyManager: setForceUse() usage 6, config 0, mPhoneState 0
01-10 13:51:38.075366   528   934 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 13:51:38.075366   528   921 W AudioFlinger_Threads: no wake lock to update, system not ready yet
01-10 13:51:38.076925   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.077213   380   940 D AudioALSAStreamManager: setMicMute(), mMicMute: 0 => 0
01-10 13:51:38.081338   380   940 D AudioALSAStreamManager: +SetInputMute(), 0
01-10 13:51:38.082123   380   919 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 13:51:38.082548   380   919 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 13:51:38.092270   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.099709   986   986 D AudioService: applyDeviceVolumemStreamType:3,device:2
01-10 13:51:38.100067   986   986 D AudioService: applyDeviceVolumemStreamType:3,device:1073741824
01-10 13:51:38.100218   986   986 D AudioService: applyDeviceVolumemStreamType:9,device:2
01-10 13:51:38.100325   986   986 D AudioService: applyDeviceVolumemStreamType:9,device:1073741824
01-10 13:51:38.100424   986   986 D AudioService: applyDeviceVolumemStreamType:10,device:2
01-10 13:51:38.100527   986   986 D AudioService: applyDeviceVolumemStreamType:10,device:1073741824
01-10 13:51:38.118688   526   526 I Zygote  : Preloading shared libraries...
01-10 13:51:38.118805   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.134444   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.147323   986   986 I zygote64: Looking for service android.hidl.manager@1.0::IServiceManager/default
01-10 13:51:38.150414   986   986 I zygote64: Starting thread pool.
01-10 13:51:38.152259   526   526 I Zygote  : Uninstalled ICU cache reference pinning...
01-10 13:51:38.154261   526   526 I Zygote  : Installed AndroidKeyStoreProvider in 2ms.
01-10 13:51:38.154848   986   986 I zygote64: Looking for service android.hardware.usb@1.0::IUsb/default
01-10 13:51:38.155792   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.usb@1.0::IUsb/default in either framework or device manifest.
01-10 13:51:38.156060   986   986 E zygote64: service android.hardware.usb@1.0::IUsb declares transport method EMPTY but framework expects hwbinder.
01-10 13:51:38.157832   527   558 D AAL     : 01-10 01:51:37.969 BL= 336,ESS= 256, 01-10 01:51:38.006 BL= 337,ESS= 256, 01-10 01:51:38.063 BL= 338,ESS= 256, 01-10 01:51:38.100 BL= 339,ESS= 256, 01-10 01:51:38.157 BL= 340,ESS= 256, 
01-10 13:51:38.160671   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.168677   526   526 I Zygote  : Warmed up JCA providers in 15ms.
01-10 13:51:38.168816   526   526 D Zygote  : end preload
01-10 13:51:38.169755   986   986 D HardwarePropertiesManagerService-JNI: Link to death notification successful
01-10 13:51:38.176296   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.190731   775   914 I EMDLOGGER1: MDL rate:146 KB/s, full count:0
01-10 13:51:38.202504   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.218198   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.226441   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.contexthub@1.0::IContexthub/default in either framework or device manifest.
01-10 13:51:38.226934   986  1059 E ContextHubService: Could not load context hub hal
01-10 13:51:38.227309   986  1059 W ContextHubService: No Context Hub Module present
01-10 13:51:38.228121   986   986 D NtpTrustedTime: getServer:[time.android.com]
01-10 13:51:38.236829   551   922 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:38.233000   551   551 W HwBinder:551_2: type=1400 audit(0.0:42): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:38.244269   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.259871   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.275414   986   986 W BackgroundDexOptService: SysProp pm.dexopt.downgrade_after_inactive_days not set
01-10 13:51:38.286371   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.289913   986   986 V MediaRouter: Adding route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 13:51:38.293591   986   986 V MediaRouter: Selecting route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 13:51:38.301844   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.327733   986   986 I WindowManager: SAFE MODE not enabled
01-10 13:51:38.328102   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.343871   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.345940   986   986 D OmadmService: OmadmService() ... constructor
01-10 13:51:38.348346   986   986 I debug   : [getDefaultDmManager]The binder is null
01-10 13:51:38.348546   986   986 D @M_OmadmService: IOmadm.getService
01-10 13:51:38.349075   986   986 I zygote64: Looking for service vendor.mediatek.hardware.omadm@1.0::IOmadm/omadm
01-10 13:51:38.351712   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry vendor.mediatek.hardware.omadm@1.0::IOmadm/omadm in either framework or device manifest.
01-10 13:51:38.352282   986   986 E zygote64: service vendor.mediatek.hardware.omadm@1.0::IOmadm declares transport method EMPTY but framework expects hwbinder.
01-10 13:51:38.352754   986   986 D @M_OmadmService: mOmadmProxy getService/setResponseFunctions: java.util.NoSuchElementException
01-10 13:51:38.360969   986   986 I zygote64: Looking for service vendor.mediatek.hardware.power@1.1::IPower/default
01-10 13:51:38.363737   986   986 I zygote64: Starting thread pool.
01-10 13:51:38.370086   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.384099   527   558 D AAL     : 01-10 01:51:38.195 BL= 341,ESS= 256, 01-10 01:51:38.252 BL= 342,ESS= 256, 01-10 01:51:38.289 BL= 343,ESS= 256, 01-10 01:51:38.346 BL= 344,ESS= 256, 01-10 01:51:38.384 BL= 345,ESS= 256, 
01-10 13:51:38.385678   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.393324   986   986 I zygote64: Looking for service android.hardware.weaver@1.0::IWeaver/default
01-10 13:51:38.395875   351   351 W /system/bin/hwservicemanager: getTransport: Cannot find entry android.hardware.weaver@1.0::IWeaver/default in either framework or device manifest.
01-10 13:51:38.396427   986   986 E zygote64: service android.hardware.weaver@1.0::IWeaver declares transport method EMPTY but framework expects hwbinder.
01-10 13:51:38.412039   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.427750   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.434067   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:38.435720   986   986 D MtkIpConnectivityMetrics: MtkIpConnectivityMetrics is created:true
01-10 13:51:38.446794   986   986 D WifiAsyncChannel.WifiService: sendMessageSynchronously.send message=131207
01-10 13:51:38.449291   986  1087 D WifiStateMachine:  InitialState !CMD_INITIALIZE uid=1000 rt=16639/16639 0 0
01-10 13:51:38.449775   986  1087 D WifiStateMachine:  DefaultState !CMD_INITIALIZE uid=1000 rt=16640/16640 0 0
01-10 13:51:38.450110   986  1087 D HalDeviceManager: initIServiceManagerIfNecessary
01-10 13:51:38.450458   986  1087 I zygote64: Looking for service android.hidl.manager@1.0::IServiceManager/default
01-10 13:51:38.453706   986  1087 I zygote64: Starting thread pool.
01-10 13:51:38.453831   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.457815   986  1087 D HalDeviceManager: isSupportedInternal
01-10 13:51:38.458029   986  1070 D HalDeviceManager: IWifi registration notification: fqName=android.hardware.wifi@1.0::IWifi, name=default, preexisting=true
01-10 13:51:38.459925   986  1070 D HalDeviceManager: initIWifiIfNecessary
01-10 13:51:38.459934   986  1087 D HalDeviceManager: initIWifiIfNecessary
01-10 13:51:38.460920   986  1070 I zygote64: Looking for service android.hardware.wifi@1.0::IWifi/default
01-10 13:51:38.463376   986  1070 I zygote64: Starting thread pool.
01-10 13:51:38.468080   986  1070 D HalDeviceManager: stopWifi
01-10 13:51:38.469343   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.469559   986  1070 D HalDeviceManager: dispatchAllDestroyedListeners
01-10 13:51:38.471742   986   986 D WifiAsyncChannel.WifiService: sendMessageSynchronously.recv message=131207 sendingUid=1000
01-10 13:51:38.472778   986   986 D MtkOpExtManager: initialize: android.app.ContextImpl@4c1bb2e
01-10 13:51:38.473943   986   986 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:38.474067   986   986 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:38.474245   986   986 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:38.474245   986   986 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:Op01WifiService.apk:com.mediatek.op.wifi.Op01WifiOperatorFactory:com.mediatek.server.wifi.op01)
01-10 13:51:38.474245   986   986 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP09_null_null:Op09WifiService.apk:com.mediatek.op.wifi.Op09WifiOperatorFactory:com.mediatek.server.wifi.op09)
01-10 13:51:38.476974   986   986 D MtkOpExtManager: initialize done
01-10 13:51:38.477115   986   986 I WifiScanningService: Starting wifiscanner
01-10 13:51:38.477324   986  1086 D WifiController: Enter ApStaDisabledState mScreenOff=false
01-10 13:51:38.477913   986  1087 D WifiStateMachine:  InitialState !CMD_STOP_SUPPLICANT rt=16668/16668 0 0
01-10 13:51:38.478196   986  1087 D WifiStateMachine:  DefaultState !CMD_STOP_SUPPLICANT rt=16668/16668 0 0
01-10 13:51:38.480276   986   986 I RttService: Registering rttmanager
01-10 13:51:38.483392   986   986 I EthernetServiceImpl: Starting Ethernet service
01-10 13:51:38.486654   986   986 D Ethernet: Registering NetworkFactory
01-10 13:51:38.495633   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.496876   528   707 D PermissionCache: checking android.permission.CAPTURE_AUDIO_HOTWORD for uid=1000 => granted (317 us)
01-10 13:51:38.499147   986   986 D ContextHubSystemService: onBootPhase: PHASE_SYSTEM_SERVICES_READY
01-10 13:51:38.509276   986   986 I zygote64: Looking for service android.hardware.configstore@1.0::ISurfaceFlingerConfigs/default
01-10 13:51:38.511174   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.515111   986  1110 I WifiService: getWifiApEnabledState uid=1000
01-10 13:51:38.515246   986   986 I zygote64: Starting thread pool.
01-10 13:51:38.515334   986  1110 I WifiService: getWifiApEnabledState uid=1000
01-10 13:51:38.519269   986  1109 D Ethernet: got request NetworkRequest [ TRACK_DEFAULT id=3, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 13:51:38.519463   986  1109 D Ethernet: got request NetworkRequest [ REQUEST id=1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 13:51:38.533087   401   519 I SurfaceFlinger: EventThread Client Pid (986) created
01-10 13:51:38.534014   401   519 I SurfaceFlinger: EventThread Client Pid (986) created
01-10 13:51:38.537695   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.541953   986  1018 W DefaultPermGrantPolicy: Unknown package:com.google.android.apps.assistant
01-10 13:51:38.552809   986  1009 D WifiP2pService: getMessenger: uid=1000, binder=android.os.Binder@78dbc2e, messenger=android.os.Messenger@4353cf
01-10 13:51:38.553079   986  1009 D HalDeviceManager: createIface: ifaceType=2
01-10 13:51:38.553127   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.553172   986  1009 D HalDeviceManager: getAllChipInfo
01-10 13:51:38.554928   986  1009 D HalDeviceManager: getChipIds=[]
01-10 13:51:38.555065   986  1009 E HalDeviceManager: Should have at least 1 chip!
01-10 13:51:38.555123   986  1009 E HalDeviceManager: createIface: no chip info found
01-10 13:51:38.555142   986  1009 D HalDeviceManager: stopWifi
01-10 13:51:38.555787   986  1009 D HalDeviceManager: dispatchAllDestroyedListeners
01-10 13:51:38.555910   986  1087 D ManagerStatusListenerProxy: ListenerProxy.handleMessage: what=0
01-10 13:51:38.556102   986  1087 D HalDeviceManager: isWifiStart
01-10 13:51:38.556652   986  1087 I WifiVendorHal: Device Manager onStatusChanged. isReady(): true, isStarted(): false
01-10 13:51:38.560865   986  1093 D WifiHandler.WifiP2pService: Received message=139323d sendingUid=1000
01-10 13:51:38.561964   986  1093 D WifiAsyncChannel.WifiP2pService: replyToMessage recvdMessage=139323 sendingUid=1000 sentMessage=139324
01-10 13:51:38.579862   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.595394   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.621764   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.629292   527   558 D AAL     : 01-10 01:51:38.440 BL= 346,ESS= 256, 01-10 01:51:38.478 BL= 347,ESS= 256, 01-10 01:51:38.534 BL= 348,ESS= 256, 01-10 01:51:38.572 BL= 349,ESS= 256, 01-10 01:51:38.629 BL= 350,ESS= 256, 
01-10 13:51:38.637224   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.639719   986  1095 I MtkTethering: Intent:Intent { act=android.intent.action.LOCALE_CHANGED flg=0x51200010 }
01-10 13:51:38.642722   986   986 D BatteryService: mPlugType = 2, mIsTemperatureWarningState = false
01-10 13:51:38.648331   986  1095 D Tethering: sendTetherStateChangedBroadcast avail=[] local_only=[] tether=[] error=[]
01-10 13:51:38.648723   986  1095 I MtkTethering: Intent:Intent { act=android.net.conn.TETHER_STATE_CHANGED flg=0x24000010 (has extras) }
01-10 13:51:38.649598   986  1095 I MtkTethering: showTetheredNotification:false:0
01-10 13:51:38.649735   986  1095 I MtkTethering: Ignore
01-10 13:51:38.655438   986  1009 W AlarmManager: Unrecognized alarm listener com.mediatek.server.display.MtkWifiDisplayController$1@778cde
01-10 13:51:38.663547   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.679431   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.705726   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.718335   986   986 E PowerHalManagerImpl: <checkWetherSupport> sHasChecked: false
01-10 13:51:38.718756   986   986 I PowerHalManagerImpl: <checkWetherSupport> clazz: class com.mediatek.powerhalwrapper.PowerHalWrapper
01-10 13:51:38.719086   986   986 I PowerHalManagerImpl: <checkWetherSupport> methodSetRotationBoost: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setRotationBoost(int)
01-10 13:51:38.719201   986   986 I PowerHalManagerImpl: <checkWetherSupport> methodSetFpsGo: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setFpsGo(boolean)
01-10 13:51:38.719252   986   986 I PowerHalManagerImpl: <checkWetherSupport> methodSetInstallationBoost: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setInstallationBoost(boolean)
01-10 13:51:38.719308   986   986 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostResume: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostResume(java.lang.String,java.lang.String)
01-10 13:51:38.719355   986   986 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostNotify: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostNotify(int,java.lang.String,java.lang.String)
01-10 13:51:38.719432   986   986 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostProcessCreate: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostProcessCreate(java.lang.String,java.lang.String)
01-10 13:51:38.719491   986   986 I PowerHalManagerImpl: <checkWetherSupport> methodAmsBoostStop: public void com.mediatek.powerhalwrapper.PowerHalWrapper.amsBoostStop()
01-10 13:51:38.719567   986   986 I PowerHalManagerImpl: <checkWetherSupport> methodSetSpeedDownload: public void com.mediatek.powerhalwrapper.PowerHalWrapper.setSpeedDownload(int)
01-10 13:51:38.719604   986   986 D PowerHalManagerImpl: <checkWetherSupport> sIsMtkPowerHalExist: true
01-10 13:51:38.719772   986   986 E PowerHalWrapper: PowerHalWrapper
01-10 13:51:38.719906   986   986 I zygote64: Looking for service vendor.mediatek.hardware.power@1.1::IPower/default
01-10 13:51:38.721139   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.721644   986   986 I zygote64: Starting thread pool.
01-10 13:51:38.723271   986   986 E PowerHalWrapper: DeathRecipient
01-10 13:51:38.724693   986   986 E PowerHalWrapper: pextpeak_period: 0
01-10 13:51:38.747196   986   986 E BitmapFactory: Unable to decode stream: java.io.FileNotFoundException: /data/system/users/0/wallpaper_orig (No such file or directory)
01-10 13:51:38.747705   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.763355   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.787259   986  1103 D AudioSystem: +setParameters(): A2dpSuspended=false 
01-10 13:51:38.787987   380   919 D AudioALSAHardware: +setParameters(): A2dpSuspended=false
01-10 13:51:38.788290   380   919 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "A2dpSuspended=false"
01-10 13:51:38.788343   380   919 D AudioALSAHardware: -setParameters(): A2dpSuspended=false 
01-10 13:51:38.789392   986  1103 D AudioService: setBluetoothScoOnInt : false, eventSource = resetBluetoothSco
01-10 13:51:38.789529   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.789641   986  1103 D AudioSystem: +setParameters(): BT_SCO=off 
01-10 13:51:38.790179   380   919 D AudioALSAHardware: +setParameters(): BT_SCO=off
01-10 13:51:38.790386   380   919 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "BT_SCO=off"
01-10 13:51:38.790414   380   919 D AudioALSAHardware: -setParameters(): BT_SCO=off 
01-10 13:51:38.796349   986  1007 W TelecomManager: Telecom Service not found.
01-10 13:51:38.800796   528   707 I AudioFlinger: systemReady
01-10 13:51:38.804386   986  1007 W TelecomManager: Telecom Service not found.
01-10 13:51:38.804869   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.810398   561   590 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_AGPS_INIT
01-10 13:51:38.816998   986  1060 D WebViewLibraryLoader: Setting new address space to 125701040
01-10 13:51:38.819403   986  1145 V NuMediaExtractor: setDataSource fd=193 (/system/media/audio/ui/Effect_Tick.ogg), offset=0, length=5136
01-10 13:51:38.821112   532   736 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:38.821592   532   736 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:38.828644  1138  1138 W /system/bin/sdcard: Device explicitly enabled sdcardfs
01-10 13:51:38.829196   532   736 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:38.829494   532   736 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:38.831244   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.834510   986   986 W NetworkManagement: setDataSaverMode(): already false
01-10 13:51:38.838418   986  1004 I WifiService: requestActivityInfo uid=1000
01-10 13:51:38.838612   986  1004 I WifiService: reportActivityInfo uid=1000
01-10 13:51:38.838656   986  1004 I WifiService: getSupportedFeatures uid=1000
01-10 13:51:38.838685   986  1004 D WifiAsyncChannel.WifiService: sendMessageSynchronously.send message=131133
01-10 13:51:38.838901   986  1087 D WifiStateMachine:  InitialState !CMD_GET_SUPPORTED_FEATURES uid=1000 rt=17029/17029 0 0
01-10 13:51:38.838966   986  1087 D WifiStateMachine:  DefaultState !CMD_GET_SUPPORTED_FEATURES uid=1000 rt=17029/17029 0 0
01-10 13:51:38.838988   986  1087 D HalDeviceManager: isWifiStart
01-10 13:51:38.839718   986  1004 D WifiAsyncChannel.WifiService: sendMessageSynchronously.recv message=131133 sendingUid=1000
01-10 13:51:38.842253  1114  1114 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:38.845854   538   659 V APEExtractor: getAPEInfo not ape 20484
01-10 13:51:38.846123   538   659 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:38.846971   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.852226   986  1145 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 13:51:38.855447   527   558 D AAL     : 01-10 01:51:38.666 BL= 351,ESS= 256, 01-10 01:51:38.723 BL= 352,ESS= 256, 01-10 01:51:38.761 BL= 353,ESS= 256, 01-10 01:51:38.817 BL= 354,ESS= 256, 01-10 01:51:38.855 BL= 355,ESS= 256, 
01-10 13:51:38.857101  1126  1126 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:38.866543   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:38.867304   549   656 I OMXMaster: makeComponentInstance(OMX.google.aac.decoder) in omx@1.0-service process
01-10 13:51:38.873042   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.878948   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:38.879413   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.ADPCM.MS) in omx@1.0-service process
01-10 13:51:38.888737   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.892781   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:38.893203   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.ADPCM.DVI) in omx@1.0-service process
01-10 13:51:38.898657   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:38.899075   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.ALAC) in omx@1.0-service process
01-10 13:51:38.902006   401   420 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=23.85 dur=1006.31 max=43.81 min=40.08
01-10 13:51:38.902464   549  1161 D MtkOmxAlacDec: MtkOmxAlacDec::MtkOmxAlacDec this= 0xf3288000
01-10 13:51:38.902533   549  1161 D MtkOmxAlacDec: MtkOmxComponentCreate mCompHandle(0xf3288000)
01-10 13:51:38.902548   549  1161 D MtkOmxAlacDec: MtkOmxAlacDec::InitAudioParams(ALAC)
01-10 13:51:38.909148   549  1161 D MtkOmxAlacDec: +MtkOmxAlacDec::~MtkOmxAlacDec this= 0xf3288000
01-10 13:51:38.909232   549  1161 D MtkOmxAlacDec: -MtkOmxAlacDec::~MtkOmxAlacDec this= 0xf3288000
01-10 13:51:38.912317   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:38.912807   549  1161 I OMXMaster: makeComponentInstance(OMX.google.amrnb.decoder) in omx@1.0-service process
01-10 13:51:38.914546   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.924658   986  1084 W NetworkManagement: setDataSaverMode(): already false
01-10 13:51:38.930571   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.932143   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:38.932805   549  1161 I OMXMaster: makeComponentInstance(OMX.google.amrwb.decoder) in omx@1.0-service process
01-10 13:51:38.942266  1168  1168 V WebViewLibraryLoader: RelroFileCreator (64bit = false),  32-bit lib: /system/app/webview/webview.apk!/lib/armeabi-v7a/libwebviewchromium.so, 64-bit lib: /system/app/webview/webview.apk!/lib/arm64-v8a/libwebviewchromium.so
01-10 13:51:38.945167   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:38.945717   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.APE) in omx@1.0-service process
01-10 13:51:38.948442  1114  1114 I LatinIME: Hardware accelerated drawing: true
01-10 13:51:38.950272   986   986 D PermissionMonitor: Monitoring
01-10 13:51:38.953307   549  1161 D MtkOmxApeDec: APE component create
01-10 13:51:38.953624   549  1161 D MtkOmxApeDec: new BpMtkCodec
01-10 13:51:38.953640   549  1161 D BpMtkCodecService: BpMtkCodecService ctor
01-10 13:51:38.956466   549  1161 D BpMtkCodecService: BpMtkCodecService get getService Done
01-10 13:51:38.956538   549  1161 D BpMtkCodecService: mtk.codecservice success
01-10 13:51:38.956558   549  1161 D BpMtkCodecService: BpMtkCodecService::create
01-10 13:51:38.956721   396   396 E MtkCodecService: mtkcodecservice create
01-10 13:51:38.956828   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:38.957048   549  1161 D MtkOmxApeDec: create:0
01-10 13:51:38.957169   549  1161 D MtkOmxApeDec: InitAudioParams:out_size:5184
01-10 13:51:38.957287  1126  1126 V SystemUIService: Starting SystemUI services for user 0.
01-10 13:51:38.962340   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(12288) returning hidl_memory(0x7d3a82b5f0, 12288)
01-10 13:51:38.970002   986   986 D PermissionMonitor: Users: 2, Apps: 80
01-10 13:51:38.972152  1183  1183 V WebViewLibraryLoader: RelroFileCreator (64bit = true),  32-bit lib: /system/app/webview/webview.apk!/lib/armeabi-v7a/libwebviewchromium.so, 64-bit lib: /system/app/webview/webview.apk!/lib/arm64-v8a/libwebviewchromium.so
01-10 13:51:38.972641   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:38.978401   549  1161 D MtkOmxApeDec: [MtkOmxApeDec] Get HIDL input memory success.
01-10 13:51:38.981761   549  1161 D MtkOmxApeDec: ~dtor+ this= 0xf39cf400
01-10 13:51:38.981827   549  1161 D MtkOmxApeDec: close handle
01-10 13:51:38.981841   549  1161 D MtkOmxApeDec: call MtkCodec destroy+
01-10 13:51:38.981853   549  1161 D BpMtkCodecService: BpMtkCodecService::Destroy
01-10 13:51:38.982169   396   396 E MtkCodecService: mtkcodecservice Destory
01-10 13:51:38.983537   549  1161 D MtkOmxApeDec: call MtkCodec destroy-
01-10 13:51:38.983736   549  1161 D BpMtkCodecService: ~BpMtkCodecService
01-10 13:51:38.988953   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:38.989315   549  1161 I OMXMaster: makeComponentInstance(OMX.google.flac.decoder) in omx@1.0-service process
01-10 13:51:38.998565   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.009396  1126  1126 V MediaRouter: Adding route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 13:51:39.014268   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.017868  1126  1126 V MediaRouter: Selecting route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 13:51:39.027258   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.027578   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.G711.ALAW) in omx@1.0-service process
01-10 13:51:39.027755   986  1209 D AES     : AEEIOCTL_RT_MON_Kick IOCTL,cmd= 2147774474, lParam=300. 
01-10 13:51:39.029932   390   390 D lights  : set_led_state colorRGB=FF00FF00, onMS=0, offMS=0
01-10 13:51:39.030091   390   390 D lights  : blink_green, level=0, onMS=0, offMS=0
01-10 13:51:39.030480   390   390 D lights  : write_int open fd=7
01-10 13:51:39.030677   390   390 D lights  : blink_green, level=255, onMS=0, offMS=0
01-10 13:51:39.031227   390   390 D lights  : write_int open fd=7
01-10 13:51:39.040603   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.054019   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:24.620073,dur:1056.05,max:58.01,min:18.57
01-10 13:51:39.057755   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.059165   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.059860   549  1161 I OMXMaster: makeComponentInstance(OMX.google.g711.alaw.decoder) in omx@1.0-service process
01-10 13:51:39.077848  1168  1168 I zygote  : System.exit called, status: 0
01-10 13:51:39.078036  1168  1168 I AndroidRuntime: VM exiting with result code 0, cleanup skipped.
01-10 13:51:39.078914   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.079328   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.G711.MLAW) in omx@1.0-service process
01-10 13:51:39.082392   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.087729   986   986 D GnssLocationProvider: Link to death notification successful
01-10 13:51:39.088047   565   565 W MtkGnssHAL_GnssInterface: getExtensionXtra GnssXtra interface not implemented by HAL
01-10 13:51:39.088332   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.088811   549   652 I OMXMaster: makeComponentInstance(OMX.google.g711.mlaw.decoder) in omx@1.0-service process
01-10 13:51:39.091475   565   565 W MtkGnssHAL_GnssInterface: getExtensionGnssDebug: GnssDebug interface is not implemented by HAL
01-10 13:51:39.092375   565   565 W MtkGnssHAL_GnssInterface: getExtensionGnssConfiguration GnssConfiguration interface not implemented by GNSS HAL
01-10 13:51:39.093582   565   565 D vndksupport: Loading /vendor/lib64/hw/flp.mt6763.so from current namespace instead of sphal namespace.
01-10 13:51:39.095549   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.096090   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.GSM) in omx@1.0-service process
01-10 13:51:39.097734   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.100615   527   558 D AAL     : 01-10 01:51:38.911 BL= 356,ESS= 256, 01-10 01:51:38.949 BL= 357,ESS= 256, 01-10 01:51:39.006 BL= 358,ESS= 256, 01-10 01:51:39.044 BL= 359,ESS= 256, 01-10 01:51:39.100 BL= 360,ESS= 256, 
01-10 13:51:39.104275   565   565 D         : mtk_flp_get_flp_interface
01-10 13:51:39.112747   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.113185   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.MP3) in omx@1.0-service process
01-10 13:51:39.113589   986  1003 W zygote64: kill(-1168, 9) failed: No such process
01-10 13:51:39.113859   986  1003 I zygote64: Successfully killed process cgroup uid 1037 pid 1168 in 12ms
01-10 13:51:39.120804  1183  1183 I zygote64: System.exit called, status: 0
01-10 13:51:39.120910   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.120948  1183  1183 I AndroidRuntime: VM exiting with result code 0, cleanup skipped.
01-10 13:51:39.121395   549  1161 I OMXMaster: makeComponentInstance(OMX.google.mp3.decoder) in omx@1.0-service process
01-10 13:51:39.123218   986   986 I GnssLocationProvider: WakeLock acquired by sendMessage(INITIALIZE_HANDLER, 0, null)
01-10 13:51:39.124163   565   565 D hal2mnl : hal2mnl_set_server: hal2mnl_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 13:51:39.124205   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.124788   524   695 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 13:51:39.124946   524   695 D MNLD    : hal_set_server: hal_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 13:51:39.125245   986   986 D MtkLocationExt: MtkLocationExt GnssLocationProvider()
01-10 13:51:39.125885   561   591 D agps    : [agps][n][AGPS] [MNL] read  set_server  type=1 hostname=[supl.google.com] port=7275 aosp_profile_enable=0
01-10 13:51:39.126153   986   986 D MtkLocationExt: add GPS time sync handler and looper
01-10 13:51:39.127085   986   986 D GnssLocationProvider: mMtkGnssProvider = com.mediatek.location.MtkLocationExt$GnssLocationProvider@3d88653
01-10 13:51:39.127904   565   565 D         : gpshal_gpscbs_save: Use GpsCallbacks
01-10 13:51:39.128091   986   986 D GnssLocationProvider: gnssSetCapabilitesCb: 65536u
01-10 13:51:39.128442   986   986 D GnssLocationProvider: gnssSetSystemInfoCb: yearOfHw=2015
01-10 13:51:39.128618   565   565 D         : socket_bind_udp: fd=8
01-10 13:51:39.128670   565   565 D         : socket_bind_udp: path=mtk_mnl2hal
01-10 13:51:39.128903   565   565 D hal2mnl : hal2mnl_gps_init: hal2mnl_gps_init
01-10 13:51:39.129179   986   986 E GnssLocationProvider: Unable to initialize GNSS Xtra interface
01-10 13:51:39.129550   524   695 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 13:51:39.129634   524   695 W MNLD    : hal_gps_init: hal_gps_init
01-10 13:51:39.129650   524   695 D MNL2AGPS: mnl2agps_gps_init: mnl2agps_gps_init
01-10 13:51:39.129942   561   591 D agps    : [agps][n][AGPS] [MNL] read  gps_init
01-10 13:51:39.129994   561   591 D agps    : [agps][n][CDMA] cdma_mgr_sync_gps_setting(): 1
01-10 13:51:39.130006   561   591 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_SET_PRIVACY_MODE
01-10 13:51:39.130143   561   591 D agps    : [agps][n][CDMA] check_low_power_mode(): old=0, new=0
01-10 13:51:39.130184   561   591 D agps    : [agps] WARNING: [AGPS] agps2_mgr_aireplane_mode_from_c2k() flight_mode_state=[0] flight_mode_power_off_md=[1] is_cp_run=[0]
01-10 13:51:39.130208   561   591 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 13:51:39.131508   565   565 E GFC_INF : mtk_geo_set_project_config: mtk_flp_set_project_config - open fd fail! 2 (No such file or directory)
01-10 13:51:39.131647   565   565 D         : mtk_hal_geofence_init: init geofence, cb function : 60fb00c8
01-10 13:51:39.132042   565  1237 D GFC_INF : mnl2gfchal_jni_thread: mtk_gfc_hal_jni_thread, Create
01-10 13:51:39.132282   524   695 D MNLD    : mnld_main_thread: gfc2mnl_hdlr msg
01-10 13:51:39.132406   524   695 D         : mtk_gfc_controller_process: MNLD_FLP_TYPE_FLP_ATTACH
01-10 13:51:39.132434   524   695 D         : gfc2mnl_hdlr: [GFC2MNLD]data from gfc: type=0xc8, session_id=0, len=0,read_len = 12
01-10 13:51:39.132463   524   695 D         : mnl_gfc_dump_buf: [GFC2MNLD]data from gfc: data=200,  0,  0,  0,  0,  0,  0,  0,
01-10 13:51:39.132484   524   695 D         : mnl_gfc_dump_buf: [GFC2MNLD]data from gfc: data=  0,  0,  0,  0,
01-10 13:51:39.132497   524   695 D MNLD    : mnld_gfc_attach: mnld_gfc_attach
01-10 13:51:39.132510   524   695 D         : mnld_gfc_attach_done: mnld_gfc_attach_done
01-10 13:51:39.132525   524   695 D         : mnl2gfc_hdlr: MNL_STATUS_ATTACH_DONE
01-10 13:51:39.132552   524   695 D MNLD    : mnld_gfc_attach: Send attach done to GFC succeed
01-10 13:51:39.132567   524   695 D         : mnld_gfc_session_update: mnld_gfc_session_update,id=1,type=1
01-10 13:51:39.132584   524   695 D         : mnl2gfc_hdlr: SESSION_UPDATE 1 support 1 mode 2
01-10 13:51:39.132608   524   695 D         : mtk_gfc_set_sys_mode: mtk_gfc_set_sys_mode success = 1
01-10 13:51:39.132623   524   695 D         : mnl2gfc_hdlr: SESSION_UPDATE: set ap mode
01-10 13:51:39.133139   565   565 E VzwDebugInterface: init: Vzw debug init, to set callback
01-10 13:51:39.133464   565   565 D hal2mnl : hal2mnl_gps_cleanup: hal2mnl_gps_cleanup
01-10 13:51:39.134590  1114  1114 W InputAttributes: No editor info for this field. Bug?
01-10 13:51:39.135651  1126  1126 W SoundPool: Use of stream types is deprecated for operations other than volume control
01-10 13:51:39.135799  1126  1126 W SoundPool: See the documentation of SoundPool() for what to use instead with android.media.AudioAttributes to qualify your playback use case
01-10 13:51:39.136427   524   695 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 13:51:39.136498   524   695 W MNLD    : hal_gps_cleanup: hal_gps_cleanup
01-10 13:51:39.136516   524   695 D MNL2AGPS: mnl2agps_gps_cleanup: mnl2agps_gps_cleanup
01-10 13:51:39.137093   561   591 D agps    : [agps][n][AGPS] [MNL] read  gps_cleanup
01-10 13:51:39.137154   561   591 D agps    : [agps][n][CDMA] cdma_mgr_sync_gps_setting(): 0
01-10 13:51:39.137167   561   591 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_SET_PRIVACY_MODE
01-10 13:51:39.137279   561   591 D agps    : [agps][n][CDMA] check_low_power_mode(): old=0, new=0
01-10 13:51:39.137340   561   591 D agps    : [agps] WARNING: [AGPS] agps2_mgr_aireplane_mode_from_c2k() flight_mode_state=[0] flight_mode_power_off_md=[1] is_cp_run=[0]
01-10 13:51:39.137360   561   591 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[0]
01-10 13:51:39.137501   986   986 D LocationProviderProxy-network: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 13:51:39.137551   986  1003 W zygote64: kill(-1183, 9) failed: No such process
01-10 13:51:39.137626   986  1003 I zygote64: Successfully killed process cgroup uid 1037 pid 1183 in 0ms
01-10 13:51:39.138452   986   986 D LocationProviderProxy-network: bindBestPackage for com.android.location.service.v3.NetworkLocationProvider :  found 0, no new best component
01-10 13:51:39.139681   986   986 D LocationProviderProxy-fused: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 13:51:39.140319  1126  1235 V NuMediaExtractor: setDataSource fd=44 (/system/media/audio/ui/Lock.ogg), offset=0, length=8308
01-10 13:51:39.140795   986   986 D LocationProviderProxy-fused: bindBestPackage for com.android.location.service.FusedLocationProvider :  found 1, new best component: ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService}
01-10 13:51:39.141009   986   986 D LocationProviderProxy-fused: binding ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService} (v0) (u0)
01-10 13:51:39.141031   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.142418   532   736 D DrmMtkUtil: getProcessName() : path : [/proc/1126/cmdline]
01-10 13:51:39.143955   986   986 D GeocoderProxy: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 13:51:39.144264  1126  1126 D KeyguardDialogManager: DialogSequenceManager DialogSequenceManager()
01-10 13:51:39.145148   986   986 D GeocoderProxy: bindBestPackage for com.android.location.service.GeocodeProvider :  found 0, no new best component
01-10 13:51:39.147376   532   736 D DrmMtkUtil: getProcessName() : path : [/proc/1126/cmdline]
01-10 13:51:39.147849   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.148218   549  1161 I OMXMaster: makeComponentInstance(OMX.google.opus.decoder) in omx@1.0-service process
01-10 13:51:39.150763   538   659 V APEExtractor: getAPEInfo not ape 20483
01-10 13:51:39.150907   538   659 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:39.151583   986   986 D GeofenceProxy: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 13:51:39.154384   986   986 E ActivityRecognitionHardware: activity_recognition HAL is deprecated. is_supported is effectively a no-op
01-10 13:51:39.154393   546   582 I PPL/PPLAgent: checkCallerUidPermission(code:3,  uid:10021)
01-10 13:51:39.154626   546   582 E PPL/PPLAgent: checkCallerUidPermission Fail! (code:3,  uid:10021)
01-10 13:51:39.154820  1126  1126 I AntiTheftManager: PplCheckLocked, the lock flag is:false
01-10 13:51:39.154899  1126  1126 D AntiTheftManager: getInstance(...) is called.
01-10 13:51:39.154924  1126  1126 D AntiTheftManager: getInstance(...) create one.
01-10 13:51:39.154944   986   986 D ActivityRecognitionProxy: Overlay enabled, packages=[com.android.location.fused, com.baidu.map.location]
01-10 13:51:39.155243  1126  1235 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 13:51:39.155407  1126  1126 D AntiTheftManager: AntiTheftManager() is called.
01-10 13:51:39.155517   986   986 E ActivityRecognitionProxy: ServiceWatcher could not start.
01-10 13:51:39.155710  1126  1126 D AntiTheftManager: mDismissable is 0 before
01-10 13:51:39.155756  1126  1126 D AntiTheftManager: mDismissable is 0 after
01-10 13:51:39.155830  1126  1126 D AntiTheftManager: MTK_PRIVACY_PROTECTION_LOCK is enabled.
01-10 13:51:39.155857  1126  1126 D AntiTheftManager: mDismissable is 0 before
01-10 13:51:39.155873  1126  1126 D AntiTheftManager: mDismissable is 2 after
01-10 13:51:39.156292   986   986 D LocationManagerService: updateProvidersLocked provider:fused changesMade: true isEnabled:false shouldBeEnabled:true
01-10 13:51:39.156711   986   986 D LocationManagerService: updateProvidersLocked provider:network changesMade: true isEnabled:false shouldBeEnabled:false
01-10 13:51:39.156935   986   986 I GnssLocationProvider: WakeLock acquired by sendMessage(ENABLE, 1, null)
01-10 13:51:39.156979   986   986 D LocationManagerService: updateProvidersLocked provider:gps changesMade: true isEnabled:false shouldBeEnabled:true
01-10 13:51:39.157041   986   986 D LocationManagerService: updateProvidersLocked provider:passive changesMade: true isEnabled:true shouldBeEnabled:true
01-10 13:51:39.158145  1126  1126 D VoiceWakeupManagerProxy: getInstance(...) is called.
01-10 13:51:39.158228  1126  1126 D VoiceWakeupManagerProxy: getInstance(...) create one.
01-10 13:51:39.158266  1126  1126 D VoiceWakeupManagerProxy: constructor is called.
01-10 13:51:39.158760  1126  1126 E VoiceWakeupManagerProxy: createVoiceWakeupManagerInstance error
01-10 13:51:39.159404   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: java.lang.ClassNotFoundException: com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManager
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at java.lang.Class.classForName(Native Method)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at java.lang.Class.forName(Class.java:453)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at java.lang.Class.forName(Class.java:378)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManagerProxy.createVoiceWakeupManagerInstance(VoiceWakeupManagerProxy.java:40)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManagerProxy.getInstance(VoiceWakeupManagerProxy.java:33)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at com.android.systemui.keyguard.KeyguardViewMediator.setupLocked(KeyguardViewMediator.java:933)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at com.android.systemui.keyguard.KeyguardViewMediator.start(KeyguardViewMediator.java:948)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at com.android.systemui.SystemUIApplication.startServicesIfNeeded(SystemUIApplication.java:215)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at com.android.systemui.SystemUIApplication.startServicesIfNeeded(SystemUIApplication.java:164)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at com.android.systemui.SystemUIService.onCreate(SystemUIService.java:33)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread.handleCreateService(ActivityThread.java:3380)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread.-wrap4(Unknown Source:0)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1711)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: Caused by: java.lang.ClassNotFoundException: Didn't find class "com.mediatek.keyguard.VoiceWakeup.VoiceWakeupManager" on path: DexPathList[[zip file "/system/priv-app/MtkSystemUI/MtkSystemUI.apk"],nativeLibraryDirectories=[/system/priv-app/MtkSystemUI/lib/arm64, /system/lib64, /vendor/lib64, /system/lib64, /vendor/lib64]]
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:125)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 13:51:39.159551  1126  1126 E VoiceWakeupManagerProxy: 	... 19 more
01-10 13:51:39.159751   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.AUDIO.DECODER.RAW) in omx@1.0-service process
01-10 13:51:39.163189   986   986 D MtkLocationExt: MtkLocationExt LocationManagerService()
01-10 13:51:39.163332   986   986 D LocationManagerService: mMtkLocationManagerService = com.mediatek.location.MtkLocationExt$LocationManagerService@894f720
01-10 13:51:39.163511   986   986 D LocationManagerService: checkCtaSupport = true
01-10 13:51:39.163890  1126  1126 D RemoteLockManager: getInstance(...) is called.
01-10 13:51:39.163915  1126  1126 D RemoteLockManager: getInstance(...) create one.
01-10 13:51:39.164304  1126  1126 D RemoteLockManager: RemoteLockManager() is called.
01-10 13:51:39.166441   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.170020   986  1000 D LocationManagerService: request 872617f passive Request[POWER_NONE passive fastest=0] from android(1000 foreground [whitelisted])
01-10 13:51:39.170630   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.171158   986  1000 I GnssLocationProvider: WakeLock released by handleMessage(INITIALIZE_HANDLER, 0, null)
01-10 13:51:39.171273   549  1161 I OMXMaster: makeComponentInstance(OMX.google.raw.decoder) in omx@1.0-service process
01-10 13:51:39.171790   565   565 W MtkGnssHAL_GnssInterface: setCallback called more than once. Unexpected unless test.
01-10 13:51:39.172256   986  1000 D GnssLocationProvider: gnssSetCapabilitesCb: 65536u
01-10 13:51:39.172587   986  1000 D GnssLocationProvider: gnssSetSystemInfoCb: yearOfHw=2015
01-10 13:51:39.172745   565   565 D         : gpshal_gpscbs_save: Use GpsCallbacks
01-10 13:51:39.172782   565   565 D hal2mnl : hal2mnl_gps_init: hal2mnl_gps_init
01-10 13:51:39.173339   524   695 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 13:51:39.173504   524   695 W MNLD    : hal_gps_init: hal_gps_init
01-10 13:51:39.173522   524   695 D MNL2AGPS: mnl2agps_gps_init: mnl2agps_gps_init
01-10 13:51:39.173541   986  1000 E GnssLocationProvider: Unable to initialize GNSS Xtra interface
01-10 13:51:39.174122   561   591 D agps    : [agps][n][AGPS] [MNL] read  gps_init
01-10 13:51:39.174185   561   591 D agps    : [agps][n][CDMA] cdma_mgr_sync_gps_setting(): 1
01-10 13:51:39.174205   561   591 D agps    : [agps][n][RPC] GPS_RPC_REQUEST_SET_PRIVACY_MODE
01-10 13:51:39.174257   565   565 E GFC_INF : hal2_geofence_init: geofence init before
01-10 13:51:39.174324   565   565 D         : mtk_hal_geofence_init: init geofence, cb function : 60fb00c8
01-10 13:51:39.174338   561   591 D agps    : [agps][n][CDMA] check_low_power_mode(): old=0, new=0
01-10 13:51:39.174396   561   591 D agps    : [agps] WARNING: [AGPS] agps2_mgr_aireplane_mode_from_c2k() flight_mode_state=[0] flight_mode_power_off_md=[1] is_cp_run=[0]
01-10 13:51:39.174427   561   591 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 13:51:39.175408   565   565 E VzwDebugInterface: init: Vzw debug init, to set callback
01-10 13:51:39.176159   565   565 D hal2mnl : hal2mnl_set_server: hal2mnl_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 13:51:39.176699   524   695 D MNLD    : mnld_main_thread: hal2mnl_hdlr msg
01-10 13:51:39.176851   524   695 D MNLD    : hal_set_server: hal_set_server  type=1 hostname=[supl.google.com] port=7275
01-10 13:51:39.177272   986  1109 D Ethernet: got request NetworkRequest [ TRACK_DEFAULT id=6, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 13:51:39.177569   561   591 D agps    : [agps][n][AGPS] [MNL] read  set_server  type=1 hostname=[supl.google.com] port=7275 aosp_profile_enable=0
01-10 13:51:39.177646   565   565 D         : mtk_flp_init
01-10 13:51:39.177680   565   565 E         : mtk_flp_init: mtkFlpCallbacks.set_thread_event_cb
01-10 13:51:39.177691   565   565 E         : mtk_flp_init: mtkFlpCallbacks.flp_capabilities_cb
01-10 13:51:39.177703   565   565 D GnssHAL_GnssBatchingInterface: flpCapabilitiesCb capabilities 1
01-10 13:51:39.177800   986   986 I CommonTimeManagementService: No common time service detected on this platform.  Common time services will be unavailable.
01-10 13:51:39.178040   565   565 D         : init_timer_id: timer create ok
01-10 13:51:39.178690   565  1256 D         : mnl2flphal_jni_thread: mtk_flp_hal_jni_thread, Create
01-10 13:51:39.178737   986  1000 I GnssLocationProvider: WakeLock released by handleMessage(ENABLE, 1, null)
01-10 13:51:39.178954   524   695 D MNLD    : mnld_main_thread: flp2mnl_hdlr msg
01-10 13:51:39.179040   524   695 D flpint  : mtk_flp2mnl_process: MNLD_FLP_TYPE_FLP_ATTACH
01-10 13:51:39.179147   524   695 D flpmain : mnl_flp_dump_buf: [FLP2MNLD]data from flp: data=200,  0,  0,  0,  0,  0,  0,  0,
01-10 13:51:39.179207   524   695 D flpmain : mnl_flp_dump_buf: [FLP2MNLD]data from flp: data=  0,  0,  0,  0,
01-10 13:51:39.179236   524   695 D MNLD    : mnld_flp_attach: mnld_flp_attach
01-10 13:51:39.179283   524   695 D flpmain : mnld_flp_attach_done: mnld_flp_attach_done
01-10 13:51:39.179328   524   695 D flpint  : mnl2flp_hdlr: MNL_STATUS_ATTACH_DONE
01-10 13:51:39.179318  1114  1250 I LatinIME:LogUtils: Dictionary info: dictionary = UserHistoryDictionary.en_US ; version = 1578016041 ; date = 1578104338
01-10 13:51:39.179372   524   695 D MNLD    : mnld_flp_attach: Send attach done to FLP succeed
01-10 13:51:39.179406   524   695 D flpmain : mnld_flp_session_update: mnld_flp_session_update,id=1,type=1
01-10 13:51:39.179449   524   695 D flpint  : mnl2flp_hdlr: SESSION_UPDATE 1 support 1 mode 2
01-10 13:51:39.179491   524   695 D flpmain : mtk_flp_set_sys_mode: mtk_flp_set_sys_mode success = 1
01-10 13:51:39.179531   524   695 D flpint  : mnl2flp_hdlr: SESSION_UPDATE: set ap mode
01-10 13:51:39.180531  1114  1250 I LatinIME:LogUtils: Dictionary info: dictionary = userunigram.en_US ; version = 1578635499 ; date = ?
01-10 13:51:39.181782   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000020
01-10 13:51:39.183751   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.184185   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.184394   549  1161 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:39.197471   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.197955   549   652 I OMXMaster: makeComponentInstance(OMX.google.aac.encoder) in omx@1.0-service process
01-10 13:51:39.199395   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000010
01-10 13:51:39.208271   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.209615   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.210119   549   652 I OMXMaster: makeComponentInstance(OMX.google.amrnb.encoder) in omx@1.0-service process
01-10 13:51:39.212512   775   911 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 13:51:39.212708   775   911 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 13:51:39.212743   775   911 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 13:51:39.220097   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.220581   549   652 I OMXMaster: makeComponentInstance(OMX.google.amrwb.encoder) in omx@1.0-service process
01-10 13:51:39.223339  1114  1250 I LatinIME:LogUtils: Dictionary info: dictionary = main:en ; version = 54 ; date = 1414726273
01-10 13:51:39.223757   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.236214   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.236599   549   652 I OMXMaster: makeComponentInstance(OMX.google.flac.encoder) in omx@1.0-service process
01-10 13:51:39.237533   551   922 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:39.233000   551   551 W HwBinder:551_2: type=1400 audit(0.0:43): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:39.250086   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.250997   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.251558   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.AVC) in omx@1.0-service process
01-10 13:51:39.254353  1126  1126 I vol.Events: writeEvent collection_started
01-10 13:51:39.265967   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.270901  1126  1272 I vol.Events: writeEvent external_ringer_mode_changed normal
01-10 13:51:39.271308  1126  1272 I vol.Events: writeEvent internal_ringer_mode_changed normal
01-10 13:51:39.291708   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.299155   549   652 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 13:51:39.299908   549   652 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdec::MtkOmxVdec this= 0xF2CC0000
01-10 13:51:39.300094   549   652 D MtkOmxVdecEx: [0xf2cc0000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.300853   549   652 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxComponentCreate mCompHandle(0xF2CC0004)
01-10 13:51:39.300917   549   652 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.AVC)
01-10 13:51:39.301573   549   652 I         : isVTService(media.codec)
01-10 13:51:39.302564   549   652 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 13:51:39.303759   549  1275 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecThread created pVdec=0xF2CC0000, tid=1275
01-10 13:51:39.305618   549  1276 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecDecodeThread created pVdec=0xF2CC0000, tid=1276
01-10 13:51:39.307862   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.309644   549  1277 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecConvertThread created pVdec=0xF2CC0000, tid=1277
01-10 13:51:39.314086   986   986 E libdevice_genetic: VSCAN_LEFT_TRIGGER 
01-10 13:51:39.328604   986   986 E libdevice_genetic: VSCAN_RIGHT_TRIGGER 
01-10 13:51:39.333725   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.334415   549  1161 E OMXNodeInstance: getParameter(0xf2cc0004:MTK.DECODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.334676   540   709 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 13:51:39.335461   549  1161 E OMXNodeInstance: getParameter(0xf2cc0004:MTK.DECODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.335814   549  1161 E OMXNodeInstance: getExtensionIndex(0xf2cc0004:MTK.DECODER.AVC, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.336048   549  1161 E MtkOmxVdecEx: [0xf2cc0000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.336144   549  1161 E OMXNodeInstance: setParameter(0xf2cc0004:MTK.DECODER.AVC, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.337679   549  1161 D MtkOmxVdecEx: [0xf2cc0000] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.337980   549  1277 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecConvertThread terminated
01-10 13:51:39.337986   549  1276 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecDecodeThread terminated pVdec=0xF2CC0000
01-10 13:51:39.338245   549  1275 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecThread terminated
01-10 13:51:39.342427   986   986 E libdevice_genetic: VSCAN_PISTOL_TRIGGER 
01-10 13:51:39.345848   527   558 D AAL     : 01-10 01:51:39.138 BL= 361,ESS= 256, 01-10 01:51:39.194 BL= 362,ESS= 256, 01-10 01:51:39.232 BL= 363,ESS= 256, 01-10 01:51:39.288 BL= 364,ESS= 256, 01-10 01:51:39.345 BL= 365,ESS= 256, 
01-10 13:51:39.349182   549  1161 D MtkOmxVdecEx: [0xf2cc0000] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.349255   549  1161 D MtkOmxVdecEx: [0xf2cc0000] ~MtkOmxVdec this= 0xF2CC0000
01-10 13:51:39.349494   549  1278 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.349575   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.352983   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.353562   549  1161 I OMXMaster: makeComponentInstance(OMX.google.h264.decoder) in omx@1.0-service process
01-10 13:51:39.361161   986   986 E libdevice_battery: battery_min_temperature: temperature not in range
01-10 13:51:39.367742   549  1161 E OMXNodeInstance: getExtensionIndex(0xf3caac00:google.h264.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.367977   549  1161 E OMXNodeInstance: getExtensionIndex(0xf3caac00:google.h264.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.369529   534   846 I VT      : [VTS] gVTSClient == NULL
01-10 13:51:39.370200   986   986 E DL-KSParserFactory: Error while retrieving KSType file
01-10 13:51:39.370364   986   986 W System.err: java.io.FileNotFoundException: /enterprise/imported/type (Permission denied)
01-10 13:51:39.370568   986   986 W System.err: 	at java.io.FileInputStream.open0(Native Method)
01-10 13:51:39.370600   986   986 W System.err: 	at java.io.FileInputStream.open(FileInputStream.java:200)
01-10 13:51:39.370617   986   986 W System.err: 	at java.io.FileInputStream.<init>(FileInputStream.java:150)
01-10 13:51:39.370633   986   986 W System.err: 	at java.io.FileInputStream.<init>(FileInputStream.java:103)
01-10 13:51:39.370646   986   986 W System.err: 	at java.io.FileReader.<init>(FileReader.java:58)
01-10 13:51:39.370660   986   986 W System.err: 	at com.datalogic.server.KSParserFactory.getType(KSParserFactory.java:39)
01-10 13:51:39.370678   986   986 W System.err: 	at com.datalogic.server.KSParserFactory.createKSParser(KSParserFactory.java:19)
01-10 13:51:39.370695   986   986 W System.err: 	at com.datalogic.server.WifiConfDecryptManager.importExternalKeystore(WifiConfDecryptManager.java:262)
01-10 13:51:39.370710   986   986 W System.err: 	at com.datalogic.server.WifiConfDecryptManager.setupKeyStore(WifiConfDecryptManager.java:232)
01-10 13:51:39.370726   986   986 W System.err: 	at com.datalogic.server.WifiConfDecryptManager.init(WifiConfDecryptManager.java:151)
01-10 13:51:39.370747   986   986 W System.err: 	at com.datalogic.server.CryptoManager.systemReady(CryptoManager.java:46)
01-10 13:51:39.370762   986   986 W System.err: 	at com.android.server.SystemServer.lambda$-com_android_server_SystemServer_85408(SystemServer.java:2117)
01-10 13:51:39.370777   986   986 W System.err: 	at com.android.server.-$Lambda$T7cKu_OKm_Fk2kBNthmo_uUJTSo$1.$m$0(Unknown Source:146)
01-10 13:51:39.370792   986   986 W System.err: 	at com.android.server.-$Lambda$T7cKu_OKm_Fk2kBNthmo_uUJTSo$1.run(Unknown Source:0)
01-10 13:51:39.370809   986   986 W System.err: 	at com.android.server.am.ActivityManagerService.systemReady(ActivityManagerService.java:14428)
01-10 13:51:39.370824   986   986 W System.err: 	at com.android.server.SystemServer.startOtherServices(SystemServer.java:1875)
01-10 13:51:39.370837   986   986 W System.err: 	at com.android.server.SystemServer.run(SystemServer.java:434)
01-10 13:51:39.370850   986   986 W System.err: 	at com.android.server.SystemServer.main(SystemServer.java:299)
01-10 13:51:39.370865   986   986 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 13:51:39.370879   986   986 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 13:51:39.370892   986   986 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:837)
01-10 13:51:39.370982   986   986 E DL-KSParserFactory: Unknown keystore type
01-10 13:51:39.375520   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.376238   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.376760   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.DIVX) in omx@1.0-service process
01-10 13:51:39.377614   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.377775   549   652 D MtkOmxVdecEx: [0xf2cc1800] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.378298   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxComponentCreate mCompHandle(0xF2CC1804)
01-10 13:51:39.378343   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.DIVX)
01-10 13:51:39.369000   986   986 W system_server: type=1400 audit(0.0:44): avc: denied { search } for name="/" dev="mmcblk0p7" ino=2 scontext=u:r:system_server:s0 tcontext=u:object_r:enterprise_file:s0 tclass=dir permissive=0
01-10 13:51:39.379118   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 13:51:39.379612   549  1283 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread created pVdec=0xF2CC1800, tid=1283
01-10 13:51:39.379732   549  1284 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread created pVdec=0xF2CC1800, tid=1284
01-10 13:51:39.379811   549  1285 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread created pVdec=0xF2CC1800, tid=1285
01-10 13:51:39.384583   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.DIVX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.384795   540   709 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 13:51:39.385518   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.DIVX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.385820   549   652 E OMXNodeInstance: getExtensionIndex(0xf2cc1804:MTK.DECODER.DIVX, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.385987   549   652 E MtkOmxVdecEx: [0xf2cc1800] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.386078   549   652 E OMXNodeInstance: setParameter(0xf2cc1804:MTK.DECODER.DIVX, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.386319   549   652 D MtkOmxVdecEx: [0xf2cc1800] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.386528   549  1284 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread terminated pVdec=0xF2CC1800
01-10 13:51:39.386528   549  1285 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread terminated
01-10 13:51:39.386568   549  1283 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread terminated
01-10 13:51:39.391208   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.396717   549   652 D MtkOmxVdecEx: [0xf2cc1800] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.396790   549   652 D MtkOmxVdecEx: [0xf2cc1800] ~MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.396932   549  1286 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.398989   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.399300   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.DIVX3) in omx@1.0-service process
01-10 13:51:39.399984   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.400089   549   652 D MtkOmxVdecEx: [0xf2cc1800] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.400605   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxComponentCreate mCompHandle(0xF2CC1804)
01-10 13:51:39.400645   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.DIVX3)
01-10 13:51:39.401561   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 13:51:39.402140   549  1295 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread created pVdec=0xF2CC1800, tid=1295
01-10 13:51:39.405547   549  1293 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread created pVdec=0xF2CC1800, tid=1293
01-10 13:51:39.405684   549  1294 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread created pVdec=0xF2CC1800, tid=1294
01-10 13:51:39.407950   549  1161 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.DIVX3, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.408145   540   709 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 13:51:39.408667   549  1161 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.DIVX3, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.408932   549  1161 E OMXNodeInstance: getExtensionIndex(0xf2cc1804:MTK.DECODER.DIVX3, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.409086   549  1161 E MtkOmxVdecEx: [0xf2cc1800] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.409175   549  1161 E OMXNodeInstance: setParameter(0xf2cc1804:MTK.DECODER.DIVX3, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.409617   549   652 D MtkOmxVdecEx: [0xf2cc1800] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.409898   549  1294 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread terminated pVdec=0xF2CC1800
01-10 13:51:39.409906   549  1295 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread terminated
01-10 13:51:39.409948   549  1293 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread terminated
01-10 13:51:39.417207   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.420220   549   652 D MtkOmxVdecEx: [0xf2cc1800] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.420351   549   652 D MtkOmxVdecEx: [0xf2cc1800] ~MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.420597   549  1296 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.423465   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.424253   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.H263) in omx@1.0-service process
01-10 13:51:39.425027   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.425621   549   652 D MtkOmxVdecEx: [0xf2cc1800] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.426428   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxComponentCreate mCompHandle(0xF2CC1804)
01-10 13:51:39.426483   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.H263)
01-10 13:51:39.427469   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 13:51:39.427979   549  1315 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread created pVdec=0xF2CC1800, tid=1315
01-10 13:51:39.428094   549  1316 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread created pVdec=0xF2CC1800, tid=1316
01-10 13:51:39.428283   549  1318 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread created pVdec=0xF2CC1800, tid=1318
01-10 13:51:39.432578   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.436108   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.436319   540   709 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 13:51:39.437262   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.437784   549   652 E OMXNodeInstance: getExtensionIndex(0xf2cc1804:MTK.DECODER.H263, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.437971   549   652 E MtkOmxVdecEx: [0xf2cc1800] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.438095   549   652 E OMXNodeInstance: setParameter(0xf2cc1804:MTK.DECODER.H263, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.438380   549   652 D MtkOmxVdecEx: [0xf2cc1800] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.438639   549  1316 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread terminated pVdec=0xF2CC1800
01-10 13:51:39.438648   549  1318 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread terminated
01-10 13:51:39.438742   549  1315 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread terminated
01-10 13:51:39.448890   549   652 D MtkOmxVdecEx: [0xf2cc1800] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.448973   549   652 D MtkOmxVdecEx: [0xf2cc1800] ~MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.449140   549  1319 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.451585   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.452031   549   652 I OMXMaster: makeComponentInstance(OMX.google.h263.decoder) in omx@1.0-service process
01-10 13:51:39.459241   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.463115   549   652 E OMXNodeInstance: getExtensionIndex(0xf3caac00:google.h263.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.463435   549   652 E OMXNodeInstance: getExtensionIndex(0xf3caac00:google.h263.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.466605   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.467353   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.HEVC) in omx@1.0-service process
01-10 13:51:39.468306   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.468479   549   652 D MtkOmxVdecEx: [0xf2cc1800] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.469123   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxComponentCreate mCompHandle(0xF2CC1804)
01-10 13:51:39.469183   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.HEVC)
01-10 13:51:39.469844   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 13:51:39.470385   549  1326 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread created pVdec=0xF2CC1800, tid=1326
01-10 13:51:39.470644   549  1327 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread created pVdec=0xF2CC1800, tid=1327
01-10 13:51:39.470657   549  1328 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread created pVdec=0xF2CC1800, tid=1328
01-10 13:51:39.475023   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.482237   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.482537   540   709 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 13:51:39.483266   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.483641   549   652 E OMXNodeInstance: getExtensionIndex(0xf2cc1804:MTK.DECODER.HEVC, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.483830   549   652 E MtkOmxVdecEx: [0xf2cc1800] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.483920   549   652 E OMXNodeInstance: setParameter(0xf2cc1804:MTK.DECODER.HEVC, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.484239   549   652 D MtkOmxVdecEx: [0xf2cc1800] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.484509   549  1327 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread terminated pVdec=0xF2CC1800
01-10 13:51:39.484545   549  1326 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread terminated
01-10 13:51:39.484837   549  1328 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread terminated
01-10 13:51:39.494687   549   652 D MtkOmxVdecEx: [0xf2cc1800] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.494773   549   652 D MtkOmxVdecEx: [0xf2cc1800] ~MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.495053   549  1329 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.498665   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.499318   549   652 I OMXMaster: makeComponentInstance(OMX.google.hevc.decoder) in omx@1.0-service process
01-10 13:51:39.501038   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.508733  1197  1197 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base.so OK, libpq_cust.so absent
01-10 13:51:39.511662   549   652 E OMXNodeInstance: getExtensionIndex(0xf3caac00:google.hevc.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.511961   549   652 E OMXNodeInstance: getExtensionIndex(0xf3caac00:google.hevc.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.513976  1197  1197 D AndroidRuntime: >>>>>> START com.android.internal.os.WebViewZygoteInit uid 1053 <<<<<<
01-10 13:51:39.515289   397   414 I vendor.mediatek.hardware.power@1.1-impl: PowerHint hint:8, data:1
01-10 13:51:39.517081   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.517147   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.517905   397   413 I libPerfService: 8: legacy set freq: 1508000 -1 2002000 -1
01-10 13:51:39.517981   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.MPEG2) in omx@1.0-service process
01-10 13:51:39.518816   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.519002   549   652 D MtkOmxVdecEx: [0xf2cc1800] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.519499   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxComponentCreate mCompHandle(0xF2CC1804)
01-10 13:51:39.519566   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.MPEG2)
01-10 13:51:39.520221   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 13:51:39.520634   549  1333 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread created pVdec=0xF2CC1800, tid=1333
01-10 13:51:39.520786   549  1334 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread created pVdec=0xF2CC1800, tid=1334
01-10 13:51:39.520934  1197  1197 I /system/bin/webview_zygote32: option[0]=-Xzygote
01-10 13:51:39.521055  1197  1197 I /system/bin/webview_zygote32: option[1]=-Xusetombstonedtraces
01-10 13:51:39.521073  1197  1197 I /system/bin/webview_zygote32: option[2]=exit
01-10 13:51:39.521064   549  1335 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread created pVdec=0xF2CC1800, tid=1335
01-10 13:51:39.521093  1197  1197 I /system/bin/webview_zygote32: option[3]=vfprintf
01-10 13:51:39.521110  1197  1197 I /system/bin/webview_zygote32: option[4]=sensitiveThread
01-10 13:51:39.521127  1197  1197 I /system/bin/webview_zygote32: option[5]=-verbose:gc
01-10 13:51:39.521145  1197  1197 I /system/bin/webview_zygote32: option[6]=-Xms4m
01-10 13:51:39.521161  1197  1197 I /system/bin/webview_zygote32: option[7]=-Xmx256m
01-10 13:51:39.521185  1197  1197 I /system/bin/webview_zygote32: option[8]=-XX:HeapGrowthLimit=128m
01-10 13:51:39.521203  1197  1197 I /system/bin/webview_zygote32: option[9]=-Xusejit:true
01-10 13:51:39.521222  1197  1197 I /system/bin/webview_zygote32: option[10]=-Xjitsaveprofilinginfo
01-10 13:51:39.521242  1197  1197 I /system/bin/webview_zygote32: option[11]=-agentlib:jdwp=transport=dt_android_adb,suspend=n,server=y
01-10 13:51:39.521262  1197  1197 I /system/bin/webview_zygote32: option[12]=-Ximage-compiler-option
01-10 13:51:39.521278  1197  1197 I /system/bin/webview_zygote32: option[13]=--runtime-arg
01-10 13:51:39.521295  1197  1197 I /system/bin/webview_zygote32: option[14]=-Ximage-compiler-option
01-10 13:51:39.521332  1197  1197 I /system/bin/webview_zygote32: option[15]=-Xms64m
01-10 13:51:39.521351  1197  1197 I /system/bin/webview_zygote32: option[16]=-Ximage-compiler-option
01-10 13:51:39.521367  1197  1197 I /system/bin/webview_zygote32: option[17]=--runtime-arg
01-10 13:51:39.521384  1197  1197 I /system/bin/webview_zygote32: option[18]=-Ximage-compiler-option
01-10 13:51:39.521400  1197  1197 I /system/bin/webview_zygote32: option[19]=-Xmx64m
01-10 13:51:39.521486  1197  1197 I /system/bin/webview_zygote32: option[20]=-Ximage-compiler-option
01-10 13:51:39.521522  1197  1197 I /system/bin/webview_zygote32: option[21]=--image-classes=/system/etc/preloaded-classes
01-10 13:51:39.521540  1197  1197 I /system/bin/webview_zygote32: option[22]=-Ximage-compiler-option
01-10 13:51:39.521557  1197  1197 I /system/bin/webview_zygote32: option[23]=--compiled-classes=/system/etc/compiled-classes
01-10 13:51:39.521575  1197  1197 I /system/bin/webview_zygote32: option[24]=-Ximage-compiler-option
01-10 13:51:39.521596  1197  1197 I /system/bin/webview_zygote32: option[25]=--dirty-image-objects=/system/etc/dirty-image-objects
01-10 13:51:39.521614  1197  1197 I /system/bin/webview_zygote32: option[26]=-Xcompiler-option
01-10 13:51:39.521630  1197  1197 I /system/bin/webview_zygote32: option[27]=--runtime-arg
01-10 13:51:39.521649  1197  1197 I /system/bin/webview_zygote32: option[28]=-Xcompiler-option
01-10 13:51:39.521665  1197  1197 I /system/bin/webview_zygote32: option[29]=-Xms64m
01-10 13:51:39.521681  1197  1197 I /system/bin/webview_zygote32: option[30]=-Xcompiler-option
01-10 13:51:39.521697  1197  1197 I /system/bin/webview_zygote32: option[31]=--runtime-arg
01-10 13:51:39.521712  1197  1197 I /system/bin/webview_zygote32: option[32]=-Xcompiler-option
01-10 13:51:39.521730  1197  1197 I /system/bin/webview_zygote32: option[33]=-Xmx512m
01-10 13:51:39.521747  1197  1197 I /system/bin/webview_zygote32: option[34]=-Ximage-compiler-option
01-10 13:51:39.521764  1197  1197 I /system/bin/webview_zygote32: option[35]=--instruction-set-variant=cortex-a53
01-10 13:51:39.521780  1197  1197 I /system/bin/webview_zygote32: option[36]=-Xcompiler-option
01-10 13:51:39.521798  1197  1197 I /system/bin/webview_zygote32: option[37]=--instruction-set-variant=cortex-a53
01-10 13:51:39.521815  1197  1197 I /system/bin/webview_zygote32: option[38]=-Ximage-compiler-option
01-10 13:51:39.521832  1197  1197 I /system/bin/webview_zygote32: option[39]=--instruction-set-features=default
01-10 13:51:39.521848  1197  1197 I /system/bin/webview_zygote32: option[40]=-Xcompiler-option
01-10 13:51:39.521866  1197  1197 I /system/bin/webview_zygote32: option[41]=--instruction-set-features=default
01-10 13:51:39.521883  1197  1197 I /system/bin/webview_zygote32: option[42]=-Duser.locale=zh-Hans-CN
01-10 13:51:39.521899  1197  1197 I /system/bin/webview_zygote32: option[43]=--cpu-abilist=armeabi-v7a,armeabi
01-10 13:51:39.521919  1197  1197 I /system/bin/webview_zygote32: option[44]=-Xfingerprint:Datalogic/dl35cn/dl35:8.1.0/1.07.15.20191227/1577435794:user/release-keys
01-10 13:51:39.522098   549  1161 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.MPEG2, ParamVideoProfileLevelQuerySupported(0x600000f)) ERROR: BadParameter(0x80001005)
01-10 13:51:39.522709   549  1161 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.MPEG2, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.522863   540   709 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 13:51:39.523281   549  1161 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.MPEG2, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.524062   549  1161 E OMXNodeInstance: getExtensionIndex(0xf2cc1804:MTK.DECODER.MPEG2, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.524367   549  1161 E MtkOmxVdecEx: [0xf2cc1800] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.524506   549  1161 E OMXNodeInstance: setParameter(0xf2cc1804:MTK.DECODER.MPEG2, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.524872   549  1161 D MtkOmxVdecEx: [0xf2cc1800] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.525216   549  1334 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread terminated pVdec=0xF2CC1800
01-10 13:51:39.525276   549  1335 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread terminated
01-10 13:51:39.525552   549  1333 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread terminated
01-10 13:51:39.527587  1197  1197 W /system/bin/webview_zygote32: Could not reserve sentinel fault page
01-10 13:51:39.528074  1126  1272 I vol.Events: writeEvent level_changed STREAM_VOICE_CALL 4
01-10 13:51:39.531642  1126  1272 I vol.Events: writeEvent level_changed STREAM_SYSTEM 13
01-10 13:51:39.532535  1126  1272 I vol.Events: writeEvent level_changed STREAM_RING 13
01-10 13:51:39.533709  1126  1272 I vol.Events: writeEvent level_changed STREAM_MUSIC 12
01-10 13:51:39.535361   549  1161 D MtkOmxVdecEx: [0xf2cc1800] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.535433   549  1161 D MtkOmxVdecEx: [0xf2cc1800] ~MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.535579   549  1336 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.536609  1126  1272 I vol.Events: writeEvent level_changed STREAM_ALARM 8
01-10 13:51:39.537962   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.538468   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.MPEG4) in omx@1.0-service process
01-10 13:51:39.539168   549  1161 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.539319   549  1161 D MtkOmxVdecEx: [0xf2cc1800] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.539315  1126  1272 I vol.Events: writeEvent level_changed STREAM_BLUETOOTH_SCO 7
01-10 13:51:39.539766   549  1161 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxComponentCreate mCompHandle(0xF2CC1804)
01-10 13:51:39.539813   549  1161 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.MPEG4)
01-10 13:51:39.540362   549  1161 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 13:51:39.542779   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.546556   549  1345 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread created pVdec=0xF2CC1800, tid=1345
01-10 13:51:39.546700   549  1346 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread created pVdec=0xF2CC1800, tid=1346
01-10 13:51:39.546777   549  1347 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread created pVdec=0xF2CC1800, tid=1347
01-10 13:51:39.548578   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.548741   540   709 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 13:51:39.549260   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.549692   549   652 E OMXNodeInstance: getExtensionIndex(0xf2cc1804:MTK.DECODER.MPEG4, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.549867   549   652 E MtkOmxVdecEx: [0xf2cc1800] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.549954   549   652 E OMXNodeInstance: setParameter(0xf2cc1804:MTK.DECODER.MPEG4, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.550210   549   652 D MtkOmxVdecEx: [0xf2cc1800] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.550403   549  1346 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread terminated pVdec=0xF2CC1800
01-10 13:51:39.550408   549  1347 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread terminated
01-10 13:51:39.550455   549  1345 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread terminated
01-10 13:51:39.558250   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.560629   549   652 D MtkOmxVdecEx: [0xf2cc1800] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.560702   549   652 D MtkOmxVdecEx: [0xf2cc1800] ~MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.560862   549  1348 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.563758   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.564170   549  1161 I OMXMaster: makeComponentInstance(OMX.google.mpeg4.decoder) in omx@1.0-service process
01-10 13:51:39.566910   549  1161 E OMXNodeInstance: getExtensionIndex(0xf3caad20:google.mpeg4.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.567465   549  1161 E OMXNodeInstance: getExtensionIndex(0xf3caad20:google.mpeg4.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.570084   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.570507   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.VPX) in omx@1.0-service process
01-10 13:51:39.571416   549  1161 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdec::MtkOmxVdec this= 0xF2CC0000
01-10 13:51:39.571737   549  1161 D MtkOmxVdecEx: [0xf2cc0000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.572275   549  1161 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxComponentCreate mCompHandle(0xF2CC0004)
01-10 13:51:39.572320   549  1161 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.VPX)
01-10 13:51:39.574050   549  1362 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecDecodeThread created pVdec=0xF2CC0000, tid=1362
01-10 13:51:39.574348   549  1361 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecThread created pVdec=0xF2CC0000, tid=1361
01-10 13:51:39.575806   549  1161 E OMXNodeInstance: getParameter(0xf2cc0004:MTK.DECODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.576086   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.577765   549  1161 E OMXNodeInstance: getParameter(0xf2cc0004:MTK.DECODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.578021   549  1363 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecConvertThread created pVdec=0xF2CC0000, tid=1363
01-10 13:51:39.578297   549  1161 E OMXNodeInstance: getExtensionIndex(0xf2cc0004:MTK.DECODER.VPX, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.578517   549  1161 E MtkOmxVdecEx: [0xf2cc0000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.578597   549  1161 E OMXNodeInstance: setParameter(0xf2cc0004:MTK.DECODER.VPX, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.578852   549  1161 D MtkOmxVdecEx: [0xf2cc0000] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.579075   549  1363 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecConvertThread terminated
01-10 13:51:39.583861   397   414 I vendor.mediatek.hardware.power@1.1-impl: notifyAppState pack:com.android.settings, act:com.android.settings.FallbackHome, pid:1340, state:1
01-10 13:51:39.584601   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.584598   397   413 I libPerfService: [smart_table_init] open file fail
01-10 13:51:39.584700   397   413 I libPerfService: [smart_table_init] open file fail
01-10 13:51:39.589301   549  1161 D MtkOmxVdecEx: [0xf2cc0000] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.589388   549  1161 D MtkOmxVdecEx: [0xf2cc0000] ~MtkOmxVdec this= 0xF2CC0000
01-10 13:51:39.590052   549  1364 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.591501   395   395 D DynamicFpsPolicy: regInfo: 18d00000001
01-10 13:51:39.592082   397   413 I libPerfService: [perfNotifyAppState] foreground:com.android.settings, pid:1340
01-10 13:51:39.592808   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.593199   549  1161 I OMXMaster: makeComponentInstance(OMX.google.vp8.decoder) in omx@1.0-service process
01-10 13:51:39.594232   986  1000 D LocationProviderProxy-network: bindBestPackage for com.android.location.service.v3.NetworkLocationProvider :  found 0, no new best component
01-10 13:51:39.595234   986  1000 D LocationProviderProxy-fused: bindBestPackage for com.android.location.service.FusedLocationProvider :  found 1, new best component: ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService}
01-10 13:51:39.595759   986  1000 D GeocoderProxy: bindBestPackage for com.android.location.service.GeocodeProvider :  found 0, no new best component
01-10 13:51:39.600555   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.606823   549  1161 E OMXNodeInstance: getExtensionIndex(0xf3caad20:google.vp8.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.607117   549  1161 E OMXNodeInstance: getExtensionIndex(0xf3caad20:google.vp8.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.611132  1340  1340 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:39.611905   527   558 D AAL     : 01-10 01:51:39.402 BL= 366,ESS= 256, 01-10 01:51:39.440 BL= 367,ESS= 256, 01-10 01:51:39.496 BL= 368,ESS= 256, 01-10 01:51:39.572 BL= 369,ESS= 256, 01-10 01:51:39.611 BL= 370,ESS= 256, 
01-10 13:51:39.615905   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.616265   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.VP9) in omx@1.0-service process
01-10 13:51:39.616949   549  1161 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdec::MtkOmxVdec this= 0xF2CC0000
01-10 13:51:39.617063   549  1161 D MtkOmxVdecEx: [0xf2cc0000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.617507   549  1161 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxComponentCreate mCompHandle(0xF2CC0004)
01-10 13:51:39.617548   549  1161 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.VP9)
01-10 13:51:39.617967   401  1350 I SurfaceFlinger: EventThread Client Pid (1126) created
01-10 13:51:39.618482   549  1369 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecThread created pVdec=0xF2CC0000, tid=1369
01-10 13:51:39.618583   549  1370 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecDecodeThread created pVdec=0xF2CC0000, tid=1370
01-10 13:51:39.618645   549  1371 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecConvertThread created pVdec=0xF2CC0000, tid=1371
01-10 13:51:39.619002   401  1350 I SurfaceFlinger: EventThread Client Pid (1126) created
01-10 13:51:39.625673   549  1161 E OMXNodeInstance: getParameter(0xf2cc0004:MTK.DECODER.VP9, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.625903   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.626436   549  1161 E OMXNodeInstance: getParameter(0xf2cc0004:MTK.DECODER.VP9, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.626494   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.626835   549  1161 E OMXNodeInstance: getExtensionIndex(0xf2cc0004:MTK.DECODER.VP9, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.627038   549  1161 E MtkOmxVdecEx: [0xf2cc0000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.627146   549  1161 E OMXNodeInstance: setParameter(0xf2cc0004:MTK.DECODER.VP9, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.627437   549  1161 D MtkOmxVdecEx: [0xf2cc0000] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.627681   549  1370 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecDecodeThread terminated pVdec=0xF2CC0000
01-10 13:51:39.627756   549  1369 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecThread terminated
01-10 13:51:39.627757   549  1371 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecConvertThread terminated
01-10 13:51:39.627870  1304  1304 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:39.630391  1126  1126 I SurfaceFactory: [static] sSurfaceFactory = com.mediatek.view.impl.SurfaceFactoryImpl@5c3942b
01-10 13:51:39.632137  1288  1288 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:39.635057  1340  1340 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:39.637900   549  1161 D MtkOmxVdecEx: [0xf2cc0000] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.637992   549  1161 D MtkOmxVdecEx: [0xf2cc0000] ~MtkOmxVdec this= 0xF2CC0000
01-10 13:51:39.638153   549  1372 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.639047  1126  1126 D WindowClient: Add to mViews: com.android.systemui.stackdivider.DividerView{41a7e46 I.E...... ......I. 0,0-0,0}, this = android.view.WindowManagerGlobal@1e54807
01-10 13:51:39.640466  1126  1126 D OpenGLRenderer: Dumper init 4 threads <0x7475264540>
01-10 13:51:39.640974  1126  1126 D OpenGLRenderer: <com.android.systemui> is running.
01-10 13:51:39.640987   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.641391   549   652 I OMXMaster: makeComponentInstance(OMX.google.vp9.decoder) in omx@1.0-service process
01-10 13:51:39.641809   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.644040   401  1350 I SurfaceFlinger: EventThread Client Pid (1126) created
01-10 13:51:39.644872  1126  1376 D OpenGLRenderer: HWUI GL Pipeline
01-10 13:51:39.646932   549   652 E OMXNodeInstance: getExtensionIndex(0xf3caac00:google.vp9.decoder, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.647803   549   652 E OMXNodeInstance: getExtensionIndex(0xf3caac00:google.vp9.decoder, OMX.google.android.index.enableAndroidNativeBuffers) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.652128  1126  1126 D ViewRootImpl[DockedStackDivider]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 13:51:39.654346   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.654792   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.VC1) in omx@1.0-service process
01-10 13:51:39.655463   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.655661   549   652 D MtkOmxVdecEx: [0xf2cc1800] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.656240   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxComponentCreate mCompHandle(0xF2CC1804)
01-10 13:51:39.656308   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.VC1)
01-10 13:51:39.657077   549   652 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 13:51:39.657589   549  1380 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread created pVdec=0xF2CC1800, tid=1380
01-10 13:51:39.657680   549  1381 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread created pVdec=0xF2CC1800, tid=1381
01-10 13:51:39.657743   549  1382 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread created pVdec=0xF2CC1800, tid=1382
01-10 13:51:39.659037   401  1350 I SurfaceFlinger: [SF client] NEW(0x7300829300) for (986:system_server)
01-10 13:51:39.661021   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.VC1, ParamVideoProfileLevelQuerySupported(0x600000f)) ERROR: BadParameter(0x80001005)
01-10 13:51:39.663036   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.VC1, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.663165   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.663545   549   652 E OMXNodeInstance: getParameter(0xf2cc1804:MTK.DECODER.VC1, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.663762   549   652 E OMXNodeInstance: getExtensionIndex(0xf2cc1804:MTK.DECODER.VC1, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.663891   549   652 E MtkOmxVdecEx: [0xf2cc1800] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.663980   549   652 E OMXNodeInstance: setParameter(0xf2cc1804:MTK.DECODER.VC1, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.664199   549   652 D MtkOmxVdecEx: [0xf2cc1800] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.664408   549  1381 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecDecodeThread terminated pVdec=0xF2CC1800
01-10 13:51:39.664409   549  1382 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecConvertThread terminated
01-10 13:51:39.664441   549  1380 D MtkOmxVdecEx: [0xf2cc1800] MtkOmxVdecThread terminated
01-10 13:51:39.668394   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.674880   549   652 D MtkOmxVdecEx: [0xf2cc1800] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.674968   549   652 D MtkOmxVdecEx: [0xf2cc1800] ~MtkOmxVdec this= 0xF2CC1800
01-10 13:51:39.675217   549  1383 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.677781   986   986 D RttService: SCAN_AVAILABLE : 1
01-10 13:51:39.677770   986   996 I WifiService: getVerboseLoggingLevel uid=10021
01-10 13:51:39.677982   986  1091 I WifiScanningService: wifi driver unloaded
01-10 13:51:39.678053   986  1092 D RttService: DefaultState got{ when=0 what=160513 target=com.android.internal.util.StateMachine$SmHandler }
01-10 13:51:39.679310   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.679744   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.DECODER.XVID) in omx@1.0-service process
01-10 13:51:39.680344   549  1161 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdec::MtkOmxVdec this= 0xF2CC0000
01-10 13:51:39.680475   549  1161 D MtkOmxVdecEx: [0xf2cc0000] OmxVdecLogEnable = 0, bOmxVdecPerfLogEnable = 0
01-10 13:51:39.680851   549  1161 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxComponentCreate mCompHandle(0xF2CC0004)
01-10 13:51:39.680893   549  1161 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdec::ComponentInit (OMX.MTK.VIDEO.DECODER.XVID)
01-10 13:51:39.681517   549  1161 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdec::SetConfig -> disable priority adjustment
01-10 13:51:39.681702  1288  1288 D ImsConfigProvider: [onCreate] User locked, register receiver for BOOT_COMPLETED
01-10 13:51:39.684694   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.689602   549  1386 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecThread created pVdec=0xF2CC0000, tid=1386
01-10 13:51:39.689857   549  1387 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecDecodeThread created pVdec=0xF2CC0000, tid=1387
01-10 13:51:39.690053   549  1388 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecConvertThread created pVdec=0xF2CC0000, tid=1388
01-10 13:51:39.690265   549   652 E OMXNodeInstance: getParameter(0xf2cc0004:MTK.DECODER.XVID, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.690494   540   709 W OMXUtils: do not know color format 0x7f000001 = 2130706433
01-10 13:51:39.691282   549   652 E OMXNodeInstance: getParameter(0xf2cc0004:MTK.DECODER.XVID, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.691774   549   652 E OMXNodeInstance: getExtensionIndex(0xf2cc0004:MTK.DECODER.XVID, OMX.google.android.index.configureVideoTunnelMode) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.691973   549   652 E MtkOmxVdecEx: [0xf2cc0000] @@ OMX_GoogleAndroidIndexEnableAndroidNativeHandle: invalid port index
01-10 13:51:39.692108   549   652 E OMXNodeInstance: setParameter(0xf2cc0004:MTK.DECODER.XVID, OMX.google.android.index.allocateNativeHandle(0x7f20040e): Output:1 en=0) ERROR: BadParameter(0x80001005)
01-10 13:51:39.692492   549   652 D MtkOmxVdecEx: [0xf2cc0000] +MtkOmxVdec::ComponentDeInit
01-10 13:51:39.692811   549  1388 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecConvertThread terminated
01-10 13:51:39.692839   549  1386 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecThread terminated
01-10 13:51:39.692811   549  1387 D MtkOmxVdecEx: [0xf2cc0000] MtkOmxVdecDecodeThread terminated pVdec=0xF2CC0000
01-10 13:51:39.698213   986   996 I WifiService: getWifiServiceMessenger uid=10021
01-10 13:51:39.703003   549   652 D MtkOmxVdecEx: [0xf2cc0000] -MtkOmxVdec::ComponentDeInit
01-10 13:51:39.703081   549   652 D MtkOmxVdecEx: [0xf2cc0000] ~MtkOmxVdec this= 0xF2CC0000
01-10 13:51:39.703239   549  1389 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.707991   540  1245 E DrmMtkUtil/DrmUtil: checkDcf: not dcf type, dcf version value [79]
01-10 13:51:39.708126   540  1245 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 13:51:39.708165   540  1245 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:
01-10 13:51:39.708052   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.708267   540  1245 D NuPlayerDriver: NuPlayerDriver(0xed8af540) created, clientPid(986)
01-10 13:51:39.708722   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.AVC) in omx@1.0-service process
01-10 13:51:39.710113   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.710633  1126  1126 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:39.710764  1126  1126 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:39.711607  1126  1126 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:39.711607  1126  1126 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP03_null_SEGDEFAULT:OP03SystemUI.apk:com.mediatek.op03.systemui.Op03SystemUICustomizationFactory:com.mediatek.op03.systemui)
01-10 13:51:39.711607  1126  1126 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07SystemUI.apk:com.mediatek.op07.systemui.OP07SystemUICustomizationFactory:com.mediatek.op07.systemui)
01-10 13:51:39.711607  1126  1126 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP18_null_SEGDEFAULT:OP18SystemUI.apk:com.mediatek.op18.systemui.Op18SystemUICustomizationFactory:com.mediatek.op18.systemui)
01-10 13:51:39.711607  1126  1126 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP01_null_null:OP01SystemUI.apk:com.mediatek.systemui.op01.Op01SystemUICustomizationFactory:com.mediatek.systemui.op01)
01-10 13:51:39.711607  1126  1126 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP02_null_null:OP02SystemUI.apk:com.mediatek.systemui.op02.Op02SystemUICustomizationFactory:com.mediatek.systemui.op02)
01-10 13:51:39.711607  1126  1126 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09SystemUI.apk:com.mediatek.systemui.op09.Op09SystemUICustomizationFactory:com.mediatek.systemui.op09)
01-10 13:51:39.711607  1126  1126 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP09_null_SEGC:OP09ClipSystemUI.apk:com.mediatek.systemui.op09clip.Op09SystemUICustomizationFactory:com.mediatek.systemui.op09clip)
01-10 13:51:39.711607  1126  1126 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP08_null_null:OP08SystemUI.apk:com.mediatek.op08.systemui.Op08SystemUICustomizationFactory:com.mediatek.op08.systemui)
01-10 13:51:39.711607  1126  1126 E OperatorCustomizationFactoryLoader: 8: OperatorFactoryInfo(OP20_null_null:OP20SystemUI.apk:com.mediatek.op20.systemui.Op20SystemUICustomizationFactory:com.mediatek.op20.systemui)
01-10 13:51:39.711892  1304  1304 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:39.713947   549   652 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::MtkOmxVenc this= 0xF3841000
01-10 13:51:39.714390   549   652 D MtkOmxVenc: [0xf3841000] dump flag=0x0
01-10 13:51:39.714508   549   652 D MtkOmxVenc: [0xf3841000] MtkOmxComponentCreate mCompHandle(0xF3841004)
01-10 13:51:39.714527   549   652 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.AVC)
01-10 13:51:39.714564   549   652 E MtkOmxVenc: [0xf3841000] bufk = 0
01-10 13:51:39.714592   549   652 D MtkOmxVenc: [0xf3841000] uDefaultAVCProfileType 2
01-10 13:51:39.714605   549   652 D MtkOmxVenc: [0xf3841000] uDefaultAVCLevelType 4
01-10 13:51:39.714617   549   652 D MtkOmxVenc: [0xf3841000] uDefaultAVCProfileType 2
01-10 13:51:39.715376   549   652 D MtkOmxVenc: [0xf3841000] uDefaultAVCProfileType 2
01-10 13:51:39.715457   549   652 D MtkOmxVenc: [0xf3841000] uDefaultAVCLevelType 4
01-10 13:51:39.715472   549   652 D MtkOmxVenc: [0xf3841000] uDefaultAVCProfileType 2
01-10 13:51:39.715599   549   652 D MtkOmxVenc: [0xf3841000] InitSecEncParams svp support: 0, type: 0
01-10 13:51:39.715631   549   652 D MtkOmxVenc: [0xf3841000] ComponentInit init sec 2 mIsSecureInst 0
01-10 13:51:39.716763   549  1396 D MtkOmxVenc: [0xf3841000] MtkOmxVencEncodeThread created pVenc=0xF3841000, tid=1396
01-10 13:51:39.716881   549  1397 D MtkOmxVenc: [0xf3841000] MtkOmxVencConvertThread created pVenc=0xF3841000, tid=1397
01-10 13:51:39.717512   549  1395 D MtkOmxVenc: [0xf3841000] MtkOmxVencThread created pVenc=0xF3841000
01-10 13:51:39.720851  1126  1273 D NetworkController: subscriptions is null
01-10 13:51:39.725264   540  1400 D GenericSource: FileSource remote
01-10 13:51:39.725523   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.731656   538   659 V APEExtractor: getAPEInfo not ape 20482
01-10 13:51:39.731894   538   659 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:39.735638   540  1394 D NuPlayerDriver: notifyListener_l(0xed8af540), (1, 0, 0, -1), loop setting(0, 0)
01-10 13:51:39.736168   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 13:51:39.736232   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 13:51:39.736257   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 13:51:39.736281   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 13:51:39.736302   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 13:51:39.736328   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 13:51:39.736356   549   652 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.736590   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.737218   549   652 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.737594   540   709 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 13:51:39.738849   549   652 D MtkOmxVenc: [0xf3841000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 13:51:39.740235   549  1161 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.740493   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.740878   986   986 D Ringtone: Successfully created local player
01-10 13:51:39.741006   986   986 W Ringtone: Use of stream types is deprecated for operations other than volume control
01-10 13:51:39.741039   986   986 W Ringtone: See the documentation of setStreamType() for what to use instead with android.media.AudioAttributes to qualify your playback use case
01-10 13:51:39.741018   549   652 D MtkOmxVenc: [0xf3841000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 13:51:39.741669   540  1245 D NuPlayerDriver: reset(0xed8af540) at state 4
01-10 13:51:39.741878   540  1245 D NuPlayerDriver: notifyListener_l(0xed8af540), (8, 0, 0, -1), loop setting(0, 0)
01-10 13:51:39.741991   540  1245 D GenericSource: disconnect: mDataSource 0xed8f7140 mHttpSource 0x0
01-10 13:51:39.742679   540  1394 D NuPlayerDriver: notifyResetComplete(0xed8af540)
01-10 13:51:39.742987   549  1161 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.743234   540   709 W OMXUtils: do not know color format 0x6 = 6
01-10 13:51:39.743569   540  1245 D NuPlayerDriver: reset(0xed8af540) at state 0
01-10 13:51:39.743958   549  1161 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.744149   540   709 W OMXUtils: do not know color format 0xb = 11
01-10 13:51:39.744630   986   986 V MediaPlayer: resetDrmState:  mDrmInfo=null mDrmProvisioningThread=null mPrepareDrmInProgress=false mActiveDrmScheme=false
01-10 13:51:39.744724   986   986 V MediaPlayer: cleanDrmObj: mDrmObj=null mDrmSessionId=null
01-10 13:51:39.745362   986   986 V MediaPlayer: resetDrmState:  mDrmInfo=null mDrmProvisioningThread=null mPrepareDrmInProgress=false mActiveDrmScheme=false
01-10 13:51:39.745467   986   986 V MediaPlayer: cleanDrmObj: mDrmObj=null mDrmSessionId=null
01-10 13:51:39.745484  1340  1340 I SurfaceFactory: [static] sSurfaceFactory = com.mediatek.view.impl.SurfaceFactoryImpl@a32caed
01-10 13:51:39.746382   549  1161 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.746580   540   709 W OMXUtils: do not know color format 0x10 = 16
01-10 13:51:39.747058   549  1161 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.747178   540   709 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 13:51:39.747600   549  1161 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.747731   540   709 W OMXUtils: do not know color format 0xf = 15
01-10 13:51:39.747909   549  1161 D MtkOmxVenc: [0xf3841000] uGetIsNoTHWSolution0
01-10 13:51:39.748369   549  1161 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.AVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.748831   540  1245 E DrmMtkUtil/DrmUtil: checkDcf: not dcf type, dcf version value [79]
01-10 13:51:39.748933   540  1245 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 13:51:39.748979   540  1245 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:
01-10 13:51:39.749054   540  1245 D NuPlayerDriver: NuPlayerDriver(0xed8af5b0) created, clientPid(986)
01-10 13:51:39.749037  1288  1288 I zygote64: Looking for service vendor.mediatek.hardware.radio@2.0::IRadio/imsrild1
01-10 13:51:39.749845   401  1350 I SurfaceFlinger: EventThread Client Pid (1340) created
01-10 13:51:39.750328   549  1161 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 13:51:39.750503   549  1161 D MtkOmxVenc: [0xf3841000] +MtkOmxVenc::ComponentDeInit
01-10 13:51:39.750595   549  1396 D MtkOmxVenc: [0xf3841000] MtkOmxVencEncodeThread terminated pVenc=0xF3841000
01-10 13:51:39.750758   549  1397 D MtkOmxVenc: [0xf3841000] MtkOmxVencConvertThread terminated pVenc=0xF3841000
01-10 13:51:39.750874   549  1395 D MtkOmxVenc: [0xf3841000] MtkOmxVencThread terminated
01-10 13:51:39.750877   401  1350 I SurfaceFlinger: EventThread Client Pid (1340) created
01-10 13:51:39.751134   549  1161 D MtkOmxVenc: [0xf3841000] -MtkOmxVenc::ComponentDeInit
01-10 13:51:39.751179   549  1161 D MtkOmxVenc: [0xf3841000] ~MtkOmxVenc this= 0xF3841000
01-10 13:51:39.751999   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.751307   549  1161 D PQ      : [PQ][PQSessionManager] PQSessionManager()... 
01-10 13:51:39.752106   549  1161 D PQ      : [PQ][PQSessionManager] m_PQSupport = 2 
01-10 13:51:39.752295   549  1398 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.754546   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.754950   549  1161 I OMXMaster: makeComponentInstance(OMX.google.h264.encoder) in omx@1.0-service process
01-10 13:51:39.754972  1340  1340 D WindowClient: Add to mViews: DecorView@facad70[FallbackHome], this = android.view.WindowManagerGlobal@dfe28e9
01-10 13:51:39.755945  1340  1340 D OpenGLRenderer: Dumper init 4 threads <0x7483b00680>
01-10 13:51:39.756440  1340  1340 D OpenGLRenderer: <com.android.settings> is running.
01-10 13:51:39.757669  1288  1288 I zygote64: Starting thread pool.
01-10 13:51:39.760528   401  1350 I SurfaceFlinger: EventThread Client Pid (1340) created
01-10 13:51:39.762012   540  1408 D GenericSource: FileSource remote
01-10 13:51:39.762088  1340  1407 D OpenGLRenderer: HWUI GL Pipeline
01-10 13:51:39.762414  1126  1126 D WindowClient: Add to mViews: com.android.systemui.assist.AssistOrbContainer{9331b64 G.E...... ......I. 0,0-0,0}, this = android.view.WindowManagerGlobal@1e54807
01-10 13:51:39.763139  1304  1304 D TelephonyProvider: Version: [1376520]
01-10 13:51:39.765575   540   709 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 13:51:39.766240   538  1402 V APEExtractor: getAPEInfo not ape 20482
01-10 13:51:39.766333   538  1402 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:39.766466  1340  1340 D ViewRootImpl[FallbackHome]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 13:51:39.767988  1304  1304 D TelephonyProvider: DatabaseHelper: guestUser=false
01-10 13:51:39.768113   401  1350 I SurfaceFlinger: [SF client] NEW(0x73008293c0) for (986:system_server)
01-10 13:51:39.768446   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.769498  1126  1126 D ViewRootImpl[AssistPreviewPanel]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 13:51:39.769971  1340  1340 V PhoneWindow: DecorView setVisiblity: visibility = 0, Parent = ViewRoot{2e4996e com.android.settings/com.android.settings.FallbackHome,ident = 0}, this = DecorView@facad70[FallbackHome]
01-10 13:51:39.770831   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.771469   549   652 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.H263) in omx@1.0-service process
01-10 13:51:39.772370   540  1406 D NuPlayerDriver: notifyListener_l(0xed8af5b0), (1, 0, 0, -1), loop setting(0, 0)
01-10 13:51:39.774469   549   652 D MtkOmxVenc: [0xf3841c00] MtkOmxVenc::MtkOmxVenc this= 0xF3841C00
01-10 13:51:39.775210   549   652 D MtkOmxVenc: [0xf3841c00] dump flag=0x0
01-10 13:51:39.775367   549   652 D MtkOmxVenc: [0xf3841c00] MtkOmxComponentCreate mCompHandle(0xF3841C04)
01-10 13:51:39.775478   549   652 D MtkOmxVenc: [0xf3841c00] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.H263)
01-10 13:51:39.776186   549  1413 D MtkOmxVenc: [0xf3841c00] MtkOmxVencThread created pVenc=0xF3841C00
01-10 13:51:39.776363   549  1415 D MtkOmxVenc: [0xf3841c00] MtkOmxVencConvertThread created pVenc=0xF3841C00, tid=1415
01-10 13:51:39.776349   549  1414 D MtkOmxVenc: [0xf3841c00] MtkOmxVencEncodeThread created pVenc=0xF3841C00, tid=1414
01-10 13:51:39.778501   549   652 E MtkOmxVenc: [0xf3841c00] [ERROR] Unsupported H263 Level
01-10 13:51:39.779333   986  1392 I SurfaceFactory: [static] sSurfaceFactory = com.mediatek.view.impl.SurfaceFactoryImpl@46ee82a
01-10 13:51:39.780763  1304  1304 D TelephonyProvider: dbh.onOpen: ok, queried table=siminfo
01-10 13:51:39.781491  1304  1304 D TelephonyProvider: dbh.onOpen: ok, queried table=carriers
01-10 13:51:39.783475   986   986 D Ringtone: Successfully created local player
01-10 13:51:39.783914   401   401 I BufferQueue: [unnamed-401-2](this:0x7300cf4800,id:2,api:0,p:-1,c:-1) BufferQueue core=(401:/system/bin/surfaceflinger)
01-10 13:51:39.784336   401   401 W GuiExt  : Cannot find GuiExtService
01-10 13:51:39.784560   401   401 I BufferQueueConsumer: [unnamed-401-2](this:0x7300cf4800,id:2,api:0,p:-1,c:401) connect(C): consumer=(401:/system/bin/surfaceflinger) controlledByApp=false
01-10 13:51:39.784650   401   401 I BufferQueueConsumer: [unnamed-401-2](this:0x7300cf4800,id:2,api:0,p:-1,c:401) setConsumerName: unnamed-401-2
01-10 13:51:39.784740   401   401 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7300cf4800,id:2,api:0,p:-1,c:401) setConsumerName: com.android.settings/com.android.settings.FallbackHome#0
01-10 13:51:39.784803   401   401 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7300cf4800,id:2,api:0,p:-1,c:401) setDefaultBufferSize: width=720 height=1280
01-10 13:51:39.785638   540  1245 D NuPlayerDriver: start(0xed8af5b0), state is 4, eos is 0
01-10 13:51:39.785767   540  1406 I GenericSource: start
01-10 13:51:39.789475   549   652 E MtkOmxVenc: [0xf3841c00] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 13:51:39.789563   549   652 E MtkOmxVenc: [0xf3841c00] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 13:51:39.789584   549   652 E MtkOmxVenc: [0xf3841c00] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 13:51:39.789601   549   652 E MtkOmxVenc: [0xf3841c00] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 13:51:39.789620   549   652 E MtkOmxVenc: [0xf3841c00] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 13:51:39.789642   549   652 E MtkOmxVenc: [0xf3841c00] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 13:51:39.789663   549   652 E OMXNodeInstance: getParameter(0xf3841c04:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.789890   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.790748   549   652 E OMXNodeInstance: getParameter(0xf3841c04:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.791073   540   709 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 13:51:39.791621   549   652 D MtkOmxVenc: [0xf3841c00] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 13:51:39.792108  1340  1340 D Surface : Surface::allocateBuffers(this=0x7483abf000)
01-10 13:51:39.793689   549   652 E OMXNodeInstance: getParameter(0xf3841c04:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.793876   986  1007 W TelecomManager: Telecom Service not found.
01-10 13:51:39.793954   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.795251   549   652 D MtkOmxVenc: [0xf3841c00] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 13:51:39.795925   549   652 E OMXNodeInstance: getParameter(0xf3841c04:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.796164   540   709 W OMXUtils: do not know color format 0x6 = 6
01-10 13:51:39.796175   986  1007 W TelecomManager: Telecom Service not found.
01-10 13:51:39.796884   549   652 E OMXNodeInstance: getParameter(0xf3841c04:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.797025   540   709 W OMXUtils: do not know color format 0xb = 11
01-10 13:51:39.797154   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.797594   549   652 E OMXNodeInstance: getParameter(0xf3841c04:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.797928   540   709 W OMXUtils: do not know color format 0x10 = 16
01-10 13:51:39.799954  1288  1288 D ImsConfigStorage: ImsConfigStorage() on phone 0
01-10 13:51:39.802134   549   652 E OMXNodeInstance: getParameter(0xf3841c04:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.802328   540   709 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 13:51:39.802921   549   652 E OMXNodeInstance: getParameter(0xf3841c04:MTK.ENCODER.H263, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.803082   540   709 W OMXUtils: do not know color format 0xf = 15
01-10 13:51:39.803582   549   652 D MtkOmxVenc: [0xf3841c00] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 13:51:39.803814   549   652 D MtkOmxVenc: [0xf3841c00] +MtkOmxVenc::ComponentDeInit
01-10 13:51:39.803928   549  1415 D MtkOmxVenc: [0xf3841c00] MtkOmxVencConvertThread terminated pVenc=0xF3841C00
01-10 13:51:39.804242   549  1414 D MtkOmxVenc: [0xf3841c00] MtkOmxVencEncodeThread terminated pVenc=0xF3841C00
01-10 13:51:39.804459   549  1413 D MtkOmxVenc: [0xf3841c00] MtkOmxVencThread terminated
01-10 13:51:39.804676   549   652 D MtkOmxVenc: [0xf3841c00] -MtkOmxVenc::ComponentDeInit
01-10 13:51:39.804704   549   652 D MtkOmxVenc: [0xf3841c00] ~MtkOmxVenc this= 0xF3841C00
01-10 13:51:39.804904  1340  1407 I zygote64: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 13:51:39.804971   549  1416 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.805163  1340  1407 I OpenGLRenderer: Initialized EGL, version 1.4
01-10 13:51:39.805277  1340  1407 D OpenGLRenderer: Swap behavior 2
01-10 13:51:39.809341   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.809946   549   652 I OMXMaster: makeComponentInstance(OMX.google.h263.encoder) in omx@1.0-service process
01-10 13:51:39.812193  1304  1304 D CarrierProvider: onCreate
01-10 13:51:39.815236   549   652 I SoftMPEG4Encoder: Construct SoftMPEG4Encoder
01-10 13:51:39.817755   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.818439  1340  1407 D OpenGLRenderer: [init] completed
01-10 13:51:39.818564  1340  1407 D HWUIExtension: MTKProgramCache.init: enable enhancement 1
01-10 13:51:39.818729  1340  1407 I HWUIExtension: Get disable program binary service property (0)
01-10 13:51:39.818670   540   709 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 13:51:39.818763  1340  1407 I HWUIExtension: Initializing program atlas...
01-10 13:51:39.819162   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:39.819245   549  1161 E OMXNodeInstance: getConfig(0xf3caad20:google.h263.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
01-10 13:51:39.820294  1340  1407 I ProgramBinary/Service: ProgramBinaryService client side disable debugging.
01-10 13:51:39.820473  1340  1407 I ProgramBinary/Service: ProgramBinaryService client side disable binary content debugging.
01-10 13:51:39.820492  1340  1407 D ProgramBinary/Service: BpProgramBinaryService.getReady
01-10 13:51:39.820527  1340  1407 D ProgramBinary/Service: zhiyin- 1 BpProgramBinaryService::getReady()
01-10 13:51:39.820878   571   580 D ProgramBinary/Service: zhiyin- ontransact 1 code 1
01-10 13:51:39.821028   571   580 D ProgramBinary/Service: zhiyin- ontransact 2 code 1
01-10 13:51:39.821055   571   580 D ProgramBinary/Service: zhiyin- ontransact 3 code 1
01-10 13:51:39.821245  1340  1407 D ProgramBinary/Service: zhiyin- 2 BpProgramBinaryService::getReady()
01-10 13:51:39.821297  1340  1407 D ProgramBinary/Service: BpProgramBinaryService.getProgramBinaryData
01-10 13:51:39.821410   571   580 D ProgramBinary/Service: zhiyin- ontransact 1 code 3
01-10 13:51:39.821932  1340  1407 I HWUIExtension: Program binary detail: Binary length is 188172, program map length is 104.
01-10 13:51:39.825510  1340  1407 I HWUIExtension: Succeeded to mmap program binaries. File descriptor is 66, and path is /dev/ashmem.
01-10 13:51:39.825644  1340  1407 I HWUIExtension: No need to use file discriptor anymore, close fd(66).
01-10 13:51:39.825872  1340  1407 D HWUIExtension: Dumper init 4 threads <0x74753dac80>
01-10 13:51:39.826137  1340  1407 D HWUIExtension: <com.android.settings> is running.
01-10 13:51:39.826265  1340  1407 D HWUIExtension: Initializing program cache from 0x0, size = -1
01-10 13:51:39.826906  1340  1407 D Surface : Surface::connect(this=0x7483abf000,api=1)
01-10 13:51:39.827513   401   519 I BufferQueueProducer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7300cf4800,id:2,api:1,p:1340,c:401) connect(P): api=1 producer=(1340:com.android.settings) producerControlledByApp=true
01-10 13:51:39.829846  1340  1407 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 13:51:39.831240   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.833007   549  1161 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.HEVC) in omx@1.0-service process
01-10 13:51:39.835921   549  1161 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::MtkOmxVenc this= 0xF3841000
01-10 13:51:39.836473   549  1161 D MtkOmxVenc: [0xf3841000] dump flag=0x0
01-10 13:51:39.836503   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.836645   549  1161 D MtkOmxVenc: [0xf3841000] MtkOmxComponentCreate mCompHandle(0xF3841004)
01-10 13:51:39.836670   549  1161 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.HEVC)
01-10 13:51:39.836720   549  1161 E MtkOmxVenc: [0xf3841000] bufk = 0
01-10 13:51:39.836754   549  1161 D MtkOmxVenc: [0xf3841000] uIsHEVCSWPlatform 0
01-10 13:51:39.837307   549  1161 D MtkOmxVenc: [0xf3841000] uIsHEVCSWPlatform 0
01-10 13:51:39.840216   549  1440 D MtkOmxVenc: [0xf3841000] MtkOmxVencThread created pVenc=0xF3841000
01-10 13:51:39.840613   549  1441 D MtkOmxVenc: [0xf3841000] MtkOmxVencEncodeThread created pVenc=0xF3841000, tid=1441
01-10 13:51:39.840777   549  1442 D MtkOmxVenc: [0xf3841000] MtkOmxVencConvertThread created pVenc=0xF3841000, tid=1442
01-10 13:51:39.842631   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 13:51:39.842704   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 13:51:39.842722   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 13:51:39.842740   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 13:51:39.842757   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 13:51:39.842777   549   652 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 13:51:39.842795   549   652 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.843002   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.843585   549   652 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.843719   540   709 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 13:51:39.845093   549   652 D MtkOmxVenc: [0xf3841000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 13:51:39.846385   549   652 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.846628   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.847074  1288  1288 D ImsConfigProvider: getSimState() for checking whether broadcast phoneId: 0, Sim state: null
01-10 13:51:39.847098   549   652 D MtkOmxVenc: [0xf3841000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 13:51:39.847443  1288  1288 D ImsConfigStorage: updateFeature: VoLTE initial value:1 for phoneId:0
01-10 13:51:39.847519   549   652 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.847665   540   709 W OMXUtils: do not know color format 0x6 = 6
01-10 13:51:39.847989   549   652 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.848090   540   709 W OMXUtils: do not know color format 0xb = 11
01-10 13:51:39.848708   549   652 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.848843   540   709 W OMXUtils: do not know color format 0x10 = 16
01-10 13:51:39.849239   549   652 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.849364   540   709 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 13:51:39.851900   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.HEVC, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.852171   540   709 W OMXUtils: do not know color format 0xf = 15
01-10 13:51:39.854407   397   414 I vendor.mediatek.hardware.power@1.1-impl: PowerHint hint:8, data:0
01-10 13:51:39.856011   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.861667   397   413 I libPerfService: 10: legacy set freq: -1 -1 -1 -1
01-10 13:51:39.861877   549  1446 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 13:51:39.862039   549  1446 D MtkOmxVenc: [0xf3841000] +MtkOmxVenc::ComponentDeInit
01-10 13:51:39.862109   549  1441 D MtkOmxVenc: [0xf3841000] MtkOmxVencEncodeThread terminated pVenc=0xF3841000
01-10 13:51:39.862098   986  1009 I ActivityManager: Displayed com.android.settings/.FallbackHome: +332ms
01-10 13:51:39.862154   549  1440 D MtkOmxVenc: [0xf3841000] MtkOmxVencThread terminated
01-10 13:51:39.862262   549  1442 D MtkOmxVenc: [0xf3841000] MtkOmxVencConvertThread terminated pVenc=0xF3841000
01-10 13:51:39.862432   549  1446 D MtkOmxVenc: [0xf3841000] -MtkOmxVenc::ComponentDeInit
01-10 13:51:39.862473   549  1446 D MtkOmxVenc: [0xf3841000] ~MtkOmxVenc this= 0xF3841000
01-10 13:51:39.862749   549  1443 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.863820   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 13:51:39.866723   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.867164   549  1446 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.MPEG4) in omx@1.0-service process
01-10 13:51:39.869720   549  1446 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::MtkOmxVenc this= 0xF3841000
01-10 13:51:39.870212   549  1446 D MtkOmxVenc: [0xf3841000] dump flag=0x0
01-10 13:51:39.870307   549  1446 D MtkOmxVenc: [0xf3841000] MtkOmxComponentCreate mCompHandle(0xF3841004)
01-10 13:51:39.870326   549  1446 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.MPEG4)
01-10 13:51:39.870461  1288  1288 D ImsConfigProvider: getSimState() for checking whether broadcast phoneId: 0, Sim state: null
01-10 13:51:39.870656  1288  1288 D ImsConfigStorage: updateFeature: ViLTE initial value:0 for phoneId:0
01-10 13:51:39.870984  1304  1304 I ImsResolver: Initializing cache and binding.
01-10 13:51:39.871303   549  1449 D MtkOmxVenc: [0xf3841000] MtkOmxVencThread created pVenc=0xF3841000
01-10 13:51:39.873592   527   558 D AAL     : 01-10 01:51:39.665 BL= 371,ESS= 256, 01-10 01:51:39.722 BL= 372,ESS= 256, 01-10 01:51:39.779 BL= 373,ESS= 256, 01-10 01:51:39.816 BL= 374,ESS= 256, 01-10 01:51:39.873 BL= 375,ESS= 256, 
01-10 13:51:39.874576   549  1450 D MtkOmxVenc: [0xf3841000] MtkOmxVencEncodeThread created pVenc=0xF3841000, tid=1450
01-10 13:51:39.874694   549  1451 D MtkOmxVenc: [0xf3841000] MtkOmxVencConvertThread created pVenc=0xF3841000, tid=1451
01-10 13:51:39.875081   549  1446 E MtkOmxVenc: [0xf3841000] QueryVideoProfileLevel(1) fail, profile(16384)/level(16)
01-10 13:51:39.875276  1126  1126 D StatusBar: disable<e i a s b h r c s q >
01-10 13:51:39.875841   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 13:51:39.875902   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 13:51:39.875921   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 13:51:39.875937   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 13:51:39.875953   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 13:51:39.875971   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 13:51:39.875991   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.876188   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.878534   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.881184  1288  1288 D ImsConfigProvider: getSimState() for checking whether broadcast phoneId: 0, Sim state: null
01-10 13:51:39.881542  1288  1288 D ImsConfigStorage: updateFeature: VoWIFI initial value:0 for phoneId:0
01-10 13:51:39.885984   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.886187   540   709 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 13:51:39.886608   549  1446 D MtkOmxVenc: [0xf3841000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 13:51:39.887038   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.887209   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.887546   549  1446 D MtkOmxVenc: [0xf3841000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 13:51:39.887963   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.888120   540   709 W OMXUtils: do not know color format 0x6 = 6
01-10 13:51:39.888425   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.888516   540   709 W OMXUtils: do not know color format 0xb = 11
01-10 13:51:39.888814   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.888906   540   709 W OMXUtils: do not know color format 0x10 = 16
01-10 13:51:39.889245   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.889337   540   709 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 13:51:39.889719   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.MPEG4, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.889817   540   709 W OMXUtils: do not know color format 0xf = 15
01-10 13:51:39.890135   549  1446 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 13:51:39.890287   549  1446 D MtkOmxVenc: [0xf3841000] +MtkOmxVenc::ComponentDeInit
01-10 13:51:39.890361   549  1451 D MtkOmxVenc: [0xf3841000] MtkOmxVencConvertThread terminated pVenc=0xF3841000
01-10 13:51:39.890397   549  1449 D MtkOmxVenc: [0xf3841000] MtkOmxVencThread terminated
01-10 13:51:39.890361   549  1450 D MtkOmxVenc: [0xf3841000] MtkOmxVencEncodeThread terminated pVenc=0xF3841000
01-10 13:51:39.890585   549  1446 D MtkOmxVenc: [0xf3841000] -MtkOmxVenc::ComponentDeInit
01-10 13:51:39.890618   549  1446 D MtkOmxVenc: [0xf3841000] ~MtkOmxVenc this= 0xF3841000
01-10 13:51:39.890829   549  1452 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.893328   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.893914   549  1446 I OMXMaster: makeComponentInstance(OMX.google.mpeg4.encoder) in omx@1.0-service process
01-10 13:51:39.894811   549  1446 I SoftMPEG4Encoder: Construct SoftMPEG4Encoder
01-10 13:51:39.899706   540   709 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 13:51:39.900073   549  1446 E OMXNodeInstance: getConfig(0xf3814180:google.mpeg4.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
01-10 13:51:39.900729   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.906594  1304  1304 I zygote64: Looking for service android.hardware.radio.deprecated@1.0::IOemHook/slot1
01-10 13:51:39.910444  1288  1288 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:39.910554  1288  1288 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:39.910771  1288  1288 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:39.910771  1288  1288 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP08_null_null:OP08Ims.apk:com.mediatek.op08.ims.Op08ImsServiceCustomizationFactory:com.mediatek.op08.ims)
01-10 13:51:39.910771  1288  1288 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP18_null_null:OP18Ims.jar:com.mediatek.op18.ims.Op18ImsServiceCustomizationFactory:null)
01-10 13:51:39.910771  1288  1288 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP12_null_null:OP12Ims.apk:com.mediatek.op12.ims.Op12ImsServiceCustomizationFactory:com.mediatek.op12.ims)
01-10 13:51:39.910771  1288  1288 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP112_null_null:OP112Ims.apk:com.mediatek.op112.ims.Op112ImsServiceCustomizationFactory:com.mediatek.op112.ims)
01-10 13:51:39.914231  1304  1304 I zygote64: Starting thread pool.
01-10 13:51:39.914413   401   420 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=23.70 dur=1012.46 max=51.69 min=34.52
01-10 13:51:39.916350   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.916810   549  1446 I OMXMaster: makeComponentInstance(OMX.MTK.VIDEO.ENCODER.VPX) in omx@1.0-service process
01-10 13:51:39.918922   549  1446 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::MtkOmxVenc this= 0xF3841000
01-10 13:51:39.919468   549  1446 D MtkOmxVenc: [0xf3841000] dump flag=0x0
01-10 13:51:39.919589   549  1446 D MtkOmxVenc: [0xf3841000] MtkOmxComponentCreate mCompHandle(0xF3841004)
01-10 13:51:39.919609   549  1446 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::ComponentInit (OMX.MTK.VIDEO.ENCODER.VPX)
01-10 13:51:39.919647   549  1446 E MtkOmxVenc: [0xf3841000] bufk = 0
01-10 13:51:39.920305   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.921189   549  1462 D MtkOmxVenc: [0xf3841000] MtkOmxVencThread created pVenc=0xF3841000
01-10 13:51:39.921344  1288  1288 D ImsVT Util: multiIMSSupportNum:1
01-10 13:51:39.921715  1288  1288 D ImsVT Util: Getprop [persist.mtk.vilte.enable][0]=false
01-10 13:51:39.921979  1288  1288 D ImsVT Util: Getprop [persist.mtk.viwifi.enable][0]=false
01-10 13:51:39.922426  1288  1461 D ImsVT Util: setContextAndInitRefVTPInternal(), context =com.mediatek.ims.ImsApp@24483c3
01-10 13:51:39.922731  1288  1461 D VT SRC  : [STC] [setContext] context:com.mediatek.ims.ImsApp@24483c3
01-10 13:51:39.922887  1288  1461 D ImsVT Util: setContextAndInitRefVTP, register FeatureValueReceiver
01-10 13:51:39.924336   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.prepareForAdaptivePlayback
01-10 13:51:39.924418   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.configureVideoTunnelMode
01-10 13:51:39.924437   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer2
01-10 13:51:39.924455   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.useAndroidNativeBuffer
01-10 13:51:39.924472   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.enableAndroidNativeBuffers
01-10 13:51:39.924491   549  1446 E MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetExtensionIndex Unknown parameter name: OMX.google.android.index.getAndroidNativeBufferUsage
01-10 13:51:39.924510   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.924729   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.925224   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.925342   540   709 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 13:51:39.925999   549  1446 D MtkOmxVenc: [0xf3841000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 13:51:39.926555   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.927156   540   709 W OMXUtils: do not know color format 0x7f000200 = 2130706944
01-10 13:51:39.927156  1288  1461 D ImsVT Util: setContextAndInitRefVTP, register SimStateReceiver
01-10 13:51:39.928371   549  1446 D MtkOmxVenc: [0xf3841000] client query OMX_COLOR_FormatYUV420Flexible mbYUV420FlexibleMode 1, ret: 1
01-10 13:51:39.930476  1288  1461 D ImsVT Util: setContextAndInitRefVTPInternal(), ViLTE on, do natvie init
01-10 13:51:39.933675   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.934079   540   709 W OMXUtils: do not know color format 0x6 = 6
01-10 13:51:39.934671   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.934841   540   709 W OMXUtils: do not know color format 0xb = 11
01-10 13:51:39.935262   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.935369   540   709 W OMXUtils: do not know color format 0x10 = 16
01-10 13:51:39.935693   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.935796   540   709 W OMXUtils: do not know color format 0x7f000300 = 2130707200
01-10 13:51:39.936077   549  1446 E OMXNodeInstance: getParameter(0xf3841004:MTK.ENCODER.VPX, ??(0x7f200405)) ERROR: UnsupportedIndex(0x8000101a)
01-10 13:51:39.936168   540   709 W OMXUtils: do not know color format 0xf = 15
01-10 13:51:39.936497   549  1446 D MtkOmxVenc: [0xf3841000] MtkOmxVenc::GetState (mState=OMX_StateLoaded)
01-10 13:51:39.936667   549  1446 D MtkOmxVenc: [0xf3841000] +MtkOmxVenc::ComponentDeInit
01-10 13:51:39.936748   549  1462 D MtkOmxVenc: [0xf3841000] MtkOmxVencThread terminated
01-10 13:51:39.938494   549  1464 D MtkOmxVenc: [0xf3841000] MtkOmxVencConvertThread created pVenc=0xF3841000, tid=1464
01-10 13:51:39.938587   549  1464 D MtkOmxVenc: [0xf3841000] MtkOmxVencConvertThread terminated pVenc=0xF3841000
01-10 13:51:39.938867   549  1463 D MtkOmxVenc: [0xf3841000] MtkOmxVencEncodeThread created pVenc=0xF3841000, tid=1463
01-10 13:51:39.938909   549  1463 D MtkOmxVenc: [0xf3841000] MtkOmxVencEncodeThread terminated pVenc=0xF3841000
01-10 13:51:39.939041   549  1446 D MtkOmxVenc: [0xf3841000] -MtkOmxVenc::ComponentDeInit
01-10 13:51:39.939070   549  1446 D MtkOmxVenc: [0xf3841000] ~MtkOmxVenc this= 0xF3841000
01-10 13:51:39.939272   549  1465 D MtkOmxCore: ## MtkOmxCoreCpuControlThread terminated
01-10 13:51:39.941107   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.941982   540   709 I OMXClient: Treble IOmx obtained
01-10 13:51:39.941997   986   986 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:39.942067   986   986 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:39.942362   549  1446 I OMXMaster: makeComponentInstance(OMX.google.vp8.encoder) in omx@1.0-service process
01-10 13:51:39.942138   986   986 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:39.942138   986   986 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(null_null_null:OPTelecomCommon.apk:com.mediatek.op.telecom.CommonTelecomCustomizationFactory:com.mediatek.op.telecom)
01-10 13:51:39.944137   986   986 I CommonTelecomCustomizationUtils: return default CommonTelecomCustomizationFactoryBase
01-10 13:51:39.961113   540   709 W OMXUtils: do not know color format 0x7f000789 = 2130708361
01-10 13:51:39.961666   549  1446 E OMXNodeInstance: getConfig(0xf3814180:google.vp8.encoder, ConfigAndroidIntraRefresh(0x6f60000a)) ERROR: Undefined(0x80001001)
01-10 13:51:39.962402   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:39.965920   540  1436 I OMXClient: Treble IOmx obtained
01-10 13:51:39.967266   549  1446 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:39.968956   986  1155 I OMXClient: Treble IOmx obtained
01-10 13:51:39.969463   549   652 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:39.970721  1126  1240 I OMXClient: Treble IOmx obtained
01-10 13:51:39.971323   540  1436 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0xebce6400
01-10 13:51:39.971406   549  1446 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:39.971505   549   656 E OMXNodeInstance: setConfig(0xf38141e0:google.vorbis.decoder, ConfigPriority(0x6f800002)) ERROR: Undefined(0x80001001)
01-10 13:51:39.971610   540  1436 I ACodec  : codec does not support config priority (err -2147483648)
01-10 13:51:39.972232   549   656 E OMXNodeInstance: getConfig(0xf38141e0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 13:51:39.972711  1304  1304 I zygote64: Looking for service vendor.mediatek.hardware.radio@2.0::IRadio/slot1
01-10 13:51:39.972846   986  1155 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x746f883800
01-10 13:51:39.973071   540  1436 I MediaCodec: MediaCodec will operate in async mode
01-10 13:51:39.973675   549   656 E OMXNodeInstance: getConfig(0xf38140c0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 13:51:39.973784  1126  1240 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x748ec82c00
01-10 13:51:39.974509  1288  1461 I VT      : [JNI] Entering InitRefVTP
01-10 13:51:39.974519   549   656 E OMXNodeInstance: getConfig(0xf38142a0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 13:51:39.974713  1288  1461 I VT      : [JNI] Entering native_init
01-10 13:51:39.975920  1288  1461 E VT      : [JNI] native_init (g_client == 0)
01-10 13:51:39.976075   535  1048 D installd: Found quota mount /dev/block/dm-2 at /data
01-10 13:51:39.976133  1288  1461 I VT      : [VTC] before getVTService
01-10 13:51:39.976197   535  1048 E installd: Failed to enable USRQUOTA on /dev/block/dm-2: File exists
01-10 13:51:39.976220   535  1048 E installd: Failed to enable GRPQUOTA on /dev/block/dm-2: File exists
01-10 13:51:39.976235   535  1048 D installd: Found storage mount /data/media at /mnt/runtime/default/emulated
01-10 13:51:39.977389  1288  1461 I VT      : [VTC] after getVTService
01-10 13:51:39.977782  1288  1461 I VT      : [VTC] Add DeathNotifier
01-10 13:51:39.978393   534   849 I ServiceManager: Waiting for service phone...
01-10 13:51:39.979935  1288  1288 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:39.983618   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:39.983828   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:39.983945  1304  1304 I zygote64: Starting thread pool.
01-10 13:51:39.984428   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:39.987391   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:39.991684  1197  1197 E DrmMtkUtil/SecureTimer: open proc/uptime failed: [Permission denied].
01-10 13:51:39.991881   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:39.998011   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 7 lines
01-10 13:51:39.998242   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:39.989000  1197  1197 W main    : type=1400 audit(0.0:45): avc: denied { open } for path="/proc/uptime" dev="proc" ino=4026532104 scontext=u:r:webview_zygote:s0 tcontext=u:object_r:proc:s0 tclass=file permissive=0
01-10 13:51:39.999251   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.000917   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 13:51:40.003593   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.004119   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.006232   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.006787   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:40.006900   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.011745   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 4 lines
01-10 13:51:40.012982   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.013047   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 13:51:40.014027   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.014969  1340  1407 D Surface : Surface::disconnect(this=0x7483abf000,api=1)
01-10 13:51:40.015368   401   420 I BufferQueueProducer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7300cf4800,id:2,api:1,p:1340,c:401) disconnect(P): api 1
01-10 13:51:40.015623   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.015889   401   420 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7300cf4800,id:2,api:1,p:-1,c:401) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 13:51:40.016990   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.018646   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 13:51:40.020143   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.022530   540  1423 D AudioTrack: set(): 0xeb4cc000, streamType 1, sampleRate 44100, format 0x1, channelMask 0x1, frameCount 22560, flags #0, notificationFrames 0, sessionId 17, transferType 0, uid 1000, pid 986
01-10 13:51:40.022614   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.022654   540  1423 D AudioTrack: Building AudioTrack with attributes: usage = 13, content = 4, flags = 0x0, tags = []
01-10 13:51:40.022928   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.026046   528   707 D AudioFlinger: track(0xf31ed200): mIsOut 1, mFrameCount 22560, mSampleRate 44100, mFormat 1, mChannelCount 1, mTrackCount 0, thread 0xf2b83d80, sessionId 17
01-10 13:51:40.026892   528   707 D AudioFlinger: track(0xf31ed200): mFastIndex -1, mStreamType 1, mName 4096
01-10 13:51:40.027734   540  1423 D AudioTrack: Client defaulted notificationFrames to 7520 for frameCount 22560
01-10 13:51:40.027956   986   986 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:40.028003  1288  1288 D WfoService: onCreate()
01-10 13:51:40.028051   540  1423 D AudioTrack: createTrack_l: 0xeb4cc000, mCblk = 0xeae63000, mLatency = 563, mAfLatency = 52, frameCount = 22560, mSampleRate = 44100, mFlags = 0, mReqFrameCount = 22560, mNotificationFramesAct = 7520
01-10 13:51:40.028230  1288  1288 D WfoService: WfoService new MWIService
01-10 13:51:40.028991   540  1423 D AudioTrack: start(): 0xeb4cc000, mState = 1
01-10 13:51:40.029477   528   707 D APM_AudioPolicyManager: startOutput() output 13, stream 1, session 17
01-10 13:51:40.029668   528   707 V APM::AudioOutputDescriptor: changeRefCount() stream 1, count 1
01-10 13:51:40.030186   528   703 D AudioSystem: +setParameters(): volumeDevice=2;volumeIndex=13;volumeStreamType=1 
01-10 13:51:40.030327   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 13:51:40.031043   380   919 D AudioALSAStreamOut: +setParameters(): flag 6, volumeDevice=2;volumeIndex=13;volumeStreamType=1
01-10 13:51:40.031325   380   919 D AudioMTKGainController: setNormalVolume(), mSceneIndex = 0, stream 1, devices 0x2, index 13, mode 0x0
01-10 13:51:40.031442   380   919 D AudioMTKGainController: setSpeakerGain(), gain = 9, spkAnaType = 3, spkLMixerName = Lineout_PGAL_GAIN, spkRMixerName = Lineout_PGAR_GAIN
01-10 13:51:40.035075  1304  1304 W System.err: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 13:51:40.035538  1304  1304 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 13:51:40.035605  1304  1304 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 13:51:40.035622  1304  1304 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 13:51:40.035636  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.getRilOp(MtkRIL.java:467)
01-10 13:51:40.035649  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.<init>(MtkRIL.java:377)
01-10 13:51:40.035664  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkTelephonyComponentFactory.makeRil(MtkTelephonyComponentFactory.java:188)
01-10 13:51:40.035686  1304  1304 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhone(PhoneFactory.java:206)
01-10 13:51:40.035701  1304  1304 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhones(PhoneFactory.java:131)
01-10 13:51:40.035717  1304  1304 W System.err: 	at com.android.phone.PhoneGlobals.onCreate(PhoneGlobals.java:370)
01-10 13:51:40.035730  1304  1304 W System.err: 	at com.android.phone.PhoneApp.onCreate(PhoneApp.java:43)
01-10 13:51:40.035754  1304  1304 W System.err: 	at android.app.Instrumentation.callApplicationOnCreate(Instrumentation.java:1119)
01-10 13:51:40.035769  1304  1304 W System.err: 	at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5781)
01-10 13:51:40.035781  1304  1304 W System.err: 	at android.app.ActivityThread.-wrap1(Unknown Source:0)
01-10 13:51:40.035795  1304  1304 W System.err: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1690)
01-10 13:51:40.035808  1304  1304 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:40.035824  1304  1304 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:40.035838  1304  1304 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 13:51:40.035851  1304  1304 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 13:51:40.035865  1304  1304 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 13:51:40.035878  1304  1304 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 13:51:40.036050  1304  1304 W System.err: Caused by: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 13:51:40.036124  1304  1304 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 13:51:40.036142  1304  1304 W System.err: 	at java.lang.BootClassLoader.findClass(ClassLoader.java:1355)
01-10 13:51:40.036155  1304  1304 W System.err: 	at java.lang.BootClassLoader.loadClass(ClassLoader.java:1415)
01-10 13:51:40.036168  1304  1304 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 13:51:40.036180  1304  1304 W System.err: 	... 20 more
01-10 13:51:40.036218  1304  1304 W System.err: Caused by: java.lang.NoClassDefFoundError: Class not found using the boot class loader; no stack trace available
01-10 13:51:40.037755   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 13:51:40.039218  1197  1197 D PQ      : [PQ_PROT] [PQCust] libpq_cust_base_mtk.so absent, libpq_cust_mtk.so absent
01-10 13:51:40.039450  1340  1340 V PhoneWindow: DecorView setVisiblity: visibility = 4, Parent = ViewRoot{2e4996e com.android.settings/com.android.settings.FallbackHome,ident = 0}, this = DecorView@facad70[FallbackHome]
01-10 13:51:40.040005  1197  1197 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 13:51:40.040664  1197  1197 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 13:51:40.040837  1197  1197 D AVStageFactory: createInstance(32bit): createVendorAVFactory success!
01-10 13:51:40.042618   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.041583  1197  1197 D AVStageUtils: createInstance(32bit): createVendorAVUtils success!
01-10 13:51:40.045267   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.045387   986  1173 I WifiService: getWifiEnabledState uid=1001
01-10 13:51:40.046073   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.046087  1288  1288 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 13:51:40.046365   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.059429   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 4 lines
01-10 13:51:40.060243   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.065281  1126  1482 I SecurityController: e.getMessage() = could not bind to KeyChainService
01-10 13:51:40.066465   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.070956   401   401 I BufferQueueConsumer: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7300cf4800,id:2,api:1,p:-1,c:-1) disconnect(C)
01-10 13:51:40.071629   401   401 I BufferQueue: [com.android.settings/com.android.settings.FallbackHome#0](this:0x7300cf4800,id:2,api:1,p:-1,c:-1) ~BufferQueueCore
01-10 13:51:40.073757   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:30.397619,dur:1019.82,max:87.61,min:1.39
01-10 13:51:40.080625   986  1173 I WifiService: getWifiEnabledState uid=1001
01-10 13:51:40.081628  1288  1288 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:40.081744  1288  1288 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:40.081887  1288  1288 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:40.081887  1288  1288 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP07_null_null:OP07Wos.apk:com.mediatek.op07.wfo.Op07WosCustomizationFactory:com.mediatek.op07.wfo)
01-10 13:51:40.081887  1288  1288 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP08_null_null:OP08Wos.apk:com.mediatek.op08.wfo.Op08WosCustomizationFactory:com.mediatek.op08.wfo)
01-10 13:51:40.082117  1288  1288 D DefaultWosExt: DefaultWosExt constructor
01-10 13:51:40.085660  1126  1126 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:40.085725  1126  1126 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:40.085803   986   986 E WiredAccessoryManager: No state change.
01-10 13:51:40.085961  1126  1126 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:40.085961  1126  1126 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01SystemUI.apk:com.mediatek.keyguard.op01.Op01KeyguardCustomizationFactory:com.mediatek.systemui.op01)
01-10 13:51:40.085961  1126  1126 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02SystemUI.apk:com.mediatek.keyguard.op02.Op02KeyguardCustomizationFactory:com.mediatek.systemui.op02)
01-10 13:51:40.085961  1126  1126 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07SystemUI.apk:com.mediatek.op07.keyguard.Op07KeyguardCustomizationFactory:com.mediatek.op07.systemui)
01-10 13:51:40.085961  1126  1126 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09SystemUI.apk:com.mediatek.keyguard.op09.Op09KeyguardCustomizationFactory:com.mediatek.systemui.op09)
01-10 13:51:40.085961  1126  1126 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP09_null_SEGC:OP09ClipSystemUI.apk:com.mediatek.keyguard.op09clip.Op09KeyguardCustomizationFactory:com.mediatek.systemui.op09clip)
01-10 13:51:40.087736   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.096624  1304  1304 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:40.096745  1304  1304 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:40.096903  1304  1304 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:40.096903  1304  1304 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP18_null_null:OP18Ims.jar:com.mediatek.op18.ims.Op18ImsCustomizationFactory:null)
01-10 13:51:40.096903  1304  1304 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP15_null_null:OP15Ims.jar:com.mediatek.op15.ims.Op15ImsCustomizationFactory:null)
01-10 13:51:40.099996   527   558 D AAL     : 01-10 01:51:39.912 BL= 376,ESS= 256, 01-10 01:51:39.968 BL= 377,ESS= 256, 01-10 01:51:40.005 BL= 378,ESS= 256, 01-10 01:51:40.062 BL= 379,ESS= 256, 01-10 01:51:40.099 BL= 380,ESS= 256, 
01-10 13:51:40.100168  1288  1288 D WfoService: onStartCommand()
01-10 13:51:40.100313  1288  1288 D WfoService: Service starting for intent null
01-10 13:51:40.104315   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.110349  1288  1288 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 13:51:40.114208   986  1145 V NuMediaExtractor: setDataSource fd=195 (/system/media/audio/ui/KeypressStandard.ogg), offset=0, length=5837
01-10 13:51:40.115293   532   736 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:40.115709   532   736 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:40.116615  1288  1288 D WfoService: onStartCommand()
01-10 13:51:40.116714  1288  1288 D WfoService: Service starting for intent null
01-10 13:51:40.119276   532   736 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:40.119864   532   736 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:40.122831  1126  1235 V NuMediaExtractor: setDataSource fd=46 (/system/media/audio/ui/Unlock.ogg), offset=0, length=7853
01-10 13:51:40.123019  1304  1485 D PowerSM : mDesiredModemPower: true mCurrentModemPower: true
01-10 13:51:40.123583   532   736 D DrmMtkUtil: getProcessName() : path : [/proc/1126/cmdline]
01-10 13:51:40.125061   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 13:51:40.125273   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 13:51:40.125655   538  1402 V APEExtractor: getAPEInfo not ape 20482
01-10 13:51:40.125841   538  1402 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:40.126498  1126  1126 W TelecomManager: Telecom Service not found.
01-10 13:51:40.129652   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.130555   532   532 D DrmMtkUtil: getProcessName() : path : [/proc/1126/cmdline]
01-10 13:51:40.133968   538  1404 V APEExtractor: getAPEInfo not ape 20482
01-10 13:51:40.134154   538  1404 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:40.135576   986   995 I zygote64: Background concurrent copying GC freed 80976(4MB) AllocSpace objects, 20(672KB) LOS objects, 41% free, 8MB/14MB, paused 258us total 233.577ms
01-10 13:51:40.138031  1126  1235 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 13:51:40.142234  1126  1491 I OMXClient: Treble IOmx obtained
01-10 13:51:40.142807   549  1475 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:40.143024   986  1145 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 13:51:40.144754  1126  1491 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x7486922800
01-10 13:51:40.145403   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.145396   549  1475 E OMXNodeInstance: getConfig(0xf38142a0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 13:51:40.146631  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:40.146830  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:40.146926  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:40.148381   986  1493 I OMXClient: Treble IOmx obtained
01-10 13:51:40.148679   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.148999   549  1475 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:40.150371   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.151456   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.151477   986  1493 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x7486951400
01-10 13:51:40.151963   549  1475 E OMXNodeInstance: getConfig(0xf3cab1a0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 13:51:40.152639   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.170602   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 14 lines
01-10 13:51:40.171515   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.171742   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.172790   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.174158  1304  1304 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:40.174296  1304  1304 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:40.174737  1304  1304 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:40.174737  1304  1304 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01Telephony.jar:com.mediatek.op01.telephony.Op01TelephonyCustomizationFactory:null)
01-10 13:51:40.174737  1304  1304 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02Telephony.jar:com.mediatek.op02.telephony.Op02TelephonyCustomizationFactory:null)
01-10 13:51:40.174737  1304  1304 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP08_null_null:OP08Telephony.jar:com.mediatek.op08.telephony.Op08TelephonyCustomizationFactory:null)
01-10 13:51:40.174737  1304  1304 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09ATelephony.jar:com.mediatek.op09a.telephony.Op09ATelephonyCustomizationFactory:null)
01-10 13:51:40.174737  1304  1304 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP09_null_SEGC:OP09CTelephony.jar:com.mediatek.op09c.telephony.Op09CTelephonyCustomizationFactory:null)
01-10 13:51:40.174737  1304  1304 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP12_null_null:OP12Telephony.jar:com.mediatek.op12.telephony.Op12TelephonyCustomizationFactory:null)
01-10 13:51:40.174737  1304  1304 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP07_null_null:OP07Telephony.jar:com.mediatek.op07.telephony.Op07TelephonyCustomizationFactory:null)
01-10 13:51:40.174737  1304  1304 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP18_null_null:OP18Telephony.jar:com.mediatek.op18.telephony.Op18TelephonyCustomizationFactory:null)
01-10 13:51:40.187617   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.202630  1126  1126 I CameraManagerGlobal: Connecting to camera service
01-10 13:51:40.206818   531   713 I CameraService: CameraService::connect call (PID -1 "cameraserver", camera ID 0) for HAL version default and Camera API version 1
01-10 13:51:40.207454  1126  1235 V NuMediaExtractor: setDataSource fd=48 (/system/media/audio/ui/Trusted.ogg), offset=0, length=5713
01-10 13:51:40.208043   532  1489 D DrmMtkUtil: getProcessName() : path : [/proc/1126/cmdline]
01-10 13:51:40.208776   986  1145 V NuMediaExtractor: setDataSource fd=196 (/system/media/audio/ui/KeypressSpacebar.ogg), offset=0, length=5952
01-10 13:51:40.209589   532   532 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:40.209789   532   532 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:40.211310  1304  1304 D @M_MtkDupSmsFilter: call constructor
01-10 13:51:40.212693   532  1489 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:40.212973   531   713 I CameraService: onTorchStatusChangedLocked: Torch status changed for cameraId=0, newStatus=0
01-10 13:51:40.212951   532  1489 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:40.213404   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.214094   532   532 D DrmMtkUtil: getProcessName() : path : [/proc/1126/cmdline]
01-10 13:51:40.214314   540   709 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 13:51:40.214483   540   709 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:cX�
01-10 13:51:40.214419   531   713 I CameraHardwareInterface: Opening camera 0
01-10 13:51:40.214613   540   709 D NuPlayerDriver: NuPlayerDriver(0xeb4b01c0) created, clientPid(531)
01-10 13:51:40.216411   551   864 I mtkcam-dev1: [createSpecificCameraDevice1] APP_MODE_NAME_DEFAULT
01-10 13:51:40.216942   538  1402 V APEExtractor: getAPEInfo not ape 20482
01-10 13:51:40.217088   538  1402 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:40.217631   538  1404 V APEExtractor: getAPEInfo not ape 20483
01-10 13:51:40.217740   538  1404 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:40.220596   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_REG: pid:551, uid:1047
01-10 13:51:40.220866   986  1145 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 13:51:40.220988   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnReg hdl:39
01-10 13:51:40.221874  1126  1235 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 13:51:40.222321   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnEnable hdl:39, timeout:1000
01-10 13:51:40.222652   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_ENABLE: hdl:39, timeout:1000
01-10 13:51:40.222761   397   413 I libPerfService: perfUserScnEnable - handle:39
01-10 13:51:40.224161   397   413 I libPerfService: 39: legacy set freq: 1508000 -1 2002000 -1
01-10 13:51:40.225123   551   864 I mtkcam-dev1: [createSpecificCameraDevice1] - 0xebe30600
01-10 13:51:40.225232   551   864 I mtkcam-dev1: 0[CameraDevice1Base::open] +
01-10 13:51:40.226058   538   659 V APEExtractor: getAPEInfo not ape 20482
01-10 13:51:40.226197   538   659 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:40.226299   551   864 I mtkcam-devicemgr: [attachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 13:51:40.226
01-10 13:51:40.226482  1126  1514 I OMXClient: Treble IOmx obtained
01-10 13:51:40.226880   551  1516 D SeninfDrvImp: [init][init]: Entry count 0 
01-10 13:51:40.226894   549  1161 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:40.227215   551   864 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_AE,0),srIdxNum(0)
01-10 13:51:40.227332   551   864 I Drv/HWsync: Drv/HWsync[init] mAECyclePeriod(3)
01-10 13:51:40.228364   986  1513 I OMXClient: Treble IOmx obtained
01-10 13:51:40.228745   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.228985  1126  1514 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x7474ab4800
01-10 13:51:40.229368   551   864 I Drv/HWsync: Drv/HWsync[init] -
01-10 13:51:40.229612   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:40.229685   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0xe7ea79d8), bForceRead(0) +
01-10 13:51:40.229703   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:40.229723   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0xe83a1e48), bForceRead(0) +
01-10 13:51:40.229747   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:40.229767   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0xe7ab0718), bForceRead(0) +
01-10 13:51:40.229821   549  1161 E OMXNodeInstance: getConfig(0xf3cab1a0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 13:51:40.230273   549  1475 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:40.230629   551   864 D LaserDrv: Device error opening : No such file or directory
01-10 13:51:40.231210   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:40.231308   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0x0), bForceRead(0) +
01-10 13:51:40.233264   986  1513 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x7470662c00
01-10 13:51:40.234041   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.234086   549  1475 E OMXNodeInstance: getConfig(0xf38142a0:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 13:51:40.234982   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.235993   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.237237   551  1516 D SeninfDrvImp: [init]Efuse Data:0x11f1018c= 0x8c631940, 0x11f10190= 0x7c208364, 0x11f101bc= 0x80000000
01-10 13:51:40.237308   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.237344   551  1516 D SeninfDrvImp: [init][init]: Exit count 1 
01-10 13:51:40.237391   540  1508 D NuPlayerDriver: notifyListener_l(0xeb4b01c0), (1, 0, 0, -1), loop setting(0, 0)
01-10 13:51:40.237483   551  1516 D ImgSensorDrv: [init][init] imgsensor_drv 1
01-10 13:51:40.237567   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.237588   551  1516 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11)
01-10 13:51:40.237627   551  1516 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(1), clkPol(0), mMclk1User(1), TimestampClk(11), SENINF_TG1_PH_CNT(0x80000005)
01-10 13:51:40.237844   551  1516 D SeninfDrvImp: [setMclk1IODrivingCurrent]DrivingIdx(3), Reg(0x30000000)
01-10 13:51:40.237885   551   922 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:40.238613   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.239322   551   864 D AppTsf  : [AppTsf] constructor
01-10 13:51:40.239373   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.239398   551   864 D tsf_core: [TsfCore] constructor
01-10 13:51:40.239903   540   709 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 13:51:40.240072   540   709 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:@��
01-10 13:51:40.240239   540   709 D NuPlayerDriver: NuPlayerDriver(0xeb4b02a0) created, clientPid(531)
01-10 13:51:40.240980   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.244374   551   864 W aaa_state_mgr: [StateCommon::transitState] StateUninit --> StateInit
01-10 13:51:40.244704   551   864 D flash_tuning_custom.cpp: paraIdx=0 aeSceneInd =2
01-10 13:51:40.244753   551   864 D flash_tuning_custom.cpp: copyTuningPara main yTarget=188
01-10 13:51:40.244749   551  1525 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:40.244805   551  1525 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(7), sensorDev(1), p(0x0), bForceRead(1) +
01-10 13:51:40.244923   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:40.245207   551  1525 W nvbuf_util.cpp: [readRamVersion:245] nvRamId(7), ver: isp(0),3a(0),sh(0),lens(0),pl(0),stb(0),tsf(0),pdc(0),geo(0),fov(0),feature(0)
01-10 13:51:40.245261   551  1525 W NvramDrv: [readDefaultData:779] CAMERA_DATA_PDC_TABLE
01-10 13:51:40.245398   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(5), sensorDev(1), p(0xe84eadd8), bForceRead(0) +
01-10 13:51:40.245489   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.245630   550  1061 I Gyroscope: batch: handle:3, flag:0,samplingPeriodNs:20000000 maxBatchReportLatencyNs:0
01-10 13:51:40.245694   551  1525 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 13:51:40.246099   550  1061 I Gyroscope: enable: handle:3, en:1
01-10 13:51:40.246333   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.246441   550  1061 E Gyroscope: MPE_gyr_calib_read 0.000246 -0.005214 -0.000687,0.000000 0.000000 0.000000,0.000246 -0.005214 -0.000687
01-10 13:51:40.246853   551   864 I MtkCam/ParamsManager: [updateDefaultParams2_ByQuery] cap(4208,3120),fov(67,49)
01-10 13:51:40.246967   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.247058   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:40.247106   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(1), sensorDev(1), p(0xe7ea79d8), bForceRead(0) +
01-10 13:51:40.247120   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:40.247140   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(4), sensorDev(1), p(0xe83a1e48), bForceRead(0) +
01-10 13:51:40.247153   551   864 W nvbuf_util.cpp: [getInstance:397] getInstance, bInit(1)
01-10 13:51:40.247167   551   864 W nvbuf_util.cpp: [getBufAndReadNoLock:709] ramId(0), sensorDev(1), p(0xe7aad7ac), bForceRead(0) +
01-10 13:51:40.247203   551   864 D LensMCU : LensMCU[isSupportLens][CurrSensorDev]0x0001 [CurrSensorId]0x30c8
01-10 13:51:40.247604   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.248145   551   864 I MtkCam/FrameController: [FrameController][prvcb] - miLogLevel(1), max delay(30000000), max sleep(1000000000 ns), min sleep(200 us), adj sleep(250000 ns)
01-10 13:51:40.237000   551   551 W HwBinder:551_2: type=1400 audit(0.0:46): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:40.250835   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.254045   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 13:51:40.255028   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.255227   531   713 I CameraProviderManager: Camera device device@1.0/internal/0 torch status is now NOT_AVAILABLE
01-10 13:51:40.255357   531   713 I CameraService: onTorchStatusChangedLocked: Torch status changed for cameraId=0, newStatus=0
01-10 13:51:40.255671   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.255905   551   864 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:0
01-10 13:51:40.256032   551   864 I mtkcam-dev1: 0[CameraDevice1Base::open] Add new cameraId 0 - 0xebe30600
01-10 13:51:40.256369   551   864 I mtkcam-dev1: 0[CameraDevice1Base::open] -
01-10 13:51:40.256351   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.257910   538  1404 V APEExtractor: getAPEInfo not ape 20482
01-10 13:51:40.258063   538  1404 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:40.264798   540  1523 D NuPlayerDriver: notifyListener_l(0xeb4b02a0), (1, 0, 0, -1), loop setting(0, 0)
01-10 13:51:40.266957  1304  1304 D IntentBroadcaster: Broadcasting and adding intent for rebroadcast: android.intent.action.SIM_STATE_CHANGED NOT_READY for slotId 0
01-10 13:51:40.267236   540   709 E Cta5File: Cta5File::isCta5NormalFile false, bad magic:OggS
01-10 13:51:40.267405   540   709 E Cta5File: Cta5File::isCta5MultimediaFile false, bad magic:�@��
01-10 13:51:40.267550   540   709 D NuPlayerDriver: NuPlayerDriver(0xeb4b0700) created, clientPid(531)
01-10 13:51:40.268999   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.269549   986  1339 D CTA_BootReceiverPolicy: initBootIntentFilterList() - add monitored intent = android.intent.action.BOOT_COMPLETED
01-10 13:51:40.270568   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.271271   986  1339 D Cta_ReceiverRecordHelper: storeDir = /data/data/com.mediatek.security
01-10 13:51:40.271507   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.272048   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.272456   986  1339 D Cta_ReceiverRecordHelper: initReceiverCache() at User(0)
01-10 13:51:40.272488   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.272848   986  1339 D Cta_ReceiverRecordHelper: getPackageListReceivingSpecifiedIntent() find activities receiving intent = android.intent.action.BOOT_COMPLETED
01-10 13:51:40.278567   986  1339 D Cta_ReceiverRecordHelper: initReceiverCache() at User(10)
01-10 13:51:40.278711   986  1339 D Cta_ReceiverRecordHelper: getPackageListReceivingSpecifiedIntent() find activities receiving intent = android.intent.action.BOOT_COMPLETED
01-10 13:51:40.279069   551   864 I mtkcam-dev1: 0[CameraDevice1Base::stopPreview] +
01-10 13:51:40.279235   551   864 W MtkCam/CamClient/FDClient: (864)[stopFaceDetection] FD was not running
01-10 13:51:40.279306   551   864 W MtkCam/RecordClient: (864)[stopPreview] Preview has been stopped
01-10 13:51:40.279347   551   864 I mtkcam-dev1: 0[CameraDevice1Base::stopPreview] -
01-10 13:51:40.280277   551   864 I mtkcam-dev1: 0[CameraDevice1Base::cancelPicture] +
01-10 13:51:40.280401   551   864 I mtkcam-dev1: 0[CameraDevice1Base::cancelPicture] - status(7)
01-10 13:51:40.280665   551   864 I mtkcam-dev1: 0[CameraDevice1Base::close] +
01-10 13:51:40.284106   986  1339 D Cta_ReceiverRecordHelper: loadDataFromFileToCache()
01-10 13:51:40.283856   538  1404 V APEExtractor: getAPEInfo not ape 20482
01-10 13:51:40.284521   538  1404 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:40.284888   986  1339 I Cta_ReceiverRecordHelper: No existing /data/data/com.mediatek.security/bootreceiver.xml; starting empty
01-10 13:51:40.284997   986  1339 D Cta_ReceiverRecordHelper: resetAllReceiverRecords()
01-10 13:51:40.285557   986  1339 D Cta_ReceiverController: init ReceiverRecordHelper done.
01-10 13:51:40.286292   986  1339 D Cta_ReceiverController: startMonitor(Normal Bootup Start)
01-10 13:51:40.288881   540  1406 D NuPlayerDriver: notifyListener_l(0xed8af5b0), (6, 0, 0, -1), loop setting(0, 0)
01-10 13:51:40.289085   528   921 E AudioFlinger_Threads: no wake lock to update, but system ready!
01-10 13:51:40.289622  1288  1288 D ImsConfigReceiver: Update LatestSimState, phoneId = 0, state = NOT_READY
01-10 13:51:40.289901  1288  1288 D ImsConfigReceiver: Sim state changed, event = NOT_READY, reset broadcast flag
01-10 13:51:40.290247  1288  1288 D ImsVT Util: Received ACTION_SIM_STATE_CHANGED, slotId:0, simState:NOT_READY
01-10 13:51:40.293042   540  1532 D NuPlayerDriver: notifyListener_l(0xeb4b0700), (1, 0, 0, -1), loop setting(0, 0)
01-10 13:51:40.294157   551  1525 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 13:51:40.294250   551  1525 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 13:51:40.294263   551  1525 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 13:51:40.294273   551  1525 I MtkCam/Utils: onCreate#03 pc 000f5949  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+348)
01-10 13:51:40.294282   551  1525 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 13:51:40.294290   551  1525 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 13:51:40.294299   551  1525 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 13:51:40.294308   551  1525 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 13:51:40.294332   551  1525 E MtkCam/IonHeap: PDC_tbl_1@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 13:51:40.294404   551  1525 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 13:51:40.295204   380   940 D AudioALSAStreamManager: setMicMute(), mMicMute: 0 => 0
01-10 13:51:40.295214   380  1535 D AudioALSAStreamManager: +syncSharedOutDevice(), routingSharedOutDevice: 2
01-10 13:51:40.295335   380  1535 D AudioALSAStreamManager: setMasterVolume(), volume = 1.000000
01-10 13:51:40.297165   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.297202   380   940 D AudioALSAStreamManager: +SetInputMute(), 0
01-10 13:51:40.297129   986  1145 V NuMediaExtractor: setDataSource fd=197 (/system/media/audio/ui/KeypressDelete.ogg), offset=0, length=5832
01-10 13:51:40.297562   380  1535 D AudioMTKGainController: setNormalVolume(), mSceneIndex = 0, stream 1, devices 0x2, index 13, mode 0x0
01-10 13:51:40.297690   380  1535 D AudioMTKGainController: setSpeakerGain(), gain = 9, spkAnaType = 3, spkLMixerName = Lineout_PGAL_GAIN, spkRMixerName = Lineout_PGAR_GAIN
01-10 13:51:40.297782   380  1535 D AudioALSAStreamOut: open(), flags 6
01-10 13:51:40.298052   380  1535 D AudioUtility: power_hal_hint - custPowerHint 0, data 268435455
01-10 13:51:40.298154   380  1535 D AudioALSAStreamManager: +createPlaybackHandler(), mAudioMode = 0, output_devices = 0x2
01-10 13:51:40.298210   380  1535 D NVRAM   : getNumMicSupport(), dualMicFlag 1, numMicString 2
01-10 13:51:40.298263   380  1535 D NVRAM   : QueryFeatureSupportInfo(), feature support bit 0x1a097c57 
01-10 13:51:40.298278   380  1535 D AudioSpeechEnhanceInfo: IsAPDMNRTuningEnable(), 0
01-10 13:51:40.298380   380  1535 D AudioALSADataProcessor: AudioALSADataProcessor()
01-10 13:51:40.298413   380  1535 D AudioALSAPlaybackHandlerNormal: AudioALSAPlaybackHandlerNormal()
01-10 13:51:40.298448   380  1535 D AudioALSAPlaybackHandlerNormal: +setFilterMng() mAudioFilterManagerHandler [0xe74a28d0]
01-10 13:51:40.298475   380  1535 D AudioALSAPlaybackHandlerNormal: +open(), flag 6, mDevice = 0x2
01-10 13:51:40.298583   380  1535 D AudioALSADeviceParser: compare pcm success = 7, stringpair = I2S0DL1_PLayback
01-10 13:51:40.299120   380  1535 D         : -AssignDRAM() retval 0
01-10 13:51:40.298830   397   414 I vendor.mediatek.hardware.power@1.1-impl: mtkCusPowerHint hint:0, data:268435455
01-10 13:51:40.299176   380  1535 D AudioALSAPlaybackHandlerBase: transferAudioFormatToPcmFormat(), audio_format(0x4) => pcm_format(0x1)
01-10 13:51:40.299169   532   532 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:40.299242   380  1535 D AudioALSAPlaybackHandlerNormal: open(), mConfig: channels = 2, rate = 48000, period_size = 256, period_count = 2, format = 1 avail_min = 256
01-10 13:51:40.299311   380  1535 D AudioALSADriverUtility: GetPropertyValue key = af.resouce.extdac_support value = 0
01-10 13:51:40.299332   532   532 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:40.299358   380  1535 D AudioALSAPlaybackHandlerNormal: SetLowJitterMode(), bypass low jitter mode, bEnable = 1, device = 0x2, SampleRate = 48000
01-10 13:51:40.299403   380  1535 D AudioALSAPlaybackHandlerBase: openPcmDriverWithFlag(), pcm device = 7 flag = 0x8
01-10 13:51:40.299579   397   413 I powerd  : [powerd_req] POWER_MSG_MTK_CUS_HINT: hint:0, hdl:36, data:268435455
01-10 13:51:40.299644   397   413 I libPerfService: perfCusUserScnEnable - handle:36
01-10 13:51:40.300240   380   940 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 13:51:40.300275   380  1535 D AudioALSAPlaybackHandlerBase: initBitConverter(), audio_format: 0x3 => 0x4, bcv_pcm_format = 0x3
01-10 13:51:40.300360   380  1535 D MtkAudioBitConverter: +open(), format 3, CH 2, SR 48000
01-10 13:51:40.300391   380  1535 D MtkAudioBitConverter: +resetBuffer()
01-10 13:51:40.300473   380   940 W DeviceHAL: Device set_mic_mute: Function not implemented
01-10 13:51:40.301162   380  1535 D AudioALSAHardwareResourceManager: +startOutputDevice(), new_devices = 0x2, mOutputDevices = 0x0, mStartOutputDevicesCount = 0 SampleRate = 48000
01-10 13:51:40.301313   380  1535 D AudioALSADriverUtility: GetPropertyValue key = af.resouce.extdac_support value = 0
01-10 13:51:40.301361   380  1535 D AudioALSADeviceConfigManager: ApplyDeviceTurnonSequenceByName() DeviceName = speaker_output descriptor->DeviceStatusCounte = 0
01-10 13:51:40.301990   532   532 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:40.302194   532   532 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:40.302602   380  1535 D AudioALSADeviceConfigManager: ApplyDeviceTurnonSequenceByName() DeviceName = ext_speaker_output descriptor->DeviceStatusCounte = 0
01-10 13:51:40.308389  1126  1273 D NetworkController: subscriptions is null
01-10 13:51:40.312447   986   986 D AudioService: applyDeviceVolumemStreamType:3,device:2
01-10 13:51:40.313171   986   986 D AudioService: applyDeviceVolumemStreamType:3,device:1073741824
01-10 13:51:40.314263   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.314429   538  1404 V APEExtractor: getAPEInfo not ape 20482
01-10 13:51:40.314572   538  1404 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:40.317577   986   986 D AudioService: applyDeviceVolumemStreamType:9,device:2
01-10 13:51:40.317942   986   986 D AudioService: applyDeviceVolumemStreamType:9,device:1073741824
01-10 13:51:40.318153   986   986 D AudioService: applyDeviceVolumemStreamType:10,device:2
01-10 13:51:40.325206   551  1525 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 13:51:40.325329   551  1525 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 13:51:40.325342   551  1525 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 13:51:40.325352   551  1525 I MtkCam/Utils: onCreate#03 pc 000f5983  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+406)
01-10 13:51:40.325361   551  1525 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 13:51:40.325371   551  1525 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 13:51:40.325380   551  1525 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 13:51:40.325389   551  1525 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 13:51:40.325630   986   986 D AudioService: applyDeviceVolumemStreamType:10,device:1073741824
01-10 13:51:40.325967   551  1525 E MtkCam/IonHeap: PDC_tbl_2@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 13:51:40.326151   551  1525 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 13:51:40.326804   986  1145 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 13:51:40.339489   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.339982   986  1537 I OMXClient: Treble IOmx obtained
01-10 13:51:40.340557   549  1475 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:40.343244   986  1537 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x74696f7000
01-10 13:51:40.343675   551  1525 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 13:51:40.343819   551  1525 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 13:51:40.343832   551  1525 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 13:51:40.343841   551  1525 I MtkCam/Utils: onCreate#03 pc 000f59bd  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+464)
01-10 13:51:40.343854   551  1525 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 13:51:40.343863   551  1525 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 13:51:40.343872   551  1525 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 13:51:40.343881   551  1525 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 13:51:40.343909   551  1525 E MtkCam/IonHeap: PDC_tbl_3@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 13:51:40.343983   551  1525 E MtkCam/BaseHeap: Unvalid Image Size(0x1) (onCreate){#327:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/BaseImageBufferHeap.cpp}
01-10 13:51:40.344573   549  1475 E OMXNodeInstance: getConfig(0xf3caad20:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 13:51:40.346882   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.347947   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.348030   528   921 D MtkAudioLoud: +close()
01-10 13:51:40.348114   528   921 D NVRAM   : getPlaybackPostProcessParameterFromXML Type/Name [5]/[PlaybackDRC]
01-10 13:51:40.348225   528   921 D NVRAM   : bes_loudness_L_hpf_fc = 0
01-10 13:51:40.348258   528   921 D NVRAM   : bes_loudness_L_hpf_order = 0
01-10 13:51:40.348279   528   921 D NVRAM   : bes_loudness_L_lpf_fc = 0
01-10 13:51:40.348295   528   921 D NVRAM   : bes_loudness_L_lpf_order = 0
01-10 13:51:40.348315   528   921 D NVRAM   : bes_loudness_R_hpf_fc = 0
01-10 13:51:40.348329   528   921 D NVRAM   : bes_loudness_R_hpf_order = 0
01-10 13:51:40.348343   528   921 D NVRAM   : bes_loudness_R_lpf_fc = 0
01-10 13:51:40.348357   528   921 D NVRAM   : bes_loudness_R_lpf_order = 0
01-10 13:51:40.348373   528   921 D NVRAM   : bes_loudness_Sep_LR_Filter = 0
01-10 13:51:40.348387   528   921 D NVRAM   : bes_loudness_WS_Gain_Max = 0
01-10 13:51:40.348415   528   921 D NVRAM   : bes_loudness_WS_Gain_Min = 0
01-10 13:51:40.348429   528   921 D NVRAM   : bes_loudness_Filter_First = 0
01-10 13:51:40.348443   528   921 D NVRAM   : bes_loudness_Num_Bands = 8
01-10 13:51:40.348457   528   921 D NVRAM   : bes_loudness_Flt_Bank_Order = 0
01-10 13:51:40.348477   528   921 D NVRAM   : DRC_Delay = 0
01-10 13:51:40.348496   528   921 D NVRAM   : Lim_Th = 32767
01-10 13:51:40.348508   528   921 D NVRAM   : Lim_Gn = 32767
01-10 13:51:40.348519   528   921 D NVRAM   : Lim_Const = 4
01-10 13:51:40.348530   528   921 D NVRAM   : Lim_Delay = 0
01-10 13:51:40.348542   528   921 D NVRAM   : SWIPRev = 0x520
01-10 13:51:40.348557   528   921 D NVRAM   : getPlaybackPostProcessParameterFromXML Parameter 5 returnValue 0
01-10 13:51:40.348623   528   921 D MtkAudioLoud: mIsZeroCoeff 1 mFilterType 5
01-10 13:51:40.348686   528   921 D MtkAudioLoud: setParameter 382 mInitParam.Initial_State 2
01-10 13:51:40.348698   528   921 D MtkAudioLoud: +open()
01-10 13:51:40.349142   528   921 D MtkAudioLoud: -open() result 0
01-10 13:51:40.349188   528   921 D MtkAudioLoud: +change2Normal()
01-10 13:51:40.349202   528   921 D MtkAudioLoud: -change2Normal()
01-10 13:51:40.351778   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.352890   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.353751   380  1535 D AudioVoiceUIDL: [GetSRCInputParameter] mOutputSampleRate 16000,  mInputSampleRate 48000, mInChannel 2, mOutChannel, 0 format 4
01-10 13:51:40.353903   380  1535 D AudioVoiceUIDL: [GetSRCInputParameter] create SRC handle fail
01-10 13:51:40.353922   380  1535 D AudioALSAPlaybackHandlerNormal: -open()
01-10 13:51:40.354018   380  1535 D AudioMTKFilter: AudioMTKFilter::start() type 0 mode 9 bFirstDataWrite 1
01-10 13:51:40.354079   380  1535 D MtkAudioLoud: setWorkMode(), chNum 2, sampleRate 48000, workMode 9 RampupEnable 0
01-10 13:51:40.354117   380  1535 D MtkAudioLoud: setParameter 382 mInitParam.Initial_State 0
01-10 13:51:40.354129   380  1535 D MtkAudioLoud: +open()
01-10 13:51:40.354233   380  1535 D MtkAudioLoud: -open() result 0
01-10 13:51:40.355120   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.357776   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.357846   550  1061 W hw-IPCThreadState: All binder threads in pool (2 threads) busy for 112 ms
01-10 13:51:40.358871   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.360056   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 1 line
01-10 13:51:40.361197   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.361674   550  1061 I Accelerometer: batch: handle:0, flag:0,samplingPeriodNs:20000000 maxBatchReportLatencyNs:0
01-10 13:51:40.362212   550  1061 I Accelerometer: enable: handle:0, en:1
01-10 13:51:40.362598   550  1061 E         : settings file open failed: -2 (No such file or directory)
01-10 13:51:40.362659   550  1061 E Accelerometer: MPE_acc_read_data_fail
01-10 13:51:40.363022   551  1525 I MtkCam/Utils: onCreate#00 pc 00006cc1  /vendor/lib/libmtkcam_stdutils.so (NSCam::Utils::dumpCallStack(char const*)+28)
01-10 13:51:40.363158   551  1525 I MtkCam/Utils: onCreate#01 pc 000102dd  /vendor/lib/libmtkcam_imgbuf.so (NSCam::NSImageBufferHeap::BaseImageBufferHeap::onCreate(NSCam::MSize const&, int, unsigned int, int)+188)
01-10 13:51:40.363173   551  1525 I MtkCam/Utils: onCreate#02 pc 00015d19  /vendor/lib/libmtkcam_imgbuf.so (NSCam::IIonImageBufferHeap::create(char const*, NSCam::IImageBufferAllocator::ImgParam const&, NSCam::IIonImageBufferHeap::AllocExtraParam const&, int)+56)
01-10 13:51:40.363183   551  1525 I MtkCam/Utils: onCreate#03 pc 000f59f3  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::ISP_MGR_BNR2::setBPCIBuf(CAMERA_BPCI_STRUCT_t*)+518)
01-10 13:51:40.363194   551  1525 I MtkCam/Utils: onCreate#04 pc 0011ec53  /vendor/lib/libcam.hal3a.v3.so (NSIspTuningv3::Paramctrl::sendIspTuningIOCtrl(unsigned int, int, int)+738)
01-10 13:51:40.363203   551  1525 I MtkCam/Utils: onCreate#05 pc 00090895  /vendor/lib/libcam.hal3a.v3.so (Hal3ARawImp::ThreadIspSetBpciTable(void*)+304)
01-10 13:51:40.363212   551  1525 I MtkCam/Utils: onCreate#06 pc 000475df  /system/lib/libc.so (__pthread_start(void*)+22)
01-10 13:51:40.363220   551  1525 I MtkCam/Utils: onCreate#07 pc 0001af55  /system/lib/libc.so (__start_thread+32)
01-10 13:51:40.363253   551  1525 E MtkCam/IonHeap: PDC_tbl_4@ onCreate (create){#336:vendor/mediatek/proprietary/hardware/mtkcam/utils/imgbuf/IonImageBufferHeap.cpp}
01-10 13:51:40.363361   551  1525 E isp_mgr_bnr: [PDC_tbl_1] ImageBufferHeap create fail (setBPCIBuf){#727:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/isp_mgr/isp_mgr_bnr.cpp}
01-10 13:51:40.363537   551  1516 I Drv/HWsync: Drv/HWsync[init] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(0)
01-10 13:51:40.363641   551  1516 I Drv/HWsync: Drv/HWsync[init] -
01-10 13:51:40.364355   986  1086 D WifiController: ApStaDisabledState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 13:51:40.364487   986  1086 D WifiController: DefaultState CMD_BATTERY_CHANGED{ when=-1ms what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 13:51:40.364443   551   864 I MtkCam/CamClient: (864)[uninit] + getStrongCount(1)
01-10 13:51:40.374005  1304  1304 W System.err: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 13:51:40.374327  1304  1304 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 13:51:40.374373  1304  1304 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 13:51:40.374394  1304  1304 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 13:51:40.374408  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.getRilOp(MtkRIL.java:467)
01-10 13:51:40.374423  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.registerForModulation(MtkRIL.java:1452)
01-10 13:51:40.374439  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkServiceStateTracker.updatePhoneType(MtkServiceStateTracker.java:503)
01-10 13:51:40.374458  1304  1304 W System.err: 	at com.android.internal.telephony.ServiceStateTracker.<init>(ServiceStateTracker.java:634)
01-10 13:51:40.374487  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkServiceStateTracker.<init>(MtkServiceStateTracker.java:429)
01-10 13:51:40.374505  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkTelephonyComponentFactory.makeServiceStateTracker(MtkTelephonyComponentFactory.java:193)
01-10 13:51:40.374521  1304  1304 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.<init>(GsmCdmaPhone.java:249)
01-10 13:51:40.374539  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.<init>(MtkGsmCdmaPhone.java:393)
01-10 13:51:40.374554  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.<init>(MtkGsmCdmaPhone.java:432)
01-10 13:51:40.374570  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkTelephonyComponentFactory.makePhone(MtkTelephonyComponentFactory.java:181)
01-10 13:51:40.374585  1304  1304 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhone(PhoneFactory.java:224)
01-10 13:51:40.374609  1304  1304 W System.err: 	at com.android.internal.telephony.PhoneFactory.makeDefaultPhones(PhoneFactory.java:131)
01-10 13:51:40.374624  1304  1304 W System.err: 	at com.android.phone.PhoneGlobals.onCreate(PhoneGlobals.java:370)
01-10 13:51:40.374637  1304  1304 W System.err: 	at com.android.phone.PhoneApp.onCreate(PhoneApp.java:43)
01-10 13:51:40.374653  1304  1304 W System.err: 	at android.app.Instrumentation.callApplicationOnCreate(Instrumentation.java:1119)
01-10 13:51:40.374672  1304  1304 W System.err: 	at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5781)
01-10 13:51:40.374723  1304  1304 W System.err: 	at android.app.ActivityThread.-wrap1(Unknown Source:0)
01-10 13:51:40.374741  1304  1304 W System.err: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1690)
01-10 13:51:40.374756  1304  1304 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:40.374770  1304  1304 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:40.374784  1304  1304 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 13:51:40.374800  1304  1304 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 13:51:40.374831  1304  1304 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 13:51:40.374855  1304  1304 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 13:51:40.374822   551   864 W MtkCam/CamClient/FDClient: (864)[stopFaceDetection] FD was not running
01-10 13:51:40.374990   551   864 I MtkCam/CamClient: (864)[uninit] - getStrongCount(1)
01-10 13:51:40.375143  1304  1304 W System.err: Caused by: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 13:51:40.375178  1304  1304 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 13:51:40.375195  1304  1304 W System.err: 	at java.lang.BootClassLoader.findClass(ClassLoader.java:1355)
01-10 13:51:40.375209  1304  1304 W System.err: 	at java.lang.BootClassLoader.loadClass(ClassLoader.java:1415)
01-10 13:51:40.375223  1304  1304 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 13:51:40.375235  1304  1304 W System.err: 	... 27 more
01-10 13:51:40.375280  1304  1304 W System.err: Caused by: java.lang.NoClassDefFoundError: Class not found using the boot class loader; no stack trace available
01-10 13:51:40.375327   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 13:51:40.376104   397   413 I libPerfService: 39: legacy set freq: -1 -1 -1 -1
01-10 13:51:40.381974   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.384719   986   986 D MediaPlayer: handleMessage msg:(1, 0, 0)
01-10 13:51:40.385742   527   558 D AAL     : 01-10 01:51:40.156 BL= 381,ESS= 256, 01-10 01:51:40.193 BL= 382,ESS= 256, 01-10 01:51:40.269 BL= 383,ESS= 256, 01-10 01:51:40.307 BL= 384,ESS= 256, 01-10 01:51:40.385 BL= 385,ESS= 256, 
01-10 13:51:40.386825   551   864 W aaa_state_mgr: [StateCommon::transitState] StateInit --> StateUninit
01-10 13:51:40.386927   551   864 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_AE,2),srIdxNum(1)
01-10 13:51:40.386959   551   864 I Drv/HWsync: Drv/HWsync[uninit] mAECyclePeriod(-1)
01-10 13:51:40.386968   551   864 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 13:51:40.387852   986   986 V MediaRouter: onRestoreRoute() : route=RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 13:51:40.388032   986   986 V MediaRouter: Selecting route: RouteInfo{ name=手机, description=null, status=null, category=RouteCategory{ name=系统 types=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO  groupable=false }, supportedTypes=ROUTE_TYPE_LIVE_AUDIO ROUTE_TYPE_LIVE_VIDEO , presentationDisplay=null }
01-10 13:51:40.388929   986  1086 D WifiController: ApStaDisabledState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 13:51:40.389029   986  1086 D WifiController: DefaultState CMD_BATTERY_CHANGED{ when=0 what=155652 arg1=2 target=com.android.internal.util.StateMachine$SmHandler }
01-10 13:51:40.402614   550   550 I Accelerometer: enable: handle:0, en:0
01-10 13:51:40.404571   986   986 D MediaSessionService: Media button session is changed to com.android.server.telecom/HeadsetMediaButton (userId=0)
01-10 13:51:40.405353   986  1145 V NuMediaExtractor: setDataSource fd=198 (/system/media/audio/ui/KeypressReturn.ogg), offset=0, length=6246
01-10 13:51:40.405937   986   986 D MediaSessionService: Global priority session is changed from null to com.android.server.telecom/HeadsetMediaButton (userId=0)
01-10 13:51:40.406062   986   986 D MediaSessionService: Media button session is changed to null
01-10 13:51:40.406162   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.406620   532   532 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:40.407045   532   532 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:40.410090   532   532 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:40.410408   532   532 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:40.414890   538  1404 V APEExtractor: getAPEInfo not ape 20483
01-10 13:51:40.414996   538  1404 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:40.416660   986   986 D LocationProviderProxy-fused: ComponentInfo{com.android.location.fused/com.android.location.fused.FusedLocationService} connected
01-10 13:51:40.420500   986  1145 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 13:51:40.422593   986   986 D MtkEapSimUtility: onReceive ACTION_SIM_STATE_CHANGED iccState: NOT_READY, simSlot: 0
01-10 13:51:40.423070   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.423124   986   986 D MediaPlayer: handleMessage msg:(6, 0, 0)
01-10 13:51:40.425798   986  1556 I OMXClient: Treble IOmx obtained
01-10 13:51:40.426273   549  1161 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:40.428408   986  1556 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x747065fc00
01-10 13:51:40.429014   549  1161 E OMXNodeInstance: getConfig(0xf3caad20:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 13:51:40.430934   986   986 I FusedLocation: engine started (com.android.location.fused)
01-10 13:51:40.433392   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.438222   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 3 lines
01-10 13:51:40.440942   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.443103   550  1061 I Gyroscope: enable: handle:3, en:0
01-10 13:51:40.443265   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.443712  1540  1540 D PPL/PlatformManager: SIM_NUMBER=1
01-10 13:51:40.444147   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.444938   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.447725   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.458420  1540  1540 I PPL/PlatformManager: Bring service to foreground
01-10 13:51:40.464464   986  1099 D NotificationSQLiteLog: Pruned event entries: 9
01-10 13:51:40.464730   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.472701   546   582 I PPL/PPLAgent: checkCallerUidPermission(code:1,  uid:1000)
01-10 13:51:40.472872   546   582 I PPL/PPLAgent: OnTransact(1,16)
01-10 13:51:40.472936   546   582 I PPL/PPLAgent: readControlData enter
01-10 13:51:40.472983   546   582 W Parcel  : **** enforceInterface() expected 'PPLAgent' but read 'com.mediatek.internal.telephony.ppl.IPplAgent'
01-10 13:51:40.473031   546   582 I PPL/PPLAgent: enforceInterface fail
01-10 13:51:40.473049   546   582 I PPL/PPLAgent: readControlData enter
01-10 13:51:40.477024   546   582 D PPL/PPLAgent: open control data file error = No such file or directory
01-10 13:51:40.477143   546   582 I PPL/PPLAgent: readControlData exit
01-10 13:51:40.477493  1540  1540 W PPL/ControlData: buildControlData: data is empty, return empty instance
01-10 13:51:40.477678  1540  1540 D PPL/PPLManager: mCache.status = 0
01-10 13:51:40.478518  1540  1540 D PPL/PPLService: onStartCommand(Intent { act=android.intent.action.SIM_STATE_CHANGED flg=0x5000010 cmp=com.mediatek.ppl/.PplService (has extras) })
01-10 13:51:40.478697  1540  1540 D PPL/PPLService: action is android.intent.action.SIM_STATE_CHANGED
01-10 13:51:40.478754  1540  1540 I PPL/PPLService: Privacy Protection Lock is disabled. Exit.
01-10 13:51:40.483153  1540  1540 D PPL/PlatformManager: Exec stopForeground with para true.
01-10 13:51:40.490183   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.495434   986  1145 V NuMediaExtractor: setDataSource fd=199 (/system/media/audio/ui/KeypressInvalid.ogg), offset=0, length=9847
01-10 13:51:40.496399   532   532 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:40.496653   532   532 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:40.498848   532   532 D DrmMtkUtil: getProcessName() : path : [/proc/986/cmdline]
01-10 13:51:40.499162   532   532 D DrmMtkUtil/WhiteList: IsDrmTrustedClient: deny client[system_server] access drm
01-10 13:51:40.503176   538  1404 V APEExtractor: getAPEInfo not ape 20483
01-10 13:51:40.503313   538  1404 D MediaExtractor: Autodetected media content as 'application/ogg' with confidence 0.20
01-10 13:51:40.506613   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.507635   986  1145 V NuMediaExtractor: track of type 'audio/vorbis' does not publish bitrate
01-10 13:51:40.512327   986  1563 I OMXClient: Treble IOmx obtained
01-10 13:51:40.512834   549  1161 I OMXMaster: makeComponentInstance(OMX.google.vorbis.decoder) in omx@1.0-service process
01-10 13:51:40.515788   986  1563 D MtkACodec: setupAudioCodec: mime audio/vorbis, encoder 0, msg.get() 0x7469f17400
01-10 13:51:40.517087   549  1161 E OMXNodeInstance: getConfig(0xf3caad20:google.vorbis.decoder, ConfigAndroidVendorExtension(0x6f100004)) ERROR: Undefined(0x80001001)
01-10 13:51:40.520021   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.522208   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 2 lines
01-10 13:51:40.523136   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.525646   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.526148   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.539675   378   378 I chatty  : uid=1000(system) allocator@1.0-s identical 6 lines
01-10 13:51:40.540337   378   378 W /system/bin/hw/android.hidl.allocator@1.0-service: ashmem_create_region(32768) returning hidl_memory(0x7d3a82b5f0, 32768)
01-10 13:51:40.548647   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.558956   551   864 D AppTsf  : [TsfExit] TsfExit
01-10 13:51:40.559082   551   864 D AppTsf  : [~AppTsf] destructor
01-10 13:51:40.559104   551   864 D tsf_core: [~TsfCore] destructor
01-10 13:51:40.560657   551   864 I Drv/HWsync: Drv/HWsync[uninit] +, user&cnt(HW_SYNC_USER_HALSENSOR,1),srIdxNum(1)
01-10 13:51:40.560796   551   864 I Drv/HWsync: Drv/HWsync[uninit] idx(0,remain_0),tg(0)
01-10 13:51:40.560815   551   864 W Drv/HWsync: Drv/HWsync[uninit] WARNING: wtginf, sindex(0x0),tg(0x0)
01-10 13:51:40.560827   551   864 I Drv/HWsync: Drv/HWsync[uninit] -
01-10 13:51:40.560954   551   864 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11)
01-10 13:51:40.561007   551   864 D SeninfDrvImp: [setMclk1][setTg1Phase]pcEn(0), clkPol(0), mMclk1User(0), TimestampClk(11), SENINF_TG1_PH_CNT(0x5)
01-10 13:51:40.564497   551   864 D ImgSensorDrv: [uninit][uninit] imgsensor_drv 0
01-10 13:51:40.564718   551   864 D SeninfDrvImp: [uninit][uninit]: 1 
01-10 13:51:40.564847   551   864 D SeninfDrvImp: [uninit][uninit]: 0, mfd(16) 
01-10 13:51:40.566851   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.568763   551   864 I mtkcam-devicemgr: [detachOpenDeviceLocked] device: device@1.0/internal/0 openTimestamp:01-10 13:51:40.226
01-10 13:51:40.569247   531   713 I CameraProviderManager: Camera device device@1.0/internal/0 torch status is now AVAILABLE_OFF
01-10 13:51:40.569457   531   713 I CameraService: onTorchStatusChangedLocked: Torch status changed for cameraId=0, newStatus=1
01-10 13:51:40.569838   551   864 I mtkcam-camprovider: [onTorchModeStatusChange] device@1.0/internal/0 TorchModeStatus:1
01-10 13:51:40.570022   551   864 I mtkcam-dev1: 0[CameraDevice1Base::close] Del cameraId 0 - 0xebe30600, this - 0xebe30600
01-10 13:51:40.570108   551   864 I mtkcam-dev1: 0[CameraDevice1Base::close] -
01-10 13:51:40.570387   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:39
01-10 13:51:40.570979   531   713 I CameraHardwareInterface: Destroying camera 0
01-10 13:51:40.572462   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:39
01-10 13:51:40.572617   397   413 I libPerfService: perfUserUnregScn - handle:39
01-10 13:51:40.573376   531   713 I CameraService: disconnect: Disconnected client for camera 0 for PID 531
01-10 13:51:40.573547   531   713 V DL-NativeProxy: Resume requested start
01-10 13:51:40.573668   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:39
01-10 13:51:40.574088   531   713 W DL-NativeProxy: Cannot connect to the scanner service
01-10 13:51:40.574132   531   713 W DL-NativeProxy: Cannot resume scanner, service is not alive
01-10 13:51:40.574156   531   713 W CameraService: camera_interop: suspendResume failure on dlservice module, error -2147483648
01-10 13:51:40.574491   540   540 D NuPlayerDriver: reset(0xeb4b01c0) at state 4
01-10 13:51:40.574654   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnUnreg hdl:-1
01-10 13:51:40.574738   540   540 D NuPlayerDriver: notifyListener_l(0xeb4b01c0), (8, 0, 0, -1), loop setting(0, 0)
01-10 13:51:40.574791   540   540 D GenericSource: disconnect: mDataSource 0xebc9aa00 mHttpSource 0x0
01-10 13:51:40.574958   397   413 I powerd  : [powerd_req] POWER_MSG_SCN_UNREG: hdl:-1
01-10 13:51:40.575009   397   413 I libPerfService: perfUserUnregScn - handle:-1
01-10 13:51:40.575108   540  1508 D NuPlayerDriver: notifyResetComplete(0xeb4b01c0)
01-10 13:51:40.575799   397   414 I vendor.mediatek.hardware.power@1.1-impl: scnDisable hdl:-1
01-10 13:51:40.577197   528  1506 D APM_AudioPolicyManager: setForceUse() usage 0, config 0, mPhoneState 0
01-10 13:51:40.577345   540  1568 D NuPlayerDriver: reset(0xeb4b02a0) at state 4
01-10 13:51:40.577560   528  1506 D APM_AudioPolicyManager: setForceUse() usage 2, config 0, mPhoneState 0
01-10 13:51:40.577562   540  1568 D NuPlayerDriver: notifyListener_l(0xeb4b02a0), (8, 0, 0, -1), loop setting(0, 0)
01-10 13:51:40.577601   540  1568 D GenericSource: disconnect: mDataSource 0xebc9ab00 mHttpSource 0x0
01-10 13:51:40.577827   528  1506 D APM_AudioPolicyManager: setForceUse() usage 3, config 8, mPhoneState 0
01-10 13:51:40.577890   540  1523 D NuPlayerDriver: notifyResetComplete(0xeb4b02a0)
01-10 13:51:40.577977   528  1506 D APM_AudioPolicyManager: setForceUse() usage 6, config 0, mPhoneState 0
01-10 13:51:40.578794   540  1568 D NuPlayerDriver: reset(0xeb4b0700) at state 4
01-10 13:51:40.579062   540  1568 D NuPlayerDriver: notifyListener_l(0xeb4b0700), (8, 0, 0, -1), loop setting(0, 0)
01-10 13:51:40.579118   540  1568 D GenericSource: disconnect: mDataSource 0xebc9ac00 mHttpSource 0x0
01-10 13:51:40.579792   540  1532 D NuPlayerDriver: notifyResetComplete(0xeb4b0700)
01-10 13:51:40.590753   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.591340   986   986 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 13:51:40.594256   986  1000 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 13:51:40.608603   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.627776   527   558 D AAL     : 01-10 01:51:40.420 BL= 386,ESS= 256, 01-10 01:51:40.476 BL= 385,ESS= 256, 01-10 01:51:40.514 BL= 384,ESS= 256, 01-10 01:51:40.590 BL= 383,ESS= 256, 01-10 01:51:40.627 BL= 382,ESS= 256, 
01-10 13:51:40.632734   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.658170   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.663150  1126  1135 D Camera  : Camera release.
01-10 13:51:40.674526   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.692470   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.695077  1304  1304 D ImsExternalCallTracker: Registering: Handler (com.mediatek.internal.telephony.imsphone.MtkImsPhone) {ed867aa}
01-10 13:51:40.716310   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.720815  1304  1304 D OpImsPhoneCallTrackerBase: initRtt call to op base
01-10 13:51:40.728312  1304  1569 W Binder  : Binder call failed.
01-10 13:51:40.728312  1304  1569 W Binder  : java.lang.NullPointerException: Attempt to get length of null array
01-10 13:51:40.728312  1304  1569 W Binder  : 	at com.android.internal.telephony.SubscriptionMonitor$1.onSubscriptionsChanged(SubscriptionMonitor.java:113)
01-10 13:51:40.728312  1304  1569 W Binder  : 	at com.android.internal.telephony.IOnSubscriptionsChangedListener$Stub.onTransact(IOnSubscriptionsChangedListener.java:48)
01-10 13:51:40.728312  1304  1569 W Binder  : 	at android.os.Binder.execTransact(Binder.java:697)
01-10 13:51:40.732932  1304  1304 D PhoneSwitcherNetworkRequstListener: Registering NetworkFactory
01-10 13:51:40.734492   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.758198  1126  1126 D QSTileHost: loadTileSpecs() default tile list: wifi,bt,dnd,flashlight,rotation,battery,cell,airplane,cast
01-10 13:51:40.758502   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.768800  1126  1273 D NetworkController: subscriptions is null
01-10 13:51:40.770308  1126  1273 D NetworkController: updateMobileControllers detectedType: 4
01-10 13:51:40.773512  1126  1273 W Tile.BluetoothTile: Error in handleSetListening
01-10 13:51:40.773512  1126  1273 W Tile.BluetoothTile: java.lang.NullPointerException: Attempt to invoke interface method 'void com.android.systemui.statusbar.policy.BluetoothController.addCallback(java.lang.Object)' on a null object reference
01-10 13:51:40.773512  1126  1273 W Tile.BluetoothTile: 	at com.android.systemui.qs.tiles.BluetoothTile.handleSetListening(BluetoothTile.java:81)
01-10 13:51:40.773512  1126  1273 W Tile.BluetoothTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:468)
01-10 13:51:40.773512  1126  1273 W Tile.BluetoothTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:40.773512  1126  1273 W Tile.BluetoothTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:40.773512  1126  1273 W Tile.BluetoothTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 13:51:40.774030  1126  1273 W Tile.BluetoothTile: Error in handleRefreshState
01-10 13:51:40.774030  1126  1273 W Tile.BluetoothTile: java.lang.NullPointerException: Attempt to invoke interface method 'boolean com.android.systemui.statusbar.policy.BluetoothController.isBluetoothEnabled()' on a null object reference
01-10 13:51:40.774030  1126  1273 W Tile.BluetoothTile: 	at com.android.systemui.qs.tiles.BluetoothTile.handleUpdateState(BluetoothTile.java:122)
01-10 13:51:40.774030  1126  1273 W Tile.BluetoothTile: 	at com.android.systemui.qs.tiles.BluetoothTile.handleUpdateState(BluetoothTile.java:120)
01-10 13:51:40.774030  1126  1273 W Tile.BluetoothTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl.handleRefreshState(QSTileImpl.java:289)
01-10 13:51:40.774030  1126  1273 W Tile.BluetoothTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:447)
01-10 13:51:40.774030  1126  1273 W Tile.BluetoothTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:40.774030  1126  1273 W Tile.BluetoothTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:40.774030  1126  1273 W Tile.BluetoothTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 13:51:40.774082  1304  1572 I MTKDefaultSmsSimSettings: oldSmsDefaultSIM1
01-10 13:51:40.774183  1304  1572 I MTKDefaultSmsSimSettings: subInfos == null, return
01-10 13:51:40.775611   986   986 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 13:51:40.776940   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.779199  1304  1577 W CallerInfoCache: cursor is null
01-10 13:51:40.781249   986  1000 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 13:51:40.783754  1126  1273 D NetworkController: subscriptions is null
01-10 13:51:40.784381  1126  1126 D LocalBluetoothProfileManager: Adding local MAP profile
01-10 13:51:40.784925  1126  1273 D NetworkController: updateMobileControllers detectedType: 4
01-10 13:51:40.786914  1126  1273 D NetworkController: isEmergencyOnly No sims 
01-10 13:51:40.787257  1126  1126 D BluetoothMap: Create BluetoothMap proxy object
01-10 13:51:40.788157  1304  1304 E MtkPhoneIntfMgrEx: [updateUserCustomizedEccList] mUserCustomizedEccList: []
01-10 13:51:40.788302  1304  1304 E MtkPhoneIntfMgrEx: publish: com.mediatek.phone.MtkPhoneInterfaceManagerEx@bd95305
01-10 13:51:40.791197  1126  1273 D NetworkController: isEmergencyOnly No sims 
01-10 13:51:40.795965  1126  1126 D LocalBluetoothProfileManager: LocalBluetoothProfileManager construction complete
01-10 13:51:40.800097   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.800708  1126  1273 W Tile.DndTile: Error in handleSetListening
01-10 13:51:40.800708  1126  1273 W Tile.DndTile: java.lang.NullPointerException: Attempt to invoke interface method 'void com.android.systemui.statusbar.policy.ZenModeController.addCallback(java.lang.Object)' on a null object reference
01-10 13:51:40.800708  1126  1273 W Tile.DndTile: 	at com.android.systemui.qs.tiles.DndTile.handleSetListening(DndTile.java:239)
01-10 13:51:40.800708  1126  1273 W Tile.DndTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:468)
01-10 13:51:40.800708  1126  1273 W Tile.DndTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:40.800708  1126  1273 W Tile.DndTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:40.800708  1126  1273 W Tile.DndTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 13:51:40.801291  1126  1273 W Tile.DndTile: Error in handleRefreshState
01-10 13:51:40.801291  1126  1273 W Tile.DndTile: java.lang.NullPointerException: Attempt to invoke interface method 'int com.android.systemui.statusbar.policy.ZenModeController.getZen()' on a null object reference
01-10 13:51:40.801291  1126  1273 W Tile.DndTile: 	at com.android.systemui.qs.tiles.DndTile.handleUpdateState(DndTile.java:177)
01-10 13:51:40.801291  1126  1273 W Tile.DndTile: 	at com.android.systemui.qs.tiles.DndTile.handleUpdateState(DndTile.java:175)
01-10 13:51:40.801291  1126  1273 W Tile.DndTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl.handleRefreshState(QSTileImpl.java:289)
01-10 13:51:40.801291  1126  1273 W Tile.DndTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:447)
01-10 13:51:40.801291  1126  1273 W Tile.DndTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:40.801291  1126  1273 W Tile.DndTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:40.801291  1126  1273 W Tile.DndTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 13:51:40.809741  1304  1304 D CarrierConfigLoader: CarrierConfigLoader has started
01-10 13:51:40.810375  1126  1273 W Tile.CellularTile: Error in handleSetListening
01-10 13:51:40.810375  1126  1273 W Tile.CellularTile: java.lang.NullPointerException: Attempt to invoke interface method 'void com.android.systemui.statusbar.policy.NetworkController.addCallback(com.android.systemui.statusbar.policy.NetworkController$SignalCallback)' on a null object reference
01-10 13:51:40.810375  1126  1273 W Tile.CellularTile: 	at com.android.systemui.qs.tiles.CellularTile.handleSetListening(CellularTile.java:120)
01-10 13:51:40.810375  1126  1273 W Tile.CellularTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:468)
01-10 13:51:40.810375  1126  1273 W Tile.CellularTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:40.810375  1126  1273 W Tile.CellularTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:40.810375  1126  1273 W Tile.CellularTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 13:51:40.810399  1126  1126 I DefaultQuickSettingsPlugin: customizeDisplayDataUsage, return isDisplay = false
01-10 13:51:40.818278  1126  1273 W Tile.CastTile: Error in handleRefreshState
01-10 13:51:40.818278  1126  1273 W Tile.CastTile: java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Set com.android.systemui.statusbar.policy.CastController.getCastDevices()' on a null object reference
01-10 13:51:40.818278  1126  1273 W Tile.CastTile: 	at com.android.systemui.qs.tiles.CastTile.handleUpdateState(CastTile.java:196)
01-10 13:51:40.818278  1126  1273 W Tile.CastTile: 	at com.android.systemui.qs.tiles.CastTile.handleUpdateState(CastTile.java:191)
01-10 13:51:40.818278  1126  1273 W Tile.CastTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl.handleRefreshState(QSTileImpl.java:289)
01-10 13:51:40.818278  1126  1273 W Tile.CastTile: 	at com.android.systemui.qs.tileimpl.QSTileImpl$H.handleMessage(QSTileImpl.java:447)
01-10 13:51:40.818278  1126  1273 W Tile.CastTile: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:40.818278  1126  1273 W Tile.CastTile: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:40.818278  1126  1273 W Tile.CastTile: 	at android.os.HandlerThread.run(HandlerThread.java:65)
01-10 13:51:40.818728   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.823531  1304  1304 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 13:51:40.830917  1304  1304 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:40.831047  1304  1304 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01TeleService.apk:com.mediatek.op01.phone.plugin.Op01PhoneCustomizationFactory:com.mediatek.op01.phone.plugin)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02TeleService.apk:com.mediatek.phone.op02.plugin.Op02PhoneCustomizationFactory:com.mediatek.phone.op02.plugin)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP03_null_null:OP03TeleService.apk:com.mediatek.op03.phone.Op03PhoneCustomizationFactory:com.mediatek.op03.phone)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP05_null_null:OP05TeleService.apk:com.mediatek.op05.phone.Op05PhoneCustomizationFactory:com.mediatek.op05.phone)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP06_null_null:OP06TeleService.apk:com.mediatek.op06.phone.Op06PhoneCustomizationFactory:com.mediatek.op06.phone)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07TeleService.apk:com.mediatek.op07.phone.OP07PhoneCustomizationFactory:com.mediatek.op07.phone)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP08_null_null:OP08TeleService.apk:com.mediatek.op08.phone.Op08PhoneCustomizationFactory:com.mediatek.op08.phone)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09TeleService.apk:com.mediatek.phone.op09.plugin.Op09PhoneCustomizationFactory:com.mediatek.phone.op09.plugin)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 8: OperatorFactoryInfo(OP09_null_SEGC:OP09ClibTeleService.apk:com.mediatek.phone.op09Clib.plugin.Op09ClibPhoneCustomizationFactory:com.mediatek.phone.op09Clib.plugin)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 9: OperatorFactoryInfo(OP11_null_null:OP11TeleService.apk:com.mediatek.op11.phone.Op11PhoneCustomizationFactory:com.mediatek.op11.phone)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 10: OperatorFactoryInfo(OP12_null_null:OP12TeleService.apk:com.mediatek.op12.phone.Op12PhoneCustomizationFactory:com.mediatek.op12.phone)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 11: OperatorFactoryInfo(OP15_null_null:OP15TeleService.apk:com.mediatek.op15.phone.Op15PhoneCustomizationFactory:com.mediatek.op15.phone)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 12: OperatorFactoryInfo(OP16_null_null:OP16TeleService.apk:com.mediatek.op16.phone.Op16PhoneCustomizationFactory:com.mediatek.op16.phone)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 13: OperatorFactoryInfo(OP18_null_null:OP18TeleService.apk:com.mediatek.op18.phone.Op18PhoneCustomizationFactory:com.mediatek.op18.phone)
01-10 13:51:40.831568  1304  1304 E OperatorCustomizationFactoryLoader: 14: OperatorFactoryInfo(OP112_null_null:OP112TeleService.apk:com.mediatek.op112.phone.Op112PhoneCustomizationFactory:com.mediatek.op112.phone)
01-10 13:51:40.832128  1304  1304 D ExtensionManager: [sSsRoamingServiceExt] create ext instance: com.mediatek.phone.ext.DefaultSsRoamingServiceExt@b038f67
01-10 13:51:40.836697  1304  1304 D CdmaVolteServiceChecker: updateState, checking = false
01-10 13:51:40.838483  1304  1304 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 13:51:40.838587  1304  1304 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 13:51:40.838655  1304  1304 D PhoneGlobals: registerSubInfoRecordIntent
01-10 13:51:40.839788  1304  1580 D PhoneGlobals: Start Sim Select Service
01-10 13:51:40.842271   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.844260  1340  1340 D UtilsExt: file in /vendor/etc/disableapplist.txt does not exist!
01-10 13:51:40.845498  1126  1376 D OpenGLRenderer: profile bars disabled
01-10 13:51:40.846457  1304  1304 W ImsPhoneCallTracker: ImsManager is null when setting TTY mode
01-10 13:51:40.846464  1126  1376 D OpenGLRenderer: ambientRatio = 1.50
01-10 13:51:40.846897  1340  1340 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:40.847027  1340  1340 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(OP01_null_null:OP01Settings.apk:com.mediatek.settings.op01.Op01SettingsCustomizationFactory:com.mediatek.settings.op01)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 1: OperatorFactoryInfo(OP02_null_null:OP02Settings.apk:com.mediatek.settings.op02.Op02SettingsCustomizationFactory:com.mediatek.settings.op02)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 2: OperatorFactoryInfo(OP03_null_SEGDEFAULT:OP03Settings.apk:com.mediatek.op03.settings.OP03SettingsCustomizationFactory:com.mediatek.op03.settings)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 3: OperatorFactoryInfo(OP06_null_SEGDEFAULT:OP06Settings.apk:com.mediatek.op06.settings.Op06SettingsCustomizationFactory:com.mediatek.op06.settings)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 4: OperatorFactoryInfo(OP07_null_SEGDEFAULT:OP07Settings.apk:com.mediatek.op07.settings.OP07SettingsCustomizationFactory:com.mediatek.op07.settings)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 5: OperatorFactoryInfo(OP08_null_SEGDEFAULT:OP08Settings.apk:com.mediatek.op08.settings.Op08SettingsCustomizationFactory:com.mediatek.op08.settings)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 6: OperatorFactoryInfo(OP09_null_SEGDEFAULT:OP09AlibSettings.apk:com.mediatek.settings.op09alib.Op09AlibSettingsCustomizationFactory:com.mediatek.settings.op09alib)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 7: OperatorFactoryInfo(OP09_null_SEGC:OP09ClibSettings.apk:com.mediatek.settings.op09clib.Op09ClibSettingsCustomizationFactory:com.mediatek.settings.op09clib)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 8: OperatorFactoryInfo(OP12_null_null:OP12Settings.apk:com.mediatek.op12.settings.Op12SettingsCustomizationFactory:com.mediatek.op12.settings)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 9: OperatorFactoryInfo(OP16_null_SEGDEFAULT:OP16Settings.apk:com.mediatek.op16.settings.Op16SettingsCustomizationFactory:com.mediatek.op16.settings)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 10: OperatorFactoryInfo(OP18_null_SEGDEFAULT:OP18Settings.apk:com.mediatek.op18.settings.OP18SettingsCustomizationFactory:com.mediatek.op18.settings)
01-10 13:51:40.847675  1340  1340 E OperatorCustomizationFactoryLoader: 11: OperatorFactoryInfo(OP20_null_SEGDEFAULT:OP20Settings.apk:com.mediatek.op20.settings.OP20SettingsCustomizationFactory:com.mediatek.op20.settings)
01-10 13:51:40.848102  1126  1126 D WindowClient: Add to mViews: com.android.systemui.statusbar.phone.StatusBarWindowView{f485c6d V.E...... ......I. 0,0-0,0}, this = android.view.WindowManagerGlobal@1e54807
01-10 13:51:40.848617  1340  1340 D UtilsExt: [getSimManagementExt] create ext instance: com.mediatek.settings.ext.DefaultSimManagementExt@c44de7a
01-10 13:51:40.848760  1304  1304 D ExtensionManager: [sDigitsUtilExt] create ext instance: com.mediatek.phone.ext.DefaultDigitsUtilExt@3232fb2
01-10 13:51:40.849458  1126  1126 D ViewRootImpl[StatusBar]: hardware acceleration = true , fakeHwAccelerated = false, sRendererDisabled = false, forceHwAccelerated = false, sSystemRendererDisabled = false
01-10 13:51:40.850345  1340  1340 D SimSelectService: onCreate
01-10 13:51:40.851047  1340  1340 D SimSelectService: onReceive action=android.intent.action.ACTION_SUBINFO_RECORD_UPDATED
01-10 13:51:40.851420  1340  1340 D UtilsExt: autoSanity: false buildType: user
01-10 13:51:40.852168  1340  1340 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 13:51:40.856997  1340  1340 D SimSelectService: sub info update, type = 4, subs = null
01-10 13:51:40.857132  1340  1340 D SimSelectService: extra value no change, return
01-10 13:51:40.858319  1126  1126 D StatusBar: disable<e i a s b h r c s q >
01-10 13:51:40.860424  1304  1304 W System.err: java.lang.ClassNotFoundException: cn.richinfo.dm.CtmApplication
01-10 13:51:40.860603   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.860668  1304  1304 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 13:51:40.860715  1304  1304 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 13:51:40.860732  1304  1304 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 13:51:40.860755  1304  1304 W System.err: 	at com.mediatek.phone.ext.ExtensionManager.initPhoneHelper(ExtensionManager.java:287)
01-10 13:51:40.860769  1304  1304 W System.err: 	at com.android.phone.PhoneApp.onCreate(PhoneApp.java:48)
01-10 13:51:40.860783  1304  1304 W System.err: 	at android.app.Instrumentation.callApplicationOnCreate(Instrumentation.java:1119)
01-10 13:51:40.860800  1304  1304 W System.err: 	at android.app.ActivityThread.handleBindApplication(ActivityThread.java:5781)
01-10 13:51:40.860816  1304  1304 W System.err: 	at android.app.ActivityThread.-wrap1(Unknown Source:0)
01-10 13:51:40.860841  1304  1304 W System.err: 	at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1690)
01-10 13:51:40.860857  1304  1304 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:40.860871  1304  1304 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:40.860887  1304  1304 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 13:51:40.860900  1304  1304 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 13:51:40.860918  1304  1304 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 13:51:40.860933  1304  1304 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 13:51:40.861210  1304  1304 W System.err: Caused by: java.lang.ClassNotFoundException: Didn't find class "cn.richinfo.dm.CtmApplication" on path: DexPathList[[zip file "/system/priv-app/MtkTeleService/MtkTeleService.apk"],nativeLibraryDirectories=[/system/priv-app/MtkTeleService/lib/arm64, /system/lib64, /vendor/lib64, /system/lib64, /vendor/lib64]]
01-10 13:51:40.861285  1304  1304 W System.err: 	at dalvik.system.BaseDexClassLoader.findClass(BaseDexClassLoader.java:125)
01-10 13:51:40.861310  1304  1304 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:379)
01-10 13:51:40.861325  1304  1304 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 13:51:40.861338  1304  1304 W System.err: 	... 15 more
01-10 13:51:40.866687  1304  1304 D ImsResolver: maybeAddedImsService, packageName: null
01-10 13:51:40.880514  1304  1304 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 13:51:40.883732   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.886201  1126  1126 D PhoneStatusBarPolicy: registerAlarmClockChanged:0
01-10 13:51:40.891804   527   558 D AAL     : 01-10 01:51:40.684 BL= 381,ESS= 256, 01-10 01:51:40.722 BL= 380,ESS= 256, 01-10 01:51:40.778 BL= 379,ESS= 256, 01-10 01:51:40.837 BL= 378,ESS= 256, 01-10 01:51:40.891 BL= 377,ESS= 256, 
01-10 13:51:40.902348   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.908074  1304  1304 D IntentBroadcaster: Broadcasting and adding intent for rebroadcast: android.intent.action.SIM_STATE_CHANGED UNKNOWN for slotId 0
01-10 13:51:40.911207   986   986 D MtkEapSimUtility: onReceive ACTION_SIM_STATE_CHANGED iccState: UNKNOWN, simSlot: 0
01-10 13:51:40.913061  1288  1288 D ImsConfigReceiver: Update LatestSimState, phoneId = 0, state = UNKNOWN
01-10 13:51:40.913179  1288  1288 D ImsConfigReceiver: Sim state changed, event = UNKNOWN, reset broadcast flag
01-10 13:51:40.913366  1288  1288 D ImsVT Util: Received ACTION_SIM_STATE_CHANGED, slotId:0, simState:UNKNOWN
01-10 13:51:40.914564  1126  1126 D StatusBar: heads up is enabled
01-10 13:51:40.918280  1126  1273 D NetworkController: subscriptions is null
01-10 13:51:40.920023   401   519 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=23.87 dur=1005.56 max=52.49 min=30.85
01-10 13:51:40.920894  1304  1304 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 13:51:40.924651  1304  1304 W System.err: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 13:51:40.924896  1304  1304 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 13:51:40.924928  1304  1304 W System.err: 	at java.lang.Class.forName(Class.java:453)
01-10 13:51:40.924943  1304  1304 W System.err: 	at java.lang.Class.forName(Class.java:378)
01-10 13:51:40.924957  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.getRilOp(MtkRIL.java:467)
01-10 13:51:40.924976  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkRIL.unregisterForModulation(MtkRIL.java:1461)
01-10 13:51:40.924992  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkServiceStateTracker.updatePhoneType(MtkServiceStateTracker.java:536)
01-10 13:51:40.925007  1304  1304 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.switchPhoneType(GsmCdmaPhone.java:414)
01-10 13:51:40.925022  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.switchPhoneType(MtkGsmCdmaPhone.java:580)
01-10 13:51:40.925039  1304  1304 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.switchVoiceRadioTech(GsmCdmaPhone.java:3321)
01-10 13:51:40.925055  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.switchVoiceRadioTech(MtkGsmCdmaPhone.java:667)
01-10 13:51:40.925068  1304  1304 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.phoneObjectUpdater(GsmCdmaPhone.java:3295)
01-10 13:51:40.925083  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.phoneObjectUpdater(MtkGsmCdmaPhone.java:5503)
01-10 13:51:40.925098  1304  1304 W System.err: 	at com.android.internal.telephony.GsmCdmaPhone.handleMessage(GsmCdmaPhone.java:2243)
01-10 13:51:40.925122  1304  1304 W System.err: 	at com.mediatek.internal.telephony.MtkGsmCdmaPhone.handleMessage(MtkGsmCdmaPhone.java:2128)
01-10 13:51:40.925171  1304  1304 W System.err: 	at android.os.Handler.dispatchMessage(Handler.java:106)
01-10 13:51:40.925189  1304  1304 W System.err: 	at android.os.Looper.loop(Looper.java:164)
01-10 13:51:40.925204  1304  1304 W System.err: 	at android.app.ActivityThread.main(ActivityThread.java:6548)
01-10 13:51:40.925228  1304  1304 W System.err: 	at java.lang.reflect.Method.invoke(Native Method)
01-10 13:51:40.925245  1304  1304 W System.err: 	at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:438)
01-10 13:51:40.925260  1304  1304 W System.err: 	at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:857)
01-10 13:51:40.925535  1304  1304 W System.err: Caused by: java.lang.ClassNotFoundException: com.mediatek.opcommon.telephony.MtkRilOp
01-10 13:51:40.925567  1304  1304 W System.err: 	at java.lang.Class.classForName(Native Method)
01-10 13:51:40.925583  1304  1304 W System.err: 	at java.lang.BootClassLoader.findClass(ClassLoader.java:1355)
01-10 13:51:40.925597  1304  1304 W System.err: 	at java.lang.BootClassLoader.loadClass(ClassLoader.java:1415)
01-10 13:51:40.925614  1304  1304 W System.err: 	at java.lang.ClassLoader.loadClass(ClassLoader.java:312)
01-10 13:51:40.925626  1304  1304 W System.err: 	... 20 more
01-10 13:51:40.925664  1304  1304 W System.err: Caused by: java.lang.NoClassDefFoundError: Class not found using the boot class loader; no stack trace available
01-10 13:51:40.925973   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.940637  1304  1304 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 13:51:40.940664  1126  1126 W SystemUIService: Initialization of com.android.systemui.SystemBars took 1277 ms
01-10 13:51:40.941278  1304  1304 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 13:51:40.944762   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.954485  1126  1126 D StorageNotification: Notifying about private volume: VolumeInfo{private}:
01-10 13:51:40.954485  1126  1126 D StorageNotification:     type=PRIVATE diskId=null partGuid=null mountFlags=0 mountUserId=-1 
01-10 13:51:40.954485  1126  1126 D StorageNotification:     state=MOUNTED 
01-10 13:51:40.954485  1126  1126 D StorageNotification:     fsType=null fsUuid=null fsLabel=null 
01-10 13:51:40.954485  1126  1126 D StorageNotification:     path=/data internalPath=null 
01-10 13:51:40.961054  1304  1304 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 13:51:40.961857  1304  1304 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 13:51:40.964353   986   995 I zygote64: Background concurrent copying GC freed 29719(2MB) AllocSpace objects, 10(456KB) LOS objects, 42% free, 8MB/14MB, paused 184us total 113.872ms
01-10 13:51:40.967509  1288  1311 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 13:51:40.967639   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:40.980320  1288  1461 I VT      : [JNI] Leaving InitRefVTP
01-10 13:51:40.980546   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 13:51:40.980696   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 13:51:40.987007   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:40.989520   561   591 D agps    : [agps][n][CP] [MD_1] read  md_modem_reboot_ind_hdlr
01-10 13:51:40.989712   561   591 D agps    : [agps][n][CP] [MD_1] write  sim_info_req  gsm_disabled=[0] umts_disabled=[0] lte_disabled=[0] lppe_enable=[1] lppe_network_location_disable=[0] reject_non911_nilr_enable=[0] battery_percentage=[100]
01-10 13:51:40.989788   561   591 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 13:51:40.989815   561   591 D agps    : [agps] WARNING: [LPPe] lppe_mgr_start_capabilities_sync()
01-10 13:51:40.989898   401   519 I SurfaceFlinger: EventThread Client Pid (1126) created
01-10 13:51:40.990659   560   583 D lbs_hidl_service: [1.05][mtk_lppe_socket_wlan] handleSocketEvent() ret=[12]
01-10 13:51:40.990916   560   583 D lbs_hidl_service: [1.05][mtk_lppe_socket_bt] handleSocketEvent() ret=[12]
01-10 13:51:40.990958   560   583 D lbs_hidl_service: [1.05][mtk_lppe_socket_sensor] handleSocketEvent() ret=[12]
01-10 13:51:40.990993   560   583 D lbs_hidl_service: [1.05][mtk_lppe_socket_network] handleSocketEvent() ret=[12]
01-10 13:51:40.991031   560   583 D lbs_hidl_service: [1.05][mtk_lppe_socket_ipaddr] handleSocketEvent() ret=[12]
01-10 13:51:40.991072   560   583 D lbs_hidl_service: [1.05][mtk_lppe_socket_lbs] handleSocketEvent() ret=[12]
01-10 13:51:40.991853   401   519 I SurfaceFlinger: EventThread Client Pid (1126) created
01-10 13:51:40.997276  1304  1304 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 13:51:40.998410  1304  1304 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 13:51:40.998580   561   591 D agps    : [agps][n][CP] [MD_1] read  sim_info_rsp  sim_number=2 md_type=0 (0=fdd, 1=tdd) ecid=1 otdoa=0 band_num=11
01-10 13:51:40.998630   561   591 D agps    : [agps][n][CP] i=0  support_band=1
01-10 13:51:40.998644   561   591 D agps    : [agps][n][CP] i=1  support_band=3
01-10 13:51:40.998656   561   591 D agps    : [agps][n][CP] i=2  support_band=5
01-10 13:51:40.998666   561   591 D agps    : [agps][n][CP] i=3  support_band=7
01-10 13:51:40.998678   561   591 D agps    : [agps][n][CP] i=4  support_band=8
01-10 13:51:40.998688   561   591 D agps    : [agps][n][CP] i=5  support_band=20
01-10 13:51:40.998700   561   591 D agps    : [agps][n][CP] i=6  support_band=28
01-10 13:51:40.998710   561   591 D agps    : [agps][n][CP] i=7  support_band=38
01-10 13:51:40.998721   561   591 D agps    : [agps][n][CP] i=8  support_band=39
01-10 13:51:40.998734   561   591 D agps    : [agps][n][CP] i=9  support_band=40
01-10 13:51:40.998745   561   591 D agps    : [agps][n][CP] i=10  support_band=41
01-10 13:51:40.998768   561   591 D agps    : [agps][n][CP] index=[0]  support_lpp_otdoa_nbr_cell_list=[0] support_supl_flow_ind=[1] support_location_settings=[1] support_cp_lppe=[0]
01-10 13:51:40.998830   561   591 D agps    : [agps][n][CP] [MD_1] write  cp2_util_send_location_setting  enabled=[1]
01-10 13:51:40.998861   561   615 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_LBS_CAPABILITY_UPDATE_REQ]
01-10 13:51:40.998912   561   615 D agps    : [agps][n][task] lpp  rcv src=[MOD_LPP_CP] dest=[MOD_LPP_UP] msg=[MSG_ID_LPP_PEER_EUTRAN_BAND_UPDATE_CNF]
01-10 13:51:40.998994   561   591 D agps    : [agps][n][AGPS] [MNL] write  agps_settings_sync  sib8_16=[1], gps=[1] glonass=[1] beidou=[1] galileo=[1] agps=[1] aglonass=[1] abeidou=[0] agalileo=[0]
01-10 13:51:40.999263   524   695 D MNLD    : agps_settings_sync: agps setting, sib8_16_enable = 1, gps_sat_en = 1, glonass_sat_en = 1,         beidou_sat_en = 1, galileo_sat_en = 1, a_glonass_sat_en = 1,         a_gps_satellite_enable = 1, a_beidou_satellite_enable = 0, a_galileo_satellite_enable = 0, lppe_enable=1
01-10 13:51:41.000538   563   563 D NVRAM   : NVRAM daemon sync start !
01-10 13:51:41.000587   561   591 D agps    : [agps][n][AGPS] [MNL] read  agps_settings_ack  gps=[1] glonass=[1] beidou=[1] galileo=[0]
01-10 13:51:41.000797   524   695 D MNLD    : agps_settings_sync: mnl stop, mnld send pmtk764 to agpsd
01-10 13:51:41.000866   524   695 D MNLD    : get_agnss_capability: MNLD_PMTK764: $PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 13:51:41.000866   524   695 D MNLD    : , agps_cap:1, aglonass_cap:1, abeidou_cap:0, agalileo_cap:0, lppe_support:1
01-10 13:51:41.001185   561   591 D agps    : [agps][n][AGPS] [MNL] read  pmtk=[$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 13:51:41.001185   561   591 D agps    : ]
01-10 13:51:41.001236   561   591 D agps    : [agps][n][AGPS] gnss_num=2
01-10 13:51:41.001277   561   591 D agps    : [agps][n][CP] [MD_1] write  pmtk [$PMTK764,0,0,0,2,0,128,4,128,1*2C
01-10 13:51:41.001277   561   591 D agps    : ]
01-10 13:51:41.006773  1288  1311 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 13:51:41.009928   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.029061   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.031677  1126  1478 D KeyguardViewMediator: lockedOrMissing is false, requireSim=false, antiTheftLocked=false remoteLocked = false
01-10 13:51:41.047344  1126  1478 D KeyguardViewMediator: onBootCompleted() is called
01-10 13:51:41.051615   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.052025  1126  1126 I Choreographer: Skipped 73 frames!  The application may be doing too much work on its main thread.
01-10 13:51:41.056866   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 13:51:41.056966   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 13:51:41.059171   563   563 D NVRAM   : NVRAM daemon sync end !
01-10 13:51:41.059261   563   563 D NVRAM   : NVRAM daemon exits !
01-10 13:51:41.071099  1126  1126 D ViewRootImpl[StatusBar]: changeCanvasOpacity: opaque=true
01-10 13:51:41.071203   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.072581  1288  1288 I ImsConfigUtils: After 93, send EIMS feature value volte:1, vilte:0, vowifi:0, viwifi:0, sms:1, isAllowTurnOff:1, eims:1, phoneId:0
01-10 13:51:41.081064  1304  1578 E MtkPhoneIntfMgrEx: [setWifiSignalLevel] pheonId:0, rssi:0, snr:60
01-10 13:51:41.086592  1304  1536 E MtkPhoneIntfMgrEx: [setWifiEnabled] pheonId:0, ifName:wlan0, isEnabled:0
01-10 13:51:41.091008   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:24.577719,dur:1017.18,max:87.56,min:2.02
01-10 13:51:41.093380   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.093529   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg=0,1,0,0,0,1,1](22)
01-10 13:51:41.093650   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [woimscfg:](9)
01-10 13:51:41.094607  1304  1536 E MtkPhoneIntfMgrEx: [setWifiAssociated] pheonId:0, ifName:wlan0, associated:false, ssid:, apMac:
01-10 13:51:41.099159  1304  1536 E MtkPhoneIntfMgrEx: [setWifiIpAddress] pheonId:0, ifName:wlan0, ipv4Addr:, ipv6Addr:
01-10 13:51:41.105398   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wowifi=***](28)
01-10 13:51:41.105615   873   873 D [epdg_wo]: [DBG] wifi->prev_ssid= de-associcated
01-10 13:51:41.105698   873   873 I [epdg_wo]: [WOA] wo_msg_sensitive_print: [wowifi:0,0](10)
01-10 13:51:41.112245   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.129854  1304  1304 I VvmSimStateTracker: android.intent.action.SIM_STATE_CHANGED
01-10 13:51:41.130537   540  1435 I NuPlayerDecoder: [audio] saw output EOS
01-10 13:51:41.134982   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.137016   527   558 D AAL     : 01-10 01:51:40.929 BL= 376,ESS= 256, 01-10 01:51:41.004 BL= 375,ESS= 256, 01-10 01:51:41.042 BL= 374,ESS= 256, 01-10 01:51:41.099 BL= 373,ESS= 256, 01-10 01:51:41.136 BL= 372,ESS= 256, 
01-10 13:51:41.153997   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.166888  1304  1304 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: No UICC
01-10 13:51:41.177920   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.181343  1304  1304 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 13:51:41.181666  1304  1304 D ImsExternalCallTracker: refreshCallPullState
01-10 13:51:41.182904  1126  1126 D SignalClusterView: hasCorrectSubs, subsInfo:[],--mPhoneStates:[]
01-10 13:51:41.193624  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 13:51:41.196813   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.200608  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 13:51:41.202691  1304  1304 D PhoneSwitcherNetworkRequstListener: got request NetworkRequest [ TRACK_DEFAULT id=3, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 13:51:41.203184  1304  1304 D PhoneSwitcherNetworkRequstListener: got request NetworkRequest [ REQUEST id=1, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 13:51:41.203354  1304  1304 D PhoneSwitcherNetworkRequstListener: got request NetworkRequest [ TRACK_DEFAULT id=6, [ Capabilities: INTERNET&NOT_RESTRICTED&TRUSTED&NOT_VPN] ] with score 0
01-10 13:51:41.206064  1304  1304 D TelephonyDebugService: TelephonyDebugService()
01-10 13:51:41.214980  1304  1304 D CarrierConfigLoader: mHandler: 12 phoneId: 0
01-10 13:51:41.217381  1304  1304 D PhoneGlobals: onSubscriptionsChanged start
01-10 13:51:41.217754   775   911 I EMDLOGGER1: property debug.mdl.save_log_storage is not set value
01-10 13:51:41.217989   775   911 D EMDLOGGER1: access filter config file fail then create: /mnt/sdcard/mtklog/mdlog1_config/filter_config
01-10 13:51:41.218056   775   911 E EMDLOGGER1: Create filter config file /mnt/sdcard/mtklog/mdlog1_config/filter_config failed, errno = 2
01-10 13:51:41.219827   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.220264  1304  1304 D TelephonyUtils: isHotSwapHanppened : false
01-10 13:51:41.220430  1304  1304 D PhoneGlobals: onSubscriptionsChanged end
01-10 13:51:41.220705  1304  1304 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SERVICE_STATE
01-10 13:51:41.220794  1304  1304 D CdmaVolteServiceChecker: updateState, checking = false
01-10 13:51:41.221792  1304  1304 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 13:51:41.222018  1304  1304 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 13:51:41.222265  1304  1304 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SIM_STATE_CHANGED
01-10 13:51:41.222316  1304  1304 D CdmaVolteServiceChecker: updateState, checking = false
01-10 13:51:41.223095  1304  1304 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 13:51:41.223287  1304  1304 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 13:51:41.225563  1304  1304 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: No UICC
01-10 13:51:41.238416   551   922 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:41.237000   551   551 W HwBinder:551_2: type=1400 audit(0.0:47): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:41.238953   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.249110  1304  1304 D OpenGLRenderer: HWUI GL Pipeline
01-10 13:51:41.250336  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.250475  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.250562  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.253794  1304  1304 D OperatorCustomizationFactoryLoader: Slot -1's OperatorInfo is__
01-10 13:51:41.253938  1304  1304 D OperatorCustomizationFactoryLoader: It's OM load or parse failed, because operator is null
01-10 13:51:41.254081  1304  1304 I zygote64: Deoptimizing java.lang.Object com.mediatek.common.util.OperatorCustomizationFactoryLoader.loadFactory(android.content.Context, java.util.List, int) due to JIT inline cache
01-10 13:51:41.254266  1304  1304 E OperatorCustomizationFactoryLoader: can not find operatorFactoryInfo by slot id -1 from 
01-10 13:51:41.254266  1304  1304 E OperatorCustomizationFactoryLoader: 0: OperatorFactoryInfo(null_null_null:OPTeleServiceCommon.apk:com.mediatek.op.phone.plugin.CommonPhoneCustomizationFactory:com.mediatek.op.phone.plugin)
01-10 13:51:41.254765  1304  1304 D ExtensionManager: [sRttUtilExt] create ext instance: com.mediatek.phone.ext.DefaultRttUtilExt@656c3b0
01-10 13:51:41.257499  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.257578  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.257610  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.261531   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.270748  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.270796  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.270829  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.280597   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.281171  1304  1304 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SIM_STATE_CHANGED
01-10 13:51:41.281302  1304  1304 D CdmaVolteServiceChecker: updateState, checking = false
01-10 13:51:41.281562  1304  1571 D CarrierConfigLoader: update config for phoneId: 0 simState: UNKNOWN
01-10 13:51:41.281759  1304  1571 D CarrierSvcBindHelper: update binding for phoneId: 0 simState: UNKNOWN
01-10 13:51:41.282099  1304  1304 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 13:51:41.282225  1304  1304 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 13:51:41.286879  1304  1304 D IntentBroadcaster: Broadcasting and adding intent for rebroadcast: android.intent.action.SIM_STATE_CHANGED ABSENT for slotId 0
01-10 13:51:41.298017   986   986 D MtkEapSimUtility: onReceive ACTION_SIM_STATE_CHANGED iccState: ABSENT, simSlot: 0
01-10 13:51:41.298365   986   986 D MtkEapSimUtility: resetting networks because SIM0 was removed
01-10 13:51:41.298792   986  1087 D WifiStateMachine:  InitialState !CMD_RESET_SIM_NETWORKS rt=19489/19489 0 0
01-10 13:51:41.298973   986  1087 D WifiStateMachine:  DefaultState !CMD_RESET_SIM_NETWORKS rt=19489/19489 0 0
01-10 13:51:41.299320  1288  1288 D ImsConfigReceiver: Update LatestSimState, phoneId = 0, state = ABSENT
01-10 13:51:41.299548  1288  1288 D ImsConfigReceiver: Sim state changed, event = ABSENT, check for ECC flag
01-10 13:51:41.302529  1288  1288 D ImsConfigReceiver: Sim state changed, event = ABSENT, reset broadcast flag
01-10 13:51:41.303116  1126  1273 D NetworkController: subscriptions is null
01-10 13:51:41.303376   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.303930  1304  1304 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 13:51:41.305119  1304  1304 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 13:51:41.306762  1288  1288 D ImsVT Util: Received ACTION_SIM_STATE_CHANGED, slotId:0, simState:ABSENT
01-10 13:51:41.307151  1288  1288 D ImsConfigManager: DYNAMIC_IMS_SWITCH_TRIGGER phoneId:0, simState:ABSENT
01-10 13:51:41.307358  1288  1288 D ImsConfigManager: get MtkImsConfigImpl of phone 0
01-10 13:51:41.307520  1288  1288 W ImsConfigManager: setImsResCapability to volte only w/o SIM on phone 0
01-10 13:51:41.310015  1288  1288 D ImsConfigStorage: updateResource() comparing: curValue: 1, value:1
01-10 13:51:41.322220   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.336732  1288  1288 D ImsConfigStorage: updateResource() comparing: curValue: 0, value:0
01-10 13:51:41.342064   401   401 I BufferQueue: [unnamed-401-3](this:0x7300cf4800,id:3,api:0,p:-1,c:-1) BufferQueue core=(401:/system/bin/surfaceflinger)
01-10 13:51:41.342480   401   401 W GuiExt  : Cannot find GuiExtService
01-10 13:51:41.342635   401   401 I BufferQueueConsumer: [unnamed-401-3](this:0x7300cf4800,id:3,api:0,p:-1,c:401) connect(C): consumer=(401:/system/bin/surfaceflinger) controlledByApp=false
01-10 13:51:41.342704   401   401 I BufferQueueConsumer: [unnamed-401-3](this:0x7300cf4800,id:3,api:0,p:-1,c:401) setConsumerName: unnamed-401-3
01-10 13:51:41.342758   401   401 I BufferQueueConsumer: [StatusBar#0](this:0x7300cf4800,id:3,api:0,p:-1,c:401) setConsumerName: StatusBar#0
01-10 13:51:41.342825   401   401 I BufferQueueConsumer: [StatusBar#0](this:0x7300cf4800,id:3,api:0,p:-1,c:401) setDefaultBufferSize: width=720 height=48
01-10 13:51:41.344893   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.348596  1126  1126 D Surface : Surface::allocateBuffers(this=0x7473b68000)
01-10 13:51:41.352226  1304  1304 D PhoneGlobals: Radio technology switched. Now CDMA (0) is active.
01-10 13:51:41.355780  1304  1304 D AudioTrack: set(): 0x7483b5a000, streamType 0, sampleRate 0, format 0x1, channelMask 0x1, frameCount 960, flags #4, notificationFrames 0, sessionId 0, transferType 1, uid -1, pid -1
01-10 13:51:41.356265  1304  1304 D AudioTrack: set: Create AudioTrackThread, tid = 1596
01-10 13:51:41.357701  1304  1304 D AudioTrack: mNotificationFramesReq 0, notificationFrames 1024
01-10 13:51:41.358219  1126  1376 I zygote64: android::hardware::configstore::V1_0::ISurfaceFlingerConfigs::hasWideColorDisplay retrieved: 0
01-10 13:51:41.358475  1126  1376 I OpenGLRenderer: Initialized EGL, version 1.4
01-10 13:51:41.358566  1126  1376 D OpenGLRenderer: Swap behavior 2
01-10 13:51:41.359787   528  1506 D AudioFlinger: track(0xf2d43600): mIsOut 1, mFrameCount 960, mSampleRate 48000, mFormat 1, mChannelCount 1, mTrackCount 1, thread 0xf2b83d80, sessionId 49
01-10 13:51:41.360068   528  1506 D AudioFlinger: track(0xf2d43600): mFastIndex 1, mStreamType 0, mName 4097
01-10 13:51:41.360424  1288  1288 D ImsConfigStorage: updateResource() comparing: curValue: 0, value:0
01-10 13:51:41.362392  1126  1126 D StatusBar: disable<e i a s b H!R!c s q >
01-10 13:51:41.362516  1304  1304 I AudioTrack: AUDIO_OUTPUT_FLAG_FAST successful; frameCount 960 -> 960
01-10 13:51:41.362543  1304  1304 W AudioTrack: Client adjusted notificationFrames from 1024 to 256 for frameCount 960
01-10 13:51:41.362764  1304  1304 D AudioTrack: createTrack_l: 0x7483b5a000, mCblk = 0x7474806000, mLatency = 72, mAfLatency = 52, frameCount = 960, mSampleRate = 48000, mFlags = 0x4, mReqFrameCount = 960, mNotificationFramesAct = 256
01-10 13:51:41.363907   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.364310  1304  1304 D CallNotifier: CallNotifier: mSignalInfoToneGenerator created when toneplay
01-10 13:51:41.366976   986  1086 D WifiHandler.WifiService: Received message=69633d sendingUid=10021
01-10 13:51:41.367493   986  1086 D WifiHandler.WifiService: Received message=69632d sendingUid=-1
01-10 13:51:41.370395  1288  1391 I VT      : [VTC] notifyCallback
01-10 13:51:41.370592  1288  1391 D ImsVT Util: recordGet id = 0, size = 0
01-10 13:51:41.370710  1288  1391 I ImsVT   : [ID=0] [postEventFromNative]: 4014
01-10 13:51:41.370765  1288  1391 D ImsVT   : postEventFromNative : msg = SESSION_EVENT_GET_CAP
01-10 13:51:41.370797  1288  1391 D VT SRC  : [STC] [getAllCameraResolutions] Start
01-10 13:51:41.371617  1288  1391 I CameraManagerGlobal: Connecting to camera service
01-10 13:51:41.379486  1126  1376 D OpenGLRenderer: [init] completed
01-10 13:51:41.379572  1126  1376 D HWUIExtension: MTKProgramCache.init: enable enhancement 1
01-10 13:51:41.379776  1126  1376 I HWUIExtension: Get disable program binary service property (0)
01-10 13:51:41.379807  1126  1376 I HWUIExtension: Initializing program atlas...
01-10 13:51:41.380016  1288  1288 D ImsConfigManager: DYNAMIC_IMS_SWITCH_COMPLETE phoneId:0, simState:ABSENT
01-10 13:51:41.380857  1126  1376 I ProgramBinary/Service: ProgramBinaryService client side disable debugging.
01-10 13:51:41.380953  1126  1376 I ProgramBinary/Service: ProgramBinaryService client side disable binary content debugging.
01-10 13:51:41.380965  1126  1376 D ProgramBinary/Service: BpProgramBinaryService.getReady
01-10 13:51:41.380988  1126  1376 D ProgramBinary/Service: zhiyin- 1 BpProgramBinaryService::getReady()
01-10 13:51:41.381179   571   580 D ProgramBinary/Service: zhiyin- ontransact 1 code 1
01-10 13:51:41.381275   571   580 D ProgramBinary/Service: zhiyin- ontransact 2 code 1
01-10 13:51:41.381293   571   580 D ProgramBinary/Service: zhiyin- ontransact 3 code 1
01-10 13:51:41.381380  1126  1376 D ProgramBinary/Service: zhiyin- 2 BpProgramBinaryService::getReady()
01-10 13:51:41.381479  1126  1376 D ProgramBinary/Service: BpProgramBinaryService.getProgramBinaryData
01-10 13:51:41.381593   571   580 D ProgramBinary/Service: zhiyin- ontransact 1 code 3
01-10 13:51:41.381857  1126  1376 I HWUIExtension: Program binary detail: Binary length is 188172, program map length is 104.
01-10 13:51:41.382007  1126  1376 I HWUIExtension: Succeeded to mmap program binaries. File descriptor is 92, and path is /dev/ashmem.
01-10 13:51:41.382068  1126  1376 I HWUIExtension: No need to use file discriptor anymore, close fd(92).
01-10 13:51:41.382212  1126  1376 D HWUIExtension: Dumper init 4 threads <0x74735a3dc0>
01-10 13:51:41.382319  1126  1376 D HWUIExtension: <com.android.systemui> is running.
01-10 13:51:41.382406  1126  1376 D HWUIExtension: Initializing program cache from 0x0, size = -1
01-10 13:51:41.382924  1126  1376 D Surface : Surface::connect(this=0x7473b68000,api=1)
01-10 13:51:41.383413  1304  1304 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 13:51:41.383545   401  1350 I BufferQueueProducer: [StatusBar#0](this:0x7300cf4800,id:3,api:1,p:1126,c:401) connect(P): api=1 producer=(1126:com.android.systemui) producerControlledByApp=true
01-10 13:51:41.384135  1304  1304 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 13:51:41.384837  1304  1310 I zygote64: Do partial code cache collection, code=20KB, data=30KB
01-10 13:51:41.385326  1304  1310 I zygote64: After code cache collection, code=17KB, data=29KB
01-10 13:51:41.385391  1304  1310 I zygote64: Increasing code cache capacity to 128KB
01-10 13:51:41.386925  1126  1376 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 13:51:41.387169   540  1423 D AudioTrack: stop(): 0xeb4cc000, mState = 0
01-10 13:51:41.387233   540  1423 D AudioTrack: stop() called with 55902 frames delivered
01-10 13:51:41.387554   540  1423 D AudioTrack: audiotrack 0xeb4cc000 stop done
01-10 13:51:41.387616   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.397852  1126  1401 E WallpaperManager: /enterprise/wallpaper not exists
01-10 13:51:41.398576  1288  1391 D VT SRC  : [STC] [getAllCameraResolutions] resolution size:1
01-10 13:51:41.398672  1288  1391 D VT SRC  : [STC] [getAllCameraResolutions] Finish
01-10 13:51:41.400953   527   558 D AAL     : 01-10 01:51:41.212 BL= 371,ESS= 256, 01-10 01:51:41.250 BL= 370,ESS= 256, 01-10 01:51:41.306 BL= 369,ESS= 256, 01-10 01:51:41.344 BL= 368,ESS= 256, 01-10 01:51:41.400 BL= 367,ESS= 256, 
01-10 13:51:41.401600  1288  1391 D ImsVT   : SIM state ABSENT
01-10 13:51:41.401796  1288  1391 I VT      : [JNI] Entering SetCameraParameters
01-10 13:51:41.402189   534   846 I VT      : [SRV] [OPERATION][ID=0] setCameraParameters
01-10 13:51:41.402321   534   846 I VT      : sim_id:0, major_sim_id:-1, sensorCnt:1
01-10 13:51:41.402348   534   846 I VT      : sensor[0]: id=0, width=4160, height=4160, degree=90, facing=1
01-10 13:51:41.402394   534   846 D [VT]ImsMa: [setSensorParameters]Line 946 [ID=0][enter]=======
01-10 13:51:41.402465   534   846 D [VT]ImsMa: [setSensorParameters]Line 965 [ID=0]we have 1 sensor mSensorInfos = 0xe689b078
01-10 13:51:41.402485   534   846 I [VT]ImsMa: [setSensorParameters]Line 979 tempLocal: 0xe689b078,index 0 W:4160, H:4160, D:90,F:1
01-10 13:51:41.402505   534   846 D [VT]ImsMa: [setSensorParameters]Line 1056 [ID=0]max w 4160,max h 4160, prefer 1
01-10 13:51:41.402566   534   846 I VT      : [SRV] getCurrentOperator start
01-10 13:51:41.402901   534   846 I VT      : [SRV] getCurrentOperator operatorPropetyString : persist.radio.sim.opid_-1
01-10 13:51:41.402924   534   846 I VT      : [SRV] getCurrentOperator multiPs : 1
01-10 13:51:41.402938   534   846 I VT      : [SRV] getCurrentOperator labOp : 0
01-10 13:51:41.402957   534   846 I VT      : [SRV] getCurrentOperator finish : SIM absent, return default op code = 8
01-10 13:51:41.402981   534   846 E VT      : [SRV]   [MAP OPERATION] [SIM ID=-1] setOperatorId (not found)
01-10 13:51:41.403002   534   846 D [VT]ImsMa: [getRtpRtcpCapability]Line 1196 [ID=0][enter]======= operatorID=8
01-10 13:51:41.403070   534   846 D [VT][RTP]IRTPController: getCapability,capArray 0xe6c35858,pNumOfCap 0xe6c357eb,media type 0x1,
01-10 13:51:41.403125   534   846 D [VT][RTP]IRTPController: getCapability,create video capability
01-10 13:51:41.403190   534   846 D [VT][RTP]IRTPController: enable_avpf 2 operatorID=8 rtp_profile=3
01-10 13:51:41.403168   401   401 I BufferQueue: [unnamed-401-4](this:0x72f9c0f800,id:4,api:0,p:-1,c:-1) BufferQueue core=(401:/system/bin/surfaceflinger)
01-10 13:51:41.403241   534   846 D [VT][RTP]IRTPController: 	 media(0x1),mime(0x1),profile(0x3),sampleRate(90000)
01-10 13:51:41.403257   534   846 D [VT][RTP]IRTPController: 	 ext_header_num:1
01-10 13:51:41.403272   534   846 D [VT][RTP]IRTPController: 	 ext_header[0]:id(7),uri(urn:3gpp:video-orientation)
01-10 13:51:41.403287   534   846 D [VT][RTP]IRTPController: 	 packetize_mode(3),rtcp_rsize(0)
01-10 13:51:41.403300   534   846 I [VT][RTP]IRTPController: getCapability,sizeof(1056)
01-10 13:51:41.403312   534   846 I [VT][RTP]IRTPController: getCapability,temp_size(128)
01-10 13:51:41.403329   534   846 I [VT][RTP]IRTPController: getCapability,3-id:4,3-param:5,sub:
01-10 13:51:41.403339   534   846 D [VT][RTP]IRTPController: 	 fb_num(6)
01-10 13:51:41.403357   534   846 D [VT][RTP]IRTPController: 	 Feedback[0]:fb_id(2),fb_param(1),fb_sub_param()
01-10 13:51:41.403375   534   846 D [VT][RTP]IRTPController: 	 Feedback[1]:fb_id(2),fb_param(2),fb_sub_param()
01-10 13:51:41.403393   534   846 D [VT][RTP]IRTPController: 	 Feedback[2]:fb_id(2),fb_param(3),fb_sub_param()
01-10 13:51:41.403411   534   846 D [VT][RTP]IRTPController: 	 Feedback[3]:fb_id(4),fb_param(5),fb_sub_param()
01-10 13:51:41.403429   534   846 D [VT][RTP]IRTPController: 	 Feedback[4]:fb_id(3),fb_param(1000),fb_sub_param()
01-10 13:51:41.403446   534   846 D [VT][RTP]IRTPController: 	 Feedback[5]:fb_id(4),fb_param(6),fb_sub_param()
01-10 13:51:41.403458   534   846 D [VT][RTP]IRTPController: getCapability 1 support HEVC
01-10 13:51:41.403484   534   846 I [VT][RTP]IRTPController: getCapability,cap array first item address:0xe68b7000, cap num:2 rtp_profile(3)
01-10 13:51:41.403524   534   846 D [VT][MADebug]: [PrintRtpRtpCap]Line 46 ================RtpRtcpCap====================
01-10 13:51:41.403579   534   846 D [VT][MADebug]: [PrintRtpRtpCap]Line 47 media_type               1
01-10 13:51:41.403597   534   846 D [VT][MADebug]: [PrintRtpRtpCap]Line 48 mime_Type                4
01-10 13:51:41.403625   534   846 D [VT][MADebug]: [PrintRtpRtpCap]Line 49 rtp_profile              3
01-10 13:51:41.403642   534   846 D [VT][MADebug]: [PrintRtpRtpCap]Line 50 sample_rate              90000
01-10 13:51:41.403668   534   846 D [VT][MADebug]: [PrintRtpRtpCap]Line 51 packetize_mode           3
01-10 13:51:41.403687   534   846 D [VT][MADebug]: [PrintRtpRtpCap]Line 52 rtp_header_extension_num 1
01-10 13:51:41.403704   534   846 D [VT][MADebug]: [PrintRtpRtpCap]Line 53 rtcp_fb_param_num        6
01-10 13:51:41.403667   401   401 W GuiExt  : Cannot find GuiExtService
01-10 13:51:41.403728   534   846 D [VT]ImsMa: [getRtpRtcpCapability]Line 1204 [ID=0][exit]=======
01-10 13:51:41.403782   534   846 I [VT]VcodecCap: [getSensorLevel] resolution = 4160 x 4160, level = 25
01-10 13:51:41.403911   534   846 I [VT]VcodecCap: [getVideoProperty] f:1,P:0,L:0,F:0,B:0,I:0
01-10 13:51:41.403940   534   846 I [VT]VcodecCap: pthread_mutex_init MediaProfileListLock
01-10 13:51:41.403936   401   401 I BufferQueueConsumer: [unnamed-401-4](this:0x72f9c0f800,id:4,api:0,p:-1,c:401) connect(C): consumer=(401:/system/bin/surfaceflinger) controlledByApp=false
01-10 13:51:41.403991   534   846 I [VT]VcodecCap: createMediaProfile(): /system/vendor/etc/vilte/viLTE_media_profiles_op8.xml
01-10 13:51:41.404030   401   401 I BufferQueueConsumer: [unnamed-401-4](this:0x72f9c0f800,id:4,api:0,p:-1,c:401) setConsumerName: unnamed-401-4
01-10 13:51:41.404092   401   401 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x72f9c0f800,id:4,api:0,p:-1,c:401) setConsumerName: com.android.systemui.ImageWallpaper#0
01-10 13:51:41.404157   401   401 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x72f9c0f800,id:4,api:0,p:-1,c:401) setDefaultBufferSize: width=720 height=720
01-10 13:51:41.404360   534   846 I [VT]VcodecCap: createH264DefaultMediaProfile() default profile table(op8), count = 21
01-10 13:51:41.404412   534   846 I [VT]VcodecCap: createHEVCDefaultMediaProfile() default profile table(op8)
01-10 13:51:41.404432   534   846 I [VT]VcodecCap: createH264QualtiyMediaProfile: default setting
01-10 13:51:41.404465   534   846 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_3, 640x480, 30 fps, 416 kbps, i period: 1)
01-10 13:51:41.404494   534   846 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_1_2, 320x240, 15 fps, 416 kbps, i period: 1)
01-10 13:51:41.404525   534   846 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_1_2, 320x240, 15 fps, 416 kbps, i period: 1)
01-10 13:51:41.404548   534   846 I [VT]VcodecCap: [getMediaProfileEntry][1] out:(VIDEO_PROFILE_BASELINE, VIDEO_LEVEL_1_1, 320x240, 10 fps, 270 kbps, i period: 1)
01-10 13:51:41.404563   534   846 I [VT]VcodecCap: setFormat(1)
01-10 13:51:41.404634   534   846 I [VT]VcodecCap: [getSensorLevel] resolution = 4160 x 4160, level = 25
01-10 13:51:41.404680   534   846 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=6(VIDEO_LEVEL_1_2), max_level=6(VIDEO_LEVEL_1_2)
01-10 13:51:41.405153   534   846 E libc    : Access denied finding property "mtk.vdec.log"
01-10 13:51:41.405679   534   846 I         : isVTService(/system/bin/vtservice)
01-10 13:51:41.405923   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.406154   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.406297   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.408147   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.413076   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.413567   534   846 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 13:51:41.414429   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.414541   534   846 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00c8d8d41e14d3505020207844237)
01-10 13:51:41.414947   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.415721   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.417282   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.417335   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.419304   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.419447   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.420919   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.401000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:48): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_vdec_prop:s0" dev="tmpfs" ino=8129 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_vdec_prop:s0 tclass=file permissive=0
01-10 13:51:41.413000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:49): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.421000   534   534 I chatty  : uid=1000(system) /system/bin/vtservice identical 1 line
01-10 13:51:41.429000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:51): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.422849   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.423040   534   846 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 13:51:41.423598   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.423673   534   846 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 13:51:41.423934   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.424462   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.425860   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.425911   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.426112   534   846 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00c, max_recv_level=12,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LADI2NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 13:51:41.426169   534   846 D [VT][MADebug]: [printCodecParam]Line 69 ================printCodecParam====================
01-10 13:51:41.426196   534   846 D [VT][MADebug]: [printCodecParam]Line 73 format   =  VIDEO_H264
01-10 13:51:41.426207   534   846 D [VT][MADebug]: [printCodecParam]Line 74 Width   =  240
01-10 13:51:41.426218   534   846 D [VT][MADebug]: [printCodecParam]Line 75 height   =  320
01-10 13:51:41.426228   534   846 D [VT][MADebug]: [printCodecParam]Line 76 frame-rate   =  15
01-10 13:51:41.426242   534   846 D [VT][MADebug]: [printH264CodecParam]Line 12 profile_level_id               =0x42c00c
01-10 13:51:41.426254   534   846 D [VT][MADebug]: [printH264CodecParam]Line 13 max_recv_level                 =12
01-10 13:51:41.426267   534   846 D [VT][MADebug]: [printH264CodecParam]Line 15 sprop_parameter_sets       =Z0LADI2NQeFNNQUCAgeEQjc=,aMpDyA==
01-10 13:51:41.426279   534   846 D [VT][MADebug]: [printH264CodecParam]Line 16 sprop_level_parameter_sets =
01-10 13:51:41.426293   534   846 D [VT][MADebug]: [printH264CodecParam]Line 26 video_b_as                     =0
01-10 13:51:41.426309   534   846 D [VT][MADebug]: [printH264CodecParam]Line 27 packetization_mode         =1
01-10 13:51:41.426322   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] codec_num = 1
01-10 13:51:41.426353   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] Save default local size W=320, H=240)
01-10 13:51:41.426369   534   846 D [VT]ImsMa: [getCodecParameterSets]Line 1145 [ID=0][enter]===informat 1 quality=0x1====
01-10 13:51:41.426400   534   846 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1 opID 8
01-10 13:51:41.426432   534   846 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1, vprofile:VIDEO_PROFILE_BASELINE, vlevel:VIDEO_LEVEL_3
01-10 13:51:41.426478   534   846 D [VT]ImsMa: [getCodecParameterSets]Line 1166 [ID=0] Numbers 7 
01-10 13:51:41.426509   534   846 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1 opID 8
01-10 13:51:41.426546   534   846 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1, vprofile:VIDEO_PROFILE_BASELINE, vlevel:VIDEO_LEVEL_3
01-10 13:51:41.426567   534   846 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=5(VIDEO_LEVEL_1_1), max_level=5(VIDEO_LEVEL_1_1)
01-10 13:51:41.426879   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.426970   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.428284   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.429403   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.430149   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.430378   534   846 I VDO_LOG : Profile:66, Level:11, wfd=0, vilte=0, bitrate=270, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 13:51:41.431021   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.431106   534   846 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00b8d8d41e14d3505020207844237)
01-10 13:51:41.431371   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.431865   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.433316   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.433376   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.433986   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.434111   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.435481   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.446784   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.447012   534   846 I VDO_LOG : Profile:66, Level:11, wfd=0, vilte=0, bitrate=270, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 13:51:41.447677   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.447749   534   846 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 13:51:41.447823  1126  1132 I zygote64: Do partial code cache collection, code=29KB, data=28KB
01-10 13:51:41.447972   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.448191  1126  1132 I zygote64: After code cache collection, code=29KB, data=28KB
01-10 13:51:41.448225  1126  1132 I zygote64: Increasing code cache capacity to 128KB
01-10 13:51:41.448541   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.448584   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.445000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:52): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.450229   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.450298   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.450583   534   846 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00b, max_recv_level=11,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAC42NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 13:51:41.450691   534   846 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=6(VIDEO_LEVEL_1_2), max_level=6(VIDEO_LEVEL_1_2)
01-10 13:51:41.452215   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.452424  1304  1304 D OP20RoamingSettingsReceiver: Subinfo Record Update: -2
01-10 13:51:41.453550   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.455121   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.458321   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.458689   534   846 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 13:51:41.459549   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.459712   534   846 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00c8d8d41e14d3505020207844237)
01-10 13:51:41.457000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:53): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.460044   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.460677   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.462310   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.462396   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.463386   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.464548   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.466101   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.468836   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.469108   534   846 I VDO_LOG : Profile:66, Level:12, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 13:51:41.469872   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.469975   534   846 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 13:51:41.470243   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.469000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:54): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.470867   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.471266  1304  1304 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 13:51:41.471336  1304  1304 D ImsExternalCallTracker: refreshCallPullState
01-10 13:51:41.471325   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.472295   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.472361   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.472574   534   846 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00c, max_recv_level=12,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LADI2NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 13:51:41.472666   534   846 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=7(VIDEO_LEVEL_1_3), max_level=7(VIDEO_LEVEL_1_3)
01-10 13:51:41.472779  1304  1304 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 13:51:41.473062   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.474594   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.476112   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.478531  1126  1126 D SignalClusterView: hasCorrectSubs, subsInfo:[],--mPhoneStates:[]
01-10 13:51:41.479100   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.479324   534   846 I VDO_LOG : Profile:66, Level:13, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 13:51:41.479973   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.480084   534   846 I [VT]VcodecCap: [genParameterSets] bssize(21), bs(000000016742c00d8d8d41e14d3505020207844237)
01-10 13:51:41.480347   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.477000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:55): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.480937   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.482411   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.482485   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.482960   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.484067   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.485596   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.488381   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.488635   534   846 I VDO_LOG : Profile:66, Level:13, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=240, Height=320, BufW=240, BufH=320, NonRefP=0, f:3
01-10 13:51:41.489259   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.489362   534   846 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 13:51:41.489661   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.489000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:56): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.490221   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.490401   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.491748   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.491864   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.492149   534   846 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c00d, max_recv_level=13,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LADY2NQeFNNQUCAgeEQjc=,aMpDyA==,           sprop_level_parameter_sets=, framesize=240-320
01-10 13:51:41.492253   534   846 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=8(VIDEO_LEVEL_2), max_level=8(VIDEO_LEVEL_2)
01-10 13:51:41.492751   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.494067   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.495666   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.498802   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.499067   534   846 I VDO_LOG : Profile:66, Level:20, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=288, Height=352, BufW=288, BufH=352, NonRefP=0, f:3
01-10 13:51:41.499104  1304  1304 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 13:51:41.499957   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.500090   534   846 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c0148d8d40905b4d41408081e1108dc0)
01-10 13:51:41.500302  1304  1304 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 13:51:41.497000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:57): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.500457   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.501096   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.502592  1304  1304 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 13:51:41.502765   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.502841   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.503414   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.503528  1304  1304 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 13:51:41.504473  1304  1304 D CarrierConfigLoader: mHandler: 0 phoneId: 0
01-10 13:51:41.504596  1304  1304 D CarrierSvcBindHelper: mHandler: 0
01-10 13:51:41.504639  1304  1304 D CarrierSvcBindHelper: Rebinding if necessary for phoneId: 0
01-10 13:51:41.504589   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.505316  1304  1304 D CarrierSvcBindHelper: No carrier app for: 0
01-10 13:51:41.506030  1304  1304 D ExtensionManager: [sGttInfoExt] create ext instance: com.mediatek.phone.ext.DefaultGttInfoExt@35c6adc
01-10 13:51:41.506073   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.507587  1304  1304 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 13:51:41.508663  1304  1304 E MtkPhoneIntfMgrEx: isEccInProgress, mIsEccInProgress:false
01-10 13:51:41.508794   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.509006   534   846 I VDO_LOG : Profile:66, Level:20, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=288, Height=352, BufW=288, BufH=352, NonRefP=0, f:3
01-10 13:51:41.509628   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.509717   534   846 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 13:51:41.509934   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.509000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:58): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.510532   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.511985   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.512048   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.512346   534   846 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c014, max_recv_level=20,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAFI2NQJBbTUFAgIHhEI3A,aMpDyA==,           sprop_level_parameter_sets=, framesize=288-352
01-10 13:51:41.512482   534   846 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=10(VIDEO_LEVEL_2_1), max_level=10(VIDEO_LEVEL_2_1)
01-10 13:51:41.512848   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.513166   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.514058   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.515557   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.518466   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.518695   534   846 I VDO_LOG : Profile:66, Level:21, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=320, Height=480, BufW=320, BufH=480, NonRefP=0, f:3
01-10 13:51:41.519459   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.519568   534   846 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c0158d8d40a07b4d41408081e1108dc0)
01-10 13:51:41.517000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:59): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.519849   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.520429   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.521938   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.522013   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.522544   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.523032  1304  1572 D CarrierConfigLoader: update config for phoneId: 0 simState: ABSENT
01-10 13:51:41.523197  1304  1572 D CarrierSvcBindHelper: update binding for phoneId: 0 simState: ABSENT
01-10 13:51:41.524560   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.526088   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.526698  1304  1304 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SIM_STATE_CHANGED
01-10 13:51:41.526798  1304  1304 D CdmaVolteServiceChecker: updateState, checking = false
01-10 13:51:41.527426  1304  1304 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 13:51:41.527586  1304  1304 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 13:51:41.528976   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.529226   534   846 I VDO_LOG : Profile:66, Level:21, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=320, Height=480, BufW=320, BufH=480, NonRefP=0, f:3
01-10 13:51:41.529930   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.530035   534   846 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 13:51:41.530290   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.529000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:60): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.530916   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.532327   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.532380   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.532428   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.532679   534   846 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c015, max_recv_level=21,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAFY2NQKB7TUFAgIHhEI3A,aMpDyA==,           sprop_level_parameter_sets=, framesize=320-480
01-10 13:51:41.532784   534   846 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=12(VIDEO_LEVEL_2_2), max_level=12(VIDEO_LEVEL_2_2)
01-10 13:51:41.533322   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.534681   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.536382   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.539627   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.539918   534   846 I VDO_LOG : Profile:66, Level:22, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 13:51:41.540983   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.541149   534   846 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c0168d8d40f028d35050202078442370)
01-10 13:51:41.537000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:61): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.541610   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.542433   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.544136   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.544256   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.545233   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.546443   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.548013   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.550903   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.551157   534   846 I VDO_LOG : Profile:66, Level:22, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 13:51:41.551791   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.551896   534   846 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 13:51:41.552132   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.549000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:62): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.552688   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.554216   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.554296   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.554515   534   846 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c016, max_recv_level=22,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAFo2NQPAo01BQICB4RCNw,aMpDyA==,           sprop_level_parameter_sets=, framesize=480-640
01-10 13:51:41.554580   534   846 I [VT]VcodecCap: [getH264CodecParam] in:profile=1(VIDEO_PROFILE_BASELINE), level=13(VIDEO_LEVEL_3), max_level=13(VIDEO_LEVEL_3)
01-10 13:51:41.554894   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.554904   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.556113   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.557636   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.560435   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.560677   534   846 I VDO_LOG : Profile:66, Level:30, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 13:51:41.561325   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.561499   534   846 I [VT]VcodecCap: [genParameterSets] bssize(22), bs(000000016742c01e8d8d40f028d35050202078442370)
01-10 13:51:41.561764   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.561000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:63): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.562460   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.563956   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.564022   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.564518   534   846 I VDO_LOG : [eValInit] pid = 0x216, driver type = 0x5
01-10 13:51:41.565685   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.567171   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:ON,current concurrency is 0x800,DDR=,EMI scenario=CON_SCE_VR4K ON
01-10 13:51:41.570072   534   846 I VDO_LOG : [tid: 846][WARN] the structure of h264_enc_prm is not sync 30, 276!!
01-10 13:51:41.570347   534   846 I VDO_LOG : Profile:66, Level:30, wfd=0, vilte=0, bitrate=416, framerate=30, I rate=30, maxratio=0, PfrmQLimiter=3, BfrmQLimiter=5, UseMBAFF=0, PreUltra=1, Width=480, Height=640, BufW=480, BufH=640, NonRefP=0, f:3
01-10 13:51:41.571042   534   846 I VDO_LOG : [tid: 846][h264_enc_customize_init] adaptivedrop: 1, u4Tuning: 0
01-10 13:51:41.571138   534   846 I [VT]VcodecCap: [genParameterSets] bssize(8), bs(0000000168ca43c8)
01-10 13:51:41.571413   534   846 E libc    : Access denied finding property "mtk.omx.venc.vfps.dump"
01-10 13:51:41.569000   534   534 W /system/bin/vtservice: type=1400 audit(0.0:64): avc: denied { open } for comm=494D4342206D73672068616E646C65 path="/dev/__properties__/u:object_r:mtk_em_video_log_omx_prop:s0" dev="tmpfs" ino=8131 scontext=u:r:vtservice:s0 tcontext=u:object_r:mtk_em_video_log_omx_prop:s0 tclass=file permissive=0
01-10 13:51:41.572135   534   846 I BWC     : emi_ddr_type_string_get is no longer available
01-10 13:51:41.573687   534   846 I BWC     : Profile_Change:[BWCPT_VIDEO_RECORD]:OFF,current concurrency is 0x0,DDR=,EMI scenario=CON_SCE_VR4K OFF
01-10 13:51:41.573795   534   846 I VDO_LOG : [eValDeInit] close VCodec_ValFd, VCodec_ValFd = -1
01-10 13:51:41.574035   534   846 I [VT]VcodecCap: [getH264CodecParam] out:profile_level_id=0x42c01e, max_recv_level=30,           redundant_pic_cap=0x0, sprop_parameter_sets=Z0LAHo2NQPAo01BQICB4RCNw,aMpDyA==,           sprop_level_parameter_sets=, framesize=480-640
01-10 13:51:41.574120   534   846 D [VT]ImsMa: [getCodecParameterSets]Line 1187 [ID=0][exit]===Numbers 7 ===mGetVideoCodecLevelFmtpPtr 0xe68da000=
01-10 13:51:41.574157   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] (H264) levelCapNumbers = 7 (need <= 32)
01-10 13:51:41.574195   534   846 D [VT]ImsMa: [getCodecParameterSets]Line 1145 [ID=0][enter]===informat 4 quality=0x1====
01-10 13:51:41.574225   534   846 D [VT]VcodecCap: [getCodecLevelParameterSets] quality: 1 opID 8
01-10 13:51:41.574256   534   846 D [VT]ImsMa: [getCodecParameterSets]Line 1166 [ID=0] Numbers 0 
01-10 13:51:41.574288   534   846 D [VT]ImsMa: [getCodecParameterSets]Line 1187 [ID=0][exit]===Numbers 0 ===mGetVideoCodecLevelFmtpPtr 0x0=
01-10 13:51:41.574302   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] (H265) levelCapNumbers = 0 (need <= 32)
01-10 13:51:41.574327   534   846 D [VT]ImsMa: [getCodecBitrateTable]Line 1108 [ID=0][enter]operatorID 8=======
01-10 13:51:41.574357   534   846 D [VT]ImsMa: [getCodecBitrateTable]Line 1111 [ID=0]tableCnt 21
01-10 13:51:41.574398   534   846 D [VT]ImsMa: [getCodecBitrateTable]Line 1128 [ID=0]tableCnt 21,mGetCodecBitrateTablePtr0xe68f3000
01-10 13:51:41.574416   534   846 D [VT]ImsMa: [getCodecBitrateTable]Line 1135 [ID=0][exit]count 21=mGetCodecBitrateTablePtr 0xe68f3000======
01-10 13:51:41.574430   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] bit rate table Cnt     = 21 (need <= 32)
01-10 13:51:41.574458   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] find match type = 1, count = 0
01-10 13:51:41.574475   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] extmap_num             = 1
01-10 13:51:41.574488   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] ext_id                 = 7
01-10 13:51:41.574501   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] direction              = 3
01-10 13:51:41.574513   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] ext_uri                = urn:3gpp:video-orientation
01-10 13:51:41.574526   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] cap.media_type         = 1
01-10 13:51:41.574538   534   846 I VT      : [SRV] [vt_rtp_codec_2_ua] cap.mime_Type          = 1
01-10 13:51:41.574554   534   846 I VT      : [SRV] [VT THREAD] VT_Send start, type = 101506, len:60076
01-10 13:51:41.574561   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.574585   534   846 I VT      : [SRV] [VT THREAD] VT_Send before type
01-10 13:51:41.574666   534   846 I VT      : [SRV] [VT THREAD] VT_Send before len
01-10 13:51:41.574683   534   846 I VT      : [SRV] [VT THREAD] VT_Send before data
01-10 13:51:41.574815   534   846 I VT      : [SRV] [VT THREAD] VT_Send end
01-10 13:51:41.574815   379   852 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] type : 101506
01-10 13:51:41.575101  1288  1391 I VT      : [JNI] Leaving SetCameraParameters
01-10 13:51:41.575370   379   852 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] len : 60076
01-10 13:51:41.575570   379   852 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] readblock ret: 1
01-10 13:51:41.575618   379   852 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] write to IMCB
01-10 13:51:41.575758   379   852 I VT HIDL : [IVT] [VT THREAD] [VT_READ_Thread] read from VTS
01-10 13:51:41.579843   986   986 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 13:51:41.580004   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=101506(0x00018C82), dst=VT1[7], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:41.580004   781   781 I VoLTE IMCB: ENTER imsvt_imcb_get_cap_rsp_handler()@0#6005
01-10 13:51:41.580004   781   781 I VoLTE IMCB: ENTER imcb_send_imc_vt_cap_query_rsp()@0#3157
01-10 13:51:41.580004   781   781 I VoLTE IMCB: Pure Mesage Send dest=IMCB[2], msg_id=100003(0x000186A3), len=3456, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:41.580004   781   781 I VoLTE IMCB: ENTER imcb_send_ua_vt_cap_setting()@0#3490
01-10 13:51:41.580004   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10023(0x00002727), len=60072, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:41.580004   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:41.584062   986  1000 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 13:51:41.585330  1340  1340 D SimSelectService: onReceive action=android.intent.action.ACTION_SUBINFO_RECORD_UPDATED
01-10 13:51:41.585912  1340  1340 D UtilsExt: autoSanity: false buildType: user
01-10 13:51:41.586021  1340  1340 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 13:51:41.595339  1126  1273 D NetworkController: subscriptions is null
01-10 13:51:41.595486  1340  1340 D SimSelectService: sub info update, type = 4, subs = null
01-10 13:51:41.595545  1340  1340 D SimSelectService: extra value no change, return
01-10 13:51:41.596400  1126  1273 D NetworkController: updateMobileControllers detectedType: 4
01-10 13:51:41.596770   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.599150  1126  1273 D NetworkController: isEmergencyOnly No sims 
01-10 13:51:41.608928  1304  1304 E MtkPhoneIntfMgrEx: getIccAppFamily, uiccType[0] = fullType = 0 iccType = 0
01-10 13:51:41.615521   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.620443  1304  1304 I zygote64: The ClassLoaderContext is a special shared library.
01-10 13:51:41.635465  1304  1304 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 13:51:41.638803   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.640172  1304  1304 D CarrierConfigLoader: mHandler: 0 phoneId: 0
01-10 13:51:41.640330  1304  1304 D CarrierSvcBindHelper: mHandler: 0
01-10 13:51:41.640368  1304  1304 D CarrierSvcBindHelper: Rebinding if necessary for phoneId: 0
01-10 13:51:41.640875  1304  1304 D CarrierSvcBindHelper: No carrier app for: 0
01-10 13:51:41.643540  1304  1304 D PhoneGlobals: onSubscriptionsChanged start
01-10 13:51:41.644677  1304  1304 D TelephonyUtils: isHotSwapHanppened : false
01-10 13:51:41.644761  1304  1304 D PhoneGlobals: onSubscriptionsChanged end
01-10 13:51:41.646279  1304  1304 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 13:51:41.657046   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.664878   527   558 D AAL     : 01-10 01:51:41.457 BL= 366,ESS= 256, 01-10 01:51:41.495 BL= 365,ESS= 256, 01-10 01:51:41.570 BL= 364,ESS= 256, 01-10 01:51:41.608 BL= 363,ESS= 256, 01-10 01:51:41.664 BL= 362,ESS= 256, 
01-10 13:51:41.671324  1304  1304 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SERVICE_STATE
01-10 13:51:41.671409  1304  1304 D CdmaVolteServiceChecker: updateState, checking = false
01-10 13:51:41.671871  1304  1304 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 13:51:41.671970  1304  1304 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 13:51:41.679913  1304  1310 I zygote64: Do partial code cache collection, code=36KB, data=58KB
01-10 13:51:41.680258  1304  1310 I zygote64: After code cache collection, code=36KB, data=58KB
01-10 13:51:41.680302  1304  1310 I zygote64: Increasing code cache capacity to 256KB
01-10 13:51:41.680436   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.681781  1304  1310 I zygote64: Compiler allocated 5MB to compile void com.mediatek.internal.telephony.MtkServiceStateTracker.pollStateDone()
01-10 13:51:41.685100  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 13:51:41.687320  1304  1304 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only global URI.
01-10 13:51:41.689793  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = true
01-10 13:51:41.698704   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.708257   540  1406 D NuPlayerDriver: notifyListener_l(0xed8af5b0), (2, 0, 0, -1), loop setting(0, 0)
01-10 13:51:41.708811   540  1423 D AudioTrack: pause(): 0xeb4cc000, mState = 1
01-10 13:51:41.708953   986   986 D MediaPlayer: handleMessage msg:(2, 0, 0)
01-10 13:51:41.710326   528  1506 D APM_AudioPolicyManager: setForceUse() usage 1, config 10, mPhoneState 0
01-10 13:51:41.716763   380   919 D AudioALSAHardware: +routing createAudioPatch Mixer->2
01-10 13:51:41.716969   380   919 D AudioALSAStreamManager: +setParameters(), IOport = 13, keyValuePairs = routing=2
01-10 13:51:41.720621   380   919 D         : -updateDeviceInfoForVoiceWakeUp(), mIsUseHeadsetMic = 0, bIsUseHeadsetMic = 0
01-10 13:51:41.720747   380   919 W AudioALSAStreamManager: routingOutputDevice(), flag: 6, mPhoneCallSpeechOpen = 0, output_devices == current_output_devices(0x2), return
01-10 13:51:41.722496   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.722909   380   919 D AudioALSAHardware: +routing createAudioPatch Mixer->2
01-10 13:51:41.723067   380   919 D AudioALSAStreamManager: +setParameters(), IOport = 21, keyValuePairs = routing=2
01-10 13:51:41.723208   380   919 D         : -updateDeviceInfoForVoiceWakeUp(), mIsUseHeadsetMic = 0, bIsUseHeadsetMic = 0
01-10 13:51:41.723261   380   919 W AudioALSAStreamManager: routingOutputDevice(), flag: 8, mPhoneCallSpeechOpen = 0, output_devices == current_output_devices(0x2), return
01-10 13:51:41.737885   528   921 D MtkAudioLoud: +close()
01-10 13:51:41.738025   528   921 D MtkAudioLoud: -close()
01-10 13:51:41.738060   528   921 E AudioFlinger_Threads: no wake lock to update, but system ready!
01-10 13:51:41.740623   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.749387   528   704 D APM_AudioPolicyManager: stopOutput() output 13, stream 1, session 17
01-10 13:51:41.749574   528   704 V APM::AudioOutputDescriptor: changeRefCount() stream 1, count 0
01-10 13:51:41.764243   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.780919  1126  1126 D StatusBarKeyguardViewManager: show() is called.
01-10 13:51:41.782379   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.785572  1126  1126 D StatusBarKeyguardViewManager: reset() is called, mShowing = true ,mOccluded = falsehideBouncerWhenShowing = true
01-10 13:51:41.785665  1126  1126 D StatusBarKeyguardViewManager: showBouncerOrKeyguard() is called.
01-10 13:51:41.792831  1304  1304 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 13:51:41.793292  1304  1304 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 13:51:41.793388  1304  1304 D ImsExternalCallTracker: refreshCallPullState
01-10 13:51:41.793370   986  1103 D AudioSystem: +setParameters(): A2dpSuspended=false 
01-10 13:51:41.793911   380   940 D AudioALSAHardware: +setParameters(): A2dpSuspended=false
01-10 13:51:41.794138   380   940 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "A2dpSuspended=false"
01-10 13:51:41.794156   380   940 D AudioALSAHardware: -setParameters(): A2dpSuspended=false 
01-10 13:51:41.794791  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.794827  1304  1304 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 13:51:41.794884  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.794919  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.796066   986  1103 D AudioService: setBluetoothScoOnInt : false, eventSource = resetBluetoothSco
01-10 13:51:41.796133   986  1103 D AudioSystem: +setParameters(): BT_SCO=off 
01-10 13:51:41.796415   380   940 D AudioALSAHardware: +setParameters(): BT_SCO=off
01-10 13:51:41.796649   380   940 W AudioALSAHardware: setParameters(), still have param.size() = 1, remain param = "BT_SCO=off"
01-10 13:51:41.796683   380   940 D AudioALSAHardware: -setParameters(): BT_SCO=off 
01-10 13:51:41.797404  1126  1126 V KeyguardSecurityView: showPrimarySecurityScreen(securityMode=None)
01-10 13:51:41.797451   528  1506 D APM_AudioPolicyManager: setForceUse() usage 0, config 0, mPhoneState 0
01-10 13:51:41.797536  1126  1126 D VoiceWakeupManagerProxy: getInstance(...) is called.
01-10 13:51:41.797616  1126  1126 D KeyguardSecurityView: showSecurityScreen() - get oldview forInvalid, get newview forNone
01-10 13:51:41.797731  1126  1126 D KeyguardSecurityView: Before update, mCurrentSecuritySelection = NoneAfter update, mCurrentSecuritySelection = None
01-10 13:51:41.797887   528  1506 D APM_AudioPolicyManager: setForceUse() usage 2, config 0, mPhoneState 0
01-10 13:51:41.798011  1126  1126 D StatusBarKeyguardViewManager: setNeedsInput() - needsInput = false
01-10 13:51:41.799233  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.799299  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.799328  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.800378  1126  1126 D StatusBarKeyguardViewManager: needsFullscreenBouncer() is false,show "Notification Keyguard" view.
01-10 13:51:41.806332  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.806440  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.806447   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.806489  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.813934  1304  1304 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 13:51:41.818461  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.818549  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.818581  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.818851  1540  1540 I PPL/PlatformManager: Bring service to foreground
01-10 13:51:41.820339  1304  1304 I VvmSimStateTracker: android.intent.action.SIM_STATE_CHANGED
01-10 13:51:41.821379  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.821513  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.821604  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.823949  1304  1304 D OP20RoamingSettingsReceiver: Subinfo Record Update: -2
01-10 13:51:41.824558   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.825066   546   582 I PPL/PPLAgent: checkCallerUidPermission(code:1,  uid:1000)
01-10 13:51:41.825215   546   582 I PPL/PPLAgent: OnTransact(1,16)
01-10 13:51:41.825233   546   582 I PPL/PPLAgent: readControlData enter
01-10 13:51:41.825262   546   582 W Parcel  : **** enforceInterface() expected 'PPLAgent' but read 'com.mediatek.internal.telephony.ppl.IPplAgent'
01-10 13:51:41.825295   546   582 I PPL/PPLAgent: enforceInterface fail
01-10 13:51:41.825313   546   582 I PPL/PPLAgent: readControlData enter
01-10 13:51:41.825482   546   582 D PPL/PPLAgent: open control data file error = No such file or directory
01-10 13:51:41.825507   546   582 I PPL/PPLAgent: readControlData exit
01-10 13:51:41.825774  1540  1540 W PPL/ControlData: buildControlData: data is empty, return empty instance
01-10 13:51:41.825961  1540  1540 D PPL/PPLManager: mCache.status = 0
01-10 13:51:41.826527  1540  1540 D PPL/PPLService: onStartCommand(Intent { act=android.intent.action.SIM_STATE_CHANGED flg=0x5000010 cmp=com.mediatek.ppl/.PplService (has extras) })
01-10 13:51:41.826654  1540  1540 D PPL/PPLService: action is android.intent.action.SIM_STATE_CHANGED
01-10 13:51:41.826686  1540  1540 I PPL/PPLService: Privacy Protection Lock is disabled. Exit.
01-10 13:51:41.828123  1126  1126 D StatusBar: disable<e i a s b H R c s q >
01-10 13:51:41.829904  1304  1304 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 13:51:41.833786  1540  1540 D PPL/PlatformManager: Exec stopForeground with para true.
01-10 13:51:41.836203  1126  1126 D NetworkController: isEmergencyOnly No sims 
01-10 13:51:41.836612  1126  1126 D StatusBar: disable<e i a s b H R c s q >
01-10 13:51:41.838386  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.838493  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.838534  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.839034  1126  1126 V KeyguardSecurityView: showPrimarySecurityScreen(securityMode=None)
01-10 13:51:41.839193  1126  1273 I FlashlightTile: flashLightEnable,mState.value:----false,false
01-10 13:51:41.840138  1540  1540 I PPL/PlatformManager: Bring service to foreground
01-10 13:51:41.841711  1126  1126 D StatusBarKeyguardViewManager: updateStates() - showing = true, mLastShowing = false
01-10 13:51:41.841711  1126  1126 D StatusBarKeyguardViewManager: updateStates() - occluded = falsemLastOccluded = false
01-10 13:51:41.841711  1126  1126 D StatusBarKeyguardViewManager: updateStates() - bouncerShowing = false, mLastBouncerShowing = false
01-10 13:51:41.841711  1126  1126 D StatusBarKeyguardViewManager: updateStates() - mFirstUpdate = true
01-10 13:51:41.841862  1126  1126 D StatusBarKeyguardViewManager: updateStates() - setBouncerShowing(false)
01-10 13:51:41.842022  1304  1304 I VvmSimStateTracker: android.intent.action.SIM_STATE_CHANGED
01-10 13:51:41.842073  1126  1126 D StatusBar: disable<e i a s b H R c s q >
01-10 13:51:41.845681   546   582 I PPL/PPLAgent: checkCallerUidPermission(code:1,  uid:1000)
01-10 13:51:41.845726   546   582 I PPL/PPLAgent: OnTransact(1,16)
01-10 13:51:41.845737   546   582 I PPL/PPLAgent: readControlData enter
01-10 13:51:41.845756   546   582 W Parcel  : **** enforceInterface() expected 'PPLAgent' but read 'com.mediatek.internal.telephony.ppl.IPplAgent'
01-10 13:51:41.845809   546   582 I PPL/PPLAgent: enforceInterface fail
01-10 13:51:41.845827   546   582 I PPL/PPLAgent: readControlData enter
01-10 13:51:41.845861   546   582 D PPL/PPLAgent: open control data file error = No such file or directory
01-10 13:51:41.845873   546   582 I PPL/PPLAgent: readControlData exit
01-10 13:51:41.846026  1304  1304 D OP20RoamingSettingsReceiver: Subinfo Record Update: -2
01-10 13:51:41.847416  1540  1540 W PPL/ControlData: buildControlData: data is empty, return empty instance
01-10 13:51:41.847531  1540  1540 D PPL/PPLManager: mCache.status = 0
01-10 13:51:41.847847  1540  1540 D PPL/PPLService: onStartCommand(Intent { act=android.intent.action.SIM_STATE_CHANGED flg=0x5000010 cmp=com.mediatek.ppl/.PplService (has extras) })
01-10 13:51:41.847904  1540  1540 D PPL/PPLService: action is android.intent.action.SIM_STATE_CHANGED
01-10 13:51:41.847925  1540  1540 I PPL/PPLService: Privacy Protection Lock is disabled. Exit.
01-10 13:51:41.847948  1304  1304 W Settings: Setting msim_mode_setting has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 13:51:41.848190   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.850329  1540  1540 D PPL/PlatformManager: Exec stopForeground with para true.
01-10 13:51:41.852572  1126  1126 D KeyguardViewMediator: handle show call mKeyguardDisplayManager.show()
01-10 13:51:41.854262  1304  1304 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 13:51:41.864313  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.864459  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.864496  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.866795   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.868926  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = UNKNOWN
01-10 13:51:41.869048  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:41.869168  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:41.872324  1126  1126 D StatusBar: disable<e i a s b H R c s q >
01-10 13:51:41.872925  1126  1126 D StatusBar: disable<e i a s b H R c s q >
01-10 13:51:41.876749   986  1072 I InputReader: Reconfiguring input devices.  changes=0x00000004
01-10 13:51:41.879690  1126  1126 I Choreographer: Skipped 42 frames!  The application may be doing too much work on its main thread.
01-10 13:51:41.889810   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.891165   527   558 D AAL     : 01-10 01:51:41.702 BL= 361,ESS= 256, 01-10 01:51:41.759 BL= 360,ESS= 256, 01-10 01:51:41.796 BL= 359,ESS= 256, 01-10 01:51:41.853 BL= 358,ESS= 256, 01-10 01:51:41.891 BL= 357,ESS= 256, 
01-10 13:51:41.900641  1126  1132 I zygote64: Do partial code cache collection, code=53KB, data=49KB
01-10 13:51:41.901013  1126  1132 I zygote64: After code cache collection, code=53KB, data=49KB
01-10 13:51:41.901043  1126  1132 I zygote64: Increasing code cache capacity to 256KB
01-10 13:51:41.907905   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.921204   401   420 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) queueBuffer: fps=23.97 dur=1001.18 max=45.68 min=37.12
01-10 13:51:41.931569   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.937454   401   401 I BufferQueueConsumer: [StatusBar#0](this:0x7300cf4800,id:3,api:1,p:1126,c:401) setDefaultBufferSize: width=720 height=1280
01-10 13:51:41.942221  1126  1376 D Surface : Surface::disconnect(this=0x7473b68000,api=1)
01-10 13:51:41.942424   401  1350 I BufferQueueProducer: [StatusBar#0](this:0x7300cf4800,id:3,api:1,p:1126,c:401) disconnect(P): api 1
01-10 13:51:41.942949   401  1350 I BufferQueueConsumer: [StatusBar#0](this:0x7300cf4800,id:3,api:1,p:-1,c:401) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 13:51:41.943220  1126  1376 D Surface : Surface::connect(this=0x7473b68000,api=1)
01-10 13:51:41.943453   401   519 I BufferQueueProducer: [StatusBar#0](this:0x7300cf4800,id:3,api:1,p:1126,c:401) connect(P): api=1 producer=(1126:com.android.systemui) producerControlledByApp=true
01-10 13:51:41.944180  1126  1376 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 13:51:41.949713   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.955312  1126  1126 D StatusBar: disable<e i a s b H R c s q >
01-10 13:51:41.956630  1126  1126 W View    : requestLayout() improperly called by com.android.keyguard.CarrierText{d9f03f4 V.ED..... ..S...ID 32,0-452,80 #7f0a013f app:id/keyguard_carrier_text} during layout: running second layout pass
01-10 13:51:41.973315   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:41.991405   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:41.991880  1126  1376 D HWUIExtension: MTKProgramCache.generateProgram: 1142461300744
01-10 13:51:41.997909  1126  1376 D HWUIExtension: MTKProgramCache.generateProgram: 562984313159683
01-10 13:51:41.998573  1126  1376 D HWUIExtension: createProgram 0x0002000800000003, binary 0x750f36a3ac, length 5140, format 36705 within 559ns
01-10 13:51:42.000226  1126  1376 D HWUIExtension: MTKProgramCache.generateProgram: 562949953421313
01-10 13:51:42.000947  1126  1376 D HWUIExtension: createProgram 0x0002000000000001, binary 0x750f3656c8, length 4944, format 36705 within 575ns
01-10 13:51:42.002074  1126  1376 D HWUIExtension: MTKProgramCache.generateProgram: 240518168576
01-10 13:51:42.002651  1126  1376 D HWUIExtension: createProgram 0x0000003800000000, binary 0x750f3643fc, length 4812, format 36705 within 498ns
01-10 13:51:42.003099  1126  1376 D HWUIExtension: MTKProgramCache.generateProgram: 562984322596929
01-10 13:51:42.005069  1126  1376 D HWUIExtension: MTKProgramCache.generateProgram: 562984313159681
01-10 13:51:42.005658  1126  1376 D HWUIExtension: createProgram 0x0002000800000001, binary 0x750f36dc84, length 5140, format 36705 within 507ns
01-10 13:51:42.015246   485   503 D skia    : SkJpegCodec::onGetPixels + (720, 1280)
01-10 13:51:42.023930  1126  1126 D Surface : Surface::connect(this=0x7473b6a000,api=1)
01-10 13:51:42.024331   401  1350 I BufferQueueProducer: [com.android.systemui.ImageWallpaper#0](this:0x72f9c0f800,id:4,api:1,p:1126,c:401) connect(P): api=1 producer=(1126:com.android.systemui) producerControlledByApp=true
01-10 13:51:42.025088  1126  1126 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 13:51:42.025976  1126  1126 D ImageWallpaper: inside loadTexture
01-10 13:51:42.033530   485   503 D skia    : SkJpegCodec::onGetPixels -
01-10 13:51:42.045513  1126  1126 D Surface : Surface::disconnect(this=0x7473b6a000,api=1)
01-10 13:51:42.045811   401   420 I BufferQueueProducer: [com.android.systemui.ImageWallpaper#0](this:0x72f9c0f800,id:4,api:1,p:1126,c:401) disconnect(P): api 1
01-10 13:51:42.045921   401   420 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x72f9c0f800,id:4,api:1,p:-1,c:401) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 13:51:42.049816  1126  1126 D KeyguardUpdateMonitor: Phone# 0, state = NOT_READY
01-10 13:51:42.052618   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:42.053175   781   826 I chatty  : uid=1000(system) /vendor/bin/volte_imcb identical 1 line
01-10 13:51:42.053722   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:42.053930   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100116(0x00018714), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:42.053930   781   781 I VoLTE IMCB: ENTER imcb_imc_tlv_para_setting_ind_handler()@0#5493
01-10 13:51:42.053930   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10021(0x00002725), len=24, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:42.053930   781   781 I VoLTE IMCB: send REQ_UPDATE_RT_SETTING from tlv_para IMC to UA imcb_imc_tlv_para_setting_ind_handler()@0#5518
01-10 13:51:42.053930   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:42.054028  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 13:51:42.054529   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100034(0x000186C2), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:42.054529   781   781 I VoLTE IMCB: ENTER imcb_imc_rat_change_ind_handler()@0#5313
01-10 13:51:42.054529   781   781 I VoLTE IMCB: from rat type = 0, to ua rat = 8 imcb_rat_conv_to_ua()@0#124
01-10 13:51:42.054529   781   781 I VoLTE IMCB: from rat type = 1, to ua rat = 9 @0#124
01-10 13:51:42.054529   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10013(0x0000271D), len=192, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:42.054529   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:42.055072   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100034(0x000186C2), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:42.055072   781   781 I VoLTE IMCB: ENTER imcb_imc_rat_change_ind_handler()@0#5313
01-10 13:51:42.055072   781   781 I VoLTE IMCB: from rat type = 0, to ua rat = 8 imcb_rat_conv_to_ua()@0#124
01-10 13:51:42.055072   781   781 I VoLTE IMCB: from rat type = 1, to ua rat = 9 @0#124
01-10 13:51:42.055072   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10013(0x0000271D), len=192, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:42.055072   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:42.055388   780   816 I VoLTE UA: Update acct[0] lte_attach_type = 1 (module/volte//volte_ua/src/call/acct.c:5557)
01-10 13:51:42.055574   780   818 I VoLTE SMS: SMS psismsc_from_user = 0, force_psi_scheme_to_tel = 0, add_user_phone = 1, update_call_id_with_host = 0 (module/volte//volte_ua/src/sms/sms.c:301)
01-10 13:51:42.055644   780   818 I VoLTE SMS: SMS add_no_fork = 0, nsn_specific = 0, mo_retry_after_504 = 0, send_timerF_expiry = 0 (module/volte//volte_ua/src/sms/sms.c:308)
01-10 13:51:42.055682   780   818 I VoLTE SMS: SMS imsi_reged_disable_sms = 0, retry_count = 0, retry_duration = 0, wfc_with_plani = 0, in_reply_to_support = 1, check_reason_phase = 0, pani_country = 0, restore_in_3gpp_abnormal = 1, sms_force_sip_uri = 0 (module/volte//volte_ua/src/sms/sms.c:320)
01-10 13:51:42.058052  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = NOT_READY
01-10 13:51:42.058091  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:42.058139  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:42.058289   485   503 D Surface : Surface::disconnect(this=0x7dbdc40000,api=1)
01-10 13:51:42.058753   401   420 I BufferQueueProducer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:485,c:401) disconnect(P): api 1
01-10 13:51:42.058904   401   420 I BufferQueueConsumer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:-1,c:401) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 13:51:42.062714  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 13:51:42.064566   485   485 I         : [MALI] @eglp_check_display_valid_and_initialized_and_retain: MALI_EGL_DISPLAY_INITIALIZED != dpy->state (EGL_NOT_INITIALIZED)
01-10 13:51:42.069640   401   401 I BufferQueueConsumer: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:-1,c:-1) disconnect(C)
01-10 13:51:42.071933   401   401 I BufferQueue: [BootAnimation#0](this:0x72f9c0e000,id:1,api:1,p:-1,c:-1) ~BufferQueueCore
01-10 13:51:42.086488  1304  1536 E MtkPhoneIntfMgrEx: [setLocationInfoWifiMac] pheonId:0
01-10 13:51:42.091335  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 13:51:42.096427  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = NOT_READY
01-10 13:51:42.096477  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:42.096540  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:42.101972   986   986 I GnssLocationProvider: WakeLock acquired by sendMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 13:51:42.105606   781   826 I VoLTE IMCB-CM: receive the nessage from IMC #72
01-10 13:51:42.106549   986  1000 I GnssLocationProvider: WakeLock released by handleMessage(SUBSCRIPTION_OR_SIM_CHANGED, 0, null)
01-10 13:51:42.106799   781   781 I VoLTE IMCB: {{{{[process_msg] msg_id=100135(0x00018727), dst=IMCB[2], IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 @0#187
01-10 13:51:42.106799   781   781 I VoLTE IMCB: Pure Mesage Send dest=UA[3], msg_id=10024(0x00002728), len=2044, IMCB_IMC_HEADER_FILE_VERNO=6c, MSG_ID_IMC_IN_BEGIN=100000, IMC_FEATURE_BITMAP=0x3 imcb_send_to_COMM()@0#248
01-10 13:51:42.106799   781   781 I VoLTE IMCB: EndofMessage process_msg()@0#236}}}}
01-10 13:51:42.107635  1340  1340 D SimSelectService: onReceive action=android.intent.action.ACTION_SUBINFO_RECORD_UPDATED
01-10 13:51:42.107865  1340  1340 D UtilsExt: autoSanity: false buildType: user
01-10 13:51:42.107988  1340  1340 W Settings: Setting airplane_mode_on has moved from android.provider.Settings.System to android.provider.Settings.Global, returning read-only value.
01-10 13:51:42.108151  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 13:51:42.109722  1340  1340 D SimSelectService: sub info update, type = 4, subs = null
01-10 13:51:42.109777  1340  1340 D SimSelectService: extra value no change, return
01-10 13:51:42.111487  1126  1273 D NetworkController: subscriptions is null
01-10 13:51:42.111726  1126  1273 D NetworkController: signal callbacks count not equals, reset subInfo, old = 0, new = 2
01-10 13:51:42.112647  1126  1273 D WifiSignalController: mCurrentState.inetCondition = 0
01-10 13:51:42.113771  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 13:51:42.114060  1126  1273 D NetworkController: isEmergencyOnly No sims 
01-10 13:51:42.114590  1126  1273 D NetworkController: updateMobileControllers detectedType: 4
01-10 13:51:42.116618   986  1339 I WifiService: setCountryCode uid=1001
01-10 13:51:42.116727   986  1339 D WifiCountryCode: Receive set country code request: cn
01-10 13:51:42.118324   527   558 D AAL     : 01-10 01:51:41.947 BL= 356,ESS= 256, 01-10 01:51:41.985 BL= 355,ESS= 256, 01-10 01:51:42.042 BL= 354,ESS= 256, 01-10 01:51:42.080 BL= 353,ESS= 256, 01-10 01:51:42.118 BL= 352,ESS= 256, 
01-10 13:51:42.119802  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = NOT_READY
01-10 13:51:42.119870  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:42.119910  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:42.126455  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = null, allSimsMissing = false
01-10 13:51:42.131167  1126  1126 D StatusBar: onNotificationPosted: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 13:51:42.131986  1126  1126 D StatusBar: onNotificationRemoved: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 13:51:42.134873  1126  1126 D StatusBar: onNotificationPosted: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 13:51:42.141644  1126  1126 D StatusBar: onNotificationRemoved: StatusBarNotification(pkg=com.mediatek.ppl user=UserHandle{0} id=1 tag=null key=0|com.mediatek.ppl|1|null|1000: Notification(channel=null pri=0 contentView=null vibrate=null sound=null defaults=0x0 flags=0x62 color=0x00000000 vis=PRIVATE))
01-10 13:51:42.155703  1126  1126 I zygote64: Deoptimizing void com.android.systemui.qs.tileimpl.QSIconViewImpl.onMeasure(int, int) due to JIT inline cache
01-10 13:51:42.156244   986  1339 D AlarmManagerService: Kernel timezone updated to -480 minutes west of GMT
01-10 13:51:42.158023   986   986 D NetworkTimeUpdateService: Received android.intent.action.NETWORK_SET_TIMEZONE
01-10 13:51:42.158122   986   986 D NetworkTimeUpdateService: mNitzReceiver Receive ACTION_NETWORK_SET_TIMEZONE
01-10 13:51:42.171396  1126  1273 D NetworkController: isEmergencyOnly No sims 
01-10 13:51:42.182128  1304  1304 D PhoneGlobals: onSubscriptionsChanged start
01-10 13:51:42.184202  1304  1304 D TelephonyUtils: isHotSwapHanppened : false
01-10 13:51:42.184336  1304  1304 D PhoneGlobals: onSubscriptionsChanged end
01-10 13:51:42.186510  1304  1304 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 13:51:42.204976   401   401 I DisplayDevice: [Built-in Screen (type:0)] fps:26.930887,dur:1113.96,max:131.14,min:7.80
01-10 13:51:42.224595  1304  1304 D CdmaVolteServiceChecker: onReceive, action = android.intent.action.SERVICE_STATE
01-10 13:51:42.224730  1304  1304 D CdmaVolteServiceChecker: updateState, checking = false
01-10 13:51:42.225488  1304  1304 D CdmaVolteServiceChecker: getMainCapabilitySubId = -2
01-10 13:51:42.225644  1304  1304 D CdmaVolteServiceChecker: mims_support = 1, subId = -2
01-10 13:51:42.227812  1304  1304 D OP20RoamingSettingsReceiver: Not Valid for this OP MCC/MNC, no handling further
01-10 13:51:42.231628  1304  1304 I ImsExternalCallTracker: handleVideoCapabilitiesChanged : isVideoCapable = false
01-10 13:51:42.231685  1304  1304 D ImsExternalCallTracker: refreshCallPullState
01-10 13:51:42.232923  1304  1304 E PhoneInterfaceManager: [PhoneIntfMgr] getIccId: ICC ID is null or empty.
01-10 13:51:42.238998   551   922 E lsc_nvram: [do_mkdir] fail to mkdir [/data/shading_otp]: 13[Permission denied] (do_mkdir){#65:vendor/mediatek/proprietary/hardware/mtkcam/aaa/source/mt6763/lsc_mgr/LscUtil.h}
01-10 13:51:42.239166   401   401 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x72f9c0f800,id:4,api:1,p:-1,c:401) setDefaultBufferSize: width=2048 height=1280
01-10 13:51:42.245150  1126  1126 D Surface : Surface::connect(this=0x7473b6a000,api=1)
01-10 13:51:42.245770   401   420 I BufferQueueProducer: [com.android.systemui.ImageWallpaper#0](this:0x72f9c0f800,id:4,api:1,p:1126,c:401) connect(P): api=1 producer=(1126:com.android.systemui) producerControlledByApp=true
01-10 13:51:42.237000   551   551 W HwBinder:551_2: type=1400 audit(0.0:65): avc: denied { add_name } for name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
01-10 13:51:42.246677  1126  1126 D mali_winsys: EGLint new_window_surface(egl_winsys_display *, void *, EGLSurface, EGLConfig, egl_winsys_surface **, egl_color_buffer_format *, EGLBoolean) returns 0x3000
01-10 13:51:42.247113  1126  1126 D ImageWallpaper: inside loadTexture
01-10 13:51:42.261215  1126  1126 D Surface : Surface::disconnect(this=0x7473b6a000,api=1)
01-10 13:51:42.261698   401   519 I BufferQueueProducer: [com.android.systemui.ImageWallpaper#0](this:0x72f9c0f800,id:4,api:1,p:1126,c:401) disconnect(P): api 1
01-10 13:51:42.261818   401   519 I BufferQueueConsumer: [com.android.systemui.ImageWallpaper#0](this:0x72f9c0f800,id:4,api:1,p:-1,c:401) getReleasedBuffers: returning mask 0xffffffffffffffff
01-10 13:51:42.268511  1126  1126 D KeyguardUpdateMonitor: Phone# 0, state = ABSENT
01-10 13:51:42.269869   401   519 I SurfaceFlinger: [SF client] DEL(0x7300829000) for (485:/system/bin/bootanimation)
01-10 13:51:42.273970  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 13:51:42.279482  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = ABSENT
01-10 13:51:42.279524  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:42.279571  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:42.280799   401   519 I SurfaceFlinger: Boot is finished (14485 ms)
01-10 13:51:42.285554  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 13:51:42.287887   401   519 D         : SF watch dog change threshold from 800 --> 500.
01-10 13:51:42.288088   527   558 D AAL     : 01-10 01:51:42.155 BL= 351,ESS= 256, 01-10 01:51:42.155 BL= 350,ESS= 256, 01-10 01:51:42.192 BL= 349,ESS= 256, 01-10 01:51:42.249 BL= 348,ESS= 256, 01-10 01:51:42.287 BL= 347,ESS= 256, 
01-10 13:51:42.293764   986  1009 D LocationManagerService: request 21198b passive Request[POWER_NONE passive fastest=+30m0s0ms] from android(1000 foreground [whitelisted])
01-10 13:51:42.295090  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 13:51:42.298184   390   390 D lights  : write_int open fd=7
01-10 13:51:42.298672   390   390 D lights  : write_int open fd=7
01-10 13:51:42.299219  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = ABSENT
01-10 13:51:42.299267  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:42.299297  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:42.303434  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 13:51:42.305744   527   558 D AAL     : onBacklightChanged: 409/1023 -> 405/1023(phy:1621/4095)
01-10 13:51:42.308067  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 13:51:42.312754  1126  1126 D KeyguardSecurityModel: isPinPukOrMeRequiredOfSubId() - phoneId = 0, simState = ABSENT
01-10 13:51:42.312788  1126  1126 D AntiTheftManager: getCurrentAntiTheftMode() is called.
01-10 13:51:42.312833  1126  1126 D KeyguardSecurityModel: mode current =None
01-10 13:51:42.316053   390   390 D lights  : write_int open fd=7
01-10 13:51:42.316692   390   390 D lights  : write_int open fd=7
01-10 13:51:42.318213  1126  1126 D CarrierText: updateCarrierText() - after combination, carrierFinalContent = 没有 SIM 卡, allSimsMissing = true
01-10 13:51:42.318780  1126  1126 D SignalClusterView: hasCorrectSubs, subsInfo:[],--mPhoneStates:[]
01-10 13:51:42.318867  1126  1126 D SignalClusterView: hasCorrectSubs, subsInfo:[],--mPhoneStates:[]
01-10 13:51:42.319512  1126  1126 D StatusBar: addNotification key=0|com.mediatek.ppl|1|null|1000
01-10 13:51:42.323948  1126  1126 W System  : ClassLoader referenced unknown path: 
01-10 13:51:42.325150   527   558 D AAL     : onBacklightChanged: 405/1023 -> 393/1023(phy:1573/4095)
01-10 13:51:42.334476   390   390 D lights  : write_int open fd=7
01-10 13:51:42.335095   390   390 D lights  : write_int open fd=7
01-10 13:51:42.335118  1126  1126 D StatusBar: No peeking: unimportant notification: 0|com.mediatek.ppl|1|null|1000
01-10 13:51:42.335648  1126  1126 W StatusBar: removeNotification for unknown key: 0|com.mediatek.ppl|1|null|1000
01-10 13:51:42.335669  1609  1609 I bootstat: Service started: /system/bin/bootstat --record_boot_complete 
01-10 13:51:42.337781  1126  1126 D StatusBar: removeNotification key=0|com.mediatek.ppl|1|null|1000 old=null
01-10 13:51:42.338755  1126  1126 D StatusBar: addNotification key=0|com.mediatek.ppl|1|null|1000
01-10 13:51:42.342141  1608  1608 D AEE_AEDV: Rtt command(type:0, file_path: arg0:0)
01-10 13:51:42.342578  1608  1608 D AEE_AEDV: aee:vrttdRtt waiting daemon finish the job...
01-10 13:51:42.343455   527   558 D AAL     : onBacklightChanged: 393/1023 -> 377/1023(phy:1509/4095)
01-10 13:51:42.343522   871   871 D AEE_AEDV: $===AEE===AEE===AEE===$
01-10 13:51:42.343613   871   871 D AEE_AEDV: p 0 poll events 1 revents 1
01-10 13:51:42.343695   871   871 D AEE_AEDV: requesting from: pid=1608 cmd=13
