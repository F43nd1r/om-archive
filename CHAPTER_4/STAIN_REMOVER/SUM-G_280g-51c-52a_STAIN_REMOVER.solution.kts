
solution {
    puzzle = "P034"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = -4 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -1 to 1
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -4 to -2
        rotation = 1
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -3 to -5
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to -6
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -4 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -2 to 0
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = -1 to -3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -2
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to -5
        rotation = -2
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -5
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -3 to -6
        rotation = 0
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -4 to -2
        positions = listOf(0 to 0, 1 to -1, 1 to -2, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(6)
                grab()
                rotateClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        )
    }
}
