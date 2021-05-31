
solution {
    puzzle = "w2450512809"
    name = "B X S GOODBYEGALAXY"
    arm(ARM1) {
        number = 1
        position = -1 to 6
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 0 to 5
        rotation = -10
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = 0 to 4
        rotation = -10
        size = 3
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = -1 to -1
        rotation = -13
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 7
        rotation = -2
    }
    glyph(BONDER) {
        position = -3 to 4
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = -6
    }
    glyph(DUPLICATION) {
        position = -1 to 0
        rotation = -5
    }
    io(INPUT) {
        index = 0
        position = -3 to 8
        rotation = -15
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -1
        rotation = -4
    }
    track {
        position = 1 to 5
        positions = listOf(-1 to -1, -1 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
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
                repeat()
                wait(8)
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
                repeat()
                wait(7)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                back()
                drop()
                forward()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                reset()
                wait(1)
                forward()
                wait(2)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                forward()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(7)
                repeat()
            }
        }
        )
    }
}
