----- timezone:GMT
<6>[    0.000000] -(0)[0:swapper]Booting Linux on physical CPU 0x0
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpuset
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpu
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys cpuacct
<6>[    0.000000] -(0)[0:swapper]Initializing cgroup subsys schedtune
<5>[    0.000000] -(0)[0:swapper]Linux version 4.4.95+ (jenkins@blqsrv820) (gcc version 6.3.1 20170109 (Linaro GCC 6.3-2017.02) ) #2 SMP PREEMPT Fri Dec 27 10:20:58 CET 2019
<6>[    0.000000] -(0)[0:swapper]Boot CPU: AArch64 Processor [410fd034]
<5>[    0.000000] -(0)[0:swapper]mrdump_get_cb: mrdump_cbaddr=0x000000000011e000, mrdump_cbsize=0x0000000000002000
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-9-ccci   :   0x7c000000 - 0x7d5fffff (0x1600000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-7-ccci   :   0x80000000 - 0x800fffff (0x100000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-6-SPM-reserved   :   0x77ff0000 - 0x77ffffff (0x10000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-5-framebuffer   :   0x7f220000 - 0x7feaffff (0xc90000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-4-tee-reserved   :   0xeeb00000 - 0xeff3ffff (0x1440000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-3-SPM-reserved   :   0x7feb0000 - 0x7febffff (0x10000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]mblock-2-SSPM-reserved   :   0x7fec0000 - 0x7ff7ffff (0xc0000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]atf-reserved-memory@44610000   :   0x54600000 - 0x5463ffff (0x40000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]reserve-memory-sspm_share   :   0x9ff80000 - 0x9fffffff (0x80000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-sspm_share, compatible id mediatek,reserve-memory-sspm_share
<6>[    0.000000] -(0)[0:swapper]Reserved memory: failed to allocate memory for node 'zone-movable-cma-memory'
<3>[    0.000000] -(0)[0:swapper][dram_dummy_read_reserve_mem_of_init] dram_rank0_addr = 0x0000000077fef000, size = 0x1000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-dram_r0_dummy_read, compatible id reserve-memory-dram_r0_dummy_read
<1>[    0.000000] -(0)[0:swapper][PHY layout]consys-reserve-memory   :   0xafe00000 - 0xafffffff (0x200000)
<6>[    0.000000] -(0)[0:swapper][CONNADP]reserve_memory_consys_fn: name: consys-reserve-memory, base: 0xafe00000, size: 0x200000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node consys-reserve-memory, compatible id mediatek,consys-reserve-memory
<3>[    0.000000] -(0)[0:swapper][dram_dummy_read_reserve_mem_of_init] dram_rank1_addr = 0x00000000eeaff000, size = 0x1000
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node reserve-memory-dram_r1_dummy_read, compatible id reserve-memory-dram_r1_dummy_read
<6>[    0.000000] -(0)[0:swapper][memblock]mediatek,pstore: 0x54410000 - 0x544f0000 (0xe0000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node pstore-reserved-memory@54410000, compatible id mediatek,pstore
<6>[    0.000000] -(0)[0:swapper][memblock]mediatek,minirdump: 0x544f0000 - 0x54500000 (0x10000)
<6>[    0.000000] -(0)[0:swapper]Reserved memory: initialized node minirdump-reserved-memory@544f0000, compatible id mediatek,minirdump
<5>[    0.000000] -(0)[0:swapper] mrdump region start = 0x0000000054000000 size =0x0000000000080000 is reserved already
<5>[    0.000000] -(0)[0:swapper] mrdump region start = 0x000000004489da80 size =0x0000000000001697 is reserved already
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x40000000 - 0x545fffff (0x14600000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x54640000 - 0x77feffff (0x239b0000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x78000000 - 0x7bffffff (0x4000000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x7d600000 - 0x7f21ffff (0x1c20000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x7ff80000 - 0x7fffffff (0x80000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0x80100000 - 0x9ff7ffff (0x1fe80000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0xa0000000 - 0xafdfffff (0xfe00000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0xb0000000 - 0xeeafffff (0x3eb00000)
<1>[    0.000000] -(0)[0:swapper][PHY layout]kernel   :   0xeff40000 - 0xffffffff (0x100c0000)
<7>[    0.000000] -(0)[0:swapper]On node 0 totalpages: 771216
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 12288 pages used for memmap
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 0 pages reserved
<7>[    0.000000] -(0)[0:swapper]  DMA zone: 771216 pages, LIFO batch:31
<6>[    0.000000] -(0)[0:swapper]psci: probing for conduit method from DT.
<6>[    0.000000] -(0)[0:swapper]psci: PSCIv1.0 detected in firmware.
<6>[    0.000000] -(0)[0:swapper]psci: Using standard PSCI v0.2 function IDs
<6>[    0.000000] -(0)[0:swapper]psci: Trusted OS migration not required
<6>[    0.000000] -(0)[0:swapper]psci: SMC Calling Convention v1.1
<6>[    0.000000] -(0)[0:swapper]PERCPU: Embedded 23 pages/cpu @ffffffc0bfe7c000 s54680 r8192 d31336 u94208
<7>[    0.000000] -(0)[0:swapper]pcpu-alloc: s54680 r8192 d31336 u94208 alloc=23*4096
<7>[    0.000000] -(0)[0:swapper]pcpu-alloc: [0] 0 [0] 1 [0] 2 [0] 3 [0] 4 [0] 5 [0] 6 [0] 7 
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM errata 855873
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM erratum 845719
<6>[    0.000000] -(0)[0:swapper]CPU features: enabling workaround for ARM erratum 855872
<6>[    0.000000] -(0)[0:swapper]Built 1 zonelists in Zone order, mobility grouping on.  Total pages: 758928
<6>[    0.000000] -(0)[0:swapper][cpu_ntf] <00>ffffff8008198188 (page_alloc_cpu_notify)
<5>[    0.000000] Kernel command line: console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6763 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=orange bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=0 bootprof.pl_t=4711 bootprof.lk_t=7366 bootprof.logo_t=1225 boot_reason=4 androidboot.serialno=S19F00013 androidboot.secureboot=49 androidboot.specialid=0 dlconfig_tof_offset=0 dlconfig_tof_x_talk=0 config_data_tof_offset_cali_flag=0 config_data_tof_xtalk_cali_flag=0 config_data_cp_index=0 config_data_charge_current=0 config_data_charge_termination_current=0 config_data_charge_voltage=0 config_data_recharge_threshold=0 config_data_precharge_current=0 config_data_pid_target_temperature=0 config_data_battery_profile_id=0 cmdline_power_on_flag=1 power_key_flag=0 power_on_threshold=<6>[    0.000000] -(0)[0:swapper]PID hash table entries: 4096 (order: 3, 32768 bytes)
<6>[    0.000000] -(0)[0:swapper]Dentry cache hash table entries: 524288 (order: 10, 4194304 bytes)
<6>[    0.000000] -(0)[0:swapper]Inode-cache hash table entries: 262144 (order: 9, 2097152 bytes)
<6>[    0.000000] -(0)[0:swapper]software IO TLB [mem 0xffe33000-0xffe73000] (0MB) mapped at [ffffffc0bfe33000-ffffffc0bfe72fff]
<6>[    0.000000] -(0)[0:swapper]Memory: 2729796K/3084864K available (11960K kernel code, 1714K rwdata, 4688K rodata, 5152K init, 4633K bss, 355068K reserved, 0K cma-reserved)
<5>[    0.000000] -(0)[0:swapper]Virtual kernel memory layout:
<5>[    0.000000]     modules : 0xffffff8000000000 - 0xffffff8008000000   (   128 MB)
<5>[    0.000000]     vmalloc : 0xffffff8008000000 - 0xffffffbdbfff0000   (   246 GB)
<5>[    0.000000]       .init : 0xffffff80090c9000 - 0xffffff80095d1000   (  5152 KB)
<5>[    0.000000]       .text : 0xffffff8008080000 - 0xffffff8008c2f000   ( 11964 KB)
<5>[    0.000000]     .rodata : 0xffffff8008c2f000 - 0xffffff80090c9000   (  4712 KB)
<5>[    0.000000]       .data : 0xffffff80095d1000 - 0xffffff800977db08   (  1715 KB)
<5>[    0.000000]     vmemmap : 0xffffffbdc0000000 - 0xffffffbfc0000000   (     8 GB maximum)
<5>[    0.000000]               0xffffffbdc0000000 - 0xffffffbdc3000000   (    48 MB actual)
<5>[    0.000000]     fixed   : 0xffffffbffe7fd000 - 0xffffffbffec00000   (  4108 KB)
<5>[    0.000000]     PCI I/O : 0xffffffbffee00000 - 0xffffffbfffe00000   (    16 MB)
<6>[    0.000000] -(0)[0:swapper][cpu_ntf] <00>ffffff80081d70b0 (slab_cpuup_callback)
<6>[    0.000000] -(0)[0:swapper]SLUB: HWalign=64, Order=0-0, MinObjects=0, CPUs=8, Nodes=1
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff80080eecd8 (sched_ilb_notifier)
<4>[    0.000000] -(0)[0:swapper/0]Initializing HMP scheduler:
<6>[    0.000000] -(0)[0:swapper/0]Preemptible hierarchical RCU implementation.
<6>[    0.000000] -(0)[0:swapper/0]	Build-time adjustment of leaf fanout to 64.
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008115b40 (rcu_cpu_notify)
<4>[    0.000000] -(0)[0:swapper/0]
<4>[    0.000000] -(0)[0:swapper/0]**********************************************************
<4>[    0.000000] -(0)[0:swapper/0]**   NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE   **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]** trace_printk() being used. Allocating extra memory.  **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]** This means that this is a DEBUG kernel and it is     **
<4>[    0.000000] -(0)[0:swapper/0]** unsafe for production use.                           **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]** If you see this message and you are not debugging    **
<4>[    0.000000] -(0)[0:swapper/0]** the kernel, report this immediately to your vendor!  **
<4>[    0.000000] -(0)[0:swapper/0]**                                                      **
<4>[    0.000000] -(0)[0:swapper/0]**   NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE NOTICE   **
<4>[    0.000000] -(0)[0:swapper/0]**********************************************************
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008366fc0 (radix_tree_callback)
<6>[    0.000000] -(0)[0:swapper/0]NR_IRQS:64 nr_irqs:64 0
<6>[    0.000000] -(0)[0:swapper/0]GIC: Using split EOI/Deactivate mode
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008392118 (gic_secondary_init)
<4>[    0.000000] -(0)[0:swapper/0]### gic-v3 init done. ###
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff80084564e0 (gic_sched_hotplug_callback)
<5>[    0.000000] -(0)[0:swapper/0]### gic-v3 scheduled pm init done ###
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff800811eae8 (timer_cpu_notify)
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008120670 (hrtimer_cpu_notify)
<3>[    0.000000] -(0)[0:swapper/0]mtk_infracfg_ao_init: infra mfg debug: 050000f2
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_init:arch_timer_rate(0xc65d40),PHYS_SECURE_PPI=1,PHYS_NONSECURE_PPI=2,VIRT_PPI=3,HYP_PPI=4
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_init:arch_timer_c3stop=1
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:arch_timer_rate(0xc65d40),arch_timer_use_virtual=0
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:request_percpu_irq PHYS_SECURE_PPI err=0
<6>[    0.000000] -(0)[0:swapper/0]arch_timer_register:request_percpu_irq PHYS_NONSECURE_PPI err=0
<6>[    0.000000] -(0)[0:swapper/0][cpu_ntf] <00>ffffff800895d000 (arch_timer_cpu_notify)
<6>[    0.000000] -(0)[0:swapper/0]Architected cp15 timer(s) running at 13.00MHz (phys).
<6>[    0.000000] -(0)[0:swapper/0]clocksource: arch_sys_counter: mask: 0xffffffffffffff max_cycles: 0x2ff89eacb, max_idle_ns: 440795202429 ns
<6>[    0.000000] -(0)[0:swapper/0]sched_clock: 56 bits at 13MHz, resolution 76ns, wraps every 4398046511101ns
<6>[    0.000054] -(0)[0:swapper/0][mtk_gpt] base=0xffffff8009c0e000, irq=5
<6>[    0.000065] -(0)[0:swapper/0][mtk_gpt] gpt1, base=0xffffff8009c0e010
<6>[    0.000074] -(0)[0:swapper/0][mtk_gpt] gpt2, base=0xffffff8009c0e020
<6>[    0.000082] -(0)[0:swapper/0][mtk_gpt] gpt3, base=0xffffff8009c0e030
<6>[    0.000090] -(0)[0:swapper/0][mtk_gpt] gpt4, base=0xffffff8009c0e040
<6>[    0.000097] -(0)[0:swapper/0][mtk_gpt] gpt5, base=0xffffff8009c0e050
<6>[    0.000105] -(0)[0:swapper/0][mtk_gpt] gpt6, base=0xffffff8009c0e060
<6>[    0.000143] -(0)[0:swapper/0][mtk_gpt] gpt1: clkdiv=1, cmp=128, hz=250, freq=32000
<6>[    0.000160] -(0)[0:swapper/0][mtk_gpt] acao clkevt, freq=32000
<6>[    0.001143] -(0)[0:swapper/0][cpu_ntf] <00>ffffff8008135700 (hotplug_cfd)
<6>[    0.134904] .(0)[0:swapper/0]console [ttyMT0] enabled
<3>[    0.135604] .(0)[0:swapper/0]ram_console: buffer start: 0xffffff8009c16000, size: 0x800
<3>[    0.136866] .(0)[0:swapper/0]pmic & external buck: 0xff
<3>[    0.137538] .(0)[0:swapper/0]ram_console: CPU notifier status: 2, 27, 0x0, 180000
<3>[    0.138503] .(0)[0:swapper/0]ram_console: CPU HPS footprint: 1591, 0x0, 11, 3923
<3>[    0.139466] .(0)[0:swapper/0]ram_console: last init function: 0xffffff8000dee090
<6>[    0.140545] .(0)[0:swapper/0]Calibrating delay loop (skipped), value calculated using timer frequency.. 26.00 BogoMIPS (lpj=52000)
<6>[    0.141810] .(0)[0:swapper/0]pid_max: default: 32768 minimum: 301
<6>[    0.142668] .(0)[0:swapper/0][cpu_ntf] <00>ffffff80082193a8 (buffer_cpu_notify)
<6>[    0.143613] .(0)[0:swapper/0]Security Framework initialized
<6>[    0.144333] .(0)[0:swapper/0]SELinux:  Initializing.
<7>[    0.145022] .(0)[0:swapper/0]SELinux:  Starting in permissive mode
<6>[    0.145066] .(0)[0:swapper/0]Mount-cache hash table entries: 8192 (order: 4, 65536 bytes)
<6>[    0.146112] .(0)[0:swapper/0]Mountpoint-cache hash table entries: 8192 (order: 4, 65536 bytes)
<6>[    0.147523] .(0)[0:swapper/0][cpu_ntf] <00>ffffff800819e0a8 (ratelimit_handler)
<6>[    0.148789] .(0)[0:swapper/0]Initializing cgroup subsys freezer
<6>[    0.149561] .(0)[0:swapper/0]Initializing cgroup subsys debug
<6>[    0.150332] .(0)[0:swapper/0][cpu_ntf] <00>ffffff80080a21c8 (smpboot_thread_call)
<6>[    0.151418] -(0)[0:swapper/0]init_heavy_tlb start.
<4>[    0.152043] -(0)[0:swapper/0]init_heavy_tlb: cpu=0 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.153199] -(0)[0:swapper/0]init_heavy_tlb: cpu=1 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.154360] -(0)[0:swapper/0]init_heavy_tlb: cpu=2 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.155520] -(0)[0:swapper/0]init_heavy_tlb: cpu=3 thresh_l=2147483647 thresh_h=250 max_capaicy=716
<4>[    0.156681] -(0)[0:swapper/0]init_heavy_tlb: cpu=4 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<4>[    0.157852] -(0)[0:swapper/0]init_heavy_tlb: cpu=5 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<4>[    0.159023] -(0)[0:swapper/0]init_heavy_tlb: cpu=6 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<4>[    0.160195] -(0)[0:swapper/0]init_heavy_tlb: cpu=7 thresh_l=250 thresh_h=2147483647 max_capaicy=1024
<6>[    0.161515] .(0)[1:swapper/0]ASID allocator initialised with 65536 entries
<6>[    0.162407] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080a7918 (cpu_callback)
<6>[    0.165432] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080bf1b8 (workqueue_cpu_up_callback)
<6>[    0.166458] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080bf510 (workqueue_cpu_down_callback)
<6>[    0.177509] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d64f8 (migration_call)
<6>[    0.178417] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d1950 (sched_cpu_active)
<6>[    0.179348] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d1918 (sched_cpu_inactive)
<6>[    0.181538] .(0)[1:swapper/0][cpu_ntf] <00>ffffff800817e6f0 (hotplug_event_notify)
<6>[    0.187032] .(0)[1:swapper/0][cpu_ntf] <00>ffffff800841d300 (cpu_hotplug_cb_notifier)
<6>[    0.188049] .(0)[1:swapper/0]CPU Hotplug Low Power Notification
<3>[    0.188827] .(0)[1:swapper/0]BOOTPROF:       188.826768: ON
<1>[    0.190037] .(0)[1:swapper/0]init_get_max_DRAM_size done. phone_dram_sz: 0xc0000000, kernel_mem_sz: 0xc0000000
<3>[    0.191375] .(0)[1:swapper/0]tag_devinfo_data size:200, HRID size:4
<3>[    0.192181] .(0)[1:swapper/0][devinfo][SegCode] Segment Code=0x11
<5>[    0.193008] .(0)[1:swapper/0]log_store: sram header address 0xffffff8009c18f00.
<5>[    0.193956] .(0)[1:swapper/0]log_store printk log buff addr:0x41787cc4, size 0x80000. buff flag 0x427.
<5>[    0.195141] .(0)[1:swapper/0]sram_dram_buff sig 0x5678ef90
<5>[    0.195857] .(0)[1:swapper/0]sram_dram_buff flag 0x427
<5>[    0.196529] .(0)[1:swapper/0]sram_dram_buff add 0x7ff80000
<5>[    0.197245] .(0)[1:swapper/0]sram_dram_buff size 0x40000
<5>[    0.197940] .(0)[1:swapper/0]sram_dram_buff offsize 0x20
<5>[    0.198645] .(0)[1:swapper/0]sram_dram_buff point 0x2a20c
<6>[    0.221481] .(0)[1:swapper/0]Brought up 8 CPUs
<6>[    0.222067] .(0)[1:swapper/0]SMP: Total of 8 processors activated.
<6>[    0.222887] .(0)[1:swapper/0]CPU features: detected feature: GIC system register CPU interface
<6>[    0.223991] .(0)[1:swapper/0]CPU: All CPU(s) started at EL2
<6>[    0.224768] -(0)[10:migration/0]alternatives: patching kernel code
<6>[    0.228685] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080c8cb8 (sched_domains_numa_masks_update)
<6>[    0.229781] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080daf30 (cpuset_cpu_active)
<6>[    0.230721] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080dafa8 (cpuset_cpu_inactive)
<6>[    0.231687] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80080d2ec0 (hotplug_hrtick)
<6>[    0.232930] .(0)[1:swapper/0][cpu_ntf] <00>ffffff80083dea78 (device_hotplug_notifier)
<1>[    0.260238] .(0)[1:swapper/0][PHY layout]tee_reserved_mem   :   0xeff00000 - 0xeff3ffff (0x40000)
<1>[    0.261416] .(0)[1:swapper/0][debug]available DRAM size = 0xc0000000
<1>[    0.261416] [PHY layout]FB (dt) :  0x7f220000 - 0x7feaffff  (0xc90000)
<1>[    0.263255] .(0)[1:swapper/0]
<1>[    0.263255]  register_restart_handler- 0xffffff8009bb6fd0, Notify call: - 0xffffff80088f4698
<1>[    0.264737] .(0)[1:swapper/0]ARCH_RESET register mtk_restart_handler  ok!!!!
<6>[    0.267571] .(0)[1:swapper/0]clocksource: jiffies: mask: 0xffffffff max_cycles: 0xffffffff, max_idle_ns: 7645041785100000 ns
<6>[    0.269015] .(0)[1:swapper/0]futex hash table entries: 2048 (order: 6, 262144 bytes)
<6>[    0.270556] .(1)[1:swapper/0]pinctrl core: initialized pinctrl subsystem
<4>[    0.271910] .(1)[1:swapper/0][PLAT DBG INFO] 0xd8a3: 0x11d80c(ffffff8009c1a80c), 64
<4>[    0.272912] .(1)[1:swapper/0][PLAT DBG INFO] 0xe31c: 0x11d84c(ffffff8009c1c84c), 16
<4>[    0.273892] .(1)[1:swapper/0][PLAT DBG INFO] 0x0: 0x0(          (null)), 0
<6>[    0.275148] .(1)[1:swapper/0]mtk_wdt_get_base_addr: compatible node found: toprgu
<6>[    0.276463] .(1)[1:swapper/0]NET: Registered protocol family 16
<6>[    0.278907] .(1)[1:swapper/0]ramoops: using module parameters
<3>[    0.279745] .(1)[1:swapper/0]ramoops: pstore:address is 0x54410000, size is 0xe0000, console_size is 0x40000, pmsg_size is 0x10000
<6>[    0.322098] .(4)[1:swapper/0]console [pstore-1] enabled
<6>[    0.322862] .(4)[1:swapper/0]pstore: Registered ramoops as persistent store backend
<6>[    0.323839] .(4)[1:swapper/0]ramoops: attached 0xe0000@0x54410000, ecc: 0/0
<3>[    0.324765] .(4)[1:swapper/0]BOOTPROF:       324.764999:probe: probe=platform_drv_probe drv=ramoops(ffffff800961f198)    45.009308ms
<3>[    0.326302] .(4)[1:swapper/0]BOOTPROF:       326.302769:initcall: ramoops_init    47.391539ms
<6>[    0.327747] .(4)[1:swapper/0][EMI] dram_type(1)
<6>[    0.328332] .(4)[1:swapper/0][EMI] ch_num(1)
<6>[    0.328914] .(4)[1:swapper/0][EMI] rk_num(2)
<6>[    0.329467] .(4)[1:swapper/0][EMI] rank0_size(0x10)
<6>[    0.329867] [EMI] rank1_size(0x8)<4>[    0.330460] .(4)[1:swapper/0]PWRAP reg: 0xffffff8009d96000,  irq: 12
<4>[    0.331338] -(1)[0:swapper/1]------------[ cut here ]------------
<3>[    0.331562] .(4)[1:swapper/0][DRAMC] dram info dram rank number = 2
<3>[    0.331567] .(4)[1:swapper/0][DRAMC] dram info dram rank0 base = 0x77fef000
<3>[    0.331569] .(4)[1:swapper/0][DRAMC] dram info dram rank1 base = 0xeeaff000
<3>[    0.331574] .(4)[1:swapper/0][DRAMC]find dt_scan_dram_info
<6>[    0.331695] .(4)[1:swapper/0]mtk_wdt_init ok
<4>[    0.336018] -(1)[0:swapper/1]WARNING: CPU: 1 PID: 0 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/drivers/misc/mediatek/pmic_wrap/mt6763/pwrap_hal.c:1485 mt_pmic_wrap_irq+0x118/0x1a0()
<4>[    0.338127] -(1)[0:swapper/1]Modules linked in:
<4>[    0.338506] -(1)[0:swapper/1]CPU: 1 PID: 0 Comm: swapper/1 Not tainted 4.4.95+ #2
<4>[    0.339470] -(1)[0:swapper/1]Hardware name: MT6763V/B (DT)
<4>[    0.340187] -(1)[0:swapper/1]Call trace:
<4>[    0.340706] -(1)[0:swapper/1][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    0.341596] -(1)[0:swapper/1][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    0.342442] -(1)[0:swapper/1][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    0.343287] -(1)[0:swapper/1][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    0.344242] -(1)[0:swapper/1][<ffffff80080a1d10>] warn_slowpath_null+0x18/0x20
<4>[    0.345175] -(1)[0:swapper/1][<ffffff8008534168>] mt_pmic_wrap_irq+0x118/0x1a0
<4>[    0.346108] -(1)[0:swapper/1][<ffffff800810ab5c>] handle_irq_event_percpu+0x6c/0x250
<4>[    0.347106] -(1)[0:swapper/1][<ffffff800810ad88>] handle_irq_event+0x48/0x78
<4>[    0.348017] -(1)[0:swapper/1][<ffffff800810e9b8>] handle_fasteoi_irq+0xb8/0x1b0
<4>[    0.348960] -(1)[0:swapper/1][<ffffff8008109fbc>] generic_handle_irq+0x24/0x38
<4>[    0.349893] -(1)[0:swapper/1][<ffffff800810a304>] __handle_domain_irq+0xac/0x280
<4>[    0.350847] -(1)[0:swapper/1][<ffffff8008081960>] gic_handle_irq+0xe8/0x19c
<4>[    0.351748] -(1)[0:swapper/1]Exception stack(0xffffffc0401c3ce0 to 0xffffffc0401c3e10)
<4>[    0.352770] -(1)[0:swapper/1]3ce0: ffffff800914c018 0000000000000000 00000040b6d47000 0000000000000000
<4>[    0.353963] -(1)[0:swapper/1]3d00: 00000040b6d47000 00000000000001c0 00000000fffedb44 0000000000000000
<4>[    0.355156] -(1)[0:swapper/1]3d20: ffffffc0401b2930 ffffffc0401c3e80 00000000000008d0 0000000000000001
<4>[    0.356349] -(1)[0:swapper/1]3d40: 0000000000000002 0000000000000270 ffffff80097092f0 ffffff8009709390
<4>[    0.357542] -(1)[0:swapper/1]3d60: 0000000000000007 0000000000000001 ffffff80097092f0 ffffff8009712ac8
<4>[    0.358736] -(1)[0:swapper/1]3d80: ffffff8009712000 ffffff800914c000 ffffff800914c018 ffffff80095dbf58
<4>[    0.359929] -(1)[0:swapper/1]3da0: 0000000000000000 0000000000000000 ffffff80091517e0 ffffffc0401b2000
<4>[    0.361122] -(1)[0:swapper/1]3dc0: ffffff8008c36000 ffffffc0401c3f10 ffffff8008085a24 ffffffc0401c3f10
<4>[    0.362314] -(1)[0:swapper/1]3de0: ffffff8008085a28 0000000060000145 ffffffc0401b2000 ffffff80080ee520
<4>[    0.363507] -(1)[0:swapper/1]3e00: ffffffffffffffff ffffff8008c24890
<4>[    0.364329] -(1)[0:swapper/1][<ffffff8008084878>] el1_irq+0xb8/0x130
<4>[    0.365154] -(1)[0:swapper/1][<ffffff8008085a28>] arch_cpu_idle+0x38/0x138
<4>[    0.366043] -(1)[0:swapper/1][<ffffff80080f5e44>] cpu_startup_entry+0x1dc/0x358
<4>[    0.366987] -(1)[0:swapper/1][<ffffff8008090254>] secondary_start_kernel+0x24c/0x400
<4>[    0.367984] -(1)[0:swapper/1][<0000000040c2903c>] 0x40c2903c
<4>[    0.368729] -(1)[0:swapper/1]---[ end trace 97123305e0c74796 ]---
<6>[    0.373032] .(4)[1:swapper/0]cpuidle: using governor menu
<3>[    0.373733] .(4)[1:swapper/0]BOOTPROF:       373.733384:initcall: init_menu    42.025769ms
<6>[    0.381083] .(4)[1:swapper/0]cpuidle: using governor mtk_menu
<3>[    0.382584] .(4)[1:swapper/0]Power/swap IDLE BLOCKING INFO SETTING FAIL (type:3)
<6>[    0.384610] .(4)[1:swapper/0]vdso: 2 pages (1 code @ ffffff8008c35000, 1 data @ ffffff80095d9000)
<6>[    0.385783] .(4)[1:swapper/0]hw-breakpoint: found 6 breakpoint and 4 watchpoint registers.
<6>[    0.386996] .(4)[1:swapper/0]DMA: preallocated 256 KiB pool for atomic allocations
<4>[    0.388088] .(4)[1:swapper/0][EIC] no built in eint hw deb property
<4>[    0.388894] .(4)[1:swapper/0][EIC] builtin_mapping: spec=11, len=21
<4>[    0.389707] .(4)[1:swapper/0][EIC] debtime_setting: entry=10, spec=0, len=20
<5>[    0.391141] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: cluster_num = 2
<5>[    0.392055] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: ppm cluster 0 -> core_num = 4, cpu_id = 0
<5>[    0.393258] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: ppm cluster 1 -> core_num = 4, cpu_id = 4
<5>[    0.394463] .(4)[1:swapper/0][Power/PPM] @ppm_main_data_init: done!
<5>[    0.395410] .(4)[1:swapper/0][Power/PPM] @ppm_main_pdrv_probe: ppm probe done!
<5>[    0.396353] .(4)[1:swapper/0][Power/PPM] ppm_profile_init done
<5>[    0.397101] .(4)[1:swapper/0][Power/PPM] ppm driver init done!
<4>[    0.398032] .(4)[1:swapper/0]### CIRQ init done. ###
<4>[    0.399079] .(4)[1:swapper/0][DISP]init_log_buffer success
<5>[    0.400001] .(4)[1:swapper/0]
<5>[    0.400001]  MTK_SIP_KERNEL_WDT - 0xffffff80087d9d70
<5>[    0.401047] .(4)[1:swapper/0]
<5>[    0.401047]  atf_aee_debug_virt_addr = 0xffffff8009df0000
<5>[    0.404900] .(4)[1:swapper/0]mrdump_cblock_init: done.
<3>[    0.405616] .(4)[1:swapper/0]mrdump_platform_init: MT-RAMDUMP init failed, lk version  not matched.
<1>[    0.406791] .(4)[1:swapper/0]mrdump_wd_dram_reserved_mode: DDR Reserved Mode ready or not? (yes)
<6>[    0.407961] .(4)[1:swapper/0]mtk_wdt_swsysret_config: before set wdt_sys_val =8000
<6>[    0.408929] .(4)[1:swapper/0]mtk_wdt_swsysret_config: after set wdt_sys_val =8000,wdt_sys_val=88008000
<6>[    0.410123] .(4)[1:swapper/0]mtk_rgu_dram_reserved: MTK_WDT_MODE(0xdd)
<1>[    0.410967] .(4)[1:swapper/0]mrdump_wd_dram_reserved_mode: DDR reserved mode enabled
<6>[    0.411977] .(4)[1:swapper/0]mrdump_hw_init: init_done.
<5>[    0.412692] .(4)[1:swapper/0]mirdump: reserved 544f0000+3000->ffffff8009dfb000
<4>[    0.419354] .(4)[1:swapper/0]mt6763 pinctrl probe
<4>[    0.420346] .(4)[1:swapper/0]mtk_pctrl_init------ ok
<6>[    0.421334] .(4)[1:swapper/0]mtk wdt driver probe ..
<6>[    0.422573] .(4)[1:swapper/0]ext_debugkey_eint=-1
<6>[    0.425962] .(4)[1:swapper/0][EMI] module probe.
<6>[    0.426691] .(4)[1:swapper/0][EMI DBG] INFRACFG_BASE@ ffffff8009e20000
<6>[    0.427552] .(4)[1:swapper/0][EMI DBG] INFRA_AO_BASE@ ffffff8009e22000
<6>[    0.428433] .(4)[1:swapper/0][EMI DBG] PERICFG_BASE@ ffffff8009e24000
<6>[    0.429257] .(4)[1:swapper/0][EMI] get CEN_EMI_BASE @ ffffff8009e18000
<6>[    0.430103] .(4)[1:swapper/0][EMI] get EMI_MPU_BASE @ ffffff8009e1a000
<6>[    0.430949] .(4)[1:swapper/0][EMI] get CH0_EMI_BASE @ ffffff8009e1c000
<6>[    0.431795] .(4)[1:swapper/0][EMI] get CH1_EMI_BASE @ ffffff8009e1e000
<6>[    0.432670] .(4)[1:swapper/0][MPU] initialize EMI MPU
<6>[    0.433336] .(4)[1:swapper/0][MPU] get MPU IRQ: 47
<7>[    0.437102] .(4)[1:swapper/0][DRAMC] module probe.
<4>[    0.437152] .(4)[1:swapper/0][DRAMC]get DRAMC_AO_CHA_BASE_ADDR @ ffffff8009e28000
<4>[    0.438107] .(4)[1:swapper/0][DRAMC]get DRAMC_AO_CHB_BASE_ADDR @ ffffff8009e2c000
<4>[    0.439072] .(4)[1:swapper/0][DRAMC]get DDRPHY_AO_CHA_BASE_ADDR @ ffffff8009e34000
<4>[    0.440048] .(4)[1:swapper/0][DRAMC]get DDRPHY_AO_CHB_BASE_ADDR @ ffffff8009e38000
<4>[    0.441041] .(4)[1:swapper/0][DRAMC]get DRAMC_NAO_CHA_BASE_ADDR @ ffffff8009e30000
<4>[    0.442005] .(4)[1:swapper/0][DRAMC]get DRAMC_NAO_CHB_BASE_ADDR @ ffffff8009e32000
<4>[    0.442981] .(4)[1:swapper/0][DRAMC]get DDRPHY_NAO_CHA_BASE_ADDR @ ffffff80083e0528
<4>[    0.443968] .(4)[1:swapper/0][DRAMC]get DDRPHY_NAO_CHB_BASE_ADDR @ ffffffc04015ba80
<4>[    0.445070] .(4)[1:swapper/0][DRAMC]get SLEEP_BASE_ADDR @ ffffff8009e3c000
<6>[    0.446021] .(4)[1:swapper/0][DRAMC]get SYS_TIMER_BASE_ADDR @ ffffff8009e3e000
<3>[    0.446943] .(4)[1:swapper/0][DRAMC Driver] dram type =1
<3>[    0.447636] .(4)[1:swapper/0][DRAMC Driver] Channel num =1
<3>[    0.448353] .(4)[1:swapper/0][DRAMC Driver] cbt mode =0
<3>[    0.449037] .(4)[1:swapper/0][DRAMC Driver] Dram Data Rate = 1866
<3>[    0.449845] .(4)[1:swapper/0][DRAMC Driver] shuffle_status = 0
<3>[    0.450599] .(4)[1:swapper/0][DRAMC Driver] dram can support DFS
<6>[    0.452069] .(4)[1:swapper/0]SSPM is ready to service IPI
<4>[    0.457403] .(4)[1:swapper/0]disp driver(1) disp_probe begin
<4>[    0.467127] .(4)[1:swapper/0]disp driver(1) disp_probe end
<3>[    0.491343] .(4)[1:swapper/0]BOOTPROF:       491.342769:initcall: arm64_device_init    75.876462ms
<4>[    0.492500] .(4)[1:swapper/0][pid=1]g_mmdvfs_step_util init with lp3
<4>[    0.493314] .(4)[1:swapper/0][pid=1]g_mmdvfs_step_util init
<3>[    0.496715] .(4)[1:swapper/0]systracker probe
<3>[    0.497288] .(4)[1:swapper/0]of_iomap for systracker @ 0xffffff8009e64000
<3>[    0.498161] .(4)[1:swapper/0][systracker] bus_dbg_con is in infra
<3>[    0.498986] .(4)[1:swapper/0]systracker_platform_probe_default:113: irq # 52
<6>[    0.519592] .(4)[1:swapper/0][cpu_ntf] <00>ffffff8008347730 (blk_cpu_notify)
<6>[    0.520512] .(4)[1:swapper/0][cpu_ntf] <00>ffffff8008347fa0 (blk_iopoll_cpu_notify)
<6>[    0.521496] .(4)[1:swapper/0][cpu_ntf] <00>ffffff800834e618 (blk_mq_main_cpu_notify)
<6>[    0.522488] .(4)[1:swapper/0][cpu_ntf] <00>ffffff800834b5d8 (blk_mq_queue_reinit_notify)
<6>[    0.524044] .(4)[1:swapper/0]mcdi_sysram_base = ffffff8009e68000
<4>[    0.526110] .(4)[1:swapper/0][M4U] mau_start_monitor [0], start=0x0, end=0xfffff, write: 1, port_mask=0xffffffff, larb_mask=0xffffffff
<4>[    0.527678] .(4)[1:swapper/0][M4U] mau_start_monitor [1], start=0x0, end=0xfffff, write: 0, port_mask=0xffffffff, larb_mask=0xffffffff
<4>[    0.530183] .(4)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.530953] .(4)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<6>[    0.536652] .(4)[1:swapper/0]mt6370_init (2.0.1_MTK): initializing...
<6>[    0.537581] .(4)[1:swapper/0]usb_type_c node found...
<6>[    0.538265] .(4)[1:swapper/0]tcpc_class_init (2.0.8_MTK)
<6>[    0.538948] .(4)[1:swapper/0]SVDM supported mode [0]: name = DisplayPort, svid = 0xff01
<6>[    0.539994] .(4)[1:swapper/0]SVDM supported mode [1]: name = Direct Charge, svid = 0x29cf
<6>[    0.541035] .(4)[1:swapper/0]dpm_check_supported_modes : found "disorder"...
<6>[    0.541958] .(4)[1:swapper/0]TCPC class init OK
<6>[    0.542549] .(4)[1:swapper/0]pd_dbg_info_init
<5>[    0.543224] .(4)[1:swapper/0][CMDQ]Register 1 monitor task CB (cmdq_mdp_start_task_atomic_virtual,cmdq_mdp_finish_task_atomic_virtual)
<5>[    0.545163] .(4)[1:swapper/0][CMDQ][CMDQ] platform_dev dev:ffffffc05f724410 PA:0x0000000010238000 VA:ffffff8009e82000 irqId:60 irqSecId:61 clk gce:0xffffffc05f0bbe80 timer:0xffffffc05f0bbf80
<5>[    0.547305] .(4)[1:swapper/0][CMDQ]set dma mask result: 0
<5>[    0.548056] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mmsys_config): 0xffffff8009e84000
<5>[    0.549041] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rdma0): 0xffffff8009e86000
<5>[    0.549975] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rsz0): 0xffffff8009e88000
<5>[    0.550896] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_rsz1): 0xffffff8009e8a000
<5>[    0.551818] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_wdma0): 0xffffff8009e8c000
<5>[    0.552750] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_wrot0): 0xffffff8009e8e000
<5>[    0.553699] .(4)[1:swapper/0][CMDQ]DEV: VA ref(mdp_tdshp0): 0xffffff8009e90000
<5>[    0.554645] .(4)[1:swapper/0][CMDQ]DEV: VA ref(disp_color0): 0xffffff8009e92000
<5>[    0.555605] .(4)[1:swapper/0][CMDQ]DEV: VA ref(venc): 0xffffff8009e94000
<5>[    0.558031] .(4)[1:swapper/0][CMDQ]DEV: PA ref(mm_mutex): start = 0x0000000014016000
<5>[    0.559028] .(4)[1:swapper/0][CMDQ]free CPR size:544 thread:16
<5>[    0.561381] .(4)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x0, count: 64, Name: Fake SPR
<5>[    0.562545] .(4)[1:swapper/0][CMDQ]CPR for thread allocated, thread:16 free:1920
<5>[    0.563490] .(4)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x40, count: 10, Name: Delay CPR
<4>[    0.564672] .(4)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.565464] .(4)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<3>[    0.566430] .(4)[1:swapper/0]BOOTPROF:       566.429538:probe: probe=platform_drv_probe drv=mtk_cmdq(ffffff80096727d0)    21.361000ms
<3>[    0.568792] .(4)[1:swapper/0]BOOTPROF:       568.791538:initcall: cmdq_init    25.566616ms
<5>[    0.572260] .(4)[1:swapper/0][ccci0/util]opt_md2_support using default
<5>[    0.573199] .(4)[1:swapper/0][ccci0/util]opt_md5_support using default
<5>[    0.574121] .(4)[1:swapper/0][ccci0/util]opt_irat_support using default
<1>[    0.575430] .(4)[1:swapper/0][PHY layout]ccci_md0 at LK  :  0xb0000000 - 0xbf7fffff  (0xf800000)
<6>[    0.602674] .(4)[1:swapper/0]Freeing modem memory: 175936K from phys b3c30000
<6>[    0.603597] .(4)[1:swapper/0]free_reserved_memory: 0xb3c30000 ~ 0xbe800000
<6>[    0.604868] .(4)[1:swapper/0]Freeing modem memory: 1408K from phys b16a0000
<6>[    0.605758] .(4)[1:swapper/0]free_reserved_memory: 0xb16a0000 ~ 0xb1800000
<6>[    0.606848] .(4)[1:swapper/0]Freeing modem memory: 320K from phys b15b0000
<6>[    0.607726] .(4)[1:swapper/0]free_reserved_memory: 0xb15b0000 ~ 0xb1600000
<6>[    0.608790] .(4)[1:swapper/0]Freeing modem memory: 64K from phys b3bd0000
<6>[    0.609657] .(4)[1:swapper/0]free_reserved_memory: 0xb3bd0000 ~ 0xb3be0000
<6>[    0.610713] .(4)[1:swapper/0]Freeing modem memory: 64K from phys b3bf0000
<6>[    0.611579] .(4)[1:swapper/0]free_reserved_memory: 0xb3bf0000 ~ 0xb3c00000
<6>[    0.613845] .(4)[1:swapper/0]Freeing modem memory: 8192K from phys bf800000
<6>[    0.614734] .(4)[1:swapper/0]free_reserved_memory: 0xbf800000 ~ 0xc0000000
<1>[    0.616109] .(4)[1:swapper/0][PHY layout]ccci_share_mem at LK  :  0x80000000 - 0x800fffff  (0x100000)
<5>[    0.617342] .(4)[1:swapper/0][ccci0/util]Using default META MD setting[0][0]
<3>[    0.618525] .(4)[1:swapper/0]BOOTPROF:       618.524692:initcall: ccci_util_init    46.839924ms
<3>[    0.620344] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init message queue list succeed
<3>[    0.621409] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init active queue list succeed
<3>[    0.622440] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:init user information list succeed
<3>[    0.623573] .(4)[1:swapper/0][CONN_MD_DMP][I]conn_md_dmp_init:alloc memory for msg log system done, size:0x00000430
<3>[    0.624896] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:conn_md_dmp_init succeed
<3>[    0.625972] .(4)[1:swapper/0][CONN-MD-DFT][I]conn_md_init:create conn_md_thread succeed, wakeup it
<6>[    0.627123] .(4)[1:swapper/0]Init Richtek RegMap 1.1.13_G
<5>[    0.628066] .(4)[1:swapper/0]SCSI subsystem initialized
<6>[    0.628897] .(4)[1:swapper/0]usbcore: registered new interface driver usbfs
<6>[    0.629819] .(4)[1:swapper/0]usbcore: registered new interface driver hub
<6>[    0.630825] .(4)[1:swapper/0]usbcore: registered new device driver usb
<6>[    0.633900] .(4)[1:swapper/0]mt_charger_probe
<6>[    0.634661] .(4)[1:swapper/0]Advanced Linux Sound Architecture Driver Initialized.
<6>[    0.636015] .(4)[1:swapper/0][cpu_ntf] <00>ffffff8008a6f7a0 (dev_cpu_callback)
<4>[    0.637227] .(4)[1:swapper/0]------------[ cut here ]------------
<4>[    0.638008] .(4)[1:swapper/0]WARNING: CPU: 4 PID: 1 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/net/wireless/reg.c:523 regulatory_init+0xb0/0x174()
<4>[    0.639749] .(4)[1:swapper/0]db.txt is empty, you should update it...
<4>[    0.640330] Modules linked in:.(4)[1:swapper/0]
<4>[    0.640950] -(4)[1:swapper/0]CPU: 4 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #2
<4>[    0.642066] -(4)[1:swapper/0]Hardware name: MT6763V/B (DT)
<4>[    0.642782] -(4)[1:swapper/0]Call trace:
<4>[    0.643302] -(4)[1:swapper/0][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    0.644192] -(4)[1:swapper/0][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    0.645038] -(4)[1:swapper/0][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    0.645884] -(4)[1:swapper/0][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    0.646838] -(4)[1:swapper/0][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    0.647760] -(4)[1:swapper/0][<ffffff8009129e1c>] regulatory_init+0xb0/0x174
<4>[    0.648671] -(4)[1:swapper/0][<ffffff8009129cec>] cfg80211_init+0x74/0xf4
<4>[    0.649550] -(4)[1:swapper/0][<ffffff8008081d48>] do_one_initcall+0xd8/0x208
<4>[    0.650461] -(4)[1:swapper/0][<ffffff80090c9bcc>] kernel_init_freeable+0x188/0x234
<4>[    0.651437] -(4)[1:swapper/0][<ffffff8008c21a68>] kernel_init+0x10/0x108
<4>[    0.652305] -(4)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.653219] .(4)[1:swapper/0]---[ end trace 97123305e0c74797 ]---
<6>[    0.653328] .(1)[6:kworker/u16:0]power_supply usb: power_supply_changed
<6>[    0.653351] .(1)[6:kworker/u16:0]power_supply ac: power_supply_changed
<6>[    0.653362] .(1)[6:kworker/u16:0]power_supply charger: power_supply_changed
<3>[    0.653517] .(1)[13:kworker/1:0]power_supply charger: driver failed to report `charge_type' property: -22
<3>[    0.657999] .(5)[1:swapper/0]BOOTPROF:       657.999077:initcall: cfg80211_init    20.953231ms
<6>[    0.660336] .(5)[1:swapper/0]clocksource: Switched to clocksource arch_sys_counter
<3>[    0.682751] .(5)[1:swapper/0]BOOTPROF:       682.750385:initcall: event_trace_init    19.338000ms
<6>[    0.685842] .(5)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    0.686555] .(5)[1:swapper/0][Power/cpufreq] DVFS - @(Record)cpuhvfs_pvt_tbl_create----->(ffffff8009eeec10)
<6>[    0.693047] .(5)[1:swapper/0][regulator_register] pass to register vs1, min_uV:1200000 max_uV:2787500
<6>[    0.694368] .(5)[1:swapper/0][regulator_register] pass to register vmodem, min_uV:500000 max_uV:1293750
<6>[    0.695692] .(5)[1:swapper/0][regulator_register] pass to register vcore, min_uV:500000 max_uV:1293750
<6>[    0.697014] .(5)[1:swapper/0][regulator_register] pass to register vproc, min_uV:500000 max_uV:1293750
<6>[    0.698319] .(5)[1:swapper/0][regulator_register] pass to register vs2, min_uV:1200000 max_uV:2787500
<6>[    0.699618] .(5)[1:swapper/0][regulator_register] pass to register vpa, min_uV:500000 max_uV:3650000
<6>[    0.708406] .(5)[1:swapper/0]****[mt6356_auxadc_init] BAT TEMP = 815, MTS_ADC = 0x4153
<3>[    0.709431] .(5)[1:swapper/0][mt_idle_ntf] <00>ffffff80085175e0 (pmic_auxadc_notify_call)
<3>[    0.711845] .(5)[1:swapper/0]BOOTPROF:       711.844385:probe: probe=platform_drv_probe drv=mt-pmic(ffffff8009660df0)    23.618462ms
<3>[    0.713405] .(5)[1:swapper/0]BOOTPROF:       713.405462:initcall: pmic_mt_init    25.576923ms
<5>[    0.714519] .(5)[1:swapper/0] pimix = 170
<5>[    0.715045] .(5)[1:swapper/0][MUSB]usb20_init 1801: usb20 init
<5>[    0.716270] .(5)[1:swapper/0][MUSB]mt_usb_probe 1705: init connection_work
<5>[    0.717165] .(5)[1:swapper/0][MUSB]mt_usb_probe 1708: keep musb->power & mtk_usb_power in the samae value
<5>[    0.718450] .(5)[1:swapper/0][MUSB]mt_usb_probe 1736: USB probe done!
<6>[    0.719275] .(5)[1:swapper/0][D][Factory Ext Data](_factory_ext_set_callback): (id=4)+
<6>[    0.720294] .(5)[1:swapper/0][D][Factory Ext Data](_get_factory_ext_item_impl): (id=4)+
<6>[    0.721335] .(5)[1:swapper/0][D][Factory Ext Data](_factory_ext_set_callback): (id=5)+
<6>[    0.722344] .(5)[1:swapper/0][D][Factory Ext Data](_get_factory_ext_item_impl): (id=5)+
<6>[    0.723375] .(5)[1:swapper/0][D][Factory Ext Data](_factory_ext_set_callback): (id=6)+
<6>[    0.724402] .(5)[1:swapper/0][D][Factory Ext Data](_get_factory_ext_item_impl): (id=6)+
<5>[    0.726189] .(5)[1:swapper/0][MUSB]usb20_init 1816: usb20 init ret:0
<7>[    0.727013] .(5)[1:swapper/0][BLOCK_TAG] DRAM: 0x0000000040000000 - 0x0000000100000000, size: 0xc0000000
<3>[    0.727476] .(5)[1:swapper/0][ION]ion_init()
<3>[    0.728533] .(5)[1:swapper/0][ION]ion_drv_probe() heap_nr=9
<3>[    0.729327] .(5)[1:swapper/0]ion_heap_create: Heap type is disabled: 1
<3>[    0.730163] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_system_contig_heap type 1 base 0 size 0
<3>[    0.731880] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.732751] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap type 13 base 0 size 0
<3>[    0.733956] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.734823] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_prot type 13 base 0 size 0
<3>[    0.736093] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.736969] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_2d_fr type 13 base 0 size 0
<3>[    0.738240] .(5)[1:swapper/0][ION]ion_sec_heap_create error: not support
<3>[    0.739107] .(5)[1:swapper/0]ion_mtk_heap_create: error creating heap ion_sec_heap_wfd type 13 base 0 size 0
<4>[    0.740747] .(5)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.741530] .(5)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<3>[    0.742351] .(5)[1:swapper/0][ION]ion_init fd register notifer fail
<3>[    0.743158] .(5)[1:swapper/0]BOOTPROF:       743.158154:initcall: ion_init    15.677000ms
<6>[    0.744306] .(5)[1:swapper/0]NET: Registered protocol family 2
<6>[    0.745464] .(5)[1:swapper/0]TCP established hash table entries: 32768 (order: 6, 262144 bytes)
<6>[    0.746760] .(5)[1:swapper/0]TCP bind hash table entries: 32768 (order: 7, 524288 bytes)
<6>[    0.748190] .(5)[1:swapper/0]TCP: Hash tables configured (established 32768 bind 32768)
<6>[    0.749307] .(5)[1:swapper/0]UDP hash table entries: 2048 (order: 4, 65536 bytes)
<6>[    0.750334] .(5)[1:swapper/0]UDP-Lite hash table entries: 2048 (order: 4, 65536 bytes)
<6>[    0.751587] .(5)[1:swapper/0]NET: Registered protocol family 1
<6>[    0.753134] .(5)[1:swapper/0][Power/clkbuf]clk_buf_dump_dts_log: PMIC_CLK_BUF?_STATUS=2 1 1 2 0 0 1
<6>[    0.754287] .(5)[1:swapper/0][Power/clkbuf]clk_buf_dump_dts_log: PMIC_CLK_BUF?_DRV_CURR=-1 -1 -1 -1 -1 -1 -1
<6>[    0.755584] .(5)[1:swapper/0][Power/clkbuf]clk_buf_dump_clkbuf_log DCXO_CW00=0x4e1d, CW02=0x3aee, CW11=0xb800, CW14=0x82b5, CW16=0x9455, top_spi_con1=0x0
<6>[    0.757376] .(5)[1:swapper/0][Power/clkbuf]clk_buf_ctrl_internal: id=6, onoff=0
<6>[    0.758359] .(5)[1:swapper/0][Power/clkbuf]clk_buf_ctrl_internal: id=2, onoff=0, DCXO_ENABLE=0x2, pwrap_dcxo_en_flag=0x2
<6>[    0.759935] .(5)[1:swapper/0]Unpacking initramfs...
<6>[    0.798049] .(5)[1:swapper/0]Freeing initrd memory: 1104K
<3>[    0.798775] .(5)[1:swapper/0]BOOTPROF:       798.775077:initcall: populate_rootfs    39.017616ms
<4>[    0.799913] .(5)[1:swapper/0]TrustKernel TEE Driver initialization
<6>[    0.800795] .(5)[1:swapper/0]platform is bL: 1
<6>[    0.801722] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800878ba10 (tee_cpu_callback)
<4>[    0.803960] .(5)[1:swapper/0]tkcoreos-rev: 0.8.7-gp
<4>[    0.804788] .(5)[1:swapper/0][TKCORE] [    0.000000]: <0>INF TKCore:init_teecore:98: teecore: init ctors
<4>[    0.804788] [    0.000000]: <0>INF TKCore:init_teecore:102: teecore: init time source
<4>[    0.804788] [    5.306298]: <0>INF TKCore:init_teecore:106: teecore: init calls
<4>[    0.804788] [    5.307113]: <0>DBG TKCore:call_initcalls:5
<6>[    0.804812] .(5)[1:swapper/0]tkcore_log_irq: 20
<6>[    0.804890] .(5)[1:swapper/0]TKCore misc: Register the misc device "tkcoredrv" (id=0,minor=61)
<6>[    0.806198] .(5)[1:swapper/0][cpu_ntf] <00>ffffff80089a1b60 (cpu_pmu_notify)
<6>[    0.807848] .(5)[1:swapper/0]hw perfevents: enabled with armv8_pmuv3 PMU driver, 7 counters available
<6>[    0.811233] .(5)[1:swapper/0]audit: initializing netlink subsys (disabled)
<5>[    0.811296] .(5)[1:swapper/0]audit: type=2000 audit(0.764:1): initialized
<6>[    0.811612] .(5)[1:swapper/0][cpu_ntf] <00>ffffff80081a46c0 (cpu_callback)
<4>[    0.814337] [TKCORE] 8: service addr: 0xf00002a0
<4>[    0.814337] [    5.307994]: <0>DBG TKCore:call_initcalls:58: service addr: 0xf00002a4
<4>[    0.814337] [    5.308945]: <0>DBG TKCore:thread_enable_vfp:1311: Enable VFP in kernel with no context and IRQ disabled
<4>[    0.814337] [    5.310213]: <0>DBG TKCore:call_initcalls:<5>[    0.815597] .(5)[1:swapper/0]VFS: Disk quotas dquot_6.6.0
<6>[    0.815687] .(5)[1:swapper/0]VFS: Dquot-cache hash table entries: 512 (order 0, 4096 bytes)
<6>[    0.816646] .(5)[1:swapper/0]Registering sdcardfs 0.1
<6>[    0.816829] .(5)[1:swapper/0]fuse init (API version 7.23)
<7>[    0.817135] .(5)[1:swapper/0]SELinux:  Registering netfilter hooks
<6>[    0.820994] .(5)[1:swapper/0]io scheduler noop registered
<6>[    0.821003] .(5)[1:swapper/0]io scheduler deadline registered
<6>[    0.821131] .(5)[1:swapper/0]io scheduler cfq registered (default)
<6>[    0.821167] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800838ac88 (percpu_counter_hotcpu_callback)
<4>[    0.823439] .(5)[1:swapper/0]Unable to detect cache hierarchy from DT for CPU 0
<4>[    0.825492] .(5)[1:swapper/0][TKCORE] 58: service addr: 0xf00002a8
<4>[    0.825492] [    5.311153]: <0>DBG TKCore:call_initcalls:58: service addr: 0xf00002ac
<4>[    0.825492] [    5.312040]: <0>INF TKCore:spi_init:936: spi_init setup SPI driver
<4>[    0.825492] [    5.312877]: <0>DBG TKCore:call_initcalls:58: service addr: 0xf00002b0
<4>[    0.825492] [    5.3
<6>[    0.826334] .(5)[1:swapper/0]loop: module loaded
<6>[    0.826749] .(5)[1:swapper/0]zram: Added device: zram0
<4>[    0.826766] .(5)[1:swapper/0][Power/gpufreq] @mt_gpufreq_init
<4>[    0.827546] .(5)[1:swapper/0][Power/gpufreq] @mt_gpufreq_pdrv_probe: I am 6763 (10)
<3>[    0.827654] .(5)[1:swapper/0][Power/spower] 8/66/33/26/18/9/12/
<4>[    0.827666] .(5)[1:swapper/0][Power/gpufreq] setup gpufreqs table
<4>[    0.827671] .(5)[1:swapper/0][Power/gpufreq] @mt_setup_gpufreqs_table: g_cur_gpu_freq = 950000, g_cur_gpu_volt = 90000
<4>[    0.827677] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_khz = 700000
<4>[    0.827680] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_volt = 80000
<4>[    0.827683] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[0].gpufreq_power = 575
<4>[    0.827686] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_khz = 530000
<4>[    0.827689] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_volt = 70000
<4>[    0.827691] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreqs_power[1].gpufreq_power = 331
<2>[    0.827923] .(5)[1:swapper/0][PBM] feature_en: 1, pbm_drv_done: 0
<4>[    0.827928] .(5)[1:swapper/0][Power/gpufreq] GPU current frequency = 700000KHz
<4>[    0.827935] .(5)[1:swapper/0][Power/gpufreq] Current Vproc = 800mV
<4>[    0.827937] .(5)[1:swapper/0][Power/gpufreq] g_cur_gpu_freq = 700000, g_cur_gpu_volt = 80000
<4>[    0.827940] .(5)[1:swapper/0][Power/gpufreq] g_cur_gpu_idx = 0, g_cur_gpu_OPPidx = 0
<6>[    0.828032] .(5)[1:swapper/0][register_low_battery_notify] prio_val=2
<6>[    0.828036] .(5)[1:swapper/0][register_battery_percent_notify] prio_val=2
<6>[    0.828040] .(5)[1:swapper/0][register_battery_oc_notify] prio_val=2
<6>[    0.829446] .(5)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    0.829470] .(5)[1:swapper/0][register_dlpt_notify] prio_val=0
<2>[    0.829557] .(5)[1:swapper/0][PBM] pbm_module_init : Done
<4>[    0.829587] .(5)[1:swapper/0]Power_gs: pmic_manual_dump array malloc done
<4>[    0.829592] .(5)[1:swapper/0]Power_gs: golden setting base_remap table malloc done
<4>[    0.834537] -(5)[1:swapper/0]------------[ cut here ]------------
<4>[    0.834544] -(5)[1:swapper/0]WARNING: CPU: 5 PID: 1 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/events/core.c:3348 perf_event_read_local+0x180/0x190()
<4>[    0.834555] Modules linked in:-(5)[1:swapper/0]
<4>[    0.834561] -(5)[1:swapper/0]CPU: 5 PID: 1 Comm: swapper/0 Tainted: G        W       4.4.95+ #2
<4>[    0.834566] -(5)[1:swapper/0]Hardware name: MT6763V/B (DT)
<4>[    0.834570] -(5)[1:swapper/0]Call trace:
<4>[    0.834572] -(5)[1:swapper/0][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    0.834582] -(5)[1:swapper/0][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    0.834587] -(5)[1:swapper/0][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    0.834595] -(5)[1:swapper/0][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    0.834602] -(5)[1:swapper/0][<ffffff80080a1d10>] warn_slowpath_null+0x18/0x20
<4>[    0.834607] -(5)[1:swapper/0][<ffffff8008187fb8>] perf_event_read_local+0x180/0x190
<4>[    0.834612] -(5)[1:swapper/0][<ffffff8008426884>] ppm_cpi_pmu_enable_locked+0x7c/0x140
<4>[    0.834618] -(5)[1:swapper/0][<ffffff8008426a14>] ppm_cpi_pmu_probe_cpu+0xcc/0x260
<4>[    0.834623] -(5)[1:swapper/0][<ffffff8008426f80>] ppm_cpi_pmu_probe+0x50/0xa0
<4>[    0.834628] -(5)[1:swapper/0][<ffffff80090f7140>] ppm_cpi_init+0x9c/0x108
<4>[    0.834632] -(5)[1:swapper/0][<ffffff8008081d48>] do_one_initcall+0xd8/0x208
<4>[    0.834637] -(5)[1:swapper/0][<ffffff80090c9bcc>] kernel_init_freeable+0x188/0x234
<4>[    0.834643] -(5)[1:swapper/0][<ffffff8008c21a68>] kernel_init+0x10/0x108
<4>[    0.834649] -(5)[1:swapper/0][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    0.834654] -(5)[1:swapper/0]---[ end trace 97123305e0c74798 ]---
<6>[    0.837062] .(5)[1:swapper/0][cpu_ntf] <00>ffffff8008426c80 (ppm_cpi_notifier)
<5>[    0.837074] .(5)[1:swapper/0][Power/PPM] @ppm_cpi_init: CPI done! enable = 1
<5>[    0.837089] .(5)[1:swapper/0][Power/PPM] @ppm_dlpt_policy_init: register PPM_POLICY_DLPT done!
<5>[    0.837105] .(5)[1:swapper/0][Power/PPM] @ppm_sysboost_policy_init: register PPM_POLICY_SYS_BOOST done!
<5>[    0.837115] .(5)[1:swapper/0][Power/PPM] @ppm_ptpod_policy_init: register PPM_POLICY_PTPOD done!
<6>[    0.837122] .(5)[1:swapper/0][register_battery_percent_notify] prio_val=1
<6>[    0.837125] .(5)[1:swapper/0][register_battery_oc_notify] prio_val=1
<6>[    0.837129] .(5)[1:swapper/0][register_low_battery_notify] prio_val=1
<5>[    0.837131] .(5)[1:swapper/0][Power/PPM] @ppm_pwrthro_policy_init: register PPM_POLICY_PWR_THRO done!
<5>[    0.837146] .(5)[1:swapper/0][Power/PPM] @ppm_thermal_policy_init: register PPM_POLICY_THERMAL done!
<5>[    0.837163] .(5)[1:swapper/0][Power/PPM] @ppm_userlimit_policy_init: register PPM_POLICY_USER_LIMIT done!
<5>[    0.837173] .(5)[1:swapper/0][Power/PPM] @ppm_forcelimit_policy_init: register PPM_POLICY_FORCE_LIMIT done!
<5>[    0.837185] .(5)[1:swapper/0][Power/PPM] @ppm_ut_policy_init: register PPM_POLICY_UT done!
<1>[    0.837275] .(5)[1:swapper/0]MT_SCHED: Init complete, device major number = 246
<6>[    0.837290] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800844b660 (sched_cpu_notify)
<6>[    0.838277] .(5)[1:swapper/0]11002000.apuart0: ttyMT0 at MMIO 0x0 (irq = 6, base_baud = 1625000) is a MTK UART
<6>[    0.838465] .(5)[1:swapper/0]11003000.apuart1: ttyMT1 at MMIO 0x0 (irq = 9, base_baud = 1625000) is a MTK UART
<4>[    0.840561] .(5)[1:swapper/0]pn548_dev_init
<4>[    0.841026] .(5)[1:swapper/0]pn548_platform_probe: &pdev=ffffffc05f750c00
<4>[    0.841030] .(5)[1:swapper/0]pn548_platform_pinctrl_init
<4>[    0.841147] .(5)[1:swapper/0]pn548_platform_pinctrl_select
<4>[    0.841751] .(5)[1:swapper/0][bert] i2c_add_driver  ret = 0 
<4>[    0.841755] .(5)[1:swapper/0]pn548_dev_init success
<4>[    0.842563] .(5)[1:swapper/0][MT AUXADC_probe3] get device tree info : start !!
<4>[    0.842643] .(5)[1:swapper/0][AUXADC_AP] find node TEMPERATURE:0
<4>[    0.842647] .(5)[1:swapper/0][AUXADC_AP] find node TEMPERATURE1:1
<4>[    0.842650] .(5)[1:swapper/0][AUXADC_AP] find node ADC_FDD_RF_PARAMS_DYNAMIC_CUSTOM_CH:2
<4>[    0.842658] .(5)[1:swapper/0][AUXADC_AP] find node BOARD_ID:3
<4>[    0.842661] .(5)[1:swapper/0][AUXADC_AP] find node BOARD_ID_2:4
<4>[    0.842664] .(5)[1:swapper/0][MT AUXADC_AP] adc_channel_info_init : done !!
<3>[    0.842696] .(5)[1:swapper/0]proc_create auxadc_debug_proc_fops
<3>[    0.843941] .(5)[1:swapper/0][PWM] get PWM1-main clock, ffffffc05da42b00
<3>[    0.843952] .(5)[1:swapper/0][PWM] get PWM2-main clock, ffffffc05da42c00
<3>[    0.843964] .(5)[1:swapper/0][PWM] get PWM3-main clock, ffffffc05da42d00
<3>[    0.843975] .(5)[1:swapper/0][PWM] get PWM4-main clock, ffffffc05da42e00
<3>[    0.843989] .(5)[1:swapper/0][PWM] get PWM-HCLK-main clock, ffffffc05da42f00
<3>[    0.844004] .(5)[1:swapper/0][PWM] get PWM-main clock, ffffffc05db0c680
<4>[    0.844703] stk3x1x_init Instk3x1x_init Out.(5)[1:swapper/0][Gsensor] bma2xx_init
<3>[    0.850690] .(5)[1:swapper/0][PMIC] [pmic_register_interrupt_callback] register callback conflict intNo=154
<4>[    0.850742] .(5)[1:swapper/0][Accdet]accdet_mod_init begin!
<6>[    0.851527] .(5)[1:swapper/0][mt_accdet_probe]probe start..
<6>[    0.851729] .(5)[1:swapper/0]input: ACCDET as /devices/virtual/input/input0
<6>[    0.852052] .(5)[1:swapper/0][mt_accdet_probe]CONFIG_ACCDET_SUPPORT_EINT1 opened!
<6>[    0.852055] [accdet_get_dts_data]Start..<6>[    0.853130] .(5)[1:swapper/0][accdet_get_dts_data]mid-Key = 80, up_key = 220, down_key = 400
<6>[    0.853136] .(5)[1:swapper/0][accdet_get_dts_data]pwm_width=0x500, pwm_thresh=0x500, mic_mode=2, mic_vol=6
<6>[    0.853140] .(5)[1:swapper/0][accdet_get_dts_data] deb0=0x800,deb1=0x800,deb3=0x20,deb4=0x44
<6>[    0.853145] .(5)[1:swapper/0][mt_accdet_probe]probe done!
<4>[    0.854560] .(5)[1:swapper/0][Accdet]platform_driver_register done!
<4>[    0.854563] .(5)[1:swapper/0][Accdet]accdet_mod_init done!
<6>[    0.854576] .(5)[1:swapper/0]usb_function_register name=via_gps
<6>[    0.854584] .(5)[1:swapper/0]usb_function_register name=via_pcv
<6>[    0.854590] .(5)[1:swapper/0]usb_function_register name=via_atc
<6>[    0.854596] .(5)[1:swapper/0]usb_function_register name=via_ets
<6>[    0.854603] .(5)[1:swapper/0]usb_function_register name=via_modem
<5>[    0.854609] .(5)[1:swapper/0]C2K_USB_NOTE,<init 701>, rawbulk functions init.
<5>[    0.854625] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.854696] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.854749] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.854799] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.854849] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.854900] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.854949] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.854999] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_alloc_function 590>, rawbulk_alloc_function
<5>[    0.855057] .(5)[1:swapper/0]C2K_USB_NOTE,<rawbulk_init 1249>, rawbulk_init
<5>[    0.859295] mtk_rtc_common: rtc_init<5>[    0.861503] .(5)[1:swapper/0]mtk_rtc_common: read al time = 2020/01/10 01:07:00 (0)
<6>[    0.863174] .(5)[1:swapper/0]mt-rtc mt-rtc: rtc core: registered mt-rtc as rtc0
<4>[    0.863223] [fg_27542_init] init start with i2c DTS.(5)[1:swapper/0][fg_27542_init] Success to register fg_27542 i2c driver.
<4>[    0.863607] .(5)[1:swapper/0]******** fg_27542_user_space_probe!! ********
<4>[    0.863692] .(5)[1:swapper/0]
<4>[    0.863692]  manufactureA_init,  Major: 243 Minor: 0
<4>[    0.863749] .(5)[1:swapper/0]
<4>[    0.863749]  manufactureB_init,  Major: 242 Minor: 0
<4>[    0.863758] [wlc_51025_init] init start with i2c DTS.(5)[1:swapper/0][wlc_51025_init] Success to register wlc_51025 i2c driver.
<4>[    0.864102] .(5)[1:swapper/0]******** wlc_51025_user_space_probe!! ********
<4>[    0.864475] .(5)[1:swapper/0]******** mcp_6442_user_space_probe!! ********
<4>[    0.864509] .(5)[1:swapper/0]****[pcb_version_init] begin to register driver
<4>[    0.864808] .(5)[1:swapper/0]******** pcb_version_user_space_probe!! ********
<3>[    0.864854] .(5)[1:swapper/0][MT6311] Kernel driver not support for SSPM
<5>[    0.864858] .(5)[1:swapper/0][MT6311] MT6311 not exist!, user space driver not probe
<3>[    0.865128] .(5)[1:swapper/0]mt6356_gauge_probe: starts
<3>[    0.865132] .(5)[1:swapper/0]mt6356_parse_dt: starts
<6>[    0.865889] .(5)[1:swapper/0]mtk_auxadc_intf_probe
<6>[    0.869623] .(5)[1:swapper/0]musb-hdrc: version 6.0, ?dma?, otg (peripheral+host)
<6>[    0.870209] .(5)[1:swapper/0]musb_probe mac=0xffffff800a3e0000, phy=0xffffff800b120000, irq=94
<5>[    0.870364] -(5)[1:swapper/0][MUSB]usb_6763_dpidle_request 120: USB_DPIDLE_FORBIDDEN, skip_cnt<0>
<5>[    0.870417] -(5)[1:swapper/0][MUSB]usb_6763_dpidle_request 113: USB_DPIDLE_ALLOWED, skip_cnt<0>
<4>[    0.870602] .(5)[1:swapper/0]usb_phy_generic.0.auto supply vcc not found, using dummy regulator
<5>[    0.870817] .(5)[1:swapper/0][MUSB]mt_usb_otg_init 784: host controlled by TYPEC
<5>[    0.871046] .(2)[69:kworker/u16:2][MUSB]do_register_otg_work 59: get type_c_port0 fail
<5>[    0.871081] .(5)[1:swapper/0][MUSB]mt_usb_enable 300: begin <0,0>,<1,0,0,0>
<5>[    0.882030] .(5)[1:swapper/0][MUSB]set_usb_phy_mode 425: force PHY to mode 1, 0x6c=3f2f
<5>[    0.882055] .(5)[1:swapper/0][MUSB]usb_phy_recover 685: apply efuse setting, RG_USB20_INTR_CAL=0x15
<5>[    0.882653] .(5)[1:swapper/0][MUSB]usb_phy_recover 695: usb recovery success
<5>[    0.882657] .(5)[1:swapper/0][MUSB]mt_usb_enable 324: end, <1,0,1,0>
<6>[    0.883030] .(5)[1:swapper/0]musb-hdrc musb-hdrc: MUSB HDRC host driver
<6>[    0.883049] .(5)[1:swapper/0]musb-hdrc musb-hdrc: new USB bus registered, assigned bus number 1
<6>[    0.883065] .(5)[1:swapper/0]usb usb1: usb_set_device_state 1->6
<6>[    0.883073] .(5)[1:swapper/0]usb usb1: usb_get_descriptor type=1 sz=18
<6>[    0.883116] .(5)[1:swapper/0]usb usb1: usb_get_descriptor type=2 sz=9
<6>[    0.883138] .(5)[1:swapper/0]usb usb1: usb_get_descriptor type=2 sz=25
<6>[    0.883456] .(5)[1:swapper/0]usb usb1: usb_set_device_state 6->7
<6>[    0.883528] .(5)[1:swapper/0]hub 1-0:1.0: USB hub found
<6>[    0.883554] .(5)[1:swapper/0]hub 1-0:1.0: 1 port detected
<5>[    0.883657] -(5)[1:swapper/0][MUSB]musb_hub_control 370: try to call musb_start in virthub
<5>[    0.883785] .(5)[1:swapper/0][MUSB]mt_usb_try_idle 285: b_idle inactive, for idle timer for 4 ms
<5>[    0.883791] .(5)[1:swapper/0][MUSB]musb_gadget_setup 2405: musb controller dma ops is non-null
<5>[    0.883901] .(5)[1:swapper/0][MUSB]mt_usb_disable 333: begin, <1,1>,<1,1,1,0>
<5>[    0.884732] .(5)[1:swapper/0][MUSB]set_usb_phy_mode 425: force PHY to mode 0, 0x6c=3f11
<5>[    0.884749] .(5)[1:swapper/0][MUSB]usb_phy_savecurrent 591: usb save current success
<5>[    0.884753] .(5)[1:swapper/0][MUSB]mt_usb_disable 339: end, <1,1,1,1>
<3>[    0.884840] .(5)[1:swapper/0]BOOTPROF:       884.839693:initcall: musb_init    15.205154ms
<3>[    0.885466] .(5)[1:swapper/0]can't find compatible node
<4>[    0.886465] .(5)[1:swapper/0][BOOT_COMMON] [create_sysfs] No atag,meta found !
<4>[    0.886591] .(5)[1:swapper/0]disp driver(1) disp_probe_1 begin
<5>[    0.888397] -(5)[1:swapper/0][MUSB]musb_do_idle 251: otg_state b_idle to b_idle, is_active<0>
<4>[    0.889476] .(5)[1:swapper/0]disp driver(1) disp_probe_1 end
<4>[    0.890049] .(5)[1:swapper/0]MMP: mmprofile_enable(): enable: 1
<4>[    0.890571] .(5)[1:swapper/0]MMP: mmprofile_force_start(): start: 1
<5>[    0.893282] .(4)[1:swapper/0][CMDQ]SRAM Chunk New-32bit unit: start: 0x4a, count: 92, Name: DELAY_THREAD
<5>[    0.893295] .(4)[1:swapper/0][CMDQ]overwrite delay function with cpr_offset = 74
<5>[    0.893298] .(4)[1:swapper/0][CMDQ]======REC 0xffffff800b3fa000 command buffer:
<3>[    0.893306] .(4)[1:swapper/0]ffffff800b3fa000: 80008001 200001e5 fffdb7ff 02000000
<3>[    0.893311] .(4)[1:swapper/0]ffffff800b3fa010: 102380d0 a0800000 00024800 91800000
<3>[    0.893317] .(4)[1:swapper/0]ffffff800b3fa020: ffffffff a0800002 ffffffff a080801c
<3>[    0.893322] .(4)[1:swapper/0]ffffff800b3fa030: 80410000 b1430050 00388040 a0e20001
<3>[    0.893327] .(4)[1:swapper/0]ffffff800b3fa040: 00018041 b1650028 80010000 200001e6
<3>[    0.893331] .(4)[1:swapper/0]ffffff800b3fa050: 00000000 a0808041 801c0000 a0c18042
<3>[    0.893337] .(4)[1:swapper/0]ffffff800b3fa060: 00010001 b1000020 80410001 a0e20000
<3>[    0.893342] .(4)[1:swapper/0]ffffff800b3fa070: 00000002 b1620010 00000000 a0c10002
<3>[    0.893347] .(4)[1:swapper/0]ffffff800b3fa080: 80440000 b1430050 00388043 a0e20001
<3>[    0.893352] .(4)[1:swapper/0]ffffff800b3fa090: 00018044 b1650028 80010000 200001e7
<3>[    0.893358] .(4)[1:swapper/0]ffffff800b3fa0a0: 00000000 a0808044 801c0000 a0c18045
<3>[    0.893362] .(4)[1:swapper/0]ffffff800b3fa0b0: 00010001 b1000020 80440001 a0e20000
<3>[    0.893367] .(4)[1:swapper/0]ffffff800b3fa0c0: 00000002 b1620010 00000000 a0c10002
<3>[    0.893372] .(4)[1:swapper/0]ffffff800b3fa0d0: 80470000 b1430050 00388046 a0e20001
<3>[    0.893377] .(4)[1:swapper/0]ffffff800b3fa0e0: 00018047 b1650028 80010000 200001e8
<3>[    0.893382] .(4)[1:swapper/0]ffffff800b3fa0f0: 00000000 a0808047 801c0000 a0c18048
<3>[    0.893387] .(4)[1:swapper/0]ffffff800b3fa100: 00010001 b1000020 80470001 a0e20000
<3>[    0.893392] .(4)[1:swapper/0]ffffff800b3fa110: 00000002 b1620010 00000000 a0c10002
<3>[    0.893397] .(4)[1:swapper/0]ffffff800b3fa120: 0002801c b1610030 fffdb7ff 02000000
<3>[    0.893401] .(4)[1:swapper/0]ffffff800b3fa130: 102380d0 a0800000 00000000 91800000
<3>[    0.893406] .(4)[1:swapper/0]ffffff800b3fa140: 200001e5 a080804b 00010001 b1000010
<3>[    0.893411] .(4)[1:swapper/0]ffffff800b3fa150: 200003cd a080804b 804b0000 a0c10003
<3>[    0.893420] .(4)[1:swapper/0]ffffff800b3fa160: 00000000 40000000 fffffe98 10000000
<5>[    0.893423] .(4)[1:swapper/0][CMDQ]======REC 0xffffff800b3fa000 command buffer END
<5>[    0.893426] .(4)[1:swapper/0][CMDQ]REC 0xffffff800b3fa000 command buffer TRANSLATED:
<5>[    0.893438] .(4)[1:swapper/0][CMDQ]Wait And Clear Event: CMDQ_SYNC_TOKEN_TIMER
<5>[    0.893442] .(4)[1:swapper/0][CMDQ]Set MASK: 0xfffdb7ff
<5>[    0.893447] .(4)[1:swapper/0][CMDQ]LOGIC: Reg0 = 0x102380d0
<5>[    0.893451] .(4)[1:swapper/0][CMDQ]WRITE_S with mask: 0x00024800, Reg0, use_mask=1
<5>[    0.893455] .(4)[1:swapper/0][CMDQ]LOGIC: Reg2 = 0xffffffff
<5>[    0.893459] .(4)[1:swapper/0][CMDQ]LOGIC: Reg32796 = 0xffffffff
<5>[    0.893464] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (Reg32833 <= 0) jump +80
<5>[    0.893469] .(4)[1:swapper/0][CMDQ]LOGIC: Reg1 = Reg56 - Reg32832
<5>[    0.893473] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (Reg1 < Reg32833) jump +40
<5>[    0.893480] .(4)[1:swapper/0][CMDQ]Set Event: CMDQ_SYNC_TOKEN_DELAY_SET0
<5>[    0.893484] .(4)[1:swapper/0][CMDQ]LOGIC: Reg32833 = 0x00000000
<5>[    0.893489] .(4)[1:swapper/0][CMDQ]LOGIC: Reg32834 = Reg32796 + 0
<5>[    0.893493] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +32
<5>[    0.893497] .(4)[1:swapper/0][CMDQ]LOGIC: Reg0 = Reg32833 - Reg1
<5>[    0.893501] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (Reg0 >= Reg2) jump +16
<5>[    0.893505] .(4)[1:swapper/0][CMDQ]LOGIC: Reg2 = Reg0 + 0
<5>[    0.893510] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (Reg32836 <= 0) jump +80
<5>[    0.893514] .(4)[1:swapper/0][CMDQ]LOGIC: Reg1 = Reg56 - Reg32835
<5>[    0.893518] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (Reg1 < Reg32836) jump +40
<5>[    0.893525] .(4)[1:swapper/0][CMDQ]Set Event: CMDQ_SYNC_TOKEN_DELAY_SET1
<5>[    0.893528] .(4)[1:swapper/0][CMDQ]LOGIC: Reg32836 = 0x00000000
<5>[    0.893532] .(4)[1:swapper/0][CMDQ]LOGIC: Reg32837 = Reg32796 + 0
<5>[    0.893537] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +32
<5>[    0.893541] .(4)[1:swapper/0][CMDQ]LOGIC: Reg0 = Reg32836 - Reg1
<5>[    0.893545] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (Reg0 >= Reg2) jump +16
<5>[    0.893549] .(4)[1:swapper/0][CMDQ]LOGIC: Reg2 = Reg0 + 0
<5>[    0.893553] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (Reg32839 <= 0) jump +80
<5>[    0.893557] .(4)[1:swapper/0][CMDQ]LOGIC: Reg1 = Reg56 - Reg32838
<5>[    0.893562] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (Reg1 < Reg32839) jump +40
<5>[    0.893569] .(4)[1:swapper/0][CMDQ]Set Event: CMDQ_SYNC_TOKEN_DELAY_SET2
<5>[    0.893573] .(4)[1:swapper/0][CMDQ]LOGIC: Reg32839 = 0x00000000
<5>[    0.893577] .(4)[1:swapper/0][CMDQ]LOGIC: Reg32840 = Reg32796 + 0
<5>[    0.893581] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +32
<5>[    0.893585] .(4)[1:swapper/0][CMDQ]LOGIC: Reg0 = Reg32839 - Reg1
<5>[    0.893590] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (Reg0 >= Reg2) jump +16
<5>[    0.893595] .(4)[1:swapper/0][CMDQ]LOGIC: Reg2 = Reg0 + 0
<5>[    0.893599] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (Reg2 != Reg32796) jump +48
<5>[    0.893602] .(4)[1:swapper/0][CMDQ]Set MASK: 0xfffdb7ff
<5>[    0.893606] .(4)[1:swapper/0][CMDQ]LOGIC: Reg0 = 0x102380d0
<5>[    0.893610] .(4)[1:swapper/0][CMDQ]WRITE_S with mask: 0x00000000, Reg0, use_mask=1
<5>[    0.893613] .(4)[1:swapper/0][CMDQ]LOGIC: Reg32843 = 0x200001e5
<5>[    0.893618] .(4)[1:swapper/0][CMDQ]JUMP_C related: if (1 == 1) jump +16
<5>[    0.893622] .(4)[1:swapper/0][CMDQ]LOGIC: Reg32843 = 0x200003cd
<5>[    0.893626] .(4)[1:swapper/0][CMDQ]LOGIC: Reg3 = Reg32843 + 0
<5>[    0.893631] .(4)[1:swapper/0][CMDQ]MARKER: sync_no_suspnd=0no_suspnd=0, no_inc=0, m=0, m_en=0, prefetch=0, irq=0
<5>[    0.893638] .(4)[1:swapper/0][CMDQ]JUMP(relative): -360
<5>[    0.893640] .(4)[1:swapper/0][CMDQ]======REC 0xffffff800b3fa000 command END
<5>[    0.893657] .(4)[1:swapper/0][CMDQ][DelayThread]sram task size:368 free:1880
<5>[    0.893666] .(4)[1:swapper/0][CMDQ][DelayThread]create delay thread task in SRAM task size:368 sram size:1880
<4>[    0.894677] .(5)[170:init_decouple_b]init_decouple_buffers done
<3>[    0.895493] .(4)[1:swapper/0][GAMMA] disp_gamma_write_lut_reg: gamma table [0] not initialized
<3>[    0.895493] 
<5>[    0.980370] -(4)[68:kworker/u16:1][MUSB]musb_hub_control 352: port status 00000100
<6>[    0.980497] .(5)[85:kworker/5:1]usb usb1: usb_set_device_state 7->8
<4>[    1.054155] .(1)[1:swapper/0][TKCORE] 13763]: <0>MSG TKCore:start_devapc:210: DEVAPC already inited in ATF
<4>[    1.054155] [    5.314682]: <0>INF TKCore:init_teecore:109: teecore inits done
<4>[    1.054155] [    5.318021]: <0>INF TKCore:parse_cert:531: projectid: 1749
<4>[    1.054155] [    5.318805]: <0>MSG TKCore:htfat_early_init:1004: Veri
<3>[    1.054341] .(1)[1:swapper/0][ION]ion_drv_create_heap: create heap: ion_fb_heap
<3>[    1.054382] .(1)[1:swapper/0]BOOTPROF:      1054.382078:probe: probe=platform_drv_probe drv=mtkfb(ffffff800967b6d8)   164.551693ms
<3>[    1.055469] .(0)[1:swapper/0]BOOTPROF:      1055.469386:initcall: mtkfb_init   165.972001ms
<6>[    1.056473] .(1)[1:swapper/0][DFRC] start to initialize fps policy
<6>[    1.056478] .(1)[1:swapper/0][DFRC] register fps policy device
<6>[    1.056594] .(1)[1:swapper/0][DFRC] register fps policy driver
<6>[    1.057159] .(1)[1:swapper/0][DFRC] dfrc_init_kernel_policy
<6>[    1.057168] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[3]
<6>[    1.057177] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[2]
<6>[    1.057183] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[4]
<6>[    1.057190] .(1)[1:swapper/0][DFRC] reg_fps_policy: reg policy[5]
<1>[    1.061238] .(1)[1:swapper/0][MALI] Alloc mtk_config
<6>[    1.061797] .(1)[1:swapper/0]mali 13040000.mali: Continuing without Mali regulator control
<6>[    1.061809] .(1)[1:swapper/0]mali 13040000.mali: Continuing without Mali clock control
<6>[    1.062347] .(1)[1:swapper/0]mali 13040000.mali: GPU identified as 0x0 arch 6.0.10 r0p0 status 2
<6>[    1.064122] .(0)[1:swapper/0]mali 13040000.mali: Probed as mali0
<6>[    1.067576] [ISP][ISP_Init] - E.<6>[    1.069041] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.069061] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=1, devnode(imgsys), map_addr=0xffffff800bea6000
<6>[    1.069071] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=1, devnode(imgsys), irq=0
<6>[    1.069076] .(0)[1:swapper/0][ISP][ISP_RegCharDev] - E.
<6>[    1.069084] .(0)[1:swapper/0][ISP][ISP_RegCharDev] - X.
<6>[    1.069911] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.069955] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.069968] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=2, devnode(dip1), map_addr=0xffffff800bea8000
<6>[    1.069991] .(0)[1:swapper/0][ISP][ISP_probe] No corresponding ISR!!: nr_isp_devs=2, devnode(dip1), irq=129
<6>[    1.069996] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.070093] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.070142] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=3, devnode(camsys), map_addr=0xffffff800beac000
<6>[    1.070148] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=3, devnode(camsys), irq=0
<6>[    1.070153] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.070189] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.070200] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=4, devnode(cam1), map_addr=0xffffff800beae000
<6>[    1.070214] .(0)[1:swapper/0][ISP][ISP_probe] No corresponding ISR!!: nr_isp_devs=4, devnode(cam1), irq=132
<6>[    1.070220] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.070250] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.070261] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=5, devnode(cam2), map_addr=0xffffff800beb0000
<6>[    1.070313] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=5, devnode(cam2), irq=133, ISR: cam2
<6>[    1.070318] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.070355] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.070367] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=6, devnode(cam3), map_addr=0xffffff800beb2000
<6>[    1.070407] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=6, devnode(cam3), irq=134, ISR: cam3
<6>[    1.070412] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.070469] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.070480] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=7, devnode(camsv1), map_addr=0xffffff800beb4000
<6>[    1.070517] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=7, devnode(camsv1), irq=137, ISR: camsv1
<6>[    1.070522] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.070554] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.070565] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=8, devnode(camsv2), map_addr=0xffffff800beb6000
<6>[    1.070602] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=8, devnode(camsv2), irq=138, ISR: camsv2
<6>[    1.070608] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.070640] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.070650] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=9, devnode(camsv3), map_addr=0xffffff800beb8000
<6>[    1.070691] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=9, devnode(camsv3), irq=139, ISR: camsv3
<6>[    1.070696] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.070728] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.070739] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=10, devnode(camsv4), map_addr=0xffffff800beba000
<6>[    1.070776] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=10, devnode(camsv4), irq=140, ISR: camsv4
<6>[    1.070782] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.070813] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.070828] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=11, devnode(camsv5), map_addr=0xffffff800bebc000
<6>[    1.070835] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=11, devnode(camsv5), irq=0
<6>[    1.070839] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.070870] .(0)[1:swapper/0][ISP][ISP_probe] - E. ISP driver probe.
<6>[    1.070881] .(0)[1:swapper/0][ISP][ISP_probe] nr_isp_devs=12, devnode(camsv6), map_addr=0xffffff800bebe000
<6>[    1.070887] .(0)[1:swapper/0][ISP][ISP_probe] No IRQ!!: nr_isp_devs=12, devnode(camsv6), irq=0
<6>[    1.070892] .(0)[1:swapper/0][ISP][ISP_probe] - X. ISP driver probe.
<6>[    1.072454] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb0
<6>[    1.072732] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB0_BASE: ffffff800bec0000
<6>[    1.072738] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb1
<6>[    1.072936] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB1_BASE: ffffff800bec2000
<6>[    1.072941] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb2
<6>[    1.073135] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB2_BASE: ffffff800bec4000
<6>[    1.073141] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb3
<6>[    1.073323] .(0)[1:swapper/0][ISP][ISP_Init] SMI_LARB3_BASE: ffffff800bec6000
<6>[    1.073329] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb4
<3>[    1.073794] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb4 node failed!!!
<6>[    1.073799] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb5
<3>[    1.074140] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb5 node failed!!!
<6>[    1.074145] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb6
<3>[    1.074469] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb6 node failed!!!
<6>[    1.074473] .(0)[1:swapper/0][ISP][ISP_Init] Finding SMI_LARB compatible: mediatek,smi_larb7
<3>[    1.074794] .(0)[1:swapper/0][ISP][ISP_Init] find mediatek,smi_larb7 node failed!!!
<6>[    1.074995] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF0_BASE: ffffff800bec8000
<6>[    1.075194] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF1_BASE: ffffff800beca000
<6>[    1.075395] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF2_BASE: ffffff800becc000
<6>[    1.075595] .(0)[1:swapper/0][ISP][ISP_Init] ISP_SENINF3_BASE: ffffff800bece000
<6>[    1.075684] .(0)[1:swapper/0][ISP][ISP_Init] CLOCK_CELL_BASE: ffffff800bed0000
<6>[    1.075839] .(0)[1:swapper/0][ISP][ISP_Init] ISP_MMSYS_CONFIG_BASE: ffffff800bed2000
<6>[    1.076018] [ISP][ISP_Init] register isp callback for MDP[ISP][ISP_Init] register isp callback for GCE[ISP][ISP_Init] init m_LastMNum[ISP][ISP_Init] - X. Ret: 0.<6>[    1.077978] .(0)[1:swapper/0]FDVT [FDVT_probe] FDVT PROBE!!!
<6>[    1.077994] .(0)[1:swapper/0]FDVT [FDVT_probe] DT, i=0, map_addr=0xffffff800bed6000
<6>[    1.078054] .(0)[1:swapper/0]FDVT [FDVT_probe] DT, i=0, map_irq=130
<4>[    1.080944] .(0)[1:swapper/0]kd_camera_hw supply vcamd_sub not found, using dummy regulator
<4>[    1.081132] .(0)[1:swapper/0]kd_camera_hw supply vcamd_main2 not found, using dummy regulator
<4>[    1.081249] .(0)[1:swapper/0]kd_camera_hw supply vcama_sub2 not found, using dummy regulator
<4>[    1.081301] .(0)[1:swapper/0]kd_camera_hw supply vcamd_sub2 not found, using dummy regulator
<4>[    1.081350] .(0)[1:swapper/0]kd_camera_hw supply vcamio_sub2 not found, using dummy regulator
<3>[    1.082068] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcama_1
<3>[    1.082074] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcama_0
<3>[    1.082079] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamd_1
<3>[    1.082083] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamd_0
<3>[    1.082088] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamio_1
<3>[    1.082092] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamio_0
<3>[    1.082097] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamaf_1
<3>[    1.082101] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_vcamaf_0
<3>[    1.082112] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_main2_vcamd_1
<3>[    1.082117] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_main2_vcamd_0
<3>[    1.082121] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_pnd1
<3>[    1.082125] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_pnd0
<3>[    1.082129] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_rst1
<3>[    1.082134] .(0)[1:swapper/0]gpio_init : pinctrl err, cam3_rst0
<3>[    1.082138] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_sub2_vcamd_1
<3>[    1.082142] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_ldo_sub2_vcamd_0
<3>[    1.082147] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_en_1
<3>[    1.082151] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_en_0
<3>[    1.082155] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_sel_1
<3>[    1.082160] .(0)[1:swapper/0]gpio_init : pinctrl err, cam_mipi_switch_sel_0
<3>[    1.082184] .(0)[1:swapper/0]mclk_init : pinctrl err, cam0_mclk_on
<3>[    1.082196] .(0)[1:swapper/0]mclk_init : pinctrl err, cam1_mclk_on
<3>[    1.082204] .(0)[1:swapper/0]mclk_init : pinctrl err, (null)
<3>[    1.082208] .(0)[1:swapper/0]mclk_init : pinctrl err, (null)
<6>[    1.086253] .(0)[1:swapper/0][register_low_battery_notify] prio_val=5
<6>[    1.086260] .(0)[1:swapper/0][register_battery_percent_notify] prio_val=5
<6>[    1.086265] .(0)[1:swapper/0][register_battery_oc_notify] prio_val=5
<6>[    1.087559] .(1)[1:swapper/0][ccu][ccu_probe] ccu probe cuccess...
<5>[    1.088682] .(1)[1:swapper/0][ccci1/mcd]gpio pinctrl is not ready yet, use workaround.
<6>[    1.099783] .(1)[1:swapper/0][ccci0/rpc]get_md_dtsi_val 1, mediatek,md_drdi_rf_set_idx -- 0xf0f0f0f
<5>[    1.099932] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.099980] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.100028] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.100076] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.100123] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.100171] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.100218] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.100265] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<5>[    1.100313] .(1)[1:swapper/0][ccci1/rpc]get md view gpio id from dt fail
<3>[    1.101042] .(1)[1:swapper/0][CONN-MD-DFT][W]conn_md_add_user:uid (0x00000005) is added to user list successfully
<5>[    1.102053] .(1)[1:swapper/0][ccci1/sys]swtp_init can't find compatible node
<3>[    1.104096] .(1)[1:swapper/0]BOOTPROF:      1104.095232:initcall: modem_cd_init    15.883923ms
<5>[    1.108476] .(2)[1:swapper/0][Thermal/TZ/BTS] mtkts_bts_prepare_table table_num=7
<5>[    1.108496] .(2)[1:swapper/0][Thermal/TZ/BTSMDPA] mtkts_btsmdpa_prepare_table table_num=7
<4>[    1.108525] .(2)[1:swapper/0][Thermal/TZ/CPU]tscpu_init
<4>[    1.108941] .(2)[1:swapper/0][Thermal/TZ/CPU]thermal_prob
<3>[    1.109514] .(2)[1:swapper/0][calibration] temp0=0xa5dea18a, temp1=0x31b855b, temp2=0xbfe1f000
<3>[    1.109522] .(2)[1:swapper/0][lvts_cal] 0: 0x0, 1: 0x0, 2: 0x0
<4>[    1.109527] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_ge_t      = 663
<4>[    1.109531] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_oe_t      = 490
<4>[    1.109534] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_degc_cali     = 45
<4>[    1.109538] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_adc_cali_en_t = 1
<4>[    1.109541] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_slope       = 0
<4>[    1.109545] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_slope_sign  = 0
<4>[    1.109548] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_id            = 0
<4>[    1.109551] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu1     = 397
<4>[    1.109555] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu2     = 389
<4>[    1.109558] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu3     = 394
<4>[    1.109562] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu4     = 383
<4>[    1.109565] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsmcu5     = 384
<4>[    1.109568] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] g_o_vtsabb      = 391
<4>[    1.109572] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_count1_b30c=  0
<4>[    1.109575] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_count2_b30c=  0
<4>[    1.109578] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_count3_b30c=  0
<4>[    1.109582] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_golden_temp1= 0
<4>[    1.109585] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_golden_temp2= 0
<4>[    1.109589] .(2)[1:swapper/0][Thermal/TZ/CPU][cal] lvts_golden_temp3= 0
<4>[    1.109592] .(2)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_ge         = 368
<4>[    1.109596] .(2)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_gain       = 10368
<4>[    1.109599] .(2)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt0   = 8874
<4>[    1.109603] .(2)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt1   = 8856
<4>[    1.109607] .(2)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt2   = 8867
<4>[    1.109611] .(2)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt3   = 8841
<4>[    1.109614] .(2)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt4   = 8843
<4>[    1.109618] .(2)[1:swapper/0][Thermal/TZ/CPU][T_De][cal] g_x_roomt5   = 8860
<4>[    1.109890] -(2)[1:swapper/0][Thermal/TZ/CPU]Driver is NOT ready to report valid temperatures
<6>[    1.111335] .(2)[1:swapper/0][Thermal/TZ/PMIC] [mtktspmic_init]
<6>[    1.111341] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    1.111376] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts        = 1601
<6>[    1.111380] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_2      = 1581
<6>[    1.111383] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_3      = 1584
<6>[    1.111387] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_degc_cali    = 48
<6>[    1.111391] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_adc_cali_en  = 1
<6>[    1.111394] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope      = 0
<6>[    1.111398] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope_sign = 0
<6>[    1.111401] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_id		   = 0
<6>[    1.111405] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    1.111408] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x641
<6>[    1.111411] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x62d
<6>[    1.111415] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x630
<6>[    1.111418] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x30
<6>[    1.111422] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    1.111425] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    1.111429] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    1.111432] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    1.111436] .(2)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=442203, Vbe = -703000
<6>[    1.111442] .(2)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=396517, Vbe = -694000
<6>[    1.111447] .(2)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=397590, Vbe = -696000
<6>[    1.113618] .(2)[1:swapper/0][W]mtk_wcn_cmb_stub_query_ctrl:Thermal query not registered
<3>[    1.113672] .(2)[1:swapper/0][Thermal/TZ/IMGS][mtk_imgs_init]
<4>[    1.116450] .(2)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 3
<4>[    1.116845] .(2)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 1
<4>[    1.117085] .(2)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 2
<4>[    1.119276] .(2)[1:swapper/0][Thermal/TZ/CPU]tscpu_bind binding OK, 0
<3>[    1.119453] .(2)[1:swapper/0][Cooler_NR]mtk_cooler_NR_init 208
<3>[    1.119531] .(2)[1:swapper/0][Cooler_NR]mtk_cooler_NR_init 226
<6>[    1.119617] .(2)[1:swapper/0][Thermal/TZ/PMIC] [mt6356tsbuck1_init]
<6>[    1.119621] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    1.119656] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts        = 1601
<6>[    1.119660] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_2      = 1581
<6>[    1.119663] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_3      = 1584
<6>[    1.119667] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_degc_cali    = 48
<6>[    1.119671] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_adc_cali_en  = 1
<6>[    1.119674] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope      = 0
<6>[    1.119678] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope_sign = 0
<6>[    1.119681] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_id		   = 0
<6>[    1.119685] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    1.119688] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x641
<6>[    1.119692] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x62d
<6>[    1.119695] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x630
<6>[    1.119699] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x30
<6>[    1.119702] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    1.119706] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    1.119709] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    1.119713] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    1.119716] .(2)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=442203, Vbe = -703000
<6>[    1.119722] .(2)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=396517, Vbe = -694000
<6>[    1.119727] .(2)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=397590, Vbe = -696000
<6>[    1.121598] .(2)[1:swapper/0][Thermal/TZ/PMIC] [mt6356tsbuck2_init]
<6>[    1.121602] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  start
<6>[    1.121635] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts        = 1601
<6>[    1.121639] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_2      = 1581
<6>[    1.121642] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_vts_3      = 1584
<6>[    1.121646] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_degc_cali    = 48
<6>[    1.121649] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_adc_cali_en  = 1
<6>[    1.121653] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope      = 0
<6>[    1.121656] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_o_slope_sign = 0
<6>[    1.121659] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] 6356_efuse: g_id		   = 0
<6>[    1.121663] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug]  end
<6>[    1.121666] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts        = 0x641
<6>[    1.121669] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_2      = 0x62d
<6>[    1.121672] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_vts_3      = 0x630
<6>[    1.121676] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_degc_cali    = 0x30
<6>[    1.121679] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_adc_cali_en  = 0x1
<6>[    1.121682] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope      = 0x0
<6>[    1.121686] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_o_slope_sign = 0x0
<6>[    1.121689] .(2)[1:swapper/0][Thermal/TZ/PMIC] [pmic_debug] g_id           = 0x0
<6>[    1.121692] .(2)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1681 INTERCEPT=442203, Vbe = -703000
<6>[    1.121697] .(2)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=396517, Vbe = -694000
<6>[    1.121702] .(2)[1:swapper/0][Thermal/TZ/PMIC] [Thermal calibration] SLOPE1=1000000 SLOPE2=-1863 INTERCEPT=397590, Vbe = -696000
<5>[    1.124823] .(1)[1:swapper/0]mrdump_key_init:MRDUMP_KEY node mediatek, mrdump_ext_rst-eint is not exist
<5>[    1.124823] MRDUMP_KEY is disabled
<6>[    1.124863] .(1)[1:swapper/0]mrdump_sysfs_init: done.
<5>[    1.125061] atf_log: inited<5>[    1.125330] .(1)[1:swapper/0]ATF reserved memory: 0xeff00000 - 0xeff3ffff (0x40000)
<5>[    1.125348] .(1)[1:swapper/0]atf_buf_phy_ctl: 0xeff00000
<5>[    1.125352] .(1)[1:swapper/0]atf_buf_len: 262144
<5>[    1.125355] .(1)[1:swapper/0]atf_buf_vir_ctl: ffffff800bf0e000
<5>[    1.125359] .(1)[1:swapper/0]atf_log_vir_addr: ffffff800bf20100
<5>[    1.125363] .(1)[1:swapper/0]atf_log_len: 81664
<5>[    1.125394] .(1)[1:swapper/0]atf irq num 21.
<5>[    1.125540] atf_time_sync: inited<6>[    1.126903] .(1)[1:swapper/0]SSPM platform service is ready
<4>[    1.127884] .(1)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<-1>, loops:100000, spent 0 sec, 962 usec
<4>[    1.129043] .(1)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<0>, loops:100000, spent 0 sec, 1152 usec
<4>[    1.130320] .(1)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<1>, loops:100000, spent 0 sec, 1131 usec
<4>[    1.131553] .(1)[1:swapper/0]USB_BOOST, <test_loops(), 346> id<2>, loops:100000, spent 0 sec, 1131 usec
<4>[    1.131651] .(1)[1:swapper/0]USB_BOOST, <create_sys_fs(), 514> 
<4>[    1.131922] .(1)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.131927] .(1)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.131932] .(1)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.131936] .(1)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.131940] .(1)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.131944] .(1)[1:swapper/0]USB_BOOST, <usb_boost_set_para_and_arg(), 146> para_range:<4>
<4>[    1.131978] .(1)[1:swapper/0]SLhall_mod_init begin!
<4>[    1.132145] .(1)[1:swapper/0]register slhall device
<4>[    1.132149] .(1)[1:swapper/0]platform_device_slhall_register done!
<4>[    1.132702] .(1)[1:swapper/0]SLhall_probe begin!
<6>[    1.132863] .(1)[1:swapper/0]input: scan-keys as /devices/virtual/input/input1
<4>[    1.132874] .(1)[1:swapper/0][hall]kpd_hall_dev register : success!!
<4>[    1.132930] .(1)[1:swapper/0]SLhall switch_dev_register OK! 
<4>[    1.132956] .(1)[1:swapper/0]SLhall_probe : SLhall_INIT
<4>[    1.133266] .(1)[1:swapper/0]SLhall_probe done!
<4>[    1.133294] .(1)[1:swapper/0]SLhall platform_driver_register done!
<4>[    1.133298] .(1)[1:swapper/0]SLhall_mod_init done!
<3>[    1.133755] .(1)[1:swapper/0]sys_timer 10017000.sys_timer: invalid resource
<6>[    1.133762] .(1)[1:swapper/0]unable to ioremap sysram base, might be disabled
<6>[    1.133766] .(1)[1:swapper/0]mult=161319385, shift=21, maxsec=5000
<6>[    1.133773] .(1)[1:swapper/0]enabled: 1, support_sysram: 0
<4>[    1.134828] .(1)[1:swapper/0]===aw9523 driver version v1.0.0
<4>[    1.134867] .(1)[1:swapper/0]aw9523_i2c_init end 
<4>[    1.135521] .(1)[1:swapper/0]stm32 Initialization : DONE !!
<6>[    1.135966] factory_data_probe+++factory_data_probe---wakeup_management_probe+++wakeup_management_probe---config_data_probe+++<6>[    1.137403] .(1)[1:swapper/0][E][Factory Data](jprkernel_config_read_from_storage): filp_open fail, error code: -2
<6>[    1.137410] .(1)[1:swapper/0][E][Factory Data](read_config_partition): Error
<6>[    1.137414] [E][Factory Data](jprkernel_config_fatal_error_handler): CONFIG DATA FATAL ERROR!<6>[    1.137417] .(1)[1:swapper/0][E][Factory Data](_get_config_item): read_config_partition Error
<6>[    1.137421] .(1)[1:swapper/0][E][Factory Data](_get_config_item): Error
<6>[    1.137424] .(1)[1:swapper/0][E][Factory Data](_config_get_value): [id=21,index=0] Item is NULL
<6>[    1.137429] .(1)[1:swapper/0]config_data_probe--- value=-128 
<3>[    1.137432] [config_data_probe]cmdline=console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6763 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=orange bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=0 bootprof.pl_t=4711 bootprof.lk_t=7366 bootprof.logo_t=1225 boot_reason=4 androidboot.serialno=S19F00013 androidboot.secureboot=49 androidboot.specialid=0 dlconfig_tof_offset=0 dlconfig_tof_x_talk=0 config_data_tof_offset_cali_flag=0 config_data_tof_xtalk_cali_flag=0 config_data_cp_index=0 config_data_charge_current=0 config_data_charge_termination_current=0 config_data_charge_voltage=0 config_data_recharge_threshold=0 config_data_precharge_current=0 config_data_pid_target_temperature=0 config_data_battery_profile_id=0 cmdline_power_on_flag=1 power_key_flag=0 power_on_thre<3>[    1.137464] .(1)[1:swapper/0]cmdline_tof_offset=0
<3>[    1.137486] .(1)[1:swapper/0]cmdline_tof_x_talk=0
<4>[    1.137619] .(1)[1:swapper/0]cmdline_tof_offset_flag = 0 ,cmdline_tof_x_talk_flag = 0
<4>[    1.137655] .(1)[1:swapper/0][func_nv_uint2int] ret=0
<4>[    1.137658] .(1)[1:swapper/0]g_audio_check_test.value = 0 
<4>[    1.137698] .(1)[1:swapper/0]g_smart_reset = 0 
<4>[    1.137735] .(1)[1:swapper/0]cmdline_offset_cali_auxiliary = 0 
<4>[    1.137771] .(1)[1:swapper/0]cmdline_xtalk_cali_auxiliary = 0 
<4>[    1.137807] .(1)[1:swapper/0]cmdline_pos_or_neg_num = 0 
<4>[    1.137844] .(1)[1:swapper/0]proinfo_stress_test_enable.value = 0 
<4>[    1.137848] hehai xxx get_cali_val_from_partition_after_reboot cmdline_offset_cali_auxiliary = 0 ,cmdline_xtalk_cali_auxiliary = 0factory_ext_data_probe+++factory_ext_data_probe---<6>[    1.139136] -(0)[0:swapper/0][DEVAPC] INFRA VIO_STA 0:0x0 1:0x0 2:0x80000000 3:0x0 4:0x0 5:0x0 6:0x0 7:0x0 8:0x0 9:0x4100
<6>[    1.139147] -(0)[0:swapper/0][DEVAPC] VIO_SHIFT_STA: 0x20
<6>[    1.139155] -(0)[0:swapper/0][DEVAPC] Syncing INFRA DBG0 & DBG1 (5, 0)
<6>[    1.139159] -(0)[0:swapper/0][DEVAPC] Syncing INFRA DBG0 & DBG1 (5, 1)
<6>[    1.139163] -(0)[0:swapper/0][DEVAPC] Sync INFRA DBG0 & DBG1 (5) SUCCESS
<6>[    1.139169] -(0)[0:swapper/0][DEVAPC] Violation(Infra,R ) - Process:swapper/0, PID:0, Vio Addr:0x1100a018 (High:0x0), Bus ID:0x63, Dom ID:0x0
<6>[    1.139208] -(0)[0:swapper/0][DEVAPC] Access Violation Slave: PERISYS_SPI0 (infra index=95)
<6>[    1.139292] .(1)[1:swapper/0]mt-spi 1100a000.spi: master is unqueued, this is deprecated
<6>[    1.139552] .(1)[1:swapper/0]mt-spi 11010000.spi: master is unqueued, this is deprecated
<6>[    1.139797] .(1)[1:swapper/0]mt-spi 11012000.spi: master is unqueued, this is deprecated
<6>[    1.140042] .(1)[1:swapper/0]mt-spi 11013000.spi: master is unqueued, this is deprecated
<6>[    1.140286] .(1)[1:swapper/0]mt-spi 11018000.spi: master is unqueued, this is deprecated
<6>[    1.140581] .(1)[1:swapper/0]mt-spi 11019000.spi: master is unqueued, this is deprecated
<6>[    1.143328] .(1)[1:swapper/0]tun: Universal TUN/TAP device driver, 1.6
<6>[    1.143334] .(1)[1:swapper/0]tun: (C) 1999-2004 Max Krasnyansky <maxk@qualcomm.com>
<6>[    1.143407] .(1)[1:swapper/0]PPP generic driver version 2.4.2
<6>[    1.143511] .(1)[1:swapper/0]PPP BSD Compression module registered
<6>[    1.143521] .(1)[1:swapper/0]PPP Deflate Compression module registered
<6>[    1.143544] .(1)[1:swapper/0]PPP MPPE Compression module registered
<6>[    1.143560] .(1)[1:swapper/0]NET: Registered protocol family 24
<6>[    1.143671] .(1)[1:swapper/0]usbcore: registered new interface driver rtl8150
<6>[    1.143717] .(1)[1:swapper/0]usbcore: registered new interface driver r8152
<6>[    1.143761] .(1)[1:swapper/0]usbcore: registered new interface driver lan78xx
<6>[    1.143833] .(1)[1:swapper/0]usbcore: registered new interface driver usb-storage
<6>[    1.143873] .(1)[1:swapper/0]usbcore: registered new interface driver ums-alauda
<6>[    1.143911] .(1)[1:swapper/0]usbcore: registered new interface driver ums-cypress
<6>[    1.143952] .(1)[1:swapper/0]usbcore: registered new interface driver ums-datafab
<6>[    1.143993] .(1)[1:swapper/0]usbcore: registered new interface driver ums-freecom
<6>[    1.144032] .(1)[1:swapper/0]usbcore: registered new interface driver ums-isd200
<6>[    1.144070] .(1)[1:swapper/0]usbcore: registered new interface driver ums-jumpshot
<6>[    1.144108] .(1)[1:swapper/0]usbcore: registered new interface driver ums-karma
<6>[    1.144146] .(1)[1:swapper/0]usbcore: registered new interface driver ums-onetouch
<6>[    1.144186] .(1)[1:swapper/0]usbcore: registered new interface driver ums-sddr09
<6>[    1.144225] .(1)[1:swapper/0]usbcore: registered new interface driver ums-sddr55
<6>[    1.144263] .(1)[1:swapper/0]usbcore: registered new interface driver ums-usbat
<6>[    1.144310] .(1)[1:swapper/0]usbcore: registered new interface driver trancevibrator
<6>[    1.144399] .(1)[1:swapper/0]usb_function_register name=acm
<6>[    1.144428] .(1)[1:swapper/0]usb_function_register name=gser
<6>[    1.144682] .(1)[1:swapper/0]usb_function_register name=rndis
<6>[    1.144694] .(1)[1:swapper/0]usb_function_register name=mass_storage
<6>[    1.144704] .(1)[1:swapper/0]usb_function_register name=ffs
<6>[    1.144714] .(1)[1:swapper/0]usb_function_register name=midi
<6>[    1.144725] .(1)[1:swapper/0]usb_function_register name=hid
<6>[    1.144734] .(1)[1:swapper/0]usb_function_register name=mtp
<6>[    1.144743] .(1)[1:swapper/0]usb_function_register name=ptp
<6>[    1.144753] .(1)[1:swapper/0]usb_function_register name=audio_source
<6>[    1.144762] .(1)[1:swapper/0]usb_function_register name=accessory
<6>[    1.145688] .(1)[1:swapper/0]input: mtk-kpd as /devices/platform/10010000.kp/input/input2
<4>[    1.149339] .(1)[1:swapper/0][tpd_em_log] :register device successfully
<4>[    1.149351] .(1)[1:swapper/0]<<GTP-INF>>[tpd_driver_init:1088]  Goodix touch panel driver init.
<6>[    1.150995] .(1)[1:swapper/0]mtk-tpd: [tpd]use-tpd-button = 1
<6>[    1.151008] .(1)[1:swapper/0]mtk-tpd: [tpd]tpd-filter-enable = 1, pixel_density = 146
<6>[    1.151017] .(1)[1:swapper/0]mtk-tpd: tpd-rst-ext-gpio-num not found
<3>[    1.151096] .(1)[1:swapper/0]stmvl53l0x_init: Enter
<3>[    1.151100] .(1)[1:swapper/0]stmvl53l0x_init_i2c: Enter
<3>[    1.151137] .(1)[1:swapper/0]stmvl53l0x_init_i2c: End with rc:0
<3>[    1.151142] .(1)[1:swapper/0]stmvl53l0x_init: End
<4>[    1.151301] .(1)[1:swapper/0]Mapp dma regs successfully.
<3>[    1.151305] .(1)[1:swapper/0] mt_i2c_init driver as platform device
<6>[    1.152117] .(1)[1:swapper/0][I2C] id : 0, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.152237] .(1)[1:swapper/0]mt-i2c 11007000.i2c: i2c0 clock source ffffffc05c26e980,clock src frequency 13650000
<4>[    1.152688] .(1)[1:swapper/0]Map cg regs successfully.
<6>[    1.152750] .(1)[1:swapper/0][I2C] id : 1, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.152846] .(1)[1:swapper/0]mt-i2c 11014000.i2c: i2c1 clock source ffffffc05c27c780,clock src frequency 13650000
<3>[    1.153467] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/irq_nfc
<3>[    1.153474] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_3
<3>[    1.153480] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/mhall
<3>[    1.153486] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_2
<3>[    1.153491] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_1
<3>[    1.153497] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/hall_4
<3>[    1.153502] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/low_g
<3>[    1.153508] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/wc_pmode
<3>[    1.153514] .(5)[1:swapper/0]i2c i2c-1: of_i2c: invalid reg on /i2c@11014000/tx_wlc
<3>[    1.153683] .(5)[1:swapper/0]stmvl53l0x_probe: Enter
<3>[    1.153688] .(5)[1:swapper/0]stmvl53l0x_parse_vdd: Enter
<4>[    1.153724] .(5)[1:swapper/0]1-0029 supply vdd not found, using dummy regulator
<3>[    1.153773] .(5)[1:swapper/0]stmvl53l0x_parse_vdd: End
<3>[    1.153777] .(5)[1:swapper/0]stmvl53l0x_setup: Enter
<3>[    1.153900] .(5)[213:STM-VL53L0]stmvl53l0x_poll_thread(818) : Starting Polling thread
<6>[    1.154024] .(6)[1:swapper/0]input: STM VL53L0 proximity sensor as /devices/virtual/input/input3
<3>[    1.154135] .(6)[1:swapper/0]stmvl53l0x_setup: Misc device registration name:1-0029
<3>[    1.154187] .(6)[1:swapper/0]stmvl53l0x_setup: support ver. 1.0.5 enabled
<3>[    1.154190] stmvl53l0x_setup: End<3>[    1.154192] .(6)[1:swapper/0]stmvl53l0x_probe: End
<4>[    1.154587] .(6)[1:swapper/0]aw9523_i2c_probe~~~~~
<6>[    1.154602] .(6)[1:swapper/0]aw9523_led 1-0059: aw9523_parse_dt: reset gpio provided ok
<3>[    1.154610] .(6)[1:swapper/0]aw9523_led 1-0059: aw9523_i2c_probe: rst request failed
<6>[    1.154613] .(6)[1:swapper/0]aw9523_hw_reset enter
<6>[    1.168557] .(0)[1:swapper/0]aw9523_read_chipid aw9523 detected
<4>[    1.168564] .(0)[1:swapper/0][bswap_led_red_on] level=0
<6>[    1.170329] .(0)[1:swapper/0]aw9523_i2c_probe probe completed successfully!
<3>[    1.170349] .(0)[1:swapper/0]BOOTPROF:      1170.348925:probe: probe=i2c_device_probe drv=aw9523_led(ffffff80096a4758)    15.751923ms
<3>[    1.170390] .(0)[1:swapper/0]BOOTPROF:      1170.390078:probe: probe=platform_drv_probe drv=mt-i2c(ffffff80096c01d0)    17.645538ms
<6>[    1.170455] .(0)[1:swapper/0][I2C] id : 2, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.170555] .(0)[1:swapper/0]mt-i2c 11015000.i2c: i2c2 clock source ffffffc05c042700,clock src frequency 13650000
<4>[    1.170821] .(0)[1:swapper/0][fg_27542_driver_probe] address=55
<4>[    1.173012] .(0)[1:swapper/0]fg_27542 is_sealed sealed = 1 
<4>[    1.228867] .(0)[1:swapper/0]factory info data: data[0]=d3 data[1]=2 
<4>[    1.230157] .(0)[1:swapper/0]factory info data: data[2]=12 data[3]=6 
<4>[    1.230682] .(0)[1:swapper/0]factory info data: data[4]=0 data[5]=0 
<4>[    1.231187] .(0)[1:swapper/0]factory info data: data[6]=1 data[7]=32 
<4>[    1.231689] .(0)[1:swapper/0]factory info data: data[8]=30 data[9]=31 
<4>[    1.232891] .(0)[1:swapper/0]factory info data: data[10]=38 data[11]=30 
<4>[    1.233411] .(0)[1:swapper/0]factory info data: data[12]=36 data[13]=32 
<4>[    1.233914] .(0)[1:swapper/0]factory info data: data[14]=31 data[15]=30 
<4>[    1.234832] .(0)[1:swapper/0]factory info data: data[16]=30 data[17]=38 
<4>[    1.235356] .(0)[1:swapper/0]factory info data: data[18]=33 data[19]=53 
<4>[    1.235867] .(0)[1:swapper/0]factory info data: data[20]=43 data[21]=55 
<4>[    1.236383] .(0)[1:swapper/0]factory info data: data[22]=49 data[23]=44 
<4>[    1.237696] .(0)[1:swapper/0]factory info data: data[24]=0 data[25]=0 
<4>[    1.238226] .(0)[1:swapper/0]factory info data: data[26]=0 data[27]=f 
<4>[    1.238739] .(0)[1:swapper/0]factory info data: data[28]=8c data[29]=0 
<4>[    1.239250] .(0)[1:swapper/0]factory info data: data[30]=0 data[31]=0 
<4>[    1.240141] .(0)[1:swapper/0]random message:9d 
<4>[    1.240499] .(0)[1:swapper/0]random message:a4 
<4>[    1.240879] .(0)[1:swapper/0]random message:be 
<4>[    1.241267] .(0)[1:swapper/0]random message:f6 
<4>[    1.241653] .(0)[1:swapper/0]random message:99 
<4>[    1.242033] .(0)[1:swapper/0]random message:93 
<4>[    1.242345] .(0)[1:swapper/0]random message:cd 
<4>[    1.242656] .(0)[1:swapper/0]random message:b2 
<4>[    1.243073] .(0)[1:swapper/0]random message:a0 
<4>[    1.243421] .(0)[1:swapper/0]random message:21 
<4>[    1.243811] .(0)[1:swapper/0]random message:d7 
<4>[    1.244197] .(0)[1:swapper/0]random message:4b 
<4>[    1.244591] .(0)[1:swapper/0]random message:96 
<4>[    1.244965] .(0)[1:swapper/0]random message:da 
<4>[    1.245277] .(0)[1:swapper/0]random message:42 
<4>[    1.245587] .(0)[1:swapper/0]random message:b1 
<4>[    1.246533] .(0)[1:swapper/0]random message:0 
<4>[    1.246881] .(0)[1:swapper/0]random message:1a 
<4>[    1.247271] .(0)[1:swapper/0]random message:66 
<4>[    1.247659] .(0)[1:swapper/0]random message:64 
<4>[    1.276370] .(0)[202:krtatm][Thermal/TZ/CPU]krtatm_thread c 26600 p 0 cl 2147483647 gl 2147483647 s 0
<4>[    1.354688] .(0)[1:swapper/0]data[0]: a7 
<4>[    1.354693] .(0)[1:swapper/0]data[1]: 6f 
<4>[    1.354697] .(0)[1:swapper/0]data[2]: e0 
<4>[    1.354700] .(0)[1:swapper/0]data[3]: e5 
<4>[    1.354704] .(0)[1:swapper/0]data[4]: 56 
<4>[    1.354707] .(0)[1:swapper/0]data[5]: 90 
<4>[    1.354711] .(0)[1:swapper/0]data[6]: ed 
<4>[    1.354714] .(0)[1:swapper/0]data[7]: ee 
<4>[    1.354717] .(0)[1:swapper/0]data[8]: a1 
<4>[    1.354721] .(0)[1:swapper/0]data[9]: 62 
<4>[    1.354724] .(0)[1:swapper/0]data[10]: af 
<4>[    1.354727] .(0)[1:swapper/0]data[11]: c6 
<4>[    1.354731] .(0)[1:swapper/0]data[12]: 85 
<4>[    1.354734] .(0)[1:swapper/0]data[13]: ab 
<4>[    1.354738] .(0)[1:swapper/0]data[14]: f9 
<4>[    1.354741] .(0)[1:swapper/0]data[15]: c5 
<4>[    1.354753] .(0)[1:swapper/0]result: f3ac6ec8, c5f9ab85, c6af62a1, eeed9056, e5e06fa7 
<4>[    1.354758] .(0)[1:swapper/0]SHA-1 check passed
<4>[    1.354761] .(0)[1:swapper/0]fg_27542 fg_27542_driver_probe eeprom_rev:2 
<3>[    1.354937] .(2)[1:swapper/0]BOOTPROF:      1354.936310:probe: probe=i2c_device_probe drv=fg_27542(ffffff800965f240)   184.106154ms
<4>[    1.355056] .(2)[1:swapper/0][mcp_6442_driver_probe] address=2c
<4>[    1.355242] .(2)[1:swapper/0]mcp reg[0xcc] val = 0x00 0x00
<4>[    1.368346] .(2)[1:swapper/0]******** mcp_6442_user_space_probe!! version=0 ********
<4>[    1.368529] .(2)[1:swapper/0]mcp reg[0x8c] val = 0x00 0x25
<4>[    1.384530] .(2)[1:swapper/0]mcp reg[0x2c] val = 0x00 0x16
<4>[    1.404527] .(2)[1:swapper/0]mcp reg[0x3c] val = 0x00 0x17
<4>[    1.420530] .(2)[1:swapper/0]mcp reg[0x6c] val = 0x00 0x07
<4>[    1.436547] .(2)[1:swapper/0]mcp reg[0x7c] val = 0x00 0x08
<4>[    1.452533] .(2)[1:swapper/0]mcp reg[0x9c] val = 0x00 0x70
<4>[    1.468353] .(2)[1:swapper/0]mcp_6442 :  112  112  37  37  22  23  7  8 
<3>[    1.468370] .(2)[1:swapper/0]BOOTPROF:      1468.369848:probe: probe=i2c_device_probe drv=mcp_6442(ffffff800965fc88)   113.308769ms
<6>[    1.468598] .(2)[1:swapper/0]MAINAF [AF_i2c_probe] Start
<6>[    1.468603] .(2)[1:swapper/0]MAINAF [Register_AF_CharDrv] Start
<6>[    1.468694] .(2)[1:swapper/0]MAINAF [Register_AF_CharDrv] End
<6>[    1.468699] .(2)[1:swapper/0]MAINAF [AFRegulatorCtrl] AFIOC_S_SETPOWERCTRL regulator_put           (null)
<4>[    1.469008] .(2)[1:swapper/0]MAINAF supply vcamaf not found, using dummy regulator
<6>[    1.469073] .(2)[1:swapper/0]MAINAF [AFRegulatorCtrl] [Init] regulator_get ffffffc05c20a980
<6>[    1.469078] .(2)[1:swapper/0]MAINAF [AF_i2c_probe] Attached!!
<4>[    1.469296] .(2)[1:swapper/0][wlc_51025_driver_probe] address=6c
<6>[    1.469558] .(2)[1:swapper/0]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    1.469565] .(2)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.469569] .(2)[1:swapper/0]I2C structure:
<3>[    1.469569] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=2,Total_len=1
<3>[    1.469569] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    1.469569] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.469580] .(2)[1:swapper/0]base address 0xffffff800bf46000
<6>[    1.469591] .(2)[1:swapper/0]I2C register:
<6>[    1.469591] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=1,CONTROL=28,TRANSFER_LEN=1
<6>[    1.469591] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.469591] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    1.469602] .(2)[1:swapper/0]before enable DMA register(0xffffff800bf48400):
<6>[    1.469602] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.469602] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.469602] [I2C]TX_LEN=0,RX_LEN=10,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.469602] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.469616] .(2)[1:swapper/0]DMA register(0xffffff800bf48400):
<6>[    1.469616] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    1.469616] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c045010
<6>[    1.469616] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=10101000
<6>[    1.469616] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.469626] .(2)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.469631] .(2)[1:swapper/0]i2c i2c-2: last transfer info:
<3>[    1.469637] .(2)[1:swapper/0]i2c i2c-2: [00] [    1.469554] SLAVE_ADDR=d8,INTR_STAT=2,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.469647] .(2)[1:swapper/0]i2c i2c-2: [01] [    1.452526] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.469656] .(2)[1:swapper/0]i2c i2c-2: [02] [    1.436539] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.469665] .(2)[1:swapper/0]i2c i2c-2: [03] [    1.420524] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.469675] .(2)[1:swapper/0]i2c i2c-2: [04] [    1.404520] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=499
<3>[    1.469684] .(2)[1:swapper/0]i2c i2c-2: [05] [    1.384523] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.469693] .(2)[1:swapper/0]i2c i2c-2: [06] [    1.368522] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.469702] .(2)[1:swapper/0]i2c i2c-2: [07] [    1.355235] SLAVE_ADDR=58,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1320,DEBUGSTAT=300, tmo=500
<3>[    1.469711] .(2)[1:swapper/0]i2c i2c-2: [08] [    1.354681] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=1,DEBUGSTAT=300, tmo=500
<3>[    1.469720] .(2)[1:swapper/0]i2c i2c-2: [09] [    1.352550] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<4>[    1.469760] .(2)[1:swapper/0]wlc_51025 :  0  0  
<4>[    1.470468] .(2)[1:swapper/0][Hall]wlc_51025_driver_probe can't find compatible node
<3>[    1.470510] .(2)[1:swapper/0]BOOTPROF:      1470.509694:probe: probe=platform_drv_probe drv=mt-i2c(ffffff80096c01d0)   300.055462ms
<6>[    1.470579] .(2)[1:swapper/0][I2C] id : 5, freq : 3400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.470708] .(2)[1:swapper/0]mt-i2c 1100f000.i2c: i2c5 clock source ffffffc05c211800,clock src frequency 13650000
<3>[    1.471938] .(2)[1:swapper/0]mt6370_pmu 5-0034: find mt6370_pmu_dts node
<6>[    1.471958] .(2)[1:swapper/0]regmap_device_register: name = mt6370_pmu
<6>[    1.472012] .(2)[1:swapper/0] rt_regmap_mt6370_pmu: rt register cache data init
<6>[    1.472038] .(2)[1:swapper/0] rt_regmap_mt6370_pmu: cache cata init successfully
<6>[    1.480134] .(2)[1:swapper/0]mt6370_pmu_core mt6370_pmu_core: mt6370_pmu_core_probe successfully
<6>[    1.480364] .(2)[1:swapper/0]mt6370_pmu_charger_probe: (1.1.24_MTK)
<6>[    1.480373] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt_parse_dt
<3>[    1.480382] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt_parse_dt: no chg alias name
<3>[    1.480389] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt_parse_dt: no ls alias name
<3>[    1.480409] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_pmu_charger_probe: get usb switch failed
<6>[    1.480419] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_chg_init_setting
<6>[    1.480425] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_select_input_current_limit: select input current limit = 2
<6>[    1.485608] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_ilim: en = 0
<6>[    1.487379] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_set_mivr: mivr = 4400000 (0x05)
<4>[    1.487557] .(2)[1:swapper/0]DLCP __mt6370_set_cv       = 4350000
<4>[    1.487729] .(2)[1:swapper/0]DLCP __mt6370_set_ieoc      = 150000
<6>[    1.487976] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_enable_te: en = 1
<6>[    1.488173] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_fast_charge_timer: timer = 12 (0x04)
<6>[    1.488359] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_dc_wdt: wdt = 4000ms(0x06)
<6>[    1.488526] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_enable_safety_timer: en = 1
<6>[    1.488692] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_wdt: en = 0
<6>[    1.488872] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_disable_warm_cool_jeita
<6>[    1.489046] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_hz: en = 0
<6>[    1.489211] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_ircmp_resistor: resistor = 25000 (0x01)
<6>[    1.489808] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_set_ircmp_vclamp: vclamp = 32000 (0x01)
<6>[    1.489989] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: __mt6370_enable_chgdet_flow: en = 0
<6>[    1.490163] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_chg_sw_workaround
<6>[    1.490694] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_chg_sw_workaround: zcv = (0x00, 0x00, 0mV)
<6>[    1.492704] .(2)[1:swapper/0]mt6370_pmu_charger mt6370_pmu_charger: mt6370_pmu_charger_probe successfully
<6>[    1.492887] .(2)[1:swapper/0]mt6370_pmu_fled_probe (1.0.2_MTK) id = 0
<6>[    1.492893] .(2)[1:swapper/0]mt6370_fled_parse_dt start
<6>[    1.492897] .(2)[1:swapper/0]mt6370_fled_parse_dt use torch cur 300000
<6>[    1.493386] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe cur 1200000
<6>[    1.493567] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe timeout 2400
<6>[    1.493742] .(2)[1:swapper/0]mt6370_pmu_fled_probe flash name = mt-flash-led1
<6>[    1.493839] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-388: Richtek FlashLED Driver is probing
<4>[    1.493846] .(2)[1:swapper/0]rt-flash-led:rtfled_check_hal_implement() line-374: check_hal_implemented have NULL item.
<6>[    1.493940] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-406: Richtek FlashLED Driver initialized successfully
<6>[    1.495886] .(2)[1:swapper/0]mt6370_pmu_fled mt6370_pmu_fled.0: mt6370 fled inited
<6>[    1.495893] .(2)[1:swapper/0]mt6370_pmu_fled mt6370_pmu_fled.0: mt6370_pmu_fled_probe successfully
<6>[    1.496060] .(2)[1:swapper/0]mt6370_pmu_fled_probe (1.0.2_MTK) id = 1
<6>[    1.496065] .(2)[1:swapper/0]mt6370_fled_parse_dt start
<6>[    1.496069] .(2)[1:swapper/0]mt6370_fled_parse_dt use torch cur 200000
<6>[    1.496254] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe cur 1000000
<6>[    1.496429] .(2)[1:swapper/0]mt6370_fled_parse_dt use strobe timeout 1200
<6>[    1.496514] .(2)[1:swapper/0]mt6370_pmu_fled_probe flash name = mt-flash-led2
<6>[    1.496610] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-388: Richtek FlashLED Driver is probing
<4>[    1.496617] .(2)[1:swapper/0]rt-flash-led:rtfled_check_hal_implement() line-374: check_hal_implemented have NULL item.
<6>[    1.496703] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-406: Richtek FlashLED Driver initialized successfully
<6>[    1.496714] .(2)[1:swapper/0]mt6370_pmu_fled mt6370_pmu_fled.1: mt6370_pmu_fled_probe successfully
<6>[    1.496889] .(2)[1:swapper/0]mt6370_pmu_ldo mt6370_pmu_ldo: regulator_name = irtx_ldo, min_uV = 1600000, max_uV = 4000000
<6>[    1.497381] .(2)[1:swapper/0]mt6370_pmu_ldo mt6370_pmu_ldo: mt6370_pmu_ldo_probe successfully
<6>[    1.502587] .(2)[1:swapper/0]mt6370_pmu_rgbled mt6370_pmu_rgbled: mt6370_pmu_rgbled_probe successfully
<6>[    1.504857] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-388: Richtek FlashLED Driver is probing
<6>[    1.504951] .(2)[1:swapper/0]rt-flash-led:rtfled_probe() line-406: Richtek FlashLED Driver initialized successfully
<6>[    1.505087] .(2)[1:swapper/0]mt6370_pmu_bled mt6370_pmu_bled: mt6370_pmu_bled_probe successfully
<6>[    1.505336] .(2)[1:swapper/0]mt6370_pmu 5-0034: mt6370_pmu_probe successfully
<3>[    1.505356] .(2)[1:swapper/0]BOOTPROF:      1505.355771:probe: probe=i2c_device_probe drv=mt6370_pmu(ffffff800966cb08)    34.314308ms
<6>[    1.505582] .(2)[1:swapper/0]mt6370_i2c_probe
<6>[    1.505587] .(2)[1:swapper/0]I2C functionality : OK...
<6>[    1.507983] .(0)[45:pd_dbg_info]///PD dbg info 145d
<4>[    1.507990] <    1.507>0
<4>[    1.507990] <    1.507>pd_dbg_info : t2-t1 = 14
<4>[    1.507990] <    1.507>1
<4>[    1.507990] <    1.507>pd_dbg_info : t2-t1 = 1
<4>[    1.507990] <    1.507>2
<4>[    1.507990] <    1.507>pd_dbg_.(0)[45:pd_dbg_info]info : t2-t1 = 2
<6>[    1.508011] .(2)[1:swapper/0]0
<6>[    1.508015] .(2)[1:swapper/0]pr_info : t2-t1 = 4
<6>[    1.508019] .(2)[1:swapper/0]1
<6>[    1.508022] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.508026] .(2)[1:swapper/0]2
<6>[    1.508029] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.508032] .(2)[1:swapper/0]3
<6>[    1.508035] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.508038] .(2)[1:swapper/0]4
<6>[    1.508041] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.508044] .(2)[1:swapper/0]5
<6>[    1.508047] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.508050] .(2)[1:swapper/0]6
<6>[    1.508054] .(2)[1:swapper/0]pr_info : t2-t1 = 3
<6>[    1.508057] .(2)[1:swapper/0]7
<6>[    1.508060] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.508063] .(2)[1:swapper/0]8
<6>[    1.508066] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.508069] .(2)[1:swapper/0]9
<6>[    1.508072] .(2)[1:swapper/0]pr_info : t2-t1 = 2
<6>[    1.508077] .(2)[1:swapper/0]mt_parse_dt
<6>[    1.508456] .(2)[1:swapper/0]mt6370_chipID = 0x2486
<6>[    1.508470] .(2)[1:swapper/0]regmap_device_register: name = mt6370-4e
<6>[    1.508517] .(2)[1:swapper/0] rt_regmap_mt6370-4e: rt register cache data init
<6>[    1.508529] .(2)[1:swapper/0] rt_regmap_mt6370-4e: cache cata init successfully
<6>[    1.508810] .(2)[1:swapper/0]tcpc_device_register register tcpc device (type_c_port0)
<6>[    1.508919] .(2)[1:swapper/0]PD Timer number = 57
<6>[    1.509031] .(2)[1:swapper/0]tcpci_timer_init : init OK
<6>[    1.509036] .(2)[1:swapper/0]pd_parse_pdata
<6>[    1.509145] .(2)[1:swapper/0]pd_parse_pdata src pdo data =
<6>[    1.509149] .(2)[1:swapper/0]pd_parse_pdata 0: 0x00019032
<6>[    1.509155] .(2)[1:swapper/0]pd_parse_pdata snk pdo data =
<6>[    1.509159] .(2)[1:swapper/0]pd_parse_pdata 0: 0x000190c8
<6>[    1.509163] .(2)[1:swapper/0]pd_parse_pdata 1: 0xc0761e3c
<6>[    1.509169] .(2)[1:swapper/0]pd_parse_pdata id vdos data =
<6>[    1.509172] .(2)[1:swapper/0]pd_parse_pdata 0: 0xd10029cf
<6>[    1.509176] .(2)[1:swapper/0]pd_parse_pdata 1: 0x00000000
<6>[    1.509180] .(2)[1:swapper/0]pd_parse_pdata 2: 0x00010000
<6>[    1.509184] .(2)[1:swapper/0]pd_parse_pdata charging_policy = 33
<6>[    1.509189] .(2)[1:swapper/0]pd_parse_pdata_bats Battery NR = 1
<6>[    1.509199] .(2)[1:swapper/0]pd_parse_pdata_bats fix_bat_info[0].mfrs_info.vid = 0x29cf, 					    .mfrs_info.pid = 0x1711, 					    .mfrs_string = bat1, 					    .bat_design_cap = 3000
<6>[    1.509207] .(2)[1:swapper/0]pd_parse_pdata_countries Country NR = 0
<6>[    1.509212] .(2)[1:swapper/0]pd_parse_log_src_cap_ext vid = 0x29cf, pid = 0x1711, xid = 0x0, 		fw_ver = 0x2, hw_ver = 0x1
<6>[    1.509219] .(2)[1:swapper/0]pd_parse_log_src_cap_ext voltage_regulation = 0, hold_time_ms = 0, compliance = 0x0, 		touch_current = 0x0, peak_current = 0 0 0
<6>[    1.509225] .(2)[1:swapper/0]pd_parse_log_src_cap_ext touch_temp = 0, source_inputs = 0x0, 		batteries = 0x0, source_pdp = 0x2
<6>[    1.509231] .(2)[1:swapper/0]pd_parse_pdata_mfrs VID = 0x29cf, PID = 0x5081
<6>[    1.509237] .(2)[1:swapper/0]pd_parse_pdata_mfrs PD mfrs_string = RichtekTCPC
<6>[    1.509310] .(2)[1:swapper/0]dpm_caps: local_dr_power
<6>[    1.509314] .(2)[1:swapper/0]dpm_caps: local_dr_data
<6>[    1.509319] .(2)[1:swapper/0]dpm_caps: local_ext_power
<6>[    1.509323] .(2)[1:swapper/0]dpm_caps: local_usb_comm
<6>[    1.509326] .(2)[1:swapper/0]dpm_caps: local_usb_suspend
<6>[    1.509330] .(2)[1:swapper/0]dpm_caps: local_high_cap
<6>[    1.509334] .(2)[1:swapper/0]dpm_caps: local_give_back
<6>[    1.509337] .(2)[1:swapper/0]dpm_caps: local_no_suspend
<6>[    1.509341] .(2)[1:swapper/0]dpm_caps: local_vconn_supply
<6>[    1.509345] .(2)[1:swapper/0]dpm_caps: attemp_discover_cable_dfp
<6>[    1.509349] .(2)[1:swapper/0]dpm_caps: attemp_enter_dp_mode
<6>[    1.509352] .(2)[1:swapper/0]dpm_caps: attemp_discover_cable
<6>[    1.509356] .(2)[1:swapper/0]dpm_caps: attemp_discover_id
<6>[    1.509360] .(2)[1:swapper/0]dpm_caps: pr_reject_as_source
<6>[    1.509363] .(2)[1:swapper/0]dpm_caps: pr_reject_as_sink
<6>[    1.509367] .(2)[1:swapper/0]dpm_caps: pr_check_gp_source
<6>[    1.509371] .(2)[1:swapper/0]dpm_caps: pr_check_gp_sink
<6>[    1.509375] .(2)[1:swapper/0]dpm_caps: dr_reject_as_dfp
<6>[    1.509378] .(2)[1:swapper/0]dpm_caps: dr_reject_as_ufp
<6>[    1.509383] .(2)[1:swapper/0]dpm_caps = 0x0010e18b
<3>[    1.509455] .(2)[1:swapper/0]dp_parse_svid_data get displayport data fail
<6>[    1.509770] .(2)[1:swapper/0]usb_type_c 5-004e: PD_REV30
<6>[    1.512021] .(2)[1:swapper/0]mt6370_init_alert name = type_c_port0, gpio = 389
<6>[    1.512060] .(2)[1:swapper/0]mt6370_init_alert : IRQ number = 713
<6>[    1.512165] .(2)[1:swapper/0]IRQF_NO_THREAD Test
<6>[    1.512213] .(2)[1:swapper/0]mt6370_i2c_probe probe OK!
<3>[    1.512263] .(2)[1:swapper/0]BOOTPROF:      1512.262464:probe: probe=platform_drv_probe drv=mt-i2c(ffffff80096c01d0)    41.685231ms
<6>[    1.512361] .(2)[1:swapper/0][I2C] id : 3, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.512480] .(2)[1:swapper/0]mt-i2c 11011000.i2c: i2c3 clock source ffffffc05c2f0700,clock src frequency 13650000
<4>[    1.512810] .(2)[1:swapper/0]pn548_probe: start...
<4>[    1.512814] .(2)[1:swapper/0]pn548_probe: step02 is ok
<4>[    1.512818] .(2)[1:swapper/0]pn548_dev=ffffffc05c2f3200
<4>[    1.512822] .(2)[1:swapper/0]pn548_probe: step03 is ok
<4>[    1.512892] .(2)[1:swapper/0]pn548_probe: step04 is ok
<4>[    1.512897] .(2)[1:swapper/0]pn548_probe: step05 is ok
<4>[    1.513193] .(2)[1:swapper/0]pn548_dev->irq_gpio = 26
<4>[    1.513361] .(2)[1:swapper/0]pn548 client->irq = 699
<4>[    1.513393] .(2)[1:swapper/0]pn548_probe: set EINT finished, client->irq=699
<4>[    1.513398] .(2)[1:swapper/0]pn548_disable_irq
<4>[    1.513403] .(2)[1:swapper/0]pn548_platform_pinctrl_select
<4>[    1.513427] .(2)[1:swapper/0]pn548_probe: step06 success
<6>[    1.513504] .(2)[1:swapper/0][I2C] id : 4, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.513608] .(2)[1:swapper/0]mt-i2c 11017000.i2c: i2c4 clock source ffffffc05c2f6700,clock src frequency 13650000
<6>[    1.514116] .(2)[1:swapper/0]MAINAF [AFRegulatorCtrl] AFIOC_S_SETPOWERCTRL regulator_put ffffffc05c20a980
<4>[    1.514327] .(2)[1:swapper/0]fx16408 probe 
<4>[    1.514450] .(2)[1:swapper/0]STM32 Device is awake: 0x5c
<4>[    1.514530] .(2)[1:swapper/0]stm32_i2c: probe of 4-005c failed with error -1
<6>[    1.514595] .(2)[1:swapper/0][I2C] id : 6, freq : 3400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.514682] .(2)[1:swapper/0]mt-i2c 11005000.i2c: i2c6 clock source ffffffc05c300100,clock src frequency 13650000
<6>[    1.514996] .(2)[1:swapper/0][I2C] id : 7, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.515085] .(2)[1:swapper/0]mt-i2c 11008000.i2c: i2c7 clock source ffffffc05c300e00,clock src frequency 13650000
<6>[    1.515290] .(2)[1:swapper/0][I2C] id : 8, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.515376] .(2)[1:swapper/0]mt-i2c 11009000.i2c: i2c8 clock source ffffffc05c304a80,clock src frequency 13650000
<6>[    1.515788] .(2)[1:swapper/0][I2C] id : 9, freq : 400000, div : 5, ch_offset: 0, dma_ch_offset: 0
<4>[    1.515875] .(2)[1:swapper/0]mt-i2c 11016000.i2c: i2c9 clock source ffffffc05c30aa80,clock src frequency 13650000
<3>[    1.518540] .(2)[1:swapper/0]BOOTPROF:      1518.539618:initcall: mt_i2c_init   367.371386ms
<5>[    1.518700] .(2)[1:swapper/0]netlink_kernel_create protol= 26
<5>[    1.518704] .(2)[1:swapper/0]netlink_kernel_create ok
<5>[    1.520123] .(2)[1:swapper/0]******** battery_dts_probe!! ********
<5>[    1.520552] .(2)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    1.520567] -(2)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    1.520576] .(2)[1:swapper/0][fgauge_read_RTC_boot_status] rtc_invalid 0 plugout 0 plugout_time 0 spare3 0xe4 spare0 0x60 hw_id 0x5640
<5>[    1.520979] .(2)[1:swapper/0][fgauge_get_profile_id]Battery id=(0) en:0,0
<5>[    1.521398] .(2)[1:swapper/0][BAT_probe] power_supply_register Battery Success !!
<5>[    1.522018] .(2)[1:swapper/0] fg_swocv_v = 43219 len 5 fg_swocv_v_tmp 43219 ptim_lk_v[43219]
<5>[    1.522042] .(2)[1:swapper/0] fg_swocv_i = -151 len 3 fg_swocv_i_tmp -15 ptim_lk_i[-15]
<5>[    1.522063] .(2)[1:swapper/0] shutdown_time = 0151 len 1 shutdown_time_tmp 0 pl_shutdown_time[0]
<5>[    1.522084] .(2)[1:swapper/0] boot_voltage = 4311 len 4 boot_voltage_tmp 4311 pl_bat_vol[4311]
<4>[    1.523138] .(2)[1:swapper/0]=====FG===== AC   = 90
<5>[    1.523155] .(2)[1:swapper/0]read DISABLE_MTKBATTERY fail
<5>[    1.523159] .(2)[1:swapper/0][fgauge_get_profile_id]Battery id=(0) en:0,0
<5>[    1.523163] .(2)[1:swapper/0]fg_custom_init_from_dts
<5>[    1.523174] .(2)[1:swapper/0]Get MTK_CHR_EXIST failed
<5>[    1.523179] .(2)[1:swapper/0]Get PSEUDO1_IQ_OFFSET BAT0 failed
<5>[    1.523194] .(2)[1:swapper/0]Get PMIC_MIN_VOL failed
<5>[    1.523198] .(2)[1:swapper/0]Get POWERON_SYSTEM_IBOOT failed
<5>[    1.523202] .(2)[1:swapper/0]Get FGC_FGV_TH1 failed
<5>[    1.523207] .(2)[1:swapper/0]Get FGC_FGV_TH2 failed
<5>[    1.523211] .(2)[1:swapper/0]Get FGC_FGV_TH3 failed
<5>[    1.523215] .(2)[1:swapper/0]Get UISOC_UPDATE_T failed
<5>[    1.523219] .(2)[1:swapper/0]Get UIFULLLIMIT_EN failed
<5>[    1.523224] .(2)[1:swapper/0]Get MULTI_GAUGE0_EN failed
<5>[    1.523228] .(2)[1:swapper/0]Get SHUTDOWN_GAUGE0_VOLTAGE failed
<4>[    1.524632] .(0)[222:battery_thread]=====FG===== AC   = 90
<3>[    1.525367] [config_data_dump_to_cp]cmdline=console=tty0 console=ttyMT0,921600n1 root=/dev/ram vmalloc=496M slub_max_order=0 slub_debug=OFZPU androidboot.hardware=mt6763 maxcpus=8 firmware_class.path=/vendor/firmware has_battery_removed=0 androidboot.verifiedbootstate=orange bootopt=64S3,32N2,64N2 buildvariant=user androidboot.veritymode=enforcing androidboot.atm=disabled androidboot.meta_log_disable=0 printk.disable_uart=0 bootprof.pl_t=4711 bootprof.lk_t=7366 bootprof.logo_t=1225 boot_reason=4 androidboot.serialno=S19F00013 androidboot.secureboot=49 androidboot.specialid=0 dlconfig_tof_offset=0 dlconfig_tof_x_talk=0 config_data_tof_offset_cali_flag=0 config_data_tof_xtalk_cali_flag=0 config_data_cp_index=0 config_data_charge_current=0 config_data_charge_termination_current=0 config_data_charge_voltage=0 config_data_recharge_threshold=0 config_data_precharge_current=0 config_data_pid_target_temperature=0 config_data_battery_profile_id=0 cmdline_power_on_flag=1 power_key_flag=0 power_on<3>[    1.525402] .(2)[1:swapper/0][config_data_get_value_by_name_from_cmdline]rt_value=0
<5>[    1.525407] .(2)[1:swapper/0][battery_init] Initialization : DONE
<4>[    1.526755] .(0)[222:battery_thread]temp_now=225, temp_last=250 
<4>[    1.526763] .(0)[222:battery_thread]=====FG===== TEMP = 225
<6>[    1.526960] .(2)[1:swapper/0]device-mapper: uevent: version 1.0.3
<6>[    1.527161] .(2)[1:swapper/0]device-mapper: ioctl: 4.34.0-ioctl (2015-10-28) initialised: dm-devel@redhat.com
<4>[    1.527853] .(1)[222:battery_thread]=====FG===== VOLT = 4345
<4>[    1.527859] .(1)[222:battery_thread]=====FG===== actural VOLT = 4335
<6>[    1.530072] .(2)[1:swapper/0][msdc]DT probe msdc0!
<6>[    1.530155] .(2)[1:swapper/0][msdc][msdc0] get irq # 16
<4>[    1.530432] .(2)[1:swapper/0]11230000.msdc supply vqmmc not found, using dummy regulator
<6>[    1.531043] .(2)[1:swapper/0][msdc][msdc0] hclk:371999833, clk_ctl:ffffffc05c37a300, hclk_ctl:ffffffc05c37a400
<6>[    1.531458] .(2)[1:swapper/0][msdc]DT probe msdc1!
<6>[    1.531514] .(2)[1:swapper/0]mtk-msdc 11240000.msdc: Got CD GPIO
<6>[    1.531575] .(2)[1:swapper/0][msdc][msdc1] get irq # 17
<6>[    1.532056] .(2)[1:swapper/0][msdc][msdc1] hclk:185999916, clk_ctl:ffffffc05c37d180, hclk_ctl:ffffffc05c37d280
<6>[    1.532379] .(1)[45:pd_dbg_info]///PD dbg info 369d
<4>[    1.532385] <    1.507>3
<4>[    1.532385] <    1.507>pd_dbg_info : t2-t1 = 3
<4>[    1.532385] <    1.507>4
<4>[    1.532385] <    1.507>pd_dbg_info : t2-t1 = 1
<4>[    1.532385] <    1.507>5
<4>[    1.532385] <    1.507>pd_dbg_info : t2-t1 = 1
<4>[    1.532388] <    1.507>6
<4>[    1.532388] <    1.507>pd_dbg_info : t2-t1 = 1
<4>[    1.532388] <    1.507>7
<4>[    1.532388] <    1.508>pd_dbg_info : t2-t1 = 1
<4>[    1.532388] <    1.508>8
<4>[    1.532388] <  .(1)[45:pd_dbg_info]  1.508>pd_dbg_info : t2-t1 = 1
<4>[    1.532390] <    1.508>9
<4>[    1.532390] <    1.508>pd_dbg_info : t2-t1 = 1
<4>[    1.532390] <    1.509>TCPC-PE:pd_core_init
<6>[    1.532469] .(2)[1:swapper/0][msdc]DT probe msdc2!
<6>[    1.532526] .(2)[1:swapper/0][msdc][msdc2] get irq # 18
<4>[    1.532589] .(2)[1:swapper/0]11250000.msdc supply vmmc not found, using dummy regulator
<6>[    1.532645] .(0)[68:kworker/u16:1][msdc]msdc0: pin state init (0)
<4>[    1.532647] .(2)[1:swapper/0]11250000.msdc supply vqmmc not found, using dummy regulator
<6>[    1.532726] .(0)[68:kworker/u16:1][msdc]msdc0 power on
<6>[    1.532794] .(2)[1:swapper/0][msdc][msdc2] hclk:185999916, clk_ctl:ffffffc05c37dd00, hclk_ctl:ffffffc05c37de00
<6>[    1.533082] .(2)[1:swapper/0][I]mtk_wcn_cmb_sdio_request_eirq:enter
<6>[    1.533671] .(2)[1:swapper/0][I]mtk_wcn_cmb_sdio_request_eirq:exit
<6>[    1.535609] .(2)[1:swapper/0]hidraw: raw HID events driver (C) Jiri Kosina
<6>[    1.536383] .(1)[69:kworker/u16:2]power_supply battery: power_supply_changed
<6>[    1.536758] .(2)[1:swapper/0]usbcore: registered new interface driver usbhid
<6>[    1.536764] .(2)[1:swapper/0]usbhid: USB HID core driver
<6>[    1.536969] .(2)[1:swapper/0]ashmem: initialized
<6>[    1.537038] .(2)[1:swapper/0]lowmemorykiller: lowmem_init: successful to register misc device!
<4>[    1.537167] .(1)[70:kworker/1:1]temp_now=225, temp_last=225 
<4>[    1.537173] .(1)[70:kworker/1:1]=====FG===== TEMP = 225
<4>[    1.537758] .(1)[70:kworker/1:1]=====FG===== SOC  = 100
<4>[    1.538528] .(1)[70:kworker/1:1]=====FG===== AC   = 90
<6>[    1.538601] .(2)[1:swapper/0]usbcore: registered new interface driver snd-usb-audio
<6>[    1.540146] .(2)[1:swapper/0]rt5509_driver_init
<4>[    1.540225] .(1)[70:kworker/1:1]=====FG===== VOLT = 4345
<4>[    1.540230] .(1)[70:kworker/1:1]=====FG===== actural VOLT = 4335
<4>[    1.542137] .(1)[70:kworker/1:1]temp_now=225, temp_last=225 
<4>[    1.542144] .(1)[70:kworker/1:1]=====FG===== TEMP = 225
<4>[    1.542761] .(1)[70:kworker/1:1]=====FG===== SOC  = 100
<4>[    1.544222] .(1)[70:kworker/1:1]bq27542_set_commands cmd = 0x12, val = 3884 
<4>[    1.544535] .(2)[1:swapper/0]mtk_btcvsd_tx_probe: dev name mt-soc-btcvsd-tx-pcm
<4>[    1.544763] .(1)[70:kworker/1:1]bq27542_set_commands cmd = 0x3c, val = 3850 
<6>[    1.544809] .(2)[1:swapper/0]speaker_amp 1-0034: mtk_spk_i2c_probe()
<6>[    1.544815] .(2)[1:swapper/0]+rt5509_i2c_probe
<6>[    1.545050] .(2)[1:swapper/0]i2c i2c-1: addr: 34, transfer ACK error
<6>[    1.545058] .(2)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.545061] .(2)[1:swapper/0]I2C structure:
<3>[    1.545061] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=3,Total_len=1
<3>[    1.545061] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.545061] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.545071] .(2)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.545082] .(2)[1:swapper/0]I2C register:
<6>[    1.545082] [I2C]SLAVE_ADDR=68,INTR_MASK=0,INTR_STAT=0,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.545082] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.545082] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.545093] .(2)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.545093] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.545093] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.545093] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.545093] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.545107] .(2)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.545107] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.545107] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.545107] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.545107] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.545117] .(2)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.545122] .(2)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.545128] .(2)[1:swapper/0]i2c i2c-1: [00] [    1.545047] SLAVE_ADDR=68,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.545138] .(2)[1:swapper/0]i2c i2c-1: [01] [    1.170324] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.545147] .(2)[1:swapper/0]i2c i2c-1: [02] [    1.170209] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.545157] .(2)[1:swapper/0]i2c i2c-1: [03] [    1.170094] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.545166] .(2)[1:swapper/0]i2c i2c-1: [04] [    1.169976] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.545176] .(2)[1:swapper/0]i2c i2c-1: [05] [    1.169851] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1210,DEBUGSTAT=300, tmo=500
<3>[    1.545185] .(2)[1:swapper/0]i2c i2c-1: [06] [    1.169688] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.545194] .(2)[1:swapper/0]i2c i2c-1: [07] [    1.169560] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1210,DEBUGSTAT=300, tmo=500
<3>[    1.545203] .(2)[1:swapper/0]i2c i2c-1: [08] [    1.169404] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.545213] .(2)[1:swapper/0]i2c i2c-1: [09] [    1.168714] SLAVE_ADDR=b2,INTR_STAT=1,CONTROL=3a,FIFO_STAT=1210,DEBUGSTAT=300, tmo=500
<3>[    1.545237] .(2)[1:swapper/0]speaker_amp 1-0034: power on fail 1
<3>[    1.545244] .(2)[1:swapper/0]speaker_amp 1-0034: error -121
<4>[    1.545258] .(2)[1:swapper/0]speaker_amp: probe of 1-0034 failed with error -121
<4>[    1.545354] .(2)[1:swapper/0]mtk_soc_capture_platform_init
<4>[    1.546293] .(2)[1:swapper/0]mtk_capture_probe
<4>[    1.546299] .(2)[1:swapper/0]mtk_capture_probe: dev name mt-soc-ul1-pcm
<4>[    1.546871] .(1)[70:kworker/1:1]bq27542_set_commands cmd = 0xc, val = 3998 
<4>[    1.547210] .(2)[1:swapper/0]mtk_soc_dl1_probe: dev name mt-soc-dl1-pcm
<4>[    1.550372] .(2)[1:swapper/0]AudDrv_GPIO_probe
<4>[    1.550729] .(2)[1:swapper/0]AudDrv_GPIO_probe(), extbuck_fan53526_exist = 0
<3>[    1.550735] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_off fail -19
<3>[    1.550740] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_on fail -19
<3>[    1.550746] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_miso2_off fail -19
<3>[    1.550751] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_miso2_on fail -19
<3>[    1.550756] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_mosi2_off fail -19
<3>[    1.550760] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_dat_mosi2_on fail -19
<3>[    1.550765] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_dat_miso_off fail -19
<3>[    1.550769] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_dat_miso_on fail -19
<3>[    1.550773] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_clk_miso_off fail -19
<3>[    1.550777] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state vow_clk_miso_on fail -19
<3>[    1.550782] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_reset fail -19
<3>[    1.550786] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_on fail -19
<3>[    1.550791] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_smartpa_off fail -19
<3>[    1.550795] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_tdm_mode0 fail -19
<3>[    1.550799] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_tdm_mode1 fail -19
<3>[    1.550804] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audpmicclk-mode0 fail -19
<3>[    1.550808] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audpmicclk-mode1 fail -19
<3>[    1.550813] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audi2s1-mode0 fail -19
<3>[    1.550817] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state audi2s1-mode1 fail -19
<3>[    1.550822] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state extamp2-pullhigh fail -19
<3>[    1.550827] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state extamp2-pulllow fail -19
<3>[    1.550831] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state rcvspk-pullhigh fail -19
<3>[    1.550835] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state rcvspk-pulllow fail -19
<3>[    1.550840] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state hpdepop-pullhigh fail -19
<3>[    1.550844] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state hpdepop-pulllow fail -19
<3>[    1.550849] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_pull_high fail -19
<3>[    1.550853] .(2)[1:swapper/0]AudDrv_GPIO_probe pinctrl_lookup_state aud_clk_mosi_pull_low fail -19
<3>[    1.551087] .(2)[1:swapper/0]Auddrv_Reg_map
<3>[    1.551367] .(2)[1:swapper/0][mt_idle_ntf] <00>ffffff8008a44e00 (audio_idle_notify_call)
<4>[    1.551407] .(2)[1:swapper/0]InitSramManager mBlocknum = 12 mAud_Sram_Manager.mSramLength = 49152 mAud_Sram_Manager.mBlockSize = 4096
<4>[    1.551418] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 0
<4>[    1.551424] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 1
<4>[    1.551429] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 2
<4>[    1.551434] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 3
<4>[    1.551439] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 4
<4>[    1.551444] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 5
<4>[    1.551449] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 6
<4>[    1.551454] .(2)[1:swapper/0]EnableI2SDivPower, bEnable = 0, Diveder_name 7
<4>[    1.551459] .(2)[1:swapper/0]init_afe_ops
<4>[    1.551481] .(2)[1:swapper/0][ge_mt_soc_pcm_dl1] afe_irq_number=95
<4>[    1.552491] .(2)[1:swapper/0]mtk_soc_dummy_platform_init
<4>[    1.553556] .(2)[1:swapper/0]mtk_dummy_probe
<4>[    1.553563] .(2)[1:swapper/0]mtk_dummy_probe: dev name mt-soc-dummy-pcm
<4>[    1.553710] .(2)[1:swapper/0]mtk_soc_routing_platform_init
<4>[    1.554552] .(2)[1:swapper/0]mtk_afe_routing_probe
<4>[    1.554557] .(2)[1:swapper/0]mtk_afe_routing_probe: dev name mt-soc-routing-pcm
<4>[    1.554686] .(2)[1:swapper/0]mtk_soc_capture2_platform_init
<4>[    1.555456] .(2)[1:swapper/0]mtk_capture2_probe
<4>[    1.555462] .(2)[1:swapper/0]mtk_capture2_probe: dev name mt-soc-ul2-pcm
<3>[    1.556157] .(2)[1:swapper/0]mtk_i2s2_adc2_probe: dev name mt-soc-i2s2_adc2-pcm
<4>[    1.556194] .(2)[1:swapper/0]mtk_soc_voice_platform_init()
<6>[    1.556548] .(0)[68:kworker/u16:1][msdc]msdc0 -> !!! Set<400KHz> Source<371999KHz> -> sclk<399KHz> timing<0> mode<0> div<233> hs400_div_dis<0>
<4>[    1.557028] .(2)[1:swapper/0]mtk_voice_probe(), dev name mt-soc-voicemd1
<4>[    1.557207] .(2)[1:swapper/0]mtk_soc_voice_md2_platform_init()
<4>[    1.558023] .(2)[1:swapper/0]mtk_voice_md2_probe(), dev name mt-soc-voicemd2
<4>[    1.562493] .(2)[1:swapper/0]mtk_I2S0dl1_soc_platform_init
<4>[    1.563212] .(2)[1:swapper/0]mtk_I2S0dl1_probe: dev name mt-soc-i2s0dl1-pcm
<4>[    1.563345] .(2)[1:swapper/0]mtk_soc_i2s0_awb_platform_init
<4>[    1.564069] .(2)[1:swapper/0]mtk_i2s0_awb_probe
<4>[    1.564074] .(2)[1:swapper/0]mtk_i2s0_awb_probe: dev name mt-soc-i2s0awb-pcm
<4>[    1.564193] .(2)[1:swapper/0]mtk_soc_uldlloopback_platform_init
<4>[    1.564948] .(2)[1:swapper/0]mtk_uldlloopback_probe
<4>[    1.564953] .(2)[1:swapper/0]mtk_uldlloopback_probe: dev name mt-soc-uldlloopback-pcm
<4>[    1.565864] .(2)[1:swapper/0]mtk_soc_dl2_probe: dev name mt-soc-dl2-pcm
<4>[    1.566828] .(2)[1:swapper/0]mtk_mrgrx_soc_platform_init
<4>[    1.567543] .(2)[1:swapper/0]mtk_mrgrx_probe
<4>[    1.567548] .(2)[1:swapper/0]mtk_mrgrx_probe: dev name mt-soc-mrgrx-pcm
<4>[    1.567687] .(2)[1:swapper/0]mtk_soc_mrgrx_awb_platform_init
<4>[    1.568428] .(2)[1:swapper/0]mtk_mrgrx_awb_probe
<4>[    1.568433] .(2)[1:swapper/0]mtk_mrgrx_awb_probe: dev name mt-soc-mrgrx-awb-pcm
<4>[    1.568578] .(2)[1:swapper/0]mtk_fm_i2s_soc_platform_init
<4>[    1.569332] .(2)[1:swapper/0]mtk_fm_i2s_probe
<4>[    1.569337] .(2)[1:swapper/0]mtk_fm_i2s_probe: dev name mt-soc-fm-i2s-pcm
<4>[    1.570197] .(2)[1:swapper/0]mtk_fm_i2s_awb_probe: dev name mt-soc-fm-i2s-awb-pcm
<4>[    1.572046] .(2)[1:swapper/0]mtk_soc_bt_dai_platform_init
<4>[    1.572917] .(2)[1:swapper/0]mtk_bt_dai_probe
<4>[    1.572923] .(2)[1:swapper/0]mtk_bt_dai_probe: dev name mt-soc-voip-bt-in
<5>[    1.572982] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<4>[    1.573093] .(2)[1:swapper/0]mtk_dai_stub_init:
<5>[    1.573483] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<4>[    1.573985] .(2)[1:swapper/0]mtk_dai_stub_dev_probe  name mt_soc_dai_name
<4>[    1.573990] .(2)[1:swapper/0]mtk_dai_stub_dev_probe: dev name mt-soc-dai-driver
<4>[    1.574042] .(2)[1:swapper/0]mtk_dai_stub_dev_probe: rc  = 0
<4>[    1.574160] .(2)[1:swapper/0]mtk_routing_init:
<4>[    1.574965] .(2)[1:swapper/0]mtk_routing_dev_probe  name mt_soc_routing_dai_name
<4>[    1.574970] .(2)[1:swapper/0]mtk_routing_dev_probe: dev name Routing-Control
<4>[    1.575086] .(2)[1:swapper/0]mtk_dummy_codec_init:
<4>[    1.575851] .(2)[1:swapper/0]mtk_dummy_codec_dev_probe: dev name mt-soc-dummy-codec
<5>[    1.577449] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    1.577518] .(0)[4:kworker/0:0][msdc]msdc0 -> XXX CMD<8><0x1aa> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/0:0><0x4>
<5>[    1.577963] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.578458] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.578942] .(2)[1:swapper/0]mtk-audio 11220000.audio: mtk_spk_update_dai_link(), mtk_spk_type 0
<6>[    1.578952] .(2)[1:swapper/0]mtk-audio 11220000.audio: mtk_spk_update_dai_link(), ext_Speaker_Multimedia, codec dai name = snd-soc-dummy-dai, codec name = snd-soc-dummy
<5>[    1.578955] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.579451] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.579952] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.580446] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.580944] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<5>[    1.581438] .(0)[4:kworker/0:0][msdc][msdc_command_resp_polling]: msdc0 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<4>[    1.581478] .(2)[1:swapper/0]mtk_voice_platform_probe()
<4>[    1.581512] .(2)[1:swapper/0]mtk_afe_uldlloopback_probe
<4>[    1.581584] .(2)[1:swapper/0]dummy_codec_probe()
<4>[    1.581653] .(2)[1:swapper/0]mtk_afe_mrgrx_probe
<4>[    1.581688] .(2)[1:swapper/0]mtk_afe_mrgrx_awb_probe
<4>[    1.582110] .(2)[1:swapper/0]mtk_asoc_bt_dai_probe
<4>[    1.582193] .(2)[1:swapper/0]mtk_afe_capture2_probe
<4>[    1.582241] .(2)[1:swapper/0]mtk_i2s0_dl1_awb_probe
<4>[    1.582268] .(2)[1:swapper/0]mtk_voice_md2_platform_probe()
<4>[    1.582290] .(2)[1:swapper/0]mtk_afe_routing_platform_probe
<4>[    1.582460] .(2)[1:swapper/0]mtk_afe_fm_i2s_probe
<4>[    1.582615] .(2)[1:swapper/0]mtk_asoc_pcm_btcvsd_tx_platform_probe
<4>[    1.582663] .(2)[1:swapper/0]mtk_i2s2_adc2_data_probe
<6>[    1.582916] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-tx-dai <-> mt-soc-dl1dai-driver mapping ok
<6>[    1.583018] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-rx-dai <-> mt-soc-ul1dai-driver mapping ok
<6>[    1.583149] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd1-dai <-> mt-soc-voicemd1dai-driver mapping ok
<6>[    1.583278] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-uldlloopback-dai <-> mt-soc-uldlloopbackdai-driver mapping ok
<6>[    1.583372] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-i2s0-dummy-dai-codec <-> mt-soc-i2s0dai-driver mapping ok
<6>[    1.583501] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-mrgrx-dai-codec <-> mt-soc-mrgrxdai-driver mapping ok
<6>[    1.583633] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-mrgrx-dummy-dai-codec <-> mt-soc-mrgrxdai-driver mapping ok
<6>[    1.583726] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-I2s0tx-dai <-> mt-soc-i2s0dl1dai-driver mapping ok
<6>[    1.583818] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-deepbuffer-tx-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.583909] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-dl1awb-dai <-> mt-soc-dl1awbdai-driver mapping ok
<6>[    1.584009] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd1-bt-dai <-> mt-soc-voicemd1-btdai-driver mapping ok
<6>[    1.584101] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voipcall-btout-dai <-> mt-soc-voipcall-btdai-out-driver mapping ok
<6>[    1.584196] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voipcall-btin-dai <-> mt-soc-voipcall-btdai-in-driver mapping ok
<6>[    1.584289] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-tdmrx-dai-codec <-> mt-soc-tdmrxdai-driver mapping ok
<6>[    1.584409] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fmmrg2tx-dummy-dai-codec <-> mt-soc-fmmrgtxdai-driver mapping ok
<6>[    1.584500] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-rx-dai2 <-> mt-soc-ul2dai-driver mapping ok
<6>[    1.584598] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-i2s0awb-dai <-> mt-soc-i2s0awbdai-driver mapping ok
<6>[    1.584729] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd2-dai <-> mt-soc-voicemd2dai-driver mapping ok
<6>[    1.584860] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-dummy-dai-codec <-> snd-soc-dummy-dai mapping ok
<6>[    1.584960] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voicemd2-bt-dai <-> mt-soc-voicemd2-btdai-driver mapping ok
<6>[    1.585053] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-hp-impedance-dai <-> mt-soc-hpimpedancedai-driver mapping ok
<6>[    1.585147] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fm-i2s-dai-codec <-> mt-soc-fmi2S-driver mapping ok
<6>[    1.585241] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-fm-i2s-dummy-dai-codec <-> mt-soc-fmi2S-driver mapping ok
<6>[    1.585333] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-tx-dai2 <-> mt-soc-dl2dai-driver mapping ok
<6>[    1.585426] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-offload-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.585558] .(2)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.585696] .(2)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.585786] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-dummy-dai-codec <-> mt-soc-anc-record-dai-driver mapping ok
<6>[    1.585983] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voiceusb-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.586108] .(2)[1:swapper/0]mtk-audio 11220000.audio: mt-soc-codec-voiceusb-echoref-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.586240] .(2)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.586370] .(2)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> snd-soc-dummy-dai mapping ok
<6>[    1.586467] .(2)[1:swapper/0]mtk-audio 11220000.audio: snd-soc-dummy-dai <-> mt-soc-i2s2adc2dai-driver mapping ok
<4>[    1.586774] .(2)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create FM_I2S_Capture debugfs file
<4>[    1.586790] .(2)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create FM_I2S_Playback debugfs file
<4>[    1.586843] .(2)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create MRGRX_CAPTURE debugfs file
<4>[    1.586864] .(2)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    1.586883] .(2)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create SCPVoice_PLayback debugfs file
<4>[    1.586907] .(2)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create I2S0_PLayback debugfs file
<4>[    1.586921] .(2)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create ULDL_Loopback debugfs file
<4>[    1.586939] .(2)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    1.586953] .(2)[1:swapper/0]mt-soc-dai-driver mt-soc-dai-driver: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<4>[    1.587041] .(2)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    1.587064] .(2)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create ULDL_Loopback debugfs file
<4>[    1.587101] .(2)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_USB_EchoRef debugfs file
<4>[    1.587115] .(2)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_USB_PLayback debugfs file
<4>[    1.587129] .(2)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    1.587142] .(2)[1:swapper/0]mt-soc-codec mt-soc-codec: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<4>[    1.587216] .(2)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MRGRX_PLayback debugfs file
<4>[    1.587236] .(2)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MultiMedia_Routing debugfs file
<4>[    1.587277] .(2)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create MultiMedia_Routing debugfs file
<4>[    1.587301] .(2)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create Voice_MD2_PLayback debugfs file
<4>[    1.587315] .(2)[1:swapper/0]mt-soc-dummy-codec mt-soc-dummy-codec: ASoC: Failed to create Voice_MD1_PLayback debugfs file
<6>[    1.591325] .(5)[1:swapper/0]Mirror/redirect action on
<6>[    1.591347] .(5)[1:swapper/0]u32 classifier
<6>[    1.591350] .(5)[1:swapper/0]    Performance counters on
<6>[    1.591352] .(5)[1:swapper/0]    input device check on
<6>[    1.591354] .(5)[1:swapper/0]    Actions configured
<6>[    1.591369] .(5)[1:swapper/0]Netfilter messages via NETLINK v0.30.
<6>[    1.591413] .(5)[1:swapper/0]nf_conntrack version 0.5.0 (16384 buckets, 65536 max)
<6>[    1.591772] .(5)[1:swapper/0]ctnetlink v0.93: registering with nfnetlink.
<6>[    1.592208] .(5)[1:swapper/0]xt_time: kernel timezone is -0000
<6>[    1.592303] .(5)[1:swapper/0]ipip: IPv4 over IPv4 tunneling driver
<6>[    1.592818] .(5)[1:swapper/0]ip_tables: (C) 2000-2006 Netfilter Core Team
<6>[    1.592968] .(5)[1:swapper/0]arp_tables: (C) 2002 David S. Miller
<6>[    1.593024] .(5)[1:swapper/0]Initializing XFRM netlink socket
<6>[    1.593403] .(5)[1:swapper/0]NET: Registered protocol family 10
<6>[    1.595677] .(5)[1:swapper/0]mip6: Mobile IPv6
<6>[    1.595707] .(5)[1:swapper/0]ip6_tables: (C) 2000-2006 Netfilter Core Team
<6>[    1.595860] .(5)[1:swapper/0]sit: IPv6 over IPv4 tunneling driver
<6>[    1.596265] .(5)[1:swapper/0]NET: Registered protocol family 17
<6>[    1.596290] .(5)[1:swapper/0]NET: Registered protocol family 15
<6>[    1.596319] .(5)[1:swapper/0]bridge: automatic filtering via arp/ip/ip6tables has been deprecated. Update your scripts to load br_netfilter if you need this.
<5>[    1.596393] .(5)[1:swapper/0]Bridge firewalling registered
<6>[    1.596400] .(5)[1:swapper/0]8021q: 802.1Q VLAN Support v1.8
<6>[    1.597524] .(5)[1:swapper/0][cpu_ntf] <00>ffffff80080850d8 (fpsimd_cpu_hotplug_notifier)
<5>[    1.598163] .(5)[1:swapper/0]Registered cp15_barrier emulation handler
<5>[    1.599354] .(5)[1:swapper/0]Registered setend emulation handler
<6>[    1.599361] .(5)[1:swapper/0][cpu_ntf] <00>ffffff8008097260 (insn_cpu_hotplug_notify)
<6>[    1.599415] .(5)[1:swapper/0][cpu_ntf] <00>ffffff80080fe980 (cpu_hotplug_handler)
<6>[    1.600225] .(5)[1:swapper/0][cpu_ntf] <00>ffffff8008109b18 (console_cpu_notify)
<6>[    1.600264] .(5)[1:swapper/0]registered taskstats version 1
<6>[    1.600308] cma: cma usage create success.<6>[    1.601949] .(5)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    1.602136] .(5)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    1.603333] .(5)[1:swapper/0][Power/cpufreq] (0, 1, 0)
<6>[    1.604147] .(5)[1:swapper/0][cpu_ntf] <00>ffffff80089115b8 (cpufreq_cpu_callback)
<6>[    1.604160] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800840db80 (_mt_cpufreq_cpu_CB)
<5>[    1.604165] .(5)[1:swapper/0][Power/PPM] DVFS table type = 0
<5>[    1.604166] .(5)[1:swapper/0][Power/PPM] DVFS table of cluster 0:
<5>[    1.604168] .(5)[1:swapper/0][Power/PPM] 0: 1508000 KHz
<5>[    1.604170] .(5)[1:swapper/0][Power/PPM] 1: 1482000 KHz
<5>[    1.604172] .(5)[1:swapper/0][Power/PPM] 2: 1430000 KHz
<5>[    1.604174] .(5)[1:swapper/0][Power/PPM] 3: 1404000 KHz
<5>[    1.604175] .(5)[1:swapper/0][Power/PPM] 4: 1365000 KHz
<5>[    1.604177] .(5)[1:swapper/0][Power/PPM] 5: 1300000 KHz
<5>[    1.604179] .(5)[1:swapper/0][Power/PPM] 6: 1235000 KHz
<5>[    1.604180] .(5)[1:swapper/0][Power/PPM] 7: 1183000 KHz
<5>[    1.604182] .(5)[1:swapper/0][Power/PPM] 8: 1105000 KHz
<5>[    1.604184] .(5)[1:swapper/0][Power/PPM] 9: 1001000 KHz
<5>[    1.604185] .(5)[1:swapper/0][Power/PPM] 10: 884000 KHz
<5>[    1.604187] .(5)[1:swapper/0][Power/PPM] 11: 793000 KHz
<5>[    1.604188] .(5)[1:swapper/0][Power/PPM] 12: 715000 KHz
<5>[    1.604190] .(5)[1:swapper/0][Power/PPM] 13: 624000 KHz
<5>[    1.604192] .(5)[1:swapper/0][Power/PPM] 14: 481000 KHz
<5>[    1.604193] .(5)[1:swapper/0][Power/PPM] 15: 338000 KHz
<5>[    1.604196] .(5)[1:swapper/0][Power/PPM] DVFS table type = 0
<5>[    1.604198] .(5)[1:swapper/0][Power/PPM] DVFS table of cluster 1:
<5>[    1.604199] .(5)[1:swapper/0][Power/PPM] 0: 2002000 KHz
<5>[    1.604201] .(5)[1:swapper/0][Power/PPM] 1: 1976000 KHz
<5>[    1.604202] .(5)[1:swapper/0][Power/PPM] 2: 1937000 KHz
<5>[    1.604204] .(5)[1:swapper/0][Power/PPM] 3: 1911000 KHz
<5>[    1.604205] .(5)[1:swapper/0][Power/PPM] 4: 1859000 KHz
<5>[    1.604207] .(5)[1:swapper/0][Power/PPM] 5: 1807000 KHz
<5>[    1.604209] .(5)[1:swapper/0][Power/PPM] 6: 1742000 KHz
<5>[    1.604210] .(5)[1:swapper/0][Power/PPM] 7: 1690000 KHz
<5>[    1.604212] .(5)[1:swapper/0][Power/PPM] 8: 1586000 KHz
<5>[    1.604213] .(5)[1:swapper/0][Power/PPM] 9: 1456000 KHz
<5>[    1.604215] .(5)[1:swapper/0][Power/PPM] 10: 1287000 KHz
<5>[    1.604217] .(5)[1:swapper/0][Power/PPM] 11: 1170000 KHz
<5>[    1.604218] .(5)[1:swapper/0][Power/PPM] 12: 1040000 KHz
<5>[    1.604220] .(5)[1:swapper/0][Power/PPM] 13: 910000 KHz
<5>[    1.604222] .(5)[1:swapper/0][Power/PPM] 14: 715000 KHz
<5>[    1.604223] .(5)[1:swapper/0][Power/PPM] 15: 520000 KHz
<4>[    1.604966] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreq disabled by ptpod
<5>[    1.605124] .(5)[1:swapper/0][Power/PPM] (0x1)(-1)(0)(0-7)(10)(10)(4)(4) [(1)(10)(0)(-1)] (10)(10)(4)(4) [(1)(10)(0)(-1)] 
<4>[    1.607471] .(5)[1:swapper/0][Power/gpufreq] mt_gpufreq enabled by ptpod
<5>[    1.607482] .(5)[1:swapper/0][Power/PPM] (0x0)(-1)(0)(0-7)(15)(0)(4)(4) (15)(0)(4)(4) 
<6>[    1.608491] .(3)[68:kworker/u16:1][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<6>[    1.610217] .(5)[1:swapper/0][HPS] hps_init
<6>[    1.610220] .(5)[1:swapper/0][HPS] hps_cpu_init
<6>[    1.610221] .(5)[1:swapper/0][HPS] [New algo.] hps_sys.cluster_num 2
<6>[    1.610227] .(5)[1:swapper/0][HPS] 0: func_id 3840, enabled 1
<6>[    1.610229] .(5)[1:swapper/0][HPS] 1: func_id 3841, enabled 1
<6>[    1.610231] .(5)[1:swapper/0][HPS] 2: func_id 3842, enabled 1
<6>[    1.610760] .(5)[1:swapper/0][HPS] hps_probe
<6>[    1.610781] .(5)[1:swapper/0][HPS] hps_core_init, setup_max_cpus ==> 8
<6>[    1.610857] .(5)[1:swapper/0][HPS] hps_task_start success, ptr: ffffffc05c04a000, pid: 241
<6>[    1.610867] .(1)[241:hps_main][HPS] hps_ctxt.init_state: 1
<6>[    1.610871] .(1)[241:hps_main][HPS] hps_ctxt.state: 0
<5>[    1.610872] .(5)[1:swapper/0][Power/PPM] @ppm_lcmoff_policy_init: register PPM_POLICY_LCM_OFF done!
<6>[    1.610874] .(1)[241:hps_main][HPS] hps_ctxt.enabled: 1
<6>[    1.610879] .(1)[241:hps_main][HPS] hps_ctxt.suspend_enabled: 1
<6>[    1.610881] .(1)[241:hps_main][HPS] hps_ctxt.is_hmp: 0
<6>[    1.610883] .(1)[241:hps_main][HPS] hps_ctxt.little_cpu_id_min: 0
<6>[    1.610885] .(1)[241:hps_main][HPS] hps_ctxt.little_cpu_id_max: 3
<6>[    1.610887] .(1)[241:hps_main][HPS] hps_ctxt.big_cpu_id_min: 4
<6>[    1.610889] .(1)[241:hps_main][HPS] hps_ctxt.big_cpu_id_max: 7
<6>[    1.610892] .(1)[241:hps_main]CPU request is 0x0
<5>[    1.610913] .(5)[1:swapper/0][Power/PPM] COBRA init done!
<6>[    1.610921] .(5)[1:swapper/0][cpu_ntf] <00>ffffff800842c260 (ppm_cpu_hotplug_callback)
<5>[    1.610929] .(5)[1:swapper/0][Power/PPM] power data init done!
<6>[    1.611612] .(5)[1:swapper/0][SPM] spm_base = ffffff800d5fe000, sleep_reg_md_base = ffffff800d71c000, spm_irq_0 = 36
<6>[    1.611898] .(5)[1:swapper/0][SPM] edge trigger irqs: 0, 25, 40, 149, 0, 44, 0
<6>[    1.611946] .(5)[1:swapper/0]#@# __spm_check_dram_type(538) __spmfw_idx 0x2
<6>[    1.613128] .(5)[1:swapper/0]#@# spm_module_init(663) is_ext_buck_exist() 0x0
<5>[    1.613251] .(5)[1:swapper/0][VcoreFS] spm_dvfsrc_register_init: dvfsrc_base = ffffff800d71e000
<5>[    1.613263] .(5)[1:swapper/0][VcoreFS] dram_issue: 0x0
<5>[    1.613276] .(5)[1:swapper/0][VcoreFS] curr_vcore_uv: 793750, curr_ddr_khz: 1866000
<5>[    1.613279] .(5)[1:swapper/0][VcoreFS] opp 0: vcore_uv: 793750, ddr_khz: 1866000
<5>[    1.613281] .(5)[1:swapper/0][VcoreFS] opp 1: vcore_uv: 793750, ddr_khz: 1600000
<5>[    1.613283] .(5)[1:swapper/0][VcoreFS] opp 2: vcore_uv: 725000, ddr_khz: 1600000
<5>[    1.613285] .(5)[1:swapper/0][VcoreFS] opp 3: vcore_uv: 725000, ddr_khz: 1200000
<5>[    1.613308] .(5)[1:swapper/0][VcoreFS] spm_vcorefs_pwarp_cmd: sspm
<5>[    1.613319] .(5)[1:swapper/0][VcoreFS] pcm_flag: 0x400
<6>[    1.613585] .(0)[4:kworker/0:0]mmc0: MAN_BKOPS_EN bit is not set
<3>[    1.613590] .(0)[4:kworker/0:0][CQ] card support CMDQ
<3>[    1.613592] .(0)[4:kworker/0:0][CQ] cmdq depth 16
<6>[    1.614931] -(5)[1:swapper/0][SPM] IRQ0 HANDLER SHOULD NOT BE EXECUTED (0x10)
<5>[    1.614934] .(5)[1:swapper/0][VcoreFS] [spm_go_to_vcorefs] done
<5>[    1.614951] .(5)[1:swapper/0][VcoreFS] opp: 3, vcore: 725000 <= 793750, fddr: 1200000 <= 1866000 [O][O]
<5>[    1.614965] -(5)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<5>[    1.614969] .(5)[1:swapper/0][VcoreFS] [vcorefs_late_init_dvfs] late_init_opp: 3, sw_opp: 3 (4)
<5>[    1.614972] .(5)[1:swapper/0][VcoreFS] [vcorefs_drv_init] done
<4>[    1.614974] .(5)[1:swapper/0][MMDVFS][pid=1]mmdvfs service is disabled for vcore calibration
<4>[    1.614976] .(5)[1:swapper/0][pid=1]mmdvfs_notify_prepare_action: 0
<6>[    1.617962] .(0)[4:kworker/0:0][msdc]msdc0 -> !!! Set<200000KHz> Source<371999KHz> -> sclk<185999KHz> timing<9> mode<0> div<0> hs400_div_dis<0>
<6>[    1.619013] .(0)[4:kworker/0:0][AUTOK]eMMC HS200 Tune
<6>[    1.622841] .(0)[4:kworker/0:0][AUTOK]CMD 0 	 31 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOO
<5>[    1.624875] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    1.625370] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<6>[    1.625408] .(0)[4:kworker/0:0][AUTOK]CMD 1 	 50 	 OXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXX
<6>[    1.625414] .(0)[4:kworker/0:0][AUTOK]Analysis Result: 1T = 60
<6>[    1.625455] .(0)[4:kworker/0:0][AUTOK]dev status 0x00000900
<5>[    1.629321] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<5>[    1.629817] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.629875] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.630310] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.630331] .(0)[4:kworker/0:0][AUTOK]DAT 0 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.630373] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.630805] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.630863] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.631296] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.631354] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.631792] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.631852] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.632287] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.632351] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.632785] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.632849] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.633284] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.633347] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.633782] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.633845] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<6>[    1.634914] .(0)[4:kworker/0:0][AUTOK]DAT 1 	 50 	 OXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX
<6>[    1.634918] .(0)[4:kworker/0:0][AUTOK]Analysis Result: 1T = 62
<6>[    1.634956] .(0)[4:kworker/0:0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    1.634959] .(0)[4:kworker/0:0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.634962] .(0)[4:kworker/0:0][AUTOK]DAT [LATCH_CK:0 DLY1:5 DLY2:0]
<6>[    1.634964] .(0)[4:kworker/0:0][AUTOK]DS  [DLY1:0 DLY2:0 DLY3:0]
<6>[    1.634967] .(0)[4:kworker/0:0][AUTOK]CLK TX  [0]
<6>[    1.634969] .(0)[4:kworker/0:0][AUTOK]CMD TX  [0]
<6>[    1.634971] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.634974] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.634980] .(0)[4:kworker/0:0][AUTOK][HS200]======Cost:15 ms======
<6>[    1.636017] .(0)[4:kworker/0:0][msdc]msdc0 -> !!! Set<52000KHz> Source<371999KHz> -> sclk<46499KHz> timing<9> mode<0> div<2> hs400_div_dis<0>
<6>[    1.637759] .(0)[4:kworker/0:0][msdc]msdc0 -> !!! Set<200000KHz> Source<371999KHz> -> sclk<185999KHz> timing<10> mode<3> div<0> hs400_div_dis<1>
<6>[    1.638816] .(0)[4:kworker/0:0][AUTOK]eMMC HS400 Tune
<6>[    1.641375] .(0)[4:kworker/0:0][AUTOK]CMD 0 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.642854] .(0)[4:kworker/0:0][AUTOK]CMD 1 	 51 	 OXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX
<6>[    1.642860] .(0)[4:kworker/0:0][AUTOK]Analysis Result: 1T = 62
<6>[    1.642902] .(0)[4:kworker/0:0][AUTOK]device status 0x00000900
<6>[    1.642906] .(0)[4:kworker/0:0][AUTOK]CQ not enabled
<6>[    1.644729] .(0)[4:kworker/0:0][AUTOK]DLY1/2 0 	 24 	 XOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    1.644774] .(0)[4:kworker/0:0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    1.644779] .(0)[4:kworker/0:0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.644783] .(0)[4:kworker/0:0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    1.644787] .(0)[4:kworker/0:0][AUTOK]DS  [DLY1:12 DLY2:0 DLY3:20]
<6>[    1.644791] .(0)[4:kworker/0:0][AUTOK]CLK TX  [0]
<6>[    1.644794] .(0)[4:kworker/0:0][AUTOK]CMD TX  [0]
<6>[    1.644797] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.644801] .(0)[4:kworker/0:0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.644808] .(0)[4:kworker/0:0][AUTOK][HS400]======Cost:5 ms======
<5>[    1.644822] .(0)[4:kworker/0:0][msdc]msdc0:disable mmc retune
<6>[    1.644844] .(5)[1:swapper/0]emmc autok
<5>[    1.645563] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 0, dvfs_opp: 0, sw_opp: 3
<5>[    1.645580] .(1)[1:swapper/0][VcoreFS] opp: 0, vcore: 793750 <= 725000, fddr: 1866000 <= 1200000 [O][O]
<5>[    1.645599] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 0, vcore: 0x110000, emi: 0x200000, md: 0x0
<6>[    1.645653] .(0)[4:kworker/0:0]mmc0: new HS400 MMC card at address 0001
<6>[    1.645705] .(1)[1:swapper/0][AUTOK]eMMC HS400 Tune
<3>[    1.645991] .(0)[243:exe_cq][CQ] start cmdq thread
<6>[    1.646278] .(0)[4:kworker/0:0]mmcblk0: mmc0:0001 GD6BMB 29.1 GiB 
<6>[    1.648264] .(1)[1:swapper/0][AUTOK]CMD 0 	 37 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXOOOOOOOOOOOOOOO
<6>[    1.649741] .(1)[1:swapper/0][AUTOK]CMD 1 	 50 	 OOOXXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.649747] .(1)[1:swapper/0][AUTOK]Analysis Result: 1T = 68
<6>[    1.649786] .(1)[1:swapper/0][AUTOK]device status 0x00000900
<6>[    1.649789] .(1)[1:swapper/0][AUTOK]CQ not enabled
<6>[    1.650662] .(0)[4:kworker/0:0]mmcblk0boot0: mmc0:0001 GD6BMB partition 1 4.00 MiB
<6>[    1.651790] .(1)[1:swapper/0][AUTOK]DLY1/2 0 	 28 	 XOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    1.651830] .(1)[1:swapper/0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:8 DLY2:0]
<6>[    1.651833] .(1)[1:swapper/0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.651835] .(1)[1:swapper/0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    1.651838] .(1)[1:swapper/0][AUTOK]DS  [DLY1:14 DLY2:0 DLY3:20]
<6>[    1.651840] .(1)[1:swapper/0][AUTOK]CLK TX  [0]
<6>[    1.651842] .(1)[1:swapper/0][AUTOK]CMD TX  [0]
<6>[    1.651844] .(1)[1:swapper/0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.651846] .(1)[1:swapper/0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.651852] .(1)[1:swapper/0][AUTOK][HS400]======Cost:6 ms======
<5>[    1.651858] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 1, dvfs_opp: 1, sw_opp: 0
<5>[    1.651869] .(1)[1:swapper/0][VcoreFS] opp: 1, vcore: 793750 <= 793750, fddr: 1600000 <= 1866000 [O][O]
<5>[    1.651885] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 1, vcore: 0x110000, emi: 0x100000, md: 0x0
<6>[    1.651930] .(1)[1:swapper/0]skip duplicated vcore autok
<5>[    1.651932] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 2, dvfs_opp: 2, sw_opp: 1
<5>[    1.651940] .(1)[1:swapper/0][VcoreFS] opp: 2, vcore: 725000 <= 793750, fddr: 1600000 <= 1600000 [O][O]
<5>[    1.651954] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 2, vcore: 0x10000, emi: 0x100000, md: 0x0
<6>[    1.651982] .(1)[1:swapper/0][AUTOK]eMMC HS400 Tune
<6>[    1.654514] .(1)[1:swapper/0][AUTOK]CMD 0 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    1.654956] .(0)[4:kworker/0:0]mmcblk0boot1: mmc0:0001 GD6BMB partition 2 4.00 MiB
<6>[    1.655928] .(1)[1:swapper/0][AUTOK]CMD 1 	 51 	 OOXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX
<6>[    1.655933] .(1)[1:swapper/0][AUTOK]Analysis Result: 1T = 62
<6>[    1.655972] .(1)[1:swapper/0][AUTOK]device status 0x00000900
<6>[    1.655974] .(1)[1:swapper/0][AUTOK]CQ not enabled
<6>[    1.657773] .(1)[1:swapper/0][AUTOK]DLY1/2 0 	 24 	 XOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
<6>[    1.657811] .(1)[1:swapper/0][AUTOK]CMD [EDGE:0 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    1.657814] .(1)[1:swapper/0][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:0 WD_FIFO_EDGE:0]
<6>[    1.657817] .(1)[1:swapper/0][AUTOK]DAT [LATCH_CK:0 DLY1:0 DLY2:0]
<6>[    1.657819] .(1)[1:swapper/0][AUTOK]DS  [DLY1:12 DLY2:0 DLY3:20]
<6>[    1.657821] .(1)[1:swapper/0][AUTOK]CLK TX  [0]
<6>[    1.657823] .(1)[1:swapper/0][AUTOK]CMD TX  [0]
<6>[    1.657825] .(1)[1:swapper/0][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    1.657827] .(1)[1:swapper/0][AUTOK]DAT TX  [D4:0 D5:0 D6:0 D7:0]
<6>[    1.657833] .(1)[1:swapper/0][AUTOK][HS400]======Cost:5 ms======
<5>[    1.657837] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_AUTOK_EMMC, opp: 3, dvfs_opp: 3, sw_opp: 2
<5>[    1.657845] .(1)[1:swapper/0][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1600000 [O][O]
<5>[    1.657859] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 3, vcore: 0x10000, emi: 0x0, md: 0x0
<6>[    1.657906] .(1)[1:swapper/0]skip duplicated vcore autok
<6>[    1.657911] .(1)[1:swapper/0][AUTOK]CMD 0 	 33 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXOOOOOOOOOOOOOOO merge
<6>[    1.657915] .(1)[1:swapper/0][AUTOK]CMD 1 	 47 	 OOXXXXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXX merge
<6>[    1.657919] .(1)[1:swapper/0][AUTOK]cmd edge = 1 cmd dly = 37 max win = 46
<6>[    1.657934] .(1)[1:swapper/0][AUTOK]dat dly = 0
<6>[    1.657938] .(1)[1:swapper/0][AUTOK]DLY1/2 	 24 	 XOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX merge
<6>[    1.657947] .(1)[1:swapper/0][AUTOK]DS dly = 12
<6>[    1.657950] .(1)[1:swapper/0][AUTOK][merge]======Time Cost:0 ms======
<6>[    1.657952] .(1)[1:swapper/0][AUTOK]merge_value = 46
<6>[    1.657955] .(1)[1:swapper/0][AUTOK]merge_value = 23
<6>[    1.657991] .(1)[1:swapper/0][AUTOK]No need change para when dvfs
<5>[    1.657999] .(1)[1:swapper/0][VcoreFS] kicker: KIR_AUTOK_EMMC, opp: -1, dvfs_opp: 3, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[    1.658003] .(1)[1:swapper/0][VcoreFS] [AUTOK] kicker: KIR_SYSFS, opp: 3, dvfs_opp: 3, sw_opp: 3
<5>[    1.658010] .(1)[1:swapper/0][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1200000 [O][O]
<5>[    1.658024] -(1)[1:swapper/0][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<5>[    1.658031] .(1)[1:swapper/0][VcoreFS] EMMC autok done: Yes
<6>[    1.658034] .(1)[1:swapper/0]sd autok
<5>[    1.658036] .(1)[1:swapper/0][VcoreFS] SD autok done: Yes
<5>[    1.658039] .(1)[1:swapper/0][VcoreFS] SDIO autok done: Yes
<5>[    1.658042] .(1)[1:swapper/0][VcoreFS] [spm_vcorefs_init] DONE
<5>[    1.658045] .(1)[1:swapper/0][SPM] PWAKE_EN:1, PCMWDT_EN:1, BYPASS_SYSPWREQ:1
<3>[    1.658064] .(1)[1:swapper/0]BOOTPROF:      1658.064233:initcall: mt_spm_init    47.118077ms
<6>[    1.658272] .(1)[1:swapper/0][Power/dcm] weak function of dcm_pre_init
<6>[    1.658275] .(1)[1:swapper/0][Power/dcm] [dcm_set_default]type:0x00000b87, init_dcm_type=0xb87, INIT_DCM_TYPE_BY_K=0x0
<6>[    1.658280] .(1)[1:swapper/0][Power/dcm] [     ARMCORE_DCM 0x00000001] current state:1 (0)
<6>[    1.658283] .(1)[1:swapper/0][Power/dcm] [      MCUSYS_DCM 0x00000002] current state:1 (0)
<6>[    1.658286] .(1)[1:swapper/0][Power/dcm] [       INFRA_DCM 0x00000004] current state:1 (0)
<6>[    1.658290] .(1)[1:swapper/0][Power/dcm] [       STALL_DCM 0x00000080] current state:1 (0)
<6>[    1.658293] .(1)[1:swapper/0][Power/dcm] [    BIG_CORE_DCM 0x00000100] current state:1 (0)
<6>[    1.658296] .(1)[1:swapper/0][Power/dcm] [    GIC_SYNC_DCM 0x00000200] current state:1 (0)
<6>[    1.658299] .(1)[1:swapper/0][Power/dcm] [         RGU_DCM 0x00000800] current state:1 (0)
<6>[    1.658307] .(1)[1:swapper/0][Power/dcm] 
<6>[    1.658307] ******** dcm dump register *********
<6>[    1.658310] .(1)[1:swapper/0][Power/dcm] MP0_CPUCFG_MP0_RGU_DCM_CONFIG (0xffffff800d722088): 0x00000001
<6>[    1.658313] .(1)[1:swapper/0][Power/dcm] MP1_CPUCFG_MP1_RGU_DCM_CONFIG (0xffffff800d722288): 0x00000001
<6>[    1.658316] .(1)[1:swapper/0][Power/dcm] L2C_SRAM_CTRL                 (0xffffff800d722648): 0x000c0081
<6>[    1.658319] .(1)[1:swapper/0][Power/dcm] CCI_CLK_CTRL                  (0xffffff800d722660): 0x00000117
<6>[    1.658322] .(1)[1:swapper/0][Power/dcm] BUS_FABRIC_DCM_CTRL           (0xffffff800d722668): 0x00cd1ff3
<6>[    1.658326] .(1)[1:swapper/0][Power/dcm] MCU_MISC_DCM_CTRL             (0xffffff800d72266c): 0x00000003
<6>[    1.658329] .(1)[1:swapper/0][Power/dcm] CCI_ADB400_DCM_CONFIG         (0xffffff800d722740): 0x00000067
<6>[    1.658332] .(1)[1:swapper/0][Power/dcm] SYNC_DCM_CONFIG               (0xffffff800d722744): 0x028b6643
<6>[    1.658335] .(1)[1:swapper/0][Power/dcm] SYNC_DCM_CLUSTER_CONFIG       (0xffffff800d72274c): 0x063f8f8f
<6>[    1.658338] .(1)[1:swapper/0][Power/dcm] MP_GIC_RGU_SYNC_DCM           (0xffffff800d722758): 0x00000003
<6>[    1.658341] .(1)[1:swapper/0][Power/dcm] MP0_PLL_DIVIDER_CFG           (0xffffff800d7227a0): 0x03110aff
<6>[    1.658345] .(1)[1:swapper/0][Power/dcm] MP1_PLL_DIVIDER_CFG           (0xffffff800d7227a4): 0x03110aff
<6>[    1.658348] .(1)[1:swapper/0][Power/dcm] BUS_PLL_DIVIDER_CFG           (0xffffff800d7227c0): 0x03100aff
<6>[    1.658351] .(1)[1:swapper/0][Power/dcm] MCSIA_DCM_EN                  (0xffffff800d722b60): 0xffff0000
<6>[    1.658354] .(1)[1:swapper/0][Power/dcm] INFRA_BUS_DCM_CTRL            (0xffffff800d720070): 0x40ff0603
<6>[    1.658357] .(1)[1:swapper/0][Power/dcm] PERI_BUS_DCM_CTRL             (0xffffff800d720074): 0x747f83e3
<6>[    1.658360] .(1)[1:swapper/0][Power/dcm] MEM_DCM_CTRL                  (0xffffff800d720078): 0x09af07c0
<6>[    1.658363] .(1)[1:swapper/0][Power/dcm] P2P_RX_CLK_ON                 (0xffffff800d7200a0): 0x00000000
<6>[    1.658366] .(1)[1:swapper/0][Power/dcm] EMI_CONM                      (0xffffff8009e18060): 0x000005ff
<6>[    1.658369] .(1)[1:swapper/0][Power/dcm] EMI_CONN                      (0xffffff8009e18068): 0x00000000
<6>[    1.658373] .(1)[1:swapper/0][Power/dcm] CHN0_EMI_CHN_EMI_CONB         (0xffffff8009e1c008): 0x00ff2048
<6>[    1.658376] .(1)[1:swapper/0][Power/dcm] CHN1_EMI_CHN_EMI_CONB         (0xffffff8009e1e008): 0x00ff2048
<6>[    1.658379] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP1_DRAMC_PD_CTRL  (0xffffff8009e28038): 0xc0000107
<6>[    1.658382] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP1_CLKAR          (0xffffff8009e2803c): 0x02040000
<6>[    1.658385] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP1_DRAMC_PD_CTRL  (0xffffff8009e2c038): 0xc0000007
<6>[    1.658388] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP1_CLKAR          (0xffffff8009e2c03c): 0x02040000
<6>[    1.658391] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_MISC_CG_CTRL0  (0xffffff8009e34284): 0x00000110
<6>[    1.658394] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_MISC_CG_CTRL2  (0xffffff8009e3428c): 0x806003be
<6>[    1.658397] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_MISC_CTRL3     (0xffffff8009e342a8): 0x11351135
<6>[    1.658401] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU1_B0_DQ8    (0xffffff8009e34c20): 0x00007fff
<6>[    1.658403] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU1_B1_DQ8    (0xffffff8009e34ca0): 0x00207fff
<6>[    1.658407] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU1_CA_CMD8   (0xffffff8009e34d20): 0x00007fff
<6>[    1.658410] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU2_B0_DQ8    (0xffffff8009e35120): 0x00007fff
<6>[    1.658413] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU2_B1_DQ8    (0xffffff8009e351a0): 0x00207fff
<6>[    1.658416] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU2_CA_CMD8   (0xffffff8009e35220): 0x00007fff
<6>[    1.658419] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU3_B0_DQ8    (0xffffff8009e35620): 0x00007fff
<6>[    1.658422] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU3_B1_DQ8    (0xffffff8009e356a0): 0x00207fff
<6>[    1.658425] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU3_CA_CMD8   (0xffffff8009e35720): 0x00007fff
<6>[    1.658428] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU4_B0_DQ8    (0xffffff8009e35b20): 0x00000000
<6>[    1.658432] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU4_B1_DQ8    (0xffffff8009e35ba0): 0x00000000
<6>[    1.658434] .(1)[1:swapper/0][Power/dcm] DRAMC_CH0_TOP0_SHU4_CA_CMD8   (0xffffff8009e35c20): 0x00000000
<6>[    1.658438] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_MISC_CG_CTRL0  (0xffffff8009e38284): 0x00100010
<6>[    1.658441] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_MISC_CG_CTRL2  (0xffffff8009e3828c): 0x806003be
<6>[    1.658444] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_MISC_CTRL3     (0xffffff8009e382a8): 0x11351135
<6>[    1.658447] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU1_B0_DQ8    (0xffffff8009e38c20): 0x00207fff
<6>[    1.658451] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU1_B1_DQ8    (0xffffff8009e38ca0): 0x00207fff
<6>[    1.658454] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU1_CA_CMD8   (0xffffff8009e38d20): 0x00207fff
<6>[    1.658457] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU2_B0_DQ8    (0xffffff8009e39120): 0x00207fff
<6>[    1.658460] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU2_B1_DQ8    (0xffffff8009e391a0): 0x00207fff
<6>[    1.658463] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU2_CA_CMD8   (0xffffff8009e39220): 0x00207fff
<6>[    1.658466] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU3_B0_DQ8    (0xffffff8009e39620): 0x00207fff
<6>[    1.658469] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU3_B1_DQ8    (0xffffff8009e396a0): 0x00207fff
<6>[    1.658472] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU3_CA_CMD8   (0xffffff8009e39720): 0x00207fff
<6>[    1.658476] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU4_B0_DQ8    (0xffffff8009e39b20): 0x00000000
<6>[    1.658478] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU4_B1_DQ8    (0xffffff8009e39ba0): 0x00000000
<6>[    1.658482] .(1)[1:swapper/0][Power/dcm] DRAMC_CH1_TOP0_SHU4_CA_CMD8   (0xffffff8009e39c20): 0x00000000
<6>[    1.658500] .(1)[1:swapper/0][cpu_ntf] <00>ffffff800843f9e8 (dcm_hotplug_nc)
<4>[    1.658522] .(1)[1:swapper/0]mcdi_init
<6>[    1.658525] .(1)[1:swapper/0][cpu_ntf] <00>ffffff8008443348 (mcdi_cpu_callback)
<6>[    1.658530] .(1)[1:swapper/0][cpu_ntf] <00>ffffff80084432d0 (mcdi_cpu_callback_leave_hotplug)
<3>[    1.658577] .(1)[1:swapper/0]set_mcdi_s_state = 5
<5>[    1.658633] .(1)[1:swapper/0][Power/cpufreq] is_lp3 = 1
<6>[    1.658686] .(1)[1:swapper/0][cpu_ntf] <00>ffffff80084474d8 (cpu_hotplug_handler)
<6>[    1.658798] .(1)[1:swapper/0]sched_hint_init: failed to set sched_fifo
<3>[    1.659002] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: driver version: 3.9.2 20170630
<4>[    1.659018] .(1)[1:swapper/0]client->addr======48
<4>[    1.659021] .(1)[1:swapper/0]client->addr======48
<3>[    1.659132] .(3)[1:swapper/0][ALS/PS] stk3x1x_init_client: In
<3>[    1.659136] .(3)[1:swapper/0][ALS/PS] stk3x1x_write_sw_reset: In
<6>[    1.659365] .(0)[4:kworker/0:0]mmcblk0rpmb: mmc0:0001 GD6BMB partition 3 4.00 MiB
<5>[    1.660211] .(0)[245:mmcqd/0]mmc0: set cmdq on
<6>[    1.666156] .(0)[4:kworker/0:0] mmcblk0: p1 p2 p3 p4 p5 p6 p7 p8 p9 p10 p11 p12 p13 p14 p15 p16 p17 p18 p19 p20 p21 p22 p23 p24 p25 p26 p27 p28 p29 p30 p31 p32 p33 p34 p35 p36 p37 p38
<6>[    1.668579] .(3)[21:kworker/3:0][msdc]msdc2 -> !!! Set<300KHz> Source<185999KHz> -> sclk<299KHz> timing<0> mode<0> div<155> hs400_div_dis<0>
<3>[    1.669274] .(0)[4:kworker/0:0]BOOTPROF:      1669.273464:probe: probe=mmc_bus_probe drv=mmcblk(ffffff80096ccf70)    23.391924ms
<3>[    1.680544] .(0)[1:swapper/0][ALS/PS] stk3x1x_read_id: PID=0x15, VID=0xca
<5>[    1.684923] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<3>[    1.684933] .(1)[1:swapper/0][ALS/PS] stk3x1x_otp_read_byte_data: 0x25=0x0
<5>[    1.685584] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<3>[    1.686151] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_wv_r_bd_with_co = 0x0
<3>[    1.686155] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_1x_r_bd_with_co = 0x0
<3>[    1.686157] .(1)[1:swapper/0][ALS/PS] stk3x1x_read_id: p_19_r_bc = 0x0
<5>[    1.689848] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<5>[    1.690498] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.690578] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.691151] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.691228] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<3>[    1.691399] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: state_val=0x0, psctrl_val=0x31, alsctrl_val=0x39, ledctrl_val=0xff, wait_val=0xf, int_val=0x1
<3>[    1.691405] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe() OK!
<3>[    1.691407] .(1)[1:swapper/0][ALS/PS] stk3x1x_i2c_probe: OK
<3>[    1.691422] .(1)[1:swapper/0]BOOTPROF:      1691.421618:probe: probe=i2c_device_probe drv=stk3x1x(ffffff800965ac98)    32.417616ms
<3>[    1.691541] .(1)[1:swapper/0]BOOTPROF:      1691.541772:initcall: alsps_init    32.693615ms
<4>[    1.691788] .(0)[1:swapper/0][Gsensor] gsensor_local_init
<5>[    1.691801] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<4>[    1.691870] .(0)[1:swapper/0][Gsensor] bma2xx_i2c_probe
<6>[    1.691878] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<4>[    1.691878] .(0)[1:swapper/0][Gsensor] bma2xx_init_client
<6>[    1.692139] .(0)[1:swapper/0]i2c i2c-1: addr: 18, transfer ACK error
<6>[    1.692145] .(0)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.692148] .(0)[1:swapper/0]I2C structure:
<3>[    1.692148] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=3,Total_len=1
<3>[    1.692148] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.692148] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.692155] .(0)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.692164] .(0)[1:swapper/0]I2C register:
<6>[    1.692164] [I2C]SLAVE_ADDR=30,INTR_MASK=0,INTR_STAT=0,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.692164] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.692164] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.692171] .(0)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.692171] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.692171] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.692171] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.692171] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.692181] .(0)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.692181] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.692181] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.692181] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.692181] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.692187] .(0)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.692190] .(0)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.692194] .(0)[1:swapper/0]i2c i2c-1: [00] [    1.692135] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.692199] .(0)[1:swapper/0]i2c i2c-1: [01] [    1.691157] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692205] .(0)[1:swapper/0]i2c i2c-1: [02] [    1.691049] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692210] .(0)[1:swapper/0]i2c i2c-1: [03] [    1.689844] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692216] .(0)[1:swapper/0]i2c i2c-1: [04] [    1.689737] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692222] .(0)[1:swapper/0]i2c i2c-1: [05] [    1.688706] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692227] .(0)[1:swapper/0]i2c i2c-1: [06] [    1.688598] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<3>[    1.692232] .(0)[1:swapper/0]i2c i2c-1: [07] [    1.687390] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692238] .(0)[1:swapper/0]i2c i2c-1: [08] [    1.687282] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692243] .(0)[1:swapper/0]i2c i2c-1: [09] [    1.686147] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<4>[    1.692261] .(0)[1:swapper/0][Gsensor] bma_i2c_read_block 572 : i2c_transfer error: (0 ffffffc04015bab8 1) -121
<4>[    1.692266] [Gsensor] BMA2XX_CheckDeviceID 1139 : BMA2XX_CheckDeviceID -1 failt!
<4>[    1.692266]  .(0)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2680 : bma2xx_device init cilent fail time: 0
<4>[    1.692272] .(0)[1:swapper/0][Gsensor] bma2xx_init_client
<6>[    1.692357] .(0)[1:swapper/0]i2c i2c-1: addr: 18, transfer ACK error
<6>[    1.692361] .(0)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.692363] .(0)[1:swapper/0]I2C structure:
<3>[    1.692363] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=2,Total_len=1
<3>[    1.692363] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.692363] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.692369] .(0)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.692383] .(0)[1:swapper/0]I2C register:
<6>[    1.692383] [I2C]SLAVE_ADDR=30,INTR_MASK=0,INTR_STAT=1,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.692383] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.692383] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.692389] .(0)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.692389] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.692389] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.692389] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.692389] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.692399] .(0)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.692399] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.692399] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.692399] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.692399] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.692405] .(0)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.692408] .(0)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.692411] .(0)[1:swapper/0]i2c i2c-1: [00] [    1.692356] SLAVE_ADDR=30,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    1.692417] .(0)[1:swapper/0]i2c i2c-1: [01] [    1.692135] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.692422] .(0)[1:swapper/0]i2c i2c-1: [02] [    1.691157] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692428] .(0)[1:swapper/0]i2c i2c-1: [03] [    1.691049] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692433] .(0)[1:swapper/0]i2c i2c-1: [04] [    1.689844] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692439] .(0)[1:swapper/0]i2c i2c-1: [05] [    1.689737] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692444] .(0)[1:swapper/0]i2c i2c-1: [06] [    1.688706] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692450] .(0)[1:swapper/0]i2c i2c-1: [07] [    1.688598] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<3>[    1.692455] .(0)[1:swapper/0]i2c i2c-1: [08] [    1.687390] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692461] .(0)[1:swapper/0]i2c i2c-1: [09] [    1.687282] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<5>[    1.692464] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<4>[    1.692477] .(0)[1:swapper/0][Gsensor] bma_i2c_read_block 572 : i2c_transfer error: (0 ffffffc04015bab8 1) -121
<4>[    1.692481] [Gsensor] BMA2XX_CheckDeviceID 1139 : BMA2XX_CheckDeviceID -1 failt!
<4>[    1.692481]  .(0)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2680 : bma2xx_device init cilent fail time: 1
<4>[    1.692485] .(0)[1:swapper/0][Gsensor] bma2xx_init_client
<6>[    1.692540] .(0)[1:swapper/0]i2c i2c-1: addr: 18, transfer ACK error
<6>[    1.692544] .(0)[1:swapper/0]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    1.692546] .(0)[1:swapper/0]I2C structure:
<3>[    1.692546] [I2C]Clk=13650000,Id=1,Op=3,Irq_stat=2,Total_len=1
<3>[    1.692546] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=1,speed=400000
<3>[    1.692546] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    1.692549] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<6>[    1.692551] .(0)[1:swapper/0]base address 0xffffff800bf40000
<6>[    1.692564] .(0)[1:swapper/0]I2C register:
<6>[    1.692564] [I2C]SLAVE_ADDR=30,INTR_MASK=0,INTR_STAT=1,CONTROL=3a,TRANSFER_LEN=1
<6>[    1.692564] [I2C]TRANSAC_LEN=2,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    1.692564] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[    1.692570] .(0)[1:swapper/0]before enable DMA register(0x0):
<6>[    1.692570] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.692570] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.692570] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    1.692570] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.692580] .(0)[1:swapper/0]DMA register(0xffffff800bf42380):
<6>[    1.692580] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    1.692580] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    1.692580] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=2
<6>[    1.692580] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    1.692586] .(0)[1:swapper/0]i2c_dump_info ------------------------------------------
<3>[    1.692589] .(0)[1:swapper/0]i2c i2c-1: last transfer info:
<3>[    1.692592] .(0)[1:swapper/0]i2c i2c-1: [00] [    1.692539] SLAVE_ADDR=30,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.692598] .(0)[1:swapper/0]i2c i2c-1: [01] [    1.692356] SLAVE_ADDR=30,INTR_STAT=2,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    1.692603] .(0)[1:swapper/0]i2c i2c-1: [02] [    1.692135] SLAVE_ADDR=30,INTR_STAT=3,CONTROL=3a,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    1.692609] .(0)[1:swapper/0]i2c i2c-1: [03] [    1.691157] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692614] .(0)[1:swapper/0]i2c i2c-1: [04] [    1.691049] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692620] .(0)[1:swapper/0]i2c i2c-1: [05] [    1.689844] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692625] .(0)[1:swapper/0]i2c i2c-1: [06] [    1.689737] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692631] .(0)[1:swapper/0]i2c i2c-1: [07] [    1.688706] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    1.692636] .(0)[1:swapper/0]i2c i2c-1: [08] [    1.688598] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<3>[    1.692642] .(0)[1:swapper/0]i2c i2c-1: [09] [    1.687390] SLAVE_ADDR=90,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<4>[    1.692658] .(0)[1:swapper/0][Gsensor] bma_i2c_read_block 572 : i2c_transfer error: (0 ffffffc04015bab8 1) -121
<4>[    1.692661] [Gsensor] BMA2XX_CheckDeviceID 1139 : BMA2XX_CheckDeviceID -1 failt!
<4>[    1.692661]  .(0)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2680 : bma2xx_device init cilent fail time: 2
<4>[    1.692667] .(0)[1:swapper/0][Gsensor] bma2xx_i2c_probe 2771 : bma2xx_i2c_probe: err = -1
<4>[    1.692679] .(0)[1:swapper/0]BMA2XX: probe of 1-0018 failed with error -1
<6>[    1.692906] .(0)[1:swapper/0]input: low_g as /devices/virtual/input/input4
<4>[    1.692969] .(0)[1:swapper/0][hall]kpd_low_g_dev register : success!!
<3>[    1.693118] .(1)[1:swapper/0][Gsensor] bmi160_acc_i2c_probe: is begin.
<5>[    1.693128] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.693208] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.693791] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.693868] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.694441] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.694518] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.695091] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.695168] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.695744] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.695828] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<4>[    1.710690] -(1)[230:dc_trim_thread]mt6356_get_auxadc_value: 23 callbacks suppressed
<3>[    1.732342] .(1)[1:swapper/0][Gsensor] check chip id d3 successfully.
<6>[    1.732588] .(3)[21:kworker/3:0][msdc]msdc2 -> !!! Set<260KHz> Source<185999KHz> -> sclk<259KHz> timing<0> mode<0> div<179> hs400_div_dis<0>
<5>[    1.749023] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    1.749770] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<3>[    1.752281] .(2)[68:kworker/u16:1][ALS/PS] stk_tune_zero_get_ps_data: ps #0=39
<5>[    1.754224] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<5>[    1.754978] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.755071] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.755733] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.755822] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.756480] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.756572] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.757234] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<5> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.757323] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<5><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.757985] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.758074] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.758732] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.758824] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.759482] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.759575] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.760233] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<55> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.760330] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<55><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<5>[    1.760991] .(3)[21:kworker/3:0][msdc][msdc_command_resp_polling]: msdc2 CMD<1> MSDC_INT_CMDTMO Arg<0x00000000>
<6>[    1.761088] .(3)[21:kworker/3:0][msdc]msdc2 -> XXX CMD<1><0x0> Error<-110> Resp<0x0> <- msdc_dump_trans_error() : L<3849> PID<kworker/3:0><0x15>
<3>[    1.766351] .(1)[1:swapper/0][Gsensor] set bandwidth = 9 ok.
<3>[    1.786350] .(1)[1:swapper/0][Gsensor] [bmi160_acc_set_osr4] acc_bmp = 0, acc_us = 0 ok.
<3>[    1.812738] .(2)[68:kworker/u16:1][ALS/PS] stk_tune_zero_get_ps_data: ps #1=40
<3>[    1.814349] .(2)[1:swapper/0][Gsensor] bmi160_acc_set_data_range(0x5)
<3>[    1.820345] .(2)[1:swapper/0][Gsensor] bmi160_acc_set_resolution: 8192
<3>[    1.850348] .(2)[1:swapper/0][Gsensor] bmi160 set interrupt enable = 0 ok.
<5>[    1.868362] .(2)[68:kworker/u16:1][MUSB]do_register_otg_work 75: register OTG <ffffffc05c30c018> ok
<3>[    1.871902] .(2)[68:kworker/u16:1][ALS/PS] stk_tune_zero_get_ps_data: ps #2=40
<3>[    1.894443] .(2)[1:swapper/0][Gsensor] set power mode enable = 0 ok!
<3>[    1.894458] .(2)[1:swapper/0][Gsensor] bmi160 acc init OK.
<3>[    1.934444] .(0)[68:kworker/u16:1][ALS/PS] stk_tune_zero_get_ps_data: ps #3=40
<3>[    1.992188] .(0)[68:kworker/u16:1][ALS/PS] stk_tune_zero_get_ps_data: ps #4=40
<3>[    1.997609] .(0)[68:kworker/u16:1][ALS/PS] stk_ps_tune_zero_final: set HT=64,LT=54
<4>[    2.000357] .(2)[1:swapper/0]0x51,reg_data[0]=8
<4>[    2.008404] .(2)[1:swapper/0]0x5c,reg_data[0]=129
<4>[    2.016405] .(2)[1:swapper/0]0x5a,reg_data[0]=7
<4>[    2.028377] .(2)[1:swapper/0]0x5b,reg_data[0]=48
<4>[    2.036407] .(2)[1:swapper/0]0x53,reg_data[0]=9
<4>[    2.048372] .(2)[1:swapper/0]0x55,reg_data[0]=1
<3>[    2.048382] .(2)[1:swapper/0][Gsensor] bmi160_acc_i2c_probe: is ok.
<3>[    2.048415] .(2)[1:swapper/0]BOOTPROF:      2048.414388:probe: probe=i2c_device_probe drv=bmi160_acc(ffffff800965bdf0)   355.607847ms
<3>[    2.048632] .(2)[1:swapper/0][Gsensor] bmi160 acc local init.
<3>[    2.048655] .(2)[1:swapper/0]BOOTPROF:      2048.655234:initcall: acc_init   357.049078ms
<4>[    2.049193] .(2)[1:swapper/0]guozhiliang BMG160 addr=68
<4>[    2.050795] .(2)[1:swapper/0]unknown gyroscope
<4>[    2.050804] .(2)[1:swapper/0]get chip type failed, err = -1
<4>[    2.050812] .(2)[1:swapper/0]err = -1
<4>[    2.050835] .(2)[1:swapper/0]bmg160: probe of 1-0068 failed with error -1
<6>[    2.167061] .(0)[230:dc_trim_thread][accdet_init]start --->
<6>[    2.170132] .(0)[230:dc_trim_thread][accdet_init_once]-0 ACCDET_INIT0_ONCE done--->
<6>[    2.170188] .(0)[230:dc_trim_thread][accdet_init_once] ACCDET_INIT1_ONCE done--->
<6>[    2.170200] .(0)[230:dc_trim_thread][accdet_efuse]efuse=0xf1fc,adc_offset=-2 mv
<3>[    2.209029] .(2)[1:swapper/0]BOOTPROF:      2209.028542:probe: probe=i2c_device_probe drv=bmi160_gyro(ffffff800965c280)   157.975232ms
<3>[    2.209268] .(2)[1:swapper/0]BOOTPROF:      2209.267465:initcall: gyro_init   160.573846ms
<4>[    2.209882] .(2)[1:swapper/0]<<-MMC3630X INFO->> mmc3630x_i2c_probe: enter probe,driver version=V80.97.01.10
<4>[    2.209882] 
<4>[    2.209905] .(2)[1:swapper/0]<<-MMC3630X INFO->> direction =4
<4>[    2.209905] 
<4>[    2.224643] .(2)[1:swapper/0]<<-MMC3630X INFO->> [mmc3630x] product_id[0] = 10
<4>[    2.224643] 
<4>[    2.228667] .(2)[1:swapper/0]<<-MMC3630X INFO->> memsic otp matrix = 1000 994 1244
<4>[    2.228667] 
<4>[    2.245926] .(2)[1:swapper/0]<<-MMC3630X INFO->> mmc3630X IIC probe successful !
<3>[    2.245959] .(2)[1:swapper/0]BOOTPROF:      2245.958466:probe: probe=i2c_device_probe drv=mmc3630x(ffffff800965c7b8)    36.073231ms
<3>[    2.246184] .(2)[1:swapper/0]BOOTPROF:      2246.183235:initcall: mag_init    36.870308ms
<5>[    2.246224] -(2)[1:swapper/0]mtk_rtc_hal_common: RTC_IRQ_EN = 0xc, RTC_PDN1 = 0x200
<5>[    2.246238] -(2)[1:swapper/0]mtk_rtc_hal_common: rtc_spare_reg[12] = {a38, 1, 6}
<5>[    2.246255] .(2)[1:swapper/0]mtk_rtc_common: There is no Crystal
<5>[    2.246484] .(2)[228:kworker/2:2][MUSB]usb20_check_vbus_on 136: vbus_on<0>
<4>[    2.246532] .(2)[228:kworker/2:2]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<3>[    2.246552] .(2)[228:kworker/2:2]do_charger_detect charger IN
<3>[    2.246681] .(2)[1:swapper/0]memory-lowpower: memory-lowpower cma is not inited
<3>[    2.250130] .(2)[1:swapper/0][DRAMC] calibration time optimized
<6>[    2.253196] .(2)[1:swapper/0]flashlights_mt6370: mt6370_parse_dt: Parse no dt, node.
<6>[    2.253424] .(2)[1:swapper/0]flashlight: flashlight_dev_register: flashlights-mt6370 0 0 0
<6>[    2.253444] .(2)[1:swapper/0]flashlight: flashlight_dev_register: flashlights-mt6370 0 1 0
<5>[    2.254964] .(2)[1:swapper/0]log store:sram_dram_buff addr 0x7ff80000, size 0x40000.
<1>[    2.255232] .(2)[1:swapper/0][PHY layout]log_store_mem   :   0x7ff80000 - 0x7ffbffff (0x40000)
<5>[    2.255254] .(2)[1:swapper/0]log_store: log buff 0xffffff800d77e000, sig 0xcdab3412
<5>[    2.255265] .(2)[1:swapper/0]buff_size 0x40000
<5>[    2.255274] .(2)[1:swapper/0]pl off 0x20, sz 0x31a9
<5>[    2.255284] .(2)[1:swapper/0]lk off 0x31c9, sz 0x27063
<5>[    2.255293] .(2)[1:swapper/0]flag p 0xc, l 0xc
<3>[    2.255339] .(2)[1:swapper/0]memory-ssvp: [INIT FAIL]: cma is not inited
<3>[    2.255361] .(2)[1:swapper/0]memory-ssvp: SSVP sanity fail
<2>[    2.260818] .(2)[1:swapper/0][SOC FBC]Start to init FBC driver
<2>[    2.265851] .(2)[1:swapper/0][SOC FBC]init FBC driver done
<4>[    2.268668] .(2)[1:swapper/0][Thermal/TC/bcct]mtkcooler_bcct_late_init
<4>[    2.269957] .(2)[1:swapper/0][Thermal/TC/bcct]mtkcooler_bcct_pdrv_probe
<6>[    2.270315] .(1)[68:kworker/u16:1]mtk-tpd: MediaTek touch panel driver init
<6>[    2.272732] .(1)[68:kworker/u16:1]mtk-tpd: enter tpd_probe, 523
<3>[    2.272868] .(1)[68:kworker/u16:1]Lomen 0
<6>[    2.272875] .(1)[68:kworker/u16:1]mtk-tpd: [tpd -1] mt_tpd_pinctrl+++++++++++++++++
<3>[    2.272883] .(1)[68:kworker/u16:1]Lomen 0.1
<6>[    2.273052] .(2)[1:swapper/0]mt-rtc mt-rtc: setting system clock to 2020-01-10 06:12:03 UTC (1578636723)
<3>[    2.273141] .(1)[68:kworker/u16:1]Lomen 0.2
<3>[    2.273153] .(1)[68:kworker/u16:1]mtk-tpd touch: fwq Cannot find touch pinctrl default -19!
<6>[    2.273167] .(1)[68:kworker/u16:1]mtk-tpd: [tpd-1] mt_tpd_pinctrl----------
<3>[    2.273173] .(1)[68:kworker/u16:1]Lomen 1
<4>[    2.273192] .(1)[68:kworker/u16:1]<<GTP-INF>>[tpd_local_init:974]  Device Tree get regulator!
<4>[    2.273692] .(1)[68:kworker/u16:1] tpd_i2c_probe start.
<4>[    2.273779] .(1)[68:kworker/u16:1]glove_mode->0 
<4>[    2.274018] .(0)[68:kworker/u16:1]<<GTP-INF>>[tpd_i2c_probe:662] tpd_i2c_probe start.wait_event_interruptible
<6>[    2.274019] .(1)[263:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 0
<6>[    2.274071] .(1)[263:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<4>[    2.288451] .(0)[263:tpd_probe]<<GTP-INF>>[gt1x_reset_guitar:908] GTP RESET!
<6>[    2.288463] .(0)[263:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 0
<6>[    2.288492] .(0)[263:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<6>[    2.300366] .(0)[263:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 0, level = 1
<6>[    2.316381] .(0)[263:tpd_probe]mtk-tpd: [tpd]tpd_gpio_output pin = 1, level = 0
<6>[    2.372383] .(0)[263:tpd_probe]mtk-tpd: [tpd]tpd_gpio_as_int
<4>[    2.375681] .(1)[68:kworker/u16:1]<<GTP-INF>>[tpd_i2c_probe:664] tpd_i2c_probe end.wait_event_interruptible
<4>[    2.393077] .(1)[68:kworker/u16:1]<<GTP-INF>>[gt1x_read_version:983] IC VERSION:GT5688_000204(Patch)_0100(Mask)_00(SensorID)
<4>[    2.393099] .(1)[68:kworker/u16:1] tpd_i2c_probe end.
<3>[    2.393130] .(1)[68:kworker/u16:1]BOOTPROF:      2393.128927:probe: probe=i2c_device_probe drv=gt1x(ffffff80096be420)   119.427077ms
<4>[    2.393374] .(1)[68:kworker/u16:1]<<GTP-INF>>[tpd_local_init:1033] end tpd_local_init, 1033
<4>[    2.393374] 
<6>[    2.393385] .(1)[68:kworker/u16:1]mtk-tpd: [mtk-tpd]tpd_probe, tpd_driver_name=gt1x
<6>[    2.393639] .(1)[68:kworker/u16:1]mtk-tpd: Cap touch panel driver
<6>[    2.393936] .(1)[68:kworker/u16:1]input: mtk-tpd as /devices/virtual/input/input5
<6>[    2.394346] .(1)[68:kworker/u16:1]input: tp-kpd as /devices/virtual/input/input6
<3>[    2.394523] .(1)[68:kworker/u16:1]BOOTPROF:      2394.522543:probe: probe=platform_drv_probe drv=mtk-tpd(ffffff80096bdc50)   121.777616ms
<5>[    2.394715] .(2)[1:swapper/0]mtk_charger_probe: starts
<5>[    2.394728] .(2)[1:swapper/0]mtk_charger_parse_dt: starts
<5>[    2.394745] .(2)[1:swapper/0]found SwitchCharging
<5>[    2.394758] .(2)[1:swapper/0]Found primary charger [mt6370_chg]
<5>[    2.395176] .(2)[1:swapper/0]use default PE_ICHG_LEAVE_THRESHOLD:1000
<5>[    2.395222] .(2)[1:swapper/0]use default pe40_single_charger_input_current:3000
<5>[    2.395233] .(2)[1:swapper/0]use default pe40_single_charger_current:3000
<5>[    2.395245] .(2)[1:swapper/0]use default pe40_dual_charger_input_current:3000
<5>[    2.395257] .(2)[1:swapper/0]use default pe40_dual_charger_chg1_current:2000
<5>[    2.395271] .(2)[1:swapper/0]use default pe40_dual_charger_chg2_current:2000
<5>[    2.395282] .(2)[1:swapper/0]use default pe40_stop_battery_soc:2000
<5>[    2.395364] .(2)[1:swapper/0]use default MAX_CHARGING_TIME:43200
<5>[    2.395371] .(2)[1:swapper/0]algorithm name:SwitchCharging
<5>[    2.395933] .(2)[265:charger_thread][charger_routine_thread]flags=0,1 
<4>[    2.395968] .(2)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<3>[    2.396317] .(3)[1:swapper/0]BOOTPROF:      2396.317004:initcall: mtk_charger_init   123.190770ms
<6>[    2.400935] .(2)[69:kworker/u16:2][wdk] bind thread 267 to cpu 0
<6>[    2.401240] .(3)[69:kworker/u16:2][wdk] bind thread 268 to cpu 1
<6>[    2.405534] .(3)[69:kworker/u16:2][wdk] bind thread 269 to cpu 2
<6>[    2.405786] .(2)[69:kworker/u16:2][wdk] bind thread 270 to cpu 3
<6>[    2.406015] .(3)[69:kworker/u16:2][wdk] bind thread 271 to cpu 4
<6>[    2.406230] .(3)[69:kworker/u16:2][wdk] bind thread 272 to cpu 5
<6>[    2.406448] .(3)[69:kworker/u16:2][wdk] bind thread 273 to cpu 6
<6>[    2.406672] .(3)[69:kworker/u16:2][wdk] bind thread 274 to cpu 7
<6>[    2.406693] .(3)[69:kworker/u16:2][wdk] WDT start kicker done CPU_NR=8
<6>[    2.406753] .(3)[69:kworker/u16:2][cpu_ntf] <00>ffffff80088f3818 (wk_cpu_callback)
<6>[    2.406781] .(3)[69:kworker/u16:2][wdk]init_wk done late_initcall cpus_kick_bit=0xff -----
<4>[    2.408679] .(1)[263:tpd_probe]<<GTP-ERR>>[gt1x_init:2525] Check subsystem not pass[0xAA].
<3>[    2.423494] .(0)[1:swapper/0]BOOTPROF:      2423.493466:initcall: clk_debug_init    25.444384ms
<6>[    2.423562] .(0)[1:swapper/0]schedtune: init normalization constants...
<6>[    2.423569] .(0)[1:swapper/0]schedtune: CLUSTER[0-3]      min_pwr:     0 max_pwr: 56129
<6>[    2.423574] .(0)[1:swapper/0]schedtune: CPU[0]            min_pwr:     0 max_pwr: 151946
<6>[    2.423577] .(0)[1:swapper/0]schedtune: CPU[1]            min_pwr:     0 max_pwr: 151946
<6>[    2.423580] .(0)[1:swapper/0]schedtune: CPU[2]            min_pwr:     0 max_pwr: 151946
<6>[    2.423583] .(0)[1:swapper/0]schedtune: CPU[3]            min_pwr:     0 max_pwr: 151946
<6>[    2.423587] .(0)[1:swapper/0]schedtune: CLUSTER[4-7]      min_pwr:     0 max_pwr: 197933
<6>[    2.423591] .(0)[1:swapper/0]schedtune: CPU[4]            min_pwr:     0 max_pwr: 388889
<6>[    2.423594] .(0)[1:swapper/0]schedtune: CPU[5]            min_pwr:     0 max_pwr: 388889
<6>[    2.423597] .(0)[1:swapper/0]schedtune: CPU[6]            min_pwr:     0 max_pwr: 388889
<6>[    2.423600] .(0)[1:swapper/0]schedtune: CPU[7]            min_pwr:     0 max_pwr: 349038
<6>[    2.423604] .(0)[1:swapper/0]schedtune: SYSTEM            min_pwr:     0 max_pwr: 2377551
<6>[    2.423607] .(0)[1:swapper/0]schedtune: using normalization constants mul: 3281904246 sh1: 1 sh2: 21
<6>[    2.423610] .(0)[1:swapper/0]schedtune: verify normalization constants...
<6>[    2.423612] .(0)[1:swapper/0]schedtune: max_pwr/2^0: 2377551 => norm_pwr:  1024
<6>[    2.423615] .(0)[1:swapper/0]schedtune: max_pwr/2^1: 1188775 => norm_pwr:   511
<6>[    2.423618] .(0)[1:swapper/0]schedtune: max_pwr/2^2: 594387 => norm_pwr:   255
<6>[    2.423620] .(0)[1:swapper/0]schedtune: max_pwr/2^3: 297193 => norm_pwr:   127
<6>[    2.423623] .(0)[1:swapper/0]schedtune: max_pwr/2^4: 148596 => norm_pwr:    63
<6>[    2.423626] .(0)[1:swapper/0]schedtune: max_pwr/2^5: 74298 => norm_pwr:    31
<6>[    2.423629] .(0)[1:swapper/0]schedtune: configured to support 5 boost groups
<6>[    2.423650] .(0)[1:swapper/0]vs1: disabling
<3>[    2.423653] .(0)[1:swapper/0]vs1: couldn't disable: -1
<6>[    2.423662] .(0)[1:swapper/0]vmodem: disabling
<3>[    2.423665] .(0)[1:swapper/0]vmodem: couldn't disable: -1
<6>[    2.423674] .(0)[1:swapper/0]vcore: disabling
<3>[    2.423676] .(0)[1:swapper/0]vcore: couldn't disable: -1
<6>[    2.423684] .(0)[1:swapper/0]vproc: disabling
<3>[    2.423687] .(0)[1:swapper/0]vproc: couldn't disable: -1
<6>[    2.423696] .(0)[1:swapper/0]vs2: disabling
<3>[    2.423698] .(0)[1:swapper/0]vs2: couldn't disable: -1
<6>[    2.423733] .(0)[1:swapper/0]vcamio: disabling
<3>[    2.423736] .(0)[1:swapper/0]vcamio: couldn't disable: -1
<6>[    2.423770] .(0)[1:swapper/0]vaux18: disabling
<3>[    2.423772] .(0)[1:swapper/0]vaux18: couldn't disable: -1
<6>[    2.423792] .(0)[1:swapper/0]vsram_others: disabling
<3>[    2.423795] .(0)[1:swapper/0]vsram_others: couldn't disable: -1
<6>[    2.423811] .(0)[1:swapper/0]vxo22: disabling
<3>[    2.423814] .(0)[1:swapper/0]vxo22: couldn't disable: -1
<6>[    2.423831] .(0)[1:swapper/0]vio28: disabling
<3>[    2.423833] .(0)[1:swapper/0]vio28: couldn't disable: -1
<6>[    2.423843] .(0)[1:swapper/0]vio18: disabling
<3>[    2.423846] .(0)[1:swapper/0]vio18: couldn't disable: -1
<6>[    2.423873] .(0)[1:swapper/0]vbif28: disabling
<3>[    2.423875] .(0)[1:swapper/0]vbif28: couldn't disable: -1
<6>[    2.423890] .(0)[1:swapper/0]vdram: disabling
<3>[    2.423893] .(0)[1:swapper/0]vdram: couldn't disable: -1
<6>[    2.423910] .(0)[1:swapper/0]vaud28: disabling
<3>[    2.423912] .(0)[1:swapper/0]vaud28: couldn't disable: -1
<4>[    2.424630] .(1)[263:tpd_probe]<<GTP-INF>>[gt1x_get_chip_type:1027] Chip Type: GT2X
<6>[    2.425355] .(0)[1:swapper/0]rt_pd_manager_probe (1.0.5_MTK)
<6>[    2.425360] .(0)[1:swapper/0]rt_pd_manager_probe KPOC(0)
<6>[    2.425378] .(0)[1:swapper/0]rt_pd_manager_probe OK!!
<6>[    2.425526] .(0)[1:swapper/0]__tcpc_class_complete_work = type_c_port0
<6>[    2.425555] .(0)[1:swapper/0]ALSA device list:
<6>[    2.425558] .(0)[1:swapper/0]  #0: mt-snd-card
<4>[    2.436945] .(1)[263:tpd_probe]<<GTP-INF>>[gt1x_read_version:983] IC VERSION:GT5688_000204(Patch)_0100(Mask)_00(SensorID)
<4>[    2.436953] .(1)[263:tpd_probe]<<GTP-INF>>[gt1x_init_panel:654] Config group0 used, length:239
<4>[    2.436957] .(1)[263:tpd_probe]<<GTP-INF>>[gt1x_init_panel:711] X_MAX=720,Y_MAX=1280,TRIGGER=0x01,WAKEUP_LEVEL=1
<6>[    2.441887] .(3)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    2.441893] .(3)[265:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    2.443324] .(3)[265:charger_thread]=====FG===== AC   = 86
<4>[    2.444864] .(3)[265:charger_thread]=====FG===== AC   = 86
<3>[    2.448407] .(2)[228:kworker/2:2]CDP, block
<4>[    2.484606] .(3)[265:charger_thread]lifetime: data[0]=1 
<4>[    2.484610] .(3)[265:charger_thread]lifetime: data[1]=df 
<4>[    2.484612] .(3)[265:charger_thread]lifetime: data[2]=ff 
<4>[    2.484615] .(3)[265:charger_thread]lifetime: data[3]=40 
<4>[    2.484617] .(3)[265:charger_thread]lifetime: data[4]=11 
<4>[    2.484619] .(3)[265:charger_thread]lifetime: data[5]=45 
<4>[    2.484621] .(3)[265:charger_thread]lifetime: data[6]=a 
<4>[    2.484623] .(3)[265:charger_thread]lifetime: data[7]=fc 
<4>[    2.484625] .(3)[265:charger_thread]lifetime: data[8]=8 
<4>[    2.484627] .(3)[265:charger_thread]lifetime: data[9]=68 
<4>[    2.484629] .(3)[265:charger_thread]lifetime: data[10]=f7 
<4>[    2.484632] .(3)[265:charger_thread]lifetime: data[11]=18 
<4>[    2.486191] .(3)[265:charger_thread]=====FG-MTK===== bat_vol=4353
<5>[    2.489541] .(3)[265:charger_thread]Vbat=4353,Ibat=86,I=0,VChr=4730,T=25,Soc=0:0,CT:0:0 hv:1 pd:0:0
<5>[    2.489548] .(3)[265:charger_thread][mtk_is_charger_on]info->chr_type=0 
<6>[    2.490736] .(3)[265:charger_thread]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    2.490741] .(3)[265:charger_thread]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    2.490744] .(3)[265:charger_thread]I2C structure:
<3>[    2.490744] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=3,Total_len=1
<3>[    2.490744] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    2.490744] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    2.490750] .(3)[265:charger_thread]base address 0xffffff800bf46000
<6>[    2.490760] .(3)[265:charger_thread]I2C register:
<6>[    2.490760] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=0,CONTROL=28,TRANSFER_LEN=1
<6>[    2.490760] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    2.490760] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    2.490767] .(3)[265:charger_thread]before enable DMA register(0xffffff800bf48400):
<6>[    2.490767] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    2.490767] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    2.490767] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    2.490767] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    2.490777] .(3)[265:charger_thread]DMA register(0xffffff800bf48400):
<6>[    2.490777] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    2.490777] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c04500c
<6>[    2.490777] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    2.490777] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    2.490784] .(3)[265:charger_thread]i2c_dump_info ------------------------------------------
<3>[    2.490787] .(3)[265:charger_thread]i2c i2c-2: last transfer info:
<3>[    2.490791] .(3)[265:charger_thread]i2c i2c-2: [00] [    2.490733] SLAVE_ADDR=d8,INTR_STAT=3,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.490797] .(3)[265:charger_thread]i2c i2c-2: [01] [    2.484601] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=499
<3>[    2.490802] .(3)[265:charger_thread]i2c i2c-2: [02] [    2.482967] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.490808] .(3)[265:charger_thread]i2c i2c-2: [03] [    2.481363] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    2.490814] .(3)[265:charger_thread]i2c i2c-2: [04] [    2.447158] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=500
<3>[    2.490819] .(3)[265:charger_thread]i2c i2c-2: [05] [    2.445539] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    2.490825] .(3)[265:charger_thread]i2c i2c-2: [06] [    2.445201] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    2.490830] .(3)[265:charger_thread]i2c i2c-2: [07] [    2.444859] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    2.490836] .(3)[265:charger_thread]i2c i2c-2: [08] [    2.444485] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    2.490841] .(3)[265:charger_thread]i2c i2c-2: [09] [    2.443319] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<4>[    2.490858] .(3)[265:charger_thread][wlc_do_10s_debounce]status=0
<4>[    2.490862] .(3)[265:charger_thread][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294892908 valley_jiffies=0 topeak_jiffies=0 
<4>[    2.494967] .(3)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    2.494972] .(3)[265:charger_thread]=====FG===== TEMP = 225
<5>[    2.494974] .(3)[265:charger_thread]charger_check_status
<5>[    2.554283] .(3)[265:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    2.554288] .(3)[265:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:0, charging:1
<5>[    2.554295] .(3)[265:charger_thread]_charger_manager_enable_charging: dev:charger idx:0 en:1
<5>[    2.554299] .(3)[265:charger_thread]_charger_manager_enable_charging: dev:charger idx:0 en:1 cnt:0
<5>[    2.559110] .(3)[265:charger_thread][mtk_battery_notify_OVP_check] OVP_VBUS value=0 chr_type=0 rg cc1=0 cc2=0
<5>[    2.560687] .(3)[265:charger_thread][mtk_battery_notify_OVP_check]charger_vol(4730 mV) 
<4>[    2.668504] .(1)[263:tpd_probe]<<GTP-INF>>[gt1x_init_debug_node:107] Created proc entry /proc/gt1x_debug.
<4>[    2.668511] .(1)[263:tpd_probe]<<GTP-INF>>[gt1x_init_tool_node:89] Alloc memory size:512.
<4>[    2.668525] .(1)[263:tpd_probe]<<GTP-INF>>[gt1x_init_tool_node:99] Created proc entry /proc/gmnode040495.
<6>[    2.668590] .(1)[263:tpd_probe]mtk-tpd: [tpd]tpd_gpio_as_int
<4>[    2.724346] .(1)[263:tpd_probe]<<GTP-INF>>[tpd_irq_registration:478] Device Tree Tpd_irq_registration!
<4>[    2.725502] .(1)[263:tpd_probe]gpiod_set_debounce: invalid GPIO
<4>[    2.725564] .(1)[263:tpd_probe]<<GTP-INF>>[tpd_irq_registration:486] Device gt1x_int_type = 1!
<4>[    2.725608] .(1)[263:tpd_probe]<<GTP-INF>>[tpd_irq_registration:507] irq:673, debounce:1-0:
<4>[    2.725614] -(1)[263:tpd_probe]------------[ cut here ]------------
<4>[    2.725617] -(1)[263:tpd_probe]WARNING: CPU: 1 PID: 263 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:513 __enable_irq+0x44/0x80()
<4>[    2.725631] -(1)[263:tpd_probe]Unbalanced enable for IRQ 673
<4>[    2.725634] Modules linked in:-(1)[263:tpd_probe]
<4>[    2.725641] -(1)[263:tpd_probe]CPU: 1 PID: 263 Comm: tpd_probe Tainted: G        W       4.4.95+ #2
<4>[    2.725645] -(1)[263:tpd_probe]Hardware name: MT6763V/B (DT)
<4>[    2.725650] -(1)[263:tpd_probe]Call trace:
<4>[    2.725652] -(1)[263:tpd_probe][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    2.725661] -(1)[263:tpd_probe][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    2.725666] -(1)[263:tpd_probe][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    2.725674] -(1)[263:tpd_probe][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    2.725681] -(1)[263:tpd_probe][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    2.725686] -(1)[263:tpd_probe][<ffffff800810c894>] __enable_irq+0x44/0x80
<4>[    2.725689] -(1)[263:tpd_probe][<ffffff800810c91c>] enable_irq+0x4c/0xa8
<4>[    2.725693] -(1)[263:tpd_probe][<ffffff80088ae2ac>] gt1x_irq_enable+0x3c/0x60
<4>[    2.725702] -(1)[263:tpd_probe][<ffffff80088ae478>] tpd_registration+0x1a8/0x2a0
<4>[    2.725706] -(1)[263:tpd_probe][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    2.725712] -(1)[263:tpd_probe][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    2.725717] -(1)[263:tpd_probe]---[ end trace 97123305e0c7479a ]---
<4>[    2.733783] .(0)[276:mtk-tpd]--lan-- ret = 0.
<4>[    2.746328] .(0)[276:mtk-tpd]--lan-- ret = 0.
<4>[    2.757096] .(0)[276:mtk-tpd]--lan-- ret = 0.
<4>[    2.766078] .(0)[1:swapper/0][TKCORE] fy partition-0
<4>[    2.766078] [    5.320126]: <0>MSG TKCore:htfat_early_init:1004: Verify partition-1
<4>[    2.766078] [    5.321433]: <0>MSG TKCore:htfat_early_init:1018: Initialize partition for the 3(+) times
<4>[    2.766078] [    5.322541]: <0>MSG TKCore:htfat_early_init:1032: HTFAT FS active_id = 0
<6>[    2.767914] .(0)[1:swapper/0]Freeing unused kernel memory: 5152K
<3>[    2.767989] .(0)[1:swapper/0]BOOTPROF:      2767.989313:Kernel_init_done
<4>[    2.770754] [TKCORE] 
<4>[    2.770754] [    5.323794]: <0>INF TKCore:htfat_init:163: HTFAT initialized Done
<4>[    2.770754] [    5.324626]: <0>INF TKCore:init_primary_helper:233: Primary CPU switching to normal world boot
<4>[    2.770754] [    5.325781]: <0>MSG TKCore:dump_tee_boot_params:135: tee_boot_params.magic: 0x545349.(1)[1:init][TKCORE] 58
<4>[    2.774463] [    5.326845]: <0>MSG TKCore:dump_tee_boot_params:136: tee_boot_params.length: 0xa8
<4>[    2.774463] [    5.327855]: <0>MSG TKCore:dump_tee_boot_params:137: tee_boot_params.version : 0x10003
<4>[    2.774463] [    5.328921]: <0>DBG TKCore:dump_tee_boot_params:140: tee_boot_params.uart_[TKCORE] base: 0x11002000
<4>[    2.774463] [    5.330042]: <0>DBG TKCore:dump_tee_boot_params:141: tee_boot_params.total_number_spi: 352
<4>[    2.774463] [    5.331163]: <0>DBG TKCore:dump_tee_boot_params:142: tee_boot_params.ssiq_number: 328
<4>[    2.774463] [    5.332218]: <0>DBG TKCore:dump_tee_boot_params:143:
<14>[    2.781624] .(1)[1:init]init: init first stage started!
<14>[    2.782337] .(1)[1:init]init: dlroot====before call DoFirstStageMount.
<14>[    2.783467] .(1)[1:init]init: Using Android DT directory /proc/device-tree/firmware/android/
<6>[    2.824434] .(0)[4:kworker/0:0][msdc]cache(0x858000~0x930000, usrdata(0x930000~0x3A29FDF)
<3>[    2.850771] .(1)[1:init]power_supply charger: driver failed to report `charge_type' property: -22
<4>[    2.883382] .(4)[1:init]=====FG===== SOC  = 100
<4>[    2.884733] .(4)[1:init]=====FG===== AC   = 86
<4>[    2.886402] .(4)[1:init]=====FG===== VOLT = 4344
<4>[    2.886996] .(4)[1:init]=====FG===== actural VOLT = 4334
<4>[    2.888230] .(4)[1:init]temp_now=225, temp_last=225 
<4>[    2.888885] .(4)[1:init]=====FG===== TEMP = 225
<4>[    2.890023] .(4)[1:init]=====FG===== SOC  = 100
<4>[    2.891148] .(4)[1:init]bq27542_set_commands cmd = 0x12, val = 3884 
<4>[    2.892531] .(4)[1:init]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    2.893882] .(4)[1:init]bq27542_set_commands cmd = 0xc, val = 3998 
<14>[    2.901086] .(4)[1:init]init: dlroot===is_device_secure ====, benableroot:0
<12>[    3.234198] .(0)[278:init]fec: <278> warning: __ecc_read: RS block 11603968: decoding failed
<14>[    3.239469] .(0)[1:init]init: [libfs_mgr]Enabling dm-verity for system (mode 2)
<14>[    3.240536] .(0)[1:init]init: [libfs_mgr]loading verity table: '1 /dev/block/platform/bootdevice/by-name/system /dev/block/platform/bootdevice/by-name/system 4096 4096 774155 774155 sha256 49dbfd96347034480a68d5af41b5b5e73807b833fc0dc001ac6e7959e8efadd2 aee087a5be3b982978c923f566a94613496b417f2af592639bc80d141e34dfe7 10 restart_on_corruption use_fec_from_device /dev/block/platform/bootdevice/by-name/system fec_start 780261 fec_blocks 780261 fec_roots 2 ignore_zero_blocks'
<6>[    3.254684] .(1)[1:init]EXT4-fs (dm-0): mounted filesystem with ordered data mode. Opts: (null)
<14>[    3.255934] .(1)[1:init]init: [libfs_mgr]__mount(source=/dev/block/dm-0,target=/system,type=ext4)=0: Success
<14>[    3.257524] .(1)[1:init]init: dlroot===is_device_secure ====, benableroot:0
<12>[    3.418255] .(2)[289:init]fec: <289> warning: __ecc_read: RS block 2215936: decoding failed
<14>[    3.422614] .(1)[1:init]init: [libfs_mgr]Enabling dm-verity for vendor (mode 2)
<14>[    3.423610] .(1)[1:init]init: [libfs_mgr]loading verity table: '1 /dev/block/platform/bootdevice/by-name/vendor /dev/block/platform/bootdevice/by-name/vendor 4096 4096 165305 165305 sha256 fc8be3b2b1f80d5066d28c5bd5f4f01782524d312dcfbe2c51f7b0f974648613 aee087a5be3b982978c923f566a94613496b417f2af592639bc80d141e34dfe7 10 restart_on_corruption use_fec_from_device /dev/block/platform/bootdevice/by-name/vendor fec_start 166617 fec_blocks 166617 fec_roots 2 ignore_zero_blocks'
<6>[    3.424357] .(0)[4:kworker/0:0]tcpc_init_work force start
<6>[    3.425907] .(3)[45:pd_dbg_info]///PD dbg info 42d
<4>[    3.425912] .(3)[45:pd_dbg_info]<    3.425>TCPC-TYPEC:typec_init: TrySNK
<6>[    3.428416] .(0)[4:kworker/0:0]tcpc_device_irq_enable : tcpc irq enable OK!
<6>[    3.429597] .(2)[220:type_c_port0]pd_tcp_notifier_call attach wait sink
<4>[    3.429632] .(2)[220:type_c_port0]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<5>[    3.429637] .(2)[220:type_c_port0]tcpc_check_ovp_out_of_charger
<5>[    3.429641] .(2)[220:type_c_port0]wake_up_charger
<6>[    3.442235] .(2)[1:init]EXT4-fs (dm-1): mounted filesystem with ordered data mode. Opts: (null)
<14>[    3.443464] .(2)[1:init]init: [libfs_mgr]__mount(source=/dev/block/dm-1,target=/vendor,type=ext4)=0: Success
<14>[    3.444955] .(2)[1:init]init: Skipped setting INIT_AVB_VERSION (not in recovery mode)
<14>[    3.445970] .(2)[1:init]init: Loading SELinux policy
<6>[    3.448354] .(0)[45:pd_dbg_info]///PD dbg info 198d
<4>[    3.449003] .(0)[45:pd_dbg_info]<    3.426>TCPC-TYPEC:PowerOffCharge
<4>[    3.449003] <    3.426>TCPC-TYPEC:** Unattached.SNK
<4>[    3.449003] <    3.429>TCPC-TYPEC:[CC_Alert] 5/0
<4>[    3.449003] <    3.429>TCPC-TYPEC:** AttachWait.SNK
<4>[    3.449003] <    3.429>TCPC-TYPEC:[CC_Status2] 5/0
<7>[    3.471192] .(2)[1:init]SELinux: 8192 avtab hash slots, 24948 rules.
<7>[    3.489698] .(2)[1:init]SELinux: 8192 avtab hash slots, 24948 rules.
<7>[    3.489740] .(2)[1:init]SELinux:  1 users, 4 roles, 2069 types, 0 bools, 1 sens, 1024 cats
<7>[    3.489750] .(2)[1:init]SELinux:  92 classes, 24948 rules
<7>[    3.494970] .(2)[1:init]SELinux:  Completing initialization.
<7>[    3.494990] .(2)[1:init]SELinux:  Setting up existing superblocks.
<6>[    3.549659] .(1)[45:pd_dbg_info]///PD dbg info 78d
<4>[    3.550309] .(1)[45:pd_dbg_info]<    3.549>TCPC-TYPEC:[CC_Change] 5/0
<4>[    3.550309] <    3.549>TCPC-TYPEC:** Attached.SNK
<6>[    3.551867] .(0)[218:tcpc_timer_type]pd_tcp_notifier_call sink vbus 5000mv 150ma type(1)
<5>[    3.553013] .(0)[218:tcpc_timer_type]charger_manager_enable_power_path: power path is already en = 1
<5>[    3.554194] .(0)[218:tcpc_timer_type]PD charger event:14 5
<6>[    3.554910] .(0)[218:tcpc_timer_type]pd_tcp_notifier_call USB Plug in, pol = 0
<4>[    3.560760] .(5)[265:charger_thread]TempToCurrent no charge on
<5>[    3.561518] .(5)[265:charger_thread][charger_routine_thread]flags=0,1 
<4>[    3.562380] .(5)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<5>[    3.566895] .(2)[1:init]audit: type=1403 audit(1578636724.378:2): policy loaded auid=4294967295 ses=4294967295
<14>[    3.568459] .(2)[1:init]selinux: SELinux: Loaded policy from /vendor/etc/selinux/precompiled_sepolicy
<14>[    3.568459] 
<14>[    3.570273] .(2)[1:init]init: dlroot===selinux_is_enforcing, secureboot_status_from_cmdline, bEnableroot:0
<5>[    3.571579] .(2)[1:init]audit: type=1404 audit(1578636724.382:3): enforcing=1 old_enforcing=0 auid=4294967295 ses=4294967295
<6>[    3.572362] .(1)[45:pd_dbg_info]///PD dbg info 118d
<4>[    3.572366] .(1)[45:pd_dbg_info]<    3.554>TCPC-TYPEC:[CC_Status] 5/0
<4>[    3.572366] <    3.554>TCPC-TYPEC:Attached-> SINK
<4>[    3.572366] <    3.555>TCPC-TCPC:usb_port_attached
<14>[    3.595321] .(2)[1:init]selinux: SELinux: Loaded file_contexts
<14>[    3.595321] 
<5>[    3.597652] .(0)[1:init]random: init: uninitialized urandom read (40 bytes read, 42 bits of entropy available)
<14>[    3.599912] .(0)[1:init]init: init second stage started!
<14>[    3.611350] .(0)[1:init]init: Using Android DT directory /proc/device-tree/firmware/android/
<11>[    3.613472] .(0)[1:init]init: property_set("ro.boot.hardware", "mt6763") failed: property already set
<14>[    3.614658] .(0)[1:init]init: dlroo=== import_kernel_nv=== property_set key [hardware , mt6763]
<14>[    3.615792] .(0)[1:init]init: dlroo=== import_kernel_nv=== property_set key [verifiedbootstate , orange]
<14>[    3.617055] .(0)[1:init]init: dlroo=== import_kernel_nv=== property_set key [veritymode , enforcing]
<14>[    3.618237] .(0)[1:init]init: dlroo=== import_kernel_nv=== property_set key [atm , disabled]
<14>[    3.619334] .(0)[1:init]init: dlroo=== import_kernel_nv=== property_set key [meta_log_disable , 0]
<11>[    3.620526] .(0)[1:init]init: property_set("ro.boot.serialno", "S19F00013") failed: property already set
<14>[    3.621738] .(0)[1:init]init: dlroo=== import_kernel_nv=== property_set key [serialno , S19F00013]
<14>[    3.622903] .(0)[1:init]init: dlroo=== import_kernel_nv=== property_set key [secureboot , 49]
<14>[    3.624008] .(0)[1:init]init: dlroo=== import_kernel_nv=== property_set key [specialid , 0]
<14>[    3.625130] .(0)[1:init]init: dlroo=== import_kernel_nv=== property_set key [bootreason , wdt_by_pass_pwk]
<14>[    3.626397] .(0)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.serialno , S19F00013]   default:
<14>[    3.627766] .(0)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.bootmode , normal]   default:unknown
<14>[    3.629179] .(0)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.baseband , ]   default:unknown
<14>[    3.630507] .(0)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.bootloader , ]   default:unknown
<14>[    3.631855] .(0)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.hardware , mt6763]   default:unknown
<14>[    3.633276] .(0)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.revision , ]   default:0
<14>[    3.634538] .(0)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.secureboot , 49]   default:0
<14>[    3.635843] .(0)[1:init]init: dlroo===export_kernel_boot_props=== property_set [ro.specialid , 0]   default:0
<14>[    3.637223] .(5)[1:init]init: dlroo===export_kernel_boot_props=== property_set [gsm.serial , S19F00013]   default:
<6>[    3.642130] .(4)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<14>[    3.642538] .(5)[1:init]selinux: SELinux: Loaded file_contexts
<14>[    3.642538] 
<14>[    3.643926] .(5)[1:init]selinux: SELinux: Loaded property_contexts from /system/etc/selinux/plat_property_contexts & /vendor/etc/selinux/nonplat_property_contexts.
<14>[    3.643926] 
<14>[    3.643939] .(5)[1:init]init: Running restorecon...
<4>[    3.647095] .(4)[265:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    3.648914] .(4)[265:charger_thread]=====FG===== AC   = 86
<4>[    3.650363] .(4)[265:charger_thread]=====FG===== AC   = 86
<11>[    3.656788] .(5)[1:init]init: waitid failed: No child processes
<14>[    3.657592] .(5)[1:init]init: dlroot == [ro.secureboot]: 49
<14>[    3.658315] .(5)[1:init]init: dlroot=== secure boot is enabled or unknown, load standard deault prop .
<14>[    3.660482] .(6)[1:init]init: PropSet [security.perf_harden]=[1] Done
<14>[    3.661447] .(6)[1:init]init: PropSet [persist.sys.usb.config]=[none] Done
<12>[    3.662374] .(6)[1:init]init: Couldn't load property file: Unable to open '/odm/default.prop': No such file or directory: No such file or directory
<14>[    3.664985] .(5)[1:init]init: PropSet [dalvik.vm.image-dex2oat-Xms]=[64m] Done
<14>[    3.665928] .(5)[1:init]init: PropSet [dalvik.vm.image-dex2oat-Xmx]=[64m] Done
<14>[    3.666861] .(5)[1:init]init: PropSet [dalvik.vm.dex2oat-Xms]=[64m] Done
<14>[    3.667728] .(5)[1:init]init: PropSet [dalvik.vm.dex2oat-Xmx]=[512m] Done
<14>[    3.668661] .(5)[1:init]init: PropSet [dalvik.vm.usejit]=[true] Done
<14>[    3.669487] .(5)[1:init]init: PropSet [dalvik.vm.usejitprofiles]=[true] Done
<14>[    3.670400] .(5)[1:init]init: PropSet [dalvik.vm.dexopt.secondary]=[true] Done
<14>[    3.671334] .(5)[1:init]init: PropSet [dalvik.vm.appimageformat]=[lz4] Done
<14>[    3.672236] .(5)[1:init]init: PropSet [pm.dexopt.first-boot]=[quicken] Done
<14>[    3.673153] .(5)[1:init]init: PropSet [pm.dexopt.boot]=[verify] Done
<14>[    3.673978] .(5)[1:init]init: PropSet [pm.dexopt.install]=[quicken] Done
<14>[    3.674847] .(5)[1:init]init: PropSet [pm.dexopt.bg-dexopt]=[speed-profile] Done
<14>[    3.675802] .(5)[1:init]init: PropSet [pm.dexopt.ab-ota]=[speed-profile] Done
<14>[    3.676743] .(5)[1:init]init: PropSet [pm.dexopt.inactive]=[verify] Done
<14>[    3.677612] .(5)[1:init]init: PropSet [pm.dexopt.shared]=[speed] Done
<14>[    3.678450] .(5)[1:init]init: PropSet [debug.atrace.tags.enableflags]=[0] Done
<14>[    3.679383] .(5)[1:init]init: PropSet [persist.service.acm.enable]=[0] Done
<14>[    3.680302] .(5)[1:init]init: PropSet [persist.sys.usb.config]=[mtp] Done
<14>[    3.681238] .(5)[1:init]init: PropSet [camera.disable_zsl_mode]=[1] Done
<14>[    3.682749] .(5)[1:init]init: Created socket '/dev/socket/property_service', mode 666, user 0, group 0
<14>[    3.684006] .(5)[1:init]init: PropSet [sys.usb.controller]=[musb-hdrc] Done
<14>[    3.684965] .(5)[1:init]init: dlroot === ParseConfig init.rc 
<14>[    3.685725] .(5)[1:init]init: Parsing file /init.rc...
<14>[    3.686602] .(5)[1:init]init: Added '/init.environ.rc' to import list
<14>[    3.687433] .(5)[1:init]init: Added '/init.usb.rc' to import list
<14>[    3.688234] .(5)[1:init]init: Added '/init.mt6763.rc' to import list
<14>[    3.689137] .(5)[1:init]init: Added '/vendor/etc/init/hw/init.mt6763.rc' to import list
<14>[    3.690161] .(5)[1:init]init: Added '/init.usb.configfs.rc' to import list
<14>[    3.691077] .(5)[1:init]init: Added '/init.zygote64_32.rc' to import list
<14>[    3.692969] .(5)[1:init]init: Parsing file /init.environ.rc...
<14>[    3.693807] .(5)[1:init]init: Parsing file /init.usb.rc...
<14>[    3.694814] .(5)[1:init]init: Parsing file /init.mt6763.rc...
<11>[    3.695567] .(5)[1:init]init: Unable to open '/init.mt6763.rc': No such file or directory
<11>[    3.696666] .(5)[1:init]init: /init.rc: 9: Could not import file '/init.mt6763.rc': No such file or directory
<14>[    3.699153] .(6)[1:init]init: Parsing file /vendor/etc/init/hw/init.mt6763.rc...
<14>[    3.701592] .(6)[1:init]init: Added '/vendor/etc/init/hw/init.connectivity.rc' to import list
<14>[    3.702722] .(6)[1:init]init: Added '/vendor/etc/init/hw/init.mt6763.usb.rc' to import list
<14>[    3.703791] .(6)[1:init]init: Added '/vendor/etc/init/hw/init.project.rc' to import list
<14>[    3.704873] .(6)[1:init]init: Added '/FWUpgradeInit.rc' to import list
<14>[    3.705713] .(6)[1:init]init: Added '/vendor/etc/init/hw/init.aee.rc' to import list
<14>[    3.706724] .(6)[1:init]init: Added '/vendor/etc/init/hw/init.volte.rc' to import list
<14>[    3.707742] .(6)[1:init]init: Added '/vendor/etc/init/hw/init.mal.rc' to import list
<14>[    3.708779] .(6)[1:init]init: Added '/vendor/etc/init/hw/init.sensor_1_0.rc' to import list
<14>[    3.709852] .(6)[1:init]init: Added '/vendor/etc/init/hw/init.modem.rc' to import list
<11>[    3.711030] .(6)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 104: invalid keyword 'makedir'
<11>[    3.712155] .(6)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 105: invalid keyword 'makedir'
<11>[    3.713307] .(6)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 109: invalid keyword 'makedir'
<11>[    3.714636] .(6)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 316: invalid keyword 'mknod'
<11>[    3.715919] .(6)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 453: invalid keyword 'mknod'
<11>[    3.717045] .(6)[1:init]init: /vendor/etc/init/hw/init.mt6763.rc: 460: invalid keyword 'mknod'
<14>[    3.719378] .(6)[1:init]init: Parsing file /vendor/etc/init/hw/init.connectivity.rc...
<14>[    3.721447] .(7)[1:init]init: Parsing file /vendor/etc/init/hw/init.mt6763.usb.rc...
<14>[    3.726804] .(7)[1:init]init: Parsing file /vendor/etc/init/hw/init.project.rc...
<14>[    3.728614] .(7)[1:init]init: Added '/vendor/etc/init/hw/init.datalogic.rc' to import list
<14>[    3.729946] .(7)[1:init]init: Parsing file /vendor/etc/init/hw/init.datalogic.rc...
<14>[    3.731717] .(7)[1:init]init: Parsing file /FWUpgradeInit.rc...
<11>[    3.732539] .(7)[1:init]init: Unable to open '/FWUpgradeInit.rc': No such file or directory
<11>[    3.733616] .(7)[1:init]init: /init.rc: 6: Could not import file '/FWUpgradeInit.rc': No such file or directory
<14>[    3.734948] .(7)[1:init]init: Parsing file /vendor/etc/init/hw/init.aee.rc...
<14>[    3.736638] .(7)[1:init]init: Added '/init.preload.rc' to import list
<14>[    3.737482] .(7)[1:init]init: Parsing file /init.preload.rc...
<11>[    3.738245] .(7)[1:init]init: Unable to open '/init.preload.rc': No such file or directory
<11>[    3.739305] .(7)[1:init]init: /init.rc: 51: Could not import file '/init.preload.rc': No such file or directory
<14>[    3.740650] .(7)[1:init]init: Parsing file /vendor/etc/init/hw/init.volte.rc...
<11>[    3.741594] .(7)[1:init]init: Unable to open '/vendor/etc/init/hw/init.volte.rc': No such file or directory
<11>[    3.742837] .(7)[1:init]init: /init.rc: 8: Could not import file '/vendor/etc/init/hw/init.volte.rc': No such file or directory
<14>[    3.744307] .(7)[1:init]init: Parsing file /vendor/etc/init/hw/init.mal.rc...
<11>[    3.745277] .(7)[1:init]init: Unable to open '/vendor/etc/init/hw/init.mal.rc': No such file or directory
<11>[    3.746499] .(7)[1:init]init: /init.rc: 9: Could not import file '/vendor/etc/init/hw/init.mal.rc': No such file or directory
<14>[    3.747979] .(7)[1:init]init: Parsing file /vendor/etc/init/hw/init.sensor_1_0.rc...
<14>[    3.750147] .(7)[1:init]init: Parsing file /vendor/etc/init/hw/init.modem.rc...
<14>[    3.751852] .(7)[1:init]init: Parsing file /init.usb.configfs.rc...
<14>[    3.753138] .(7)[1:init]init: Parsing file /init.zygote64_32.rc...
<14>[    3.754141] .(7)[1:init]init: Parsing directory /system/etc/init...
<14>[    3.755777] .(7)[1:init]init: Parsing file /system/etc/init/aal.rc...
<14>[    3.757368] .(7)[1:init]init: Parsing file /system/etc/init/aee_aed.rc...
<14>[    3.758904] .(7)[1:init]init: Parsing file /system/etc/init/aee_aed64.rc...
<4>[    3.760357] .(5)[265:charger_thread]lifetime: data[0]=df 
<14>[    3.760489] .(4)[1:init]init: Parsing file /system/etc/init/android.hidl.allocator@1.0-service.rc...
<14>[    3.761186] .(7)[1:init]init: Parsing file /system/etc/init/atcid.rc...
<14>[    3.762423] .(7)[1:init]init: Parsing file /system/etc/init/atrace.rc...
<14>[    3.763622] .(7)[1:init]init: Parsing file /system/etc/init/audiocmdservice_atci.rc...
<14>[    3.764115] .(7)[1:init]init: Parsing file /system/etc/init/audioserver.rc...
<14>[    3.764519] .(7)[1:init]init: Parsing file /system/etc/init/batterywarning.rc...
<14>[    3.765148] .(4)[1:init]init: Parsing file /system/etc/init/bootanim.rc...
<14>[    3.766078] .(4)[1:init]init: Parsing file /system/etc/init/bootlogoupdater.rc...
<14>[    3.767042] .(6)[1:init]init: Parsing file /system/etc/init/bootstat.rc...
<14>[    3.768058] .(6)[1:init]init: Parsing file /system/etc/init/cameraserver.rc...
<14>[    3.768923] .(6)[1:init]init: Parsing file /system/etc/init/drmserver.rc...
<14>[    3.769812] .(6)[1:init]init: Parsing file /system/etc/init/dumpstate.rc...
<14>[    3.770758] .(6)[1:init]init: Parsing file /system/etc/init/emdlogger1.rc...
<14>[    3.771640] .(6)[1:init]init: Parsing file /system/etc/init/emdlogger3.rc...
<14>[    3.772546] .(6)[1:init]init: Parsing file /system/etc/init/gatekeeperd.rc...
<14>[    3.773464] .(6)[1:init]init: Parsing file /system/etc/init/ged_srv.rc...
<14>[    3.774408] .(6)[1:init]init: Parsing file /system/etc/init/hwservicemanager.rc...
<14>[    3.775309] .(6)[1:init]init: Parsing file /system/etc/init/init.thermald.rc...
<14>[    3.776165] .(6)[1:init]init: Parsing file /system/etc/init/init.vtservice.rc...
<14>[    3.776545] .(6)[1:init]init: Parsing file /system/etc/init/installd.rc...
<14>[    3.777029] .(6)[1:init]init: Parsing file /system/etc/init/keystore.rc...
<14>[    3.778103] .(6)[1:init]init: Parsing file /system/etc/init/kpoc_charger.rc...
<14>[    3.778378] .(6)[1:init]init: Parsing file /system/etc/init/lmkd.rc...
<14>[    3.778669] .(6)[1:init]init: Parsing file /system/etc/init/logd.rc...
<14>[    3.778990] .(6)[1:init]init: Parsing file /system/etc/init/md_monitor.rc...
<14>[    3.779952] .(6)[1:init]init: Parsing file /system/etc/init/mdlogger.rc...
<14>[    3.780860] .(6)[1:init]init: Parsing file /system/etc/init/mdnsd.rc...
<14>[    3.781777] .(6)[1:init]init: Parsing file /system/etc/init/mediadrmserver.rc...
<14>[    3.782647] .(6)[1:init]init: Parsing file /system/etc/init/mediaextractor.rc...
<14>[    3.783466] .(6)[1:init]init: Parsing file /system/etc/init/mediametrics.rc...
<14>[    3.784394] .(6)[1:init]init: Parsing file /system/etc/init/mediaserver.rc...
<14>[    3.785293] .(6)[1:init]init: Parsing file /system/etc/init/met_log_d.rc...
<14>[    3.786116] .(6)[1:init]init: Parsing file /system/etc/init/mobile_log_d.rc...
<14>[    3.787167] .(6)[1:init]init: Parsing file /system/etc/init/mtk_advcamserver.rc...
<14>[    3.788060] .(6)[1:init]init: Parsing file /system/etc/init/mtpd.rc...
<14>[    3.789039] .(6)[1:init]init: Parsing file /system/etc/init/netd.rc...
<14>[    3.789943] .(6)[1:init]init: Parsing file /system/etc/init/netdiag.rc...
<14>[    3.790851] .(6)[1:init]init: Parsing file /system/etc/init/ppl_agent.rc...
<14>[    3.791757] .(6)[1:init]init: Parsing file /system/etc/init/program_binary_service.rc...
<14>[    3.792740] .(6)[1:init]init: Parsing file /system/etc/init/racoon.rc...
<14>[    3.793603] .(6)[1:init]init: Parsing file /system/etc/init/servicemanager.rc...
<14>[    3.794451] .(6)[1:init]init: Parsing file /system/etc/init/sn.rc...
<14>[    3.795329] .(6)[1:init]init: Parsing file /system/etc/init/storaged.rc...
<14>[    3.796220] .(6)[1:init]init: Parsing file /system/etc/init/storagemanagerd.rc...
<14>[    3.796588] .(6)[1:init]init: Parsing file /system/etc/init/surfaceflinger.rc...
<14>[    3.796930] .(6)[1:init]init: Parsing file /system/etc/init/terserver.rc...
<14>[    3.797256] .(6)[1:init]init: Parsing file /system/etc/init/thermalindicator.rc...
<14>[    3.798147] .(6)[1:init]init: Parsing file /system/etc/init/thermalservice.rc...
<14>[    3.799068] .(6)[1:init]init: Parsing file /system/etc/init/tombstoned.rc...
<14>[    3.799919] .(6)[1:init]init: Parsing file /system/etc/init/uncrypt.rc...
<14>[    3.800834] .(6)[1:init]init: Parsing file /system/etc/init/vdc.rc...
<14>[    3.801777] .(6)[1:init]init: Parsing file /system/etc/init/vold.rc...
<14>[    3.802745] .(6)[1:init]init: Parsing file /system/etc/init/webview_zygote32.rc...
<14>[    3.803632] .(6)[1:init]init: Parsing file /system/etc/init/webview_zygote64.rc...
<14>[    3.804702] .(1)[1:init]init: Parsing file /system/etc/init/wifi-events.rc...
<14>[    3.805662] .(1)[1:init]init: Parsing file /system/etc/init/wificond.rc...
<14>[    3.806517] .(1)[1:init]init: Parsing directory /vendor/etc/init...
<14>[    3.806709] .(1)[1:init]init: Parsing file /vendor/etc/init/aee_aedv.rc...
<14>[    3.807364] .(1)[1:init]init: Parsing file /vendor/etc/init/aee_aedv64.rc...
<14>[    3.808170] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc...
<14>[    3.808529] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.bluetooth@1.0-service-mediatek.rc...
<14>[    3.808884] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.broadcastradio@1.1-service.rc...
<14>[    3.809997] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.cas@1.0-service.rc...
<14>[    3.810976] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.configstore@1.0-service.rc...
<14>[    3.811890] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.drm@1.0-service.rc...
<14>[    3.812799] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.drm@1.0-service.widevine.rc...
<14>[    3.813607] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.gatekeeper@1.0-service.rc...
<14>[    3.814487] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.graphics.allocator@2.0-service.rc...
<14>[    3.815416] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.graphics.composer@2.1-service.rc...
<14>[    3.816693] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.keymaster@3.0-service.rc...
<14>[    3.817990] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.light@2.0-service-mediatek.rc...
<14>[    3.819253] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.media.omx@1.0-service.rc...
<14>[    3.820525] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.memtrack@1.0-service.rc...
<14>[    3.820853] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.sensors@1.0-service-mediatek.rc...
<14>[    3.821140] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.thermal@1.0-service.rc...
<14>[    3.821422] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.vibrator@1.0-service.rc...
<14>[    3.822797] .(1)[1:init]init: Parsing file /vendor/etc/init/android.hardware.wifi@1.0-service.rc...
<14>[    3.824048] .(1)[1:init]init: Parsing file /vendor/etc/init/camerahalserver.rc...
<14>[    3.825320] .(1)[1:init]init: Parsing file /vendor/etc/init/fuelgauged_init.rc...
<14>[    3.826590] .(1)[1:init]init: Parsing file /vendor/etc/init/fuelgauged_nvram_init.rc...
<14>[    3.827894] .(1)[1:init]init: Parsing file /vendor/etc/init/gsm0710muxd.rc...
<14>[    3.828520] .(1)[1:init]init: Parsing file /vendor/etc/init/hostapd.android.rc...
<14>[    3.828876] .(1)[1:init]init: Parsing file /vendor/etc/init/init.bip.rc...
<14>[    3.830441] .(1)[1:init]init: Parsing file /vendor/etc/init/init.bt_drv.rc...
<14>[    3.831578] .(1)[1:init]init: Parsing file /vendor/etc/init/init.cccifsd.rc...
<14>[    3.832848] .(1)[1:init]init: Parsing file /vendor/etc/init/init.cccimdinit.rc...
<14>[    3.834165] .(1)[1:init]init: Parsing file /vendor/etc/init/init.cccirpcd.rc...
<14>[    3.835297] .(1)[1:init]init: Parsing file /vendor/etc/init/init.gps_drv.rc...
<14>[    3.836507] .(1)[1:init]init: Parsing file /vendor/etc/init/init.md_apps.rc...
<14>[    3.837655] .(1)[1:init]init: Parsing file /vendor/etc/init/init.thermal.rc...
<14>[    3.838629] .(1)[1:init]init: Parsing file /vendor/etc/init/init.thermal_manager.rc...
<14>[    3.839594] .(1)[1:init]init: Parsing file /vendor/etc/init/init.thermalloadalgod.rc...
<14>[    3.840633] .(1)[1:init]init: Parsing file /vendor/etc/init/init.volte_imcb.rc...
<14>[    3.841593] .(1)[1:init]init: Parsing file /vendor/etc/init/init.volte_imsm_93.rc...
<14>[    3.842635] .(1)[1:init]init: Parsing file /vendor/etc/init/init.volte_stack.rc...
<14>[    3.843428] .(1)[1:init]init: Parsing file /vendor/etc/init/init.volte_ua.rc...
<14>[    3.844381] .(1)[1:init]init: Parsing file /vendor/etc/init/init.vtservice.rc...
<11>[    3.844677] .(1)[1:init]init: /vendor/etc/init/init.vtservice.rc: 3: ignored duplicate definition of service 'vtservice'
<11>[    3.844698] .(1)[1:init]init: /vendor/etc/init/init.vtservice.rc: 9: ignored duplicate definition of service 'vtservice_hidl'
<14>[    3.844714] .(1)[1:init]init: Parsing file /vendor/etc/init/init.wfca.rc...
<14>[    3.845040] .(1)[1:init]init: Parsing file /vendor/etc/init/init.wlan_drv.rc...
<14>[    3.846217] .(1)[1:init]init: Parsing file /vendor/etc/init/init.wmt_drv.rc...
<14>[    3.847148] .(1)[1:init]init: Parsing file /vendor/etc/init/init.wod.rc...
<14>[    3.848220] .(1)[1:init]init: Parsing file /vendor/etc/init/init_connectivity.rc...
<14>[    3.848624] .(1)[1:init]init: Parsing file /vendor/etc/init/ipsec_mon.rc...
<14>[    3.848949] .(1)[1:init]init: Parsing file /vendor/etc/init/lbs_hidl_service.rc...
<14>[    3.849982] .(1)[1:init]init: Parsing file /vendor/etc/init/md_ctrl.rc...
<14>[    3.851013] .(1)[1:init]init: Parsing file /vendor/etc/init/mtk_agpsd.rc...
<14>[    3.852062] .(1)[1:init]init: Parsing file /vendor/etc/init/muxreport.rc...
<14>[    3.853044] .(1)[1:init]init: Parsing file /vendor/etc/init/netdagent.rc...
<14>[    3.853360] .(1)[1:init]init: Parsing file /vendor/etc/init/nvram_agent_binder.rc...
<14>[    3.853650] .(1)[1:init]init: Parsing file /vendor/etc/init/nvram_daemon.rc...
<14>[    3.853933] .(1)[1:init]init: Parsing file /vendor/etc/init/rild.rc...
<14>[    3.855045] .(1)[1:init]init: Parsing file /vendor/etc/init/statusd.rc...
<14>[    3.856003] .(1)[1:init]init: Parsing file /vendor/etc/init/sysenv_daemon.rc...
<14>[    3.856893] .(1)[1:init]init: Parsing file /vendor/etc/init/trustkernel.rc...
<14>[    3.858318] .(1)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.dfps@1.0-service.rc...
<14>[    3.859720] .(1)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.gnss@1.1-service.rc...
<14>[    3.860615] .(1)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.keymaster_attestation@1.1-service.rc...
<14>[    3.861550] .(1)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.mtkcodecservice@1.1-service.rc...
<14>[    3.862488] .(1)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc...
<14>[    3.863653] .(1)[1:init]init: Parsing file /vendor/etc/init/vendor.mediatek.hardware.pq@2.0-service.rc...
<14>[    3.864399] .(1)[1:init]init: Parsing file /vendor/etc/init/vendor.nxp.nxpnfc@1.0-service.rc...
<14>[    3.864709] .(1)[1:init]init: Parsing file /vendor/etc/init/vndservicemanager.rc...
<14>[    3.865018] .(1)[1:init]init: Parsing file /vendor/etc/init/wifi2agps.rc...
<14>[    3.865359] .(1)[1:init]init: Parsing file /odm/etc/init...
<11>[    3.865383] .(1)[1:init]init: Unable to open '/odm/etc/init': No such file or directory
<14>[    3.865579] .(1)[1:init]init: processing action (early-init) from (/init.rc:14)
<14>[    3.870421] .(1)[1:init]init: starting service 'ueventd'...
<14>[    3.871655] .(1)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.mt6763.rc:16)
<3>[    3.871761] .(1)[1:init]BOOTPROF:      3871.760239:INIT:early-init
<5>[    3.871884] .(1)[1:init][Power/PPM] (0x40)(-1)(0)(0-7)(15)(0)(4)(4) (0)(0)(4)(4) 
<6>[    3.871913] .(0)[241:hps_main]CPU request is 0xff
<5>[    3.871975] .(1)[1:init][Power/PPM] (0x40)(-1)(0)(0-7)(0)(0)(4)(4) (0)(0)(4)(4) 
<5>[    3.872071] .(1)[1:init][VcoreFS] vcore_debug: cmd: KIR_BOOTUP, val: 0
<5>[    3.872077] .(1)[1:init][VcoreFS] vcore_debug: cmd: KIR_BOOTUP, val: 0
<5>[    3.872083] .(1)[1:init][VcoreFS] MSDC AUTOK NOT FINISH
<14>[    3.872480] .(1)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.mt6763.usb.rc:1)
<14>[    3.872600] .(1)[1:init]init: processing action (early-init) from (/vendor/etc/init/hw/init.modem.rc:7)
<5>[    3.872837] .(2)[303:ueventd]random: ueventd: uninitialized urandom read (40 bytes read, 45 bits of entropy available)
<14>[    3.872950] .(1)[1:init]init: PropSet [net.perf.rps.default]=[0f] Done
<14>[    3.872982] .(1)[1:init]init: PropSet [net.perf.tether.rps]=[0f] Done
<14>[    3.873015] .(1)[1:init]init: PropSet [net.perf.tether.cpu.core]=[4,4,0,0] Done
<14>[    3.873048] .(1)[1:init]init: PropSet [net.perf.tether.cpu.freq]=[1183000,1638000,0,0] Done
<14>[    3.873076] .(1)[1:init]init: PropSet [net.perf.internal.rps]=[0f] Done
<14>[    3.873107] .(1)[1:init]init: PropSet [net.perf.internal.cpu.core]=[4,4,0,0] Done
<14>[    3.873139] .(1)[1:init]init: PropSet [net.perf.internal.cpu.freq]=[-1,-1,-1,-1] Done
<14>[    3.873182] .(1)[1:init]init: processing action (wait_for_coldboot_done) from (<Builtin Action>:0)
<14>[    3.874838] .(2)[303:ueventd]ueventd: ueventd started!
<14>[    3.874886] .(2)[303:ueventd]ueventd: Parsing file /ueventd.rc...
<14>[    3.883297] .(2)[303:ueventd]ueventd: Parsing file /vendor/ueventd.rc...
<14>[    3.886719] .(3)[303:ueventd]ueventd: Parsing file /odm/ueventd.rc...
<11>[    3.886750] .(3)[303:ueventd]ueventd: Unable to open '/odm/ueventd.rc': No such file or directory
<14>[    3.886922] .(3)[303:ueventd]ueventd: Parsing file /ueventd.mt6763.rc...
<11>[    3.886944] .(3)[303:ueventd]ueventd: Unable to open '/ueventd.mt6763.rc': No such file or directory
<14>[    3.891544] .(3)[303:ueventd]selinux: SELinux: Loaded file_contexts
<14>[    3.891544] 
<4>[    3.915311] .(4)[265:charger_thread]lifetime: data[1]=ff 
<4>[    3.916008] .(4)[265:charger_thread]lifetime: data[2]=40 
<4>[    3.916734] .(4)[265:charger_thread]lifetime: data[3]=11 
<4>[    3.917425] .(4)[265:charger_thread]lifetime: data[4]=45 
<4>[    3.918130] .(4)[265:charger_thread]lifetime: data[5]=a 
<4>[    3.918824] .(4)[265:charger_thread]lifetime: data[6]=fc 
<4>[    3.919529] .(4)[265:charger_thread]lifetime: data[7]=8 
<4>[    3.920223] .(4)[265:charger_thread]lifetime: data[8]=68 
<4>[    3.920939] .(4)[265:charger_thread]lifetime: data[9]=f7 
<4>[    3.921633] .(4)[265:charger_thread]lifetime: data[10]=18 
<4>[    3.922349] .(4)[265:charger_thread]lifetime: data[11]=0 
<4>[    3.924634] -(4)[265:charger_thread]mt6356_get_auxadc_value: 83 callbacks suppressed
<4>[    3.924639] .(4)[265:charger_thread]=====FG-MTK===== bat_vol=4341
<4>[    3.930289] .(4)[265:charger_thread]=====FG===== AC   = -6
<5>[    3.931188] .(4)[265:charger_thread]Vbat=4341,Ibat=86,I=0,VChr=4730,T=25,Soc=0:0,CT:0:0 hv:1 pd:0:0
<5>[    3.932346] .(4)[265:charger_thread][mtk_is_charger_on]info->chr_type=0 
<6>[    3.933276] .(4)[265:charger_thread]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    3.934167] .(4)[265:charger_thread]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    3.935250] .(4)[265:charger_thread]I2C structure:
<3>[    3.935250] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=2,Total_len=1
<3>[    3.935250] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    3.935250] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    3.938440] .(4)[265:charger_thread]base address 0xffffff800bf46000
<6>[    3.939247] .(4)[265:charger_thread]I2C register:
<6>[    3.939247] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=1,CONTROL=28,TRANSFER_LEN=1
<6>[    3.939247] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    3.939247] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    3.942873] .(4)[265:charger_thread]before enable DMA register(0xffffff800bf48400):
<6>[    3.942873] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    3.942873] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    3.942873] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    3.942873] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    3.946716] .(4)[265:charger_thread]DMA register(0xffffff800bf48400):
<6>[    3.946716] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    3.946716] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c04500c
<6>[    3.946716] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    3.946716] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    3.950501] .(4)[265:charger_thread]i2c_dump_info ------------------------------------------
<3>[    3.951574] .(4)[265:charger_thread]i2c i2c-2: last transfer info:
<3>[    3.952364] .(3)[303:ueventd]power_supply charger: driver failed to report `charge_type' property: -22
<3>[    3.953569] .(4)[265:charger_thread]i2c i2c-2: [00] [    3.933272] SLAVE_ADDR=d8,INTR_STAT=2,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    3.955184] .(4)[265:charger_thread]i2c i2c-2: [01] [    3.930283] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    3.956802] .(4)[265:charger_thread]i2c i2c-2: [02] [    3.929936] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    3.958406] .(4)[265:charger_thread]i2c i2c-2: [03] [    3.726704] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=500
<3>[    3.960033] .(4)[265:charger_thread]i2c i2c-2: [04] [    3.725084] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    3.961657] .(4)[265:charger_thread]i2c i2c-2: [05] [    3.724765] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    3.963266] .(4)[265:charger_thread]i2c i2c-2: [06] [    3.691068] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=500
<3>[    3.964902] .(4)[265:charger_thread]i2c i2c-2: [07] [    3.689111] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    3.966509] .(4)[265:charger_thread]i2c i2c-2: [08] [    3.688767] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    3.968132] .(4)[265:charger_thread]i2c i2c-2: [09] [    3.653407] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=32c,FIFO_STAT=cc01,DEBUGSTAT=300, tmo=499
<4>[    3.969769] .(4)[265:charger_thread][wlc_do_10s_debounce]status=0
<4>[    3.970548] .(4)[265:charger_thread][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294893278 valley_jiffies=0 topeak_jiffies=0 
<4>[    3.974558] .(5)[265:charger_thread]=====FG===== AC   = -6
<4>[    3.976048] .(5)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    3.976854] .(5)[265:charger_thread]=====FG===== TEMP = 225
<5>[    3.977568] .(5)[265:charger_thread]charger_check_status
<4>[    3.983751] .(4)[303:ueventd]=====FG===== SOC  = 100
<4>[    3.985208] .(4)[303:ueventd]=====FG===== AC   = -6
<4>[    3.986977] .(4)[303:ueventd]=====FG===== VOLT = 4328
<4>[    3.987626] .(4)[303:ueventd]=====FG===== actural VOLT = 4328
<4>[    3.988946] .(4)[303:ueventd]temp_now=225, temp_last=225 
<4>[    3.989639] .(4)[303:ueventd]=====FG===== TEMP = 225
<4>[    3.990860] .(4)[303:ueventd]=====FG===== SOC  = 100
<4>[    3.992052] .(4)[303:ueventd]bq27542_set_commands cmd = 0x12, val = 3884 
<4>[    3.993596] .(4)[303:ueventd]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    3.995020] .(4)[303:ueventd]bq27542_set_commands cmd = 0xc, val = 3998 
<14>[    4.019991] .(4)[303:ueventd]selinux: SELinux: Loaded file_contexts
<14>[    4.019991] 
<5>[    4.048581] .(3)[265:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    4.049639] .(3)[265:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    4.053817] .(3)[265:charger_thread][mtk_battery_notify_OVP_check] OVP_VBUS value=0 chr_type=0 rg cc1=5 cc2=0
<5>[    4.056715] .(0)[265:charger_thread][mtk_battery_notify_OVP_check]charger_vol(4730 mV) 
<14>[    4.508562] .(4)[303:ueventd]ueventd: Coldboot took 0.616 seconds
<14>[    4.509509] .(3)[1:init]init: Command 'wait_for_coldboot_done' action=wait_for_coldboot_done (<Builtin Action>:0) returned 0 took 636ms.
<14>[    4.511158] .(3)[1:init]init: processing action (mix_hwrng_into_linux_rng) from (<Builtin Action>:0)
<11>[    4.512369] .(3)[1:init]init: /dev/hw_random not found
<14>[    4.513065] .(3)[1:init]init: processing action (set_mmap_rnd_bits) from (<Builtin Action>:0)
<14>[    4.514898] .(3)[1:init]init: processing action (set_kptr_restrict) from (<Builtin Action>:0)
<14>[    4.516140] .(3)[1:init]init: processing action (keychord_init) from (<Builtin Action>:0)
<11>[    4.517267] .(3)[1:init]init: could not open /dev/keychord: No such file or directory
<14>[    4.518294] .(3)[1:init]init: processing action (console_init) from (<Builtin Action>:0)
<14>[    4.519442] .(3)[1:init]init: processing action (init) from (/init.rc:44)
<11>[    4.520585] .(3)[1:init]init: Unable to open '/default.prop': Too many symbolic links encountered
<3>[    4.528387] .(2)[228:kworker/2:2]CDP, timeout
<11>[    4.533091] .(3)[1:init]init: Unable to open '/proc/sys/kernel/hung_task_timeout_secs': No such file or directory
<11>[    4.534435] .(3)[1:init]init: Unable to open '/proc/cpu/alignment': No such file or directory
<5>[    4.548166] .(3)[1:init]Registered swp emulation handler
<11>[    4.549071] .(3)[1:init]init: Unable to open '/sys/class/leds/vibrator/trigger': No such file or directory
<14>[    4.550851] .(3)[1:init]init: processing action (init) from (/init.environ.rc:2)
<14>[    4.551909] .(3)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.mt6763.rc:25)
<11>[    4.556400] .(3)[1:init]init: Unable to open '/dev/cpuctl/bg_non_interactive/cpu.rt_runtime_us': No such file or directory
<14>[    4.557841] .(3)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.mt6763.rc:1148)
<14>[    4.559540] .(3)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.project.rc:5)
<14>[    4.562043] .(3)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.datalogic.rc:3)
<6>[    4.564003] .(3)[1:init][D][Factory Data](property_reload): id = 0 
<6>[    4.564904] .(3)[1:init][D][Factory Data](jprkernel_read_from_storage): +
<6>[    4.566548] .(3)[1:init][D][Factory Data](_factory_update_revision): +
<6>[    4.567387] .(3)[1:init][I][Factory Data](_factory_update_revision): Factory Data is REV3 - wrapper size 37 - data_size 304
<6>[    4.568820] .(3)[1:init][D][Factory Data](check_valid_data): +
<6>[    4.569567] .(3)[1:init][D][Factory Data](factory_data_check_crc32): +
<6>[    4.570432] .(3)[1:init][D][Factory Data](factory_data_check_crc32): factory_data: computed crc = 9270c0a5
<6>[    4.571657] .(3)[1:init][I][Factory Data](factory_data_check_crc32): CRC32 check passed!
<6>[    4.572800] .(3)[1:init][D][Factory Data](check_valid_data): OK
<6>[    4.573560] .(3)[1:init][D][Factory Data](check_valid_data): +
<6>[    4.574318] .(3)[1:init][D][Factory Data](factory_data_check_crc32): +
<6>[    4.575166] .(3)[1:init][D][Factory Data](factory_data_check_crc32): factory_data: computed crc = 9270c0a5
<6>[    4.576410] .(3)[1:init][I][Factory Data](factory_data_check_crc32): CRC32 check passed!
<6>[    4.577442] .(3)[1:init][D][Factory Data](check_valid_data): OK
<6>[    4.578211] .(3)[1:init][I][Factory Data](_factory_read_partition): OK
<6>[    4.579218] .(3)[1:init][D][Factory Ext Data](property_reload): id = 0 
<6>[    4.580066] .(3)[1:init][D][Factory Ext Data](kernel_read_from_storage): +
<6>[    4.581523] .(3)[1:init][D][Factory Ext Data](_factory_ext_update_revision): +
<6>[    4.582445] .(3)[1:init][I][Factory Ext Data](_factory_ext_update_revision): Factory Data is REV0 - wrapper size 7 - data_size 16
<6>[    4.583931] .(3)[1:init][D][Factory Ext Data](check_valid_data): +
<4>[    4.584416] -(2)[228:kworker/2:2]usb_6763_dpidle_request: 5 callbacks suppressed
<5>[    4.584421] -(2)[228:kworker/2:2][MUSB]usb_6763_dpidle_request 120: USB_DPIDLE_FORBIDDEN, skip_cnt<5>
<4>[    4.584522] -(2)[228:kworker/2:2]usb_6763_dpidle_request: 5 callbacks suppressed
<5>[    4.584525] -(2)[228:kworker/2:2][MUSB]usb_6763_dpidle_request 113: USB_DPIDLE_ALLOWED, skip_cnt<5>
<5>[    4.584529] .(2)[228:kworker/2:2][MUSB]Charger_Detect_Init 729: Charger_Detect_Init
<6>[    4.589981] .(3)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): +
<6>[    4.590917] .(3)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): factory_ext_data: computed crc = ecbb4b55
<6>[    4.592280] .(3)[1:init][I][Factory Ext Data](factory_ext_data_check_crc32): CRC32 check passed!
<6>[    4.593417] .(3)[1:init][D][Factory Ext Data](check_valid_data): OK
<6>[    4.594222] .(3)[1:init][D][Factory Ext Data](check_valid_data): +
<6>[    4.595024] .(3)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): +
<6>[    4.595957] .(3)[1:init][D][Factory Ext Data](factory_ext_data_check_crc32): factory_ext_data: computed crc = ecbb4b55
<6>[    4.597335] .(3)[1:init][I][Factory Ext Data](factory_ext_data_check_crc32): CRC32 check passed!
<6>[    4.598452] .(3)[1:init][D][Factory Ext Data](check_valid_data): OK
<6>[    4.599265] .(3)[1:init][I][Factory Ext Data](_factory_ext_read_partition): OK
<6>[    4.600199] .(3)[1:init][D][Factory Ext Data](_factory_ext_trigger_callbacks): 
<5>[    4.601153] .(3)[1:init][MUSB]factory_ext_callback_usb_data_lock 643: factory_ext_callback_usb_data_lock (id=4d, gn_boot_reason=4)
<6>[    4.602640] .(3)[1:init][D][Factory Ext Data](dl_factory_ext_callback_parse_int): -
<5>[    4.603626] .(3)[1:init][MUSB]factory_ext_callback_usb_data_lock 651: factory_ext_callback_usb_data_lock (g_factory_ext_is_usb_data_lock=0)
<5>[    4.605229] .(3)[1:init][MUSB]factory_ext_callback_usb_charge_lock 673: factory_ext_callback_usb_charge_lock (id=5d, gn_boot_reason=4)
<6>[    4.606761] .(3)[1:init][D][Factory Ext Data](dl_factory_ext_callback_parse_int): -
<5>[    4.607759] .(3)[1:init][MUSB]factory_ext_callback_usb_charge_lock 691: factory_ext_callback_usb_charge_lock (g_factory_ext_is_usb_charge_lock=0)
<5>[    4.609416] .(3)[1:init][MUSB]factory_ext_callback 636: factory_ext_callback (id=6d)
<14>[    4.610775] .(3)[1:init]init: processing action (init) from (/vendor/etc/init/hw/init.aee.rc:42)
<14>[    4.612072] .(3)[1:init]init: processing action (mix_hwrng_into_linux_rng) from (<Builtin Action>:0)
<11>[    4.613320] .(3)[1:init]init: /dev/hw_random not found
<14>[    4.614048] .(3)[1:init]init: processing action (late-init) from (/init.rc:301)
<14>[    4.615035] .(3)[1:init]init: processing action (late-init) from (/vendor/etc/init/hw/init.mt6763.rc:66)
<3>[    4.616338] .(3)[1:init]BOOTPROF:      4616.337010:INIT:late-init
<14>[    4.617455] .(5)[1:init]init: processing action (queue_property_triggers) from (<Builtin Action>:0)
<14>[    4.618695] .(5)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.mt6763.rc:101)
<3>[    4.619872] .(5)[1:init]BOOTPROF:      4619.872394:INIT:Mount_START
<14>[    4.623579] .(5)[312:init]init: [libfs_mgr]Invalid ext4 magic:0x2841 on '/dev/block/platform/bootdevice/by-name/userdata'
<11>[    4.625078] .(5)[312:init]init: [libfs_mgr]mount_with_alternatives(): skipping mount, invalid ext4, mountpoint=/data rec[2].fs_type=ext4
<11>[    4.627441] .(4)[312:init]init: [libfs_mgr]fs_mgr_mount_all(): possibly an encryptable blkdev /dev/block/platform/bootdevice/by-name/userdata for mount /data type ext4
<14>[    4.630307] .(5)[312:init]init: [libfs_mgr]superblock s_max_mnt_count:10,/dev/block/platform/bootdevice/by-name/cache
<4>[    4.632318] .(4)[312:init]EXT4-fs (mmcblk0p35): Ignoring removed nomblk_io_submit option
<6>[    4.635213] .(4)[312:init]EXT4-fs (mmcblk0p35): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.636987] .(4)[312:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/cache,/cache,ext4)=0: Success
<14>[    4.639179] .(5)[312:init]init: [libfs_mgr]check_fs(): unmount(/cache) succeeded
<14>[    4.642214] .(5)[312:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/cache
<5>[    4.655515] .(4)[315:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 51 bits of entropy available)
<5>[    4.709761] .(5)[315:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 53 bits of entropy available)
<14>[    4.724640] .(4)[312:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    4.724640] 
<14>[    4.725623] .(4)[312:init]e2fsck: cache: clean, 14/27648 files, 3570/110592 blocks (check in 2 mounts)
<14>[    4.725623] 
<6>[    4.729412] .(4)[312:init]EXT4-fs (mmcblk0p35): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<14>[    4.731016] .(4)[312:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/cache,target=/cache,type=ext4)=0: Success
<14>[    4.733543] .(5)[312:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/protect1
<4>[    4.735692] .(4)[312:init]EXT4-fs (mmcblk0p13): Ignoring removed nomblk_io_submit option
<6>[    4.738715] .(4)[312:init]EXT4-fs (mmcblk0p13): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.740943] .(5)[312:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/protect1,/vendor/protect_f,ext4)=0: Success
<14>[    4.743316] .(4)[312:init]init: [libfs_mgr]check_fs(): unmount(/vendor/protect_f) succeeded
<14>[    4.744475] .(4)[312:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/protect1
<5>[    4.747923] .(7)[321:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 54 bits of entropy available)
<5>[    4.759373] .(7)[321:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 54 bits of entropy available)
<14>[    4.767256] .(4)[312:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    4.767256] 
<14>[    4.768240] .(4)[312:init]e2fsck: /dev/block/platform/bootdevice/by-name/protect1: clean, 165/2048 files, 1268/2048 blocks
<14>[    4.768240] 
<6>[    4.772502] .(4)[312:init]EXT4-fs (mmcblk0p13): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    4.774650] .(5)[312:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/protect1,target=/vendor/protect_f,type=ext4)=0: Success
<14>[    4.777299] .(4)[312:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/protect2
<4>[    4.779467] .(5)[312:init]EXT4-fs (mmcblk0p14): Ignoring removed nomblk_io_submit option
<6>[    4.782262] .(4)[312:init]EXT4-fs (mmcblk0p14): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.784486] .(5)[312:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/protect2,/vendor/protect_s,ext4)=0: Success
<14>[    4.786857] .(4)[312:init]init: [libfs_mgr]check_fs(): unmount(/vendor/protect_s) succeeded
<14>[    4.787949] .(4)[312:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/protect2
<5>[    4.791403] .(7)[326:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 54 bits of entropy available)
<5>[    4.802748] .(7)[326:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 54 bits of entropy available)
<14>[    4.810393] .(5)[312:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    4.810393] 
<14>[    4.811377] .(5)[312:init]e2fsck: /dev/block/platform/bootdevice/by-name/protect2: clean, 16/3200 files, 1147/3191 blocks
<14>[    4.811377] 
<6>[    4.815331] .(4)[312:init]EXT4-fs (mmcblk0p14): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    4.817539] .(5)[312:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/protect2,target=/vendor/protect_s,type=ext4)=0: Success
<14>[    4.820129] .(4)[312:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/nvdata
<4>[    4.822273] .(5)[312:init]EXT4-fs (mmcblk0p11): Ignoring removed nomblk_io_submit option
<6>[    4.825813] .(4)[312:init]EXT4-fs (mmcblk0p11): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.828033] .(5)[312:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/nvdata,/vendor/nvdata,ext4)=0: Success
<14>[    4.830458] .(4)[312:init]init: [libfs_mgr]check_fs(): unmount(/vendor/nvdata) succeeded
<14>[    4.831519] .(4)[312:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/nvdata
<5>[    4.834899] .(7)[331:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 55 bits of entropy available)
<5>[    4.836579] .(2)[228:kworker/2:2][MUSB]Charger_Detect_Release 762: Charger_Detect_Release
<3>[    4.837622] .(2)[228:kworker/2:2]charger type: 2, Charging USB Host
<3>[    4.838436] .(2)[228:kworker/2:2]chrdet_inform_psy_changed: online = 1, charger type = 2
<3>[    4.839478] .(2)[228:kworker/2:2]chrdet_inform_psy_changed g_factory_ext_is_usb_charge_lock is 0 !!!
<3>[    4.839478] 
<6>[    4.840423] .(2)[228:kworker/2:2]mt_charger_set_property
<6>[    4.841126] .(2)[228:kworker/2:2]mt_charger_set_property
<3>[    4.841820] .(2)[228:kworker/2:2]dump_charger_name: charger type: 2, Charging USB Host
<5>[    4.842840] .(2)[228:kworker/2:2][MUSB]mt_usb_connect 517: issue work
<5>[    4.843684] .(2)[228:kworker/2:2][MUSB]mt_usb_connect 519: [MUSB] USB connect
<5>[    4.843703] .(5)[232:kworker/u16:4][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<5>[    4.846116] .(2)[228:kworker/2:2]mtk_charger_int_handler
<5>[    4.846230] .(7)[331:e2fsck]random: e2fsck: uninitialized urandom read (40 bytes read, 55 bits of entropy available)
<5>[    4.848155] .(2)[228:kworker/2:2]wake_up_charger
<5>[    4.848782] .(2)[228:kworker/2:2]battery_callback:1
<14>[    4.852585] .(7)[312:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    4.852585] 
<4>[    4.853455] .(2)[228:kworker/2:2]temp_now=225, temp_last=225 
<4>[    4.853459] .(2)[228:kworker/2:2]=====FG===== TEMP = 225
<14>[    4.855012] .(7)[312:init]e2fsck: /dev/block/platform/bootdevice/by-name/nvdata: clean, 422/16384 files, 2126/16384 blocks
<14>[    4.855012] 
<4>[    4.855369] .(2)[228:kworker/2:2]=====FG===== VOLT = 4328
<4>[    4.855373] .(2)[228:kworker/2:2]=====FG===== actural VOLT = 4328
<6>[    4.855380] .(2)[228:kworker/2:2]power_supply battery: power_supply_changed
<6>[    4.855391] .(2)[228:kworker/2:2]power_supply ac: power_supply_changed
<6>[    4.855398] .(2)[228:kworker/2:2]power_supply usb: power_supply_changed
<4>[    4.857029] .(2)[228:kworker/2:2]temp_now=225, temp_last=225 
<4>[    4.857033] .(2)[228:kworker/2:2]=====FG===== TEMP = 225
<4>[    4.857749] .(2)[228:kworker/2:2]temp_now=225, temp_last=225 
<4>[    4.857753] .(2)[228:kworker/2:2]=====FG===== TEMP = 225
<4>[    4.858540] .(2)[228:kworker/2:2]=====FG===== SOC  = 100
<4>[    4.859440] .(2)[228:kworker/2:2]=====FG===== AC   = -6
<4>[    4.861539] .(2)[228:kworker/2:2]=====FG===== VOLT = 4328
<4>[    4.861542] .(2)[228:kworker/2:2]=====FG===== actural VOLT = 4328
<4>[    4.862232] .(2)[228:kworker/2:2]temp_now=225, temp_last=225 
<4>[    4.862236] .(2)[228:kworker/2:2]=====FG===== TEMP = 225
<4>[    4.862980] .(2)[228:kworker/2:2]=====FG===== SOC  = 100
<4>[    4.863675] .(2)[228:kworker/2:2]bq27542_set_commands cmd = 0x12, val = 3884 
<4>[    4.864373] .(2)[228:kworker/2:2]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    4.865057] .(2)[228:kworker/2:2]bq27542_set_commands cmd = 0xc, val = 3998 
<6>[    4.874751] .(4)[312:init]EXT4-fs (mmcblk0p11): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<14>[    4.876884] .(5)[312:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/nvdata,target=/vendor/nvdata,type=ext4)=0: Success
<14>[    4.879440] .(4)[312:init]init: [libfs_mgr]superblock s_max_mnt_count:65535,/dev/block/platform/bootdevice/by-name/nvcfg
<4>[    4.881609] .(5)[312:init]EXT4-fs (mmcblk0p10): Ignoring removed nomblk_io_submit option
<6>[    4.884399] .(4)[312:init]EXT4-fs (mmcblk0p10): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.886620] .(5)[312:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/nvcfg,/vendor/nvcfg,ext4)=0: Success
<14>[    4.889002] .(4)[312:init]init: [libfs_mgr]check_fs(): unmount(/vendor/nvcfg) succeeded
<14>[    4.890053] .(4)[312:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/nvcfg
<5>[    4.892374] .(5)[68:kworker/u16:1][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<14>[    4.909728] .(4)[312:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    4.909728] 
<14>[    4.910713] .(4)[312:init]e2fsck: /dev/block/platform/bootdevice/by-name/nvcfg: clean, 18/8192 files, 1300/8192 blocks
<14>[    4.910713] 
<6>[    4.914640] .(4)[312:init]EXT4-fs (mmcblk0p10): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,commit=1,nodelalloc
<14>[    4.916793] .(5)[312:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/nvcfg,target=/vendor/nvcfg,type=ext4)=0: Success
<14>[    4.919279] .(4)[312:init]init: [libfs_mgr]superblock s_max_mnt_count:10,/dev/block/platform/bootdevice/by-name/enterprise
<4>[    4.921422] .(5)[312:init]EXT4-fs (mmcblk0p7): Ignoring removed nomblk_io_submit option
<4>[    4.925217] .(5)[312:init]EXT4-fs (mmcblk0p7): warning: maximal mount count reached, running e2fsck is recommended
<6>[    4.927037] .(4)[312:init]EXT4-fs (mmcblk0p7): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    4.928868] .(4)[312:init]init: [libfs_mgr]check_fs(): mount(/dev/block/platform/bootdevice/by-name/enterprise,/enterprise,ext4)=0: Success
<14>[    4.931286] .(5)[312:init]init: [libfs_mgr]check_fs(): unmount(/enterprise) succeeded
<14>[    4.932318] .(5)[312:init]init: [libfs_mgr]Running /system/bin/e2fsck on /dev/block/platform/bootdevice/by-name/enterprise
<5>[    4.944370] .(4)[68:kworker/u16:1][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<5>[    4.949051] .(7)[341:e2fsck]audit: type=1400 audit(1578636725.762:4): avc:  denied  { read } for  pid=341 comm="e2fsck" name="mmcblk0p7" dev="tmpfs" ino=2134 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
<5>[    4.951858] .(7)[341:e2fsck]audit: type=1400 audit(1578636725.762:5): avc:  denied  { read write } for  pid=341 comm="e2fsck" name="mmcblk0p7" dev="tmpfs" ino=2134 scontext=u:r:fsck:s0 tcontext=u:object_r:frp_block_device:s0 tclass=blk_file permissive=0
<14>[    4.955726] .(4)[312:init]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    4.955726] 
<14>[    4.956748] .(4)[312:init]e2fsck: /system/bin/e2fsck: Permission denied while trying to open /dev/block/platform/bootdevice/by-name/enterprise
<14>[    4.956748] 
<14>[    4.958585] .(4)[312:init]e2fsck: 
<14>[    4.958585] 
<14>[    4.959258] .(4)[312:init]e2fsck: You must have r/w access to the filesystem or be root
<14>[    4.959258] 
<14>[    4.960525] .(4)[312:init]e2fsck: e2fsck terminated by exit(8)
<14>[    4.960525] 
<14>[    4.961671] .(4)[312:init]init: [libfs_mgr]e2fsck returned status 0x800
<4>[    4.965708] .(5)[312:init]EXT4-fs (mmcblk0p7): warning: maximal mount count reached, running e2fsck is recommended
<6>[    4.967541] .(4)[312:init]EXT4-fs (mmcblk0p7): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,discard
<14>[    4.969112] .(4)[312:init]init: [libfs_mgr]__mount(source=/dev/block/platform/bootdevice/by-name/enterprise,target=/enterprise,type=ext4)=0: Success
<14>[    4.971781] .(5)[1:init]init: Parsing file /odm/etc/init...
<11>[    4.972591] .(5)[1:init]init: Unable to open '/odm/etc/init': No such file or directory
<14>[    4.973684] .(5)[1:init]init: Command 'mount_all /vendor/etc/fstab.mt6763' action=fs (/vendor/etc/init/hw/init.mt6763.rc:113) returned 2 took 352ms.
<14>[    4.977335] .(7)[1:init]init: starting service 'exec 1 (/system/bin/tune2fs -O has_journal -u 10010 -r 4096 /dev/block/platform/bootdevice/by-name/userdata)'...
<14>[    4.980131] .(7)[1:init]init: SVC_EXEC pid 344 (uid 0 gid 0+0 context default) started; waiting...
<14>[    5.000535] .(4)[1:init]init: Service 'exec 1 (/system/bin/tune2fs -O has_journal -u 10010 -r 4096 /dev/block/platform/bootdevice/by-name/userdata)' (pid 344) killed by signal 1 waiting took 0.024000 seconds
<3>[    5.003252] .(4)[1:init]BOOTPROF:      5003.251780:INIT:Mount_END
<6>[    5.005666] .(4)[1:init]zram0: detected capacity change from 0 to 1073741824
<14>[    5.033829] .(7)[1:init]mkswap: Swapspace size: 1048572k, UUID=de500730-7e64-48b8-8f06-78e84eadbc25
<6>[    5.035474] .(7)[1:init]Adding 1048572k swap on /dev/block/zram0.  Priority:-1 extents:1 across:1048572k SS
<14>[    5.036892] .(7)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.mt6763.rc:121)
<7>[    5.045224] .(5)[1:init]ISO 9660 Extensions: RRIP_1991A
<14>[    5.045508] .(5)[1:init]init: processing action (fs) from (/vendor/etc/init/hw/init.project.rc:10)
<14>[    5.047401] .(5)[1:init]init: processing action (fs) from (/system/etc/init/logd.rc:18)
<14>[    5.049074] .(5)[1:init]init: processing action (fs) from (/system/etc/init/wifi-events.rc:17)
<14>[    5.050244] .(5)[1:init]init: PropSet [sys.wifitracing.started]=[0] Done
<14>[    5.051161] .(5)[1:init]init: processing action (post-fs) from (/init.rc:334)
<14>[    5.053389] .(7)[1:init]init: PropSet [rild.libpath]=[mtk-ril.so] Done
<14>[    5.054243] .(7)[1:init]init: PropSet [rild.libargs]=[-d /dev/ttyC0] Done
<14>[    5.055123] .(7)[1:init]init: PropSet [wifi.interface]=[wlan0] Done
<14>[    5.055955] .(7)[1:init]init: PropSet [mediatek.wlan.ctia]=[0] Done
<14>[    5.056821] .(7)[1:init]init: PropSet [wifi.tethering.interface]=[ap0] Done
<14>[    5.057733] .(7)[1:init]init: PropSet [wifi.direct.interface]=[p2p0] Done
<4>[    5.057879] .(6)[265:charger_thread]TempToCurrent no charge on
<5>[    5.057886] .(6)[265:charger_thread][charger_routine_thread]flags=0,1 
<4>[    5.057911] .(6)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<14>[    5.061667] .(7)[1:init]init: PropSet [sys.ipo.pwrdncap]=[2] Done
<14>[    5.062546] .(7)[1:init]init: PropSet [qemu.hw.mainkeys]=[1] Done
<14>[    5.063397] .(7)[1:init]init: PropSet [sys.ipo.disable]=[1] Done
<14>[    5.064179] .(7)[1:init]init: PropSet [net.hostname]=[MEMOR10] Done
<14>[    5.065030] .(7)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[    5.066033] .(7)[1:init]init: PropSet [dalvik.vm.isa.arm64.variant]=[cortex-a53] Done
<14>[    5.067043] .(7)[1:init]init: PropSet [dalvik.vm.isa.arm64.features]=[default] Done
<14>[    5.068032] .(7)[1:init]init: PropSet [dalvik.vm.isa.arm.variant]=[cortex-a53] Done
<14>[    5.069052] .(7)[1:init]init: PropSet [dalvik.vm.isa.arm.features]=[default] Done
<14>[    5.070020] .(7)[1:init]init: PropSet [net.bt.name]=[Android] Done
<14>[    5.070825] .(7)[1:init]init: PropSet [dalvik.vm.stack-trace-dir]=[/data/anr] Done
<12>[    5.071852] .(7)[1:init]init: Couldn't load property file: Unable to open '/odm/build.prop': No such file or directory: No such file or directory
<14>[    5.074777] .(5)[1:init]init: PropSet [persist.sys.timezone]=[Asia/Shanghai] Done
<14>[    5.075798] .(5)[1:init]init: PropSet [persist.radio.default.sim]=[0] Done
<14>[    5.076724] .(5)[1:init]init: PropSet [persist.radio.erlvt.on]=[1] Done
<14>[    5.077582] .(5)[1:init]init: PropSet [camera.mdp.cz.enable]=[1] Done
<14>[    5.078419] .(5)[1:init]init: PropSet [ril.specific.sm_cause]=[0] Done
<14>[    5.079278] .(5)[1:init]init: PropSet [bgw.current3gband]=[0] Done
<14>[    5.080082] .(5)[1:init]init: PropSet [ril.external.md]=[0] Done
<11>[    5.080912] .(5)[1:init]init: property_set("ro.opengles.version", "196610") failed: property already set
<14>[    5.082129] .(5)[1:init]init: PropSet [persist.radio.fd.counter]=[150] Done
<14>[    5.083030] .(5)[1:init]init: PropSet [persist.radio.fd.off.counter]=[50] Done
<14>[    5.083964] .(5)[1:init]init: PropSet [persist.radio.fd.r8.counter]=[150] Done
<14>[    5.084920] .(5)[1:init]init: PropSet [persist.radio.fd.off.r8.counter]=[50] Done
<14>[    5.085887] .(5)[1:init]init: PropSet [drm.service.enabled]=[true] Done
<14>[    5.086745] .(5)[1:init]init: PropSet [fmradio.driver.enable]=[0] Done
<14>[    5.087601] .(5)[1:init]init: PropSet [mtk.eccci.c2k]=[enabled] Done
<14>[    5.088440] .(5)[1:init]init: PropSet [ril.first.md]=[1] Done
<14>[    5.089191] .(5)[1:init]init: PropSet [ril.flightmode.poweroffMD]=[1] Done
<14>[    5.090082] .(5)[1:init]init: PropSet [ril.telephony.mode]=[0] Done
<14>[    5.090899] .(5)[1:init]init: PropSet [dalvik.vm.mtk-stack-trace-file]=[/data/anr/mtk_traces.txt] Done
<14>[    5.092093] .(5)[1:init]init: PropSet [mediatek.wlan.chip]=[CONSYS_MT6763] Done
<14>[    5.093062] .(5)[1:init]init: PropSet [mediatek.wlan.module.postfix]=[_consys_mt6763] Done
<14>[    5.094126] .(5)[1:init]init: PropSet [ril.read.imsi]=[1] Done
<14>[    5.094888] .(5)[1:init]init: PropSet [ril.radiooff.poweroffMD]=[0] Done
<14>[    5.095787] .(5)[1:init]init: PropSet [media.settings.xml]=[/vendor/etc/media_profiles.xml] Done
<14>[    5.096989] .(5)[1:init]init: PropSet [camera.mdp.dre.enable]=[0] Done
<14>[    5.097877] .(5)[1:init]init: PropSet [bt.profiles.avrcp.multiPlayer.enable]=[0] Done
<14>[    5.098907] .(5)[1:init]init: PropSet [persist.radio.multisim.config]=[ss] Done
<14>[    5.100100] .(5)[1:init]init: PropSet [persist.radio.flashless.fsm]=[0] Done
<14>[    5.101046] .(5)[1:init]init: PropSet [persist.radio.flashless.fsm_cst]=[0] Done
<14>[    5.102001] .(5)[1:init]init: PropSet [persist.radio.flashless.fsm_rw]=[0] Done
<14>[    5.103050] .(5)[1:init]init: PropSet [telephony.lteOnCdmaDevice]=[1] Done
<14>[    5.104086] .(5)[1:init]init: PropSet [persist.sys.pms_sys_removable]=[1] Done
<14>[    5.105221] .(5)[1:init]init: PropSet [persist.service.acm.enable]=[0] Done
<14>[    5.106119] .(5)[1:init]init: PropSet [persist.vzw_device_type]=[0] Done
<14>[    5.106996] .(5)[1:init]init: PropSet [persist.mtk_ims_support]=[1] Done
<14>[    5.107867] .(5)[1:init]init: PropSet [persist.mtk_dynamic_ims_switch]=[1] Done
<14>[    5.108823] .(5)[1:init]init: PropSet [persist.mtk_mims_support]=[1] Done
<14>[    5.109699] .(5)[1:init]init: PropSet [persist.mtk_wfc_support]=[1] Done
<14>[    5.110565] .(5)[1:init]init: PropSet [persist.mtk_volte_support]=[1] Done
<14>[    5.111456] .(5)[1:init]init: PropSet [persist.mtk.volte.enable]=[1] Done
<14>[    5.112341] .(5)[1:init]init: PropSet [persist.mtk_vilte_support]=[0] Done
<14>[    5.113226] .(5)[1:init]init: PropSet [persist.mtk_viwifi_support]=[1] Done
<14>[    5.114126] .(5)[1:init]init: PropSet [persist.mtk_ussi_support]=[1] Done
<14>[    5.115010] .(5)[1:init]init: PropSet [wfd.dummy.enable]=[1] Done
<14>[    5.115801] .(5)[1:init]init: PropSet [wfd.iframesize.level]=[0] Done
<14>[    5.116647] .(5)[1:init]init: PropSet [persist.mtk.wcn.coredump.mode]=[0] Done
<14>[    5.117588] .(5)[1:init]init: PropSet [persist.mtk.wcn.combo.chipid]=[-1] Done
<14>[    5.118522] .(5)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[-1] Done
<14>[    5.119465] .(5)[1:init]init: PropSet [persist.mtk.wcn.dynamic.dump]=[0] Done
<14>[    5.120406] .(5)[1:init]init: PropSet [service.wcn.driver.ready]=[no] Done
<14>[    5.121301] .(5)[1:init]init: PropSet [persist.mtk.connsys.poweron.ctl]=[0] Done
<14>[    5.122260] .(5)[1:init]init: PropSet [persist.mtk_epdg_support]=[1] Done
<14>[    5.123149] .(5)[1:init]init: PropSet [persist.radio.mobile.data]=[0,0] Done
<14>[    5.124066] .(5)[1:init]init: PropSet [persist.meta.dumpdata]=[0] Done
<14>[    5.124934] .(5)[1:init]init: PropSet [dalvik.vm.heapgrowthlimit]=[128m] Done
<14>[    5.125855] .(5)[1:init]init: PropSet [dalvik.vm.heapsize]=[256m] Done
<14>[    5.126697] .(5)[1:init]init: PropSet [persist.radio.mtk_dsbp_support]=[1] Done
<14>[    5.127649] .(5)[1:init]init: PropSet [persist.mtk_ct_volte_support]=[1] Done
<14>[    5.128580] .(5)[1:init]init: PropSet [persist.radio.mtk_ps2_rat]=[L/W/G] Done
<14>[    5.129514] .(5)[1:init]init: PropSet [persist.radio.mtk_ps3_rat]=[G] Done
<11>[    5.131475] .(5)[1:init]init: property_set("persist,log.tag.SuppServHelper", "I") failed: bad name
<14>[    5.133330] .(5)[1:init]init: PropSet [mtk.vdec.waitkeyframeforplay]=[1] Done
<14>[    5.134267] .(5)[1:init]init: PropSet [persist.mtk.datashaping.support]=[1] Done
<14>[    5.135226] .(5)[1:init]init: PropSet [persist.datashaping.alarmgroup]=[1] Done
<14>[    5.136188] .(5)[1:init]init: PropSet [persist.duraspeed.support]=[1] Done
<14>[    5.137123] .(5)[1:init]init: PropSet [debug.sf.disable_backpressure]=[1] Done
<14>[    5.138173] .(5)[1:init]init: PropSet [Build.BRAND]=[MTK] Done
<14>[    5.138937] .(5)[1:init]init: PropSet [persist.radio.lte.chip]=[0] Done
<12>[    5.139874] .(5)[1:init]init: Couldn't load property file: Unable to open '/factory/factory.prop': No such file or directory: No such file or directory
<6>[    5.141984] .(6)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    5.143247] .(6)[265:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    5.144356] .(1)[70:kworker/1:1][SLhall]SLhall_setup_eint
<14>[    5.144504] .(4)[1:init]init: Command 'load_system_props' action=post-fs (/init.rc:340) returned 0 took 92ms.
<14>[    5.145035] .(4)[1:init]init: starting service 'logd'...
<4>[    5.145459] .(6)[265:charger_thread]=====FG===== AC   = -6
<4>[    5.146356] .(6)[265:charger_thread]=====FG===== AC   = -6
<14>[    5.146582] .(4)[1:init]init: starting service 'servicemanager'...
<14>[    5.146723] .(5)[347:init]init: Created socket '/dev/socket/logd', mode 666, user 1036, group 1036
<14>[    5.147326] .(5)[347:init]init: Created socket '/dev/socket/logdr', mode 666, user 1036, group 1036
<14>[    5.148235] .(4)[1:init]init: starting service 'hwservicemanager'...
<14>[    5.148368] .(5)[347:init]init: Created socket '/dev/socket/logdw', mode 222, user 1036, group 1036
<14>[    5.148504] .(5)[347:init]init: Opened file '/proc/kmsg', flags 0
<14>[    5.148532] .(5)[347:init]init: Opened file '/dev/kmsg', flags 1
<14>[    5.150998] .(5)[1:init]init: starting service 'vndservicemanager'...
<4>[    5.155975] .(1)[70:kworker/1:1]****Close******** 
<4>[    5.157982] .(1)[70:kworker/1:1]****mt_gpio_set_debounce,gpiopin=5, debounce=0*** 
<4>[    5.159076] .(1)[70:kworker/1:1][Hall]Hall set EINT finished, hall_irq=677, halldebounce=0 
<4>[    5.160143] -(1)[70:kworker/1:1]------------[ cut here ]------------
<4>[    5.160963] -(1)[70:kworker/1:1]WARNING: CPU: 1 PID: 70 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:605 irq_set_irq_wake+0x100/0x140()
<4>[    5.162768] -(1)[70:kworker/1:1]Unbalanced IRQ 677 wake disable
<4>[    5.163539] -(1)[70:kworker/1:1]Modules linked in: fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    5.164472] -(1)[70:kworker/1:1]CPU: 1 PID: 70 Comm: kworker/1:1 Tainted: G        W  O    4.4.95+ #2
<4>[    5.165652] -(1)[70:kworker/1:1]Hardware name: MT6763V/B (DT)
<4>[    5.166414] -(1)[70:kworker/1:1]Workqueue: hall_delay hall_delay_func
<4>[    5.166988] -(1)[70:kworker/1:1]Call trace:
<4>[    5.167539] -(1)[70:kworker/1:1][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    5.168462] -(1)[70:kworker/1:1][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    5.169340] -(1)[70:kworker/1:1][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    5.170218] -(1)[70:kworker/1:1][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    5.171205] -(1)[70:kworker/1:1][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    5.172160] -(1)[70:kworker/1:1][<ffffff800810b5b0>] irq_set_irq_wake+0x100/0x140
<4>[    5.173125] -(1)[70:kworker/1:1][<ffffff80087eccdc>] hall_delay_func+0x18c/0xa58
<4>[    5.174080] -(1)[70:kworker/1:1][<ffffff80080bda10>] process_one_work+0x1d0/0x468
<4>[    5.175045] -(1)[70:kworker/1:1][<ffffff80080bddd8>] worker_thread+0x130/0x4e0
<4>[    5.175978] -(1)[70:kworker/1:1][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    5.176835] -(1)[70:kworker/1:1][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    5.177746] -(1)[70:kworker/1:1]---[ end trace 97123305e0c7479b ]---
<4>[    5.178591] .(1)[70:kworker/1:1]Scanner_setup_eint
<4>[    5.178674] -(4)[350:init]hall for switching 10W of WLC ===****far away******** 
<4>[    5.178681] -(4)[350:init] ~~~kpd_send_wlcoff_msg slid=1!!
<4>[    5.178692] -(4)[350:init] ~~~kpd_send_wlcoff_msg slid=0!!
<4>[    5.178702] -(4)[350:init][EINT]Warn!EINT:5 run too long,s:5160149242,e:5178701396,total:18552154
<4>[    5.178804] .(4)[231:kworker/u16:3]****Open******** 
<4>[    5.178808] .(4)[231:kworker/u16:3][wc_rect_en] state=1
<4>[    5.178861] .(4)[71:kworker/4:1]charger thread chr_type diff with pmic chr_type 
<6>[    5.178870] .(4)[71:kworker/4:1]power_supply ac: power_supply_changed
<14>[    5.179745] .(6)[1:init]selinux: SELinux: Skipping restorecon_recursive(/cache)
<14>[    5.179745] 
<4>[    5.187036] .(1)[70:kworker/1:1]Scanner_Close******** 
<4>[    5.187722] .(1)[70:kworker/1:1] @@@kpd_send_Scanner_key_msg slid=1!!
<4>[    5.189763] .(1)[70:kworker/1:1]****mt_gpio_set_debounce,gpiopin=12, debounce=10000*** 
<4>[    5.190838] -(4)[243:exe_cq]Scanner_cur_gpio_state = 0 
<4>[    5.190847] .(1)[70:kworker/1:1][Scanner]Scanner set EINT finished, Scanner_irq=684, Scannerdebounce=10000 
<4>[    5.190854] .(1)[70:kworker/1:1]Buttonup_setup_eint
<4>[    5.190858] .(1)[70:kworker/1:1]****Close******** 
<4>[    5.190860] .(1)[70:kworker/1:1] $$$kpd_send_old_slid_msg slid=0!!
<4>[    5.190951] .(1)[70:kworker/1:1]****mt_gpio_set_debounce,gpiopin=71, debounce=0*** 
<4>[    5.190984] .(1)[70:kworker/1:1][Buttonup]Buttonup set EINT finished, Buttonup_irq=743, Buttonupdebounce=0 
<4>[    5.190989] .(1)[70:kworker/1:1][SLhall]SLhall_setup_eint
<4>[    5.190993] .(1)[70:kworker/1:1]****Close******** 
<4>[    5.190995] .(1)[70:kworker/1:1] ===kpd_send_old_slid_msg slid=1!!
<4>[    5.192072] .(1)[70:kworker/1:1]****mt_gpio_set_debounce,gpiopin=2, debounce=0*** 
<4>[    5.192106] .(1)[70:kworker/1:1][Hall]Hall set EINT finished, hall_irq=677, halldebounce=0 
<4>[    5.192110] .(1)[70:kworker/1:1]Scanner_right_setup_eint
<4>[    5.192113] .(1)[70:kworker/1:1]Scanner_right_Close******** 
<4>[    5.192115] .(1)[70:kworker/1:1] @@@kpd_send_Scanner_right_key_msg slid=1!!
<4>[    5.193197] .(1)[70:kworker/1:1]****mt_gpio_set_debounce,gpiopin=6, debounce=10000*** 
<4>[    5.193231] .(1)[70:kworker/1:1][Scanner]Scanner set EINT finished, Scanner_right_irq=678, Scannerrightdebounce=10000 
<4>[    5.193236] .(1)[70:kworker/1:1][wc_pmode]wc_pmode_setup_eint
<4>[    5.193240] .(1)[70:kworker/1:1]****Close******** 
<4>[    5.194314] .(1)[70:kworker/1:1]****mt_gpio_set_debounce,gpiopin=9, debounce=0*** 
<4>[    5.194344] .(1)[70:kworker/1:1][wc_pmode]wc_pmode set EINT finished, hall_irq=681, halldebounce=0 
<4>[    5.194349] -(1)[70:kworker/1:1]------------[ cut here ]------------
<4>[    5.194351] -(1)[70:kworker/1:1]WARNING: CPU: 1 PID: 70 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:605 irq_set_irq_wake+0x100/0x140()
<4>[    5.194359] -(1)[70:kworker/1:1]Unbalanced IRQ 681 wake disable
<4>[    5.194367] -(1)[70:kworker/1:1]Modules linked in: fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    5.194370] -(1)[70:kworker/1:1]CPU: 1 PID: 70 Comm: kworker/1:1 Tainted: G        W  O    4.4.95+ #2
<4>[    5.194373] -(1)[70:kworker/1:1]Hardware name: MT6763V/B (DT)
<4>[    5.194384] -(1)[70:kworker/1:1]Workqueue: hall_delay hall_delay_func
<4>[    5.194385] -(1)[70:kworker/1:1]Call trace:
<4>[    5.194386] -(1)[70:kworker/1:1][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    5.194392] -(1)[70:kworker/1:1][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    5.194396] -(1)[70:kworker/1:1][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    5.194402] -(1)[70:kworker/1:1][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    5.194407] -(1)[70:kworker/1:1][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    5.194412] -(1)[70:kworker/1:1][<ffffff800810b5b0>] irq_set_irq_wake+0x100/0x140
<4>[    5.194416] -(1)[70:kworker/1:1][<ffffff80087ed2ec>] hall_delay_func+0x79c/0xa58
<4>[    5.194420] -(1)[70:kworker/1:1][<ffffff80080bda10>] process_one_work+0x1d0/0x468
<4>[    5.194425] -(1)[70:kworker/1:1][<ffffff80080bddd8>] worker_thread+0x130/0x4e0
<4>[    5.194430] -(1)[70:kworker/1:1][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    5.194434] -(1)[70:kworker/1:1][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    5.194439] -(1)[70:kworker/1:1]---[ end trace 97123305e0c7479c ]---
<4>[    5.228417] -(4)[243:exe_cq]Scanner left key release up******** 
<4>[    5.229195] -(4)[243:exe_cq] @@@kpd_send_Scanner_key_msg slid=0!!
<4>[    5.229995] -(4)[243:exe_cq][EINT]Warn!EINT:12 run too long,s:5190832549,e:5229994319,total:39161770
<4>[    5.231172] -(0)[0:swapper/0]hall for pistol ===****far away******** 
<4>[    5.231229] -(4)[243:exe_cq]Latch****Close******** 
<4>[    5.231233] -(4)[243:exe_cq] $$$kpd_send_old_slid_msg slid=0!!
<4>[    5.233398] -(0)[0:swapper/0] ===kpd_send_old_slid_msg slid=0!!
<4>[    5.234171] -(0)[0:swapper/0][EINT]Warn!EINT:2 run too long,s:5231168165,e:5234170627,total:3002462
<4>[    5.235329] -(0)[0:swapper/0]Scanner_right_cur_gpio_state = 0 
<4>[    5.236088] -(0)[0:swapper/0]Scanner right key release up******** 
<4>[    5.236889] -(0)[0:swapper/0] @@@kpd_send_Scanner_right_key_msg slid=0!!
<4>[    5.237762] -(0)[0:swapper/0]appear eint for closing otg when WLC ****High******** 
<14>[    5.238902] .(5)[1:init]selinux: SELinux: Skipping restorecon_recursive(/enterprise)
<14>[    5.238902] 
<14>[    5.240213] .(5)[1:init]init: Command 'restorecon_recursive /enterprise' action=post-fs (/init.rc:398) returned 0 took 51ms.
<14>[    5.243885] .(5)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.mt6763.rc:125)
<3>[    5.245277] .(5)[1:init]BOOTPROF:      5245.276396:INIT:post-fs
<14>[    5.247077] .(5)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.mt6763.usb.rc:4)
<14>[    5.248441] .(5)[1:init]init: PropSet [sys.usb.vid]=[0x0E8D] Done
<6>[    5.252290] .(5)[1:init]gadgets_make name=g1
<6>[    5.255504] .(5)[1:init]function_make name=accessory.gs2
<4>[    5.256393] .(6)[265:charger_thread]lifetime: data[0]=df 
<4>[    5.257094] .(6)[265:charger_thread]lifetime: data[1]=ff 
<4>[    5.257795] .(6)[265:charger_thread]lifetime: data[2]=40 
<6>[    5.257917] .(5)[1:init]function_make name=audio_source.gs3
<6>[    5.258556] .(5)[1:init]function_make name=ffs.adb
<6>[    5.258584] .(5)[1:init]file system registered
<6>[    5.259077] .(5)[1:init]function_make name=mtp.gs0
<6>[    5.259684] .(5)[1:init]interf_grp_compatible_id_store ext_compat_id=MTP
<6>[    5.260163] .(5)[1:init]function_make name=ptp.gs1
<6>[    5.260772] .(5)[1:init]function_make name=rndis.gs4
<4>[    5.260819] .(5)[1:init]using random self ethernet address
<4>[    5.260823] .(5)[1:init]using random host ethernet address
<6>[    5.261391] .(5)[1:init]function_make name=midi.gs5
<6>[    5.262009] .(5)[1:init]function_make name=acm.gs0
<6>[    5.262117] .(5)[1:init]acm_alloc_instance opts->port_num=0
<6>[    5.262637] .(5)[1:init]function_make name=acm.gs1
<6>[    5.262745] .(5)[1:init]acm_alloc_instance opts->port_num=1
<6>[    5.263276] .(5)[1:init]function_make name=acm.gs2
<6>[    5.263392] .(5)[1:init]acm_alloc_instance opts->port_num=2
<6>[    5.263961] .(5)[1:init]function_make name=acm.gs3
<6>[    5.264073] .(5)[1:init]acm_alloc_instance opts->port_num=3
<6>[    5.264681] .(5)[1:init]function_make name=mass_storage.usb0
<6>[    5.264701] .(5)[1:init]Mass Storage Function, version: 2009/09/11
<6>[    5.264705] .(5)[1:init]LUN: removable file: (no medium)
<6>[    5.265132] .(5)[1:init]function_make name=hid.gs0
<6>[    5.265555] .(5)[1:init]function_make name=via_modem.gs0
<6>[    5.265784] .(5)[1:init]function_make name=via_ets.gs0
<6>[    5.265973] .(5)[1:init]function_make name=via_atc.gs0
<6>[    5.266138] .(5)[1:init]config_desc_make name=b.1
<6>[    5.266430] .(5)[1:init]os_desc_b_vendor_code_store Vendor Code=1
<14>[    5.266962] .(5)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.datalogic.rc:42)
<14>[    5.267098] .(5)[1:init]init: processing action (post-fs) from (/vendor/etc/init/hw/init.aee.rc:12)
<14>[    5.267405] .(5)[1:init]init: starting service 'aee_aed'...
<38>[    5.268738] .(5)[347:logd]logd.auditd: start
<14>[    5.269693] .(7)[1:init]init: starting service 'aee_aed64'...
<14>[    5.272018] .(7)[1:init]init: starting service 'aee_aedv'...
<14>[    5.273782] .(7)[1:init]init: starting service 'aee_aedv64'...
<14>[    5.275126] .(7)[1:init]init: processing action (post-fs) from (/system/etc/init/atrace.rc:3)
<7>[    5.277714] .(7)[1:init][ftrace]tracing_on is toggled to 0
<11>[    5.277783] .(7)[1:init]init: Unable to open '/sys/kernel/tracing/tracing_on': No such file or directory
<14>[    5.277897] .(7)[1:init]init: processing action (post-fs) from (/vendor/etc/init/trustkernel.rc:1)
<3>[    5.277987] .(7)[1:init]BOOTPROF:      5277.986704:tkcore: prep SYSTA
<14>[    5.284942] .(5)[1:init]init: starting service 'teed'...
<14>[    5.286424] .(5)[1:init]init: processing action (late-fs) from (/init.rc:412)
<4>[    5.289941] .(6)[265:charger_thread]lifetime: data[3]=11 
<4>[    5.290766] .(6)[265:charger_thread]lifetime: data[4]=45 
<14>[    5.290922] .(7)[1:init]init: starting service 'keymaster-3-0'...
<14>[    5.292275] .(7)[1:init]init: processing action (post-fs-data) from (/init.rc:420)
<4>[    5.292423] .(5)[265:charger_thread]lifetime: data[5]=a 
<4>[    5.292426] .(5)[265:charger_thread]lifetime: data[6]=fc 
<4>[    5.292428] .(5)[265:charger_thread]lifetime: data[7]=8 
<4>[    5.292430] .(5)[265:charger_thread]lifetime: data[8]=68 
<4>[    5.292431] .(5)[265:charger_thread]lifetime: data[9]=f7 
<4>[    5.292433] .(5)[265:charger_thread]lifetime: data[10]=18 
<4>[    5.292435] .(5)[265:charger_thread]lifetime: data[11]=0 
<4>[    5.294522] -(6)[265:charger_thread]mt6356_get_auxadc_value: 4 callbacks suppressed
<4>[    5.294538] .(6)[265:charger_thread]=====FG-MTK===== bat_vol=4317
<4>[    5.300508] .(6)[265:charger_thread]=====FG===== AC   = -6
<5>[    5.301504] .(6)[265:charger_thread]Vbat=4317,Ibat=-6,I=0,VChr=4730,T=25,Soc=0:0,CT:2:0 hv:1 pd:0:0
<14>[    5.301670] .(7)[1:init]init: starting service 'vold'...
<14>[    5.303643] .(5)[363:init]init: Created socket '/dev/socket/vold', mode 660, user 0, group 1009
<5>[    5.304429] .(6)[265:charger_thread][mtk_is_charger_on]info->chr_type=0 
<5>[    5.304441] .(6)[265:charger_thread]mtk_charger_plug_in plug in, type:2
<5>[    5.304447] .(6)[265:charger_thread]battery_callback:1
<11>[    5.305106] .(7)[1:init]init: Unable to open '/data/system/entropy.dat': No such file or directory
<11>[    5.306980] .(7)[1:init]init: Unable to open '/data/misc/recovery/ro.build.fingerprint': No such file or directory
<4>[    5.307254] .(6)[265:charger_thread]=====FG===== AC   = -6
<11>[    5.307848] .(7)[1:init]init: Unable to open '/data/misc/recovery/proc/version': No such file or directory
<4>[    5.309457] .(6)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    5.309464] .(6)[265:charger_thread]=====FG===== TEMP = 225
<4>[    5.311728] .(6)[265:charger_thread]=====FG===== VOLT = 4328
<4>[    5.311734] .(6)[265:charger_thread]=====FG===== actural VOLT = 4328
<6>[    5.311742] .(6)[265:charger_thread]power_supply battery: power_supply_changed
<6>[    5.311821] .(6)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_plug_in
<6>[    5.311826] .(6)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_enable_wdt: en = 1
<4>[    5.312016] .(6)[265:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    5.312877] .(6)[256:kworker/6:1]temp_now=225, temp_last=225 
<4>[    5.312884] .(6)[256:kworker/6:1]=====FG===== TEMP = 225
<4>[    5.313435] .(6)[256:kworker/6:1]temp_now=225, temp_last=225 
<4>[    5.313442] .(6)[256:kworker/6:1]=====FG===== TEMP = 225
<4>[    5.314051] .(6)[256:kworker/6:1]=====FG===== SOC  = 100
<4>[    5.314895] .(6)[256:kworker/6:1]=====FG===== AC   = -6
<4>[    5.316758] .(6)[256:kworker/6:1]=====FG===== VOLT = 4328
<4>[    5.316768] .(6)[256:kworker/6:1]=====FG===== actural VOLT = 4328
<4>[    5.318814] .(6)[256:kworker/6:1]temp_now=225, temp_last=225 
<4>[    5.318822] .(6)[256:kworker/6:1]=====FG===== TEMP = 225
<4>[    5.319550] .(6)[256:kworker/6:1]=====FG===== SOC  = 100
<4>[    5.320134] .(6)[256:kworker/6:1]bq27542_set_commands cmd = 0x12, val = 3884 
<4>[    5.320750] .(6)[256:kworker/6:1]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    5.321391] .(6)[256:kworker/6:1]bq27542_set_commands cmd = 0xc, val = 3998 
<4>[    5.325207] .(4)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    5.325214] .(4)[265:charger_thread]=====FG===== TEMP = 225
<5>[    5.325217] .(4)[265:charger_thread]charger_check_status
<14>[    5.340054] .(5)[363:init]init: Created socket '/dev/socket/cryptd', mode 660, user 0, group 1009
<5>[    5.368112] .(4)[265:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<14>[    5.369846] .(7)[1:init]init: starting service 'exec 2 (/system/bin/vdc --wait cryptfs init_user0)'...
<5>[    5.370849] .(6)[265:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[    5.370862] .(6)[265:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<14>[    5.375303] .(7)[1:init]init: SVC_EXEC pid 365 (uid 0 gid 0+0 context default) started; waiting...
<6>[    5.376693] .(5)[265:charger_thread]i2c i2c-2: addr: 55, transfer ACK error
<14>[    5.377740] .(7)[1:init]init: PropSet [persist.mtk.aee.mode]=[4] Done
<6>[    5.377809] .(5)[265:charger_thread]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    5.377813] .(5)[265:charger_thread]I2C structure:
<3>[    5.377813] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=2,Total_len=2
<3>[    5.377813] [I2C]Trans_len=2,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    5.377813] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    5.377819] .(5)[265:charger_thread]base address 0xffffff800bf46000
<6>[    5.377828] .(5)[265:charger_thread]I2C register:
<6>[    5.377828] [I2C]SLAVE_ADDR=aa,INTR_MASK=0,INTR_STAT=1,CONTROL=28,TRANSFER_LEN=2
<6>[    5.377828] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    5.377828] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    5.377834] .(5)[265:charger_thread]before enable DMA register(0xffffff800bf48400):
<6>[    5.377834] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    5.377834] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    5.377834] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    5.377834] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    5.377844] .(5)[265:charger_thread]DMA register(0xffffff800bf48400):
<6>[    5.377844] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    5.377844] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c04500c
<6>[    5.377844] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    5.377844] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    5.377849] .(5)[265:charger_thread]i2c_dump_info ------------------------------------------
<3>[    5.377854] .(5)[265:charger_thread]i2c i2c-2: last transfer info:
<3>[    5.377857] .(5)[265:charger_thread]i2c i2c-2: [00] [    5.376681] SLAVE_ADDR=aa,INTR_STAT=2,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    5.377861] .(5)[265:charger_thread]i2c i2c-2: [01] [    5.376407] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=499
<3>[    5.377866] .(5)[265:charger_thread]i2c i2c-2: [02] [    5.325182] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=499
<3>[    5.377870] .(5)[265:charger_thread]i2c i2c-2: [03] [    5.322767] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.377875] .(5)[265:charger_thread]i2c i2c-2: [04] [    5.321380] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.377879] .(5)[265:charger_thread]i2c i2c-2: [05] [    5.321005] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.377883] .(5)[265:charger_thread]i2c i2c-2: [06] [    5.320737] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.377888] .(5)[265:charger_thread]i2c i2c-2: [07] [    5.320401] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    5.377892] .(5)[265:charger_thread]i2c i2c-2: [08] [    5.320113] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.377896] .(5)[265:charger_thread]i2c i2c-2: [09] [    5.319748] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<4>[    5.377930] .(5)[265:charger_thread]fg_27542_write_byte failed ret = -121 
<4>[    5.377948] .(5)[265:charger_thread]random message:ae 
<4>[    5.378613] .(5)[265:charger_thread]random message:33 
<4>[    5.378886] .(5)[265:charger_thread]random message:c8 
<4>[    5.379688] .(5)[265:charger_thread]random message:4c 
<4>[    5.380035] .(5)[265:charger_thread]random message:b4 
<4>[    5.380384] .(5)[265:charger_thread]random message:cd 
<4>[    5.380762] .(5)[265:charger_thread]random message:17 
<4>[    5.381080] .(5)[265:charger_thread]random message:eb 
<4>[    5.381404] .(5)[265:charger_thread]random message:70 
<4>[    5.381723] .(5)[265:charger_thread]random message:c2 
<4>[    5.382042] .(5)[265:charger_thread]random message:f0 
<4>[    5.382365] .(5)[265:charger_thread]random message:4c 
<4>[    5.382687] .(5)[265:charger_thread]random message:43 
<4>[    5.383761] .(5)[265:charger_thread]random message:f 
<4>[    5.384107] .(5)[265:charger_thread]random message:ed 
<4>[    5.384426] .(5)[265:charger_thread]random message:8b 
<4>[    5.384751] .(5)[265:charger_thread]random message:f1 
<4>[    5.385156] .(5)[265:charger_thread]random message:fb 
<4>[    5.385478] .(5)[265:charger_thread]random message:58 
<4>[    5.385812] .(5)[265:charger_thread]random message:91 
<36>[    5.415363] .(5)[364:logd.auditd]type=1400 audit(1578636726.226:6): avc: denied { write } for pid=361 comm="teed" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<14>[    5.431193] .(7)[1:init]init: PropSet [persist.aee.core.dump]=[disable] Done
<14>[    5.432739] .(7)[1:init]init: PropSet [persist.aee.core.dump]=[disable] Done
<14>[    5.434024] .(7)[1:init]init: PropSet [persist.aee.core.direct]=[disable] Done
<6>[    5.434090] .(4)[349:hwservicemanage]binder: 349:349 ioctl 620a 7fe0fa30c0 returned -22
<14>[    5.436358] .(7)[1:init]init: PropSet [persist.aee.core.direct]=[disable] Done
<14>[    5.437764] .(7)[1:init]init: PropSet [hwservicemanager.ready]=[true] Done
<14>[    5.438918] .(7)[1:init]init: PropSet [persist.aee.fatal_db.count]=[4] Done
<14>[    5.440177] .(7)[1:init]init: PropSet [persist.aee.fatal_db.count]=[4] Done
<14>[    5.441472] .(7)[1:init]init: PropSet [persist.aee.db.count]=[4] Done
<14>[    5.442652] .(7)[1:init]init: PropSet [persist.aee.db.count]=[4] Done
<14>[    5.443878] .(7)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[    5.445101] .(7)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<36>[    5.451388] .(6)[364:logd.auditd]type=1400 audit(1578636726.226:11): avc: denied { write } for pid=361 comm="teed" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0 duplicate messages suppressed
<36>[    5.454446] .(6)[364:logd.auditd]type=1400 audit(1578636726.262:12): avc: denied { write } for pid=361 comm="tkearlyinit" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.471420] .(7)[364:logd.auditd]type=1400 audit(1578636726.282:13): avc: denied { write } for pid=361 comm="tkearlyinit" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.474161] .(7)[364:logd.auditd]type=1400 audit(1578636726.282:14): avc: denied { write } for pid=361 comm="teed" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.477111] .(7)[364:logd.auditd]type=1400 audit(1578636726.282:17): avc: denied { write } for pid=361 comm="teed" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0 duplicate messages suppressed
<36>[    5.480104] .(7)[364:logd.auditd]type=1400 audit(1578636726.282:18): avc: denied { write } for pid=361 comm="tkuinit" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<4>[    5.480526] .(2)[228:kworker/2:2]tx_close_wlc_setup_eint
<4>[    5.480548] .(2)[228:kworker/2:2]****High******** 
<4>[    5.480892] .(2)[228:kworker/2:2]****mt_gpio_set_debounce,gpiopin=86, debounce=128000*** 
<4>[    5.481006] .(2)[228:kworker/2:2][tx_close_wlc]tx_close_wlc set EINT finished, tx_close_wlc_irq=758, tx_close_wlcdebounce=128000 
<36>[    5.486937] .(7)[364:logd.auditd]type=1400 audit(1578636726.286:19): avc: denied { write } for pid=361 comm="tkuinit" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.489654] .(7)[364:logd.auditd]type=1400 audit(1578636726.286:20): avc: denied { write } for pid=361 comm="teed" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<4>[    5.496235] .(5)[265:charger_thread]data[0]: 8 
<4>[    5.496874] .(5)[265:charger_thread]data[1]: 41 
<4>[    5.497473] .(5)[265:charger_thread]data[2]: 43 
<4>[    5.498080] .(5)[265:charger_thread]data[3]: 92 
<4>[    5.498687] .(5)[265:charger_thread]data[4]: c 
<4>[    5.499283] .(5)[265:charger_thread]data[5]: a0 
<4>[    5.499891] .(5)[265:charger_thread]data[6]: de 
<4>[    5.500550] .(5)[265:charger_thread]data[7]: 13 
<4>[    5.501152] .(5)[265:charger_thread]data[8]: 8 
<4>[    5.501747] .(5)[265:charger_thread]data[9]: 97 
<4>[    5.502355] .(5)[265:charger_thread]data[10]: f0 
<4>[    5.502973] .(5)[265:charger_thread]data[11]: fa 
<4>[    5.503591] .(5)[265:charger_thread]data[12]: bc 
<4>[    5.504209] .(5)[265:charger_thread]data[13]: 71 
<4>[    5.504852] .(5)[265:charger_thread]data[14]: 7d 
<4>[    5.505469] .(5)[265:charger_thread]data[15]: c3 
<4>[    5.506092] .(5)[265:charger_thread]result: b247f81f, c37d71bc, faf09708, 13dea00c, 92434108 
<4>[    5.507182] .(5)[265:charger_thread]SHA-1 check passed
<5>[    5.507857] .(5)[265:charger_thread]mtk_switch_charging_run [1 0], timer=0
<3>[    5.516183] .(7)[361:teed]Invalid vma->vm_private_data [teed:361:361]
<3>[    5.521794] .(6)[362:android.hardwar]misc tkcoredrv: tee_session_create_and_open: ERROR ret=0 (err=0xffff0000, org=2,  sessid=0x00000054)
<36>[    5.523717] .(5)[364:logd.auditd]type=1400 audit(1578636726.330:23): avc: denied { write } for pid=361 comm="teed" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0 duplicate messages suppressed
<14>[    5.526285] .(6)[1:init]init: PropSet [vold.has_adoptable]=[1] Done
<14>[    5.526644] .(7)[1:init]init: PropSet [vold.has_quota]=[1] Done
<36>[    5.528839] .(5)[364:logd.auditd]type=1400 audit(1578636726.334:24): avc: denied { write } for pid=362 comm="android.hardwar" name="/" dev="tmpfs" ino=2155 scontext=u:r:hal_keymaster_default:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<14>[    5.536661] .(7)[1:init]init: Service 'exec 2 (/system/bin/vdc --wait cryptfs init_user0)' (pid 365) exited with status 0 waiting took 0.167000 seconds
<5>[    5.554140] .(4)[265:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:25,39,16 pps:0 en:0 ibus:0 80
<5>[    5.555347] .(4)[265:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[    5.556430] .(4)[265:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<5>[    5.559093] .(4)[265:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<14>[    5.560132] .(7)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[    5.560873] .(7)[1:init]init: starting service 'exec 3 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)'...
<14>[    5.561981] .(7)[1:init]init: SVC_EXEC pid 372 (uid 1000 gid 1000+0 context default) started; waiting...
<14>[    5.562294] .(7)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[    5.562450] .(7)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<14>[    5.563507] .(5)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    5.563853] .(5)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[    5.564693] .(5)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[dumping] Done
<4>[    5.566236] .(1)[373:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<4>[    5.569332] .(1)[373:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<4>[    5.570429] .(7)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.571774] .(7)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<14>[    5.571916] .(4)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<4>[    5.574015] .(7)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    5.575598] .(4)[265:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=1 mtk_charger_hall_1_eint=0
<4>[    5.577487] .(5)[265:charger_thread]cc1=5 cc2=0
<14>[    5.577507] .(4)[1:init]init: Service 'exec 3 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)' (pid 372) exited with status 0 waiting took 0.017000 seconds
<14>[    5.577677] .(4)[1:init]init: processing action (post-fs-data) from (/init.usb.rc:6)
<14>[    5.579620] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.mt6763.rc:157)
<3>[    5.579718] .(4)[1:init]BOOTPROF:      5579.716781:INIT:post-fs-data
<11>[    5.579967] .(4)[1:init]init: Unable to open '/sys/block/sdc/queue/iostats': No such file or directory
<11>[    5.579992] .(4)[1:init]init: Unable to open '/sys/block/sdc/queue/read_ahead_kb': No such file or directory
<11>[    5.580013] .(4)[1:init]init: Unable to open '/sys/block/sdc/queue/nr_requests': No such file or directory
<14>[    5.580403] .(4)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvcfg)
<14>[    5.580403] 
<14>[    5.584212] .(7)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvdata)
<14>[    5.584212] 
<6>[    5.589548] .(5)[265:charger_thread]power_supply ac: power_supply_changed
<6>[    5.590461] .(5)[265:charger_thread]power_supply usb: power_supply_changed
<4>[    5.592211] .(5)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    5.593077] .(5)[265:charger_thread]=====FG===== TEMP = 225
<4>[    5.595014] .(5)[265:charger_thread]=====FG===== VOLT = 4328
<4>[    5.595757] .(5)[265:charger_thread]=====FG===== actural VOLT = 4328
<4>[    5.597262] .(5)[265:charger_thread]=====FG===== AC   = -6
<4>[    5.598540] .(5)[265:charger_thread]=====FG===== SOC  = 100
<4>[    5.599930] .(5)[265:charger_thread]=====FG===== SOH  = 100
<4>[    5.600691] .(5)[265:charger_thread]DLCP bat_vol=4328,  temperature=225  
<4>[    5.601564] .(5)[265:charger_thread] ===CC_value from battery temprature=2000000
<4>[    5.602520] .(5)[265:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<14>[    5.603412] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.connectivity.rc:3)
<4>[    5.604855] .(5)[265:charger_thread]DLCP mt6370_set_vrech       = 300
<4>[    5.606139] .(5)[265:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[    5.607010] .(5)[265:charger_thread]DLCP read cv              = 4350000
<4>[    5.607862] .(5)[265:charger_thread]DLCP read eoc             = 150000
<14>[    5.608572] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.project.rc:15)
<4>[    5.609989] .(5)[265:charger_thread]DLCP read recharge        = 300
<14>[    5.610028] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.aee.rc:1)
<4>[    5.612001] .(5)[265:charger_thread]DLCP Target Temp          = 410
<4>[    5.612848] .(5)[265:charger_thread]DLCP Charge Current       = 2000
<14>[    5.613153] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.sensor_1_0.rc:2)
<4>[    5.614949] .(5)[265:charger_thread]DLPID 
<4>[    5.615491] .(5)[265:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<14>[    5.616463] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.modem.rc:19)
<3>[    5.616557] .(7)[1:init]BOOTPROF:      5616.556551:post-fs-data: on modem start
<14>[    5.616658] .(7)[1:init]init: PropSet [vold.post_fs_data_done]=[1] Done
<14>[    5.616676] .(7)[1:init]init: processing action (post-fs-data) from (/system/etc/init/bootstat.rc:3)
<14>[    5.617992] .(7)[1:init]init: processing action (post-fs-data) from (/system/etc/init/mobile_log_d.rc:1)
<14>[    5.618720] .(7)[1:init]init: processing action (post-fs-data) from (/system/etc/init/sn.rc:1)
<14>[    5.619032] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc:1)
<14>[    5.619369] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hostapd.android.rc:9)
<14>[    5.619611] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccifsd.rc:5)
<14>[    5.619715] .(7)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_f)
<14>[    5.619715] 
<14>[    5.619781] .(7)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_s)
<14>[    5.619781] 
<14>[    5.619798] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccimdinit.rc:4)
<14>[    5.621909] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.wod.rc:1)
<14>[    5.624082] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/mtk_agpsd.rc:1)
<14>[    5.624656] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/statusd.rc:1)
<14>[    5.625147] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/trustkernel.rc:7)
<3>[    5.625221] .(7)[1:init]BOOTPROF:      5625.220474:tkcore: prep SFS
<3>[    5.625817] .(7)[1:init]BOOTPROF:      5625.816243:tkcore: prep PP
<3>[    5.628146] .(7)[1:init]BOOTPROF:      5628.144781:tkcore: prep SPTA
<14>[    5.629061] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc:1)
<14>[    5.633024] .(7)[1:init]init: processing action (load_persist_props_action) from (/init.rc:291)
<14>[    5.633490] .(7)[1:init]init: starting service 'logd-reinit'...
<14>[    5.634805] .(7)[1:init]init: processing action (firmware_mounts_complete) from (/init.rc:297)
<14>[    5.634967] .(7)[1:init]init: processing action (early-boot) from (/system/etc/init/installd.rc:5)
<4>[    5.643850] .(5)[265:charger_thread]DLPID PID Target Temp = 410 
<4>[    5.644647] .(5)[265:charger_thread]DLPID Battery Temp    = 225 
<4>[    5.645421] .(5)[265:charger_thread]DLPID TEMP DIFF       = 92 
<4>[    5.646190] .(5)[265:charger_thread]DLPID PID KI          = 5000 
<4>[    5.646981] .(5)[265:charger_thread]DLPID CC MAX          = 2000000 
<4>[    5.647805] .(5)[265:charger_thread]DLPID PID Current     = 500000 
<4>[    5.648635] .(5)[265:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[    5.649607] .(5)[265:charger_thread]DLCP ccurrent from battery temprature = 2000000
<4>[    5.650592] .(5)[265:charger_thread]DLCP ccurrent from PID algorithm      = 500000
<4>[    5.651568] .(5)[265:charger_thread]DLCP ccurrent from DLPL               = 2000000
<30>[    5.652554] .(4)[352:logd.daemon]logd.daemon: reinit
<4>[    5.653213] .(5)[265:charger_thread]DLCP set input current:500000 
<14>[    5.653415] .(7)[1:init]init: PropSet [log.tag]=[I] Done
<31>[    5.654603] .(4)[352:logd.daemon]logd: logd no log reader, set log level to INFO!
<14>[    5.654808] .(7)[1:init]init: Service 'logd-reinit' (pid 374) exited with status 0
<4>[    5.655834] .(5)[265:charger_thread]DLCP set charge current: 500000 
<14>[    5.657010] .(7)[1:init]init: processing action (boot) from (/init.rc:603)
<4>[    5.658225] .(5)[265:charger_thread]DLCP __mt6370_set_ieoc      = 250000
<11>[    5.658775] .(7)[1:init]init: Unable to open '/proc/sys/vm/min_free_order_shift': No such file or directory
<4>[    5.660659] .(5)[265:charger_thread]DLCP mt6370_enable_charging :1 
<14>[    5.661196] .(7)[1:init]init: PropSet [net.tcp.default_init_rwnd]=[60] Done
<4>[    5.662635] .(4)[265:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<14>[    5.663061] .(7)[1:init]init: starting service 'hidl_memory'...
<4>[    5.664557] .(4)[265:charger_thread]DLCP __mt6370_set_cv       = 4350000
<14>[    5.664713] .(7)[1:init]init: starting service 'vtservice_hidl'...
<4>[    5.666465] .(4)[265:charger_thread]DLCP mt6370_enable_charging :1 
<14>[    5.666664] .(7)[1:init]init: starting service 'audio-hal-2-0'...
<14>[    5.668710] .(7)[1:init]init: starting service 'bluetooth-1-0'...
<14>[    5.670956] .(5)[376:init]init: Created socket '/dev/socket/volte_vt', mode 660, user 0, group 1000
<14>[    5.671469] .(7)[1:init]init: starting service 'broadcastradio-hal'...
<14>[    5.673426] .(7)[1:init]init: starting service 'cas-hal-1-0'...
<14>[    5.676101] .(7)[1:init]init: starting service 'configstore-hal-1-0'...
<14>[    5.679116] .(7)[1:init]init: starting service 'drm-hal-1-0'...
<14>[    5.682036] .(7)[1:init]init: starting service 'drm-widevine-hal-1-0'...
<14>[    5.685200] .(7)[1:init]init: starting service 'gatekeeper-1-0'...
<14>[    5.688118] .(7)[1:init]init: starting service 'gralloc-2-0'...
<14>[    5.690967] .(7)[1:init]init: starting service 'hwcomposer-2-1'...
<14>[    5.694138] .(7)[1:init]init: starting service 'light-hal-2-0'...
<14>[    5.696884] .(7)[1:init]init: starting service 'memtrack-hal-1-0'...
<14>[    5.699774] .(7)[1:init]init: starting service 'thermal-hal-1-0'...
<14>[    5.703207] .(7)[1:init]init: starting service 'vibrator-1-0'...
<4>[    5.704372] .(1)[70:kworker/1:1][low_g]low_g_setup_eint
<4>[    5.705104] .(1)[70:kworker/1:1]111111  cur_gpio_state_low_g= 1
<4>[    5.705869] .(1)[70:kworker/1:1]****Open******** 
<14>[    5.706191] .(7)[1:init]init: starting service 'wifi_hal_legacy'...
<4>[    5.707295] .(1)[70:kworker/1:1]hehai ~~~kpd_send_old_slid_msg_low_g slid=0!!
<4>[    5.708670] .(1)[70:kworker/1:1]****mt_gpio_set_debounce,gpiopin=4, debounce=0*** 
<14>[    5.708720] .(7)[1:init]init: starting service 'dfps-1-0'...
<4>[    5.710664] .(1)[70:kworker/1:1][Hall]Hall set EINT finished, hall_irq=0, halldebounce=0 
<14>[    5.710746] .(7)[1:init]init: starting service 'mtkcodecservice-1-1'...
<14>[    5.712675] .(7)[1:init]init: starting service 'power-hal-1-1'...
<14>[    5.715638] .(7)[1:init]init: starting service 'nxpnfc_hal_svc'...
<14>[    5.718115] .(7)[1:init]init: Command 'class_start hal' action=boot (/init.rc:705) returned 0 took 56ms.
<14>[    5.720397] .(7)[1:init]init: starting service 'healthd'...
<11>[    5.722433] .(7)[1:init]init: cannot find '/vendor/bin/spm_loader', disabling 'spm_script': No such file or directory
<11>[    5.723906] .(7)[1:init]init: cannot find '/system/bin/datalogic_hw', disabling 'datalogic-hw': No such file or directory
<14>[    5.726423] .(7)[1:init]init: starting service 'lmkd'...
<14>[    5.729448] .(7)[1:init]init: starting service 'surfaceflinger'...
<11>[    5.732399] .(7)[1:init]init: service terservice does not have a SELinux domain defined
<14>[    5.733985] .(7)[1:init]init: starting service 'thermalservice'...
<14>[    5.737025] .(7)[1:init]init: starting service 'fuelgauged'...
<11>[    5.738555] .(5)[398:init]init: Failed to bind socket 'pdx/system/vr/display/client': No such file or directory
<14>[    5.739962] .(7)[1:init]init: starting service 'ccci_fsd'...
<11>[    5.741666] .(5)[398:init]init: Failed to bind socket 'pdx/system/vr/display/manager': No such file or directory
<14>[    5.742854] .(7)[1:init]init: starting service 'ccci3_fsd'...
<14>[    5.743702] .(3)[397:init]init: Created socket '/dev/socket/lmkd', mode 660, user 1000, group 1000
<14>[    5.745514] .(7)[1:init]init: starting service 'ccci_mdinit'...
<14>[    5.747947] .(7)[1:init]init: starting service 'ccci3_mdinit'...
<14>[    5.751094] .(7)[1:init]init: starting service 'ccci_rpcd'...
<14>[    5.754296] .(7)[1:init]init: starting service 'wfca'...
<14>[    5.759227] .(1)[406:init]init: Created socket '/dev/socket/wfca', mode 660, user 0, group 1000
<11>[    5.761249] .(5)[398:init]init: Failed to bind socket 'pdx/system/vr/display/vsync': No such file or directory
<14>[    5.762625] .(1)[406:init]init: Created socket '/dev/socket/wfca_rds', mode 660, user 0, group 1000
<14>[    5.764613] .(7)[1:init]init: starting service 'wmt_loader'...
<14>[    5.767757] .(7)[1:init]init: starting service 'wmt_launcher'...
<14>[    5.771820] .(7)[1:init]init: starting service 'statusd'...
<14>[    5.777402] .(0)[1:init]init: Command 'class_start core' action=boot (/init.rc:707) returned 0 took 57ms.
<14>[    5.778794] .(0)[1:init]init: processing action (boot) from (/init.usb.rc:25)
<14>[    5.779916] .(0)[1:init]init: PropSet [sys.usb.configfs]=[0] Done
<14>[    5.781017] .(0)[1:init]init: processing action (persist.sys.usb.config=* && boot) from (/init.usb.rc:106)
<14>[    5.782422] .(0)[1:init]init: PropSet [sys.usb.config]=[mtp] Done
<14>[    5.783380] .(0)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6763.rc:616)
<3>[    5.784861] .(0)[1:init]BOOTPROF:      5784.859859:INIT:boot
<14>[    5.794987] .(0)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6763.rc:1102)
<14>[    5.796853] .(0)[1:init]init: PropSet [persist.radio.reset_on_switch]=[false] Done
<14>[    5.798170] .(0)[1:init]init: PropSet [rild.mark_switchuser]=[0] Done
<14>[    5.799148] .(0)[1:init]init: processing action (boot) from (/vendor/etc/init/hw/init.mt6763.usb.rc:41)
<14>[    5.801351] .(4)[1:init]init: PropSet [sys.usb.configfs]=[1] Done
<5>[    5.821557] .(1)[400:fuelgauged][fg_res] FG_DAEMON_CMD_SET_DAEMON_PID = 400 (first launch)
<14>[    5.826329] .(4)[1:init]init: PropSet [sys.usb.controller]=[musb-hdrc] Done
<14>[    5.827599] .(5)[409:init]init: Created socket '/dev/socket/rild-via', mode 660, user 1001, group 1001
<14>[    5.827637] .(4)[1:init]init: PropSet [sys.usb.acm_cnt]=[0] Done
<14>[    5.827665] .(4)[1:init]init: PropSet [sys.usb.acm_port0]=[] Done
<14>[    5.827689] .(4)[1:init]init: PropSet [sys.usb.acm_port1]=[] Done
<14>[    5.827752] .(4)[1:init]init: PropSet [sys.usb.temp]=[] Done
<14>[    5.827775] .(4)[1:init]init: PropSet [sys.usb.acm_enable]=[0] Done
<14>[    5.827797] .(4)[1:init]init: PropSet [sys.usb.clear]=[boot] Done
<6>[    5.828036] .(4)[1:init]Store => 0xf0
<6>[    5.828041] .(4)[1:init]Set CPU[4] On
<6>[    5.828043] .(4)[1:init]Set CPU[5] On
<6>[    5.828044] .(4)[1:init]Set CPU[6] On
<6>[    5.828046] .(4)[1:init]Set CPU[7] On
<5>[    5.829093] .(1)[400:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low] h_percent=[9855,9747],high=92,fg_volt_withIR=34050 > ori_voltage=34000
<5>[    5.829160] .(1)[400:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low]fg_volt=35119,92,IR=-1117,orig_v:34000,+IR=34002,percent=9765,
<14>[    5.829370] .(4)[1:init]init: processing action (boot) from (/system/etc/init/bootstat.rc:57)
<14>[    5.829454] .(4)[1:init]init: PropSet [sys.logbootcomplete]=[1] Done
<14>[    5.829471] .(4)[1:init]init: processing action (boot) from (/system/etc/init/dumpstate.rc:1)
<14>[    5.829580] .(4)[1:init]init: processing action (boot) from (/system/etc/init/ged_srv.rc:12)
<14>[    5.829924] .(4)[1:init]init: processing action (boot) from (/system/etc/init/netdiag.rc:5)
<5>[    5.831279] .(2)[400:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low] h_percent=[9855,9747],high=92,fg_volt_withIR=34050 > ori_voltage=34000
<5>[    5.831345] .(2)[400:fuelgauged]MTK_FG: [fg_compensate_battery_voltage_from_low]fg_volt=35119,92,IR=-1117,orig_v:34000,+IR=34002,percent=9765,
<6>[    5.837505] .(4)[406:wfca][ccci1/chr]port ccci_imsa open with flag 20002 by wfca
<14>[    5.838520] .(4)[1:init]init: processing action (boot) from (/vendor/etc/init/init.md_apps.rc:1)
<14>[    5.838691] .(4)[1:init]init: processing action (boot) from (/vendor/etc/init/init.wmt_drv.rc:1)
<6>[    5.846048] .(0)[405:ccci_rpcd][ccci1/chr]port ccci_rpc open with flag 20002 by ccci_rpcd
<4>[    5.854241] -(7)[68:kworker/u16:1]do_connection_work: 16 callbacks suppressed
<5>[    5.854254] .(7)[68:kworker/u16:1][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<16>
<5>[    5.866393] .(3)[400:fuelgauged]MTK_FG: [GM3_data] soc:10000 fg_c_soc:10000 fg_v_soc:10000 ui_soc:10000 vc_diff:0 vc_mode 1 VBAT 43330 T:[25 V 24 C 25] D0_C 10000 D0_V 10000 CAR[c:0 v:0] Q:[27803 27803 27966 27966] aging 10000 bat_cycle 1 Trk[0(-46):0:0] UI[1:1] Chr[1:10000:9997] pseudo1 -40  DC_ratio 100 dodinit[9][0] Iavg:-7,dis[0 0 0]
<5>[    5.870615] .(3)[400:fuelgauged][fg_res] FG_DAEMON_CMD_GET_NVRAM_FAIL_STATUS = 0
<6>[    5.875593] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<12>[    5.876604] .(6)[396:healthd]healthd: unable to get HAL interface, using defaults
<3>[    5.879553] .(2)[404:ccci_mdinit]BOOTPROF:      5879.551936:ccci_md3: md_init srv start
<6>[    5.879744] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4310mV, VBAT = 4305mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<6>[    5.879754] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<6>[    5.879759] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<5>[    5.879769] .(0)[265:charger_thread][charger_routine_thread]flags=0,1 
<4>[    5.879797] .(0)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<5>[    5.880110] -(7)[396:healthd]alarmtimer_enqueue, 65835787538
<3>[    5.883247] .(0)[403:ccci_mdinit]BOOTPROF:      5883.245628:ccci_md1: md_init srv start
<36>[    5.885842] .(4)[364:logd.auditd]type=1400 audit(1578636726.334:24): avc: denied { write } for pid=362 comm="android.hardwar" name="/" dev="tmpfs" ino=2155 scontext=u:r:hal_keymaster_default:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[    5.885860] .(4)[364:logd.auditd]type=1400 audit(1578636726.698:25): avc: denied { write } for pid=361 comm="teed" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<12>[    5.887854] .(4)[396:healthd]healthd: BatteryCycleCountPath not found
<6>[    5.888497] .(6)[401:ccci_fsd][ccci1/chr]port ccci_fs open with flag 20002 by ccci_fsd
<4>[    5.888923] .(6)[396:healthd]=====FG===== SOC  = 100
<14>[    5.889128] .(5)[409:init]init: Created socket '/dev/socket/msap_c2k_socket1', mode 660, user 1001, group 1001
<5>[    5.893217] .(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    5.893737] -(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.893749] .(7)[400:fuelgauged][fgauge_read_RTC_boot_status] rtc_invalid 0 plugout 0 plugout_time 0 spare3 0xe4 spare0 0x60 hw_id 0x5640
<5>[    5.893753] .(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    5.893763] .(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    5.894848] .(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    5.894941] .(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[14] = {a24, 255, 8}
<5>[    5.894951] -(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.894961] -(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.895032] -(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.895040] .(7)[400:fuelgauged][fgauge_read_RTC_boot_status] spare0 0x60 0x20, spare3 0xe4 0xe4
<5>[    5.896981] .(7)[400:fuelgauged][read_hw_ocv_6356_power_on_rdy] pwron_SWCHR_rdy 0
<6>[    5.897015] .(7)[400:fuelgauged]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_zcv: zcv = 0mV
<5>[    5.897022] .(7)[400:fuelgauged]charger_manager_get_zcv zcv:0 ret:0
<5>[    5.897065] .(7)[400:fuelgauged][read_hw_ocv] g_fg_is_charger_exist 1 _hw_ocv_chgin_rdy 0 pl:1 1
<5>[    5.897068] .(7)[400:fuelgauged][read_hw_ocv] _hw_ocv 35966 _sw_ocv 43228 now_thr 300
<5>[    5.897070] .(7)[400:fuelgauged][read_hw_ocv] _hw_ocv 43228 _hw_ocv_src 1 _prev_hw_ocv 35966 _prev_hw_ocv_src 3 _flag_unreliable 0
<5>[    5.897315] .(7)[400:fuelgauged][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 0 bat_plug_out_time 0 sp0:0x60 sp3:0xe4 1 1
<5>[    5.897578] .(7)[400:fuelgauged][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 0 bat_plug_out_time 0 sp0:0x60 sp3:0xe4 1 1
<5>[    5.897629] -(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<3>[    5.898942] .(6)[403:ccci_mdinit]BOOTPROF:      5898.940859:ccci_md1: init
<4>[    5.899397] .(7)[400:fuelgauged]=====FG-MTK===== bat_vol=4286
<14>[    5.900010] .(5)[409:init]init: Created socket '/dev/socket/msap_c2k_socket2', mode 660, user 1001, group 1001
<5>[    5.901546] .(6)[400:fuelgauged]MTK_FG: [dod_init_result]ocv[boot:43221 final:43370 diff:149] thr[10000 10000 10000] tmp[now 25 5] v[lk_v:43219 cur:42860] lk_i:-15 lk_r:1700,i*r:2,old_soc:10000
<14>[    5.901585] .(5)[409:init]init: Created socket '/dev/socket/msap_c2k_socket3', mode 660, user 1001, group 1001
<14>[    5.903063] .(5)[409:init]init: Created socket '/dev/socket/msap_c2k_socket4', mode 660, user 1001, group 1001
<14>[    5.903728] .(5)[409:init]init: Created socket '/dev/socket/rpc', mode 660, user 1001, group 1001
<4>[    5.904633] .(7)[396:healthd]=====FG===== VOLT = 4326
<4>[    5.904641] .(7)[396:healthd]=====FG===== actural VOLT = 4335
<14>[    5.907466] .(1)[409:init]init: Created socket '/dev/socket/rildc-debug', mode 660, user 1001, group 1000
<14>[    5.909352] .(1)[409:init]init: Created socket '/dev/socket/rild-atci-c2k', mode 660, user 1001, group 1000
<14>[    5.909845] .(1)[409:init]init: Created socket '/dev/socket/statusd', mode 660, user 1001, group 1001
<5>[    5.910235] .(1)[69:kworker/u16:2][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<4>[    5.910785] .(6)[396:healthd]=====FG===== AC   = -80
<4>[    5.911958] .(6)[396:healthd]bq27542_set_commands cmd = 0x12, val = 3884 
<4>[    5.912793] .(5)[396:healthd]temp_now=225, temp_last=225 
<4>[    5.912805] .(5)[396:healthd]=====FG===== TEMP = 225
<6>[    5.913263] .(5)[396:healthd]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    5.913274] .(5)[396:healthd]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    5.913277] .(5)[396:healthd]I2C structure:
<3>[    5.913277] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=2,Total_len=1
<3>[    5.913277] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    5.913277] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    5.913282] .(5)[396:healthd]base address 0xffffff800bf46000
<6>[    5.913293] .(5)[396:healthd]I2C register:
<6>[    5.913293] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=1,CONTROL=28,TRANSFER_LEN=1
<6>[    5.913293] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    5.913293] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    5.913298] .(5)[396:healthd]before enable DMA register(0xffffff800bf48400):
<6>[    5.913298] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    5.913298] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    5.913298] [I2C]TX_LEN=0,RX_LEN=10,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    5.913298] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    5.913309] .(5)[396:healthd]DMA register(0xffffff800bf48400):
<6>[    5.913309] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    5.913309] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c045010
<6>[    5.913309] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=10101000
<6>[    5.913309] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    5.913314] .(5)[396:healthd]i2c_dump_info ------------------------------------------
<3>[    5.913317] .(5)[396:healthd]i2c i2c-2: last transfer info:
<3>[    5.913319] .(5)[396:healthd]i2c i2c-2: [00] [    5.913259] SLAVE_ADDR=d8,INTR_STAT=2,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.913324] .(5)[396:healthd]i2c i2c-2: [01] [    5.912778] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.913328] .(5)[396:healthd]i2c i2c-2: [02] [    5.912420] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    5.913332] .(5)[396:healthd]i2c i2c-2: [03] [    5.911932] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.913336] .(5)[396:healthd]i2c i2c-2: [04] [    5.911523] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.913341] .(5)[396:healthd]i2c i2c-2: [05] [    5.910701] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.913345] .(5)[396:healthd]i2c i2c-2: [06] [    5.908710] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    5.913349] .(5)[396:healthd]i2c i2c-2: [07] [    5.904602] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=498
<3>[    5.913353] .(5)[396:healthd]i2c i2c-2: [08] [    5.896481] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    5.913357] .(5)[396:healthd]i2c i2c-2: [09] [    5.892854] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<6>[    5.913365] .(1)[392:vendor.mediatek][DFRC] dfrc_reset_state
<4>[    5.913376] .(5)[396:healthd][wlc_do_10s_debounce]status=0
<4>[    5.913379] .(5)[396:healthd][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294893764 valley_jiffies=0 topeak_jiffies=0 
<6>[    5.913410] .(3)[182:dfrc_make_polic][DFRC] adjust vsync: [0|0|0] -> [-1|0|0]
<12>[    5.913566] .(5)[396:healthd]healthd: battery l=100 v=4335 t=22.5 h=2 st=2 c=-80 fc=3884000 chg=u
<5>[    5.915026] -(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.915050] -(7)[400:fuelgauged]mtk_rtc_hal_common: rtc_spare_reg[0] = {a2a, 255, 8}
<5>[    5.915507] .(7)[400:fuelgauged][fg_res] FG_DAEMON_CMD_SET_BATTERY_CYCLE_THRESHOLD = 27966
<5>[    5.918960] .(7)[400:fuelgauged][fg_res] FG_DAEMON_CMD_SET_FG_BAT_INT1_GAP = 139 car:-2
<5>[    5.922573] .(0)[400:fuelgauged][fg_res][fg_bat_int2] FG_DAEMON_CMD_SET_FG_BAT_INT2_HT_GAP = 279
<3>[    5.923828] .(5)[1:init][SDIO-DETECT][I]sdio_detect_init:sdio_register_driver() ret=0
<5>[    5.925272] .(5)[400:fuelgauged][fg_res][fg_bat_int2] FG_DAEMON_CMD_SET_FG_BAT_INT2_LT_GAP = 139
<3>[    5.926135] .(5)[1:init][WMT-DETECT][E]wmt_detect_probe(235):platform name: odm:mediatek,connectivity-combo
<3>[    5.927212] .(5)[1:init]wmt_gpio: gpio init start!
<3>[    5.927222] .(5)[1:init]wmt_gpio:set GPIO_COMBO_URXD_PIN to GPIO_PULL_DIS fail, is NULL!
<3>[    5.927224] .(5)[1:init]wmt_gpio:set GPIO_COMBO_UTXD_PIN to GPIO_PULL_DIS fail, is NULL!
<3>[    5.927247] .(5)[1:init]wmt_gpio:set GPIO_COMBO_PMU_EN_PIN to GPIO_PULL_DIS done!
<3>[    5.927264] .(5)[1:init]wmt_gpio:set GPIO_COMBO_PMU_EN_PIN out to 0: 0!
<3>[    5.927272] .(5)[1:init]wmt_gpio:set GPIO_COMBO_RST_PIN to GPIO_PULL_DIS done!
<3>[    5.927277] .(5)[1:init]wmt_gpio:set GPIO_COMBO_RST_PIN out to 0: 0!
<3>[    5.927285] .(5)[1:init]wmt_gpio:set GPIO_WIFI_EINT_PIN to GPIO_IN_PULLUP done!
<3>[    5.927291] .(5)[1:init]wmt_gpio:set GPIO_PCM_DAICLK_PIN to GPIO_PULL_DIS done!
<3>[    5.927297] .(5)[1:init]wmt_gpio:set GPIO_PCM_DAIPCMIN_PIN to GPIO_PULL_DIS done!
<3>[    5.927321] .(5)[1:init]wmt_gpio:set GPIO_PCM_DAIPCMOUT_PIN to GPIO_PULL_DIS done!
<3>[    5.927330] .(5)[1:init]wmt_gpio:set GPIO_PCM_DAISYNC_PIN to GPIO_PULL_DIS done!
<4>[    5.927332] .(5)[1:init]wmt_gpio:it may not be 6632 project, GPIO_CHIP_DEEP_SLEEP_PIN no need config!
<4>[    5.927334] .(5)[1:init]wmt_gpio:it may not be 6632 project, GPIO_CHIP_WAKE_UP_PIN no need config!
<3>[    5.927336] .(5)[1:init]wmt_gpio: gpio init done!
<3>[    5.927922] .(5)[1:init][WMT-DETECT][I]wmt_detect_driver_init:driver(major 154) installed success
<14>[    5.928131] .(5)[1:init]init: Command 'insmod /vendor/lib/modules/wmt_drv.ko' action=boot (/vendor/etc/init/init.wmt_drv.rc:2) returned 0 took 89ms.
<14>[    5.929029] .(5)[1:init]init: PropSet [mtk.md1.status]=[init] Done
<14>[    5.929138] .(5)[1:init]init: processing action (enable_property_trigger) from (<Builtin Action>:0)
<14>[    5.930463] .(5)[1:init]init: processing action (security.perf_harden=1) from (/init.rc:761)
<14>[    5.930719] .(5)[1:init]init: processing action (ro.debuggable=0) from (/init.rc:796)
<6>[    5.931627] .(3)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    5.931640] .(3)[265:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    5.932731] .(1)[265:charger_thread]=====FG===== AC   = -80
<4>[    5.933513] .(3)[265:charger_thread]=====FG===== AC   = -80
<5>[    5.934056] .(5)[400:fuelgauged][FGADC_intr_end][FG_INTR_INIT][read_fg_hw_info] curr_1 -2643 curr_2 -339 Iavg 55 sign 0 car -2 ncar -14451 time 1069
<5>[    5.934169] .(5)[400:fuelgauged][fg_res] FG_DAEMON_CMD_SET_KERNEL_SOC = 10000 100 10000 10000 10000 10000, type:4
<4>[    5.943805] .(1)[400:fuelgauged]=====FG===== SOC  = 100
<5>[    5.943821] .(1)[400:fuelgauged][bmd_ctrl_cmd_from_user]FG_status.ui_soc=100,fg_soc=100 
<4>[    5.948309] .(7)[400:fuelgauged]temp_now=225, temp_last=225 
<4>[    5.948360] .(7)[400:fuelgauged]=====FG===== TEMP = 225
<4>[    5.949467] .(5)[400:fuelgauged]=====FG===== VOLT = 4326
<4>[    5.949479] .(5)[400:fuelgauged]=====FG===== actural VOLT = 4335
<6>[    5.949486] .(5)[400:fuelgauged]power_supply battery: power_supply_changed
<5>[    5.949869] .(5)[400:fuelgauged][fg_res] FG_DAEMON_CMD_SET_CON0_SOC = 10050
<5>[    5.949958] .(5)[400:fuelgauged]MTK_FG: [FGADC_intr_end][INTR_Initialize]soc:10000 fg_c_soc:10000 fg_v_soc:10000 ui_soc:10000 vc_diff:0 vc_mode 1 VBAT 43219 T:[25 V 25 C 25] D0_C 10000 D0_V 10000 Q:[27966 27966 27966 27966] aging 10000 bat_cycle 1 Trk[0:0:0] UI[1:0] Chr[1:10000:0] pseudo1 0 DC_ratio 100
<4>[    5.950195] .(5)[85:kworker/5:1]temp_now=225, temp_last=225 
<4>[    5.950198] .(5)[85:kworker/5:1]=====FG===== TEMP = 225
<4>[    5.953944] .(5)[85:kworker/5:1]temp_now=225, temp_last=225 
<4>[    5.953957] .(5)[85:kworker/5:1]=====FG===== TEMP = 225
<4>[    5.954595] .(5)[85:kworker/5:1]=====FG===== SOC  = 100
<4>[    5.955418] .(5)[85:kworker/5:1]=====FG===== AC   = -80
<4>[    5.956521] .(5)[85:kworker/5:1]=====FG===== VOLT = 4326
<4>[    5.956530] .(5)[85:kworker/5:1]=====FG===== actural VOLT = 4335
<4>[    5.957069] .(5)[85:kworker/5:1]temp_now=225, temp_last=225 
<4>[    5.957073] .(5)[85:kworker/5:1]=====FG===== TEMP = 225
<4>[    5.958357] .(5)[85:kworker/5:1]=====FG===== SOC  = 100
<4>[    5.958938] .(5)[85:kworker/5:1]bq27542_set_commands cmd = 0x12, val = 3884 
<5>[    5.960443] .(0)[410:kworker/u16:5][MUSB]do_connection_work 430: !is_ready, retrigger after 50 ms, is_host<0>, power<0>, skip_cnt<0>
<4>[    5.961001] .(5)[85:kworker/5:1]bq27542_set_commands cmd = 0x3c, val = 3850 
<4>[    5.962528] .(5)[85:kworker/5:1]bq27542_set_commands cmd = 0xc, val = 3998 
<4>[    5.963747] .(0)[396:healthd]=====FG===== SOC  = 100
<4>[    5.965042] .(3)[396:healthd]=====FG===== VOLT = 4326
<4>[    5.965060] .(3)[396:healthd]=====FG===== actural VOLT = 4335
<4>[    5.966129] .(1)[396:healthd]=====FG===== AC   = -80
<4>[    5.966853] .(1)[396:healthd]bq27542_set_commands cmd = 0x12, val = 3884 
<4>[    5.968840] .(0)[396:healthd]temp_now=225, temp_last=225 
<4>[    5.968853] .(0)[396:healthd]=====FG===== TEMP = 225
<6>[    5.969969] .(0)[396:healthd]i2c i2c-2: addr: 6c, transfer ACK error
<6>[    5.969976] .(0)[396:healthd]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[    5.969979] .(0)[396:healthd]I2C structure:
<3>[    5.969979] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=3,Total_len=1
<3>[    5.969979] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[    5.969979] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[    5.969986] .(0)[396:healthd]base address 0xffffff800bf46000
<6>[    5.969998] .(0)[396:healthd]I2C register:
<6>[    5.969998] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=0,CONTROL=28,TRANSFER_LEN=1
<6>[    5.969998] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[    5.969998] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=2
<6>[    5.970005] .(0)[396:healthd]before enable DMA register(0xffffff800bf48400):
<6>[    5.970005] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[    5.970005] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[    5.970005] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[    5.970005] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    5.970017] .(0)[396:healthd]DMA register(0xffffff800bf48400):
<6>[    5.970017] [I2C]INT_FLAG=2,INT_EN=0,EN=0,RST=0,
<6>[    5.970017] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=9c04500c
<6>[    5.970017] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[    5.970017] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[    5.970023] .(0)[396:healthd]i2c_dump_info ------------------------------------------
<3>[    5.970027] .(0)[396:healthd]i2c i2c-2: last transfer info:
<3>[    5.970031] .(0)[396:healthd]i2c i2c-2: [00] [    5.969962] SLAVE_ADDR=d8,INTR_STAT=3,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.970036] .(0)[396:healthd]i2c i2c-2: [01] [    5.969501] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.970042] .(0)[396:healthd]i2c i2c-2: [02] [    5.969163] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=2201,DEBUGSTAT=300, tmo=500
<3>[    5.970047] .(0)[396:healthd]i2c i2c-2: [03] [    5.968825] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.970053] .(0)[396:healthd]i2c i2c-2: [04] [    5.968409] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=499
<3>[    5.970059] .(0)[396:healthd]i2c i2c-2: [05] [    5.966843] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.970064] .(0)[396:healthd]i2c i2c-2: [06] [    5.966491] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.970070] .(0)[396:healthd]i2c i2c-2: [07] [    5.966115] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[    5.970076] .(0)[396:healthd]i2c i2c-2: [08] [    5.965671] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[    5.970081] .(0)[396:healthd]i2c i2c-2: [09] [    5.965033] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<4>[    5.970107] .(0)[396:healthd][wlc_do_10s_debounce]status=0
<4>[    5.970111] .(0)[396:healthd][wlc_do_10s_debounce] gpio5_state =1 zero_jiffies=0 to10s_jiffies=4294893778 valley_jiffies=0 topeak_jiffies=0 
<12>[    5.970274] .(0)[396:healthd]healthd: battery l=100 v=4335 t=22.5 h=2 st=2 c=-80 fc=3884000 chg=u
<3>[    5.992281] .(3)[382:android.hardwar]Dump cpuinfo
<4>[    6.040396] .(7)[265:charger_thread]lifetime: data[0]=df 
<4>[    6.040408] .(7)[265:charger_thread]lifetime: data[1]=ff 
<4>[    6.040410] .(7)[265:charger_thread]lifetime: data[2]=40 
<4>[    6.040412] .(7)[265:charger_thread]lifetime: data[3]=11 
<4>[    6.040413] .(7)[265:charger_thread]lifetime: data[4]=45 
<4>[    6.040415] .(7)[265:charger_thread]lifetime: data[5]=a 
<4>[    6.040417] .(7)[265:charger_thread]lifetime: data[6]=fc 
<4>[    6.040418] .(7)[265:charger_thread]lifetime: data[7]=8 
<4>[    6.040420] .(7)[265:charger_thread]lifetime: data[8]=68 
<4>[    6.040422] .(7)[265:charger_thread]lifetime: data[9]=f7 
<4>[    6.040423] .(7)[265:charger_thread]lifetime: data[10]=18 
<4>[    6.040425] .(7)[265:charger_thread]lifetime: data[11]=0 
<4>[    6.042007] .(7)[265:charger_thread]=====FG-MTK===== bat_vol=4307
<5>[    6.045230] .(0)[265:charger_thread]Vbat=4307,Ibat=80,I=0,VChr=4730,T=25,Soc=100:100,CT:2:2 hv:1 pd:0:0
<5>[    6.045245] .(0)[265:charger_thread][mtk_is_charger_on]info->chr_type=2 
<4>[    6.047686] .(7)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    6.047694] .(7)[265:charger_thread]=====FG===== TEMP = 225
<5>[    6.047697] .(7)[265:charger_thread]charger_check_status
<14>[    6.096684] .(5)[1:init]init: starting service 'console'...
<5>[    6.096718] .(0)[265:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    6.098296] .(0)[265:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[    6.098301] .(0)[265:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    6.099860] .(0)[265:charger_thread]mtk_switch_charging_run [1 0], timer=0
<11>[    6.103844] .(0)[424:init]init: setpgid failed for console: Operation not permitted
<14>[    6.104078] .(5)[1:init]init: Command 'start console' action=ro.debuggable=0 (/init.rc:800) returned 0 took 173ms.
<14>[    6.104946] .(5)[1:init]init: Service 'ccci3_mdinit' (pid 404) exited with status 0
<14>[    6.105391] .(5)[1:init]init: processing action (ro.mtk_emmc_support=1) from (/vendor/etc/init/hw/init.mt6763.rc:889)
<14>[    6.105753] .(5)[1:init]init: processing action (sys.usb.acm_cnt=0 && sys.usb.config=mtp && sys.usb.configfs=1) from (/vendor/etc/init/hw/init.mt6763.usb.rc:169)
<14>[    6.105844] .(5)[1:init]init: PropSet [sys.usb.pid]=[0x2008] Done
<14>[    6.105893] .(5)[1:init]init: processing action (sys.usb.acm_enable=0 && sys.usb.config=mtp && sys.usb.configfs=1) from (/vendor/etc/init/hw/init.mt6763.usb.rc:192)
<6>[    6.106085] .(5)[1:init]os_desc_use_store Use OS DESC
<6>[    6.106182] .(5)[1:init]config_usb_cfg_link b.1<-->mtp.gs0
<6>[    6.106186] .(5)[1:init]usb_get_function usb_function_driver name=mtp
<6>[    6.106190] .(5)[1:init]usb_get_function usb_function name=mtp
<6>[    6.106235] .(5)[1:init]gadget_dev_desc_UDC_store write musb-hdrc
<6>[    6.106240] .(5)[1:init]usb_udc_attach_driver musb-hdrc musb-hdrc
<6>[    6.106247] .(5)[1:init]udc musb-hdrc: registering UDC driver [g1]
<6>[    6.106252] .(5)[1:init]configfs_composite_bind
<6>[    6.106262] .(5)[1:init]composite_dev_prepare ffffffc05739a900
<6>[    6.106295] .(5)[1:init]configfs-gadget gadget: adding 'mtp'/ffffffc057f19000 to config 'b'/ffffffc057f22d00
<6>[    6.106330] .(5)[1:init]allocate RX=49152 Tx=49152
<6>[    6.106334] .(5)[1:init]composite_os_desc_req_prepare ffffffc057398b80
<5>[    6.106340] .(5)[1:init][MUSB]musb_gadget_start 2445: musb_gadget_start
<5>[    6.106419] .(5)[1:init][MUSB]musb_gadget_pullup 2230: is_on=1, softconnect=0 ++
<5>[    6.106423] -(5)[1:init][MUSB]musb_gadget_pullup 2243: is_on=1, softconnect=0 ++
<5>[    6.106425] -(5)[1:init][MUSB]set_usb_rdy 2204: set usb_rdy, wake up bat
<5>[    6.106428] -(5)[1:init][MUSB]musb_gadget_pullup 2259: issue connect_rescue_work on is_ready begin, delay_time:8000 ms
<5>[    6.106433] -(5)[1:init][MUSB]musb_gadget_pullup 2261: issue connect_rescue_work on is_ready end, delay_time:8000 ms
<5>[    6.106435] -(5)[1:init][MUSB]musb_pullup 2152: MUSB: gadget pull up 1 start, musb->power:0
<5>[    6.106438] -(5)[1:init][MUSB]musb_pullup 2174: MUSB: gadget pull up 1 end
<3>[    6.106547] .(5)[1:init]BOOTPROF:      6106.546936:USB ready
<14>[    6.106674] .(5)[1:init]init: PropSet [sys.usb.state]=[mtp] Done
<14>[    6.106789] .(5)[1:init]init: processing action (defaultcrypto) from (/system/etc/init/vdc.rc:2)
<14>[    6.107367] .(5)[1:init]init: starting service 'exec 4 (/system/bin/vdc --wait cryptfs mountdefaultencrypted)'...
<14>[    6.108567] .(5)[1:init]init: SVC_EXEC pid 426 (uid 0 gid 0+0 context default) started; waiting...
<5>[    6.120433] .(2)[69:kworker/u16:2][MUSB]do_connection_work 459: is_host<0>, power<0>
<5>[    6.120459] .(2)[69:kworker/u16:2][MUSB]usb_cable_connected 747: usb_cable_connected vbus_exist=1 type=2
<5>[    6.120464] .(2)[69:kworker/u16:2][MUSB]usb_cable_connected 768: usb_cable_connected, connected:1, cable_mode:1, usb_data_lock:0
<5>[    6.120472] -(2)[69:kworker/u16:2][MUSB]do_connection_work 484: lock
<5>[    6.120475] -(2)[69:kworker/u16:2][MUSB]musb_start 1295: start, is_host=0 is_active=0
<5>[    6.120480] -(2)[69:kworker/u16:2][MUSB]mt_usb_enable 300: begin <0,0>,<2,1,1,1>
<4>[    6.120489] -(2)[69:kworker/u16:2]usb_6763_dpidle_request: 1 callbacks suppressed
<5>[    6.120494] -(2)[69:kworker/u16:2][MUSB]usb_6763_dpidle_request 120: USB_DPIDLE_FORBIDDEN, skip_cnt<1>
<4>[    6.120554] -(2)[69:kworker/u16:2]usb_6763_dpidle_request: 1 callbacks suppressed
<5>[    6.120557] -(2)[69:kworker/u16:2][MUSB]usb_6763_dpidle_request 113: USB_DPIDLE_ALLOWED, skip_cnt<1>
<14>[    6.121842] .(1)[1:init]init: Service 'exec 4 (/system/bin/vdc --wait cryptfs mountdefaultencrypted)' (pid 426) exited with status 0 waiting took 0.014000 seconds
<5>[    6.131470] -(2)[69:kworker/u16:2][MUSB]set_usb_phy_mode 425: force PHY to mode 1, 0x6c=3f2f
<5>[    6.131495] -(2)[69:kworker/u16:2][MUSB]usb_phy_recover 685: apply efuse setting, RG_USB20_INTR_CAL=0x15
<5>[    6.131502] -(2)[69:kworker/u16:2][MUSB]usb_phy_recover 695: usb recovery success
<5>[    6.131506] -(2)[69:kworker/u16:2][MUSB]mt_usb_enable 324: end, <2,1,2,1>
<5>[    6.131514] -(2)[69:kworker/u16:2][MUSB]musb_start 1335: set ignore babble MUSB_ULPI_REG_DATA=81
<5>[    6.131518] -(2)[69:kworker/u16:2][MUSB]musb_start 1343: add softconn
<3>[    6.146016] .(1)[407:wmt_loader][WMT-DETECT][I]wmt_detect_open:open major 154 minor 0 (pid 407)
<3>[    6.146213] .(1)[407:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191034),arg(92)
<3>[    6.146218] .(1)[407:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_pwr_on:++
<3>[    6.146222] .(1)[407:wmt_loader][WMT-DETECT][I]wmt_detect_dump_pin_conf:LDO(GPIO-1), PMU(GPIO370), PMUV28(GPIO-1)
<4>[    6.146228] .(1)[407:wmt_loader]------------[ cut here ]------------
<4>[    6.146231] .(1)[407:wmt_loader]WARNING: CPU: 1 PID: 407 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/drivers/gpio/gpiolib.c:85 gpio_to_desc+0xdc/0xf0()
<4>[    6.146246] .(1)[407:wmt_loader]invalid GPIO -1
<4>[    6.146260] .(1)[407:wmt_loader]Modules linked in: wmt_drv ffffff8000c33000           (null) 1162215 0 (O) fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    6.146264] -(1)[407:wmt_loader]CPU: 1 PID: 407 Comm: wmt_loader Tainted: G        W  O    4.4.95+ #2
<4>[    6.146268] -(1)[407:wmt_loader]Hardware name: MT6763V/B (DT)
<4>[    6.146273] -(1)[407:wmt_loader]Call trace:
<4>[    6.146275] -(1)[407:wmt_loader][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    6.146286] -(1)[407:wmt_loader][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    6.146290] -(1)[407:wmt_loader][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    6.146299] -(1)[407:wmt_loader][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    6.146305] -(1)[407:wmt_loader][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    6.146310] -(1)[407:wmt_loader][<ffffff80083a039c>] gpio_to_desc+0xdc/0xf0
<4>[    6.146313] -(1)[407:wmt_loader][<ffffff8000c33564>] wmt_detect_chip_pwr_ctrl+0x2ac/0x398 [wmt_drv]
<4>[    6.146548] -(1)[407:wmt_loader][<ffffff8000c33920>] wmt_detect_ext_chip_pwr_on+0x20/0x78 [wmt_drv]
<4>[    6.146724] -(1)[407:wmt_loader][<ffffff8000c33d34>] wmt_detect_ext_chip_detect+0x35c/0x500 [wmt_drv]
<4>[    6.146897] -(1)[407:wmt_loader][<ffffff80081f5184>] do_vfs_ioctl+0x384/0x688
<4>[    6.146910] -(1)[407:wmt_loader][<ffffff80081f5514>] SyS_ioctl+0x8c/0xa0
<4>[    6.146913] -(1)[407:wmt_loader][<ffffff8008085000>] el0_svc_naked+0x34/0x38
<4>[    6.146920] .(1)[407:wmt_loader]---[ end trace 97123305e0c7479d ]---
<3>[    6.146923] .(1)[407:wmt_loader][WMT-DETECT][I]wmt_detect_dump_pin_conf:RST(GPIO369), BGF_EINT(GPIO-1), BGF_EINT_NUM(-22)
<3>[    6.146948] .(1)[407:wmt_loader][WMT-DETECT][I]wmt_detect_dump_pin_conf:WIFI_EINT(GPIO371), WIFI_EINT_NUM(695)
<3>[    6.146953] .(1)[407:wmt_loader]wmt_gpio:set GPIO_COMBO_URXD_PIN to GPIO_PULL_DIS fail, is NULL!
<3>[    6.146980] .(1)[407:wmt_loader][WMT-DETECT][I]wmt_detect_chip_pwr_on:wmt_gpio:set GPIO_COMBO_PMU_EN_PIN to GPIO_PULL_DIS done!
<3>[    6.146995] .(1)[407:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO90 to output 0
<3>[    6.147004] .(1)[407:wmt_loader][WMT-DETECT][I]wmt_detect_chip_pwr_on:wmt_gpio:set GPIO_COMBO_RST_PIN to GPIO_PULL_DIS done!
<3>[    6.147011] .(1)[407:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO89 to output 0
<5>[    6.152922] .(2)[265:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:25,39,16 pps:0 en:0 ibus:0 80
<5>[    6.152935] .(2)[265:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[    6.152942] .(2)[265:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<5>[    6.154506] .(2)[265:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<4>[    6.154904] .(2)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    6.154913] .(2)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    6.154920] .(2)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    6.157165] .(2)[265:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    6.159396] .(2)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    6.159399] .(2)[265:charger_thread]=====FG===== TEMP = 225
<4>[    6.162594] .(2)[265:charger_thread]=====FG===== VOLT = 4326
<4>[    6.162598] .(2)[265:charger_thread]=====FG===== actural VOLT = 4335
<4>[    6.165571] .(2)[265:charger_thread]=====FG===== AC   = -80
<4>[    6.166868] .(2)[265:charger_thread]=====FG===== SOC  = 100
<4>[    6.168672] .(2)[265:charger_thread]=====FG===== SOH  = 100
<4>[    6.168675] .(2)[265:charger_thread]DLCP bat_vol=4335,  temperature=225  
<4>[    6.168678] .(2)[265:charger_thread] ===CC_value from battery temprature=2000000
<4>[    6.168684] .(2)[265:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<4>[    6.171488] .(2)[265:charger_thread]DLCP mt6370_set_vrech       = 300
<4>[    6.176813] .(2)[265:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[    6.176819] .(2)[265:charger_thread]DLCP read cv              = 4350000
<4>[    6.176821] .(2)[265:charger_thread]DLCP read eoc             = 250000
<4>[    6.176823] .(2)[265:charger_thread]DLCP read recharge        = 300
<4>[    6.176826] .(2)[265:charger_thread]DLCP Target Temp          = 410
<4>[    6.176828] .(2)[265:charger_thread]DLCP Charge Current       = 2000
<4>[    6.176831] .(2)[265:charger_thread]DLPID 
<4>[    6.176832] .(2)[265:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    6.176835] .(2)[265:charger_thread]DLPID PID Target Temp = 410 
<4>[    6.176837] .(2)[265:charger_thread]DLPID Battery Temp    = 225 
<4>[    6.176839] .(2)[265:charger_thread]DLPID TEMP DIFF       = 138 
<4>[    6.176841] .(2)[265:charger_thread]DLPID PID KI          = 5000 
<4>[    6.176843] .(2)[265:charger_thread]DLPID CC MAX          = 2000000 
<4>[    6.176846] .(2)[265:charger_thread]DLPID PID Current     = 1190000 
<4>[    6.176848] .(2)[265:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[    6.176850] .(2)[265:charger_thread]DLCP ccurrent from battery temprature = 2000000
<4>[    6.176852] .(2)[265:charger_thread]DLCP ccurrent from PID algorithm      = 1190000
<4>[    6.176855] .(2)[265:charger_thread]DLCP ccurrent from DLPL               = 2000000
<4>[    6.176858] .(2)[265:charger_thread]DLCP set input current:500000 
<4>[    6.178602] .(2)[265:charger_thread]DLCP set charge current: 500000 
<4>[    6.188608] .(5)[265:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    6.190856] .(5)[265:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[    6.190860] .(5)[265:charger_thread]DLCP __mt6370_set_cv       = 4350000
<4>[    6.193140] .(5)[265:charger_thread]DLCP mt6370_enable_charging :1 
<3>[    6.237853] .(2)[427:vold]BOOTPROF:      6237.851937:vold:decrypt_master_key:START
<3>[    6.239133] .(2)[427:vold]BOOTPROF:      6239.131783:vold:scrypt_keymaster:START
<5>[    6.248386] .(2)[407:wmt_loader]mtk_rtc_common: rtc_gpio_enable_32k, user = 9
<5>[    6.249494] -(2)[407:wmt_loader]mtk_rtc_hal: RTC_GPIO user 9 enable = 1 32k (0x200), RTC_CON = 487
<4>[    6.280424] .(1)[1:init][TKCORE]  tee_boot_params.flags: 0
<4>[    6.280424] [    5.333183]: <0>MSG TKCore:dump_tee_boot_params:147: rpmb_key_programmed: 1
<4>[    6.280424] [   18.395291]: <4>DBG TKCore:tee_ta_init_static_ta_session:1852:  Run tee_user_init.ta : 4dd88ba0-4c11-5669-dd-c3-26-24-bf-84-a4-e0
<4>[    6.280424] [   18.415003]: <
<14>[    6.280539] .(1)[1:init]init: PropSet [debug.sf.hwc_pid]=[386] Done
<4>[    6.284295] [TKCORE] 4>DBG TKCore:tee_ta_open_session:1988: [TA 4dd88ba0: 0] init session
<4>[    6.284295] [   18.421330]: <4>DBG TKCore:invoke_command:398: cmd_id=2820 nParamTypes=0x2
<4>[    6.284295] [   18.426168]: <4>DBG TKCore:invoke_command:398: cmd_id=2821 nParamTypes=0x2
<4>[    6.284295] [   18.447178]: <4>DBG TKCore:<5>[    6.286502] -(4)[398:surfaceflinger][MUSB]musb_stage0_irq 1166: musb_stage0_irq:1166 MUSB_INTR_RESET (b_idle)
<5>[    6.286523] -(4)[398:surfaceflinger]QMU_WARN,<musb_disable_q_all 308>, disable_q_all
<5>[    6.286534] -(4)[398:surfaceflinger][BATTERY] BAT_SetUSBState Success! Set 1
<4>[    6.291217] [TKCORE] invoke_command:398: cmd_id=2822 nParamTypes=0x0
<4>[    6.291217] [   18.448428]: <4>DBG TKCore:invoke_command:398: cmd_id=2820 nParamTypes=0x2
<4>[    6.291217] [   18.452616]: <4>DBG TKCore:tee_ta_init_static_ta_session:1852:  Run tee_user_init.ta : 4dd88ba0-4c11-5669-dd-c3-26-24-bf-84-a4[TKCORE] -e0
<4>[    6.291217] [   18.472992]: <4>DBG TKCore:tee_ta_open_session:1988: [TA 4dd88ba0: 0] init session
<4>[    6.291217] [   18.474215]: <4>DBG TKCore:invoke_command:398: cmd_id=0 nParamTypes=0x555
<4>[    6.291217] [   18.475303]: <4>ERR TKCore:tee_rpmb_get_dev_info:1035: send rpmb command failed with [TKCORE] 0xffff0009
<4>[    6.291217] [   18.488932]: <4>ERR TKCore:tee_rpmb_init:1165: Failed to retrieve rpmb device info with 0xffff0009
<4>[    6.291217] [   18.490154]: <4>ERR TKCore:init_truststore:132: Init rpmb device failed with 0xffff0009
<4>[    6.291217] [   18.491250]: <4>INF TKCore:init_truststore:239: [TKCORE] Candidate truststore: PROTECT
<4>[    6.300121] [   18.492225]: <4>MSG TKCore:truststore_source_init_with_type:124: Init truststore with type=3
<4>[    6.300121] [   18.496019]: <4>DBG TKCore:wq_rpc:56: [4dd88ba0: 0] sleep <thread_big_lock>
<4>[    6.300121] [   18.497863]: <4>ERR TKCore:tee_ta_rpc_load:1500[TKCORE] : load TA failed with 0xffff0000
<4>[    6.303714] [   18.499138]: <4>DBG TKCore:tee_dispatch_open_session:141: TA <9ef77781-7bd5-4e39-96-5f-20-f6-f2-11-f4-6b> => Error: ffff0000 of 2
<4>[    6.303714] [   18.500750]: <4>DBG TKCore:wq_rpc:56: [00000000: 0] wake <thread_big_lock>
<4>[    6.303714] [   18.5084[TKCORE] 69]: <4>INF TKCore:sdrpmb_reserved_region_init:2954: SDRPMB Reserved region Prepared
<4>[    6.303714] [   18.512557]: <4>INF TKCore:init_truststore:251: PROTECT Setup ... Done
<4>[    6.303714] [   18.513499]: <4>INF TKCore:license_init:1948: Check secondary external certificate
<4>[    6.303714] [   18.515[TKCORE] 501]: <4>INF TKCore:get_pubk:652: KeyID = 0
<4>[    6.303714] [   18.517451]: <4>INF TKCore:license_init:1950: Load Secondary cert success
<4>[    6.303714] [   18.519305]: <4>INF TKCore:license_init:1983: VERIFY_STATE: 1 TRIAL_STATE: 1
<4>[    6.303714] [   18.520686]: <4>DBG TKCore:tee_ta_init_static_ta_se[TKCORE] ssion:1852:  Run tee_user_init.ta : 4dd88ba0-4c11-5669-dd-c3-26-24-bf-84-a4-e0
<4>[    6.312454] [   18.522235]: <4>DBG TKCore:tee_ta_open_session:1988: [TA 4dd88ba0: 0] init session
<4>[    6.312454] [   18.524179]: <4>DBG TKCore:invoke_command:398: cmd_id=2561 nParamTypes=0x67
<4>[    6.312454] [   18.8753.(1)[407:wmt_loader][TKCORE] 94]: <4>DBG TKCore:elf_load_body:450: Set TLS offset for TA: 0x2130b4
<4>[    6.316041] [   18.945369]: <4>DBG TKCore:tee_ta_load:1170: Loaded TA at 0xf0200000
<4>[    6.316041] [   19.060539]: <4>DBG TKCore:tee_ta_load:1171: ELF load address 0x200000
<4>[    6.316041] [   19.075608]: <4>DBG TKCore:tee_ta_in
<3>[    6.368434] .(1)[407:wmt_loader][WMT-DETECT][I]_wmt_detect_output_high:WMT-DETECT: set GPIO90 to output 1
<5>[    6.375089] .(5)[85:kworker/5:1][MUSB]usb_cable_connected 747: usb_cable_connected vbus_exist=1 type=2
<5>[    6.376304] .(5)[85:kworker/5:1][MUSB]usb_cable_connected 768: usb_cable_connected, connected:1, cable_mode:1, usb_data_lock:0
<6>[    6.377914] .(5)[85:kworker/5:1]android_work: sent uevent USB_STATE=CONNECTED
<6>[    6.395072] -(4)[398:surfaceflinger]configfs-gadget gadget: [ratelimit]non-core control reqc0.01 v0000 i0004 l16
<6>[    6.396549] -(6)[427:vold]configfs-gadget gadget: [ratelimit]non-core control reqc0.01 v0000 i0004 l40
<3>[    6.404415] .(0)[407:wmt_loader][WMT-DETECT][I]_wmt_detect_output_high:WMT-DETECT: set GPIO89 to output 1
<6>[    6.438238] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<6>[    6.440138] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4325mV, VBAT = 4310mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<6>[    6.442055] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<4>[    6.442059] .(2)[407:wmt_loader]mtk_wcn_cmb_sdio_off (1)
<6>[    6.442547] .(2)[407:wmt_loader][msdc]msdc2 -> MSDC Device Request Suspend
<4>[    6.442544] .(2)[407:wmt_loader]mtk_wcn_cmb_sdio_on (1)
<6>[    6.446046] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<6>[    6.468508] .(2)[407:wmt_loader][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<5>[    6.484881] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x00000c00>
<5>[    6.486685] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<52> MSDC_INT_CMDTMO Arg<0x80000c08>
<6>[    6.488366] .(0)[407:wmt_loader][msdc]msdc2 -> MSDC Device Request Resume
<3>[    6.488982] .(0)[407:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191038),arg(0)
<3>[    6.490134] .(0)[407:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:++
<5>[    6.491933] .(2)[228:kworker/2:2][msdc][msdc_command_resp_polling]: msdc2 CMD<8> MSDC_INT_CMDTMO Arg<0x000001aa>
<6>[    6.495202] .(2)[228:kworker/2:2][msdc]msdc2: card is busy!
<3>[    6.512400] .(2)[407:wmt_loader][WMT-DETECT][E]wmt_detect_read_ext_cmb_status(216):WMT-DETECT: WIFI_EINT input status:1
<3>[    6.513790] .(2)[407:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:external combo chip detected
<6>[    6.520544] .(2)[228:kworker/2:2][msdc]msdc2 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<11>[    6.522389] .(1)[1:init]init: property_set("ro.sf.lcd_density", "300") failed: property already set
<4>[    6.530171] -(5)[0:swapper/5]Power/swap DP: No enter --- SODI3: No enter --- SODI: No enter --- 
<4>[    6.530552] .(3)[0:swapper/3]mcdi cpu: 0, 0, 0, 0, 0, 0, 0, 0, cluster : 0, 0, pause = 0, multi core = 0, residency = 0, last core = 0, avail cpu = 00ff, cluster = 0003, enabled = 1, max_s_state = 5 (buck_off = 0), system_idle_hint = 00000000
<4>[    6.530552] 
<6>[    6.538252] .(1)[410:kworker/u16:5][msdc]msdc1 power on
<6>[    6.538689] .(2)[228:kworker/2:2][msdc]msdc2 -> !!! Set<200000KHz> Source<185999KHz> -> sclk<185999KHz> timing<6> mode<1> div<0> hs400_div_dis<0>
<6>[    6.539716] .(2)[228:kworker/2:2][AUTOK]SDIO SDR104 Tune
<6>[    6.539721] .(2)[228:kworker/2:2]DVFS ready
<5>[    6.539727] .(2)[228:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 0, dvfs_opp: 0, sw_opp: 3
<5>[    6.539741] .(2)[228:kworker/2:2][VcoreFS] opp: 0, vcore: 793750 <= 725000, fddr: 1866000 <= 1200000 [O][O]
<5>[    6.539762] -(2)[228:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 0, vcore: 0x110000, emi: 0x200000, md: 0x0
<6>[    6.543257] .(2)[228:kworker/2:2][AUTOK]CMD 0 	 55 	 OOOOOOOOXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.545610] .(2)[228:kworker/2:2][AUTOK]CMD 1 	 40 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.545616] .(2)[228:kworker/2:2][AUTOK]Analysis Result: 1T = 64
<6>[    6.548657] .(2)[228:kworker/2:2][AUTOK]DAT 0 	 53 	 OOOOXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.551721] .(2)[228:kworker/2:2][AUTOK]DAT 1 	 38 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXOOOOOOOOOOOOOOOOOOO
<6>[    6.553098] .(2)[228:kworker/2:2][AUTOK]Analysis Result: 1T = 68
<6>[    6.553904] .(2)[228:kworker/2:2][AUTOK]CMD [EDGE:1 CMD_FIFO_EDGE:0 DLY1:8 DLY2:0]
<6>[    6.554886] .(2)[228:kworker/2:2][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:1 WD_FIFO_EDGE:1]
<6>[    6.555927] .(2)[228:kworker/2:2][AUTOK]DAT [LATCH_CK:0 DLY1:7 DLY2:0]
<6>[    6.556799] .(2)[228:kworker/2:2][AUTOK]DS  [DLY1:0 DLY2:0 DLY3:0]
<6>[    6.557608] .(2)[228:kworker/2:2][AUTOK]CLK TX  [0]
<6>[    6.558259] .(2)[228:kworker/2:2][AUTOK]CMD TX  [0]
<6>[    6.558910] .(2)[228:kworker/2:2][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    6.559760] .(2)[228:kworker/2:2][AUTOK]======Cost:19 ms======
<5>[    6.560539] .(2)[228:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 1, dvfs_opp: 1, sw_opp: 0
<5>[    6.561772] .(2)[228:kworker/2:2][VcoreFS] opp: 1, vcore: 793750 <= 793750, fddr: 1600000 <= 1866000 [O][O]
<5>[    6.563023] -(2)[228:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 1, vcore: 0x110000, emi: 0x100000, md: 0x0
<6>[    6.564399] .(2)[228:kworker/2:2]skip duplicated vcore autok
<5>[    6.565127] .(2)[228:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 2, dvfs_opp: 2, sw_opp: 1
<5>[    6.566358] .(2)[228:kworker/2:2][VcoreFS] opp: 2, vcore: 725000 <= 793750, fddr: 1600000 <= 1600000 [O][O]
<5>[    6.567611] -(2)[228:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 2, vcore: 0x10000, emi: 0x100000, md: 0x0
<6>[    6.572267] .(2)[228:kworker/2:2][AUTOK]CMD 0 	 56 	 OOOOOXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXO
<6>[    6.575907] .(2)[228:kworker/2:2][AUTOK]CMD 1 	 34 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXOOOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.576632] .(0)[410:kworker/u16:5][msdc]msdc1 -> !!! Set<260KHz> Source<185999KHz> -> sclk<259KHz> timing<0> mode<0> div<179> hs400_div_dis<0>
<6>[    6.577798] .(0)[410:kworker/u16:5][msdc]msdc1 -> !!! Set<400KHz> Source<185999KHz> -> sclk<397KHz> timing<0> mode<0> div<117> hs400_div_dis<0>
<6>[    6.580552] .(2)[228:kworker/2:2][AUTOK]Analysis Result: 1T = 57
<6>[    6.584292] .(2)[228:kworker/2:2][AUTOK]DAT 0 	 52 	 OOXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXX
<6>[    6.588889] .(2)[228:kworker/2:2][AUTOK]DAT 1 	 30 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOO
<6>[    6.590249] .(2)[228:kworker/2:2][AUTOK]Analysis Result: 1T = 57
<6>[    6.591055] .(2)[228:kworker/2:2][AUTOK]CMD [EDGE:1 CMD_FIFO_EDGE:0 DLY1:5 DLY2:0]
<6>[    6.592031] .(2)[228:kworker/2:2][AUTOK]DAT [RDAT_EDGE:0 RD_FIFO_EDGE:1 WD_FIFO_EDGE:1]
<4>[    6.592550] -(7)[410:kworker/u16:5]------------[ cut here ]------------
<4>[    6.592555] -(7)[410:kworker/u16:5]WARNING: CPU: 7 PID: 410 at /data/jenkins/workspace/dl35_oreo/kernel-4.4/kernel/irq/manage.c:513 __enable_irq+0x44/0x80()
<4>[    6.592568] -(7)[410:kworker/u16:5]Unbalanced enable for IRQ 675
<4>[    6.592580] -(7)[410:kworker/u16:5]Modules linked in: wmt_drv ffffff8000c33000           (null) 1162215 0 (O) fpsgo ffffff8000c2f000           (null) 2624 0 (O)
<4>[    6.592582] -(7)[410:kworker/u16:5]CPU: 7 PID: 410 Comm: kworker/u16:5 Tainted: G        W  O    4.4.95+ #2
<4>[    6.592586] -(7)[410:kworker/u16:5]Hardware name: MT6763V/B (DT)
<4>[    6.592600] -(7)[410:kworker/u16:5]Workqueue: msdc-init msdc_add_host
<4>[    6.592602] -(7)[410:kworker/u16:5]Call trace:
<4>[    6.592603] -(7)[410:kworker/u16:5][<ffffff800808a298>] dump_backtrace+0x0/0x228
<4>[    6.592610] -(7)[410:kworker/u16:5][<ffffff800808a4d4>] show_stack+0x14/0x20
<4>[    6.592614] -(7)[410:kworker/u16:5][<ffffff8008360870>] dump_stack+0xa0/0xc0
<4>[    6.592620] -(7)[410:kworker/u16:5][<ffffff80080a1bc4>] warn_slowpath_common+0x9c/0xd8
<4>[    6.592625] -(7)[410:kworker/u16:5][<ffffff80080a1c5c>] warn_slowpath_fmt+0x5c/0x80
<4>[    6.592629] -(7)[410:kworker/u16:5][<ffffff800810c894>] __enable_irq+0x44/0x80
<4>[    6.592632] -(7)[410:kworker/u16:5][<ffffff800810c91c>] enable_irq+0x4c/0xa8
<4>[    6.592634] -(7)[410:kworker/u16:5][<ffffff800892f208>] mmc_gpiod_request_cd_irq+0x98/0xc0
<4>[    6.592640] -(7)[410:kworker/u16:5][<ffffff8008922fa4>] mmc_start_host+0x5c/0xb8
<4>[    6.592644] -(7)[410:kworker/u16:5][<ffffff8008924484>] mmc_add_host+0x64/0xc0
<4>[    6.592647] -(7)[410:kworker/u16:5][<ffffff800893c1e0>] msdc_add_host+0x20/0x48
<4>[    6.592651] -(7)[410:kworker/u16:5][<ffffff80080bda10>] process_one_work+0x1d0/0x468
<4>[    6.592657] -(7)[410:kworker/u16:5][<ffffff80080bddd8>] worker_thread+0x130/0x4e0
<4>[    6.592660] -(7)[410:kworker/u16:5][<ffffff80080c3fbc>] kthread+0xec/0x100
<4>[    6.592664] -(7)[410:kworker/u16:5][<ffffff8008084fa0>] ret_from_fork+0x10/0x30
<4>[    6.592668] -(7)[410:kworker/u16:5]---[ end trace 97123305e0c7479e ]---
<6>[    6.592724] .(7)[257:kworker/7:1][msdc]msdc1 -> Card insert<0> Block bad card<0>, mrq<          (null)> claimed<0> pwrcnt<0> <- msdc_ops_get_cd() : L<4522> PID<kworker/7:1><0x101>
<6>[    6.592842] .(7)[257:kworker/7:1][msdc]msdc1 power off
<6>[    6.619657] .(2)[228:kworker/2:2][AUTOK]DAT [LATCH_CK:0 DLY1:4 DLY2:0]
<6>[    6.620522] .(2)[228:kworker/2:2][AUTOK]DS  [DLY1:0 DLY2:0 DLY3:0]
<6>[    6.621325] .(2)[228:kworker/2:2][AUTOK]CLK TX  [0]
<6>[    6.621975] .(2)[228:kworker/2:2][AUTOK]CMD TX  [0]
<6>[    6.622626] .(2)[228:kworker/2:2][AUTOK]DAT TX  [D0:0 D1:0 D2:0 D3:0]
<6>[    6.623477] .(2)[228:kworker/2:2][AUTOK]======Cost:54 ms======
<5>[    6.624246] .(2)[228:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_AUTOK_SDIO, opp: 3, dvfs_opp: 3, sw_opp: 2
<5>[    6.625491] .(2)[228:kworker/2:2][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1600000 [O][O]
<5>[    6.626739] -(2)[228:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 1, opp: 3, vcore: 0x10000, emi: 0x0, md: 0x0
<6>[    6.628024] .(2)[228:kworker/2:2]skip duplicated vcore autok
<6>[    6.628772] .(2)[228:kworker/2:2][AUTOK]CMD 0 	 53 	 OOOOOXOOXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXO merge
<6>[    6.630195] .(2)[228:kworker/2:2][AUTOK]CMD 1 	 34 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXOOOOOXOOOOOOOOOOOOOOOOOOOOOOO merge
<6>[    6.631624] .(2)[228:kworker/2:2][AUTOK]cmd edge = 0 cmd dly = 35 max win = 52
<6>[    6.632589] .(2)[228:kworker/2:2][AUTOK]DAT 0 	 48 	 OOXXXXXXXXXOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXX merge
<6>[    6.634012] .(2)[228:kworker/2:2][AUTOK]DAT 1 	 30 	 OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOXXXXXXXOXXXXXXXOOOOOOOOOOOOOOOOOOO merge
<6>[    6.635443] .(2)[228:kworker/2:2][AUTOK]dat edge = 0 dat dly = 34 max win = 47
<6>[    6.636400] .(2)[228:kworker/2:2][AUTOK][merge]======Time Cost:7 ms======
<6>[    6.637278] .(2)[228:kworker/2:2][AUTOK]merge_window = 52
<6>[    6.637982] .(2)[228:kworker/2:2][AUTOK]merge_window = 47
<6>[    6.638704] .(2)[228:kworker/2:2][AUTOK]No need change para when dvfs
<5>[    6.639532] .(2)[228:kworker/2:2][VcoreFS] kicker: KIR_AUTOK_SDIO, opp: -1, dvfs_opp: 3, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[    6.641535] .(2)[228:kworker/2:2][VcoreFS] [AUTOK] kicker: KIR_SYSFS, opp: 3, dvfs_opp: 3, sw_opp: 3
<5>[    6.642699] .(2)[228:kworker/2:2][VcoreFS] opp: 3, vcore: 725000 <= 725000, fddr: 1200000 <= 1200000 [O][O]
<5>[    6.643979] -(2)[228:kworker/2:2][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<5>[    6.645329] .(2)[228:kworker/2:2][VcoreFS] [spm_msdc_dvfs_setting] MSDC AUTOK FINISH
<4>[    6.646317] .(2)[228:kworker/2:2][MMDVFS][pid=228]mmdvfs service has been enabled
<4>[    6.647281] .(2)[228:kworker/2:2][pid=228]mmdvfs_notify_prepare_action: 1
<6>[    6.648635] .(2)[228:kworker/2:2]mmc2: new ultra high speed SDR104 SDIO card at address 0001
<3>[    6.650220] .(2)[228:kworker/2:2][SDIO-DETECT][I]sdio_detect_probe:vendor(0x37a) device(0x6630) num(0x1)
<3>[    6.651435] .(2)[228:kworker/2:2][SDIO-DETECT][I]hif_sdio_match_chipid_by_dev_id:valid chipId found, index(4), vendor id(0x37a), device id(0x6630), chip id(0x6630)
<4>[    6.653319] .(2)[228:kworker/2:2]set current consys chipid (0x6630)
<3>[    6.654124] .(2)[228:kworker/2:2][SDIO-DETECT][I]sdio_detect_probe:autok function detected, func:0xffffffc057622000
<3>[    6.655732] .(2)[228:kworker/2:2][SDIO-DETECT][I]sdio_detect_probe:vendor(0x37a) device(0x6630) num(0x2)
<3>[    6.656987] .(2)[228:kworker/2:2][SDIO-DETECT][I]hif_sdio_match_chipid_by_dev_id:valid chipId found, index(4), vendor id(0x37a), device id(0x6630), chip id(0x6630)
<4>[    6.658837] .(2)[228:kworker/2:2]set current consys chipid (0x6630)
<3>[    6.716389] .(2)[407:wmt_loader][SDIO-DETECT][I]hif_sdio_is_chipid_valid:index:4, chipId:0x6630
<3>[    6.717530] .(2)[407:wmt_loader][SDIO-DETECT][I]hif_sdio_is_chipid_valid:index:4, chipId:0x6630
<3>[    6.718641] .(2)[407:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:valid external combo chip id (0x6630)
<3>[    6.719975] .(2)[407:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_detect:--
<3>[    6.721175] .(2)[407:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191040),arg(0)
<4>[    6.722319] .(2)[407:wmt_loader]query current consys chipid (0x6630)
<14>[    6.724739] .(1)[1:init]init: PropSet [persist.mtk.wcn.combo.chipid]=[0x6630] Done
<3>[    6.725947] .(3)[407:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191032),arg(26160)
<3>[    6.727132] .(3)[407:wmt_loader][SDIO-DETECT][I]sdio_detect_do_autok:autok was move to sdio driver
<3>[    6.728544] .(3)[407:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191033),arg(4)
<3>[    6.729715] .(3)[407:wmt_loader][WMT-DETECT][I]wmt_detect_ext_chip_pwr_off:--
<4>[    6.730634] .(3)[407:wmt_loader]mtk_wcn_cmb_sdio_off (1)
<3>[    6.731467] .(3)[407:wmt_loader][SDIO-DETECT][I]sdio_detect_remove:do sdio remove
<3>[    6.732766] .(3)[407:wmt_loader][SDIO-DETECT][I]sdio_detect_remove:do sdio remove
<6>[    6.733924] .(3)[407:wmt_loader]mmc2: card 0001 removed
<6>[    6.746051] .(3)[407:wmt_loader][msdc]msdc2 -> MSDC Device Request Suspend
<3>[    6.746725] .(3)[407:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO89 to output 0
<3>[    6.747971] .(3)[407:wmt_loader][WMT-DETECT][I]_wmt_detect_output_low:WMT-DETECT: set GPIO90 to output 0
<3>[    6.749404] .(3)[407:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (1074034433),arg(26160)
<3>[    6.750581] .(3)[407:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:chipid(26160)
<4>[    6.751598] .(3)[407:wmt_loader]set current consys chipid (0x6630)
<3>[    6.752422] .(3)[407:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191035),arg(26160)
<3>[    6.753726] .(3)[407:wmt_loader][SDIO-DETECT][I]sdio_detect_exit:sdio_unregister_driver
<3>[    6.754749] .(3)[407:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:cmd (-2147191036),arg(26160)
<3>[    6.755929] .(3)[407:wmt_loader][WMT-DETECT][I]wmt_detect_unlocked_ioctl:kernel object mode
<4>[    6.757033] .(3)[407:wmt_loader][HIF-SDIO][I]hif_sdio_init:start!
<4>[    6.758631] .(3)[407:wmt_loader][STPDbg]stp_dbg_init: stp-dbg init
<4>[    6.760633] .(3)[407:wmt_loader][STPDbg]stp_dbg_core_dump_init: create coredump object OK!
<4>[    6.761747] .(3)[407:wmt_loader][HIF-SDIO][I]WMT_init:driver(major 190) installed
<3>[    6.763234] .(3)[407:wmt_loader][HIF-SDIO][E]wmt_lib_init(282):no pwr on seq and clk par found
<6>[    6.764394] .(3)[407:wmt_loader][I]wmt_export_platform_bridge_register:
<4>[    6.765275] .(3)[407:wmt_loader][WMT-CMB-HW][I]mtk_wcn_cmb_hw_dmp_seq:combo chip power on sequence time, RTC (100), LDO (100), RST(30), OFF(10), ON(30)
<3>[    6.767062] .(3)[407:wmt_loader][CONN-MD-DFT][W]conn_md_add_user:uid (0x80000003) is added to user list successfully
<4>[    6.767537] .(1)[471:mtk_wmtd][HIF-SDIO][I]wmtd_thread:wmtd thread starts
<3>[    6.769593] .(3)[407:wmt_loader][WMT-DETECT][I]wmt_detect_close:close major 154 minor 0 (pid 407)
<14>[    6.771875] .(1)[1:init]init: PropSet [service.wcn.driver.ready]=[yes] Done
<14>[    6.774449] .(6)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.bt_drv.rc:2)
<6>[    6.776129] -(4)[427:vold]configfs-gadget gadget: high-speed config #1: b
<5>[    6.777061] -(4)[427:vold][MUSB]fifo_setup 1238: musb type=BULK
<5>[    6.777834] -(4)[427:vold][MUSB]check_musb_dbuffer_avail 1196: <check_musb_dbuffer_avail, 1196>, got bulk ep:81 in function :mtp
<6>[    6.778250] .(0)[1:init][MTK-BT] BT_init: mtk_stp_bt_chrdev driver(major 192) installed
<14>[    6.778851] .(0)[1:init]init: Service 'wmt_loader' (pid 407) exited with status 0
<14>[    6.779213] .(0)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.gps_drv.rc:3)
<4>[    6.781611] .(0)[1:init]mtk_stp_GPS_chrdev driver(major 191) installed.
<14>[    6.781857] .(0)[1:init]init: PropSet [gps_drv.ko]=[1] Done
<14>[    6.781908] .(0)[1:init]init: processing action (service.wcn.driver.ready=yes) from (/vendor/etc/init/init.wlan_drv.rc:3)
<6>[    6.783972] .(0)[1:init][MTK-WIFI] WIFI_init: mtk_wmt_wifi_chrdev driver(major 153) installed
<5>[    6.786770] -(4)[427:vold][MUSB]is_saving_mode 1012: 0
<5>[    6.787442] -(4)[427:vold][MUSB]fifo_setup 1267: EP1 supports DBBUF
<5>[    6.788256] -(4)[427:vold][MUSB]fifo_setup 1279: fifo size is 22 after 512, fifo address is 512, epnum 1,hwepnum 1
<5>[    6.789580] -(4)[427:vold]QMU_WARN,<mtk_qmu_enable 636>, enable TQ(1)
<5>[    6.790420] -(4)[427:vold][MUSB]musb_gadget_enable 1477: musb-hdrc periph: enabled ep1in for bulk IN, maxpacket 512
<5>[    6.791756] -(4)[427:vold][MUSB]fifo_setup 1238: musb type=BULK
<5>[    6.792520] -(4)[427:vold][MUSB]check_musb_dbuffer_avail 1196: <check_musb_dbuffer_avail, 1196>, got bulk ep:1 in function :mtp
<5>[    6.793982] -(4)[427:vold][MUSB]is_saving_mode 1012: 0
<5>[    6.794654] -(4)[427:vold][MUSB]fifo_setup 1267: EP1 supports DBBUF
<5>[    6.795468] -(4)[427:vold][MUSB]fifo_setup 1279: fifo size is 22 after 512, fifo address is 1536, epnum 1,hwepnum 1
<5>[    6.796803] -(4)[427:vold]QMU_WARN,<mtk_qmu_enable 567>, enable RQ(1)
<5>[    6.797642] -(4)[427:vold][MUSB]musb_gadget_enable 1477: musb-hdrc periph: enabled ep1out for bulk OUT, maxpacket 512
<5>[    6.798997] -(4)[427:vold][MUSB]fifo_setup 1238: musb type=INT
<5>[    6.799751] -(4)[427:vold][MUSB]fifo_setup 1279: fifo size is 6 after 512, fifo address is 2560, epnum 2,hwepnum 2
<5>[    6.801075] -(4)[427:vold]QMU_WARN,<mtk_qmu_enable 636>, enable TQ(2)
<5>[    6.801915] -(4)[427:vold][MUSB]musb_gadget_enable 1477: musb-hdrc periph: enabled ep2in for int IN, maxpacket 28
<6>[    6.803227] -(4)[427:vold]configfs-gadget gadget: [COM]USB_REQ_SET_CONFIGURATION: value=0
<5>[    6.804284] -(4)[427:vold][BATTERY] BAT_SetUSBState Success! Set 2
<5>[    6.805235] .(4)[71:kworker/4:1][MUSB]usb_cable_connected 747: usb_cable_connected vbus_exist=1 type=2
<5>[    6.806435] .(4)[71:kworker/4:1][MUSB]usb_cable_connected 768: usb_cable_connected, connected:1, cable_mode:1, usb_data_lock:0
<6>[    6.807993] .(4)[71:kworker/4:1]android_work: sent uevent USB_STATE=CONFIGURED
<3>[    6.808983] .(4)[71:kworker/4:1]BOOTPROF:      6808.982938:USB configured
<6>[    6.885591] .(5)[1:init][wlan]Reset ALL DBG module log level to DEFAULT!
<6>[    6.886700] .(5)[1:init][wlan]createWirelessDevice:(INIT INFO) Create wireless device success
<6>[    6.888120] .(5)[1:init][wlan]glRegisterBus:(INIT INFO) mtk_sdio: MediaTek SDIO WLAN driver
<6>[    6.889290] .(5)[1:init][wlan]glRegisterBus:(INIT INFO) mtk_sdio: Copyright MediaTek Inc.
<14>[    6.890548] .(5)[1:init]init: Command 'insmod /vendor/lib/modules/wlan_drv_${ro.wlan.gen}.ko' action=service.wcn.driver.ready=yes (/vendor/etc/init/init.wlan_drv.rc:5) returned 0 took 106ms.
<14>[    6.892879] .(5)[1:init]init: processing action (persist.mtk.wcn.coredump.mode=* && service.wcn.driver.ready=yes) from (/vendor/etc/init/init_connectivity.rc:26)
<4>[    6.894994] .(5)[1:init][WMT-DEV][I]wmt_dbg_write:write parameter len = 6
<4>[    6.894994] 
<4>[    6.895723] [WMT-DEV][I]wmt_dbg_write:write parameter data = 0x15 0
<4>[    6.895723] 
.(5)[1:init][WMT-DEV][I]wmt_dbg_write:y = 0x00000000
<4>[    6.896808] 
<4>[    6.897265] [WMT-DEV][I]wmt_dbg_write:x(0x00000015), y(0x00000000), z(0x0000000a)
<4>[    6.897265] 
<4>[    6.898458] .(5)[1:init][STP] mtk_wcn_stp_coredump_flag_ctrl:[I] disable coredump function.
<14>[    6.986349] .(5)[1:init]init: PropSet [service.sf.present_timestamp]=[1] Done
<6>[    6.987426] .(2)[386:composer@2.1-se]mtk-tpd: tpd_fb_notifier_callback
<5>[    6.987503] .(2)[386:composer@2.1-se][Power/PPM] @ppm_lcmoff_switch: onoff = 1
<6>[    6.987508] .(2)[386:composer@2.1-se]#@# cm_mgr_fb_notifier_callback(176) SCREEN ON
<6>[    6.987511] .(2)[386:composer@2.1-se]mtk-tpd: tpd_fb_notifier_callback
<6>[    6.987513] .(2)[386:composer@2.1-se]mtk-tpd: fb_notify(blank=0)
<6>[    6.987516] .(2)[386:composer@2.1-se]mtk-tpd: LCD ON Notify
<4>[    6.987521] .(2)[386:composer@2.1-se][HIF-SDIO][W]wmt_fb_notifier_callback:@@@@@@@@@@wmt enter UNBLANK @@@@@@@@@@@@@@
<14>[    6.989762] .(0)[1:init]init: PropSet [service.bootanim.exit]=[0] Done
<14>[    6.991909] .(0)[1:init]init: [PropSet]: pid:398 uid:1000 gid:1003 ctl.start, bootanim
<14>[    6.992316] .(0)[1:init]init: starting service 'bootanim'...
<3>[    6.993910] .(1)[481:SurfaceFlinger:]BOOTPROF:      6993.908169:BOOT_Animation:START
<4>[    7.022781] .(3)[408:wmt_launcher][HIF-SDIO][I]WMT_open:major 190 minor 0 (pid 408)
<4>[    7.023782] .(3)[408:wmt_launcher][HIF-SDIO][I]WMT_open:1st call
<4>[    7.024679] .(3)[408:wmt_launcher][WMT-PLAT][I]wmt_plat_merge_if_flag_ctrl:set gWmtMergeIfSupport to 1
<3>[    7.029375] .(1)[408:wmt_launcher][WMT-CONF][E]wmt_conf_set_cfg_file(445):WMT config file is set to (mt6630_ant_m1.cfg)
<4>[    7.030804] .(1)[408:wmt_launcher][HIF-SDIO][I]WMT_unlocked_ioctl:luncher set STP mode success!
<4>[    7.030818] .(0)[471:mtk_wmtd][HIF-SDIO][I]wmtd_thread:pOp(ffffff8000cdd260):0-1-1,0,0,2
<3>[    7.030826] .(0)[471:mtk_wmtd][WMT-CORE][E]opfunc_hif_conf(1042):WMT-CORE: WMT HIF info added
<4>[    7.034116] .(1)[408:wmt_launcher][STP] mtk_wcn_stp_set_wmt_last_close:[I] set wmt_last_close flag (0)
<14>[    7.036699] .(0)[1:init]init: PropSet [service.wcn.formeta.ready]=[yes] Done
<3>[    7.146075] .(6)[427:vold]BOOTPROF:      7146.073323:vold:scrypt_keymaster:END
<3>[    7.147175] .(6)[427:vold]BOOTPROF:      7147.175400:vold:decrypt_master_key:END
<6>[    7.152763] .(6)[427:vold][dm-crypt] dev path: /dev/block/platform/bootdevice/by-name/userdata, type: 0
<6>[    7.153987] .(6)[427:vold][dm-crypt] dev path: /dev/block/platform/bootdevice/by-name/userdata, type: 0
<4>[    7.316423] [TKCORE] it_session_with_signed_ta:1882:       dyn TA : 02662e8e-e126-11e5-b8-6d-9a-79-f0-6e-94-78
<4>[    7.316423] [   19.087380]: <4>DBG TKCore:tee_ta_open_session:1988: [TA 02662e8e: 0] init session
<4>[    7.316423] [   19.512534]: <4>DBG TKCore:elf_load_body:450: Set TLS offset for TA: 0x24b9f[TKCORE] 4
<4>[    7.316423] [   19.515701]: <4>DBG TKCore:tee_ta_load:1170: Loaded TA at 0xf0220000
<4>[    7.316423] [   19.516606]: <4>DBG TKCore:tee_ta_load:1171: ELF load address 0x200000
<4>[    7.316423] [   19.517489]: <4>DBG TKCore:tee_ta_init_session_with_signed_ta:1882:       dyn TA : 9ef77781-7bd5-4e39-96[TKCORE] -5f-20-f6-f2-11-f4-6b
<4>[    7.316423] [   19.531802]: <4>DBG TKCore:tee_ta_open_session:1988: [TA 9ef77781: 0] init session
<4>[    7.316423] [   19.549979]: <4>ERR KEYMASTER:judge_rpmb:93: TEE_RPMB_MakeFileSystem return 0xf0100003
<4>[    7.316423] [   19.551030]: <4>INF KEYMASTER:key_store_init:147: no R[TKCORE] PMB for ksk
<4>[    7.325335] [   19.552504]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x19 pSessionContext 0x0 nParamTypes 0x53
<4>[    7.325335] [   19.555307]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1378: configure
<4>[    7.325335] [   19.653307]: <4>IN.(5)[427:vold][TKCORE] F KEYMASTER:TA_InvokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x10 pSessionContext 0x0 nParamTypes 0x653
<4>[    7.328853] [   19.655022]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1369: begin
<4>[    7.328853] [   19.656872]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoi[TKCORE] nt:1363: TA_InvokeCommandEntryPoint nCommandID 0x11 pSessionContext 0x0 nParamTypes 0x653
<4>[    7.328853] [   19.658578]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1370: update
<4>[    7.328853] [   19.660098]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint[TKCORE]  nCommandID 0x11 pSessionContext 0x0 nParamTypes 0x653
<4>[    7.328853] [   19.661949]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1370: update
<4>[    7.328853] [   19.663171]: <4>INF KEYMASTER:TA_InvokeCommandEntryPoint:1363: TA_InvokeCommandEntryPoint nCommandID 0x12 pSessionContext 0x
<3>[    7.571744] .(5)[427:vold]BOOTPROF:      7571.741863:vold:cryptfs_restart_internal:START
<4>[    7.575796] .(5)[427:vold]EXT4-fs (dm-2): Ignoring removed nomblk_io_submit option
<6>[    7.581685] .(5)[427:vold]EXT4-fs (dm-2): mounted filesystem with ordered data mode. Opts: errors=remount-ro,nomblk_io_submit
<14>[    7.636196] .(1)[427:vold]e2fsck: e2fsck 1.43.3 (04-Sep-2016)
<14>[    7.636196] 
<14>[    7.637239] .(1)[427:vold]e2fsck: data: clean, 4569/1605632 files, 195146/6419451 blocks (check in 2 mounts)
<14>[    7.637239] 
<6>[    7.644033] .(2)[427:vold]EXT4-fs (dm-2): mounted filesystem with ordered data mode. Opts: noauto_da_alloc,errors=panic
<14>[    7.646432] .(0)[1:init]init: PropSet [vold.post_fs_data_done]=[0] Done
<14>[    7.649145] .(0)[1:init]init: PropSet [vold.decrypt]=[trigger_post_fs_data] Done
<14>[    7.651536] .(0)[1:init]init: processing action (vold.decrypt=trigger_post_fs_data) from (/init.rc:727)
<14>[    7.652827] .(0)[1:init]init: processing action (vold.decrypt=trigger_post_fs_data) from (/vendor/etc/init/hw/init.mt6763.rc:910)
<3>[    7.654400] .(0)[1:init]BOOTPROF:      7654.398709:INIT:vold.decrypt=trigger_post_fs_data
<14>[    7.655532] .(0)[1:init]init: processing action (post-fs-data) from (/init.rc:420)
<14>[    7.761586] .(1)[1:init]init: starting service 'exec 5 (/system/bin/vdc --wait cryptfs init_user0)'...
<14>[    7.763938] .(1)[1:init]init: SVC_EXEC pid 498 (uid 0 gid 0+0 context default) started; waiting...
<14>[    7.781404] .(0)[1:init]init: Service 'exec 5 (/system/bin/vdc --wait cryptfs init_user0)' (pid 498) exited with status 0 waiting took 0.020000 seconds
<14>[    7.784441] .(0)[1:init]selinux: SELinux: Skipping restorecon_recursive(/data)
<14>[    7.784441] 
<14>[    7.786256] .(0)[1:init]init: starting service 'exec 6 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)'...
<14>[    7.789222] .(0)[1:init]init: SVC_EXEC pid 502 (uid 1000 gid 1000+0 context default) started; waiting...
<14>[    7.805028] .(0)[1:init]init: Service 'exec 6 (/system/bin/tzdatacheck /system/usr/share/zoneinfo /data/misc/zoneinfo)' (pid 502) exited with status 0 waiting took 0.019000 seconds
<14>[    7.807379] .(0)[1:init]init: processing action (post-fs-data) from (/init.usb.rc:6)
<14>[    7.812031] .(2)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.mt6763.rc:157)
<3>[    7.813454] .(2)[1:init]BOOTPROF:      7813.453325:INIT:post-fs-data
<11>[    7.814619] .(2)[1:init]init: Unable to open '/sys/block/sdc/queue/iostats': No such file or directory
<11>[    7.815911] .(2)[1:init]init: Unable to open '/sys/block/sdc/queue/read_ahead_kb': No such file or directory
<11>[    7.817296] .(2)[1:init]init: Unable to open '/sys/block/sdc/queue/nr_requests': No such file or directory
<14>[    7.819050] .(2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvcfg)
<14>[    7.819050] 
<14>[    7.823199] .(2)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/nvdata)
<14>[    7.823199] 
<14>[    7.860598] .(3)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.connectivity.rc:3)
<14>[    7.867309] .(6)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.project.rc:15)
<14>[    7.870136] .(6)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.aee.rc:1)
<14>[    7.879405] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.sensor_1_0.rc:2)
<14>[    7.883849] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hw/init.modem.rc:19)
<3>[    7.885188] .(5)[1:init]BOOTPROF:      7885.187787:post-fs-data: on modem start
<14>[    7.886253] .(5)[1:init]init: PropSet [vold.post_fs_data_done]=[1] Done
<14>[    7.887346] .(5)[1:init]init: PropSet [vold.decrypt]=[trigger_load_persist_props] Done
<14>[    7.888457] .(5)[1:init]init: processing action (post-fs-data) from (/system/etc/init/bootstat.rc:3)
<14>[    7.890958] .(5)[1:init]init: PropSet [vold.decrypt]=[trigger_restart_framework] Done
<14>[    7.893696] .(5)[1:init]init: processing action (init.svc.bootanim=running && ro.crypto.type=block && post-fs-data) from (/system/etc/init/bootstat.rc:44)
<14>[    7.896087] .(5)[1:init]init: starting service 'exec 7 (/system/bin/bootstat -r post_decrypt_time_elapsed)'...
<14>[    7.898763] .(5)[1:init]init: SVC_EXEC pid 503 (uid 1000 gid 1007+0 context default) started; waiting...
<14>[    7.918666] .(5)[1:init]init: Service 'exec 7 (/system/bin/bootstat -r post_decrypt_time_elapsed)' (pid 503) exited with status 0 waiting took 0.023000 seconds
<14>[    7.920876] .(5)[1:init]init: processing action (post-fs-data) from (/system/etc/init/mobile_log_d.rc:1)
<14>[    7.924396] .(0)[1:init]init: processing action (post-fs-data) from (/system/etc/init/sn.rc:1)
<14>[    7.925852] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/android.hardware.audio@2.0-service-mediatek.rc:1)
<14>[    7.928106] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/hostapd.android.rc:9)
<14>[    7.930134] .(0)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccifsd.rc:5)
<14>[    7.931561] .(4)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_f)
<14>[    7.931561] 
<14>[    7.933017] .(4)[1:init]selinux: SELinux: Skipping restorecon_recursive(/vendor/protect_s)
<14>[    7.933017] 
<14>[    7.934365] .(4)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.cccimdinit.rc:4)
<14>[    7.940187] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/init.wod.rc:1)
<14>[    7.946266] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/mtk_agpsd.rc:1)
<14>[    7.948729] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/statusd.rc:1)
<14>[    7.951399] .(5)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/trustkernel.rc:7)
<3>[    7.952731] .(5)[1:init]BOOTPROF:      7952.730018:tkcore: prep SFS
<3>[    7.955401] .(7)[1:init]BOOTPROF:      7955.400402:tkcore: prep PP
<3>[    7.956949] .(7)[1:init]BOOTPROF:      7956.948633:tkcore: prep SPTA
<14>[    7.959433] .(7)[1:init]init: processing action (post-fs-data) from (/vendor/etc/init/vendor.mediatek.hardware.power@1.1-service.rc:1)
<14>[    7.967670] .(7)[1:init]init: processing action (vold.decrypt=trigger_load_persist_props) from (/init.rc:722)
<14>[    7.977523] .(6)[1:init]init: PropSet [persist.atm.mdmode]=[normal] Done
<14>[    7.983156] .(7)[1:init]init: PropSet [persist.sys.pq.mdp.color.idx]=[0] Done
<14>[    7.988934] .(7)[1:init]init: PropSet [persist.sys.pq.adl.idx]=[0] Done
<14>[    7.994353] .(7)[1:init]init: PropSet [persist.sys.pq.iso.shp.en]=[2] Done
<14>[    8.000293] .(5)[1:init]init: PropSet [persist.sys.pq.ultrares.en]=[2] Done
<14>[    8.005966] .(6)[1:init]init: PropSet [persist.sys.pq.mdp.color.dbg]=[1] Done
<14>[    8.011531] .(6)[1:init]init: PropSet [persist.sys.pq.log.en]=[0] Done
<14>[    8.016009] .(6)[1:init]init: PropSet [persist.sys.pq.hdr.en]=[1] Done
<14>[    8.021052] .(2)[1:init]init: PropSet [persist.sys.pq.mdp.ccorr.en]=[2] Done
<14>[    8.026040] .(3)[1:init]init: PropSet [persist.sys.pq.mdp.dre.en]=[2] Done
<14>[    8.030241] .(2)[1:init]init: PropSet [persist.sys.bluelight.default]=[128] Done
<14>[    8.036220] .(3)[1:init]init: PropSet [persist.sys.pq.shp.idx]=[2] Done
<14>[    8.040468] .(3)[1:init]init: PropSet [persist.radio.sim.opid]=[0] Done
<14>[    8.044869] .(3)[1:init]init: PropSet [persist.radio.simswitch]=[1] Done
<14>[    8.048875] .(2)[1:init]init: PropSet [persist.radio.lastsim1_iccid]=[null] Done
<14>[    8.052973] .(1)[1:init]init: PropSet [persist.radio.c_capability_slot]=[1] Done
<14>[    8.058113] .(1)[1:init]init: PropSet [persist.radio.raf1]=[94714] Done
<14>[    8.062990] .(0)[1:init]init: PropSet [persist.radio.last_iccid_sim1]=[N/A] Done
<14>[    8.068161] .(3)[1:init]init: PropSet [persist.radio.rilj_nw_type1]=[-1] Done
<14>[    8.072649] .(3)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[    8.077622] .(3)[1:init]init: PropSet [persist.sys.usb.config]=[adb] Done
<14>[    8.082260] .(2)[1:init]init: PropSet [persist.sys.webview.vmsize]=[125701040] Done
<14>[    8.086565] .(2)[1:init]init: PropSet [persist.radio.airplane.mode.on]=[false] Done
<14>[    8.094703] .(1)[1:init]init: PropSet [persist.radio.cellular_ps_reg]=[0] Done
<14>[    8.102702] .(3)[1:init]init: PropSet [persist.radio.volte_state]=[1] Done
<14>[    8.106721] .(0)[1:init]init: PropSet [persist.radio.sim.mode]=[1] Done
<5>[    8.108818] -(3)[245:mmcqd/0]random: nonblocking pool is initialized
<14>[    8.119871] .(0)[1:init]init: PropSet [persist.radio.data.iccid]=[89860119933700000608] Done
<14>[    8.124553] .(1)[1:init]init: PropSet [persist.sys.mtk.disable.moms]=[0] Done
<14>[    8.128812] .(1)[1:init]init: PropSet [persist.service.stk.shutdown]=[0] Done
<14>[    8.133469] .(1)[1:init]init: PropSet [persist.mtk.wcn.patch.version]=[20181019b001011] Done
<14>[    8.138236] .(1)[1:init]init: PropSet [persist.dlwifi.wifi_band_selection]=[2] Done
<14>[    8.143588] .(1)[1:init]init: PropSet [persist.netd.stable_secret]=[5afd:1aff:dea:7718:933c:b393:876:5bb8] Done
<14>[    8.149134] .(1)[1:init]init: PropSet [persist.radio.airplane_mode_on]=[0] Done
<14>[    8.153958] .(2)[1:init]init: PropSet [persist.sys.nlp.enabled]=[0] Done
<14>[    8.158161] .(0)[1:init]init: PropSet [persist.radio.simswitchstate]=[0] Done
<14>[    8.163295] .(1)[1:init]init: PropSet [persist.radio.unlock]=[false] Done
<14>[    8.167162] .(1)[1:init]init: PropSet [persist.radio.sim.status]=[] Done
<14>[    8.172184] .(1)[1:init]init: PropSet [persist.radio.cfu.iccid.0]=[89860119933700000608] Done
<14>[    8.177131] .(0)[1:init]init: PropSet [persist.radio.cfu.change.0]=[1] Done
<14>[    8.191152] .(6)[1:init]init: PropSet [persist.radio.terminal-based.cw]=[disabled_tbcw] Done
<14>[    8.195610] .(6)[1:init]init: PropSet [persist.radio.cfu.timeslot.0]=[] Done
<14>[    8.200944] .(1)[1:init]init: PropSet [persist.radio.cfu.mode]=[disabled_cfu_mode] Done
<14>[    8.206367] .(2)[1:init]init: PropSet [persist.radio.cfu_over_ims]=[0] Done
<14>[    8.210661] .(2)[1:init]init: PropSet [persist.radio.new.sim.slot]=[] Done
<14>[    8.214997] .(2)[1:init]init: PropSet [persist.radio.simswitch.iccid]=[89860119933700000608] Done
<14>[    8.219226] .(2)[1:init]init: PropSet [persist.sys.gps.lpp]=[] Done
<14>[    8.224575] .(3)[1:init]init: PropSet [persist.mtk.volte.enable]=[1] Done
<14>[    8.240179] .(2)[1:init]init: PropSet [persist.mtk.wfc.enable]=[0] Done
<14>[    8.244836] .(2)[1:init]init: PropSet [persist.mtk.vilte.enable]=[0] Done
<14>[    8.249269] .(2)[1:init]init: PropSet [persist.mtk.viwifi.enable]=[0] Done
<14>[    8.253362] .(2)[1:init]init: PropSet [persist.sys.locale]=[zh-Hans-CN] Done
<14>[    8.258972] .(0)[1:init]init: PropSet [persist.dlwifi.periodic_scan_interval_ms]=[1000] Done
<14>[    8.263737] .(0)[1:init]init: PropSet [persist.dlwifi.max_periodic_scan_interval_ms]=[16000] Done
<14>[    8.277425] .(1)[1:init]init: PropSet [persist.dlwifi.cpsinterval_ms]=[2000] Done
<14>[    8.281675] .(1)[1:init]init: PropSet [persist.dlwifi.mcpsinterval_ms]=[16000] Done
<14>[    8.286141] .(1)[1:init]init: PropSet [persist.dlwifi.disconnected_pno_scan_interval_ms]=[2000] Done
<14>[    8.290620] .(1)[1:init]init: PropSet [persist.dlwifi.connected_pno_scan_interval_ms]=[16000] Done
<14>[    8.295385] .(1)[1:init]init: PropSet [persist.dlwifi.low_rssi_network_retry_start_delay_ms]=[2000] Done
<14>[    8.300969] .(2)[1:init]init: PropSet [persist.dlwifi.low_rssi_network_retry_max_delay_ms]=[8000] Done
<14>[    8.305568] .(0)[1:init]init: PropSet [persist.mtklog.log2sd.path]=[internal_sd] Done
<11>[    8.306743] .(0)[1:init]init: property_set("ro.persistent_properties.ready", "true") failed: property already set
<14>[    8.308093] .(0)[1:init]init: Command 'load_persist_props' action=vold.decrypt=trigger_load_persist_props (/init.rc:723) returned 0 took 339ms.
<14>[    8.310602] .(0)[1:init]init: starting service 'logd-reinit'...
<14>[    8.313154] .(0)[1:init]init: processing action (vold.decrypt=trigger_load_persist_props) from (/vendor/etc/init/hw/init.aee.rc:18)
<14>[    8.314825] .(0)[1:init]init: Sending signal 9 to service 'aee_aedv' (pid 359) process group...
<14>[    8.321616] .(0)[1:init]init: Successfully killed process cgroup uid 0 pid 359 in 5ms
<14>[    8.323246] .(0)[1:init]init: Service 'aee_aedv' (pid 359) killed by signal 9
<14>[    8.324925] .(0)[1:init]init: Sending signal 9 to service 'aee_aedv64' (pid 360) process group...
<14>[    8.331693] .(0)[1:init]init: Successfully killed process cgroup uid 0 pid 360 in 5ms
<14>[    8.333068] .(0)[1:init]init: Service 'aee_aedv64' (pid 360) killed by signal 9
<14>[    8.334365] .(0)[1:init]init: Sending signal 9 to service 'aee_aed' (pid 356) process group...
<30>[    8.334909] .(6)[352:logd.daemon]logd.daemon: reinit
<14>[    8.341723] .(0)[1:init]init: Successfully killed process cgroup uid 0 pid 356 in 5ms
<14>[    8.343051] .(0)[1:init]init: Service 'aee_aed' (pid 356) killed by signal 9
<14>[    8.344229] .(0)[1:init]init: Service 'logd-reinit' (pid 518) exited with status 0
<14>[    8.345588] .(0)[1:init]init: Sending signal 9 to service 'aee_aed64' (pid 358) process group...
<14>[    8.352283] .(0)[1:init]init: Successfully killed process cgroup uid 0 pid 358 in 5ms
<14>[    8.353918] .(0)[1:init]init: PropSet [log.tag]=[I] Done
<14>[    8.356147] .(0)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/init.rc:735)
<31>[    8.356488] .(3)[352:logd.daemon]logd: logd no log reader, set log level to INFO!
<11>[    8.357477] .(0)[1:init]init: ExecStart(update_verifier): Service not found
<14>[    8.358451] .(0)[1:init]init: Service 'aee_aed64' (pid 358) killed by signal 9
<14>[    8.360600] .(0)[1:init]init: starting service 'flash_recovery'...
<11>[    8.362743] .(0)[1:init]init: cannot find '/system/bin/cmmbsp', disabling 'cmmb': No such file or directory
<14>[    8.364941] .(0)[1:init]init: starting service 'mnld'...
<14>[    8.368008] .(0)[1:init]init: starting service 'zygote'...
<14>[    8.368386] .(1)[520:init]init: Created socket '/dev/socket/mnld', mode 660, user 1021, group 1000
<14>[    8.371968] .(0)[1:init]init: starting service 'zygote_secondary'...
<14>[    8.373255] .(1)[521:init]init: Created socket '/dev/socket/zygote', mode 660, user 0, group 1000
<14>[    8.375108] .(0)[1:init]init: starting service 'aal'...
<14>[    8.379174] .(0)[1:init]init: starting service 'audioserver'...
<14>[    8.379978] .(1)[522:init]init: Created socket '/dev/socket/zygote_secondary', mode 660, user 0, group 1000
<14>[    8.382650] .(0)[1:init]init: starting service 'batterywarning'...
<14>[    8.386538] .(0)[1:init]init: starting service 'cameraserver'...
<14>[    8.390341] .(0)[1:init]init: starting service 'drm'...
<11>[    8.391981] .(1)[527:init]init: couldn't write 527 to /dev/cpuset/camera-daemon/tasks: No such file or directory
<14>[    8.394034] .(0)[1:init]init: starting service 'thermald'...
<14>[    8.397277] .(4)[1:init]init: starting service 'vtservice'...
<14>[    8.400519] .(4)[1:init]init: starting service 'installd'...
<14>[    8.403117] .(4)[1:init]init: starting service 'keystore'...
<14>[    8.405947] .(4)[1:init]init: starting service 'mediadrm'...
<14>[    8.408704] .(4)[1:init]init: starting service 'mediaextractor'...
<14>[    8.412508] .(4)[1:init]init: starting service 'mediametrics'...
<14>[    8.415653] .(4)[1:init]init: starting service 'media'...
<14>[    8.418898] .(4)[1:init]init: starting service 'met_log_d'...
<14>[    8.422191] .(4)[1:init]init: starting service 'mobile_log_d'...
<14>[    8.425728] .(4)[1:init]init: starting service 'mtk_advcamserver'...
<14>[    8.430210] .(4)[1:init]init: starting service 'netd'...
<14>[    8.433613] .(7)[541:init]init: Created socket '/dev/socket/netd', mode 660, user 0, group 1000
<14>[    8.433933] .(4)[1:init]init: starting service 'netdiag'...
<14>[    8.435843] .(4)[1:init]init: starting service 'PPLAgent'...
<14>[    8.436105] .(7)[541:init]init: Created socket '/dev/socket/dnsproxyd', mode 660, user 0, group 3003
<14>[    8.436988] .(7)[541:init]init: Created socket '/dev/socket/mdns', mode 660, user 0, group 1000
<14>[    8.437803] .(7)[541:init]init: Created socket '/dev/socket/fwmarkd', mode 660, user 0, group 3003
<14>[    8.442124] .(4)[1:init]init: starting service 'storaged'...
<14>[    8.445234] .(4)[1:init]init: starting service 'wificond'...
<14>[    8.448510] .(4)[1:init]init: starting service 'mediacodec'...
<14>[    8.454252] .(7)[1:init]init: starting service 'sensors-hal-1-0'...
<14>[    8.457598] .(7)[1:init]init: starting service 'camerahalserver'...
<14>[    8.461590] .(7)[1:init]init: starting service 'fuelgauged_nvram'...
<14>[    8.465183] .(7)[1:init]init: starting service 'thermal'...
<14>[    8.468226] .(7)[1:init]init: starting service 'thermal_manager'...
<11>[    8.468491] .(6)[548:init]init: couldn't write 548 to /dev/cpuset/camera-daemon/tasks: No such file or directory
<14>[    8.473816] .(7)[1:init]init: starting service 'thermalloadalgod'...
<14>[    8.479203] .(7)[1:init]init: starting service 'ipsec_mon'...
<14>[    8.483312] .(7)[1:init]init: starting service 'lbs_hidl_service'...
<14>[    8.488754] .(7)[1:init]init: starting service 'agpsd'...
<14>[    8.492526] .(7)[1:init]init: starting service 'NvRAMAgent'...
<14>[    8.495891] .(6)[555:init]init: Created socket '/dev/socket/agpsd', mode 660, user 1021, group 1000
<14>[    8.495930] .(7)[1:init]init: starting service 'nvram_daemon'...
<14>[    8.500701] .(7)[1:init]init: starting service 'sysenv_daemon'...
<14>[    8.500832] .(6)[555:init]init: Created socket '/dev/socket/agpsd2', mode 660, user 1021, group 3003
<14>[    8.501507] .(6)[555:init]init: Created socket '/dev/socket/agpsd3', mode 660, user 1021, group 3003
<14>[    8.514658] .(7)[1:init]init: starting service 'gnss_service'...
<14>[    8.518091] .(7)[1:init]init: starting service 'pq-2-0'...
<14>[    8.526263] .(7)[1:init]init: starting service 'wifi2agps'...
<14>[    8.529035] .(7)[1:init]init: Command 'class_start main' action=vold.decrypt=trigger_restart_framework (/init.rc:738) returned 0 took 169ms.
<14>[    8.531297] .(7)[1:init]init: PropSet [debug.met.running]=[0] Done
<11>[    8.541859] .(7)[1:init]init: cannot find '/vendor/bin/STFlashTool', disabling 'stflashtool': No such file or directory
<14>[    8.545153] .(7)[1:init]init: starting service 'gatekeeperd'...
<14>[    8.548272] .(7)[1:init]init: starting service 'program_binary'...
<6>[    8.549213] .(2)[542:netdiag]capability: warning: `netdiag' uses 32-bit capabilities (legacy support in use)
<11>[    8.554241] .(6)[549:fuelgauged_nvra]NVRAM: fgauge_nvram: service.nvram_init=
<14>[    8.556538] .(7)[1:init]init: starting service 'sn'...
<14>[    8.559432] .(7)[1:init]init: starting service 'tombstoned'...
<14>[    8.581242] .(7)[1:init]init: starting service 'netdagent'...
<14>[    8.583789] .(7)[1:init]init: Command 'class_start late_start' action=vold.decrypt=trigger_restart_framework (/init.rc:739) returned 0 took 51ms.
<3>[    8.584752] .(3)[555:mtk_agpsd]Dump cpuinfo
<14>[    8.593915] .(7)[572:init]init: Created socket '/dev/socket/tombstoned_crash', mode 666, user 1000, group 1000
<14>[    8.608032] .(7)[1:init]init: PropSet [debug.met_log_d.version]=[V6.0.0] Done
<14>[    8.609438] .(7)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/hw/init.mt6763.rc:919)
<14>[    8.611481] .(7)[572:init]init: Created socket '/dev/socket/tombstoned_intercept', mode 666, user 1000, group 1000
<3>[    8.616664] .(7)[1:init]BOOTPROF:      8616.663481:INIT:vold.decrypt=trigger_restart_framework
<14>[    8.618579] .(7)[1:init]init: PropSet [debug.mtklog.netlog.Running]=[0] Done
<3>[    8.620485] .(5)[559:sysenv_daemon]ENV_USER_INIT!
<3>[    8.621173] .(5)[559:sysenv_daemon]ENV_USER_INIT!
<14>[    8.622133] .(7)[572:init]init: Created socket '/dev/socket/tombstoned_java_trace', mode 666, user 1000, group 1000
<14>[    8.624721] .(7)[1:init]init: PropSet [net.ims.ipsec.version]=[2.0] Done
<11>[    8.625758] .(7)[1:init]init: do_start: Service msensord not found
<14>[    8.627402] .(7)[1:init]init: PropSet [debug.met_log_d.user]=[shell] Done
<11>[    8.629105] .(7)[1:init]init: do_start: Service permission_check not found
<14>[    8.630709] .(7)[1:init]init: PropSet [debug.MB.running]=[0] Done
<14>[    8.631629] .(7)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/md_ctrl.rc:7)
<14>[    8.634612] .(7)[1:init]init: starting service 'start_modem'...
<14>[    8.638823] .(7)[1:init]init: [PropSet]: pid:545 uid:1010 gid:1010 ctl.stop, wpa_supplicant
<14>[    8.640390] .(7)[1:init]init: processing action (vold.decrypt=trigger_restart_framework) from (/vendor/etc/init/sysenv_daemon.rc:4)
<14>[    8.642889] .(7)[1:init]init: [PropSet]: pid:545 uid:1010 gid:1010 ctl.stop, hostapd
<5>[    8.655327] .(4)[551:thermal_manager][Thermal/TZ/BTS] mtkts_bts_prepare_table table_num=7
<5>[    8.669145] .(6)[551:thermal_manager][Thermal/TZ/BTSMDPA] mtkts_btsmdpa_prepare_table table_num=7
<4>[    8.670649] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_write_atm_setting input 0 2000 10 15 1 685 0 280 0
<4>[    8.675148] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_write_dtm_setting applied 0 2000 10 15 1 685 1582 332 576
<4>[    8.676873] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_write_atm_setting input 1 1000 10 15 1 400 0 220 0
<4>[    8.678211] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_write_dtm_setting applied 1 1000 10 15 1 400 1582 332 576
<4>[    8.679817] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_write_ctm input 2 85000 59000 43000 46000 75000 52000 457636 8666 404682 7667 500 500 13500 -1
<4>[    8.689913] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    8.695487] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    8.696663] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    8.697671] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_unbind unbinding OK
<4>[    8.700753] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 0
<4>[    8.701779] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 2
<4>[    8.702755] .(6)[551:thermal_manager][Thermal/TZ/CPU]tscpu_bind binding OK, 1
<4>[    8.712049] -(6)[551:thermal_manager]mt6356_get_auxadc_value: 29 callbacks suppressed
<4>[    8.723552] .(5)[551:thermal_manager]=====FG===== AC   = -47
<4>[    8.726497] .(5)[551:thermal_manager][HIF-SDIO][I]wmt_lib_is_therm_ctrl_support:thermal command can`t send: STP is not enable(0) or ready(0)
<4>[    8.730487] .(5)[551:thermal_manager][HIF-SDIO][I]wmt_dev_tm_temp_query:[Thermal] current_temp = 0x0
<4>[    8.741834] .(5)[551:thermal_manager]=====   BTS BB Mainboard output output mV = 372
<4>[    8.742858] .(5)[551:thermal_manager]======  BTS BB Mainboard output temperature = 24
<4>[    8.744003] .(5)[551:thermal_manager][Thermal/TC/bcct]chrlmt_set_limit ffffff8009a77350 -1 -1 5000
<4>[    8.744034] .(1)[187:kworker/u17:1][Thermal/TC/bcct]chrlmt_set_limit_handler -1 -1
<5>[    8.744045] .(1)[187:kworker/u17:1]charger_manager_set_input_current_limit: dev:mtk-cooler-bcct idx:0 en:-1
<4>[    8.744230] .(0)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.744239] .(0)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.744246] .(0)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.745365] .(3)[187:kworker/u17:1][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    8.746046] .(0)[187:kworker/u17:1]temp_now=225, temp_last=225 
<4>[    8.746056] .(0)[187:kworker/u17:1]=====FG===== TEMP = 225
<4>[    8.747991] .(0)[187:kworker/u17:1]=====FG===== VOLT = 4311
<4>[    8.748017] .(0)[187:kworker/u17:1]=====FG===== actural VOLT = 4316
<4>[    8.748684] .(3)[187:kworker/u17:1]=====FG===== AC   = -47
<4>[    8.750221] .(3)[187:kworker/u17:1]=====FG===== SOC  = 100
<4>[    8.750918] .(3)[187:kworker/u17:1]=====FG===== SOH  = 100
<4>[    8.750935] .(3)[187:kworker/u17:1]DLCP bat_vol=4316,  temperature=225  
<4>[    8.750939] .(3)[187:kworker/u17:1] ===CC_value from battery temprature=2000000
<4>[    8.750948] .(3)[187:kworker/u17:1]DLCP __mt6370_set_ieoc      = 150000
<4>[    8.751318] .(3)[187:kworker/u17:1]DLCP mt6370_set_vrech       = 300
<4>[    8.753244] .(3)[187:kworker/u17:1]DLCP mt6370_get_vrech       = 300
<4>[    8.753270] .(3)[187:kworker/u17:1]DLCP read cv              = 4350000
<4>[    8.753274] .(3)[187:kworker/u17:1]DLCP read eoc             = 250000
<4>[    8.753276] .(3)[187:kworker/u17:1]DLCP read recharge        = 300
<4>[    8.753279] .(3)[187:kworker/u17:1]DLCP Target Temp          = 410
<4>[    8.753281] .(3)[187:kworker/u17:1]DLCP Charge Current       = 2000
<4>[    8.753283] .(3)[187:kworker/u17:1]DLPID 
<4>[    8.753285] .(3)[187:kworker/u17:1]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    8.753287] .(3)[187:kworker/u17:1]DLPID PID Target Temp = 410 
<4>[    8.753290] .(3)[187:kworker/u17:1]DLPID Battery Temp    = 225 
<4>[    8.753292] .(3)[187:kworker/u17:1]DLPID TEMP DIFF       = 161 
<4>[    8.753294] .(3)[187:kworker/u17:1]DLPID PID KI          = 5000 
<4>[    8.753297] .(3)[187:kworker/u17:1]DLPID CC MAX          = 2000000 
<4>[    8.753299] .(3)[187:kworker/u17:1]DLPID PID Current     = 1995000 
<4>[    8.753301] .(3)[187:kworker/u17:1]DLCP ccurrent from charge type        = 500000
<4>[    8.753303] .(3)[187:kworker/u17:1]DLCP ccurrent from battery temprature = 2000000
<4>[    8.753306] .(3)[187:kworker/u17:1]DLCP ccurrent from PID algorithm      = 1995000
<4>[    8.753308] .(3)[187:kworker/u17:1]DLCP ccurrent from DLPL               = 2000000
<4>[    8.753312] .(3)[187:kworker/u17:1]DLCP set input current:500000 
<4>[    8.753495] .(1)[187:kworker/u17:1]DLCP set charge current: 500000 
<4>[    8.755029] .(0)[187:kworker/u17:1]DLCP mt6370_enable_charging :1 
<5>[    8.755488] .(3)[187:kworker/u17:1]charger_manager_set_charging_current_limit: dev:mtk-cooler-bcct idx:0 en:-1
<5>[    8.755493] .(0)[265:charger_thread][charger_routine_thread]flags=0,1 
<4>[    8.755524] .(0)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.755610] .(3)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.755620] .(3)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.755627] .(3)[187:kworker/u17:1]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    8.756067] .(3)[187:kworker/u17:1][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    8.757233] .(3)[187:kworker/u17:1]temp_now=225, temp_last=225 
<4>[    8.757250] .(3)[187:kworker/u17:1]=====FG===== TEMP = 225
<4>[    8.758678] .(3)[187:kworker/u17:1]=====FG===== VOLT = 4311
<4>[    8.758688] .(3)[187:kworker/u17:1]=====FG===== actural VOLT = 4316
<4>[    8.759223] .(3)[187:kworker/u17:1]=====FG===== AC   = -47
<4>[    8.759770] .(3)[187:kworker/u17:1]=====FG===== SOC  = 100
<4>[    8.760494] .(0)[187:kworker/u17:1]=====FG===== SOH  = 100
<4>[    8.760500] .(0)[187:kworker/u17:1]DLCP bat_vol=4316,  temperature=225  
<4>[    8.760504] .(0)[187:kworker/u17:1] ===CC_value from battery temprature=2000000
<4>[    8.760510] .(0)[187:kworker/u17:1]DLCP __mt6370_set_ieoc      = 150000
<4>[    8.760797] .(0)[187:kworker/u17:1]DLCP mt6370_set_vrech       = 300
<4>[    8.761216] .(0)[187:kworker/u17:1]DLCP mt6370_get_vrech       = 300
<4>[    8.761223] .(0)[187:kworker/u17:1]DLCP read cv              = 4350000
<4>[    8.761226] .(0)[187:kworker/u17:1]DLCP read eoc             = 250000
<4>[    8.761228] .(0)[187:kworker/u17:1]DLCP read recharge        = 300
<4>[    8.761232] .(0)[187:kworker/u17:1]DLCP Target Temp          = 410
<4>[    8.761234] .(0)[187:kworker/u17:1]DLCP Charge Current       = 2000
<4>[    8.761236] .(0)[187:kworker/u17:1]DLPID 
<4>[    8.761238] .(0)[187:kworker/u17:1]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    8.761240] .(0)[187:kworker/u17:1]DLPID PID Target Temp = 410 
<4>[    8.761242] .(0)[187:kworker/u17:1]DLPID Battery Temp    = 225 
<4>[    8.761246] .(0)[187:kworker/u17:1]DLPID TEMP DIFF       = 173 
<4>[    8.761248] .(0)[187:kworker/u17:1]DLPID PID KI          = 5000 
<4>[    8.761250] .(0)[187:kworker/u17:1]DLPID CC MAX          = 2000000 
<4>[    8.761252] .(0)[187:kworker/u17:1]DLPID PID Current     = 2000000 
<4>[    8.761254] .(0)[187:kworker/u17:1]DLCP ccurrent from charge type        = 500000
<4>[    8.761257] .(0)[187:kworker/u17:1]DLCP ccurrent from battery temprature = 2000000
<4>[    8.761259] .(0)[187:kworker/u17:1]DLCP ccurrent from PID algorithm      = 2000000
<4>[    8.761262] .(0)[187:kworker/u17:1]DLCP ccurrent from DLPL               = 2000000
<4>[    8.761265] .(0)[187:kworker/u17:1]DLCP set input current:500000 
<4>[    8.761430] .(0)[187:kworker/u17:1]DLCP set charge current: 500000 
<4>[    8.762039] .(0)[187:kworker/u17:1]DLCP mt6370_enable_charging :1 
<6>[    8.762206] .(0)[187:kworker/u17:1][charger_manager_enable_high_voltage_charging] already set: 0 1
<6>[    8.798117] .(1)[580:mtk_agpsd][ccci1/chr]port ttyC2 open with flag 20802 by mtk_agpsd
<6>[    8.798290] .(1)[580:mtk_agpsd][ccci1/chr]write error done on ttyC2, l=16 r=-19
<6>[    8.799154] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    8.799167] .(0)[265:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    8.799978] .(2)[265:charger_thread]=====FG===== AC   = -47
<4>[    8.800867] .(1)[265:charger_thread]=====FG===== AC   = -47
<14>[    8.811330] .(2)[544:init]init: Opened file '/d/mmc0/mmc0:0001/ext_csd', flags 0
<36>[    8.839869] .(0)[364:logd.auditd]type=1400 audit(1578636727.342:32): avc: denied { write } for pid=361 comm="teed" name="/" dev="tmpfs" ino=2155 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0 duplicate messages suppressed
<36>[    8.843050] .(0)[364:logd.auditd]type=1400 audit(1578636729.650:33): avc: denied { read } for pid=544 comm="storaged" path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=96 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
<3>[    8.847249] .(7)[520:mnld]Dump cpuinfo
<3>[    8.873107] .(4)[547:android.hardwar]<ACCELEROMETER> acc_store_cali 480 : ACC DRIVER OLD ARCHITECTURE DON'T SUPPORT ACC COMMON VERSION FLUSH
<6>[    8.875519] .(4)[547:android.hardwar]<MAGNETIC> mag_store_cali: MAG DRIVER OLD ARCHITECTURE DON'T SUPPORT MAG COMMON VERSION FLUSH
<6>[    8.892299] .(4)[547:android.hardwar]<GYROSCOPE> GYRO DRIVER OLD ARCHITECTURE DON'T SUPPORT GYRO COMMON VERSION FLUSH
<3>[    8.892449] .(7)[427:vold]BOOTPROF:      8892.449020:vold:cryptfs_restart_internal:END
<4>[    8.908627] .(2)[265:charger_thread]lifetime: data[0]=df 
<4>[    8.909350] .(2)[265:charger_thread]lifetime: data[1]=ff 
<4>[    8.910048] .(2)[265:charger_thread]lifetime: data[2]=40 
<4>[    8.910783] .(2)[265:charger_thread]lifetime: data[3]=11 
<4>[    8.911488] .(2)[265:charger_thread]lifetime: data[4]=45 
<4>[    8.912190] .(2)[265:charger_thread]lifetime: data[5]=a 
<4>[    8.912909] .(2)[265:charger_thread]lifetime: data[6]=fc 
<4>[    8.913729] .(2)[265:charger_thread]lifetime: data[7]=8 
<4>[    8.914861] .(2)[265:charger_thread]lifetime: data[8]=68 
<4>[    8.915654] .(2)[265:charger_thread]lifetime: data[9]=f7 
<4>[    8.916617] .(2)[265:charger_thread]lifetime: data[10]=18 
<4>[    8.917508] .(2)[265:charger_thread]lifetime: data[11]=0 
<4>[    8.920212] .(1)[265:charger_thread]=====FG-MTK===== bat_vol=4256
<4>[    8.925224] .(0)[265:charger_thread]=====FG===== AC   = -180
<5>[    8.926234] .(0)[265:charger_thread]Vbat=4256,Ibat=47,I=0,VChr=4730,T=25,Soc=100:100,CT:2:2 hv:1 pd:0:0
<5>[    8.927478] .(0)[265:charger_thread][mtk_is_charger_on]info->chr_type=2 
<4>[    8.931369] .(2)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    8.932161] .(2)[265:charger_thread]=====FG===== TEMP = 225
<5>[    8.932963] .(2)[265:charger_thread]charger_check_status
<4>[    8.981396] .(7)[551:thermal_manager]===== APtery output mV = 405
<4>[    8.982206] .(7)[551:thermal_manager]===== BTSMDPA output temperature = 22
<5>[    8.983190] .(2)[265:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    8.985852] .(3)[265:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[    8.986735] .(3)[265:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    8.990528] .(1)[265:charger_thread]mtk_switch_charging_run [1 0], timer=0
<5>[    9.034278] .(2)[265:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:25,39,16 pps:0 en:0 ibus:0 80
<5>[    9.035508] .(2)[265:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[    9.036623] .(2)[265:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<5>[    9.043324] .(3)[265:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<4>[    9.045009] .(3)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.046475] .(3)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.047856] .(3)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.051864] .(3)[265:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    9.056477] .(2)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    9.057275] .(2)[265:charger_thread]=====FG===== TEMP = 225
<4>[    9.063088] .(0)[265:charger_thread]=====FG===== VOLT = 4322
<4>[    9.063892] .(0)[265:charger_thread]=====FG===== actural VOLT = 4343
<4>[    9.065573] .(0)[265:charger_thread]=====FG===== AC   = -180
<4>[    9.067898] .(1)[265:charger_thread]=====FG===== SOC  = 100
<4>[    9.069345] .(1)[265:charger_thread]=====FG===== SOH  = 100
<4>[    9.070109] .(1)[265:charger_thread]DLCP bat_vol=4343,  temperature=225  
<4>[    9.070988] .(1)[265:charger_thread] ===CC_value from battery temprature=2000000
<4>[    9.071945] .(1)[265:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<4>[    9.076761] .(1)[265:charger_thread]DLCP mt6370_set_vrech       = 300
<4>[    9.080846] .(2)[265:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[    9.081702] .(2)[265:charger_thread]DLCP read cv              = 4350000
<4>[    9.082552] .(2)[265:charger_thread]DLCP read eoc             = 250000
<4>[    9.083401] .(2)[265:charger_thread]DLCP read recharge        = 300
<4>[    9.084217] .(2)[265:charger_thread]DLCP Target Temp          = 410
<4>[    9.085527] .(2)[265:charger_thread]DLCP Charge Current       = 2000
<4>[    9.087998] .(2)[265:charger_thread]DLPID 
<4>[    9.089837] .(2)[265:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<3>[    9.090176] .(5)[521:zygote64]BOOTPROF:      9090.175251:boot_progress_start
<4>[    9.092086] .(2)[265:charger_thread]DLPID PID Target Temp = 410 
<4>[    9.093097] .(2)[265:charger_thread]DLPID Battery Temp    = 225 
<4>[    9.093896] .(2)[265:charger_thread]DLPID TEMP DIFF       = 179 
<4>[    9.094670] .(2)[265:charger_thread]DLPID PID KI          = 5000 
<4>[    9.095507] .(2)[265:charger_thread]DLPID CC MAX          = 2000000 
<4>[    9.096372] .(2)[265:charger_thread]DLPID PID Current     = 2000000 
<4>[    9.097203] .(2)[265:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[    9.098185] .(2)[265:charger_thread]DLCP ccurrent from battery temprature = 2000000
<4>[    9.099203] .(2)[265:charger_thread]DLCP ccurrent from PID algorithm      = 2000000
<4>[    9.100319] .(2)[265:charger_thread]DLCP ccurrent from DLPL               = 2000000
<4>[    9.101418] .(2)[265:charger_thread]DLCP set input current:500000 
<4>[    9.103257] .(2)[265:charger_thread]DLCP set charge current: 500000 
<4>[    9.108417] .(4)[265:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    9.109873] .(4)[265:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[    9.110943] .(4)[265:charger_thread]DLCP __mt6370_set_cv       = 4350000
<4>[    9.120669] .(0)[265:charger_thread]DLCP mt6370_enable_charging :1 
<14>[    9.240832] .(7)[1:init]init: PropSet [debug.MB.realpath]=[/data/log_temp/boot/] Done
<14>[    9.250426] .(7)[1:init]init: Service 'flash_recovery' (pid 519) exited with status 0
<14>[    9.252292] .(7)[1:init]init: Service 'thermal_manager' (pid 551) exited with status 0
<3>[    9.259710] .(3)[528:drmserver]Dump cpuinfo
<14>[    9.267418] .(7)[1:init]init: PropSet [vold.encryption.type]=[default] Done
<14>[    9.280854] .(7)[1:init]init: PropSet [service.nvram_init]=[Ready] Done
<14>[    9.284815] .(7)[1:init]init: PropSet [debug.pq.shp.en]=[2] Done
<14>[    9.287529] .(7)[1:init]init: PropSet [ftrace.buffer.log]=[bsp] Done
<14>[    9.297966] .(7)[1:init]init: processing action (ftrace.buffer.log=bsp) from (/system/etc/init/mobile_log_d.rc:24)
<14>[    9.300005] .(7)[1:init]init: starting service 'bsplogstart'...
<14>[    9.302789] .(7)[1:init]init: PropSet [debug.pq.dshp.en]=[2] Done
<14>[    9.327597] .(5)[1:init]init: PropSet [persist.sys.pq.mdp.color.idx]=[0] Done
<14>[    9.348865] .(6)[1:init]init: PropSet [persist.sys.pq.adl.idx]=[0] Done
<6>[    9.351774] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<6>[    9.353872] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4230mV, VBAT = 4250mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<6>[    9.356029] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<6>[    9.357971] .(0)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<5>[    9.359851] .(0)[265:charger_thread][charger_routine_thread]flags=0,1 
<4>[    9.360958] .(0)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<14>[    9.366219] .(4)[1:init]init: PropSet [persist.sys.pq.iso.shp.en]=[2] Done
<3>[    9.398408] .(5)[537:mediaserver]Dump cpuinfo
<6>[    9.400496] .(3)[580:mtk_agpsd][ccci1/chr]write error done on ttyC2, l=44 r=-19
<6>[    9.407114] .(2)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_get_adc_vbus: VBUS = 4975mV
<4>[    9.408800] .(2)[265:charger_thread]sg_detect_typec_charge_ovp,1363,4975000,0 
<4>[    9.410701] .(3)[265:charger_thread]=====FG===== AC   = -180
<4>[    9.413313] .(3)[265:charger_thread]=====FG===== AC   = -180
<4>[    9.418161] .(0)[265:charger_thread]lifetime: data[0]=1 
<4>[    9.419224] .(0)[265:charger_thread]lifetime: data[1]=df 
<4>[    9.419944] .(0)[265:charger_thread]lifetime: data[2]=ff 
<4>[    9.421813] .(0)[265:charger_thread]lifetime: data[3]=40 
<4>[    9.422535] .(0)[265:charger_thread]lifetime: data[4]=11 
<4>[    9.423241] .(0)[265:charger_thread]lifetime: data[5]=45 
<4>[    9.424105] .(0)[265:charger_thread]lifetime: data[6]=a 
<4>[    9.425190] .(0)[265:charger_thread]lifetime: data[7]=fc 
<14>[    9.427093] .(4)[1:init]init: PropSet [persist.sys.pq.ultrares.en]=[2] Done
<4>[    9.427264] .(0)[265:charger_thread]lifetime: data[8]=8 
<4>[    9.427274] .(0)[265:charger_thread]lifetime: data[9]=68 
<4>[    9.427276] .(0)[265:charger_thread]lifetime: data[10]=f7 
<4>[    9.427279] .(0)[265:charger_thread]lifetime: data[11]=18 
<4>[    9.428875] .(0)[265:charger_thread]=====FG-MTK===== bat_vol=4251
<3>[    9.434719] .(0)[403:ccci_mdinit]BOOTPROF:      9434.716944:ccci_md1: decpyt ready
<6>[    9.435860] .(0)[403:ccci_mdinit][ccci1/fsm]monitor node open by ccci_mdinit
<6>[    9.439828] .(0)[403:ccci_mdinit][ccci1/chr]port ccci_ipc_5 open with flag 20002 by ccci_mdinit
<5>[    9.440642] .(3)[265:charger_thread]Vbat=4251,Ibat=180,I=0,VChr=4730,T=25,Soc=100:100,CT:2:2 hv:1 pd:0:0
<5>[    9.440662] .(3)[265:charger_thread][mtk_is_charger_on]info->chr_type=2 
<4>[    9.443108] .(2)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    9.443124] .(2)[265:charger_thread]=====FG===== TEMP = 225
<5>[    9.443128] .(2)[265:charger_thread]charger_check_status
<14>[    9.455217] .(2)[1:init]init: PropSet [persist.sys.pq.mdp.color.dbg]=[1] Done
<6>[    9.461101] .(2)[403:ccci_mdinit][ccci1/fsm]CCCI_IOC_RELOAD_MD_TYPE: 0x5a00003d
<3>[    9.462166] .(2)[403:ccci_mdinit]BOOTPROF:      9462.164944:ccci_md1: reset
<14>[    9.477563] .(7)[1:init]init: PropSet [persist.sys.pq.log.en]=[0] Done
<14>[    9.480409] .(7)[1:init]init: PropSet [mtk.md1.status]=[reset] Done
<6>[    9.480785] .(5)[703:ccci_mdinit][ccci1/ipc]Update fail
<6>[    9.482128] .(2)[403:ccci_mdinit][ccci1/fsm]CCCI_IOC_GET_MD_TYPE: 11!
<14>[    9.483498] .(7)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/hw/init.mt6763.rc:1138)
<5>[    9.484855] .(2)[265:charger_thread][mtk_chg_check_vbus]charger_update_data(4730000 mV) 
<5>[    9.486555] .(1)[265:charger_thread][BATTERY] bat_auth 1 gpio53_state =1
<5>[    9.487448] .(1)[265:charger_thread]charger_check_status tmp:22 (jeita:0 sm:0 cv:0 en:0) (sm:1) charging:1 cmd_discharging:0 safety_timeout:0 vbusov_stat:0 can_charging:1, charging:1
<5>[    9.491544] .(2)[265:charger_thread]mtk_switch_charging_run [1 0], timer=3
<7>[    9.496724] .(7)[695:sh][ftrace]event 'signal_deliver' is enabled
<7>[    9.496771] .(7)[695:sh][ftrace]event 'signal_generate' is enabled
<14>[    9.501690] .(5)[1:init]init: PropSet [persist.atm.mdmode]=[normal] Done
<14>[    9.512778] .(7)[1:init]init: PropSet [persist.sys.pq.hdr.en]=[1] Done
<14>[    9.513788] .(7)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.bip.rc:7)
<14>[    9.516068] .(7)[1:init]init: PropSet [ril.active.md]=[11] Done
<14>[    9.517053] .(7)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.volte_imsm_93.rc:12)
<14>[    9.519009] .(7)[1:init]init: PropSet [debug.MB.realpath]=[/data/log_temp/boot/] Done
<14>[    9.524711] .(7)[1:init]init: PropSet [debug.pq.adl.dbg]=[0] Done
<14>[    9.525984] .(7)[1:init]init: processing action (mtk.md1.status=reset) from (/vendor/etc/init/init.wod.rc:20)
<14>[    9.527779] .(7)[1:init]init: PropSet [debug.pq.hdr.dbg]=[0] Done
<7>[    9.528163] .(5)[708:sh][ftrace]event 'sched_fork_time' is enabled
<5>[    9.538425] .(3)[265:charger_thread]pe40_ready:0 hv:1 thermal:-1,-1 tmp:24,39,16 pps:0 en:0 ibus:0 80
<5>[    9.539659] .(3)[265:charger_thread]mtk_pe20_start_algorithm: stop, PE+20 is not connected
<5>[    9.540798] .(3)[265:charger_thread]mtk_pe_start_algorithm: stop, PE+ is not connected
<5>[    9.543418] .(3)[265:charger_thread]mtk_pe_start_algorithm: vchr_org = 5000, vchr_after = 4730, delta = -270
<4>[    9.544923] .(3)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.546271] .(3)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.547602] .(3)[265:charger_thread]~~~!!!wlc_51025 : gpio24: 1 gpio5_state =1 gpio_pmode_state=1 abnormal_count=0
<4>[    9.549226] .(3)[265:charger_thread][mtk_switch_charging_multi_power_supply_check]hall_1_eint_occur=0 mtk_charger_hall_1_eint=0
<4>[    9.551399] .(3)[265:charger_thread]temp_now=225, temp_last=225 
<4>[    9.552196] .(3)[265:charger_thread]=====FG===== TEMP = 225
<4>[    9.554141] .(0)[265:charger_thread]=====FG===== VOLT = 4322
<4>[    9.554899] .(0)[265:charger_thread]=====FG===== actural VOLT = 4343
<4>[    9.556461] .(0)[265:charger_thread]=====FG===== AC   = -180
<4>[    9.559080] .(3)[265:charger_thread]=====FG===== SOC  = 100
<7>[    9.566175] .(1)[709:sh][ftrace]event 'sched_process_exit' is enabled
<4>[    9.567497] .(2)[265:charger_thread]=====FG===== SOH  = 100
<4>[    9.568239] .(2)[265:charger_thread]DLCP bat_vol=4343,  temperature=225  
<4>[    9.569138] .(2)[265:charger_thread] ===CC_value from battery temprature=2000000
<4>[    9.570098] .(2)[265:charger_thread]DLCP __mt6370_set_ieoc      = 150000
<4>[    9.571312] .(1)[265:charger_thread]DLCP mt6370_set_vrech       = 300
<14>[    9.579888] .(2)[1:init]init: [PropSet]: pid:403 uid:1000 gid:1001 ctl.start, ccci_fsd
<4>[    9.580483] .(7)[265:charger_thread]DLCP mt6370_get_vrech       = 300
<4>[    9.580507] .(7)[265:charger_thread]DLCP read cv              = 4350000
<4>[    9.580511] .(7)[265:charger_thread]DLCP read eoc             = 250000
<4>[    9.580514] .(7)[265:charger_thread]DLCP read recharge        = 300
<4>[    9.580518] .(7)[265:charger_thread]DLCP Target Temp          = 410
<4>[    9.580520] .(7)[265:charger_thread]DLCP Charge Current       = 2000
<4>[    9.580523] .(7)[265:charger_thread]DLPID 
<4>[    9.580524] .(7)[265:charger_thread]DLPID +++++++++++++++++ PID Start +++++++++++++++++++++ 
<4>[    9.580527] .(7)[265:charger_thread]DLPID PID Target Temp = 410 
<4>[    9.580529] .(7)[265:charger_thread]DLPID Battery Temp    = 225 
<4>[    9.580531] .(7)[265:charger_thread]DLPID TEMP DIFF       = 182 
<4>[    9.580532] .(7)[265:charger_thread]DLPID PID KI          = 5000 
<4>[    9.580535] .(7)[265:charger_thread]DLPID CC MAX          = 2000000 
<4>[    9.580537] .(7)[265:charger_thread]DLPID PID Current     = 2000000 
<4>[    9.580539] .(7)[265:charger_thread]DLCP ccurrent from charge type        = 500000
<4>[    9.580541] .(7)[265:charger_thread]DLCP ccurrent from battery temprature = 2000000
<4>[    9.580543] .(7)[265:charger_thread]DLCP ccurrent from PID algorithm      = 2000000
<4>[    9.580545] .(7)[265:charger_thread]DLCP ccurrent from DLPL               = 2000000
<4>[    9.580550] .(7)[265:charger_thread]DLCP set input current:500000 
<4>[    9.580784] .(7)[265:charger_thread]DLCP set charge current: 500000 
<4>[    9.582010] .(7)[265:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    9.582229] .(7)[265:charger_thread]DLCP charger_dev_set_constant_voltage       = 4350000
<4>[    9.582243] .(7)[265:charger_thread]DLCP __mt6370_set_cv       = 4350000
<4>[    9.582409] .(7)[265:charger_thread]DLCP mt6370_enable_charging :1 
<4>[    9.585900] .(4)[696:HwBinder:377_1]mtk_pcm_dl1_hardware.buffer_bytes_max = 49152 mPlaybackDramState = 0
<4>[    9.586091] .(4)[696:HwBinder:377_1]mtk_soc_pcm_dl1_close
<4>[    9.586344] .(4)[696:HwBinder:377_1]mtk_capture_pcm_close
<4>[    9.589622] .(4)[696:HwBinder:377_1]mtk_voice_pcm_open(), stream(0)
<4>[    9.589695] .(4)[696:HwBinder:377_1]mtk_voice_close(), stream(0)
<4>[    9.589710] .(4)[696:HwBinder:377_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.589713] .(4)[696:HwBinder:377_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[    9.589770] .(4)[696:HwBinder:377_1][AudioError] , user count < 0
<3>[    9.589773] .(4)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.589970] .(4)[696:HwBinder:377_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.589974] .(4)[696:HwBinder:377_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.590291] .(4)[696:HwBinder:377_1]mtk_voice_pcm_open(), stream(1)
<4>[    9.590340] .(4)[696:HwBinder:377_1]mtk_voice_close(), stream(1)
<4>[    9.595237] .(7)[696:HwBinder:377_1]mtk_uldlloopback_open runtime rate = 0 channels = 0
<4>[    9.595314] .(7)[696:HwBinder:377_1]mtk_uldlloopbackpcm_close
<3>[    9.595324] .(7)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.595704] .(4)[696:HwBinder:377_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.595722] .(4)[696:HwBinder:377_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[    9.595739] .(4)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.595765] .(4)[696:HwBinder:377_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.595768] .(4)[696:HwBinder:377_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.596588] .(4)[696:HwBinder:377_1]mtk_uldlloopback_open runtime rate = 0 channels = 0
<4>[    9.596702] .(4)[696:HwBinder:377_1]mtk_uldlloopbackpcm_close
<3>[    9.596707] .(4)[696:HwBinder:377_1]mtk_uldlloopbackpcm_close  with SNDRV_PCM_STREAM_CAPTURE
<3>[    9.597491] .(4)[696:HwBinder:377_1]ASoC: mt-soc-i2s0-dummy-dai-codec <-> mt-soc-i2s0dai-driver No matching formats
<4>[    9.597759] .(4)[696:HwBinder:377_1]mtk_pcm_mrgrx_open
<4>[    9.597764] .(4)[696:HwBinder:377_1]mtk_pcm_mrgrx_open runtime rate = 0 channels = 0 substream->pcm->device = 5
<4>[    9.597766] .(4)[696:HwBinder:377_1]mtk_pcm_mrgrx_open return
<4>[    9.597808] .(4)[696:HwBinder:377_1]mtk_pcm_mrgrx_close
<3>[    9.597811] .(4)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.597814] .(4)[696:HwBinder:377_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[    9.597816] .(4)[696:HwBinder:377_1]SetMrgI2SEnable bEnable = 0
<3>[    9.597819] .(4)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.597825] .(4)[696:HwBinder:377_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.597828] .(4)[696:HwBinder:377_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.598009] .(4)[696:HwBinder:377_1]mtk_pcm_mrgrx_open
<4>[    9.598012] .(4)[696:HwBinder:377_1]mtk_pcm_mrgrx_open runtime rate = 0 channels = 0 substream->pcm->device = 5
<4>[    9.598014] .(4)[696:HwBinder:377_1]mtk_pcm_mrgrx_open return
<4>[    9.598034] .(4)[696:HwBinder:377_1]mtk_pcm_mrgrx_close
<3>[    9.598037] .(4)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.598038] .(4)[696:HwBinder:377_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[    9.598041] .(4)[696:HwBinder:377_1]SetMrgI2SEnable bEnable = 0
<3>[    9.598042] .(4)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.598046] .(4)[696:HwBinder:377_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.598048] .(4)[696:HwBinder:377_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.598457] .(4)[696:HwBinder:377_1]mtk_mrgrx_awb_pcm_open
<4>[    9.598467] .(4)[696:HwBinder:377_1]mtk_mrgrx_awb_pcm_open runtime rate = 0 channels = 0
<3>[    9.598474] .(4)[696:HwBinder:377_1]mt-soc-mrgrx-awb-pcm mt-soc-mrgrx-awb-pcm: ASoC: can't open platform mt-soc-mrgrx-awb-pcm: -1
<4>[    9.598556] .(4)[696:HwBinder:377_1]mtk_mrgrx_awb_pcm_open
<4>[    9.598559] .(4)[696:HwBinder:377_1]mtk_mrgrx_awb_pcm_open runtime rate = 0 channels = 0
<4>[    9.598561] .(4)[696:HwBinder:377_1]SNDRV_PCM_STREAM_CAPTURE
<4>[    9.598695] .(4)[696:HwBinder:377_1]mtk_mrgrx_awb_pcm_open return
<4>[    9.604617] .(7)[696:HwBinder:377_1]mtk_pcm_I2S0dl1_open: mtk_I2S0dl1_hardware.buffer_bytes_max = 196608 mPlaybackDramState = 0
<4>[    9.604855] .(7)[696:HwBinder:377_1]mtk_pcm_I2S0dl1_close
<4>[    9.605814] .(7)[696:HwBinder:377_1]mtk_voice_bt_pcm_open(), stream(0)
<4>[    9.605870] .(7)[696:HwBinder:377_1]mtk_voice_bt_close(), stream(0)
<3>[    9.605877] .(7)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.606288] .(7)[696:HwBinder:377_1]mtk_bt_dai_pcm_open, stream 1
<4>[    9.606391] .(7)[696:HwBinder:377_1]mtk_bt_dai_pcm_open return
<4>[    9.607651] .(7)[696:HwBinder:377_1]mtk_I2S0dl1_hardware.buffer_bytes_max = 49152 mPlaybackDramState = 0
<4>[    9.608026] .(7)[696:HwBinder:377_1]mtk_capture2_pcm_open
<4>[    9.608046] .(7)[696:HwBinder:377_1]runtime->hw->rates = 0x40001ffe
<4>[    9.608046]  
<4>[    9.608043] .(7)[696:HwBinder:377_1]mtk_capture2_pcm_open runtime rate = 0 channels = 0
<4>[    9.608047] .(7)[696:HwBinder:377_1]SNDRV_PCM_STREAM_CAPTURE mtkalsa_capture_constraints
<4>[    9.608049] .(7)[696:HwBinder:377_1]mtk_capture2_pcm_open return
<4>[    9.608073] .(7)[696:HwBinder:377_1]mtk_capture2_pcm_close
<4>[    9.612820] .(7)[696:HwBinder:377_1]mtk_i2s0_awb_pcm_open
<4>[    9.613010] .(7)[696:HwBinder:377_1]mtk_i2s0_awb_pcm_open runtime rate = 0 channels = 0
<4>[    9.613014] .(7)[696:HwBinder:377_1]SNDRV_PCM_STREAM_CAPTURE
<4>[    9.613016] .(7)[696:HwBinder:377_1]mtk_i2s0_awb_pcm_open return
<4>[    9.614483] .(7)[696:HwBinder:377_1]mtk_voice_md2_pcm_open(), stream(0)
<4>[    9.614567] .(7)[696:HwBinder:377_1]mtk_voice_md2_close(), stream(0)
<4>[    9.614584] .(7)[696:HwBinder:377_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.614587] .(7)[696:HwBinder:377_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<3>[    9.614594] .(7)[696:HwBinder:377_1][AudioError] , user count < 0
<3>[    9.614596] .(7)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.614790] .(7)[696:HwBinder:377_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.614793] .(7)[696:HwBinder:377_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.615180] .(7)[696:HwBinder:377_1]mtk_voice_md2_pcm_open(), stream(1)
<4>[    9.615241] .(7)[696:HwBinder:377_1]mtk_voice_md2_close(), stream(1)
<4>[    9.615681] .(7)[696:HwBinder:377_1]mtk_routing_pcm_open
<4>[    9.615689] .(7)[696:HwBinder:377_1]mtk_routing_pcm_open runtime rate = 0 channels = 0
<4>[    9.615691] .(7)[696:HwBinder:377_1]mtk_routing_pcm_open return
<4>[    9.615792] .(7)[696:HwBinder:377_1]mtk_routing_pcm_open
<4>[    9.615794] .(7)[696:HwBinder:377_1]mtk_routing_pcm_open runtime rate = 0 channels = 0
<4>[    9.615796] .(7)[696:HwBinder:377_1]mtk_routing_pcm_open return
<4>[    9.616270] .(7)[696:HwBinder:377_1]mtk_voice_md2_bt_pcm_open(), stream(0)
<4>[    9.616380] .(7)[696:HwBinder:377_1]mtk_voice_md2_bt_close(), stream(0)
<3>[    9.616391] .(7)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.616946] .(7)[696:HwBinder:377_1]mtk_pcm_fm_i2s_open
<4>[    9.616952] .(7)[696:HwBinder:377_1]mtk_pcm_fm_i2s_open return
<4>[    9.616975] .(7)[696:HwBinder:377_1]mtk_pcm_fm_i2s_close rate = 0
<3>[    9.616979] .(7)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.616985] .(7)[696:HwBinder:377_1][AudioWarn] GeneralSampleRateTransform() sampleRate(0) is invalid, use 44.1kHz!!!
<4>[    9.616996] .(7)[696:HwBinder:377_1]setConnsysI2SInEnable(), enable = 0
<3>[    9.616994] .(7)[696:HwBinder:377_1][AudioError] , user count < 0
<4>[    9.617004] .(7)[696:HwBinder:377_1]set_aud_clk_mosi(), counter 0 <= 0
<3>[    9.617007] .(7)[696:HwBinder:377_1]AudDrv_GPIO_Select(), error, gpio type 0 not prepared
<4>[    9.617155] .(7)[696:HwBinder:377_1]mtk_fm_i2s_awb_pcm_open
<4>[    9.617295] .(7)[696:HwBinder:377_1]mtk_fm_i2s_awb_pcm_open return
<4>[    9.618118] .(7)[696:HwBinder:377_1]+Set_BTCVSD_State, state=16
<4>[    9.618191] .(7)[696:HwBinder:377_1]+Set_BTCVSD_State, state=16
<4>[    9.624712] .(7)[696:HwBinder:377_1]mtk_pcm_btcvsd_tx_open
<4>[    9.624781] .(7)[696:HwBinder:377_1]mtk_pcm_btcvsd_tx_close
<4>[    9.624784] .(7)[696:HwBinder:377_1]+Set_BTCVSD_State, state=0
<4>[    9.624823] .(7)[696:HwBinder:377_1]mtk_pcm_btcvsd_tx_open
<4>[    9.624842] .(7)[696:HwBinder:377_1]mtk_pcm_btcvsd_tx_close
<4>[    9.624844] .(7)[696:HwBinder:377_1]+Set_BTCVSD_State, state=0
<4>[    9.625107] .(7)[696:HwBinder:377_1]mtk_i2s2_adc2_pcm_open
<4>[    9.626718] .(7)[696:HwBinder:377_1]mtk_voice_usb_open()
<4>[    9.626735] .(7)[696:HwBinder:377_1]mtk_voice_usb_open(), return
<4>[    9.626796] .(7)[696:HwBinder:377_1]mtk_voice_usb_close(), stream 0, prepare 0
<4>[    9.627008] .(7)[696:HwBinder:377_1]mtk_voice_usb_open()
<4>[    9.627012] .(7)[696:HwBinder:377_1]mtk_voice_usb_open(), return
<4>[    9.627038] .(7)[696:HwBinder:377_1]mtk_voice_usb_close(), stream 1, prepare 0
<4>[    9.627606] .(7)[696:HwBinder:377_1]mtk_usb_echoref_open()
<4>[    9.627619] .(7)[696:HwBinder:377_1]mtk_usb_echoref_open(), return
<4>[    9.627676] .(7)[696:HwBinder:377_1]mtk_usb_echoref_close(), stream 0, prepare 0
<4>[    9.629147] .(7)[696:HwBinder:377_1]mtk_i2s2_adc2_pcm_open
<3>[    9.637048] .(6)[522:app_process32]Dump cpuinfo
<3>[    9.724049] .(4)[403:ccci_mdinit]BOOTPROF:      9724.047560:ccci_md1: bootup
<14>[    9.738126] .(3)[1:init]init: PropSet [persist.sys.pq.mdp.ccorr.en]=[2] Done
<14>[    9.741964] .(4)[1:init]init: Service 'bsplogstart' (pid 673) exited with status 0
<14>[    9.745203] .(4)[1:init]init: PropSet [mtk.md1.status]=[bootup] Done
<6>[    9.746435] .(4)[403:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[    9.747635] .(4)[403:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[    9.748750] .(4)[403:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_dhl for user1!
<6>[    9.749852] .(4)[403:ccci_mdinit][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[    9.750994] .(4)[403:ccci_mdinit][ccci1/chr]remap succeed 80018, 0x80018000 -> 0xf5b74000
<3>[    9.752802] .(6)[527:cameraserver]Dump cpuinfo
<6>[    9.755155] .(4)[403:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[    9.756529] .(4)[403:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[    9.757473] .(4)[403:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[    9.758667] .(4)[403:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[    9.759530] .(4)[403:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_md_monitor for user2!
<6>[    9.760799] .(4)[403:ccci_mdinit][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[    9.761964] .(4)[403:ccci_mdinit][ccci1/chr]remap succeed 80018, 0x80018000 -> 0xf5b74000
<6>[    9.763128] .(4)[403:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[    9.764437] .(4)[403:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[    9.765528] .(2)[403:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by ccci_mdinit
<6>[    9.766773] .(2)[403:ccci_mdinit][ccci1/shm]ccb_configs_len: 20
<6>[    9.767771] .(2)[403:ccci_mdinit][ccci1/shm]find ccb port ccci_ccb_meta for user3!
<6>[    9.768975] .(2)[403:ccci_mdinit][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[    9.770440] .(2)[403:ccci_mdinit][ccci1/chr]remap succeed 80018, 0x80018000 -> 0xf5b74000
<6>[    9.771618] .(2)[403:ccci_mdinit][ccci1/chr]port ccci_ccb_ctrl close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[    9.772915] .(2)[403:ccci_mdinit][ccci1/pot]critical user check: 0x1
<6>[    9.773816] .(2)[403:ccci_mdinit][ccci1/fsm]MD start ioctl called by ccci_mdinit
<6>[    9.774824] .(2)[403:ccci_mdinit][ccci1/fsm]command 1 is appended 1 from ccci_fsm_ioctl
<6>[    9.775911] .(2)[189:ccci_fsm1][ccci1/fsm]command 1 process
<6>[    9.776689] .(2)[189:ccci_fsm1][ccci1/pot]ready to reset MD in normal mode
<5>[    9.777599] .(2)[189:ccci_fsm1][VcoreFS] kicker: KIR_APCCCI, opp: 0, dvfs_opp: 0, sw_opp: 3, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, -1, -1, -1, 
<5>[    9.780030] .(2)[189:ccci_fsm1][VcoreFS] opp: 0, vcore: 793750 <= 725000, fddr: 1866000 <= 1200000 [O][O]
<14>[    9.780420] .(7)[1:init]init: PropSet [persist.sys.pq.mdp.dre.en]=[2] Done
<14>[    9.782196] .(7)[1:init]init: PropSet [debug.pq.dre.dbg]=[0] Done
<5>[    9.783769] -(2)[189:ccci_fsm1][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 0, vcore: 0x110000, emi: 0x290299, md: 0x0
<14>[    9.784397] .(7)[1:init]init: PropSet [debug.pq.acaltm.dbg]=[0] Done
<14>[    9.785950] .(7)[1:init]init: PropSet [debug.pq.dredriver.dbg]=[0] Done
<6>[    9.786086] .(2)[189:ccci_fsm1][ccci1/fsm]md_state change from 0 to 2
<6>[    9.794412] .(1)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: ICHG = 500mA, AICR = 500mA, MIVR = 4400mV, IEOC = 250mA, CV = 4350mV
<6>[    9.796459] .(1)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: VSYS = 4240mV, VBAT = 4255mV, IBAT = 0mA, IBUS = 400mA, VBUS = 4975mV
<14>[    9.797406] .(7)[1:init]init: PropSet [debug.pq.dre.demowin.x]=[536805376] Done
<14>[    9.798933] .(7)[1:init]init: PropSet [debug.pq.dredriver.blk]=[0] Done
<6>[    9.800186] .(1)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_EN = 1, CHG_STATUS = progress, CHG_STAT = 0xA0
<14>[    9.800549] .(7)[1:init]init: PropSet [debug.pq.dre.isp.tuning]=[0] Done
<14>[    9.802140] .(7)[1:init]init: PropSet [debug.pq.cz.isp.tuning]=[0] Done
<6>[    9.803875] .(1)[265:charger_thread]mt6370_pmu_charger mt6370_pmu_charger: mt6370_dump_register: CHG_CTRL1 = 0x10, CHG_CTRL2 = 0x1B
<14>[    9.865518] .(5)[1:init]init: PropSet [persist.sys.bluelight.default]=[128] Done
<6>[    9.871030] .(3)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d628000, buf_size=213032,buflen=213032,rx_size=81920,tx_size=131072,ctr_len=40
<6>[    9.873377] .(6)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d628000)=0xee0000ee ee0000ee
<6>[    9.874488] .(6)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d65c024)=0xff0000ff ff0000ff
<6>[    9.875616] .(6)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d628008
<14>[    9.880106] .(6)[1:init]init: PropSet [persist.sys.pq.shp.idx]=[2] Done
<6>[    9.881086] .(2)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d65c028, buf_size=122920,buflen=122920,rx_size=81920,tx_size=40960,ctr_len=40
<6>[    9.882885] .(2)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d65c028)=0xee0000ee ee0000ee
<6>[    9.883973] .(2)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d67a04c)=0xff0000ff ff0000ff
<6>[    9.885105] .(2)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d65c030
<6>[    9.886117] .(3)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d67a050, buf_size=49192,buflen=49192,rx_size=40960,tx_size=8192,ctr_len=40
<6>[    9.887718] .(3)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d67a050)=0xee0000ee ee0000ee
<6>[    9.888921] .(3)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d686074)=0xff0000ff ff0000ff
<6>[    9.890115] .(3)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d67a058
<6>[    9.896423] .(5)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d686078, buf_size=122920,buflen=122920,rx_size=81920,tx_size=40960,ctr_len=40
<6>[    9.898108] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d686078)=0xee0000ee ee0000ee
<6>[    9.899189] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6a409c)=0xff0000ff ff0000ff
<6>[    9.900716] .(5)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d686080
<6>[    9.908502] .(0)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6a40a0, buf_size=41000,buflen=41000,rx_size=20480,tx_size=20480,ctr_len=40
<6>[    9.910117] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6a40a0)=0xee0000ee ee0000ee
<6>[    9.911198] .(0)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6ae0c4)=0xff0000ff ff0000ff
<6>[    9.912282] .(0)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6a40a8
<6>[    9.925712] .(2)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6ae0c8, buf_size=41000,buflen=41000,rx_size=20480,tx_size=20480,ctr_len=40
<6>[    9.927367] .(2)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6ae0c8)=0xee0000ee ee0000ee
<6>[    9.928523] .(2)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6b80ec)=0xff0000ff ff0000ff
<6>[    9.929615] .(2)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6ae0d0
<6>[    9.934713] .(2)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6b80f0, buf_size=131112,buflen=131112,rx_size=65536,tx_size=65536,ctr_len=40
<6>[    9.936532] .(6)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6b80f0)=0xee0000ee ee0000ee
<6>[    9.937625] .(6)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6d8114)=0xff0000ff ff0000ff
<6>[    9.938705] .(6)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6b80f8
<6>[    9.944453] .(5)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6d8118, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    9.945898] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6d8118)=0xee0000ee ee0000ee
<6>[    9.946985] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6d813c)=0xff0000ff ff0000ff
<6>[    9.948091] .(5)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6d8120
<6>[    9.952306] .(5)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6d8400, buf_size=24616,buflen=24616,rx_size=12288,tx_size=12288,ctr_len=40
<6>[    9.953954] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6d8400)=0xee0000ee ee0000ee
<6>[    9.955038] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6de424)=0xff0000ff ff0000ff
<6>[    9.956186] .(5)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6d8408
<6>[    9.957075] .(5)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6de428, buf_size=65576,buflen=65576,rx_size=32768,tx_size=32768,ctr_len=40
<6>[    9.958695] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6de428)=0xee0000ee ee0000ee
<6>[    9.959770] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6ee44c)=0xff0000ff ff0000ff
<6>[    9.960911] .(5)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6de430
<6>[    9.961739] .(5)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6ee450, buf_size=16424,buflen=16424,rx_size=8192,tx_size=8192,ctr_len=40
<6>[    9.963784] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6ee450)=0xee0000ee ee0000ee
<6>[    9.965556] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f2474)=0xff0000ff ff0000ff
<6>[    9.966663] .(5)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6ee458
<6>[    9.967501] .(5)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f2478, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    9.968956] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f2478)=0xee0000ee ee0000ee
<6>[    9.970076] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f249c)=0xff0000ff ff0000ff
<6>[    9.971388] .(5)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f2480
<6>[    9.972220] .(5)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f24a0, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    9.973688] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f24a0)=0xee0000ee ee0000ee
<6>[    9.974786] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f24c4)=0xff0000ff ff0000ff
<6>[    9.975886] .(5)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f24a8
<6>[    9.976956] .(5)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f24c8, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    9.978376] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f24c8)=0xee0000ee ee0000ee
<6>[    9.979456] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f24ec)=0xff0000ff ff0000ff
<6>[    9.980558] .(5)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f24d0
<6>[    9.981385] .(5)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f24f0, buf_size=16424,buflen=16424,rx_size=8192,tx_size=8192,ctr_len=40
<6>[    9.982980] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f24f0)=0xee0000ee ee0000ee
<6>[    9.984065] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f6514)=0xff0000ff ff0000ff
<6>[    9.985275] .(5)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f24f8
<6>[    9.986109] .(5)[189:ccci_fsm1][ccci1/rbf]crb:buf=0xffffff800d6f6518, buf_size=40,buflen=40,rx_size=0,tx_size=0,ctr_len=40
<6>[    9.987544] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Header(0xffffff800d6f6518)=0xee0000ee ee0000ee
<6>[    9.988693] .(5)[189:ccci_fsm1][ccci1/rbf]crb:Footer(0xffffff800d6f653c)=0xff0000ff ff0000ff
<6>[    9.989783] .(5)[189:ccci_fsm1][ccci1/rbf]crb:rbf=0xffffff800d6f6520
<6>[    9.991046] .(5)[189:ccci_fsm1][ccci1/mcd]ccci_set_clk_cg: on=1
<6>[    9.993765] .(5)[189:ccci_fsm1][ccci1/cif]md_ccif_sram_reset
<6>[    9.994553] .(5)[189:ccci_fsm1][ccci1/cif]md_ccif_switch_ringbuf
<6>[    9.995330] .(5)[189:ccci_fsm1][ccci1/cif]md_ccif_reset_queue
<6>[    9.996078] .(5)[189:ccci_fsm1][ccci1/cif]md_ccif_switch_ringbuf
<6>[    9.996882] .(5)[189:ccci_fsm1][ccci1/cif]md_ccif_reset_queue
<6>[   10.044512] .(0)[189:ccci_fsm1][ccci1/cldma]cldma_reset from md_cd_start
<6>[   10.045398] .(0)[189:ccci_fsm1][ccci1/cldma]cldma_start from md_cd_start
<31>[   10.054817] .(1)[353:logd.reader]logd: logdr: UID=1000 GID=1000 PID=539 b tail=0 logMask=1f pid=0 start=0ns timeout=0ns
<14>[   10.055872] .(6)[1:init]init: PropSet [debug.MB.running]=[1] Done
<14>[   10.058407] .(6)[1:init]init: PropSet [log.tag]=[M] Done
<31>[   10.059272] .(7)[759:logd.reader.per]logd: logd first log reader, set log level to M!
<31>[   10.059298] .(7)[759:logd.reader.per]logd: logd.reader.per thread start.
<14>[   10.060873] .(6)[1:init]init: PropSet [debug.MB.prdebug]=[1] Done
<14>[   10.063041] .(6)[1:init]init: processing action (debug.MB.prdebug=1) from (/system/etc/init/mobile_log_d.rc:31)
<6>[   10.104595] .(5)[85:kworker/5:1][ccci1/cif]md_ccif_sram_rx_work:dk_pkg=ffffff800bef4100, md_featrue=ffffff800bef4110
<6>[   10.106037] .(5)[85:kworker/5:1][ccci1/cif]md_ccif_sram_rx_work:ccci_port_recv_skb ret=0
<6>[   10.106049] .(1)[197:ccci_ctrl][ccci1/fsm]control message 0x0,0x5555FFFF
<6>[   10.106095] .(1)[197:ccci_ctrl][ccci1/fsm]event 1 is appended from ccci_fsm_recv_control_packet
<6>[   10.116411] -(2)[189:ccci_fsm1][ccci1/fsm]md_state change from 2 to 3
<5>[   10.117295] -(2)[189:ccci_fsm1]mtk_rtc_hal_common: rtc_spare_reg[12] = {a38, 1, 6}
<6>[   10.118433] -(2)[189:ccci_fsm1][ccci1/mcd]md_boot_stats len 0
<6>[   10.119179] -(2)[189:ccci_fsm1][ccci1/mcd]md_boot_stats0:0x54430007
<6>[   10.120002] -(2)[189:ccci_fsm1][ccci1/mcd]md_boot_stats1:0x53320000
<6>[   10.120833] -(2)[189:ccci_fsm1][ccci1/fsm]event 1 is completed by fsm_main_thread
<2>[   10.122734] .(2)[189:ccci_fsm1][PBM] AP2MD1 section level, 2G: 0xb9e7bf(0xb9e7bf), 3G: 0xb84696(0xb84696), 
<2>[   10.123886] .(2)[189:ccci_fsm1][PBM] 4G_upL1: 0xb84675(0xb84675), 4G_upL2: 0xb84675(0xb84675), TDD: 0xd84a75(0xd84a75), addr: 0xffffff800d60ff58
<2>[   10.125740] .(2)[189:ccci_fsm1][PBM] C2K section level, C2K: 0x108d2d7(0x108d2d7), addr: 0xffffff800d60ff58
<2>[   10.127676] .(2)[189:ccci_fsm1][PBM] MD section level init, MD1: 1
<6>[   10.128547] .(2)[189:ccci_fsm1][ccci1/fsm]send runtime data 0
<36>[   10.141217] .(1)[364:logd.auditd]type=1400 audit(1578636729.650:33): avc: denied { read } for pid=544 comm="storaged" path="/sys/kernel/debug/mmc0/mmc0:0001/ext_csd" dev="debugfs" ino=96 scontext=u:r:storaged:s0 tcontext=u:object_r:debugfs_mmc:s0 tclass=file permissive=0
<36>[   10.145396] .(1)[364:logd.auditd]type=1400 audit(1578636730.954:34): avc: denied { getattr } for pid=763 comm="aee" path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=5378 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
<7>[   10.231170] .(3)[696:HwBinder:377_1]Speaker_Amp_Set() value = 0
<7>[   10.231170]  
<7>[   10.231182] Headset_Speaker_Amp_Set() gain = 0
<7>[   10.231182]  <7>[   10.231207] .(3)[696:HwBinder:377_1]Ext_Speaker_Amp_Change OFF+  udio_mode_flags = 0, audio_mode_value = 2
<7>[   10.231744] .(3)[696:HwBinder:377_1]Ext_Speaker_Amp_Change OFF-
<7>[   10.231771] .(3)[696:HwBinder:377_1]Receiver_Speaker_Switch_Set()
<7>[   10.231791] .(3)[696:HwBinder:377_1]TurnOnADcPowerACC ADCType = 13 enable = 0
<4>[   10.231875] .(3)[696:HwBinder:377_1]TopCkCount <0 =-1
<4>[   10.231875]  
<4>[   10.232245] .(3)[696:HwBinder:377_1]ClsqEnable count <0
<4>[   10.233009] .(3)[696:HwBinder:377_1]NvRegCount <0 =-1
<4>[   10.233009]  
<4>[   10.233377] .(3)[696:HwBinder:377_1]audck_buf_Count count < 0
<7>[   10.234224] .(3)[696:HwBinder:377_1]TurnOnADcPowerACC ADCType = 14 enable = 0
<4>[   10.234315] .(3)[696:HwBinder:377_1]TopCkCount <0 =-1
<4>[   10.234315]  
<4>[   10.234687] .(3)[696:HwBinder:377_1]ClsqEnable count <0
<4>[   10.235401] .(3)[696:HwBinder:377_1]NvRegCount <0 =-1
<4>[   10.235401]  
<4>[   10.235769] .(3)[696:HwBinder:377_1]audck_buf_Count count < 0
<7>[   10.236933] .(3)[696:HwBinder:377_1]pmic_dctrim_control_get(), dctrim_calibrated = 2
<6>[   10.264385] .(5)[85:kworker/5:1]usb_state<CONFIGURED>
<14>[   10.268607] .(6)[1:init]init: starting service 'aee_aed'...
<14>[   10.273104] .(6)[1:init]init: starting service 'aee_aed64'...
<14>[   10.275277] .(6)[1:init]init: starting service 'aee_aedv'...
<14>[   10.277812] .(6)[1:init]init: starting service 'aee_aedv64'...
<3>[   10.312286] .(7)[530:vtservice]Dump cpuinfo
<6>[   10.324604] .(4)[696:HwBinder:377_1][ccci1/chr]port ccci_aud open with flag 20002 by HwBinder:377_1
<6>[   10.326245] .(4)[696:HwBinder:377_1][ccci1/chr]port ccci_raw_audio open with flag 20002 by HwBinder:377_1
<14>[   10.326765] .(6)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<6>[   10.328686] .(4)[696:HwBinder:377_1][ccci1/shm]smem_port->addr_phy=8001b000
<6>[   10.329941] .(4)[696:HwBinder:377_1][ccci1/chr]remap addr:0x8001b000 len:53248  map-len:53248
<14>[   10.331548] .(4)[1:init]init: PropSet [debug.mtk.aee.status64]=[free] Done
<14>[   10.335208] .(4)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[   10.340253] .(4)[1:init]init: PropSet [debug.mtk.aee.status]=[free] Done
<14>[   10.374975] .(0)[1:init]init: PropSet [debug.mtk.aee.vstatus64]=[free] Done
<14>[   10.377959] .(0)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[   10.380912] .(0)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<14>[   10.384278] .(4)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[dumping] Done
<7>[   10.387145] .(2)[788:aee_aedv][KL_ENV]get env name=forceencrypt_config
<4>[   10.387169] .(2)[788:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<7>[   10.391413] .(1)[788:aee_aedv][KL_ENV]get env name=forceencrypt_config
<4>[   10.391437] .(1)[788:aee_aedv][KL_ENV]cann't find name=forceencrypt_config
<14>[   10.395835] .(4)[1:init]init: PropSet [debug.mtk.aee.vstatus]=[free] Done
<6>[   10.400472] .(1)[191:ccci_rpc_k][ccci0/rpc]get_md_dtsi_val 1, mediatek,md_product_name_model_id -- 0xf0f0f0f
<4>[   10.464400] -(7)[0:swapper/7]MCDI bootup check: PASS
<6>[   10.566128] .(7)[548:camerahalserver][ISP][ISP_open] - E. UserCount: 0.
<6>[   10.567009] .(7)[548:camerahalserver][ISP][ISP_open] Curr UserCount(1), (process, pid, tgid)=(camerahalserver, 548, 548), log_limit_line(150), first user
<6>[   10.570183] .(7)[548:camerahalserver][ISP][ISP_open] - X. Ret: 0. UserCount: 1. G_u4EnableClockCount:1
<7>[   10.571486] .(7)[548:camerahalserver][imgsensor]imgsensor_open 1
<7>[   10.572577] .(7)[548:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 1, freq= 3, TG= 0
<7>[   10.580398] .(7)[548:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 1, freq= 3, TG= 1
<7>[   10.580738] .(7)[548:camerahalserver][imgsensor]imgsensor_open 2
<7>[   10.580888] .(7)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.580898] .(7)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   10.580925] .(7)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.580944] .(7)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.580957] .(7)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.580974] .(7)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.581455] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.582941] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.583455] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.583511] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   10.583524] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.584424] .(4)[548:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<7>[   10.590365] .(4)[548:camerahalserver]IMX258_camera_sensor[feature_control] feature_id = 3041
<6>[   10.590507] .(4)[548:camerahalserver]i2c i2c-2: addr: 1a, transfer ACK error
<3>[   10.591444] .(4)[548:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   10.592393] .(4)[548:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x34, id: 0x0
<6>[   10.592517] .(4)[548:camerahalserver]i2c i2c-2: addr: 10, transfer ACK error
<3>[   10.593494] .(4)[548:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   10.594377] .(4)[548:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x20, id: 0x0
<7>[   10.594389] .(4)[548:camerahalserver][imgsensor]Fail to get sensor ID ffffffff
<7>[   10.594394] .(4)[548:camerahalserver][imgsensor]ERROR:imgsensor_check_is_alive(), No imgsensor alive
<7>[   10.595454] .(4)[548:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.595505] .(4)[548:camerahalserver][imgsensor][regulator]4 is enabled
<7>[   10.595543] .(4)[548:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   10.595570] .(4)[548:camerahalserver][imgsensor][regulator]5 is enabled
<6>[   10.595620] .(2)[197:ccci_ctrl][ccci1/fsm]control message 0x0,0x0
<7>[   10.595629] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   10.595637] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.595639] .(4)[548:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<7>[   10.595643] .(4)[548:camerahalserver][imgsensor][CheckIsAlive]Profile = 14760 us
<7>[   10.595649] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.595652] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   10.595657] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.595665] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.595673] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.596100] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.596693] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.598132] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<6>[   10.598241] .(2)[197:ccci_ctrl][ccci1/fsm]event 4 is appended from ccci_fsm_recv_control_packet
<7>[   10.598588] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.598624] .(4)[548:camerahalserver][imgsensor]sensor_idx = 0, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   10.598633] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.598635] .(4)[548:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   10.603642] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3041
<7>[   10.604120] .(4)[548:camerahalserver]S5K3L8[get_imgsensor_id] i2c write id: 0x5a, ReadOut sensor id: 0x30c8, imgsensor_info.sensor_id:0x30c8.
<7>[   10.604143] .(4)[548:camerahalserver][imgsensor] Sensor found ID = 0x30c8
<7>[   10.605192] .(4)[548:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.605249] .(4)[548:camerahalserver][imgsensor][regulator]4 is enabled
<7>[   10.605277] .(4)[548:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   10.605306] .(4)[548:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   10.605395] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   10.605405] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.606267] .(4)[548:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   10.607191] .(4)[548:camerahalserver][imgsensor][CheckIsAlive]Profile = 11541 us
<7>[   10.607206] .(4)[548:camerahalserver][imgsensor][imgsensor_set_driver] :[0][1][s5k3l8_mipi_raw]
<7>[   10.607217] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3107
<7>[   10.607362] .(4)[548:camerahalserver][imgsensor][CAMERA SENSOR] CAOMPAT_KDIMGSENSORIOC_X_GETINFO2
<7>[   10.607381] .(4)[548:camerahalserver][imgsensor][adopt_CAMERA_HW_GetInfo2]Entry0
<7>[   10.607391] .(4)[548:camerahalserver]S5K3L8[get_info] scenario_id = 0
<7>[   10.607398] .(4)[548:camerahalserver]S5K3L8[get_info] scenario_id = 1
<7>[   10.607403] .(4)[548:camerahalserver]S5K3L8[get_info] scenario_id = 2
<7>[   10.607407] .(4)[548:camerahalserver]S5K3L8[get_info] scenario_id = 3
<7>[   10.607412] .(4)[548:camerahalserver]S5K3L8[get_info] scenario_id = 4
<7>[   10.607418] .(4)[548:camerahalserver]S5K3L8[get_info] scenario_id = 5
<7>[   10.607422] .(4)[548:camerahalserver]S5K3L8[get_info] scenario_id = 6
<7>[   10.607427] .(4)[548:camerahalserver]S5K3L8[get_info] scenario_id = 7
<7>[   10.607431] .(4)[548:camerahalserver]S5K3L8[get_info] scenario_id = 8
<7>[   10.607435] .(4)[548:camerahalserver]S5K3L8[get_info] scenario_id = 9
<7>[   10.607441] .(4)[548:camerahalserver]S5K3L8[get_resolution] E
<7>[   10.607445] .(4)[548:camerahalserver][imgsensor][CAMERA_HW][Pre]w=0x838, h = 0x618
<7>[   10.607449] .(4)[548:camerahalserver][imgsensor][CAMERA_HW][Full]w=0x1070, h = 0xc30
<7>[   10.607454] .(4)[548:camerahalserver][imgsensor][CAMERA_HW][VD]w=0x1070, h = 0xc30
<7>[   10.607563] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.607575] .(4)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 0
<7>[   10.607586] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.607598] .(4)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 1
<7>[   10.607614] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.607619] .(4)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 2
<7>[   10.607627] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.607632] .(4)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 3
<7>[   10.607639] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.607643] .(4)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 4
<7>[   10.607650] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.607654] .(4)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 5
<7>[   10.607661] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.607674] .(4)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 6
<7>[   10.607682] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.607686] .(4)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 7
<7>[   10.607693] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.607697] .(4)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 8
<7>[   10.607705] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3059
<7>[   10.607709] .(4)[548:camerahalserver]S5K3L8[get_default_framerate_by_scenario] scenario_id = 9
<6>[   10.608419] -(1)[189:ccci_fsm1][ccci1/fsm]md_state change from 3 to 4
<6>[   10.609308] -(1)[189:ccci_fsm1][ccci1/fsm]event 4 is completed by fsm_main_thread
<5>[   10.610280] .(1)[189:ccci_fsm1][VcoreFS] kicker: KIR_APCCCI, opp: -1, dvfs_opp: 3, sw_opp: 0, kr opp: -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
<5>[   10.612243] .(1)[189:ccci_fsm1][VcoreFS] opp: 3, vcore: 725000 <= 793750, fddr: 1200000 <= 1866000 [O][O]
<5>[   10.614136] -(1)[189:ccci_fsm1][VcoreFS] [spm_trigger_dvfs] fix: 0, opp: 3, vcore: 0x10000, emi: 0x90299, md: 0x0
<6>[   10.615706] .(1)[189:ccci_fsm1][ccci1/fsm]command 1 is completed 1 by fsm_main_thread
<3>[   10.617096] .(3)[403:ccci_mdinit]BOOTPROF:     10617.095101:ccci_md1: ready
<3>[   10.617610] .(1)[521:main]BOOTPROF:     10617.606870:Zygote:Preload Start
<14>[   10.619509] .(6)[1:init]init: PropSet [af.modem_1.epof]=[0] Done
<14>[   10.622128] .(6)[1:init]init: PropSet [mtk.md1.status]=[ready] Done
<14>[   10.624814] .(6)[1:init]init: processing action (mtk.md1.status=ready) from (/vendor/etc/init/init.bip.rc:4)
<14>[   10.627317] .(6)[1:init]init: starting service 'bip'...
<14>[   10.631260] .(6)[1:init]init: [PropSet]: pid:403 uid:1000 gid:1001 ctl.start, emdlogger1
<7>[   10.631612] .(4)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3081
<7>[   10.631620] .(4)[548:camerahalserver]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:1
<7>[   10.631789] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.631796] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 0
<7>[   10.631798] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=8, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.631801] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 10
<4>[   10.631803] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.631805] .(4)[548:camerahalserver]it is not ov7251 it is 1 
<14>[   10.634639] .(5)[805:init]init: Created socket '/dev/socket/bip', mode 660, user 0, group 1000
<7>[   10.636815] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.636841] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   10.636874] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.636907] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.636920] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<14>[   10.639107] .(6)[1:init]init: starting service 'emdlogger1'...
<7>[   10.640395] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.640433] .(5)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:3 powerId:2800000
<14>[   10.641511] .(6)[1:init]init: processing action (mtk.md1.status=ready) from (/vendor/etc/init/init.volte_imsm_93.rc:5)
<14>[   10.642503] .(6)[1:init]init: starting service 'volte_imsm_93'...
<7>[   10.643849] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<14>[   10.644243] .(6)[1:init]init: PropSet [af.speech.shm_init]=[1] Done
<7>[   10.644893] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.644906] .(5)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   10.644910] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.644945] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   10.644955] .(5)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.644958] .(5)[548:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<14>[   10.658745] .(6)[1:init]init: starting service 'volte_stack'...
<7>[   10.660386] .(5)[548:camerahalserver]IMX258_camera_sensor[feature_control] feature_id = 3041
<6>[   10.660533] .(5)[548:camerahalserver]i2c i2c-4: addr: 1a, transfer ACK error
<3>[   10.661482] .(5)[548:camerahalserver]I2C write failed (0x0)! speed(0=400)
<7>[   10.662426] .(5)[548:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x34, id: 0x0
<14>[   10.662806] .(6)[1:init]init: [PropSet]: pid:403 uid:1000 gid:1001 ctl.start, gsm0710muxd
<14>[   10.664403] .(5)[808:init]init: Created socket '/dev/socket/volte_stack', mode 660, user 0, group 1000
<14>[   10.664557] .(6)[1:init]init: starting service 'gsm0710muxd'...
<6>[   10.666657] .(5)[548:camerahalserver]i2c i2c-4: addr: 10, transfer ACK error
<14>[   10.666756] .(6)[1:init]init: starting service 'volte_ua'...
<3>[   10.668426] .(5)[548:camerahalserver]I2C write failed (0x0)! speed(0=400)
<14>[   10.669838] .(6)[1:init]init: starting service 'volte_imcb'...
<7>[   10.669960] .(5)[548:camerahalserver]IMX258_camera_sensor[get_imgsensor_id] Read sensor id fail, write id: 0x20, id: 0x0
<7>[   10.669971] .(5)[548:camerahalserver][imgsensor]Fail to get sensor ID ffffffff
<7>[   10.669974] .(5)[548:camerahalserver][imgsensor]ERROR:imgsensor_check_is_alive(), No imgsensor alive
<3>[   10.669979] .(5)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 0
<3>[   10.669982] .(5)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 10
<4>[   10.669985] .(5)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.669987] .(5)[548:camerahalserver]it is not ov7251 it is 1 
<14>[   10.670068] .(4)[811:init]init: Created socket '/dev/socket/volte_ua', mode 660, user 0, group 1000
<7>[   10.671060] .(5)[548:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.671153] .(5)[548:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   10.671160] .(5)[548:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   10.671231] .(5)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   10.671242] .(5)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.671244] .(5)[548:camerahalserver]it is not ov7251 it is imx258_mipi_raw 
<7>[   10.671328] .(5)[548:camerahalserver][imgsensor][CheckIsAlive]Profile = 39467 us
<7>[   10.671341] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.671344] .(5)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 0
<7>[   10.671348] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=8, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.671350] .(5)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 10
<4>[   10.671353] .(5)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.671355] .(5)[548:camerahalserver]it is not ov7251 it is 1 
<7>[   10.676424] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.676443] .(5)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   10.676492] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.676510] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.676520] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.680858] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.680889] .(5)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:3 powerId:2800000
<14>[   10.684835] .(6)[812:init]init: Created socket '/dev/socket/volte_imsa1', mode 660, user 0, group 1001
<7>[   10.685130] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=3, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<14>[   10.687632] .(6)[812:init]init: Created socket '/dev/socket/volte_imsa2', mode 660, user 0, group 1001
<7>[   10.687667] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.687681] .(5)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   10.687687] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.687725] .(5)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   10.687736] .(5)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.687738] .(5)[548:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<6>[   10.692307] .(5)[805:bip][ccci1/chr]port ccci_bip open with flag 20002 by bip
<7>[   10.692908] .(0)[548:camerahalserver]S5K3L8[feature_control] feature_id = 3041
<14>[   10.693936] .(6)[812:init]init: Created socket '/dev/socket/volte_ut', mode 660, user 0, group 1001
<36>[   10.696559] .(1)[364:logd.auditd]type=1400 audit(1578636730.954:34): avc: denied { getattr } for pid=763 comm="aee" path="/sys/devices/virtual/BOOT/BOOT/boot/boot_mode" dev="sysfs" ino=5378 scontext=u:r:mobile_log_d:s0 tcontext=u:object_r:sysfs:s0 tclass=file permissive=0
<36>[   10.699642] .(1)[364:logd.auditd]type=1400 audit(1578636731.506:35): avc: denied { read } for pid=805 comm="bip" name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=11773 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
<6>[   10.700397] .(4)[548:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   10.700436] .(4)[548:camerahalserver]I2C read failed (0x0)! speed(0=400)
<6>[   10.700518] .(4)[548:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   10.700533] .(4)[548:camerahalserver]I2C read failed (0x0)! speed(0=400)
<7>[   10.700538] .(4)[548:camerahalserver]S5K3L8[get_imgsensor_id] Read sensor id fail, i2c write id: 0x5a, ReadOut sensor id: 0x0, imgsensor_info.sensor_id:0x30c8.
<6>[   10.700605] .(4)[548:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   10.700619] .(4)[548:camerahalserver]I2C read failed (0x0)! speed(0=400)
<6>[   10.700676] .(4)[548:camerahalserver]i2c i2c-4: addr: 2d, transfer ACK error
<3>[   10.700690] .(4)[548:camerahalserver]I2C read failed (0x0)! speed(0=400)
<7>[   10.700693] .(4)[548:camerahalserver]S5K3L8[get_imgsensor_id] Read sensor id fail, i2c write id: 0x5a, ReadOut sensor id: 0x0, imgsensor_info.sensor_id:0x30c8.
<7>[   10.700699] .(4)[548:camerahalserver][imgsensor]Fail to get sensor ID ffffffff
<7>[   10.700702] .(4)[548:camerahalserver][imgsensor]ERROR:imgsensor_check_is_alive(), No imgsensor alive
<3>[   10.700707] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 0
<3>[   10.700709] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 10
<4>[   10.700711] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.700713] .(4)[548:camerahalserver]it is not ov7251 it is 1 
<7>[   10.701762] .(4)[548:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.701797] .(4)[548:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   10.701804] .(4)[548:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   10.701850] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   10.701858] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.701862] .(4)[548:camerahalserver]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   10.701867] .(4)[548:camerahalserver][imgsensor][CheckIsAlive]Profile = 30532 us
<7>[   10.701875] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=7, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.701882] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 0
<7>[   10.701885] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=8, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.701889] .(4)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 10
<4>[   10.701891] .(4)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.701893] .(4)[548:camerahalserver]it is not ov7251 it is 1 
<7>[   10.710432] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.710450] .(4)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   10.710498] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=3, pin_state_on=8, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.710508] .(4)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:3 powerId:2500000
<7>[   10.710957] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.710972] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=4, pin_state_on=2, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.711017] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<3>[   10.711022] .(4)[548:camerahalserver][regulator]fail to regulator_set_voltage, powertype:6 powerId:2800000
<7>[   10.711026] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.711042] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.711052] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   10.712066] .(4)[548:camerahalserver][imgsensor]sensor_idx = 1, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   10.712122] .(4)[548:camerahalserver]it is ov7251 is_sub_camera=1 
<4>[   10.712124] .(4)[548:camerahalserver]OV7251_power_on 1
<4>[   10.712126] .(4)[548:camerahalserver]scanner 3v3 enable:1
<6>[   10.730728] .(3)[579:mtk_agpsd][ccci1/chr]port ccci_c2k_agps open with flag 20902 by mtk_agpsd
<3>[   10.766441] .(6)[808:volte_stack]Dump cpuinfo
<5>[   10.778200] -(2)[812:volte_imcb]alarmtimer_enqueue, 110733875000
<5>[   10.779025] -(2)[812:volte_imcb]alarmtimer_enqueue, 10734703462
<6>[   10.792870] .(5)[548:camerahalserver][D][Factory Data](property_get): (offset = 7)
<6>[   10.793965] .(5)[548:camerahalserver][D][Factory Data](dl_factory_get_element_type): (id=6)+
<6>[   10.795067] .(5)[548:camerahalserver][D][Factory Data](_factory_get_element_type): (id=6)+
<6>[   10.796156] .(5)[548:camerahalserver][D][Factory Data](_get_factory_item): (id=6)+
<6>[   10.797484] .(5)[548:camerahalserver][D][Factory Data](_factory_get_element_type): (id=6): type = 3
<6>[   10.798695] .(5)[548:camerahalserver][D][Factory Data](dl_factory_get_element_num): (id=6)+
<6>[   10.800076] .(5)[548:camerahalserver][D][Factory Data](_factory_get_element_num): (id=6)+
<6>[   10.801181] .(5)[548:camerahalserver][D][Factory Data](_get_factory_item): (id=6)+
<6>[   10.802162] .(5)[548:camerahalserver][D][Factory Data](_factory_get_element_num): (id=6): elements = 1
<6>[   10.803368] .(5)[548:camerahalserver][D][Factory Data](dl_factory_get_value): +
<6>[   10.804406] .(5)[548:camerahalserver][D][Factory Data](_factory_get_value): [id=6,index=0] +
<6>[   10.805504] .(5)[548:camerahalserver][D][Factory Data](_get_factory_item): (id=6)+
<6>[   10.806493] .(5)[548:camerahalserver][D][Factory Data](_factory_get_value_from_memory): [id=6,index=0] +
<6>[   10.807757] .(5)[548:camerahalserver][D][Factory Data](_factory_get_value_from_memory): -
<6>[   10.810396] .(2)[548:camerahalserver][D][Factory Data](_factory_get_value): [id=6,index=0] value=16 -
<6>[   10.811628] .(2)[548:camerahalserver][D][Factory Data](property_get): els: 1, i 1, written 3
<4>[   10.812847] .(2)[548:camerahalserver][stm32]This is an EL engine!!! 
<6>[   10.813676] .(2)[548:camerahalserver]OV72512LANE[ov7251_init] E
<4>[   10.814443] .(2)[548:camerahalserver]hehai ov7251 id = 7750 
<7>[   10.815211] .(2)[548:camerahalserver][imgsensor] Sensor found ID = 0x7750
<3>[   10.815228] .(2)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 8, Val 0
<3>[   10.816149] .(2)[548:camerahalserver]gpio_set : pinctrl err, PinIdx 7, Val 10
<4>[   10.817097] .(2)[548:camerahalserver]it is not ov7251 is_sub_camera=0 
<4>[   10.817937] .(2)[548:camerahalserver]it is not ov7251 it is 1 
<7>[   10.819801] .(2)[548:camerahalserver][imgsensor][regulator]6 is enabled
<7>[   10.819832] .(2)[548:camerahalserver][imgsensor][regulator]5 is enabled
<7>[   10.819843] .(2)[548:camerahalserver][imgsensor][regulator]3 is enabled
<7>[   10.819884] .(2)[548:camerahalserver][imgsensor]mclk_set : sensor_idx 1 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   10.819897] .(2)[548:camerahalserver]it is ov7251 is_sub_camera=1 
<4>[   10.820731] .(2)[548:camerahalserver]OV7251_power_off 1
<4>[   10.821430] .(2)[548:camerahalserver]scanner 3v3 enable:0
<7>[   10.824488] .(7)[548:camerahalserver][imgsensor][CheckIsAlive]Profile = 122613 us
<7>[   10.824509] .(7)[548:camerahalserver][imgsensor][imgsensor_set_driver] :[1][2][ov7251]
<7>[   10.824793] .(7)[548:camerahalserver][imgsensor][CAMERA SENSOR] CAOMPAT_KDIMGSENSORIOC_X_GETINFO2
<7>[   10.824823] .(7)[548:camerahalserver][imgsensor][adopt_CAMERA_HW_GetInfo2]Entry1
<6>[   10.824840] .(7)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 0
<6>[   10.825735] .(7)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 1
<6>[   10.826666] .(7)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 2
<6>[   10.827803] .(7)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 3
<6>[   10.829357] .(7)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 4
<6>[   10.830296] .(7)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 5
<6>[   10.831185] .(7)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 6
<6>[   10.832072] .(7)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 7
<6>[   10.833025] .(7)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 8
<6>[   10.833923] .(7)[548:camerahalserver]OV72512LANE[get_info] scenario_id = 9
<6>[   10.834811] .(7)[548:camerahalserver]OV72512LANE[get_resolution] E
<7>[   10.835613] .(7)[548:camerahalserver][imgsensor][CAMERA_HW][Pre]w=0x280, h = 0x1e0
<7>[   10.835624] .(7)[548:camerahalserver][imgsensor][CAMERA_HW][Full]w=0x280, h = 0x1e0
<7>[   10.835629] .(7)[548:camerahalserver][imgsensor][CAMERA_HW][VD]w=0x280, h = 0x1e0
<6>[   10.835864] .(7)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 0
<6>[   10.837129] .(7)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 1
<6>[   10.838360] .(7)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 2
<6>[   10.839542] .(7)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 3
<6>[   10.840518] .(1)[406:wfca][ccci1/chr]port ccci_imsa close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   10.840541] .(1)[406:wfca][ccci1/pot]critical user check: 0x1
<6>[   10.840608] .(1)[406:wfca][ccci1/chr]port ccci_imsa open with flag 20002 by wfca
<6>[   10.843639] .(7)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 4
<6>[   10.844875] .(7)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 5
<6>[   10.846201] .(4)[530:vtservice][ccci1/chr]port ccci_imsdc open with flag 20002 by vtservice
<6>[   10.846797] .(7)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 6
<6>[   10.846810] .(7)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 7
<6>[   10.846815] .(7)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 8
<6>[   10.846820] .(7)[548:camerahalserver]OV72512LANE[get_default_framerate_by_scenario] scenario_id = 9
<6>[   10.889558] .(4)[548:camerahalserver]OV72512LANE[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:1
<7>[   10.891009] .(4)[548:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 0, freq= 3, TG= 0
<7>[   10.891430] .(4)[548:camerahalserver][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 0, freq= 3, TG= 1
<6>[   10.891927] .(4)[548:camerahalserver][ISP][ISP_release] - E. UserCount: 1.
<6>[   10.892949] .(4)[548:camerahalserver][ISP][ISP_release] Curr UserCount(0), (process, pid, tgid)=(camerahalserver, 548, 548), log_limit_line(0),	last user
<6>[   10.894856] [ISP][ISP_release] - X. UserCount: 0. G_u4EnableClockCount:0<7>[   10.895753] .(4)[548:camerahalserver][imgsensor]imgsensor_release 1
<7>[   10.895928] .(4)[548:camerahalserver][imgsensor]imgsensor_release 0
<6>[   10.913622] .(1)[812:volte_imcb][ccci1/chr]port ccci_imsc open with flag 20002 by volte_imcb
<6>[   10.916852] .(6)[807:volte_imsm_93][ccci1/chr]port ccci_imsm open with flag 20102 by volte_imsm_93
<6>[   11.165670] .(1)[880:initCamdevice][ISP][ISP_open] - E. UserCount: 0.
<6>[   11.166520] .(1)[880:initCamdevice][ISP][ISP_open] Curr UserCount(1), (process, pid, tgid)=(initCamdevice, 880, 548), log_limit_line(150), first user
<6>[   11.169834] .(1)[880:initCamdevice][ISP][ISP_open] - X. Ret: 0. UserCount: 1. G_u4EnableClockCount:1
<7>[   11.171162] .(1)[880:initCamdevice][imgsensor]imgsensor_open 1
<7>[   11.172309] .(2)[880:initCamdevice][imgsensor]imgsensor_open 2
<7>[   11.172475] .(2)[880:initCamdevice][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 1, freq= 3, TG= 0
<7>[   11.173582] .(0)[880:initCamdevice][imgsensor]sensor_idx = 0, pin=9, pin_state_on=10, hw_id =2(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.173614] .(0)[880:initCamdevice][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 10
<7>[   11.173645] .(0)[880:initCamdevice][imgsensor]sensor_idx = 0, pin=1, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.173666] .(0)[880:initCamdevice][imgsensor]sensor_idx = 0, pin=2, pin_state_on=0, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.173680] .(0)[880:initCamdevice][imgsensor]sensor_idx = 0, pin=5, pin_state_on=7, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.174119] .(2)[880:initCamdevice][imgsensor]sensor_idx = 0, pin=3, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.174812] .(1)[880:initCamdevice][imgsensor]sensor_idx = 0, pin=4, pin_state_on=3, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.176277] .(2)[880:initCamdevice][imgsensor]sensor_idx = 0, pin=6, pin_state_on=9, hw_id =0(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.176840] .(6)[880:initCamdevice][imgsensor]sensor_idx = 0, pin=1, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<7>[   11.176896] .(6)[880:initCamdevice][imgsensor]sensor_idx = 0, pin=2, pin_state_on=10, hw_id =1(0:PMIC, 1:GPIO, 2:exGPIO)
<4>[   11.176908] .(6)[880:initCamdevice]it is not ov7251 is_sub_camera=0 
<4>[   11.177752] .(6)[880:initCamdevice]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   11.188650] .(6)[880:initCamdevice][imgsensor][kdCISModulePowerOn]Profile = 15069 us
<7>[   11.188680] .(6)[880:initCamdevice]S5K3L8[open] S5K3L8,MIPI 4LANE
<7>[   11.189115] .(6)[880:initCamdevice]S5K3L8[open] i2c write id: 0x5a, sensor id: 0x30c8
<7>[   11.189125] .(6)[880:initCamdevice]S5K3L8[sensor_init] E
<3>[   11.249819] .(5)[522:main]BOOTPROF:     11249.818410:Zygote:Preload End
<7>[   11.261302] .(6)[880:initCamdevice][ccu][ccu_set_sensor_info] ccu catch Main sensor i2c slave address : 0x5a
<7>[   11.261327] .(6)[880:initCamdevice][ccu][ccu_set_sensor_info] ccu catch Main sensor name : s5k3l8_mipi_raw
<7>[   11.261334] .(6)[880:initCamdevice][imgsensor][SensorOpen]Profile = 87756 us
<7>[   11.264964] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_open] EEPROM_drv_open start
<7>[   11.267023] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] CAM_CALIOC_G_READ start! offset=4, length=1
<7>[   11.267049] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_set_i2c_bus] EEPROM_set_i2c_bus end! deviceID=1 g_curBusIdx=0 g_Current_Client=ffffffc05c20bc00
<7>[   11.267057] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] SensorID=30c8 DeviceID=1
<7>[   11.267064] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info_ex] g_camCalDrvInfo[0].sensorID == 0, start get_cmd_info!
<7>[   11.267070] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info] pCamCalList!=NULL && pCamCalFunc!= NULL
<7>[   11.267076] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info] pCamCalList[4].sensorID==30c8
<7>[   11.267081] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info] g_Current_Client->addr =50
<7>[   11.267085] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info] 20 client=ffffffc05c20bc00 client2=ffffffc05c2f9800 client3=          (null) Cur=ffffffc05c20bc00
<7>[   11.267374] .(4)[878:HwBinder:548_2]cam_cal_list[cam_cal_check_mtk_cid] calibrationID = 23
<7>[   11.267391] .(4)[878:HwBinder:548_2]cam_cal_list[cam_cal_check_mtk_cid] mtkCidList[0] == 23
<7>[   11.267401] .(4)[878:HwBinder:548_2]cam_cal_list[cam_cal_check_mtk_cid] ret =1
<7>[   11.267410] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info] pCamCalList[4].checkFunc ok!
<7>[   11.267416] .(4)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_get_cmd_info_ex] deviceID=1, SensorID=30c8
<7>[   11.267689] .(5)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_open] EEPROM_drv_open start
<7>[   11.269730] .(5)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] CAM_CALIOC_G_READ start! offset=32, length=2
<7>[   11.269752] .(5)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_set_i2c_bus] EEPROM_set_i2c_bus end! deviceID=1 g_curBusIdx=0 g_Current_Client=ffffffc05c20bc00
<7>[   11.269759] .(5)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] SensorID=30c8 DeviceID=1
<7>[   11.270166] .(5)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] CAM_CALIOC_G_READ start! offset=34, length=1868
<7>[   11.270174] .(5)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_set_i2c_bus] EEPROM_set_i2c_bus end! deviceID=1 g_curBusIdx=0 g_Current_Client=ffffffc05c20bc00
<7>[   11.270180] .(5)[878:HwBinder:548_2]CAM_CAL_DRV[EEPROM_drv_ioctl] SensorID=30c8 DeviceID=1
<36>[   11.375487] .(7)[364:logd.auditd]type=1400 audit(1578636731.510:36): avc: denied { read } for pid=805 comm="bip" name="u:object_r:net_dns_prop:s0" dev="tmpfs" ino=11773 scontext=u:r:bip:s0 tcontext=u:object_r:net_dns_prop:s0 tclass=file permissive=0
<3>[   11.375542] .(5)[878:HwBinder:548_2][Cooler_NR]clNR_status_open 153
<3>[   11.375565] .(5)[878:HwBinder:548_2][Cooler_NR]clNR_status_mmap 94
<3>[   11.375567] .(5)[878:HwBinder:548_2][Cooler_NR]clNR_status_mmap 99
<7>[   11.377823] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3081
<7>[   11.377838] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:0
<7>[   11.377852] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3081
<7>[   11.377855] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:1
<7>[   11.377861] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3081
<7>[   11.377864] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:2
<7>[   11.377869] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3081
<7>[   11.377872] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:3
<7>[   11.377877] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3081
<7>[   11.377880] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] SENSOR_FEATURE_GET_CROP_INFO scenarioId:4
<36>[   11.380989] .(7)[364:logd.auditd]type=1400 audit(1578636732.186:37): avc: denied { add_name } for pid=548 comm="HwBinder:548_2" name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<7>[   11.393135] .(5)[878:HwBinder:548_2]S5K3L8[feature_control] feature_id = 3059
<7>[   11.393158] .(5)[878:HwBinder:548_2]S5K3L8[get_default_framerate_by_scenario] scenario_id = 0
<7>[   11.393244] .(5)[878:HwBinder:548_2]flashlight: flashlight_open: Open(0,0,0)
<7>[   11.393252] .(5)[878:HwBinder:548_2]flashlight: flashlight_open: Open(0,1,0)
<7>[   11.393266] .(5)[878:HwBinder:548_2]flashlight: _flashlight_ioctl: FLASH_IOC_GET_PART_ID(0,0,0): 1
<7>[   11.393283] .(5)[878:HwBinder:548_2]flashlight: flashlight_release: Release(0,0,0)
<7>[   11.393289] .(5)[878:HwBinder:548_2]flashlight: flashlight_release: Release(0,1,0)
<7>[   11.393892] .(5)[878:HwBinder:548_2]flashlight: flashlight_open: Open(0,0,0)
<7>[   11.393910] .(5)[878:HwBinder:548_2]flashlight: flashlight_open: Open(0,1,0)
<7>[   11.393926] .(5)[878:HwBinder:548_2]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,0,0): 1
<6>[   11.393934] .(5)[878:HwBinder:548_2]flashlights_mt6370: mt6370_set_driver: Set driver: 1
<7>[   11.394978] .(5)[878:HwBinder:548_2]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,1,0): 1
<6>[   11.394985] .(5)[878:HwBinder:548_2]flashlights_mt6370: mt6370_set_driver: Set driver: 2
<7>[   11.429057] .(4)[877:HwBinder:548_1]flashlight: _flashlight_ioctl: FLASH_IOC_SET_ONOFF(0,0,0): 0
<7>[   11.429096] .(4)[877:HwBinder:548_1]flashlights_mt6370: mt6370_ioctl: FLASH_IOC_SET_ONOFF(0): 0
<7>[   11.429110] .(4)[877:HwBinder:548_1]flashlight: _flashlight_ioctl: FLASH_IOC_SET_ONOFF(0,1,0): 0
<7>[   11.429116] .(4)[877:HwBinder:548_1]flashlights_mt6370: mt6370_ioctl: FLASH_IOC_SET_ONOFF(1): 0
<6>[   11.429299] .(4)[877:HwBinder:548_1]mt6370_pmu_fled mt6370_pmu_fled.0: set to off mode
<5>[   11.429814] .(1)[413:vendor.mediatek][Power/PPM] (0x0)(-1)(0)(0-7)(15)(0)(4)(4) (15)(0)(4)(4) 
<6>[   11.431477] .(4)[877:HwBinder:548_1]mt6370_pmu_fled mt6370_pmu_fled.1: set to off mode
<7>[   11.432666] .(4)[877:HwBinder:548_1]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,0,0): 0
<6>[   11.432689] .(4)[877:HwBinder:548_1]flashlights_mt6370: mt6370_set_driver: Unset driver: 1
<7>[   11.433790] .(4)[877:HwBinder:548_1]flashlight: _flashlight_ioctl: FLASHLIGHTIOC_X_SET_DRIVER(0,1,0): 0
<6>[   11.433825] .(4)[877:HwBinder:548_1]mt6370_pmu_fled mt6370_pmu_fled.0: set to off mode
<6>[   11.434847] .(4)[877:HwBinder:548_1]mt6370_pmu_fled mt6370_pmu_fled.1: set to off mode
<6>[   11.435860] .(4)[877:HwBinder:548_1]flashlights_mt6370: mt6370_set_driver: Unset driver: 0
<7>[   11.448400] .(4)[877:HwBinder:548_1]flashlight: flashlight_release: Release(0,0,0)
<7>[   11.448423] .(4)[877:HwBinder:548_1]flashlight: flashlight_release: Release(0,1,0)
<7>[   11.472039] .(5)[877:HwBinder:548_1][imgsensor][CAMERA SENSOR] CCF kdSetSensorMclk on= 0, freq= 3, TG= 0
<7>[   11.472420] .(5)[877:HwBinder:548_1]S5K3L8[close] E
<7>[   11.473491] .(5)[877:HwBinder:548_1][imgsensor][regulator]6 is enabled
<7>[   11.473530] .(5)[877:HwBinder:548_1][imgsensor][regulator]4 is enabled
<7>[   11.473575] .(5)[877:HwBinder:548_1][imgsensor][regulator]3 is enabled
<7>[   11.473602] .(5)[877:HwBinder:548_1][imgsensor][regulator]5 is enabled
<7>[   11.473639] .(5)[877:HwBinder:548_1][imgsensor]mclk_set : sensor_idx 0 mclk_set pinctrl, PinIdx 9, Val 0
<4>[   11.473649] .(5)[877:HwBinder:548_1]it is not ov7251 is_sub_camera=0 
<4>[   11.474534] .(5)[877:HwBinder:548_1]it is not ov7251 it is s5k3l8_mipi_raw 
<7>[   11.475594] .(5)[877:HwBinder:548_1][imgsensor]imgsensor_release 1
<6>[   11.475760] .(5)[877:HwBinder:548_1][ISP][ISP_release] - E. UserCount: 1.
<6>[   11.476671] .(5)[877:HwBinder:548_1][ISP][ISP_release] Curr UserCount(0), (process, pid, tgid)=(HwBinder:548_1, 877, 548), log_limit_line(0),	last user
<6>[   11.478416] [ISP][ISP_release] - X. UserCount: 0. G_u4EnableClockCount:0<7>[   11.479332] .(5)[877:HwBinder:548_1][imgsensor]imgsensor_release 0
<4>[   11.521705] .(1)[222:battery_thread]=====FG===== SOC  = 100
<5>[   11.522447] .(1)[222:battery_thread][read_boot_battery_plug_out_status] rtc_invalid 0 plugout 0 bat_plug_out_time 0 sp0:0x60 sp3:0xe4 1 1
<4>[   11.524763] .(1)[222:battery_thread]=====FG===== AC   = -372
<4>[   11.527287] -(1)[222:battery_thread]mt6356_get_auxadc_value: 15 callbacks suppressed
<7>[   11.527296] .(1)[222:battery_thread][mt6356_get_auxadc_value]222 ch_idx = 10, channel = 1, reg_val = 0x6620, adc_result = 4308
<7>[   11.529919] .(1)[222:battery_thread][mt6356_get_auxadc_value]222 ch_idx = 1, channel = 2, reg_val = 0x475, adc_result = 501
<4>[   11.531207] .(0)[0:swapper/0]Power/swap DP: No enter --- SODI3: No enter --- SODI: No enter --- 
<4>[   11.531388] .(7)[0:swapper/7]mcdi cpu: 0, 0, 0, 0, 25, 57, 23, 107, cluster : 0, 0, pause = 0, multi core = 0, residency = 0, last core = 0, avail cpu = 00ff, cluster = 0003, enabled = 1, max_s_state = 5 (buck_off = 0), system_idle_hint = 00000000
<4>[   11.531388] 
<4>[   11.532721] .(2)[222:battery_thread]=====FG===== AC   = -372
<7>[   11.532726] .(2)[222:battery_thread][mt6356_get_auxadc_value]111 ch_idx = 2, channel = 3, bat_cur = 372, reg_val = 0x3a0, adc_result = 815
<5>[   11.532950] .(2)[222:battery_thread]car[-4,137,-141,277,-141] c:0 -372 vbat:4308 vbus:4740 soc:100 100 gm3:0 0 0 0
<5>[   11.533220] .(2)[222:battery_thread]tmp:25 65535 65535 hcar2:279 lcar2:139 time:11 sw_iavg:90 -14 1 nafg_m:0 0 0
<5>[   11.533643] .(1)[400:fuelgauged]MTK_FG: get_kernel_cmd:1 0
<7>[   11.535264] .(1)[400:fuelgauged][mt6356_get_auxadc_value]222 ch_idx = 10, channel = 1, reg_val = 0x65fc, adc_result = 4302
<4>[   11.535271] .(1)[400:fuelgauged]=====FG-MTK===== bat_vol=4302
<6>[   11.537546] .(3)[222:battery_thread][I][Factory Data](read_config_partition): OK
<4>[   11.538826] .(2)[400:fuelgauged]=====FG===== AC   = -372
<7>[   11.538842] .(2)[400:fuelgauged][mt6356_get_auxadc_value]111 ch_idx = 2, channel = 3, bat_cur = 372, reg_val = 0x3a2, adc_result = 817
<5>[   11.539268] MTK_FG: [dod_init_result]HW(43228, 9914) SW(43228, 9914) OLD(43370, 10000) VBAT(43219, 9908) OldCAR(c:0 v:0) con0(10000)
<5>[   11.539268] [dod_init_result]NVRAM_ready 1 Embedded 0 plug_out 0 is_hwocv_unreliable 0 rtc_invalid 0 rtc_ui_soc 10000 two_sec_reboot 0 old_data.ui_soc 10000, nv_fail(0)
<5>[   11.539268] [dod_init_result]T_new 25 T_old 25 T_d0 25 shutdown_time 0 pmic_shutdown_time 1800 plugout_time 0 plugout_time_th 32 swocv_oldocv_diff_emb 1000
<5>[   11.539268] [dod_init_result]ocv[boot:43221 final:43370 diff:149] thr[10000 10000 10000] tmp[now 25 5] v[lk_v:43219 cur:42860] lk_i:-15 lk_r:1700,i*r:2,old_soc:10000
<5>[   11.539268] [dod_init_result] <9> 43370 43370 10000 0 0 1 0
<5>[   11.539268] [dod_init_result] fg_c_d0(43370, 10000) fg_v_d0(43370, 10000) ui_d0_soc 10000 ui_soc_opt 0 car_v:-2 _car:-2
<5>[   11.539268] [dod_init_result] force_vc_mode 0 vc_mode 1 d0_sel 0
<5>[   11.539353] .(2)[400:fuelgauged]MTK_FG: {FGADC}soc:10000 fg_c_soc:10000 fg_v_soc:10000 ui_soc:10000 vc_diff:0 vc_mode 1 VBAT 43020 T:[25 V 25 C 25] D0_C 10000 D0_V 10000 CAR[c:-2 v:-2]Q:[27966 27966 27966 27966] aging 10000 bat_cycle 1 Trk[0:0:0] UI[1:0] Chr[1:10000:0] pseudo1 0 DC_ratio 100 vboot:35119 35119 dod_init[9]
<14>[   11.687224] .(1)[1:init]init: Command 'wait /only_for_timeout 1' action=mtk.md1.status=ready (/vendor/etc/init/init.volte_imsm_93.rc:10) returned -1 took 1004ms.
<14>[   11.689996] .(1)[1:init]init: PropSet [ril.muxreport.run]=[0] Done
<14>[   11.690898] .(1)[1:init]init: processing action (mtk.md1.status=ready && persist.mtk_epdg_support=1) from (/vendor/etc/init/init.wod.rc:16)
<14>[   11.692672] .(1)[1:init]init: PropSet [ril.epdg.interface.ctrl]=[1] Done
<14>[   11.694064] .(1)[1:init]init: PropSet [debug.mdlogger.Running]=[0] Done
<14>[   11.696072] .(1)[1:init]init: starting service 'epdg_wod'...
<14>[   11.699193] .(1)[1:init]init: PropSet [trustkernel.log.state]=[ready] Done
<14>[   11.699619] .(2)[891:init]init: Created socket '/dev/socket/wod_action', mode 660, user 0, group 1000
<14>[   11.701042] .(2)[891:init]init: Created socket '/dev/socket/wod_sim', mode 660, user 0, group 1000
<14>[   11.734033] .(4)[1:init]init: processing action (trustkernel.log.state=ready) from (/vendor/etc/init/trustkernel.rc:23)
<3>[   11.735578] .(4)[1:init]BOOTPROF:     11735.576642:tkcore: prep log
<14>[   11.737341] .(4)[1:init]init: PropSet [ril.mux.ee.md1]=[0] Done
<14>[   11.739412] .(4)[1:init]init: PropSet [debug.mdl.run.folder]=[] Done
<6>[   11.740039] .(6)[809:gsm0710muxd][ccci1/chr]port ttyC0 open with flag 20902 by gsm0710muxd
<14>[   11.741630] .(4)[1:init]init: PropSet [trustkernel.log.state]=[enable] Done
<14>[   11.743001] .(4)[1:init]init: PropSet [debug.mdl.EE.folder]=[] Done
<14>[   11.749648] .(4)[1:init]init: PropSet [debug.pullmdlog]=[] Done
<14>[   11.752306] .(4)[1:init]init: PropSet [debug.mdl.EE.done]=[] Done
<6>[   11.754120] .(0)[806:emdlogger1][ccci1/chr]port ccci_ccb_dhl open with flag 20002 by emdlogger1
<6>[   11.755271] .(0)[806:emdlogger1][ccci1/shm]smem_port->addr_phy=7c000000
<6>[   11.756309] .(0)[806:emdlogger1][ccci1/chr]remap addr:0x7c000000 len:2097152  map-len:2097152
<6>[   11.757589] .(0)[806:emdlogger1][ccci1/chr]port ccci_ccb_ctrl open with flag 20002 by emdlogger1
<6>[   11.759433] .(0)[806:emdlogger1][ccci1/shm]ccb_configs_len: 20
<6>[   11.760577] .(0)[806:emdlogger1][ccci1/shm]find ccb port ccci_ccb_dhl for user1!
<6>[   11.761695] .(0)[806:emdlogger1][ccci1/chr]remap control addr:0x80018000 len:4096  map-len:4096
<6>[   11.763010] .(0)[806:emdlogger1][ccci1/chr]remap succeed 80018, 0x80018000 -> 0x71ce864000
<6>[   11.765382] .(0)[806:emdlogger1][ccci1/chr]port ccci_raw_dhl open with flag 20002 by emdlogger1
<6>[   11.766528] .(0)[806:emdlogger1][ccci1/shm]smem_port->addr_phy=7c200000
<6>[   11.767554] .(0)[806:emdlogger1][ccci1/chr]remap addr:0x7c200000 len:20971520  map-len:20971520
<14>[   11.777706] .(6)[1:init]init: PropSet [debug.mdlogger.log2sd.path]=[internal_sd] Done
<14>[   11.781543] .(6)[1:init]init: PropSet [debug.mdl.sdswap.path]=[/mnt/sdcard] Done
<14>[   11.786434] .(6)[1:init]init: PropSet [debug.mdlogger.log2sd.path]=[internal_sd] Done
<14>[   11.789467] .(6)[1:init]init: PropSet [debug.mdl.sdswap.path]=[/mnt/sdcard] Done
<14>[   11.793768] .(2)[1:init]init: [PropSet]: pid:809 uid:0 gid:1001 ctl.stop, ril-daemon
<11>[   11.794844] .(2)[1:init]init: no such service 'ril-daemon'
<14>[   11.796276] .(2)[1:init]init: PropSet [debug.mdl.run.folder]=[/data/mdlog/bootupLog/mdlog1] Done
<14>[   11.799300] .(7)[1:init]init: PropSet [ril.mtk]=[1] Done
<14>[   11.801715] .(7)[1:init]init: processing action (ril.mtk=1) from (/vendor/etc/init/rild.rc:12)
<14>[   11.803683] .(7)[1:init]init: starting service 'ril-daemon-mtk'...
<14>[   11.806285] .(7)[1:init]init: PropSet [debug.mdl.EE.folder]=[] Done
<14>[   11.807531] .(2)[925:init]init: Created socket '/dev/socket/sap_uim_socket1', mode 660, user 1002, group 1002
<14>[   11.810441] .(2)[925:init]init: Created socket '/dev/socket/rild-oem', mode 660, user 1001, group 1000
<14>[   11.810797] .(7)[1:init]init: PropSet [debug.mdlogger.log2sd.path]=[internal_sd] Done
<14>[   11.812665] .(7)[1:init]init: PropSet [debug.mdl.sdswap.path]=[/mnt/sdcard] Done
<14>[   11.816489] .(2)[925:init]init: Created socket '/dev/socket/volte_imsvt1', mode 660, user 0, group 1001
<3>[   11.869589] .(5)[521:main]BOOTPROF:     11869.587873:Zygote:Preload 4715 classes in 1098ms
<6>[   12.126407] .(3)[891:epdg_wod][ccci1/chr]port ccci_woa open with flag 20002 by epdg_wod
<3>[   12.134663] .(2)[521:main]BOOTPROF:     12134.661412:Zygote:Preload 64 obtain resources in 59ms
<3>[   12.142380] .(2)[521:main]BOOTPROF:     12142.378643:Zygote:Preload 41 resources in 6ms
<3>[   12.299873] .(4)[521:main]BOOTPROF:     12299.871413:Zygote:Preload End
<14>[   12.491921] .(1)[1:init]init: PropSet [ril.ecclist]=[] Done
<14>[   12.494682] .(6)[1:init]init: PropSet [ril.cdma.card.omh]=[-1] Done
<14>[   12.497249] .(6)[1:init]init: PropSet [ril.cdma.ecclist]=[] Done
<14>[   12.521471] .(0)[1:init]init: PropSet [persist.radio.sim.opid]=[0] Done
<14>[   12.579813] .(1)[1:init]init: PropSet [persist.radio.simswitch]=[1] Done
<14>[   12.588007] .(1)[1:init]init: PropSet [ril.simswitch.no_reset_support]=[1] Done
<3>[   12.606975] .(5)[943:system_server]BOOTPROF:     12606.973183:Android:SysServerInit_START
<6>[   12.609785] .(3)[970:RfxSender_3][ccci1/chr]port ccci_ioctl1 open with flag 20802 by RfxSender_3
<6>[   12.610960] .(3)[970:RfxSender_3][ccci1/fsm]CCCI_IOC_GET_MD_TYPE: 11!
<6>[   12.611925] .(3)[970:RfxSender_3][ccci1/chr]port ccci_ioctl1 close rx_len=0 empty=1, clear_cnt=0, drop=0
<6>[   12.614363] .(3)[970:RfxSender_3][ccci1/pot]critical user check: 0x7
<14>[   12.618088] .(0)[1:init]init: PropSet [persist.sys.dalvik.vm.lib.2]=[libart.so] Done
<14>[   12.624719] .(0)[1:init]init: PropSet [ril.simswitch.tpluswsupport]=[1] Done
<14>[   12.629171] .(0)[1:init]init: PropSet [ril.active.md]=[11] Done
<14>[   12.634881] .(0)[1:init]init: PropSet [ril.nw.worldmode.keep_3g_mode]=[0] Done
<14>[   12.638376] .(0)[1:init]init: PropSet [ril.nw.worldmode.activemode]=[1] Done
<14>[   12.646436] .(0)[1:init]init: PropSet [ril.nw.signalstrength.lte.1]=[2147483647,214748364] Done
<6>[   12.653787] .(3)[996:RfxSender_5][ccci1/chr]port ccci_ss_xcap open with flag 20002 by RfxSender_5
<14>[   12.653909] .(0)[1:init]init: PropSet [ril.apc.support]=[1] Done
<14>[   12.664781] .(0)[1:init]init: PropSet [ril.fd.mode]=[1] Done
<36>[   12.705195] .(1)[364:logd.auditd]type=1400 audit(1578636733.186:38): avc: denied { add_name } for pid=548 comm="HwBinder:548_2" name="shading_otp" scontext=u:r:mtk_hal_camera:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<36>[   12.707920] .(1)[364:logd.auditd]type=1400 audit(1578636733.518:39): avc: denied { write } for pid=361 comm="teed" name="/" dev="dm-2" ino=2 scontext=u:r:tkcore:s0 tcontext=u:object_r:system_data_file:s0 tclass=dir permissive=0
<7>[   12.783766] .(1)[517:disp_queue_P0][DISP]layer_cnt total:100.layers:100,0,0,0,0,0,0,0,0,0,0,0,
<7>[   12.783817] .(1)[517:disp_queue_P0][DISP]layer_cnt .ext:100,0,0,0,0,0,.arm_ext:100,0,0,0,0,0,
<4>[   13.096527] .(0)[396:healthd]=====FG===== SOC  = 100
<4>[   13.098832] .(0)[396:healthd]=====FG===== VOLT = 4300
<4>[   13.099511] .(0)[396:healthd]=====FG===== actural VOLT = 4310
<4>[   13.101704] .(1)[396:healthd]=====FG===== AC   = -89
<4>[   13.103431] .(1)[396:healthd]bq27542_set_commands cmd = 0x12, val = 3884 
<4>[   13.105720] .(1)[396:healthd]temp_now=225, temp_last=225 
<4>[   13.106455] .(1)[396:healthd]=====FG===== TEMP = 225
<6>[   13.108594] .(1)[396:healthd]i2c i2c-2: addr: 6c, transfer ACK error
<6>[   13.109444] .(1)[396:healthd]i2c_dump_info ++++++++++++++++++++++++++++++++++++++++++
<3>[   13.110465] .(1)[396:healthd]I2C structure:
<3>[   13.110465] [I2C]Clk=13650000,Id=2,Op=1,Irq_stat=3,Total_len=1
<3>[   13.110465] [I2C]Trans_len=1,Trans_num=1,Trans_auxlen=0,speed=400000
<3>[   13.110465] [I2C]Trans_stop=1,cg_cnt=1,hs_only=0, ch_offset=0,ch_offset_default=0
<6>[   13.113763] .(1)[396:healthd]base address 0xffffff800bf46000
<6>[   13.114542] .(1)[396:healthd]I2C register:
<6>[   13.114542] [I2C]SLAVE_ADDR=d8,INTR_MASK=0,INTR_STAT=0,CONTROL=28,TRANSFER_LEN=1
<6>[   13.114542] [I2C]TRANSAC_LEN=1,DELAY_LEN=2,TIMING=107,LTIMING=12,START=2,FIFO_STAT=1
<6>[   13.114542] [I2C]IO_CONFIG=3,HS=0,DCM_EN=7,DEBUGSTAT=300,EXT_CONF=1801,TRANSFER_LEN_AUX=1
<6>[   13.118284] .(1)[396:healthd]before enable DMA register(0xffffff800bf48400):
<6>[   13.118284] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[   13.118284] [I2C]STOP=0,FLUSH=0,CON=1,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[   13.118284] [I2C]TX_LEN=0,RX_LEN=c,INT_BUF_SIZE=0,DEBUG_STATUS=c0c0c00
<6>[   13.118284] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[   13.122243] .(1)[396:healthd]DMA register(0xffffff800bf48400):
<6>[   13.122243] [I2C]INT_FLAG=0,INT_EN=0,EN=0,RST=0,
<6>[   13.122243] [I2C]STOP=0,FLUSH=0,CON=0,TX_MEM_ADDR=0, RX_MEM_ADDR=0
<6>[   13.122243] [I2C]TX_LEN=0,RX_LEN=0,INT_BUF_SIZE=0,DEBUG_STATUS=0
<6>[   13.122243] [I2C]TX_MEM_ADDR2=0, RX_MEM_ADDR2=0
<6>[   13.126018] .(1)[396:healthd]i2c_dump_info ------------------------------------------
<3>[   13.127061] .(1)[396:healthd]i2c i2c-2: last transfer info:
<3>[   13.127815] .(1)[396:healthd]i2c i2c-2: [00] [   13.108583] SLAVE_ADDR=d8,INTR_STAT=3,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
<3>[   13.129527] .(1)[396:healthd]i2c i2c-2: [01] [   13.105704] SLAVE_ADDR=ab,INTR_STAT=1,CONTROL=28,FIFO_STAT=220,DEBUGSTAT=300, tmo=500
<3>[   13.131147] .(1)[396:healthd]i2c i2c-2: [02] [   13.105267] SLAVE_ADDR=aa,INTR_STAT=1,CONTROL=28,FIFO_STAT=1101,DEBUGSTAT=300, tmo=500
