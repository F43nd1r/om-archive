
solution {
    puzzle = "w2501727889"
    name = "B CI 2T"
    arm(ARM1) {
        number = 1
        position = 3 to -2
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = 4 to -3
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = 1 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 0 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 1 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 2 to -3
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = -2 to 0
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -3 to 1
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 9
        position = 2 to -4
        rotation = 2
        size = 3
    }
    arm(ARM6) {
        number = 10
        position = 4 to -1
        rotation = 3
        size = 2
    }
    arm(ARM6) {
        number = 11
        position = 4 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 12
        position = 6 to -3
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 13
        position = 4 to 1
        rotation = 3
        size = 3
    }
    arm(ARM6) {
        number = 14
        position = 4 to 2
        rotation = 3
        size = 3
    }
    arm(PISTON) {
        number = 15
        position = 3 to -1
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 16
        position = 2 to 2
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(MULTI_BONDER) {
        position = 0 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to 1
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -3 to 5
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 3 to 1
        rotation = 0
    }
    track {
        position = 5 to -3
        positions = listOf(0 to 1, 1 to 0)
    }
    track {
        position = 4 to 1
        positions = listOf(0 to 0, -1 to 1, -2 to 2, -1 to 2, 0 to 1)
    }
    track {
        position = 3 to -6
        positions = listOf(-5 to 5, -4 to 4, -3 to 3, -2 to 2, -2 to 3, -1 to 3)
    }
    track {
        position = 3 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = -3 to -1
        positions = listOf(2 to -2, 3 to -3, 4 to -4)
    }
    track {
        position = -4 to 2
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(4) {
                wait(5)
                forward()
                grab()
                back()
                back()
                back()
                forward()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateCounterClockwise()
                back()
                reset()
                wait(6)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(15)
                forward()
                grab()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                wait(4)
                forward()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(12) {
                wait(10)
                grab()
                back()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                grab()
                forward()
                wait(1)
                rotateClockwise()
                drop()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                forward()
                wait(1)
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                reset()
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                wait(5)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                back()
                grab()
                forward()
                reset()
                wait(2)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(5)
                grab()
                forward()
                reset()
                wait(1)
                grab()
                forward()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(10) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(11) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(16) {
                wait(7)
                grab()
                retract()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                rotateClockwise()
                drop()
                wait(1)
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(15) {
                wait(13)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(14)
                grab()
                back()
                back()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
            }
        }
        )
    }
}
