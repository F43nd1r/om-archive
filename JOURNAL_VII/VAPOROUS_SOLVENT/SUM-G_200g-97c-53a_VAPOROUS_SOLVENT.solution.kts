
solution {
    puzzle = "P098"
    name = "NEW SOLUTION 2 (COPY) (COPY) (Copy)"
    arm(ARM1) {
        number = 1
        position = -1 to 2
        rotation = -14
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to -2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -1
        rotation = -8
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 5
        position = -4 to -1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to -1
        rotation = -5
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -4
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 3 to -4
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -3 to -2
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 0 to 2
        rotation = -8
    }
    io(INPUT) {
        index = 0
        position = -1 to -3
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    tape {
        parallel(
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
            sequence(4) {
                wait(7)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                repeat()
                wait(4)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
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
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
