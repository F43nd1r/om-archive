
solution {
    puzzle = "P030b"
    name = "B CG 2T"
    arm(ARM3) {
        number = 1
        position = -3 to 2
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -7 to 4
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -6 to 3
        rotation = 6
        size = 2
    }
    arm(ARM3) {
        number = 4
        position = -2 to 7
        rotation = 1
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = -1 to 8
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -4 to 6
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 7
        position = 3 to 2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 1 to 4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 2 to 3
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 4 to 3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 3 to 3
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -4 to 4
        rotation = 0
    }
    glyph(BONDER) {
        position = 0 to 6
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to 2
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 7
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 5
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to 5
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 1 to 6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 6
    }
    io(INPUT) {
        index = 1
        position = -2 to 8
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -5 to 2
        rotation = 0
    }
    track {
        position = -6 to 4
        positions = listOf(0 to 0, -1 to 0, 0 to -1)
    }
    track {
        position = 1 to 3
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    track {
        position = 3 to 3
        positions = listOf(0 to 0, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
                wait(1)
                back()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
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
            sequence(8) {
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                wait(1)
                back()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
            }
        }
        , 
        {
            sequence(7) {
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
            sequence(9) {
                wait(2)
                back()
                rotateClockwise()
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
                back()
                wait(1)
                grab()
                back()
                back()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                back()
            }
        }
        )
    }
}
