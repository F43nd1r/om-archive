
solution {
    puzzle = "P098"
    name = "NEW SOLUTION 2 (COPY) (COPY) (Copy) (Copy) (Copy)"
    arm(ARM1) {
        number = 1
        position = 4 to 2
        rotation = -15
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 2
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to 3
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -1 to -1
        rotation = -11
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 5
        position = -3 to 0
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 3 to 0
        rotation = -6
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = 5 to 1
        rotation = -9
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -2
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 3 to 2
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
            sequence(4) {
                wait(7)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                repeat()
                wait(4)
                repeat()
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
