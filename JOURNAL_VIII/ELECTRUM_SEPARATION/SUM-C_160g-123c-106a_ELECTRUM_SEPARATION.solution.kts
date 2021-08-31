
solution {
    puzzle = "P103"
    name = "SUM 389"
    arm(ARM1) {
        number = 1
        position = -9 to 0
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -8 to -6
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -3 to -9
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to -8
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -3 to -7
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -6
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -9 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to -6
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to -7
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = -12 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -3
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 0 to -7
        rotation = 0
    }
    io(INFINITE) {
        index = 1
        position = 0 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = -5 to -9
        rotation = -3
    }
    track {
        position = -9 to 1
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -1 to -8
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                back()
                wait(1)
                pivotClockwise()
                pivotClockwise()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(5)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(3)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
                wait(17)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
            }
        }
        )
    }
}
