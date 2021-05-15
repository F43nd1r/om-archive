
solution {
    puzzle = "P098"
    name = "OVERLAP G"
    arm(ARM1) {
        number = 1
        position = -3 to 2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -4 to -2
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -2 to 1
        rotation = 4
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = -3 to -4
        rotation = 0
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 5
        position = 1 to -4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 4 to -5
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -3
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = -2 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 0 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = -1 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -3
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = -1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 1 to -2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -1 to -3
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = -2 to -3
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 2 to -3
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 1 to -3
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = -3 to 1
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -4 to 2
        rotation = 0
    }
    track {
        position = -2 to -4
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 5 to -6
        positions = listOf(0 to 0, -1 to 1, -2 to 2)
    }
    track {
        position = 2 to -6
        positions = listOf(-1 to 2, -1 to 3, 0 to 3, 0 to 4, -1 to 5, -1 to 6, -1 to 7, -1 to 8)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(6)
                back()
                forward()
                wait(4)
                back()
                forward()
                wait(3)
                back()
                forward()
                wait(3)
                back()
                forward()
                wait(4)
                back()
                forward()
                wait(2)
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
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                wait(2)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(4)
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                forward()
                pivotClockwise()
                pivotCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                rotateClockwise()
                wait(2)
                forward()
                forward()
                forward()
                wait(26)
                reset()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                wait(28)
                reset()
            }
        }
        )
    }
}
