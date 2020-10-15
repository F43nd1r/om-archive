
solution {
    puzzle = "P034"
    name = "W4.5"
    arm(ARM1) {
        number = 1
        position = 4 to 0
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to 0
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 1 to 1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 0 to 1
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 2 to -1
        rotation = -3
        size = 2
    }
    arm(PISTON) {
        number = 6
        position = 1 to -1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -1 to 0
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = 3 to -3
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = 2 to -4
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -3 to -2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 11
        position = 0 to -6
        rotation = -4
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -1 to -3
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = 1 to -3
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -6
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 4 to -2
        rotation = -4
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -5
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to 0
        rotation = 0
    }
    track {
        position = 3 to -3
        positions = listOf(-2 to 2, -1 to 1, -1 to 2)
    }
    track {
        position = -1 to -6
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 1 to 0
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(10) {
                wait(14)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(5)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                back()
                grab()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(16)
                grab()
                pivotCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                rotateCounterClockwise()
                extend()
                wait(1)
                retract()
                extend()
                pivotCounterClockwise()
                drop()
                retract()
                retract()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                back()
                wait(2)
                grab()
                back()
                back()
                extend()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                back()
                drop()
                back()
                wait(3)
                back()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
