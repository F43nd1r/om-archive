
solution {
    puzzle = "P066"
    name = "H5"
    arm(PISTON) {
        number = 1
        position = -10 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -12 to -3
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -12 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -11 to -1
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -11 to 0
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = -11 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -13 to 1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -2 to -2
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 3 to -2
        rotation = -3
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 1 to -1
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -8 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = -8 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -6 to -3
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -9 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -7 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -8 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -5 to -1
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -9 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -10 to -2
        rotation = 0
    }
    track {
        position = -11 to -3
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -11 to 0
        positions = listOf(0 to -1, 1 to -1, 0 to 0, 1 to 0, 0 to 1, -1 to 1, -2 to 1)
    }
    track {
        position = -11 to -2
        positions = listOf(-1 to 1, 0 to 0, -1 to 0)
    }
    track {
        position = -1 to -4
        positions = listOf(3 to 2, 4 to 2, 4 to 1, 3 to 1, 2 to 1, 1 to 1, 0 to 1, -1 to 1, -1 to 2)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(15)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                wait(2)
                grab()
                back()
                back()
                back()
                back()
                back()
                forward()
                forward()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                back()
                wait(1)
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(4)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(15)
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(13)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                pivotCounterClockwise()
                back()
                extend()
                extend()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                grab()
                forward()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(6)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                pivotClockwise()
                drop()
                extend()
                wait(3)
                grab()
                retract()
                extend()
                reset()
            }
        }
        )
    }
}
