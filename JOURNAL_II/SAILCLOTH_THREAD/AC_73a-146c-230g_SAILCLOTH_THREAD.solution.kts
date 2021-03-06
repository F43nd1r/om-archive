
solution {
    puzzle = "P061"
    name = "H3 6T"
    arm(PISTON) {
        number = 1
        position = 0 to 1
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = -1 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -3 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -3 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 5
        position = -2 to 1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 21 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 20 to 1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -1
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, -1 to 0, -1 to -1, 0 to -1)
    }
    track {
        position = -2 to -1
        positions = listOf(1 to 0, 1 to 1, 0 to 2, 1 to 2, 2 to 2, 3 to 2)
    }
    tape {
        parallel(
        {
            sequence(3) {
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                wait(1)
                forward()
                drop()
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                forward()
                wait(4)
                forward()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                forward()
                wait(4)
                forward()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                forward()
                wait(4)
                forward()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                forward()
                wait(4)
                forward()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                forward()
                wait(4)
                forward()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                forward()
                wait(1)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                wait(2)
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(2)
                grab()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                wait(1)
                forward()
                wait(1)
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(2)
                grab()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                wait(1)
                forward()
                wait(1)
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(2)
                grab()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                wait(1)
                forward()
                wait(1)
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(2)
                grab()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                back()
                back()
                drop()
                forward()
                wait(1)
                forward()
                wait(1)
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(2)
                grab()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                forward()
                wait(1)
                grab()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                wait(3)
                grab()
                extend()
                wait(4)
                forward()
                extend()
                back()
                retract()
                back()
                forward()
                forward()
                extend()
                drop()
                retract()
                grab()
                extend()
                wait(4)
                back()
                back()
                forward()
                forward()
                drop()
                back()
                retract()
                grab()
                forward()
                extend()
                back()
                retract()
                back()
                forward()
                forward()
                extend()
                drop()
                retract()
                grab()
                extend()
                wait(4)
                back()
                back()
                forward()
                forward()
                drop()
                back()
                retract()
                grab()
                forward()
                extend()
                back()
                retract()
                back()
                forward()
                forward()
                extend()
                drop()
                retract()
                grab()
                extend()
                wait(4)
                back()
                back()
                forward()
                forward()
                drop()
                back()
                retract()
                grab()
                forward()
                extend()
                back()
                retract()
                back()
                forward()
                forward()
                extend()
                drop()
                retract()
                grab()
                extend()
                wait(4)
                back()
                back()
                forward()
                forward()
                drop()
                back()
                retract()
                grab()
                forward()
                extend()
                back()
                retract()
                back()
                forward()
                forward()
                extend()
                drop()
                retract()
                grab()
                extend()
                wait(4)
                back()
                back()
                forward()
                forward()
                drop()
                back()
                retract()
                grab()
                forward()
                extend()
                back()
                retract()
                back()
                forward()
                forward()
                rotateCounterClockwise()
                extend()
                reset()
                wait(30)
                forward()
                forward()
                extend()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(16)
                grab()
                forward()
                retract()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                retract()
                forward()
                reset()
                wait(7)
                grab()
                forward()
                retract()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                retract()
                forward()
                reset()
                wait(7)
                grab()
                forward()
                retract()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                retract()
                forward()
                reset()
                wait(7)
                grab()
                forward()
                retract()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                retract()
                forward()
                reset()
                wait(7)
                grab()
                forward()
                retract()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                retract()
                forward()
                reset()
                wait(7)
                grab()
                forward()
                retract()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                extend()
                extend()
                forward()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                drop()
                retract()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                retract()
                drop()
                back()
                grab()
                forward()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                retract()
                drop()
                back()
                grab()
                forward()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                retract()
                drop()
                back()
                grab()
                forward()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                retract()
                drop()
                back()
                grab()
                forward()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                retract()
                drop()
                back()
                grab()
                forward()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                retract()
                drop()
                wait(1)
                grab()
                extend()
                pivotCounterClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                retract()
                reset()
                wait(34)
                reset()
            }
        }
        )
    }
}
