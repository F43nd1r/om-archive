
solution {
    puzzle = "P043"
    name = "468 OMEGA"
    arm(ARM1) {
        number = 1
        position = -3 to -1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -4
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -2 to 0
        rotation = 3
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = 3 to -1
        rotation = -4
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -1 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = 4 to -5
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -3
        rotation = -1
    }
    glyph(DUPLICATION) {
        position = 2 to -1
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = -4 to -1
        rotation = 1
    }
    glyph(ANIMISMUS) {
        position = -3 to -3
        rotation = -10
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -6
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -4 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 4 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 4
        position = -3 to 0
        rotation = 0
    }
    track {
        position = -2 to -5
        positions = listOf(0 to 1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(5) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(11)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(1)
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                wait(2)
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(11)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(4)
                rotateCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(4)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                back()
                drop()
                forward()
                reset()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                wait(1)
                back()
                reset()
            }
        }
        )
    }
}
