
solution {
    puzzle = "P055"
    name = "B S 2 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -2 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to -3
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 2
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 27 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = 5 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -3
        rotation = 0
    }
    track {
        position = 4 to -3
        positions = listOf(1 to 0, 0 to 0, -1 to 0, -2 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(4)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                reset()
                wait(5)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                repeat()
                wait(23)
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                forward()
                reset()
            }
        }
        )
    }
}
