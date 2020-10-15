
solution {
    puzzle = "P054"
    name = "W3.5 6T"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 0 to 1
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = -8
        size = 3
    }
    arm(PISTON) {
        number = 4
        position = -2 to 1
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -1 to 0
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to 0
        rotation = -8
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 0 to -2
        rotation = -9
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = -3 to -5
        rotation = -5
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -6 to -4
        rotation = 0
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 10
        position = -7 to -7
        rotation = -12
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = -9
    }
    glyph(DUPLICATION) {
        position = -5 to -5
        rotation = -5
    }
    glyph(DUPLICATION) {
        position = -7 to -6
        rotation = -6
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to -3
        rotation = -11
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to 0, 0 to 1)
    }
    track {
        position = -4 to -6
        positions = listOf(0 to 0, 0 to 1, 1 to 1)
    }
    track {
        position = -7 to -4
        positions = listOf(-1 to -1, 0 to -1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(1)
                grab()
                back()
                drop()
                wait(1)
                back()
                wait(1)
                reset()
                wait(2)
                grab()
                back()
                drop()
                back()
                wait(1)
                reset()
                wait(4)
                grab()
                back()
                drop()
                back()
                wait(1)
                reset()
                wait(4)
                grab()
                back()
                drop()
                back()
                wait(1)
                reset()
                wait(4)
                grab()
                back()
                drop()
                back()
                wait(1)
                reset()
                wait(4)
                grab()
                back()
                drop()
                back()
                wait(1)
                reset()
                wait(4)
                grab()
                back()
                drop()
                back()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                back()
                wait(1)
                grab()
                back()
                reset()
                wait(4)
                back()
                grab()
                back()
                drop()
                reset()
                wait(5)
                back()
                grab()
                back()
                drop()
                reset()
                wait(5)
                back()
                grab()
                back()
                drop()
                reset()
                wait(5)
                back()
                grab()
                back()
                drop()
                reset()
                wait(5)
                back()
                grab()
                back()
                drop()
                reset()
                wait(5)
                back()
                grab()
                back()
                drop()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                back()
                wait(2)
                back()
                wait(1)
                back()
                reset()
                wait(2)
                back()
                wait(1)
                back()
                grab()
                back()
                reset()
                wait(4)
                back()
                wait(1)
                back()
                grab()
                back()
                reset()
                wait(4)
                back()
                wait(1)
                back()
                grab()
                back()
                reset()
                wait(4)
                back()
                wait(1)
                back()
                grab()
                back()
                reset()
                wait(4)
                back()
                wait(1)
                back()
                grab()
                back()
                reset()
                wait(4)
                back()
                wait(1)
                back()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                forward()
                wait(1)
                back()
                wait(2)
                back()
                back()
                wait(2)
                forward()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                back()
                wait(2)
                forward()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                back()
                wait(2)
                forward()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                back()
                wait(2)
                forward()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                back()
                wait(2)
                forward()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                back()
                wait(2)
                forward()
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                back()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(12)
                grab()
                pivotCounterClockwise()
                back()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(4)
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
                wait(3)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                forward()
                drop()
                back()
                wait(1)
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                retract()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                retract()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                retract()
                back()
                drop()
                back()
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                retract()
                back()
                drop()
                back()
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                retract()
                back()
                drop()
                back()
                grab()
                back()
                back()
                extend()
                drop()
                forward()
                retract()
                back()
                drop()
                back()
                grab()
                back()
                back()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                forward()
                grab()
                back()
                drop()
                wait(1)
                back()
                back()
                wait(1)
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                drop()
                back()
                back()
                wait(1)
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                drop()
                back()
                back()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(17)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                grab()
                back()
                back()
                drop()
                wait(4)
                forward()
                forward()
                grab()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                grab()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                grab()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                grab()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                grab()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                forward()
                grab()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
