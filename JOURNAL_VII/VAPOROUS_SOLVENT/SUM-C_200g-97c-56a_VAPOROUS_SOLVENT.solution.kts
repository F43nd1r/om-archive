
solution {
    puzzle = "P098"
    name = "NEW SOLUTION 2 (COPY) (COPY)"
    arm(ARM1) {
        number = 1
        position = 4 to -4
        rotation = -10
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -5 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to -1
        rotation = -5
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 5
        position = -4 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to -3
        rotation = -6
        size = 3
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -4 to -1
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = 4 to -3
        rotation = -7
    }
    io(INPUT) {
        index = 0
        position = -4 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 8
    }
    io(INPUT) {
        index = 1
        position = 3 to -3
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(2) {
                wait(2)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(1)
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(8)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
