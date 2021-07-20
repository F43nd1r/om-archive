
solution {
    puzzle = "w2450512021"
    name = "B X F BIGGIEMAC42"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 6 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 5 to -4
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 6 to -4
        rotation = 3
        size = 2
    }
    arm(ARM2) {
        number = 4
        position = 0 to -2
        rotation = 4
        size = 1
    }
    arm(ARM2) {
        number = 5
        position = -1 to -1
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = 4
    }
    glyph(BONDER) {
        position = 3 to -2
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 2 to -3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to -4
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 1 to 1
        rotation = -7
    }
    glyph(DUPLICATION) {
        position = 1 to 0
        rotation = 10
    }
    glyph(DUPLICATION) {
        position = 5 to -2
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 0 to -4
        rotation = -4
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 2
        rotation = 9
    }
    io(INPUT) {
        index = 1
        position = 4 to -5
        rotation = -2
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 0 to -1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(2) {
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(1) {
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                back()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
