
solution {
    puzzle = "w2501727889"
    name = "B CI132 2T"
    arm(ARM6) {
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
    arm(ARM3) {
        number = 3
        position = 2 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -3 to -1
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = 3 to -4
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 6
        position = -1 to -2
        rotation = 0
        size = 2
    }
    arm(ARM6) {
        number = 7
        position = -3 to 1
        rotation = -1
        size = 2
    }
    arm(ARM6) {
        number = 8
        position = -4 to 2
        rotation = -1
        size = 3
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
    arm(ARM6) {
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
    glyph(BONDER) {
        position = -1 to 1
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
        position = 3 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = -2 to -1
        positions = listOf(-1 to 0, 0 to 0, 1 to -1)
    }
    track {
        position = 3 to -4
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
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
                wait(2)
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
            sequence(15) {
                wait(13)
                grab()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(4)
                pivotClockwise()
                drop()
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(2)
                pivotClockwise()
                drop()
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
                wait(6)
                grab()
                back()
                rotateCounterClockwise()
                forward()
                drop()
                wait(3)
                repeat()
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
        , 
        {
            sequence(4) {
                wait(10)
                grab()
                forward()
                reset()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                forward()
                reset()
                wait(3)
                repeat()
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
                wait(1)
                forward()
                repeat()
                wait(8)
                extendTape()
            }
        }
        , 
        {
            sequence(12) {
                wait(8)
                grab()
                wait(2)
                back()
                rotateClockwise()
                drop()
                forward()
            }
        }
        )
    }
}
