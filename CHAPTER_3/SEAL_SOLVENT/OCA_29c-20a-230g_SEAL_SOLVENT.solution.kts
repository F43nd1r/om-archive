
solution {
    puzzle = "P026"
    name = "NEW SOLUTION 5"
    arm(ARM1) {
        number = 1
        position = -15 to -6
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -13 to -9
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -13 to -6
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -16 to -6
        rotation = -7
    }
    glyph(BONDER) {
        position = -15 to -8
        rotation = -5
    }
    glyph(BONDER) {
        position = -16 to -7
        rotation = -6
    }
    glyph(BONDER) {
        position = -15 to -7
        rotation = -1
    }
    glyph(BONDER) {
        position = -15 to -7
        rotation = 0
    }
    glyph(BONDER) {
        position = -13 to -7
        rotation = 4
    }
    glyph(UNBONDER) {
        position = -16 to -8
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -15 to -8
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -13 to -7
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -12 to -8
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -17 to -7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -15 to -8
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -16 to -8
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -14 to -6
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -15 to -7
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -15 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -13 to -8
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -14 to -6
        rotation = 0
    }
    track {
        position = -14 to -9
        positions = listOf(1 to -1, 0 to -1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                back()
                back()
                wait(1)
                back()
                back()
                back()
                back()
                wait(1)
                back()
                back()
                back()
                back()
                wait(1)
                back()
                back()
                back()
                back()
                wait(1)
                back()
                back()
                back()
                back()
                wait(1)
                back()
                back()
                back()
                back()
            }
        }
        , 
        {
            sequence(3) {
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                wait(4)
                pivotClockwise()
                wait(4)
                pivotClockwise()
                wait(4)
                pivotClockwise()
                wait(4)
                pivotClockwise()
                wait(4)
                pivotClockwise()
            }
        }
        )
    }
}
