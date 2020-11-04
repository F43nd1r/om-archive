
solution {
    puzzle = "P097"
    name = "OVERLAP X"
    arm(ARM1) {
        number = 1
        position = 16 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = 14 to 4
        rotation = -1
        size = 3
    }
    arm(PISTON) {
        number = 3
        position = 15 to 2
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 18 to 6
        rotation = -20
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 18 to 5
        rotation = -20
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 17 to 6
        rotation = -20
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = 16 to 6
        rotation = 7
        size = 2
    }
    arm(ARM1) {
        number = 8
        position = 11 to 8
        rotation = -1
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = 13 to 4
        rotation = -2
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = 21 to -1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 16 to 2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = 15 to 0
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = 5 to 2
        rotation = 0
        size = 3
    }
    glyph(BONDER) {
        position = 12 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 13 to 2
        rotation = -2
    }
    glyph(BONDER) {
        position = 13 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = 16 to 8
        rotation = -5
    }
    glyph(BONDER) {
        position = 16 to 8
        rotation = -8
    }
    glyph(BONDER) {
        position = 11 to 6
        rotation = -2
    }
    glyph(BONDER) {
        position = 15 to 9
        rotation = -7
    }
    glyph(BONDER) {
        position = 12 to 6
        rotation = 2
    }
    glyph(BONDER) {
        position = 13 to 6
        rotation = 2
    }
    glyph(BONDER) {
        position = 2 to 5
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 16 to 8
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -9 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 13 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 18 to 2
        rotation = 0
    }
    track {
        position = 15 to 2
        positions = listOf(0 to 1, 0 to 0, 0 to -1, -1 to 0, -1 to 1, -1 to 2)
    }
    track {
        position = 18 to 6
        positions = listOf(0 to -1, 0 to 0, 0 to 1, -1 to 1, -1 to 0, -1 to -1)
    }
    track {
        position = 11 to 10
        positions = listOf(0 to 0, 0 to -1, 0 to -2, 0 to -3, 1 to -4, 1 to -5, 2 to -6)
    }
    track {
        position = 16 to 7
        positions = listOf(0 to -1, 0 to 0, -1 to 0, -1 to -1, -1 to -2, 0 to -3, 1 to -3)
    }
    track {
        position = 16 to 1
        positions = listOf(0 to 0, -1 to 1)
    }
    track {
        position = 14 to -2
        positions = listOf(-4 to 2, -3 to 2, -2 to 2, -1 to 2, 0 to 2, 1 to 2)
    }
    tape {
        parallel(
        {
            sequence(10) {
                wait(8)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
                extend()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                wait(5)
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                forward()
                wait(3)
                forward()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(4) {
                wait(1)
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
            }
        }
        , 
        {
            sequence(8) {
                wait(3)
                grab()
                back()
                rotateClockwise()
                back()
                wait(1)
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(2)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                wait(1)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(9) {
                grab()
                back()
                back()
                back()
                back()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                wait(5)
                extendTape()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                forward()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(12) {
                wait(12)
                back()
                grab()
                back()
                back()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(10)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(21)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
