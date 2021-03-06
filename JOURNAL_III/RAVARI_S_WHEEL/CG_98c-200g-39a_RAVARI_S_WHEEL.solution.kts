
solution {
    puzzle = "P064"
    name = "B CG"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 0 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -4 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -1 to 1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 3 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 2 to -1
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 3 to -3
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 2 to -2
        rotation = -3
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = -3
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -4 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -2
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 1
        rotation = 0
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
