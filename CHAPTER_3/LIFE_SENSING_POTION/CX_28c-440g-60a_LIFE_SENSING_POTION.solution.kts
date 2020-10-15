
solution {
    puzzle = "P030b"
    name = "B CX 2T"
    arm(ARM1) {
        number = 1
        position = 1 to -5
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = 3 to -5
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to -3
        rotation = 2
        size = 2
    }
    arm(ARM3) {
        number = 4
        position = 2 to 3
        rotation = 7
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = 3 to 4
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 5 to 0
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 6 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 0 to 2
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 7 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = 8 to -1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 7 to -1
        rotation = 3
        size = 3
    }
    glyph(BONDER) {
        position = 4 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = 2 to 0
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = 4 to -2
        rotation = -1
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 3 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 5 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 2 to 4
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -3
        rotation = 0
    }
    track {
        position = 5 to -1
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    track {
        position = 8 to -2
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = 3 to -5
        positions = listOf(0 to 0, -1 to 1, -1 to 2, 0 to 1)
    }
    track {
        position = 1 to -5
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                back()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(9) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(1)
                back()
                rotateClockwise()
                wait(1)
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
            }
        }
        , 
        {
            sequence(11) {
                wait(4)
                forward()
                rotateClockwise()
                grab()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                forward()
                forward()
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                reset()
                wait(1)
                repeat()
            }
        }
        )
    }
}
