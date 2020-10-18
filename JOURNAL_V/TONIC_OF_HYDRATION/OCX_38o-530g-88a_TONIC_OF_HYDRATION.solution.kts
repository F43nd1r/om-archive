
solution {
    puzzle = "P089"
    name = "OVERLAP"
    arm(ARM1) {
        number = 1
        position = 2 to -5
        rotation = 6
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 1 to -5
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 5 to -2
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -6 to 0
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -2
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = -3
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -5 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = 3 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 4 to -4
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -2 to -4
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -2 to -3
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -2 to -1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -3 to 0
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -3 to 0
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -4 to 0
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -5 to 1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 2 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 5 to -5
        rotation = 0
    }
    track {
        position = 0 to -5
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                back()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                back()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                forward()
                back()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                wait(4)
                rotateClockwise()
                rotateCounterClockwise()
                wait(4)
                rotateClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(4)
                repeat()
                wait(11)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateClockwise()
                reset()
                wait(3)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
