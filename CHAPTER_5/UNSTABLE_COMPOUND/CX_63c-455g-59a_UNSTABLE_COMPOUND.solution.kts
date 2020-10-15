
solution {
    puzzle = "P040"
    name = "B CX"
    arm(ARM1) {
        number = 1
        position = -2 to -4
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 4 to -4
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to 2
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 2 to 0
        rotation = 8
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -2 to 1
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -1 to 2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -3 to 2
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 4 to -2
        rotation = 2
        size = 3
    }
    arm(PISTON) {
        number = 9
        position = 0 to -3
        rotation = 6
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -1 to -4
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 0 to -4
        rotation = 6
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to -1
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -2
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = 2 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -4 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 1 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to 1
        rotation = 0
    }
    track {
        position = 5 to -2
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = 4 to -3
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -2 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 0 to -4
        positions = listOf(0 to 0, -1 to 0, -1 to -1, -2 to 0, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(8) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                back()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                reset()
                wait(1)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                pivotCounterClockwise()
                extend()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                forward()
                drop()
                wait(5)
                reset()
            }
        }
        , 
        {
            sequence(10) {
                wait(6)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(7)
                forward()
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
