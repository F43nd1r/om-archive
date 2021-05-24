
solution {
    puzzle = "P041"
    name = "OVERLAP AG"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 4 to 1
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 0 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 3 to 1
        rotation = 4
    }
    glyph(ANIMISMUS) {
        position = 1 to 2
        rotation = -1
    }
    glyph(DISPOSAL) {
        position = 2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 3 to 0
        rotation = 0
    }
    track {
        position = 1 to 2
        positions = listOf(1 to -1, 1 to -2, 0 to -1, -1 to -1, -2 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(5)
                grab()
                forward()
                rotateCounterClockwise()
                reset()
                wait(6)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(34)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                reset()
                wait(1)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                repeat()
                wait(9)
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
                grab()
                pivotClockwise()
                drop()
                back()
                grab()
                forward()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(59)
                rotateCounterClockwise()
                wait(22)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(6)
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
