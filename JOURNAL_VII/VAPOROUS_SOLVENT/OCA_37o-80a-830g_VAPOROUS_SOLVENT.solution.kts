
solution {
    puzzle = "P098"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = 7
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -1 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -1 to -2
        rotation = -5
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = 1 to 1
        rotation = 4
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 5
        position = 0 to -4
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 4 to -1
        rotation = 3
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 7
        position = 4 to -4
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 6 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 7 to -5
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = -1
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 3 to -3
        rotation = -2
    }
    glyph(MULTI_BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 3 to -4
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 3 to -2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 5 to -2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 4 to -2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 2 to -3
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 1 to -3
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 3 to -2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 5 to -3
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = 4 to -3
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 3 to -2
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 3 to -1
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 3 to -2
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 0 to 1
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 0
    }
    track {
        position = 1 to -4
        positions = listOf(0 to 0, -1 to 0)
    }
    track {
        position = 6 to -5
        positions = listOf(0 to 0, -1 to 1, 0 to 1, 1 to 0)
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, -1 to 1, -1 to 0, 0 to -1)
    }
    track {
        position = 1 to 1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 5 to -6
        positions = listOf(-1 to 2, -1 to 3, 0 to 3, 0 to 4, -1 to 5, -1 to 6, -1 to 7, -1 to 8)
    }
    tape {
        parallel(
        {
            sequence(5) {
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
            sequence(3) {
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
            sequence(4) {
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
                rotateClockwise()
                wait(1)
                forward()
                forward()
                forward()
                wait(27)
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(8)
                forward()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                wait(2)
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                back()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                reset()
                wait(6)
                repeat()
                wait(4)
                repeat()
                wait(4)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                wait(8)
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
                back()
                wait(1)
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                pivotClockwise()
                back()
                drop()
                wait(21)
                reset()
            }
        }
        )
    }
}
