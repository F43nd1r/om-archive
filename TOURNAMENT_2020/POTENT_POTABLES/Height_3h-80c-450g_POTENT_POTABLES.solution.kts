
solution {
    puzzle = "w2501727721"
    name = "H3"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -6 to 1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -6 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -13 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 6
        position = -11 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 0 to -1
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 1 to -1
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 1 to 1
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 10
        position = 3 to 1
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 4 to 1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -6 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -10 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 4 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -5 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -11 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -12 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = -12 to 0
        rotation = -3
    }
    io(OUTPUT) {
        index = 1
        position = 7 to 0
        rotation = -3
    }
    track {
        position = -13 to -1
        positions = listOf(-3 to 0, -2 to 0, -1 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = -3 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 2 to 1)
    }
    track {
        position = 2 to 1
        positions = listOf(6 to 0, 5 to 0, 4 to 0, 3 to 0, 2 to 0, 1 to 0, 0 to 0, -1 to 0)
    }
    track {
        position = -10 to 1
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -8 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(11)
                grab()
                back()
                back()
                back()
                forward()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(10)
                back()
                grab()
                pivotClockwise()
                retract()
                retract()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(9)
                grab()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(14)
                grab()
                back()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(11)
                grab()
                retract()
                rotateCounterClockwise()
                wait(1)
                back()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                pivotClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                retract()
                retract()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                back()
                wait(2)
                grab()
                back()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                back()
                pivotCounterClockwise()
                back()
                wait(1)
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                back()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
