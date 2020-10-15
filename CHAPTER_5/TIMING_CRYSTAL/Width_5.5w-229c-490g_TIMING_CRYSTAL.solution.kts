
solution {
    puzzle = "P042"
    name = "W5.5"
    arm(ARM1) {
        number = 1
        position = 4 to -1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 2
        position = 3 to -1
        rotation = -10
        size = 2
    }
    arm(PISTON) {
        number = 3
        position = 3 to -2
        rotation = -10
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 2 to 1
        rotation = -8
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 0 to 1
        rotation = -8
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -1 to 2
        rotation = -8
        size = 2
    }
    arm(PISTON) {
        number = 7
        position = 2 to 2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 0 to 4
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -1 to 3
        rotation = -8
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -6 to -2
        rotation = -6
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -12
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -11
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = -10
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -11
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -11
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -4
        rotation = -9
    }
    io(INPUT) {
        index = 1
        position = 4 to 0
        rotation = 0
    }
    track {
        position = 3 to -2
        positions = listOf(-5 to 4, -4 to 4, -3 to 3, -2 to 2, -2 to 3, -1 to 3)
    }
    track {
        position = 2 to -2
        positions = listOf(1 to 1, 1 to 0, 0 to 0, 0 to -1)
    }
    track {
        position = 5 to 0
        positions = listOf(-3 to 2, -4 to 2, -5 to 2, -6 to 3, -5 to 3, -5 to 4, -4 to 4, -3 to 3)
    }
    track {
        position = -7 to -2
        positions = listOf(0 to -2, 0 to -1, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                wait(10)
                forward()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                extend()
                grab()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                grab()
                retract()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                forward()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                extend()
                pivotClockwise()
                extend()
                drop()
                retract()
                retract()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                extend()
                extend()
                drop()
                retract()
                retract()
                wait(2)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                retract()
                rotateClockwise()
                reset()
                wait(4)
                grab()
                forward()
                reset()
                wait(18)
                back()
                wait(3)
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(21)
                forward()
                forward()
                grab()
                back()
                back()
                wait(4)
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(32)
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                retract()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(3)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                extend()
                retract()
                reset()
                wait(3)
                grab()
                back()
                extend()
                pivotClockwise()
                reset()
                wait(5)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(29)
                back()
                back()
                back()
                grab()
                forward()
                forward()
                wait(1)
                pivotClockwise()
                forward()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                pivotClockwise()
                extend()
                pivotClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                drop()
                retract()
                retract()
                grab()
                forward()
                wait(1)
                extend()
                drop()
                retract()
                back()
                wait(1)
                grab()
                forward()
                wait(1)
                extend()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(15)
                grab()
                back()
                extend()
                wait(1)
                retract()
                pivotClockwise()
                forward()
                drop()
                retract()
                wait(4)
                grab()
                extend()
                extend()
                back()
                drop()
                wait(6)
                grab()
                forward()
                retract()
                extend()
                back()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(32)
                grab()
                back()
                wait(4)
                forward()
                drop()
                wait(4)
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        )
    }
}
