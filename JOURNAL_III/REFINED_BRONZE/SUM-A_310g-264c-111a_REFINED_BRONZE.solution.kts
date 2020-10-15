
solution {
    puzzle = "P067"
    name = "B X S 6T"
    arm(ARM1) {
        number = 1
        position = 3 to -1
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to -4
        rotation = 1
        size = 3
    }
    arm(ARM6) {
        number = 5
        position = -3 to 2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to 0
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 0 to 2
        rotation = -2
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -3 to 1
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 2 to -4
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -2 to 2
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 5 to -3
        rotation = -3
    }
    io(INFINITE) {
        index = 0
        position = 2 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 1
        position = -4 to 0
        rotation = -2
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to -1)
    }
    track {
        position = 4 to -1
        positions = listOf(-2 to 1, -3 to 1, -2 to 0)
    }
    track {
        position = -3 to -3
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = 3 to 0
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(10)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(8)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(41)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                wait(6)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(11)
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                wait(4)
                rotateClockwise()
                reset()
                wait(8)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(35)
                grab()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                reset()
                wait(2)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                wait(6)
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                wait(1)
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                wait(6)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(16)
                back()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                wait(20)
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                back()
                reset()
                wait(7)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(41)
                repeat()
                wait(41)
                back()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                wait(20)
                back()
                grab()
                forward()
                forward()
                rotateClockwise()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                pivotCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                wait(1)
                back()
                reset()
                wait(1)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                repeat()
                wait(20)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                wait(1)
                pivotClockwise()
                wait(2)
                pivotCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(4)
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                pivotClockwise()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
