
solution {
    puzzle = "P106"
    name = "OA"
    arm(PISTON) {
        number = 1
        position = 1 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 3
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 7
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 0
        rotation = 3
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(TRIPLEX_BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to -1
        rotation = 6
    }
    glyph(TRIPLEX_BONDER) {
        position = -1 to 0
        rotation = 4
    }
    glyph(TRIPLEX_BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 5
    }
    glyph(UNBONDER) {
        position = -1 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -1
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to -1, -1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                forward()
                drop()
                back()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
