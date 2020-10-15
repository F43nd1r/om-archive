
solution {
    puzzle = "P064"
    name = "B AA"
    arm(PISTON) {
        number = 1
        position = 2 to -1
        rotation = 4
        size = 2
    }
    arm(PISTON) {
        number = 2
        position = 1 to 0
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                wait(1)
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                retract()
                wait(4)
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                wait(6)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                extend()
                wait(3)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(10)
                pivotCounterClockwise()
                wait(15)
                pivotCounterClockwise()
                drop()
                retract()
                wait(16)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                rotateCounterClockwise()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                extend()
                grab()
                retract()
                drop()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
