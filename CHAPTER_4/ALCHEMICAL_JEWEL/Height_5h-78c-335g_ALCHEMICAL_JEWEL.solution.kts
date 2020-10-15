
solution {
    puzzle = "P035"
    name = "H5 2T"
    arm(ARM1) {
        number = 1
        position = -4 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -3 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -2 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -1 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 0 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -1 to -2
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 0 to -3
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 5 to -4
        rotation = 2
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = -1
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 4 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 7 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 0
        rotation = 0
    }
    track {
        position = -3 to 0
        positions = listOf(0 to 0, 1 to -1, 0 to -1, -1 to 0)
    }
    track {
        position = -1 to -3
        positions = listOf(0 to 0, 1 to -1, 0 to -1, -1 to 0)
    }
    track {
        position = 8 to -4
        positions = listOf(-1 to 0, -2 to 0, -3 to 0, -4 to 0)
    }
    track {
        position = -1 to -2
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(9) {
                wait(11)
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                back()
                reset()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(10)
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                pivotClockwise()
                drop()
                back()
                wait(8)
                back()
                reset()
            }
        }
        )
    }
}
