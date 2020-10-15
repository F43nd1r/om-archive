
solution {
    puzzle = "P032"
    name = "B CX"
    arm(ARM1) {
        number = 1
        position = 0 to -4
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to -3
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -1
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 2 to -2
        rotation = -3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 1 to -1
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = -4 to 0
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -2 to 1
        rotation = 5
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to -3
        rotation = -3
    }
    glyph(CALCIFICATION) {
        position = 1 to -4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -4 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to -2
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = -1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    track {
        position = -3 to -3
        positions = listOf(0 to 0, 0 to -1, 1 to -1, 2 to -1)
    }
    track {
        position = 3 to -2
        positions = listOf(0 to 0, 0 to 1, -1 to 1, -2 to 1)
    }
    track {
        position = -1 to 0
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = -5 to 1
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                back()
                back()
                back()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                grab()
                back()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
